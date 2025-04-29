package la;

import v9.e;
import v9.g;
/* loaded from: classes.dex */
public abstract class g0 extends v9.a implements v9.e {

    /* renamed from: k  reason: collision with root package name */
    public static final a f13620k = new a(null);

    /* loaded from: classes.dex */
    public static final class a extends v9.b<v9.e, g0> {

        /* renamed from: la.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0199a extends kotlin.jvm.internal.m implements da.l<g.b, g0> {

            /* renamed from: j  reason: collision with root package name */
            public static final C0199a f13621j = new C0199a();

            C0199a() {
                super(1);
            }

            @Override // da.l
            /* renamed from: a */
            public final g0 invoke(g.b bVar) {
                if (bVar instanceof g0) {
                    return (g0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(v9.e.f19534h, C0199a.f13621j);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public g0() {
        super(v9.e.f19534h);
    }

    @Override // v9.a, v9.g.b, v9.g
    public <E extends g.b> E b(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // v9.e
    public final void e(v9.d<?> dVar) {
        ((kotlinx.coroutines.internal.f) dVar).s();
    }

    @Override // v9.a, v9.g
    public v9.g f0(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    @Override // v9.e
    public final <T> v9.d<T> g0(v9.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.f(this, dVar);
    }

    public abstract void h0(v9.g gVar, Runnable runnable);

    public boolean i0(v9.g gVar) {
        return true;
    }

    public g0 j0(int i10) {
        kotlinx.coroutines.internal.l.a(i10);
        return new kotlinx.coroutines.internal.k(this, i10);
    }

    public String toString() {
        return o0.a(this) + '@' + o0.b(this);
    }
}
