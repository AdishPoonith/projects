package la;
/* loaded from: classes.dex */
public final class x2 {
    public static final v2 a(long j10, v1 v1Var) {
        return new v2("Timed out waiting for " + j10 + " ms", v1Var);
    }

    private static final <U, T extends U> Object b(w2<U, ? super T> w2Var, da.p<? super k0, ? super v9.d<? super T>, ? extends Object> pVar) {
        z1.g(w2Var, u0.a(w2Var.f12926l.getContext()).c0(w2Var.f13679m, w2Var, w2Var.getContext()));
        return qa.b.c(w2Var, w2Var, pVar);
    }

    public static final <T> Object c(long j10, da.p<? super k0, ? super v9.d<? super T>, ? extends Object> pVar, v9.d<? super T> dVar) {
        Object c10;
        if (j10 > 0) {
            Object b10 = b(new w2(j10, dVar), pVar);
            c10 = w9.d.c();
            if (b10 == c10) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return b10;
        }
        throw new v2("Timed out immediately");
    }
}
