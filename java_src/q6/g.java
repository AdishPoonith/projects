package q6;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import q6.g;
/* loaded from: classes.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<d> f16246c = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f16245b = new ArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private final c f16244a = new c();

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final d f16247a;

        /* renamed from: b  reason: collision with root package name */
        private final long f16248b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f16249c;

        /* renamed from: d  reason: collision with root package name */
        private ScheduledFuture f16250d;

        private b(d dVar, long j10, Runnable runnable) {
            this.f16247a = dVar;
            this.f16248b = j10;
            this.f16249c = runnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            g.this.w();
            if (this.f16250d != null) {
                e();
                this.f16249c.run();
            }
        }

        private void e() {
            q6.b.d(this.f16250d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f16250d = null;
            g.this.v(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(long j10) {
            this.f16250d = g.this.f16244a.schedule(new Runnable() { // from class: q6.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.d();
                }
            }, j10, TimeUnit.MILLISECONDS);
        }

        public void c() {
            g.this.w();
            ScheduledFuture scheduledFuture = this.f16250d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements Executor {

        /* renamed from: j  reason: collision with root package name */
        private final ScheduledThreadPoolExecutor f16252j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f16253k;

        /* renamed from: l  reason: collision with root package name */
        private final Thread f16254l;

        /* loaded from: classes.dex */
        class a extends ScheduledThreadPoolExecutor {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ g f16256j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10, ThreadFactory threadFactory, g gVar) {
                super(i10, threadFactory);
                this.f16256j = gVar;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e10) {
                        th = e10.getCause();
                    }
                }
                if (th != null) {
                    g.this.u(th);
                }
            }
        }

        /* loaded from: classes.dex */
        private class b implements Runnable, ThreadFactory {

            /* renamed from: j  reason: collision with root package name */
            private final CountDownLatch f16258j;

            /* renamed from: k  reason: collision with root package name */
            private Runnable f16259k;

            private b() {
                this.f16258j = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                q6.b.d(this.f16259k == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f16259k = runnable;
                this.f16258j.countDown();
                return c.this.f16254l;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f16258j.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f16259k.run();
            }
        }

        c() {
            b bVar = new b();
            Thread newThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f16254l = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: q6.j
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    g.c.this.p(thread, th);
                }
            });
            a aVar = new a(1, bVar, g.this);
            this.f16252j = aVar;
            aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.f16253k = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized Task<Void> j(final Runnable runnable) {
            if (!m()) {
                Task<Void> k10 = k(new Callable() { // from class: q6.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Void n10;
                        n10 = g.c.n(runnable);
                        return n10;
                    }
                });
                this.f16253k = true;
                return k10;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T> Task<T> k(final Callable<T> callable) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new Runnable() { // from class: q6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.c.o(TaskCompletionSource.this, callable);
                    }
                });
            } catch (RejectedExecutionException unused) {
                v.e(g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean m() {
            return this.f16253k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void n(Runnable runnable) {
            runnable.run();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void o(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (Exception e10) {
                taskCompletionSource.setException(e10);
                throw new RuntimeException(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(Thread thread, Throwable th) {
            g.this.u(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            this.f16252j.shutdownNow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f16253k) {
                return null;
            }
            return this.f16252j.schedule(runnable, j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.f16253k) {
                this.f16252j.execute(runnable);
            }
        }

        public void l(Runnable runnable) {
            try {
                this.f16252j.execute(runnable);
            } catch (RejectedExecutionException unused) {
                v.e(g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public static <TResult> Task<TResult> g(final Executor executor, final Callable<Task<TResult>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: q6.e
            @Override // java.lang.Runnable
            public final void run() {
                g.r(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private b h(d dVar, long j10, Runnable runnable) {
        b bVar = new b(dVar, System.currentTimeMillis() + j10, runnable);
        bVar.f(j10);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void q(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: q6.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Void q10;
                    q10 = g.q(TaskCompletionSource.this, task);
                    return q10;
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        } catch (Throwable th) {
            taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void s(Runnable runnable) {
        runnable.run();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (24.6.0).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (24.6.0) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(b bVar) {
        q6.b.d(this.f16245b.remove(bVar), "Delayed task not found.", new Object[0]);
    }

    public Task<Void> i(final Runnable runnable) {
        return j(new Callable() { // from class: q6.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void s10;
                s10 = g.s(runnable);
                return s10;
            }
        });
    }

    public <T> Task<T> j(Callable<T> callable) {
        return this.f16244a.k(callable);
    }

    public b k(d dVar, long j10, Runnable runnable) {
        if (this.f16246c.contains(dVar)) {
            j10 = 0;
        }
        b h10 = h(dVar, j10, runnable);
        this.f16245b.add(h10);
        return h10;
    }

    public void l(Runnable runnable) {
        i(runnable);
    }

    public void m(Runnable runnable) {
        this.f16244a.l(runnable);
    }

    public Task<Void> n(Runnable runnable) {
        return this.f16244a.j(runnable);
    }

    public Executor o() {
        return this.f16244a;
    }

    public boolean p() {
        return this.f16244a.m();
    }

    public void u(final Throwable th) {
        this.f16244a.q();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: q6.d
            @Override // java.lang.Runnable
            public final void run() {
                g.t(th);
            }
        });
    }

    public void w() {
        Thread currentThread = Thread.currentThread();
        if (this.f16244a.f16254l != currentThread) {
            throw q6.b.a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f16244a.f16254l.getName(), Long.valueOf(this.f16244a.f16254l.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        }
    }
}
