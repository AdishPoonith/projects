package qa;

import da.l;
import da.p;
import kotlinx.coroutines.internal.g;
import s9.n;
import s9.o;
import s9.u;
import v9.d;
import w9.c;
/* loaded from: classes.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        n.a aVar = n.f17870k;
        dVar.resumeWith(n.b(o.a(th)));
        throw th;
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar, l<? super Throwable, u> lVar) {
        d a10;
        d b10;
        try {
            a10 = c.a(pVar, r10, dVar);
            b10 = c.b(a10);
            n.a aVar = n.f17870k;
            g.b(b10, n.b(u.f17878a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final void c(d<? super u> dVar, d<?> dVar2) {
        d b10;
        try {
            b10 = c.b(dVar);
            n.a aVar = n.f17870k;
            g.c(b10, n.b(u.f17878a), null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        b(pVar, obj, dVar, lVar);
    }
}
