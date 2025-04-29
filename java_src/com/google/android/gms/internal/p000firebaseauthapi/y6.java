package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y6  reason: invalid package */
/* loaded from: classes.dex */
public final class y6 {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f5698a;

    static {
        char[] cArr = new char[80];
        f5698a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(w6 w6Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(w6Var, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i10, str, entry);
            }
        } else {
            sb.append('\n');
            c(i10, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(y7.a(new j4(((String) obj).getBytes(x5.f5626b))));
                sb.append('\"');
            } else if (obj instanceof m4) {
                sb.append(": \"");
                sb.append(y7.a((m4) obj));
                sb.append('\"');
            } else if (obj instanceof r5) {
                sb.append(" {");
                d((r5) obj, sb, i10 + 2);
                sb.append("\n");
                c(i10, sb);
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i12 = i10 + 2;
                b(sb, i12, "key", entry2.getKey());
                b(sb, i12, "value", entry2.getValue());
                sb.append("\n");
                c(i10, sb);
                sb.append("}");
            }
        }
    }

    private static void c(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f5698a, 0, i11);
            i10 -= i11;
        }
    }

    private static void d(w6 w6Var, StringBuilder sb, int i10) {
        int i11;
        Object obj;
        Method method;
        String substring;
        Object i12;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = w6Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
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
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring2 = ((String) entry.getKey()).substring(i11);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
                i12 = r5.i(method2, w6Var, new Object[0]);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set".concat(substring2)) && (!substring2.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring2.substring(0, substring2.length() - 5)))))) {
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has".concat(substring2));
                    if (method4 != null) {
                        Object i14 = r5.i(method4, w6Var, new Object[0]);
                        if (method5 != null) {
                            if (!((Boolean) r5.i(method5, w6Var, new Object[0])).booleanValue()) {
                            }
                            b(sb, i10, substring2, i14);
                        } else if (i14 instanceof Boolean) {
                            if (!((Boolean) i14).booleanValue()) {
                            }
                            b(sb, i10, substring2, i14);
                        } else if (i14 instanceof Integer) {
                            if (((Integer) i14).intValue() == 0) {
                            }
                            b(sb, i10, substring2, i14);
                        } else if (i14 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) i14).floatValue()) == 0) {
                            }
                            b(sb, i10, substring2, i14);
                        } else if (i14 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) i14).doubleValue()) == 0) {
                            }
                            b(sb, i10, substring2, i14);
                        } else {
                            if (i14 instanceof String) {
                                obj = "";
                            } else if (i14 instanceof m4) {
                                obj = m4.f4993k;
                            } else if (i14 instanceof w6) {
                                if (i14 == ((w6) i14).f()) {
                                }
                                b(sb, i10, substring2, i14);
                            } else {
                                if ((i14 instanceof Enum) && ((Enum) i14).ordinal() == 0) {
                                }
                                b(sb, i10, substring2, i14);
                            }
                            if (i14.equals(obj)) {
                            }
                            b(sb, i10, substring2, i14);
                        }
                    }
                }
                i11 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
                i12 = r5.i(method, w6Var, new Object[0]);
            }
            b(sb, i10, substring, i12);
            i11 = 3;
        }
        if (w6Var instanceof p5) {
            p5 p5Var = (p5) w6Var;
            throw null;
        }
        e8 e8Var = ((r5) w6Var).zzc;
        if (e8Var != null) {
            e8Var.i(sb, i10);
        }
    }
}
