package d0;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
abstract class c<Params, Progress, Result> {

    /* renamed from: o  reason: collision with root package name */
    private static final ThreadFactory f7571o;

    /* renamed from: p  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f7572p;

    /* renamed from: q  reason: collision with root package name */
    public static final Executor f7573q;

    /* renamed from: r  reason: collision with root package name */
    private static f f7574r;

    /* renamed from: s  reason: collision with root package name */
    private static volatile Executor f7575s;

    /* renamed from: j  reason: collision with root package name */
    private final h<Params, Result> f7576j;

    /* renamed from: k  reason: collision with root package name */
    private final FutureTask<Result> f7577k;

    /* renamed from: l  reason: collision with root package name */
    private volatile g f7578l = g.PENDING;

    /* renamed from: m  reason: collision with root package name */
    final AtomicBoolean f7579m = new AtomicBoolean();

    /* renamed from: n  reason: collision with root package name */
    final AtomicBoolean f7580n = new AtomicBoolean();

    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: j  reason: collision with root package name */
        private final AtomicInteger f7581j = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f7581j.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.f7580n.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b(this.f7591a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: d0.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0113c extends FutureTask<Result> {
        C0113c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.m(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.m(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7584a;

        static {
            int[] iArr = new int[g.values().length];
            f7584a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7584a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        final c f7585a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f7586b;

        e(c cVar, Data... dataArr) {
            this.f7585a = cVar;
            this.f7586b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f7585a.d(eVar.f7586b[0]);
            } else if (i10 != 2) {
            } else {
                eVar.f7585a.k(eVar.f7586b);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        Params[] f7591a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f7571o = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f7572p = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f7573q = threadPoolExecutor;
        f7575s = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        b bVar = new b();
        this.f7576j = bVar;
        this.f7577k = new C0113c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (c.class) {
            if (f7574r == null) {
                f7574r = new f();
            }
            fVar = f7574r;
        }
        return fVar;
    }

    public final boolean a(boolean z10) {
        this.f7579m.set(true);
        return this.f7577k.cancel(z10);
    }

    protected abstract Result b(Params... paramsArr);

    public final c<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f7578l == g.PENDING) {
            this.f7578l = g.RUNNING;
            j();
            this.f7576j.f7591a = paramsArr;
            executor.execute(this.f7577k);
            return this;
        }
        int i10 = d.f7584a[this.f7578l.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("We should never reach this state");
            }
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("Cannot execute task: the task is already running.");
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f7578l = g.FINISHED;
    }

    public final boolean f() {
        return this.f7579m.get();
    }

    protected void g() {
    }

    protected void h(Result result) {
        g();
    }

    protected void i(Result result) {
    }

    protected void j() {
    }

    protected void k(Progress... progressArr) {
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (this.f7580n.get()) {
            return;
        }
        l(result);
    }
}
