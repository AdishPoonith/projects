package la;

import s9.n;
/* loaded from: classes.dex */
public final class o0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(v9.d<?> dVar) {
        String b10;
        if (dVar instanceof kotlinx.coroutines.internal.f) {
            return dVar.toString();
        }
        try {
            n.a aVar = s9.n.f17870k;
            b10 = s9.n.b(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            n.a aVar2 = s9.n.f17870k;
            b10 = s9.n.b(s9.o.a(th));
        }
        if (s9.n.d(b10) != null) {
            b10 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) b10;
    }
}
