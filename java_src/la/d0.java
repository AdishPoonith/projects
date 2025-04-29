package la;

import s9.n;
/* loaded from: classes.dex */
public final class d0 {
    public static final <T> Object a(Object obj, v9.d<? super T> dVar) {
        if (obj instanceof z) {
            n.a aVar = s9.n.f17870k;
            obj = s9.o.a(((z) obj).f13689a);
        } else {
            n.a aVar2 = s9.n.f17870k;
        }
        return s9.n.b(obj);
    }

    public static final <T> Object b(Object obj, da.l<? super Throwable, s9.u> lVar) {
        Throwable d10 = s9.n.d(obj);
        return d10 == null ? lVar != null ? new a0(obj, lVar) : obj : new z(d10, false, 2, null);
    }

    public static final <T> Object c(Object obj, l<?> lVar) {
        Throwable d10 = s9.n.d(obj);
        return d10 == null ? obj : new z(d10, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, da.l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
