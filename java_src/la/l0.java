package la;
/* loaded from: classes.dex */
public final class l0 {
    public static final k0 a(v9.g gVar) {
        if (gVar.b(v1.f13674g) == null) {
            gVar = gVar.r(z1.b(null, 1, null));
        }
        return new kotlinx.coroutines.internal.e(gVar);
    }

    public static final k0 b() {
        return new kotlinx.coroutines.internal.e(q2.b(null, 1, null).r(a1.c()));
    }

    public static final <R> Object c(da.p<? super k0, ? super v9.d<? super R>, ? extends Object> pVar, v9.d<? super R> dVar) {
        Object c10;
        kotlinx.coroutines.internal.z zVar = new kotlinx.coroutines.internal.z(dVar.getContext(), dVar);
        Object b10 = qa.b.b(zVar, zVar, pVar);
        c10 = w9.d.c();
        if (b10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b10;
    }

    public static final boolean d(k0 k0Var) {
        v1 v1Var = (v1) k0Var.n().b(v1.f13674g);
        if (v1Var != null) {
            return v1Var.a();
        }
        return true;
    }
}
