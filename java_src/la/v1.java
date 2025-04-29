package la;

import java.util.concurrent.CancellationException;
import v9.g;
/* loaded from: classes.dex */
public interface v1 extends g.b {

    /* renamed from: g  reason: collision with root package name */
    public static final b f13674g = b.f13675j;

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(v1 v1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            v1Var.T(cancellationException);
        }

        public static <R> R b(v1 v1Var, R r10, da.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(v1Var, r10, pVar);
        }

        public static <E extends g.b> E c(v1 v1Var, g.c<E> cVar) {
            return (E) g.b.a.b(v1Var, cVar);
        }

        public static /* synthetic */ c1 d(v1 v1Var, boolean z10, boolean z11, da.l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return v1Var.v(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static v9.g e(v1 v1Var, g.c<?> cVar) {
            return g.b.a.c(v1Var, cVar);
        }

        public static v9.g f(v1 v1Var, v9.g gVar) {
            return g.b.a.d(v1Var, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<v1> {

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ b f13675j = new b();

        private b() {
        }
    }

    Object H(v9.d<? super s9.u> dVar);

    CancellationException O();

    void T(CancellationException cancellationException);

    r U(t tVar);

    boolean a();

    c1 b0(da.l<? super Throwable, s9.u> lVar);

    boolean start();

    c1 v(boolean z10, boolean z11, da.l<? super Throwable, s9.u> lVar);

    ja.b<v1> w();
}
