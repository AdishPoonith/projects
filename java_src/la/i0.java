package la;

import java.util.List;
import java.util.ServiceLoader;
import s9.n;
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<h0> f13633a;

    static {
        ja.b c10;
        List<h0> g10;
        c10 = ja.h.c(ServiceLoader.load(h0.class, h0.class.getClassLoader()).iterator());
        g10 = ja.j.g(c10);
        f13633a = g10;
    }

    public static final void a(v9.g gVar, Throwable th) {
        for (h0 h0Var : f13633a) {
            try {
                h0Var.k(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, j0.b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            n.a aVar = s9.n.f17870k;
            s9.b.a(th, new v0(gVar));
            s9.n.b(s9.u.f17878a);
        } catch (Throwable th3) {
            n.a aVar2 = s9.n.f17870k;
            s9.n.b(s9.o.a(th3));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
