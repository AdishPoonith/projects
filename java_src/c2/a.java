package c2;

import f2.k;
import k2.a;
import p3.a0;
import s1.n1;
import x1.b0;
import x1.l;
import x1.m;
import x1.n;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private n f3169b;

    /* renamed from: c  reason: collision with root package name */
    private int f3170c;

    /* renamed from: d  reason: collision with root package name */
    private int f3171d;

    /* renamed from: e  reason: collision with root package name */
    private int f3172e;

    /* renamed from: g  reason: collision with root package name */
    private q2.b f3174g;

    /* renamed from: h  reason: collision with root package name */
    private m f3175h;

    /* renamed from: i  reason: collision with root package name */
    private c f3176i;

    /* renamed from: j  reason: collision with root package name */
    private k f3177j;

    /* renamed from: a  reason: collision with root package name */
    private final a0 f3168a = new a0(6);

    /* renamed from: f  reason: collision with root package name */
    private long f3173f = -1;

    private void d(m mVar) {
        this.f3168a.P(2);
        mVar.n(this.f3168a.e(), 0, 2);
        mVar.o(this.f3168a.M() - 2);
    }

    private void e() {
        g(new a.b[0]);
        ((n) p3.a.e(this.f3169b)).k();
        this.f3169b.t(new b0.b(-9223372036854775807L));
        this.f3170c = 6;
    }

    private static q2.b f(String str, long j10) {
        b a10;
        if (j10 == -1 || (a10 = e.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void g(a.b... bVarArr) {
        ((n) p3.a.e(this.f3169b)).d(1024, 4).e(new n1.b().M("image/jpeg").Z(new k2.a(bVarArr)).G());
    }

    private int h(m mVar) {
        this.f3168a.P(2);
        mVar.n(this.f3168a.e(), 0, 2);
        return this.f3168a.M();
    }

    private void k(m mVar) {
        int i10;
        this.f3168a.P(2);
        mVar.readFully(this.f3168a.e(), 0, 2);
        int M = this.f3168a.M();
        this.f3171d = M;
        if (M == 65498) {
            if (this.f3173f == -1) {
                e();
                return;
            }
            i10 = 4;
        } else if ((M >= 65488 && M <= 65497) || M == 65281) {
            return;
        } else {
            i10 = 1;
        }
        this.f3170c = i10;
    }

    private void l(m mVar) {
        String A;
        if (this.f3171d == 65505) {
            a0 a0Var = new a0(this.f3172e);
            mVar.readFully(a0Var.e(), 0, this.f3172e);
            if (this.f3174g == null && "http://ns.adobe.com/xap/1.0/".equals(a0Var.A()) && (A = a0Var.A()) != null) {
                q2.b f10 = f(A, mVar.a());
                this.f3174g = f10;
                if (f10 != null) {
                    this.f3173f = f10.f16005m;
                }
            }
        } else {
            mVar.g(this.f3172e);
        }
        this.f3170c = 0;
    }

    private void m(m mVar) {
        this.f3168a.P(2);
        mVar.readFully(this.f3168a.e(), 0, 2);
        this.f3172e = this.f3168a.M() - 2;
        this.f3170c = 2;
    }

    private void n(m mVar) {
        if (mVar.k(this.f3168a.e(), 0, 1, true)) {
            mVar.f();
            if (this.f3177j == null) {
                this.f3177j = new k();
            }
            c cVar = new c(mVar, this.f3173f);
            this.f3176i = cVar;
            if (this.f3177j.j(cVar)) {
                this.f3177j.c(new d(this.f3173f, (n) p3.a.e(this.f3169b)));
                o();
                return;
            }
        }
        e();
    }

    private void o() {
        g((a.b) p3.a.e(this.f3174g));
        this.f3170c = 5;
    }

    @Override // x1.l
    public void a() {
        k kVar = this.f3177j;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        if (j10 == 0) {
            this.f3170c = 0;
            this.f3177j = null;
        } else if (this.f3170c == 5) {
            ((k) p3.a.e(this.f3177j)).b(j10, j11);
        }
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f3169b = nVar;
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        int i10 = this.f3170c;
        if (i10 == 0) {
            k(mVar);
            return 0;
        } else if (i10 == 1) {
            m(mVar);
            return 0;
        } else if (i10 == 2) {
            l(mVar);
            return 0;
        } else if (i10 == 4) {
            long p10 = mVar.p();
            long j10 = this.f3173f;
            if (p10 != j10) {
                a0Var.f20102a = j10;
                return 1;
            }
            n(mVar);
            return 0;
        } else if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        } else {
            if (this.f3176i == null || mVar != this.f3175h) {
                this.f3175h = mVar;
                this.f3176i = new c(mVar, this.f3173f);
            }
            int i11 = ((k) p3.a.e(this.f3177j)).i(this.f3176i, a0Var);
            if (i11 == 1) {
                a0Var.f20102a += this.f3173f;
            }
            return i11;
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        if (h(mVar) != 65496) {
            return false;
        }
        int h10 = h(mVar);
        this.f3171d = h10;
        if (h10 == 65504) {
            d(mVar);
            this.f3171d = h(mVar);
        }
        if (this.f3171d != 65505) {
            return false;
        }
        mVar.o(2);
        this.f3168a.P(6);
        mVar.n(this.f3168a.e(), 0, 6);
        return this.f3168a.I() == 1165519206 && this.f3168a.M() == 0;
    }
}
