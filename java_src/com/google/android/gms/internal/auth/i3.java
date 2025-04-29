package com.google.android.gms.internal.auth;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(g3 g3Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(g3Var, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void b(StringBuilder sb, int i10, String str, Object obj) {
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
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(h4.a(q1.u((String) obj)));
                sb.append('\"');
            } else if (obj instanceof q1) {
                sb.append(": \"");
                sb.append(h4.a((q1) obj));
                sb.append('\"');
            } else if (obj instanceof g2) {
                sb.append(" {");
                d((g2) obj, sb, i10 + 2);
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i10 + 2;
                b(sb, i13, "key", entry2.getKey());
                b(sb, i13, "value", entry2.getValue());
                sb.append("\n");
                while (i11 < i10) {
                    sb.append(' ');
                    i11++;
                }
                sb.append("}");
            }
        }
    }

    private static final String c(String str) {
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

    private static void d(g3 g3Var, StringBuilder sb, int i10) {
        Method[] declaredMethods;
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : g3Var.getClass().getDeclaredMethods()) {
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
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i10, c(concat), g2.d(method2, g3Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i10, c(concat2), g2.d(method3, g3Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object d10 = g2.d(method4, g3Var, new Object[0]);
                    if (method5 == null) {
                        if (d10 instanceof Boolean) {
                            if (((Boolean) d10).booleanValue()) {
                                b(sb, i10, c(concat3), d10);
                            }
                        } else if (d10 instanceof Integer) {
                            if (((Integer) d10).intValue() != 0) {
                                b(sb, i10, c(concat3), d10);
                            }
                        } else if (d10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) d10).floatValue()) != 0) {
                                b(sb, i10, c(concat3), d10);
                            }
                        } else if (!(d10 instanceof Double)) {
                            if (d10 instanceof String) {
                                obj = "";
                            } else if (d10 instanceof q1) {
                                obj = q1.f4223k;
                            } else if (!(d10 instanceof g3)) {
                                if ((d10 instanceof Enum) && ((Enum) d10).ordinal() == 0) {
                                }
                                b(sb, i10, c(concat3), d10);
                            } else if (d10 != ((g3) d10).zzh()) {
                                b(sb, i10, c(concat3), d10);
                            }
                            if (!d10.equals(obj)) {
                                b(sb, i10, c(concat3), d10);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) d10).doubleValue()) != 0) {
                            b(sb, i10, c(concat3), d10);
                        }
                    } else if (((Boolean) g2.d(method5, g3Var, new Object[0])).booleanValue()) {
                        b(sb, i10, c(concat3), d10);
                    }
                }
            }
        }
        if (g3Var instanceof f2) {
            f2 f2Var = (f2) g3Var;
            throw null;
        }
        k4 k4Var = ((g2) g3Var).zzc;
        if (k4Var != null) {
            k4Var.e(sb, i10);
        }
    }
}
