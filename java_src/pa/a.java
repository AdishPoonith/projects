package pa;

import da.p;
import v9.g;
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: j  reason: collision with root package name */
    public final Throwable f15841j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ g f15842k;

    public a(Throwable th, g gVar) {
        this.f15841j = th;
        this.f15842k = gVar;
    }

    @Override // v9.g
    public <R> R N(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) this.f15842k.N(r10, pVar);
    }

    @Override // v9.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) this.f15842k.b(cVar);
    }

    @Override // v9.g
    public g f0(g.c<?> cVar) {
        return this.f15842k.f0(cVar);
    }

    @Override // v9.g
    public g r(g gVar) {
        return this.f15842k.r(gVar);
    }
}
