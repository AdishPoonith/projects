package io.grpc.internal;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f11056a = TimeUnit.SECONDS.toNanos(1);

    public static List<Map<String, ?>> a(List<?> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i10), Integer.valueOf(i10), list));
            }
        }
        return list;
    }

    public static List<String> b(List<?> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", list.get(i10), Integer.valueOf(i10), list));
            }
        }
        return list;
    }

    private static boolean c(long j10, int i10) {
        if (j10 >= -315576000000L && j10 <= 315576000000L) {
            long j11 = i10;
            if (j11 >= -999999999 && j11 < f11056a) {
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 >= 0 && i10 >= 0) {
                    return true;
                }
                if (i11 <= 0 && i10 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean d(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
        }
        return null;
    }

    public static List<?> e(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                return (List) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
        }
        return null;
    }

    public static List<Map<String, ?>> f(Map<String, ?> map, String str) {
        List<?> e10 = e(map, str);
        if (e10 == null) {
            return null;
        }
        return a(e10);
    }

    public static List<String> g(Map<String, ?> map, String str) {
        List<?> e10 = e(map, str);
        if (e10 == null) {
            return null;
        }
        return b(e10);
    }

    public static Double h(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Double) {
                return (Double) obj;
            }
            if (obj instanceof String) {
                try {
                    return Double.valueOf(Double.parseDouble((String) obj));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
                }
            }
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        return null;
    }

    public static Integer i(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (!(obj instanceof Double)) {
                if (obj instanceof String) {
                    try {
                        return Integer.valueOf(Integer.parseInt((String) obj));
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
                    }
                }
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            Double d10 = (Double) obj;
            int intValue = d10.intValue();
            if (intValue == d10.doubleValue()) {
                return Integer.valueOf(intValue);
            }
            throw new ClassCastException("Number expected to be integer: " + d10);
        }
        return null;
    }

    public static Map<String, ?> j(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                return (Map) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
        }
        return null;
    }

    public static String k(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
        }
        return null;
    }

    public static Long l(Map<String, ?> map, String str) {
        String k10 = k(map, str);
        if (k10 == null) {
            return null;
        }
        try {
            return Long.valueOf(n(k10));
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static long m(long j10, int i10) {
        long j11 = i10;
        long j12 = f11056a;
        if (j11 <= (-j12) || j11 >= j12) {
            j10 = d5.c.a(j10, j11 / j12);
            i10 = (int) (j11 % j12);
        }
        if (j10 > 0 && i10 < 0) {
            i10 = (int) (i10 + j12);
            j10--;
        }
        if (j10 < 0 && i10 > 0) {
            i10 = (int) (i10 - j12);
            j10++;
        }
        if (c(j10, i10)) {
            return p(TimeUnit.SECONDS.toNanos(j10), i10);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j10), Integer.valueOf(i10)));
    }

    private static long n(String str) {
        boolean z10;
        String str2;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z10 = true;
        } else {
            z10 = false;
        }
        String substring = str.substring(0, str.length() - 1);
        int indexOf = substring.indexOf(46);
        if (indexOf != -1) {
            str2 = substring.substring(indexOf + 1);
            substring = substring.substring(0, indexOf);
        } else {
            str2 = "";
        }
        long parseLong = Long.parseLong(substring);
        int o10 = str2.isEmpty() ? 0 : o(str2);
        if (parseLong < 0) {
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        if (z10) {
            parseLong = -parseLong;
            o10 = -o10;
        }
        try {
            return m(parseLong, o10);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    private static int o(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < 9; i11++) {
            i10 *= 10;
            if (i11 < str.length()) {
                if (str.charAt(i11) < '0' || str.charAt(i11) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                i10 += str.charAt(i11) - '0';
            }
        }
        return i10;
    }

    private static long p(long j10, long j11) {
        long j12 = j10 + j11;
        return (((j11 ^ j10) > 0L ? 1 : ((j11 ^ j10) == 0L ? 0 : -1)) < 0) | ((j10 ^ j12) >= 0) ? j12 : ((j12 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}
