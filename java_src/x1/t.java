package x1;

import java.util.Arrays;
import java.util.List;
import s1.u2;
import x1.v;
/* loaded from: classes.dex */
public final class t {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public v f20193a;

        public a(v vVar) {
            this.f20193a = vVar;
        }
    }

    public static boolean a(m mVar) {
        p3.a0 a0Var = new p3.a0(4);
        mVar.n(a0Var.e(), 0, 4);
        return a0Var.I() == 1716281667;
    }

    public static int b(m mVar) {
        mVar.f();
        p3.a0 a0Var = new p3.a0(2);
        mVar.n(a0Var.e(), 0, 2);
        int M = a0Var.M();
        int i10 = M >> 2;
        mVar.f();
        if (i10 == 16382) {
            return M;
        }
        throw u2.a("First frame does not start with sync code.", null);
    }

    public static k2.a c(m mVar, boolean z10) {
        k2.a a10 = new y().a(mVar, z10 ? null : p2.h.f15307b);
        if (a10 == null || a10.e() == 0) {
            return null;
        }
        return a10;
    }

    public static k2.a d(m mVar, boolean z10) {
        mVar.f();
        long l10 = mVar.l();
        k2.a c10 = c(mVar, z10);
        mVar.g((int) (mVar.l() - l10));
        return c10;
    }

    public static boolean e(m mVar, a aVar) {
        v a10;
        mVar.f();
        p3.z zVar = new p3.z(new byte[4]);
        mVar.n(zVar.f15486a, 0, 4);
        boolean g10 = zVar.g();
        int h10 = zVar.h(7);
        int h11 = zVar.h(24) + 4;
        if (h10 == 0) {
            a10 = h(mVar);
        } else {
            v vVar = aVar.f20193a;
            if (vVar == null) {
                throw new IllegalArgumentException();
            }
            if (h10 == 3) {
                a10 = vVar.b(g(mVar, h11));
            } else if (h10 == 4) {
                a10 = vVar.c(j(mVar, h11));
            } else if (h10 != 6) {
                mVar.g(h11);
                return g10;
            } else {
                p3.a0 a0Var = new p3.a0(h11);
                mVar.readFully(a0Var.e(), 0, h11);
                a0Var.U(4);
                a10 = vVar.a(com.google.common.collect.q.A(n2.a.a(a0Var)));
            }
        }
        aVar.f20193a = a10;
        return g10;
    }

    public static v.a f(p3.a0 a0Var) {
        a0Var.U(1);
        int J = a0Var.J();
        long f10 = a0Var.f() + J;
        int i10 = J / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long z10 = a0Var.z();
            if (z10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = z10;
            jArr2[i11] = a0Var.z();
            a0Var.U(2);
            i11++;
        }
        a0Var.U((int) (f10 - a0Var.f()));
        return new v.a(jArr, jArr2);
    }

    private static v.a g(m mVar, int i10) {
        p3.a0 a0Var = new p3.a0(i10);
        mVar.readFully(a0Var.e(), 0, i10);
        return f(a0Var);
    }

    private static v h(m mVar) {
        byte[] bArr = new byte[38];
        mVar.readFully(bArr, 0, 38);
        return new v(bArr, 4);
    }

    public static void i(m mVar) {
        p3.a0 a0Var = new p3.a0(4);
        mVar.readFully(a0Var.e(), 0, 4);
        if (a0Var.I() != 1716281667) {
            throw u2.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(m mVar, int i10) {
        p3.a0 a0Var = new p3.a0(i10);
        mVar.readFully(a0Var.e(), 0, i10);
        a0Var.U(4);
        return Arrays.asList(h0.j(a0Var, false, false).f20153b);
    }
}
