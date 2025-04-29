package la;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class n1 extends m1 implements t0 {

    /* renamed from: m  reason: collision with root package name */
    private final Executor f13653m;

    public n1(Executor executor) {
        this.f13653m = executor;
        kotlinx.coroutines.internal.d.a(l0());
    }

    private final void k0(v9.g gVar, RejectedExecutionException rejectedExecutionException) {
        z1.c(gVar, l1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> m0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, v9.g gVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            k0(gVar, e10);
            return null;
        }
    }

    @Override // la.t0
    public c1 c0(long j10, Runnable runnable, v9.g gVar) {
        Executor l02 = l0();
        ScheduledExecutorService scheduledExecutorService = l02 instanceof ScheduledExecutorService ? (ScheduledExecutorService) l02 : null;
        ScheduledFuture<?> m02 = scheduledExecutorService != null ? m0(scheduledExecutorService, runnable, gVar, j10) : null;
        return m02 != null ? new b1(m02) : p0.f13656q.c0(j10, runnable, gVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor l02 = l0();
        ExecutorService executorService = l02 instanceof ExecutorService ? (ExecutorService) l02 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof n1) && ((n1) obj).l0() == l0();
    }

    @Override // la.g0
    public void h0(v9.g gVar, Runnable runnable) {
        try {
            Executor l02 = l0();
            c.a();
            l02.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            k0(gVar, e10);
            a1.b().h0(gVar, runnable);
        }
    }

    public int hashCode() {
        return System.identityHashCode(l0());
    }

    public Executor l0() {
        return this.f13653m;
    }

    @Override // la.g0
    public String toString() {
        return l0().toString();
    }
}
