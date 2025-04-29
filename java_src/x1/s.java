package x1;

import p3.n0;
import s1.u2;
/* loaded from: classes.dex */
public final class s {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f20192a;
    }

    private static boolean a(p3.a0 a0Var, v vVar, int i10) {
        int j10 = j(a0Var, i10);
        return j10 != -1 && j10 <= vVar.f20197b;
    }

    private static boolean b(p3.a0 a0Var, int i10) {
        return a0Var.G() == n0.u(a0Var.e(), i10, a0Var.f() - 1, 0);
    }

    private static boolean c(p3.a0 a0Var, v vVar, boolean z10, a aVar) {
        try {
            long N = a0Var.N();
            if (!z10) {
                N *= vVar.f20197b;
            }
            aVar.f20192a = N;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(p3.a0 a0Var, v vVar, int i10, a aVar) {
        int f10 = a0Var.f();
        long I = a0Var.I();
        long j10 = I >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) (15 & (I >> 4)), vVar) && f((int) ((I >> 1) & 7), vVar) && !(((I & 1) > 1L ? 1 : ((I & 1) == 1L ? 0 : -1)) == 0) && c(a0Var, vVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(a0Var, vVar, (int) ((I >> 12) & 15)) && e(a0Var, vVar, (int) ((I >> 8) & 15)) && b(a0Var, f10);
    }

    private static boolean e(p3.a0 a0Var, v vVar, int i10) {
        int i11 = vVar.f20200e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == vVar.f20201f;
        } else if (i10 == 12) {
            return a0Var.G() * 1000 == i11;
        } else if (i10 <= 14) {
            int M = a0Var.M();
            if (i10 == 14) {
                M *= 10;
            }
            return M == i11;
        } else {
            return false;
        }
    }

    private static boolean f(int i10, v vVar) {
        return i10 == 0 || i10 == vVar.f20204i;
    }

    private static boolean g(int i10, v vVar) {
        return i10 <= 7 ? i10 == vVar.f20202g - 1 : i10 <= 10 && vVar.f20202g == 2;
    }

    public static boolean h(m mVar, v vVar, int i10, a aVar) {
        long l10 = mVar.l();
        byte[] bArr = new byte[2];
        mVar.n(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            mVar.f();
            mVar.o((int) (l10 - mVar.p()));
            return false;
        }
        p3.a0 a0Var = new p3.a0(16);
        System.arraycopy(bArr, 0, a0Var.e(), 0, 2);
        a0Var.S(o.c(mVar, a0Var.e(), 2, 14));
        mVar.f();
        mVar.o((int) (l10 - mVar.p()));
        return d(a0Var, vVar, i10, aVar);
    }

    public static long i(m mVar, v vVar) {
        mVar.f();
        mVar.o(1);
        byte[] bArr = new byte[1];
        mVar.n(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        mVar.o(2);
        int i10 = z10 ? 7 : 6;
        p3.a0 a0Var = new p3.a0(i10);
        a0Var.S(o.c(mVar, a0Var.e(), 0, i10));
        mVar.f();
        a aVar = new a();
        if (c(a0Var, vVar, z10, aVar)) {
            return aVar.f20192a;
        }
        throw u2.a(null, null);
    }

    public static int j(p3.a0 a0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return a0Var.G() + 1;
            case 7:
                return a0Var.M() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
