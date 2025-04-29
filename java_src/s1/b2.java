package s1;

import u2.u;
/* loaded from: classes.dex */
final class b2 {

    /* renamed from: a  reason: collision with root package name */
    public final u2.r f17089a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17090b;

    /* renamed from: c  reason: collision with root package name */
    public final u2.n0[] f17091c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17092d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17093e;

    /* renamed from: f  reason: collision with root package name */
    public c2 f17094f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17095g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f17096h;

    /* renamed from: i  reason: collision with root package name */
    private final n3[] f17097i;

    /* renamed from: j  reason: collision with root package name */
    private final n3.c0 f17098j;

    /* renamed from: k  reason: collision with root package name */
    private final t2 f17099k;

    /* renamed from: l  reason: collision with root package name */
    private b2 f17100l;

    /* renamed from: m  reason: collision with root package name */
    private u2.v0 f17101m;

    /* renamed from: n  reason: collision with root package name */
    private n3.d0 f17102n;

    /* renamed from: o  reason: collision with root package name */
    private long f17103o;

    public b2(n3[] n3VarArr, long j10, n3.c0 c0Var, o3.b bVar, t2 t2Var, c2 c2Var, n3.d0 d0Var) {
        this.f17097i = n3VarArr;
        this.f17103o = j10;
        this.f17098j = c0Var;
        this.f17099k = t2Var;
        u.b bVar2 = c2Var.f17116a;
        this.f17090b = bVar2.f18969a;
        this.f17094f = c2Var;
        this.f17101m = u2.v0.f18988m;
        this.f17102n = d0Var;
        this.f17091c = new u2.n0[n3VarArr.length];
        this.f17096h = new boolean[n3VarArr.length];
        this.f17089a = e(bVar2, t2Var, bVar, c2Var.f17117b, c2Var.f17119d);
    }

    private void c(u2.n0[] n0VarArr) {
        int i10 = 0;
        while (true) {
            n3[] n3VarArr = this.f17097i;
            if (i10 >= n3VarArr.length) {
                return;
            }
            if (n3VarArr[i10].h() == -2 && this.f17102n.c(i10)) {
                n0VarArr[i10] = new u2.k();
            }
            i10++;
        }
    }

    private static u2.r e(u.b bVar, t2 t2Var, o3.b bVar2, long j10, long j11) {
        u2.r h10 = t2Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new u2.d(h10, true, 0L, j11) : h10;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            n3.d0 d0Var = this.f17102n;
            if (i10 >= d0Var.f14154a) {
                return;
            }
            boolean c10 = d0Var.c(i10);
            n3.t tVar = this.f17102n.f14156c[i10];
            if (c10 && tVar != null) {
                tVar.e();
            }
            i10++;
        }
    }

    private void g(u2.n0[] n0VarArr) {
        int i10 = 0;
        while (true) {
            n3[] n3VarArr = this.f17097i;
            if (i10 >= n3VarArr.length) {
                return;
            }
            if (n3VarArr[i10].h() == -2) {
                n0VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            n3.d0 d0Var = this.f17102n;
            if (i10 >= d0Var.f14154a) {
                return;
            }
            boolean c10 = d0Var.c(i10);
            n3.t tVar = this.f17102n.f14156c[i10];
            if (c10 && tVar != null) {
                tVar.i();
            }
            i10++;
        }
    }

    private boolean r() {
        return this.f17100l == null;
    }

    private static void u(t2 t2Var, u2.r rVar) {
        try {
            if (rVar instanceof u2.d) {
                rVar = ((u2.d) rVar).f18773j;
            }
            t2Var.z(rVar);
        } catch (RuntimeException e10) {
            p3.r.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        u2.r rVar = this.f17089a;
        if (rVar instanceof u2.d) {
            long j10 = this.f17094f.f17119d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((u2.d) rVar).v(0L, j10);
        }
    }

    public long a(n3.d0 d0Var, long j10, boolean z10) {
        return b(d0Var, j10, z10, new boolean[this.f17097i.length]);
    }

    public long b(n3.d0 d0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= d0Var.f14154a) {
                break;
            }
            boolean[] zArr2 = this.f17096h;
            if (z10 || !d0Var.b(this.f17102n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f17091c);
        f();
        this.f17102n = d0Var;
        h();
        long m10 = this.f17089a.m(d0Var.f14156c, this.f17096h, this.f17091c, zArr, j10);
        c(this.f17091c);
        this.f17093e = false;
        int i11 = 0;
        while (true) {
            u2.n0[] n0VarArr = this.f17091c;
            if (i11 >= n0VarArr.length) {
                return m10;
            }
            if (n0VarArr[i11] != null) {
                p3.a.f(d0Var.c(i11));
                if (this.f17097i[i11].h() != -2) {
                    this.f17093e = true;
                }
            } else {
                p3.a.f(d0Var.f14156c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        p3.a.f(r());
        this.f17089a.g(y(j10));
    }

    public long i() {
        if (this.f17092d) {
            long f10 = this.f17093e ? this.f17089a.f() : Long.MIN_VALUE;
            return f10 == Long.MIN_VALUE ? this.f17094f.f17120e : f10;
        }
        return this.f17094f.f17117b;
    }

    public b2 j() {
        return this.f17100l;
    }

    public long k() {
        if (this.f17092d) {
            return this.f17089a.c();
        }
        return 0L;
    }

    public long l() {
        return this.f17103o;
    }

    public long m() {
        return this.f17094f.f17117b + this.f17103o;
    }

    public u2.v0 n() {
        return this.f17101m;
    }

    public n3.d0 o() {
        return this.f17102n;
    }

    public void p(float f10, y3 y3Var) {
        this.f17092d = true;
        this.f17101m = this.f17089a.p();
        n3.d0 v10 = v(f10, y3Var);
        c2 c2Var = this.f17094f;
        long j10 = c2Var.f17117b;
        long j11 = c2Var.f17120e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f17103o;
        c2 c2Var2 = this.f17094f;
        this.f17103o = j12 + (c2Var2.f17117b - a10);
        this.f17094f = c2Var2.b(a10);
    }

    public boolean q() {
        return this.f17092d && (!this.f17093e || this.f17089a.f() == Long.MIN_VALUE);
    }

    public void s(long j10) {
        p3.a.f(r());
        if (this.f17092d) {
            this.f17089a.h(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f17099k, this.f17089a);
    }

    public n3.d0 v(float f10, y3 y3Var) {
        n3.t[] tVarArr;
        n3.d0 g10 = this.f17098j.g(this.f17097i, n(), this.f17094f.f17116a, y3Var);
        for (n3.t tVar : g10.f14156c) {
            if (tVar != null) {
                tVar.q(f10);
            }
        }
        return g10;
    }

    public void w(b2 b2Var) {
        if (b2Var == this.f17100l) {
            return;
        }
        f();
        this.f17100l = b2Var;
        h();
    }

    public void x(long j10) {
        this.f17103o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
