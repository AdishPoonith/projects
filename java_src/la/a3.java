package la;

import v9.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a3 implements g.b, g.c<a3> {

    /* renamed from: j  reason: collision with root package name */
    public static final a3 f13580j = new a3();

    private a3() {
    }

    @Override // v9.g
    public <R> R N(R r10, da.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // v9.g.b, v9.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // v9.g
    public v9.g f0(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // v9.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // v9.g
    public v9.g r(v9.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
