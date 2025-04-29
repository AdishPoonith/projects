package g2;

import p3.n0;
import s1.n1;
import x1.a0;
import x1.b0;
import x1.e0;
import x1.m;
import x1.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    private e0 f8929b;

    /* renamed from: c  reason: collision with root package name */
    private n f8930c;

    /* renamed from: d  reason: collision with root package name */
    private g f8931d;

    /* renamed from: e  reason: collision with root package name */
    private long f8932e;

    /* renamed from: f  reason: collision with root package name */
    private long f8933f;

    /* renamed from: g  reason: collision with root package name */
    private long f8934g;

    /* renamed from: h  reason: collision with root package name */
    private int f8935h;

    /* renamed from: i  reason: collision with root package name */
    private int f8936i;

    /* renamed from: k  reason: collision with root package name */
    private long f8938k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f8939l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f8940m;

    /* renamed from: a  reason: collision with root package name */
    private final e f8928a = new e();

    /* renamed from: j  reason: collision with root package name */
    private b f8937j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        n1 f8941a;

        /* renamed from: b  reason: collision with root package name */
        g f8942b;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements g {
        private c() {
        }

        @Override // g2.g
        public b0 a() {
            return new b0.b(-9223372036854775807L);
        }

        @Override // g2.g
        public long b(m mVar) {
            return -1L;
        }

        @Override // g2.g
        public void c(long j10) {
        }
    }

    private void a() {
        p3.a.h(this.f8929b);
        n0.j(this.f8930c);
    }

    private boolean i(m mVar) {
        while (this.f8928a.d(mVar)) {
            this.f8938k = mVar.p() - this.f8933f;
            if (!h(this.f8928a.c(), this.f8933f, this.f8937j)) {
                return true;
            }
            this.f8933f = mVar.p();
        }
        this.f8935h = 3;
        return false;
    }

    private int j(m mVar) {
        if (i(mVar)) {
            n1 n1Var = this.f8937j.f8941a;
            this.f8936i = n1Var.I;
            if (!this.f8940m) {
                this.f8929b.e(n1Var);
                this.f8940m = true;
            }
            g gVar = this.f8937j.f8942b;
            if (gVar == null) {
                if (mVar.a() != -1) {
                    f b10 = this.f8928a.b();
                    this.f8931d = new g2.a(this, this.f8933f, mVar.a(), b10.f8921h + b10.f8922i, b10.f8916c, (b10.f8915b & 4) != 0);
                    this.f8935h = 2;
                    this.f8928a.f();
                    return 0;
                }
                gVar = new c();
            }
            this.f8931d = gVar;
            this.f8935h = 2;
            this.f8928a.f();
            return 0;
        }
        return -1;
    }

    private int k(m mVar, a0 a0Var) {
        long b10 = this.f8931d.b(mVar);
        if (b10 >= 0) {
            a0Var.f20102a = b10;
            return 1;
        }
        if (b10 < -1) {
            e(-(b10 + 2));
        }
        if (!this.f8939l) {
            this.f8930c.t((b0) p3.a.h(this.f8931d.a()));
            this.f8939l = true;
        }
        if (this.f8938k <= 0 && !this.f8928a.d(mVar)) {
            this.f8935h = 3;
            return -1;
        }
        this.f8938k = 0L;
        p3.a0 c10 = this.f8928a.c();
        long f10 = f(c10);
        if (f10 >= 0) {
            long j10 = this.f8934g;
            if (j10 + f10 >= this.f8932e) {
                long b11 = b(j10);
                this.f8929b.d(c10, c10.g());
                this.f8929b.c(b11, 1, c10.g(), 0, null);
                this.f8932e = -1L;
            }
        }
        this.f8934g += f10;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / this.f8936i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c(long j10) {
        return (this.f8936i * j10) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(n nVar, e0 e0Var) {
        this.f8930c = nVar;
        this.f8929b = e0Var;
        l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(long j10) {
        this.f8934g = j10;
    }

    protected abstract long f(p3.a0 a0Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(m mVar, a0 a0Var) {
        a();
        int i10 = this.f8935h;
        if (i10 != 0) {
            if (i10 == 1) {
                mVar.g((int) this.f8933f);
                this.f8935h = 2;
                return 0;
            } else if (i10 == 2) {
                n0.j(this.f8931d);
                return k(mVar, a0Var);
            } else if (i10 == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        return j(mVar);
    }

    protected abstract boolean h(p3.a0 a0Var, long j10, b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(boolean z10) {
        int i10;
        if (z10) {
            this.f8937j = new b();
            this.f8933f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f8935h = i10;
        this.f8932e = -1L;
        this.f8934g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f8928a.e();
        if (j10 == 0) {
            l(!this.f8939l);
        } else if (this.f8935h != 0) {
            this.f8932e = c(j11);
            ((g) n0.j(this.f8931d)).c(this.f8932e);
            this.f8935h = 2;
        }
    }
}
