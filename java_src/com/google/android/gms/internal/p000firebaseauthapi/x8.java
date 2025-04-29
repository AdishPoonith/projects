package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x8  reason: invalid package */
/* loaded from: classes.dex */
public final class x8 {

    /* renamed from: a  reason: collision with root package name */
    public static final b8 f5631a;

    /* renamed from: b  reason: collision with root package name */
    public static final b8 f5632b;

    /* renamed from: c  reason: collision with root package name */
    public static final b8 f5633c;

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f5634d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f5635e;

    /* renamed from: f  reason: collision with root package name */
    private static final Method f5636f;

    /* renamed from: g  reason: collision with root package name */
    private static final Method f5637g;

    static {
        a8 E = b8.E();
        E.s(-62135596800L);
        E.r(0);
        f5631a = (b8) E.j();
        a8 E2 = b8.E();
        E2.s(253402300799L);
        E2.r(999999999);
        f5632b = (b8) E2.j();
        a8 E3 = b8.E();
        E3.s(0L);
        E3.r(0);
        f5633c = (b8) E3.j();
        f5634d = new w8();
        f5635e = c("now");
        f5636f = c("getEpochSecond");
        f5637g = c("getNano");
    }

    public static b8 a(b8 b8Var) {
        long D = b8Var.D();
        int i10 = (D > (-62135596800L) ? 1 : (D == (-62135596800L) ? 0 : -1));
        int C = b8Var.C();
        if (i10 < 0 || D > 253402300799L || C < 0 || C >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(D), Integer.valueOf(C)));
        }
        return b8Var;
    }

    public static b8 b(String str) {
        String str2;
        int i10;
        int indexOf = str.indexOf(84);
        if (indexOf == -1) {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + "\"", 0);
        }
        int indexOf2 = str.indexOf(90, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(43, indexOf);
        }
        if (indexOf2 == -1) {
            indexOf2 = str.indexOf(45, indexOf);
        }
        if (indexOf2 != -1) {
            String substring = str.substring(0, indexOf2);
            int indexOf3 = substring.indexOf(46);
            if (indexOf3 != -1) {
                String substring2 = substring.substring(0, indexOf3);
                str2 = substring.substring(indexOf3 + 1);
                substring = substring2;
            } else {
                str2 = "";
            }
            long time = ((SimpleDateFormat) f5634d.get()).parse(substring).getTime() / 1000;
            if (str2.isEmpty()) {
                i10 = 0;
            } else {
                i10 = 0;
                for (int i11 = 0; i11 < 9; i11++) {
                    i10 *= 10;
                    if (i11 < str2.length()) {
                        if (str2.charAt(i11) < '0' || str2.charAt(i11) > '9') {
                            throw new ParseException("Invalid nanoseconds.", 0);
                        }
                        i10 += str2.charAt(i11) - '0';
                    }
                }
            }
            if (str.charAt(indexOf2) != 'Z') {
                String substring3 = str.substring(indexOf2 + 1);
                int indexOf4 = substring3.indexOf(58);
                if (indexOf4 == -1) {
                    throw new ParseException("Invalid offset value: ".concat(substring3), 0);
                }
                String substring4 = substring3.substring(0, indexOf4);
                String substring5 = substring3.substring(indexOf4 + 1);
                char charAt = str.charAt(indexOf2);
                long parseLong = ((Long.parseLong(substring4) * 60) + Long.parseLong(substring5)) * 60;
                time = charAt == '+' ? time - parseLong : time + parseLong;
            } else if (str.length() != indexOf2 + 1) {
                String substring6 = str.substring(indexOf2);
                throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + substring6 + "\"", 0);
            }
            if (i10 <= -1000000000 || i10 >= 1000000000) {
                try {
                    time = q9.a(time, i10 / 1000000000);
                    i10 %= 1000000000;
                } catch (IllegalArgumentException e10) {
                    ParseException parseException = new ParseException("Failed to parse timestamp " + str + " Timestamp is out of range.", 0);
                    parseException.initCause(e10);
                    throw parseException;
                }
            }
            if (i10 < 0) {
                i10 += 1000000000;
                time = q9.b(time, 1L);
            }
            a8 E = b8.E();
            E.s(time);
            E.r(i10);
            b8 b8Var = (b8) E.j();
            a(b8Var);
            return b8Var;
        }
        throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
    }

    private static Method c(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
