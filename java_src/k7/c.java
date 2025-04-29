package k7;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f12608a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(l7.a aVar, int i10, int i11) {
        int[] iArr = new int[i11];
        int i12 = aVar.i() / i10;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                i14 |= aVar.h((i13 * i10) + i15) ? 1 << ((i10 - i15) - 1) : 0;
            }
            iArr[i13] = i14;
        }
        return iArr;
    }

    private static void b(l7.b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bVar.i(i14, i13);
                    bVar.i(i14, i15);
                    bVar.i(i13, i14);
                    bVar.i(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bVar.i(i16, i16);
        int i17 = i16 + 1;
        bVar.i(i17, i16);
        bVar.i(i16, i17);
        int i18 = i10 + i11;
        bVar.i(i18, i16);
        bVar.i(i18, i17);
        bVar.i(i18, i18 - 1);
    }

    private static void c(l7.b bVar, boolean z10, int i10, l7.a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.h(i12)) {
                    bVar.i(i13, i11 - 5);
                }
                if (aVar.h(i12 + 7)) {
                    bVar.i(i11 + 5, i13);
                }
                if (aVar.h(20 - i12)) {
                    bVar.i(i13, i11 + 5);
                }
                if (aVar.h(27 - i12)) {
                    bVar.i(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.h(i12)) {
                bVar.i(i14, i11 - 7);
            }
            if (aVar.h(i12 + 10)) {
                bVar.i(i11 + 7, i14);
            }
            if (aVar.h(29 - i12)) {
                bVar.i(i14, i11 + 7);
            }
            if (aVar.h(39 - i12)) {
                bVar.i(i11 - 7, i14);
            }
            i12++;
        }
    }

    public static a d(byte[] bArr, int i10, int i11) {
        l7.a aVar;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        l7.a a10 = new d(bArr).a();
        int i16 = ((a10.i() * i10) / 100) + 11;
        int i17 = a10.i() + i16;
        int i18 = 0;
        int i19 = 1;
        if (i11 == 0) {
            l7.a aVar2 = null;
            int i20 = 0;
            int i21 = 0;
            while (i20 <= 32) {
                boolean z11 = i20 <= 3;
                int i22 = z11 ? i20 + 1 : i20;
                int i23 = i(i22, z11);
                if (i17 <= i23) {
                    if (aVar2 == null || i21 != f12608a[i22]) {
                        int i24 = f12608a[i22];
                        i21 = i24;
                        aVar2 = h(a10, i24);
                    }
                    int i25 = i23 - (i23 % i21);
                    if ((!z11 || aVar2.i() <= (i21 << 6)) && aVar2.i() + i16 <= i25) {
                        aVar = aVar2;
                        i12 = i21;
                        z10 = z11;
                        i13 = i22;
                        i14 = i23;
                    }
                }
                i20++;
                i18 = 0;
                i19 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z10 = i11 < 0;
        i13 = Math.abs(i11);
        if (i13 > (z10 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
        }
        i14 = i(i13, z10);
        i12 = f12608a[i13];
        int i26 = i14 - (i14 % i12);
        aVar = h(a10, i12);
        if (aVar.i() + i16 > i26) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z10 && aVar.i() > (i12 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        l7.a e10 = e(aVar, i14, i12);
        int i27 = aVar.i() / i12;
        l7.a f10 = f(z10, i13, i27);
        int i28 = (z10 ? 11 : 14) + (i13 << 2);
        int[] iArr = new int[i28];
        int i29 = 2;
        if (z10) {
            for (int i30 = 0; i30 < i28; i30++) {
                iArr[i30] = i30;
            }
            i15 = i28;
        } else {
            int i31 = i28 / 2;
            i15 = i28 + 1 + (((i31 - 1) / 15) * 2);
            int i32 = i15 / 2;
            for (int i33 = 0; i33 < i31; i33++) {
                int i34 = (i33 / 15) + i33;
                iArr[(i31 - i33) - i19] = (i32 - i34) - 1;
                iArr[i31 + i33] = i34 + i32 + i19;
            }
        }
        l7.b bVar = new l7.b(i15);
        int i35 = 0;
        int i36 = 0;
        while (i35 < i13) {
            int i37 = ((i13 - i35) << i29) + (z10 ? 9 : 12);
            int i38 = 0;
            while (i38 < i37) {
                int i39 = i38 << 1;
                while (i18 < i29) {
                    if (e10.h(i36 + i39 + i18)) {
                        int i40 = i35 << 1;
                        bVar.i(iArr[i40 + i18], iArr[i40 + i38]);
                    }
                    if (e10.h((i37 << 1) + i36 + i39 + i18)) {
                        int i41 = i35 << 1;
                        bVar.i(iArr[i41 + i38], iArr[((i28 - 1) - i41) - i18]);
                    }
                    if (e10.h((i37 << 2) + i36 + i39 + i18)) {
                        int i42 = (i28 - 1) - (i35 << 1);
                        bVar.i(iArr[i42 - i18], iArr[i42 - i38]);
                    }
                    if (e10.h((i37 * 6) + i36 + i39 + i18)) {
                        int i43 = i35 << 1;
                        bVar.i(iArr[((i28 - 1) - i43) - i38], iArr[i43 + i18]);
                    }
                    i18++;
                    i29 = 2;
                }
                i38++;
                i18 = 0;
                i29 = 2;
            }
            i36 += i37 << 3;
            i35++;
            i18 = 0;
            i29 = 2;
        }
        c(bVar, z10, i15, f10);
        int i44 = i15 / 2;
        if (z10) {
            b(bVar, i44, 5);
        } else {
            b(bVar, i44, 7);
            int i45 = 0;
            int i46 = 0;
            while (i46 < (i28 / 2) - 1) {
                for (int i47 = i44 & 1; i47 < i15; i47 += 2) {
                    int i48 = i44 - i45;
                    bVar.i(i48, i47);
                    int i49 = i44 + i45;
                    bVar.i(i49, i47);
                    bVar.i(i47, i48);
                    bVar.i(i47, i49);
                }
                i46 += 15;
                i45 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z10);
        aVar3.f(i15);
        aVar3.d(i13);
        aVar3.b(i27);
        aVar3.e(bVar);
        return aVar3;
    }

    private static l7.a e(l7.a aVar, int i10, int i11) {
        m7.c cVar = new m7.c(g(i11));
        int i12 = i10 / i11;
        int[] a10 = a(aVar, i11, i12);
        cVar.b(a10, i12 - (aVar.i() / i11));
        l7.a aVar2 = new l7.a();
        aVar2.d(0, i10 % i11);
        for (int i13 : a10) {
            aVar2.d(i13, i11);
        }
        return aVar2;
    }

    static l7.a f(boolean z10, int i10, int i11) {
        int i12;
        l7.a aVar = new l7.a();
        int i13 = i10 - 1;
        if (z10) {
            aVar.d(i13, 2);
            aVar.d(i11 - 1, 6);
            i12 = 28;
        } else {
            aVar.d(i13, 5);
            aVar.d(i11 - 1, 11);
            i12 = 40;
        }
        return e(aVar, i12, 4);
    }

    private static m7.a g(int i10) {
        if (i10 != 4) {
            if (i10 != 6) {
                if (i10 != 8) {
                    if (i10 != 10) {
                        if (i10 == 12) {
                            return m7.a.f13854h;
                        }
                        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
                    }
                    return m7.a.f13855i;
                }
                return m7.a.f13860n;
            }
            return m7.a.f13856j;
        }
        return m7.a.f13857k;
    }

    static l7.a h(l7.a aVar, int i10) {
        l7.a aVar2 = new l7.a();
        int i11 = aVar.i();
        int i12 = (1 << i10) - 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = i13 + i15;
                if (i16 >= i11 || aVar.h(i16)) {
                    i14 |= 1 << ((i10 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 != i12) {
                if (i17 == 0) {
                    i17 = i14 | 1;
                } else {
                    aVar2.d(i14, i10);
                    i13 += i10;
                }
            }
            aVar2.d(i17, i10);
            i13--;
            i13 += i10;
        }
        return aVar2;
    }

    private static int i(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }
}
