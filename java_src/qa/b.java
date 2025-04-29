package qa;

import da.p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.z;
import la.d2;
import la.v2;
import s9.n;
import s9.o;
import v9.d;
import v9.g;
/* loaded from: classes.dex */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        Object a10;
        Object c10;
        d a11 = h.a(dVar);
        try {
            g context = dVar.getContext();
            Object c11 = f0.c(context, null);
            a10 = ((p) w.b(pVar, 2)).invoke(r10, a11);
            f0.a(context, c11);
            c10 = w9.d.c();
        } catch (Throwable th) {
            n.a aVar = n.f17870k;
            a10 = o.a(th);
        }
        if (a10 != c10) {
            n.a aVar2 = n.f17870k;
            a11.resumeWith(n.b(a10));
        }
    }

    public static final <T, R> Object b(z<? super T> zVar, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object zVar2;
        Object c10;
        Object s02;
        Object c11;
        try {
            zVar2 = ((p) w.b(pVar, 2)).invoke(r10, zVar);
        } catch (Throwable th) {
            zVar2 = new la.z(th, false, 2, null);
        }
        c10 = w9.d.c();
        if (zVar2 == c10 || (s02 = zVar.s0(zVar2)) == d2.f13602b) {
            c11 = w9.d.c();
            return c11;
        } else if (s02 instanceof la.z) {
            throw ((la.z) s02).f13689a;
        } else {
            return d2.h(s02);
        }
    }

    public static final <T, R> Object c(z<? super T> zVar, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object zVar2;
        Object c10;
        Object s02;
        Object c11;
        boolean z10 = false;
        try {
            zVar2 = ((p) w.b(pVar, 2)).invoke(r10, zVar);
        } catch (Throwable th) {
            zVar2 = new la.z(th, false, 2, null);
        }
        c10 = w9.d.c();
        if (zVar2 == c10 || (s02 = zVar.s0(zVar2)) == d2.f13602b) {
            c11 = w9.d.c();
            return c11;
        }
        if (s02 instanceof la.z) {
            Throwable th2 = ((la.z) s02).f13689a;
            if (((th2 instanceof v2) && ((v2) th2).f13676j == zVar) ? true : true) {
                throw th2;
            }
            if (zVar2 instanceof la.z) {
                throw ((la.z) zVar2).f13689a;
            }
        } else {
            zVar2 = d2.h(s02);
        }
        return zVar2;
    }
}
