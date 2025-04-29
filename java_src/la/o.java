package la;
/* loaded from: classes.dex */
public final class o {
    public static final void a(l<?> lVar, c1 c1Var) {
        lVar.j(new d1(c1Var));
    }

    public static final <T> m<T> b(v9.d<? super T> dVar) {
        if (dVar instanceof kotlinx.coroutines.internal.f) {
            m<T> m10 = ((kotlinx.coroutines.internal.f) dVar).m();
            if (m10 != null) {
                if (!m10.I()) {
                    m10 = null;
                }
                if (m10 != null) {
                    return m10;
                }
            }
            return new m<>(dVar, 2);
        }
        return new m<>(dVar, 1);
    }

    public static final void c(l<?> lVar, kotlinx.coroutines.internal.o oVar) {
        lVar.j(new l2(oVar));
    }
}
