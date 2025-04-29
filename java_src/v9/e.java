package v9;

import kotlin.jvm.internal.l;
import v9.g;
/* loaded from: classes.dex */
public interface e extends g.b {

    /* renamed from: h  reason: collision with root package name */
    public static final b f19534h = b.f19535j;

    /* loaded from: classes.dex */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> key) {
            l.e(key, "key");
            if (!(key instanceof v9.b)) {
                if (e.f19534h == key) {
                    l.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                    return eVar;
                }
                return null;
            }
            v9.b bVar = (v9.b) key;
            if (bVar.a(eVar.getKey())) {
                E e10 = (E) bVar.b(eVar);
                if (e10 instanceof g.b) {
                    return e10;
                }
                return null;
            }
            return null;
        }

        public static g b(e eVar, g.c<?> key) {
            l.e(key, "key");
            if (!(key instanceof v9.b)) {
                return e.f19534h == key ? h.f19537j : eVar;
            }
            v9.b bVar = (v9.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f19537j;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<e> {

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ b f19535j = new b();

        private b() {
        }
    }

    void e(d<?> dVar);

    <T> d<T> g0(d<? super T> dVar);
}
