package s1;
/* loaded from: classes.dex */
final class l implements p3.t {

    /* renamed from: j  reason: collision with root package name */
    private final p3.f0 f17358j;

    /* renamed from: k  reason: collision with root package name */
    private final a f17359k;

    /* renamed from: l  reason: collision with root package name */
    private l3 f17360l;

    /* renamed from: m  reason: collision with root package name */
    private p3.t f17361m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f17362n = true;

    /* renamed from: o  reason: collision with root package name */
    private boolean f17363o;

    /* loaded from: classes.dex */
    public interface a {
        void p(b3 b3Var);
    }

    public l(a aVar, p3.d dVar) {
        this.f17359k = aVar;
        this.f17358j = new p3.f0(dVar);
    }

    private boolean e(boolean z10) {
        l3 l3Var = this.f17360l;
        return l3Var == null || l3Var.b() || (!this.f17360l.d() && (z10 || this.f17360l.j()));
    }

    private void j(boolean z10) {
        if (e(z10)) {
            this.f17362n = true;
            if (this.f17363o) {
                this.f17358j.b();
                return;
            }
            return;
        }
        p3.t tVar = (p3.t) p3.a.e(this.f17361m);
        long x10 = tVar.x();
        if (this.f17362n) {
            if (x10 < this.f17358j.x()) {
                this.f17358j.d();
                return;
            }
            this.f17362n = false;
            if (this.f17363o) {
                this.f17358j.b();
            }
        }
        this.f17358j.a(x10);
        b3 g10 = tVar.g();
        if (g10.equals(this.f17358j.g())) {
            return;
        }
        this.f17358j.c(g10);
        this.f17359k.p(g10);
    }

    public void a(l3 l3Var) {
        if (l3Var == this.f17360l) {
            this.f17361m = null;
            this.f17360l = null;
            this.f17362n = true;
        }
    }

    public void b(l3 l3Var) {
        p3.t tVar;
        p3.t v10 = l3Var.v();
        if (v10 == null || v10 == (tVar = this.f17361m)) {
            return;
        }
        if (tVar != null) {
            throw q.h(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f17361m = v10;
        this.f17360l = l3Var;
        v10.c(this.f17358j.g());
    }

    @Override // p3.t
    public void c(b3 b3Var) {
        p3.t tVar = this.f17361m;
        if (tVar != null) {
            tVar.c(b3Var);
            b3Var = this.f17361m.g();
        }
        this.f17358j.c(b3Var);
    }

    public void d(long j10) {
        this.f17358j.a(j10);
    }

    public void f() {
        this.f17363o = true;
        this.f17358j.b();
    }

    @Override // p3.t
    public b3 g() {
        p3.t tVar = this.f17361m;
        return tVar != null ? tVar.g() : this.f17358j.g();
    }

    public void h() {
        this.f17363o = false;
        this.f17358j.d();
    }

    public long i(boolean z10) {
        j(z10);
        return x();
    }

    @Override // p3.t
    public long x() {
        return this.f17362n ? this.f17358j.x() : ((p3.t) p3.a.e(this.f17361m)).x();
    }
}
