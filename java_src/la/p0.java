package la;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import la.h1;
/* loaded from: classes.dex */
public final class p0 extends h1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: q  reason: collision with root package name */
    public static final p0 f13656q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f13657r;

    static {
        Long l10;
        p0 p0Var = new p0();
        f13656q = p0Var;
        g1.p0(p0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f13657r = timeUnit.toNanos(l10.longValue());
    }

    private p0() {
    }

    private final synchronized void L0() {
        if (O0()) {
            debugStatus = 3;
            F0();
            notifyAll();
        }
    }

    private final synchronized Thread M0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean N0() {
        return debugStatus == 4;
    }

    private final boolean O0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean P0() {
        if (O0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final void Q0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // la.h1, la.t0
    public c1 c0(long j10, Runnable runnable, v9.g gVar) {
        return I0(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean C0;
        s2.f13665a.c(this);
        c.a();
        try {
            if (!P0()) {
                if (C0) {
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long D0 = D0();
                if (D0 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f13657r + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        L0();
                        c.a();
                        if (C0()) {
                            return;
                        }
                        t0();
                        return;
                    }
                    D0 = ha.i.d(D0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (D0 > 0) {
                    if (O0()) {
                        _thread = null;
                        L0();
                        c.a();
                        if (C0()) {
                            return;
                        }
                        t0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, D0);
                }
            }
        } finally {
            _thread = null;
            L0();
            c.a();
            if (!C0()) {
                t0();
            }
        }
    }

    @Override // la.h1, la.g1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // la.i1
    protected Thread t0() {
        Thread thread = _thread;
        return thread == null ? M0() : thread;
    }

    @Override // la.i1
    protected void u0(long j10, h1.b bVar) {
        Q0();
    }

    @Override // la.h1
    public void z0(Runnable runnable) {
        if (N0()) {
            Q0();
        }
        super.z0(runnable);
    }
}
