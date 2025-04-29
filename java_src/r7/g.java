package r7;

import i7.h;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* loaded from: classes.dex */
final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f16749c;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f16747a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f16748b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f16750d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f16751e = StandardCharsets.ISO_8859_1;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16752a;

        static {
            int[] iArr = new int[c.values().length];
            f16752a = iArr;
            try {
                iArr[c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16752a[c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16752a[c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        f16749c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f16747a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f16749c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f16750d, (byte) -1);
        while (true) {
            byte[] bArr3 = f16748b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f16750d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L9:
            if (r1 >= r0) goto L57
            char r2 = r5.charAt(r1)
            r3 = 0
        L10:
            r4 = 13
            if (r3 >= r4) goto L25
            boolean r2 = k(r2)
            if (r2 == 0) goto L25
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L25
            char r2 = r5.charAt(r2)
            goto L10
        L25:
            if (r3 < r4) goto L29
            int r1 = r1 - r6
            return r1
        L29:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L36
            int r1 = r1 + 1
            goto L9
        L36:
            i7.h r5 = new i7.h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L57:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.g.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    private static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            loop0: while (true) {
                char charAt = charSequence.charAt(i10);
                while (k(charAt) && i10 < length) {
                    i11++;
                    i10++;
                    if (i10 < length) {
                        break;
                    }
                }
            }
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int c(java.lang.CharSequence r6, int r7) {
        /*
            int r0 = r6.length()
            r1 = r7
        L5:
            if (r1 >= r0) goto L37
            char r2 = r6.charAt(r1)
            r3 = 0
        Lc:
            r4 = 13
            if (r3 >= r4) goto L23
            boolean r5 = k(r2)
            if (r5 == 0) goto L23
            if (r1 >= r0) goto L23
            int r3 = r3 + 1
            int r1 = r1 + 1
            if (r1 >= r0) goto Lc
            char r2 = r6.charAt(r1)
            goto Lc
        L23:
            if (r3 < r4) goto L28
            int r1 = r1 - r7
            int r1 = r1 - r3
            return r1
        L28:
            if (r3 > 0) goto L5
            char r2 = r6.charAt(r1)
            boolean r2 = n(r2)
            if (r2 == 0) goto L37
            int r1 = r1 + 1
            goto L5
        L37:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.g.c(java.lang.CharSequence, int):int");
    }

    private static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb) {
        int i13;
        sb.append((i11 == 1 && i12 == 0) ? (char) 913 : i11 % 6 == 0 ? (char) 924 : (char) 901);
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + (bArr[i13 + i14] & 255);
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(String str, c cVar, Charset charset) {
        l7.c b10;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f16751e;
        } else if (!f16751e.equals(charset) && (b10 = l7.c.b(charset.name())) != null) {
            h(b10.g(), sb);
        }
        int length = str.length();
        int i10 = a.f16752a[cVar.ordinal()];
        if (i10 == 1) {
            g(str, 0, length, sb, 0);
        } else if (i10 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb);
        } else if (i10 != 3) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int b11 = b(str, i11);
                if (b11 >= 13) {
                    sb.append((char) 902);
                    f(str, i11, b11, sb);
                    i11 += b11;
                    i12 = 0;
                    i13 = 2;
                } else {
                    int c10 = c(str, i11);
                    if (c10 >= 5 || b11 == length) {
                        if (i13 != 0) {
                            sb.append((char) 900);
                            i12 = 0;
                            i13 = 0;
                        }
                        i12 = g(str, i11, c10, sb, i12);
                        i11 += c10;
                    } else {
                        int a10 = a(str, i11, charset);
                        if (a10 == 0) {
                            a10 = 1;
                        }
                        int i14 = a10 + i11;
                        byte[] bytes2 = str.substring(i11, i14).getBytes(charset);
                        if (bytes2.length == 1 && i13 == 0) {
                            d(bytes2, 0, 1, 0, sb);
                        } else {
                            d(bytes2, 0, bytes2.length, i13, sb);
                            i12 = 0;
                            i13 = 1;
                        }
                        i11 = i14;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            f(str, 0, length, sb);
        }
        return sb.toString();
    }

    private static void f(String str, int i10, int i11, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb2.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb3 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb3.append(str.substring(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i12 += min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
        if (r10 == ' ') goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.g.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void h(int i10, StringBuilder sb) {
        char c10;
        if (i10 >= 0 && i10 < 900) {
            sb.append((char) 927);
        } else if (i10 >= 810900) {
            if (i10 >= 811800) {
                throw new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i10)));
            }
            sb.append((char) 925);
            c10 = (char) (810900 - i10);
            sb.append(c10);
        } else {
            sb.append((char) 926);
            sb.append((char) ((i10 / 900) - 1));
            i10 %= 900;
        }
        c10 = (char) i10;
        sb.append(c10);
    }

    private static boolean i(char c10) {
        if (c10 != ' ') {
            return c10 >= 'a' && c10 <= 'z';
        }
        return true;
    }

    private static boolean j(char c10) {
        if (c10 != ' ') {
            return c10 >= 'A' && c10 <= 'Z';
        }
        return true;
    }

    private static boolean k(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    private static boolean l(char c10) {
        return f16749c[c10] != -1;
    }

    private static boolean m(char c10) {
        return f16750d[c10] != -1;
    }

    private static boolean n(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\r') {
            return true;
        }
        return c10 >= ' ' && c10 <= '~';
    }
}
