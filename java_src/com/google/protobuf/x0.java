package com.google.protobuf;

import com.google.protobuf.z;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f7376a;

    static {
        char[] cArr = new char[80];
        f7376a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i10, StringBuilder sb) {
        while (i10 > 0) {
            char[] cArr = f7376a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb.append(cArr, 0, length);
            i10 -= length;
        }
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        } else if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        } else if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        } else {
            if (obj instanceof String) {
                obj2 = "";
            } else if (!(obj instanceof i)) {
                return obj instanceof v0 ? obj == ((v0) obj).c() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            } else {
                obj2 = i.f7143k;
            }
            return obj.equals(obj2);
        }
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(StringBuilder sb, int i10, String str, Object obj) {
        String a10;
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                d(sb, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                d(sb, i10, str, entry);
            }
        } else {
            sb.append('\n');
            a(i10, sb);
            sb.append(c(str));
            if (obj instanceof String) {
                sb.append(": \"");
                a10 = s1.c((String) obj);
            } else if (!(obj instanceof i)) {
                if (obj instanceof z) {
                    sb.append(" {");
                    e((z) obj, sb, i10 + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                } else {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i11 = i10 + 2;
                    d(sb, i11, "key", entry2.getKey());
                    d(sb, i11, "value", entry2.getValue());
                }
                sb.append("\n");
                a(i10, sb);
                sb.append("}");
                return;
            } else {
                sb.append(": \"");
                a10 = s1.a((i) obj);
            }
            sb.append(a10);
            sb.append('\"');
        }
    }

    private static void e(v0 v0Var, StringBuilder sb, int i10) {
        int i11;
        Method method;
        String substring;
        Object M;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = v0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i11);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                M = z.M(method2, v0Var, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set" + substring2)) {
                    if (substring2.endsWith("Bytes")) {
                        if (treeMap.containsKey("get" + substring2.substring(0, substring2.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring2);
                    if (method4 != null) {
                        Object M2 = z.M(method4, v0Var, new Object[0]);
                        if (method5 == null ? !b(M2) : ((Boolean) z.M(method5, v0Var, new Object[0])).booleanValue()) {
                            d(sb, i10, substring2, M2);
                        }
                    }
                }
                i11 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                M = z.M(method, v0Var, new Object[0]);
            }
            d(sb, i10, substring, M);
            i11 = 3;
        }
        if (v0Var instanceof z.c) {
            Iterator<Map.Entry<z.d, Object>> t10 = ((z.c) v0Var).extensions.t();
            while (t10.hasNext()) {
                Map.Entry<z.d, Object> next = t10.next();
                d(sb, i10, "[" + next.getKey().a() + "]", next.getValue());
            }
        }
        w1 w1Var = ((z) v0Var).unknownFields;
        if (w1Var != null) {
            w1Var.m(sb, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(v0 v0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(v0Var, sb, 0);
        return sb.toString();
    }
}
