package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import la.g2;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f12916a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f12917b;

    /* renamed from: c  reason: collision with root package name */
    public static final g2 f12918c;

    static {
        s sVar = new s();
        f12916a = sVar;
        f12917b = c0.e("kotlinx.coroutines.fast.service.loader", true);
        f12918c = sVar.a();
    }

    private s() {
    }

    private final g2 a() {
        ja.b c10;
        List<r> g10;
        Object next;
        g2 e10;
        try {
            if (f12917b) {
                g10 = h.f12888a.c();
            } else {
                c10 = ja.h.c(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator());
                g10 = ja.j.g(c10);
            }
            Iterator<T> it = g10.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c11 = ((r) next).c();
                    do {
                        Object next2 = it.next();
                        int c12 = ((r) next2).c();
                        if (c11 < c12) {
                            next = next2;
                            c11 = c12;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            return (rVar == null || (e10 = t.e(rVar, g10)) == null) ? t.b(null, null, 3, null) : e10;
        } catch (Throwable th) {
            return t.b(th, null, 2, null);
        }
    }
}
