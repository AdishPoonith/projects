package v9;

import da.p;
import kotlin.jvm.internal.l;
import v9.g;
/* loaded from: classes.dex */
public abstract class a implements g.b {

    /* renamed from: j  reason: collision with root package name */
    private final g.c<?> f19524j;

    public a(g.c<?> key) {
        l.e(key, "key");
        this.f19524j = key;
    }

    @Override // v9.g
    public <R> R N(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // v9.g.b, v9.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // v9.g
    public g f0(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // v9.g.b
    public g.c<?> getKey() {
        return this.f19524j;
    }

    @Override // v9.g
    public g r(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
