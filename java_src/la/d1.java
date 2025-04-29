package la;
/* loaded from: classes.dex */
final class d1 extends j {

    /* renamed from: j  reason: collision with root package name */
    private final c1 f13600j;

    public d1(c1 c1Var) {
        this.f13600j = c1Var;
    }

    @Override // la.k
    public void a(Throwable th) {
        this.f13600j.b();
    }

    @Override // da.l
    public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
        a(th);
        return s9.u.f17878a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f13600j + ']';
    }
}
