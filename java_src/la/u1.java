package la;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u1 extends b2 {

    /* renamed from: n  reason: collision with root package name */
    private final da.l<Throwable, s9.u> f13672n;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(da.l<? super Throwable, s9.u> lVar) {
        this.f13672n = lVar;
    }

    @Override // la.b0
    public void A(Throwable th) {
        this.f13672n.invoke(th);
    }

    @Override // da.l
    public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
        A(th);
        return s9.u.f17878a;
    }
}
