package w6;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static m f20000a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static BlockingQueue<Runnable> f20001b = new LinkedBlockingQueue();

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadPoolExecutor f20002c;

    /* renamed from: d  reason: collision with root package name */
    private static BlockingQueue<Runnable> f20003d;

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadPoolExecutor f20004e;

    /* renamed from: f  reason: collision with root package name */
    private static BlockingQueue<Runnable> f20005f;

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadPoolExecutor f20006g;

    /* renamed from: h  reason: collision with root package name */
    private static BlockingQueue<Runnable> f20007h;

    /* renamed from: i  reason: collision with root package name */
    private static final ThreadPoolExecutor f20008i;

    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: j  reason: collision with root package name */
        private final AtomicInteger f20009j = new AtomicInteger(1);

        /* renamed from: k  reason: collision with root package name */
        private final String f20010k;

        a(String str) {
            this.f20010k = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "FirebaseStorage-" + this.f20010k + this.f20009j.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, timeUnit, f20001b, new a("Command-"));
        f20002c = threadPoolExecutor;
        f20003d = new LinkedBlockingQueue();
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 2, 5L, timeUnit, f20003d, new a("Upload-"));
        f20004e = threadPoolExecutor2;
        f20005f = new LinkedBlockingQueue();
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 3, 5L, timeUnit, f20005f, new a("Download-"));
        f20006g = threadPoolExecutor3;
        f20007h = new LinkedBlockingQueue();
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 5L, timeUnit, f20007h, new a("Callbacks-"));
        f20008i = threadPoolExecutor4;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
    }

    public static m b() {
        return f20000a;
    }

    public Executor a() {
        return f20002c;
    }

    public void c(Runnable runnable) {
        f20008i.execute(runnable);
    }

    public void d(Runnable runnable) {
        f20002c.execute(runnable);
    }

    public void e(Runnable runnable) {
        f20006g.execute(runnable);
    }

    public void f(Runnable runnable) {
        f20004e.execute(runnable);
    }
}
