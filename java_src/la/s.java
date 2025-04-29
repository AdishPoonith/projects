package la;
/* loaded from: classes.dex */
public final class s extends x1 implements r {

    /* renamed from: n  reason: collision with root package name */
    public final t f13663n;

    public s(t tVar) {
        this.f13663n = tVar;
    }

    @Override // la.b0
    public void A(Throwable th) {
        this.f13663n.q(B());
    }

    @Override // la.r
    public v1 getParent() {
        return B();
    }

    @Override // da.l
    public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
        A(th);
        return s9.u.f17878a;
    }

    @Override // la.r
    public boolean k(Throwable th) {
        return B().P(th);
    }
}
