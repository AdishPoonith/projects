package s1;
/* loaded from: classes.dex */
public abstract class f implements l3, n3 {

    /* renamed from: j  reason: collision with root package name */
    private final int f17201j;

    /* renamed from: l  reason: collision with root package name */
    private o3 f17203l;

    /* renamed from: m  reason: collision with root package name */
    private int f17204m;

    /* renamed from: n  reason: collision with root package name */
    private t1.t1 f17205n;

    /* renamed from: o  reason: collision with root package name */
    private int f17206o;

    /* renamed from: p  reason: collision with root package name */
    private u2.n0 f17207p;

    /* renamed from: q  reason: collision with root package name */
    private n1[] f17208q;

    /* renamed from: r  reason: collision with root package name */
    private long f17209r;

    /* renamed from: s  reason: collision with root package name */
    private long f17210s;

    /* renamed from: u  reason: collision with root package name */
    private boolean f17212u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f17213v;

    /* renamed from: k  reason: collision with root package name */
    private final o1 f17202k = new o1();

    /* renamed from: t  reason: collision with root package name */
    private long f17211t = Long.MIN_VALUE;

    public f(int i10) {
        this.f17201j = i10;
    }

    private void P(long j10, boolean z10) {
        this.f17212u = false;
        this.f17210s = j10;
        this.f17211t = j10;
        J(j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q A(Throwable th, n1 n1Var, boolean z10, int i10) {
        int i11;
        if (n1Var != null && !this.f17213v) {
            this.f17213v = true;
            try {
                int f10 = m3.f(a(n1Var));
                this.f17213v = false;
                i11 = f10;
            } catch (q unused) {
                this.f17213v = false;
            } catch (Throwable th2) {
                this.f17213v = false;
                throw th2;
            }
            return q.f(th, f(), D(), n1Var, i11, z10, i10);
        }
        i11 = 4;
        return q.f(th, f(), D(), n1Var, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final o3 B() {
        return (o3) p3.a.e(this.f17203l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final o1 C() {
        this.f17202k.a();
        return this.f17202k;
    }

    protected final int D() {
        return this.f17204m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final t1.t1 E() {
        return (t1.t1) p3.a.e(this.f17205n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n1[] F() {
        return (n1[]) p3.a.e(this.f17208q);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean G() {
        return j() ? this.f17212u : ((u2.n0) p3.a.e(this.f17207p)).d();
    }

    protected abstract void H();

    protected void I(boolean z10, boolean z11) {
    }

    protected abstract void J(long j10, boolean z10);

    protected void K() {
    }

    protected void L() {
    }

    protected void M() {
    }

    protected abstract void N(n1[] n1VarArr, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int O(o1 o1Var, v1.g gVar, int i10) {
        int k10 = ((u2.n0) p3.a.e(this.f17207p)).k(o1Var, gVar, i10);
        if (k10 == -4) {
            if (gVar.r()) {
                this.f17211t = Long.MIN_VALUE;
                return this.f17212u ? -4 : -3;
            }
            long j10 = gVar.f19366n + this.f17209r;
            gVar.f19366n = j10;
            this.f17211t = Math.max(this.f17211t, j10);
        } else if (k10 == -5) {
            n1 n1Var = (n1) p3.a.e(o1Var.f17464b);
            if (n1Var.f17423y != Long.MAX_VALUE) {
                o1Var.f17464b = n1Var.b().k0(n1Var.f17423y + this.f17209r).G();
            }
        }
        return k10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int Q(long j10) {
        return ((u2.n0) p3.a.e(this.f17207p)).t(j10 - this.f17209r);
    }

    @Override // s1.l3
    public final void e() {
        p3.a.f(this.f17206o == 1);
        this.f17202k.a();
        this.f17206o = 0;
        this.f17207p = null;
        this.f17208q = null;
        this.f17212u = false;
        H();
    }

    @Override // s1.l3
    public final int getState() {
        return this.f17206o;
    }

    @Override // s1.l3, s1.n3
    public final int h() {
        return this.f17201j;
    }

    @Override // s1.l3
    public final void i(n1[] n1VarArr, u2.n0 n0Var, long j10, long j11) {
        p3.a.f(!this.f17212u);
        this.f17207p = n0Var;
        if (this.f17211t == Long.MIN_VALUE) {
            this.f17211t = j10;
        }
        this.f17208q = n1VarArr;
        this.f17209r = j11;
        N(n1VarArr, j10, j11);
    }

    @Override // s1.l3
    public final boolean j() {
        return this.f17211t == Long.MIN_VALUE;
    }

    public int k() {
        return 0;
    }

    @Override // s1.g3.b
    public void m(int i10, Object obj) {
    }

    @Override // s1.l3
    public final u2.n0 n() {
        return this.f17207p;
    }

    @Override // s1.l3
    public final void o() {
        this.f17212u = true;
    }

    @Override // s1.l3
    public final void p(o3 o3Var, n1[] n1VarArr, u2.n0 n0Var, long j10, boolean z10, boolean z11, long j11, long j12) {
        p3.a.f(this.f17206o == 0);
        this.f17203l = o3Var;
        this.f17206o = 1;
        I(z10, z11);
        i(n1VarArr, n0Var, j11, j12);
        P(j10, z10);
    }

    @Override // s1.l3
    public final void q() {
        ((u2.n0) p3.a.e(this.f17207p)).b();
    }

    @Override // s1.l3
    public final long r() {
        return this.f17211t;
    }

    @Override // s1.l3
    public final void reset() {
        p3.a.f(this.f17206o == 0);
        this.f17202k.a();
        K();
    }

    @Override // s1.l3
    public final void s(long j10) {
        P(j10, false);
    }

    @Override // s1.l3
    public final void start() {
        p3.a.f(this.f17206o == 1);
        this.f17206o = 2;
        L();
    }

    @Override // s1.l3
    public final void stop() {
        p3.a.f(this.f17206o == 2);
        this.f17206o = 1;
        M();
    }

    @Override // s1.l3
    public final boolean t() {
        return this.f17212u;
    }

    @Override // s1.l3
    public final void u(int i10, t1.t1 t1Var) {
        this.f17204m = i10;
        this.f17205n = t1Var;
    }

    @Override // s1.l3
    public p3.t v() {
        return null;
    }

    @Override // s1.l3
    public final n3 w() {
        return this;
    }

    @Override // s1.l3
    public /* synthetic */ void y(float f10, float f11) {
        k3.a(this, f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final q z(Throwable th, n1 n1Var, int i10) {
        return A(th, n1Var, false, i10);
    }
}
