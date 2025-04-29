package i9;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class n1 implements Executor {

    /* renamed from: j  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f9988j;

    /* renamed from: k  reason: collision with root package name */
    private final Queue<Runnable> f9989k = new ConcurrentLinkedQueue();

    /* renamed from: l  reason: collision with root package name */
    private final AtomicReference<Thread> f9990l = new AtomicReference<>();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f9991j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Runnable f9992k;

        a(c cVar, Runnable runnable) {
            this.f9991j = cVar;
            this.f9992k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            n1.this.execute(this.f9991j);
        }

        public String toString() {
            return this.f9992k.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ c f9994j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Runnable f9995k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ long f9996l;

        b(c cVar, Runnable runnable, long j10) {
            this.f9994j = cVar;
            this.f9995k = runnable;
            this.f9996l = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            n1.this.execute(this.f9994j);
        }

        public String toString() {
            return this.f9995k.toString() + "(scheduled in SynchronizationContext with delay of " + this.f9996l + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final Runnable f9998j;

        /* renamed from: k  reason: collision with root package name */
        boolean f9999k;

        /* renamed from: l  reason: collision with root package name */
        boolean f10000l;

        c(Runnable runnable) {
            this.f9998j = (Runnable) b5.n.o(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9999k) {
                return;
            }
            this.f10000l = true;
            this.f9998j.run();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final c f10001a;

        /* renamed from: b  reason: collision with root package name */
        private final ScheduledFuture<?> f10002b;

        private d(c cVar, ScheduledFuture<?> scheduledFuture) {
            this.f10001a = (c) b5.n.o(cVar, "runnable");
            this.f10002b = (ScheduledFuture) b5.n.o(scheduledFuture, "future");
        }

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        public void a() {
            this.f10001a.f9999k = true;
            this.f10002b.cancel(false);
        }

        public boolean b() {
            c cVar = this.f10001a;
            return (cVar.f10000l || cVar.f9999k) ? false : true;
        }
    }

    public n1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f9988j = (Thread.UncaughtExceptionHandler) b5.n.o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (this.f9990l.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f9989k.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.f9990l.set(null);
                        if (this.f9989k.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.f9990l.set(null);
                    throw th;
                }
            }
        }
    }

    public final void b(Runnable runnable) {
        this.f9989k.add((Runnable) b5.n.o(runnable, "runnable is null"));
    }

    public final d c(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j10, timeUnit), null);
    }

    public final d d(Runnable runnable, long j10, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j11), j10, j11, timeUnit), null);
    }

    public void e() {
        b5.n.u(Thread.currentThread() == this.f9990l.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
