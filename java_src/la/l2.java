package la;
/* loaded from: classes.dex */
final class l2 extends f {

    /* renamed from: j  reason: collision with root package name */
    private final kotlinx.coroutines.internal.o f13637j;

    public l2(kotlinx.coroutines.internal.o oVar) {
        this.f13637j = oVar;
    }

    @Override // la.k
    public void a(Throwable th) {
        this.f13637j.v();
    }

    @Override // da.l
    public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
        a(th);
        return s9.u.f17878a;
    }

    public String toString() {
        return "RemoveOnCancel[" + this.f13637j + ']';
    }
}
