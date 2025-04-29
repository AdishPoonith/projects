package u7;

import i7.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f19145a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f19146a;

        static {
            int[] iArr = new int[t7.b.values().length];
            f19146a = iArr;
            try {
                iArr[t7.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19146a[t7.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19146a[t7.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19146a[t7.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, l7.a aVar, String str2) {
        try {
            for (byte b10 : str.getBytes(str2)) {
                aVar.d(b10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new h(e10);
        }
    }

    static void b(CharSequence charSequence, l7.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int p10 = p(charSequence.charAt(i10));
            if (p10 == -1) {
                throw new h();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int p11 = p(charSequence.charAt(i11));
                if (p11 == -1) {
                    throw new h();
                }
                aVar.d((p10 * 45) + p11, 11);
                i10 += 2;
            } else {
                aVar.d(p10, 6);
                i10 = i11;
            }
        }
    }

    static void c(String str, t7.b bVar, l7.a aVar, String str2) {
        int i10 = a.f19146a[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
        } else if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else if (i10 != 4) {
            throw new h("Invalid mode: ".concat(String.valueOf(bVar)));
        } else {
            e(str, aVar);
        }
    }

    private static void d(l7.c cVar, l7.a aVar) {
        aVar.d(t7.b.ECI.b(), 4);
        aVar.d(cVar.g(), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void e(java.lang.String r6, l7.a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4d
            int r0 = r6.length
            r1 = 0
        L8:
            if (r1 >= r0) goto L4c
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L24
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L24
        L22:
            int r2 = r2 - r3
            goto L33
        L24:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L32
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L32
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L22
        L32:
            r2 = -1
        L33:
            if (r2 == r4) goto L44
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.d(r3, r2)
            int r1 = r1 + 2
            goto L8
        L44:
            i7.h r6 = new i7.h
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L4c:
            return
        L4d:
            r6 = move-exception
            i7.h r7 = new i7.h
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.c.e(java.lang.String, l7.a):void");
    }

    static void f(int i10, t7.c cVar, t7.b bVar, l7.a aVar) {
        int g10 = bVar.g(cVar);
        int i11 = 1 << g10;
        if (i10 < i11) {
            aVar.d(i10, g10);
            return;
        }
        throw new h(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(t7.b bVar, l7.a aVar) {
        aVar.d(bVar.b(), 4);
    }

    static void h(CharSequence charSequence, l7.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.d((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.d((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.d(charAt, 4);
                }
            }
        }
    }

    private static int i(t7.b bVar, l7.a aVar, l7.a aVar2, t7.c cVar) {
        return aVar.i() + bVar.g(cVar) + aVar2.i();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(l7.a aVar, t7.a aVar2, t7.c cVar, b bVar) {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    private static t7.b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return t7.b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else if (p(charAt) == -1) {
                return t7.b.BYTE;
            } else {
                z10 = true;
            }
        }
        return z10 ? t7.b.ALPHANUMERIC : z11 ? t7.b.NUMERIC : t7.b.BYTE;
    }

    private static t7.c m(int i10, t7.a aVar) {
        for (int i11 = 1; i11 <= 40; i11++) {
            t7.c e10 = t7.c.e(i11);
            if (v(i10, e10, aVar)) {
                return e10;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u7.f n(java.lang.String r7, t7.a r8, java.util.Map<i7.c, ?> r9) {
        /*
            r0 = 1
            r1 = 0
            if (r9 == 0) goto Le
            i7.c r2 = i7.c.CHARACTER_SET
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L1c
            i7.c r3 = i7.c.CHARACTER_SET
            java.lang.Object r3 = r9.get(r3)
            java.lang.String r3 = r3.toString()
            goto L1e
        L1c:
            java.lang.String r3 = "ISO-8859-1"
        L1e:
            t7.b r4 = l(r7, r3)
            l7.a r5 = new l7.a
            r5.<init>()
            t7.b r6 = t7.b.BYTE
            if (r4 != r6) goto L36
            if (r2 == 0) goto L36
            l7.c r2 = l7.c.b(r3)
            if (r2 == 0) goto L36
            d(r2, r5)
        L36:
            if (r9 == 0) goto L41
            i7.c r2 = i7.c.GS1_FORMAT
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L41
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 == 0) goto L5d
            i7.c r0 = i7.c.GS1_FORMAT
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            t7.b r0 = t7.b.FNC1_FIRST_POSITION
            g(r0, r5)
        L5d:
            g(r4, r5)
            l7.a r0 = new l7.a
            r0.<init>()
            c(r7, r4, r0, r3)
            if (r9 == 0) goto L95
            i7.c r1 = i7.c.QR_VERSION
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L95
            java.lang.Object r9 = r9.get(r1)
            java.lang.String r9 = r9.toString()
            int r9 = java.lang.Integer.parseInt(r9)
            t7.c r9 = t7.c.e(r9)
            int r1 = i(r4, r5, r0, r9)
            boolean r1 = v(r1, r9, r8)
            if (r1 == 0) goto L8d
            goto L99
        L8d:
            i7.h r7 = new i7.h
            java.lang.String r8 = "Data too big for requested version"
            r7.<init>(r8)
            throw r7
        L95:
            t7.c r9 = t(r8, r4, r5, r0)
        L99:
            l7.a r1 = new l7.a
            r1.<init>()
            r1.c(r5)
            if (r4 != r6) goto La8
            int r7 = r0.j()
            goto Lac
        La8:
            int r7 = r7.length()
        Lac:
            f(r7, r9, r4, r1)
            r1.c(r0)
            t7.c$b r7 = r9.c(r8)
            int r0 = r9.d()
            int r2 = r7.d()
            int r0 = r0 - r2
            u(r0, r1)
            int r2 = r9.d()
            int r7 = r7.c()
            l7.a r7 = r(r1, r2, r0, r7)
            u7.f r0 = new u7.f
            r0.<init>()
            r0.c(r8)
            r0.f(r4)
            r0.g(r9)
            int r1 = r9.b()
            u7.b r2 = new u7.b
            r2.<init>(r1, r1)
            int r1 = k(r7, r8, r9, r2)
            r0.d(r1)
            u7.e.a(r7, r8, r9, r1, r2)
            r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.c.n(java.lang.String, t7.a, java.util.Map):u7.f");
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new m7.c(m7.a.f13858l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static int p(int i10) {
        int[] iArr = f19145a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 >= i12) {
            throw new h("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new h("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new h("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new h("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
            return;
        }
        iArr[0] = i19;
        iArr2[0] = i21;
    }

    static l7.a r(l7.a aVar, int i10, int i11, int i12) {
        if (aVar.j() == i11) {
            ArrayList<u7.a> arrayList = new ArrayList(i12);
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i10, i11, i12, i16, iArr, iArr2);
                int i17 = iArr[0];
                byte[] bArr = new byte[i17];
                aVar.o(i13 << 3, bArr, 0, i17);
                byte[] o10 = o(bArr, iArr2[0]);
                arrayList.add(new u7.a(bArr, o10));
                i14 = Math.max(i14, i17);
                i15 = Math.max(i15, o10.length);
                i13 += iArr[0];
            }
            if (i11 == i13) {
                l7.a aVar2 = new l7.a();
                for (int i18 = 0; i18 < i14; i18++) {
                    for (u7.a aVar3 : arrayList) {
                        byte[] a10 = aVar3.a();
                        if (i18 < a10.length) {
                            aVar2.d(a10[i18], 8);
                        }
                    }
                }
                for (int i19 = 0; i19 < i15; i19++) {
                    for (u7.a aVar4 : arrayList) {
                        byte[] b10 = aVar4.b();
                        if (i19 < b10.length) {
                            aVar2.d(b10[i19], 8);
                        }
                    }
                }
                if (i10 == aVar2.j()) {
                    return aVar2;
                }
                throw new h("Interleaving error: " + i10 + " and " + aVar2.j() + " differ.");
            }
            throw new h("Data bytes does not match offset");
        }
        throw new h("Number of bits and data bytes does not match");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                int i11 = bytes[i10] & 255;
                if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static t7.c t(t7.a aVar, t7.b bVar, l7.a aVar2, l7.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, t7.c.e(1)), aVar)), aVar);
    }

    static void u(int i10, l7.a aVar) {
        int i11 = i10 << 3;
        if (aVar.i() > i11) {
            throw new h("data bits cannot fit in the QR Code" + aVar.i() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.i() < i11; i12++) {
            aVar.a(false);
        }
        int i13 = aVar.i() & 7;
        if (i13 > 0) {
            while (i13 < 8) {
                aVar.a(false);
                i13++;
            }
        }
        int j10 = i10 - aVar.j();
        for (int i14 = 0; i14 < j10; i14++) {
            aVar.d((i14 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.i() != i11) {
            throw new h("Bits size does not equal capacity");
        }
    }

    private static boolean v(int i10, t7.c cVar, t7.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8;
    }
}
