package la;
/* loaded from: classes.dex */
final class s1 extends j {

    /* renamed from: j  reason: collision with root package name */
    private final da.l<Throwable, s9.u> f13664j;

    /* JADX WARN: Multi-variable type inference failed */
    public s1(da.l<? super Throwable, s9.u> lVar) {
        this.f13664j = lVar;
    }

    @Override // la.k
    public void a(Throwable th) {
        this.f13664j.invoke(th);
    }

    @Override // da.l
    public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
        a(th);
        return s9.u.f17878a;
    }

    public String toString() {
        return "InvokeOnCancel[" + o0.a(this.f13664j) + '@' + o0.b(this) + ']';
    }
}
