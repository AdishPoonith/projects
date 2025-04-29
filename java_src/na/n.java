package na;

import kotlinx.coroutines.internal.b0;
import s9.u;
/* loaded from: classes.dex */
public class n<E> extends a<E> {
    public n(da.l<? super E, u> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // na.c
    public Object i(E e10) {
        q<?> k10;
        do {
            Object i10 = super.i(e10);
            b0 b0Var = b.f14355b;
            if (i10 == b0Var) {
                return b0Var;
            }
            if (i10 != b.f14356c) {
                if (i10 instanceof j) {
                    return i10;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + i10).toString());
            }
            k10 = k(e10);
            if (k10 == null) {
                return b0Var;
            }
        } while (!(k10 instanceof j));
        return k10;
    }

    @Override // na.a
    protected final boolean r() {
        return true;
    }

    @Override // na.a
    protected final boolean s() {
        return true;
    }
}
