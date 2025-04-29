package la;
/* loaded from: classes.dex */
public abstract class a<T> extends c2 implements v9.d<T>, k0 {

    /* renamed from: k  reason: collision with root package name */
    private final v9.g f13573k;

    public a(v9.g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            l0((v1) gVar.b(v1.f13674g));
        }
        this.f13573k = gVar.r(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // la.c2
    public String M() {
        return o0.a(this) + " was cancelled";
    }

    protected void P0(Object obj) {
        B(obj);
    }

    protected void Q0(Throwable th, boolean z10) {
    }

    protected void R0(T t10) {
    }

    public final <R> void S0(m0 m0Var, R r10, da.p<? super R, ? super v9.d<? super T>, ? extends Object> pVar) {
        m0Var.g(pVar, r10, this);
    }

    @Override // la.c2, la.v1
    public boolean a() {
        return super.a();
    }

    @Override // v9.d
    public final v9.g getContext() {
        return this.f13573k;
    }

    @Override // la.c2
    public final void k0(Throwable th) {
        j0.a(this.f13573k, th);
    }

    @Override // la.k0
    public v9.g n() {
        return this.f13573k;
    }

    @Override // v9.d
    public final void resumeWith(Object obj) {
        Object s02 = s0(d0.d(obj, null, 1, null));
        if (s02 == d2.f13602b) {
            return;
        }
        P0(s02);
    }

    @Override // la.c2
    public String u0() {
        String b10 = f0.b(this.f13573k);
        if (b10 == null) {
            return super.u0();
        }
        return '\"' + b10 + "\":" + super.u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // la.c2
    protected final void z0(Object obj) {
        if (!(obj instanceof z)) {
            R0(obj);
            return;
        }
        z zVar = (z) obj;
        Q0(zVar.f13689a, zVar.a());
    }
}
