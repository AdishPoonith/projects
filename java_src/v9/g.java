package v9;

import da.p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import v9.e;
/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: v9.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0279a extends m implements p<g, b, g> {

            /* renamed from: j  reason: collision with root package name */
            public static final C0279a f19536j = new C0279a();

            C0279a() {
                super(2);
            }

            @Override // da.p
            /* renamed from: a */
            public final g invoke(g acc, b element) {
                v9.c cVar;
                l.e(acc, "acc");
                l.e(element, "element");
                g f02 = acc.f0(element.getKey());
                h hVar = h.f19537j;
                if (f02 == hVar) {
                    return element;
                }
                e.b bVar = e.f19534h;
                e eVar = (e) f02.b(bVar);
                if (eVar == null) {
                    cVar = new v9.c(f02, element);
                } else {
                    g f03 = f02.f0(bVar);
                    if (f03 == hVar) {
                        return new v9.c(element, eVar);
                    }
                    cVar = new v9.c(new v9.c(f03, element), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g context) {
            l.e(context, "context");
            return context == h.f19537j ? gVar : (g) context.N(gVar, C0279a.f19536j);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends g {

        /* loaded from: classes.dex */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> operation) {
                l.e(operation, "operation");
                return operation.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> key) {
                l.e(key, "key");
                if (l.a(bVar.getKey(), key)) {
                    l.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> key) {
                l.e(key, "key");
                return l.a(bVar.getKey(), key) ? h.f19537j : bVar;
            }

            public static g d(b bVar, g context) {
                l.e(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // v9.g
        <E extends b> E b(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes.dex */
    public interface c<E extends b> {
    }

    <R> R N(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E b(c<E> cVar);

    g f0(c<?> cVar);

    g r(g gVar);
}
