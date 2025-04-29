package la;

import s9.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m2<T> extends b2 {

    /* renamed from: n  reason: collision with root package name */
    private final m<T> f13651n;

    /* JADX WARN: Multi-variable type inference failed */
    public m2(m<? super T> mVar) {
        this.f13651n = mVar;
    }

    @Override // la.b0
    public void A(Throwable th) {
        m<T> mVar;
        Object h10;
        Object i02 = B().i0();
        if (i02 instanceof z) {
            mVar = this.f13651n;
            n.a aVar = s9.n.f17870k;
            h10 = s9.o.a(((z) i02).f13689a);
        } else {
            mVar = this.f13651n;
            n.a aVar2 = s9.n.f17870k;
            h10 = d2.h(i02);
        }
        mVar.resumeWith(s9.n.b(h10));
    }

    @Override // da.l
    public /* bridge */ /* synthetic */ s9.u invoke(Throwable th) {
        A(th);
        return s9.u.f17878a;
    }
}
