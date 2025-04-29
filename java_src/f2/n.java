package f2;

import p3.a0;
/* loaded from: classes.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8736a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f8736a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(x1.m mVar) {
        return c(mVar, true, false);
    }

    private static boolean c(x1.m mVar, boolean z10, boolean z11) {
        boolean z12;
        long a10 = mVar.a();
        long j10 = 4096;
        long j11 = -1;
        int i10 = (a10 > (-1L) ? 1 : (a10 == (-1L) ? 0 : -1));
        if (i10 != 0 && a10 <= 4096) {
            j10 = a10;
        }
        int i11 = (int) j10;
        a0 a0Var = new a0(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (i12 < i11) {
            a0Var.P(8);
            if (!mVar.k(a0Var.e(), z13 ? 1 : 0, 8, true)) {
                break;
            }
            long I = a0Var.I();
            int p10 = a0Var.p();
            int i13 = 16;
            if (I == 1) {
                mVar.n(a0Var.e(), 8, 8);
                a0Var.S(16);
                I = a0Var.z();
            } else {
                if (I == 0) {
                    long a11 = mVar.a();
                    if (a11 != j11) {
                        I = (a11 - mVar.l()) + 8;
                    }
                }
                i13 = 8;
            }
            long j12 = i13;
            if (I < j12) {
                return z13;
            }
            i12 += i13;
            if (p10 == 1836019574) {
                i11 += (int) I;
                if (i10 != 0 && i11 > a10) {
                    i11 = (int) a10;
                }
                j11 = -1;
            } else if (p10 == 1836019558 || p10 == 1836475768) {
                z12 = true;
                break;
            } else {
                long j13 = a10;
                if ((i12 + I) - j12 >= i11) {
                    break;
                }
                int i14 = (int) (I - j12);
                i12 += i14;
                if (p10 == 1718909296) {
                    if (i14 < 8) {
                        return false;
                    }
                    a0Var.P(i14);
                    mVar.n(a0Var.e(), 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            break;
                        }
                        if (i16 == 1) {
                            a0Var.U(4);
                        } else if (a(a0Var.p(), z11)) {
                            z14 = true;
                            break;
                        }
                        i16++;
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i14 != 0) {
                    mVar.o(i14);
                }
                a10 = j13;
                j11 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    public static boolean d(x1.m mVar, boolean z10) {
        return c(mVar, false, z10);
    }
}
