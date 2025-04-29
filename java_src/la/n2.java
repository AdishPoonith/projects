package la;

import s9.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n2 extends b2 {

    /* renamed from: n  reason: collision with root package name */
    private final v9.d<s9.u> f13654n;

    /* JADX WARN: Multi-variable type inference failed */
    public n2(v9.d<? super s9.u> dVar) {
        this.f13654n = dVar;
    }

    @Override // la.b0
    public void A(Throwable th) {
        v9.d<s9.u> dVar = this.f13654n;
        n.a aVar = s9.n.f17870k;
        dVar.resumeWith(s9.n.b(s9.u.f17878a));
    }

    @Override // da.l
    public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
        A(th);
        return s9.u.f17878a;
    }
}
