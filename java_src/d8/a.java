package d8;

import g8.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f7929e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f7930f;

    /* renamed from: a  reason: collision with root package name */
    private d f7931a;

    /* renamed from: b  reason: collision with root package name */
    private f8.a f7932b;

    /* renamed from: c  reason: collision with root package name */
    private FlutterJNI.c f7933c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f7934d;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f7935a;

        /* renamed from: b  reason: collision with root package name */
        private f8.a f7936b;

        /* renamed from: c  reason: collision with root package name */
        private FlutterJNI.c f7937c;

        /* renamed from: d  reason: collision with root package name */
        private ExecutorService f7938d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d8.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class ThreadFactoryC0126a implements ThreadFactory {

            /* renamed from: j  reason: collision with root package name */
            private int f7939j;

            private ThreadFactoryC0126a() {
                this.f7939j = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i10 = this.f7939j;
                this.f7939j = i10 + 1;
                sb.append(i10);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f7937c == null) {
                this.f7937c = new FlutterJNI.c();
            }
            if (this.f7938d == null) {
                this.f7938d = Executors.newCachedThreadPool(new ThreadFactoryC0126a());
            }
            if (this.f7935a == null) {
                this.f7935a = new d(this.f7937c.a(), this.f7938d);
            }
        }

        public a a() {
            b();
            return new a(this.f7935a, this.f7936b, this.f7937c, this.f7938d);
        }
    }

    private a(d dVar, f8.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f7931a = dVar;
        this.f7932b = aVar;
        this.f7933c = cVar;
        this.f7934d = executorService;
    }

    public static a e() {
        f7930f = true;
        if (f7929e == null) {
            f7929e = new b().a();
        }
        return f7929e;
    }

    public f8.a a() {
        return this.f7932b;
    }

    public ExecutorService b() {
        return this.f7934d;
    }

    public d c() {
        return this.f7931a;
    }

    public FlutterJNI.c d() {
        return this.f7933c;
    }
}
