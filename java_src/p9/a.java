package p9;

import i9.d;
import p9.a;
import p9.b;
import p9.c;
/* loaded from: classes.dex */
public abstract class a<S extends a<S>> extends b<S> {
    /* JADX INFO: Access modifiers changed from: protected */
    public a(d dVar, i9.c cVar) {
        super(dVar, cVar);
    }

    public static <T extends b<T>> T e(b.a<T> aVar, d dVar) {
        return (T) f(aVar, dVar, i9.c.f9834k);
    }

    public static <T extends b<T>> T f(b.a<T> aVar, d dVar, i9.c cVar) {
        return aVar.a(dVar, cVar.q(c.f15836c, c.a.ASYNC));
    }
}
