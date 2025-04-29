package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u0 {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
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
                return obj instanceof s0 ? obj == ((s0) obj).c() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            } else {
                obj2 = i.f6190k;
            }
            return obj.equals(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(StringBuilder sb, int i10, String str, Object obj) {
        String a10;
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                c(sb, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c(sb, i10, str, entry);
            }
        } else {
            sb.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                a10 = m1.c((String) obj);
            } else if (!(obj instanceof i)) {
                if (obj instanceof z) {
                    sb.append(" {");
                    d((z) obj, sb, i10 + 2);
                    sb.append("\n");
                    while (i11 < i10) {
                        sb.append(' ');
                        i11++;
                    }
                } else if (!(obj instanceof Map.Entry)) {
                    sb.append(": ");
                    sb.append(obj.toString());
                    return;
                } else {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    c(sb, i13, "key", entry2.getKey());
                    c(sb, i13, "value", entry2.getValue());
                    sb.append("\n");
                    while (i11 < i10) {
                        sb.append(' ');
                        i11++;
                    }
                }
                sb.append("}");
                return;
            } else {
                sb.append(": \"");
                a10 = m1.a((i) obj);
            }
            sb.append(a10);
            sb.append('\"');
        }
    }

    private static void d(s0 s0Var, StringBuilder sb, int i10) {
        Method[] declaredMethods;
        Map.Entry<z.d, Object> next;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : s0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z10 = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i10, a(str2), z.A(method2, s0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i10, a(str3), z.A(method3, s0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object A = z.A(method4, s0Var, new Object[0]);
                    if (method5 != null) {
                        z10 = ((Boolean) z.A(method5, s0Var, new Object[0])).booleanValue();
                    } else if (b(A)) {
                        z10 = false;
                    }
                    if (z10) {
                        c(sb, i10, a(str4), A);
                    }
                }
            }
        }
        if (s0Var instanceof z.c) {
            Iterator<Map.Entry<z.d, Object>> r10 = ((z.c) s0Var).extensions.r();
            while (r10.hasNext()) {
                c(sb, i10, "[" + next.getKey().a() + "]", r10.next().getValue());
            }
        }
        p1 p1Var = ((z) s0Var).unknownFields;
        if (p1Var != null) {
            p1Var.l(sb, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(s0 s0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(s0Var, sb, 0);
        return sb.toString();
    }
}
