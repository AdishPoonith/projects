package x1;

import p3.n0;
import x1.b0;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0285a f20079a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f20080b;

    /* renamed from: c  reason: collision with root package name */
    protected c f20081c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20082d;

    /* renamed from: x1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0285a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final d f20083a;

        /* renamed from: b  reason: collision with root package name */
        private final long f20084b;

        /* renamed from: c  reason: collision with root package name */
        private final long f20085c;

        /* renamed from: d  reason: collision with root package name */
        private final long f20086d;

        /* renamed from: e  reason: collision with root package name */
        private final long f20087e;

        /* renamed from: f  reason: collision with root package name */
        private final long f20088f;

        /* renamed from: g  reason: collision with root package name */
        private final long f20089g;

        public C0285a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f20083a = dVar;
            this.f20084b = j10;
            this.f20085c = j11;
            this.f20086d = j12;
            this.f20087e = j13;
            this.f20088f = j14;
            this.f20089g = j15;
        }

        @Override // x1.b0
        public boolean f() {
            return true;
        }

        @Override // x1.b0
        public b0.a g(long j10) {
            return new b0.a(new c0(j10, c.h(this.f20083a.a(j10), this.f20085c, this.f20086d, this.f20087e, this.f20088f, this.f20089g)));
        }

        @Override // x1.b0
        public long h() {
            return this.f20084b;
        }

        public long k(long j10) {
            return this.f20083a.a(j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // x1.a.d
        public long a(long j10) {
            return j10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f20090a;

        /* renamed from: b  reason: collision with root package name */
        private final long f20091b;

        /* renamed from: c  reason: collision with root package name */
        private final long f20092c;

        /* renamed from: d  reason: collision with root package name */
        private long f20093d;

        /* renamed from: e  reason: collision with root package name */
        private long f20094e;

        /* renamed from: f  reason: collision with root package name */
        private long f20095f;

        /* renamed from: g  reason: collision with root package name */
        private long f20096g;

        /* renamed from: h  reason: collision with root package name */
        private long f20097h;

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f20090a = j10;
            this.f20091b = j11;
            this.f20093d = j12;
            this.f20094e = j13;
            this.f20095f = j14;
            this.f20096g = j15;
            this.f20092c = j16;
            this.f20097h = h(j11, j12, j13, j14, j15, j16);
        }

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return n0.r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f20096g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f20095f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f20097h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f20090a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f20091b;
        }

        private void n() {
            this.f20097h = h(this.f20091b, this.f20093d, this.f20094e, this.f20095f, this.f20096g, this.f20092c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f20094e = j10;
            this.f20096g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f20093d = j10;
            this.f20095f = j11;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface d {
        long a(long j10);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f20098d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a  reason: collision with root package name */
        private final int f20099a;

        /* renamed from: b  reason: collision with root package name */
        private final long f20100b;

        /* renamed from: c  reason: collision with root package name */
        private final long f20101c;

        private e(int i10, long j10, long j11) {
            this.f20099a = i10;
            this.f20100b = j10;
            this.f20101c = j11;
        }

        public static e d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        public static e e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        public static e f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public interface f {
        e a(m mVar, long j10);

        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f20080b = fVar;
        this.f20082d = i10;
        this.f20079a = new C0285a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected c a(long j10) {
        return new c(j10, this.f20079a.k(j10), this.f20079a.f20085c, this.f20079a.f20086d, this.f20079a.f20087e, this.f20079a.f20088f, this.f20079a.f20089g);
    }

    public final b0 b() {
        return this.f20079a;
    }

    public int c(m mVar, a0 a0Var) {
        while (true) {
            c cVar = (c) p3.a.h(this.f20081c);
            long j10 = cVar.j();
            long i10 = cVar.i();
            long k10 = cVar.k();
            if (i10 - j10 <= this.f20082d) {
                e(false, j10);
                return g(mVar, j10, a0Var);
            } else if (!i(mVar, k10)) {
                return g(mVar, k10, a0Var);
            } else {
                mVar.f();
                e a10 = this.f20080b.a(mVar, cVar.m());
                int i11 = a10.f20099a;
                if (i11 == -3) {
                    e(false, k10);
                    return g(mVar, k10, a0Var);
                } else if (i11 == -2) {
                    cVar.p(a10.f20100b, a10.f20101c);
                } else if (i11 != -1) {
                    if (i11 == 0) {
                        i(mVar, a10.f20101c);
                        e(true, a10.f20101c);
                        return g(mVar, a10.f20101c, a0Var);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    cVar.o(a10.f20100b, a10.f20101c);
                }
            }
        }
    }

    public final boolean d() {
        return this.f20081c != null;
    }

    protected final void e(boolean z10, long j10) {
        this.f20081c = null;
        this.f20080b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected final int g(m mVar, long j10, a0 a0Var) {
        if (j10 == mVar.p()) {
            return 0;
        }
        a0Var.f20102a = j10;
        return 1;
    }

    public final void h(long j10) {
        c cVar = this.f20081c;
        if (cVar == null || cVar.l() != j10) {
            this.f20081c = a(j10);
        }
    }

    protected final boolean i(m mVar, long j10) {
        long p10 = j10 - mVar.p();
        if (p10 < 0 || p10 > 262144) {
            return false;
        }
        mVar.g((int) p10);
        return true;
    }
}
