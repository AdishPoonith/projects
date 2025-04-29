package i2;

import android.util.Pair;
import p3.a0;
import p3.n0;
import p3.r;
import s1.u2;
import x1.m;
/* loaded from: classes.dex */
final class d {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9665a;

        /* renamed from: b  reason: collision with root package name */
        public final long f9666b;

        private a(int i10, long j10) {
            this.f9665a = i10;
            this.f9666b = j10;
        }

        public static a a(m mVar, a0 a0Var) {
            mVar.n(a0Var.e(), 0, 8);
            a0Var.T(0);
            return new a(a0Var.p(), a0Var.w());
        }
    }

    public static boolean a(m mVar) {
        a0 a0Var = new a0(8);
        int i10 = a.a(mVar, a0Var).f9665a;
        if (i10 == 1380533830 || i10 == 1380333108) {
            mVar.n(a0Var.e(), 0, 4);
            a0Var.T(0);
            int p10 = a0Var.p();
            if (p10 != 1463899717) {
                r.c("WavHeaderReader", "Unsupported form type: " + p10);
                return false;
            }
            return true;
        }
        return false;
    }

    public static c b(m mVar) {
        byte[] bArr;
        a0 a0Var = new a0(16);
        a d10 = d(1718449184, mVar, a0Var);
        p3.a.f(d10.f9666b >= 16);
        mVar.n(a0Var.e(), 0, 16);
        a0Var.T(0);
        int y10 = a0Var.y();
        int y11 = a0Var.y();
        int x10 = a0Var.x();
        int x11 = a0Var.x();
        int y12 = a0Var.y();
        int y13 = a0Var.y();
        int i10 = ((int) d10.f9666b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            mVar.n(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = n0.f15402f;
        }
        mVar.g((int) (mVar.l() - mVar.p()));
        return new c(y10, y11, x10, x11, y12, y13, bArr);
    }

    public static long c(m mVar) {
        a0 a0Var = new a0(8);
        a a10 = a.a(mVar, a0Var);
        if (a10.f9665a != 1685272116) {
            mVar.f();
            return -1L;
        }
        mVar.o(8);
        a0Var.T(0);
        mVar.n(a0Var.e(), 0, 8);
        long u10 = a0Var.u();
        mVar.g(((int) a10.f9666b) + 8);
        return u10;
    }

    private static a d(int i10, m mVar, a0 a0Var) {
        while (true) {
            a a10 = a.a(mVar, a0Var);
            if (a10.f9665a == i10) {
                return a10;
            }
            r.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f9665a);
            long j10 = a10.f9666b + 8;
            if (j10 > 2147483647L) {
                throw u2.d("Chunk is too large (~2GB+) to skip; id: " + a10.f9665a);
            }
            mVar.g((int) j10);
        }
    }

    public static Pair<Long, Long> e(m mVar) {
        mVar.f();
        a d10 = d(1684108385, mVar, new a0(8));
        mVar.g(8);
        return Pair.create(Long.valueOf(mVar.p()), Long.valueOf(d10.f9666b));
    }
}
