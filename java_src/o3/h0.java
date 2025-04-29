package o3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class h0 implements i0 {

    /* renamed from: d  reason: collision with root package name */
    public static final c f14450d = h(false, -9223372036854775807L);

    /* renamed from: e  reason: collision with root package name */
    public static final c f14451e = h(true, -9223372036854775807L);

    /* renamed from: f  reason: collision with root package name */
    public static final c f14452f = new c(2, -9223372036854775807L);

    /* renamed from: g  reason: collision with root package name */
    public static final c f14453g = new c(3, -9223372036854775807L);

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f14454a;

    /* renamed from: b  reason: collision with root package name */
    private d<? extends e> f14455b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f14456c;

    /* loaded from: classes.dex */
    public interface b<T extends e> {
        void i(T t10, long j10, long j11, boolean z10);

        void o(T t10, long j10, long j11);

        c u(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f14457a;

        /* renamed from: b  reason: collision with root package name */
        private final long f14458b;

        private c(int i10, long j10) {
            this.f14457a = i10;
            this.f14458b = j10;
        }

        public boolean c() {
            int i10 = this.f14457a;
            return i10 == 0 || i10 == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        public final int f14459j;

        /* renamed from: k  reason: collision with root package name */
        private final T f14460k;

        /* renamed from: l  reason: collision with root package name */
        private final long f14461l;

        /* renamed from: m  reason: collision with root package name */
        private b<T> f14462m;

        /* renamed from: n  reason: collision with root package name */
        private IOException f14463n;

        /* renamed from: o  reason: collision with root package name */
        private int f14464o;

        /* renamed from: p  reason: collision with root package name */
        private Thread f14465p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f14466q;

        /* renamed from: r  reason: collision with root package name */
        private volatile boolean f14467r;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f14460k = t10;
            this.f14462m = bVar;
            this.f14459j = i10;
            this.f14461l = j10;
        }

        private void b() {
            this.f14463n = null;
            h0.this.f14454a.execute((Runnable) p3.a.e(h0.this.f14455b));
        }

        private void c() {
            h0.this.f14455b = null;
        }

        private long d() {
            return Math.min((this.f14464o - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f14467r = z10;
            this.f14463n = null;
            if (hasMessages(0)) {
                this.f14466q = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f14466q = true;
                    this.f14460k.c();
                    Thread thread = this.f14465p;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) p3.a.e(this.f14462m)).i(this.f14460k, elapsedRealtime, elapsedRealtime - this.f14461l, true);
                this.f14462m = null;
            }
        }

        public void e(int i10) {
            IOException iOException = this.f14463n;
            if (iOException != null && this.f14464o > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            p3.a.f(h0.this.f14455b == null);
            h0.this.f14455b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f14467r) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
            } else if (i10 == 3) {
                throw ((Error) message.obj);
            } else {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f14461l;
                b bVar = (b) p3.a.e(this.f14462m);
                if (this.f14466q) {
                    bVar.i(this.f14460k, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        bVar.o(this.f14460k, elapsedRealtime, j10);
                    } catch (RuntimeException e10) {
                        p3.r.d("LoadTask", "Unexpected exception handling load completed", e10);
                        h0.this.f14456c = new h(e10);
                    }
                } else if (i11 != 2) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.f14463n = iOException;
                    int i12 = this.f14464o + 1;
                    this.f14464o = i12;
                    c u10 = bVar.u(this.f14460k, elapsedRealtime, j10, iOException, i12);
                    if (u10.f14457a == 3) {
                        h0.this.f14456c = this.f14463n;
                    } else if (u10.f14457a != 2) {
                        if (u10.f14457a == 1) {
                            this.f14464o = 1;
                        }
                        f(u10.f14458b != -9223372036854775807L ? u10.f14458b : d());
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            Message obtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f14466q;
                    this.f14465p = Thread.currentThread();
                }
                if (z10) {
                    p3.k0.a("load:" + this.f14460k.getClass().getSimpleName());
                    try {
                        this.f14460k.b();
                        p3.k0.c();
                    } catch (Throwable th) {
                        p3.k0.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f14465p = null;
                    Thread.interrupted();
                }
                if (this.f14467r) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f14467r) {
                    return;
                }
                obtainMessage = obtainMessage(2, e10);
                obtainMessage.sendToTarget();
            } catch (Error e11) {
                if (!this.f14467r) {
                    p3.r.d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f14467r) {
                    return;
                }
                p3.r.d("LoadTask", "Unexpected exception loading stream", e12);
                hVar = new h(e12);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f14467r) {
                    return;
                }
                p3.r.d("LoadTask", "OutOfMemory error loading stream", e13);
                hVar = new h(e13);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void b();

        void c();
    }

    /* loaded from: classes.dex */
    public interface f {
        void l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final f f14469j;

        public g(f fVar) {
            this.f14469j = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14469j.l();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public h0(String str) {
        this.f14454a = p3.n0.C0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // o3.i0
    public void b() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) p3.a.h(this.f14455b)).a(false);
    }

    public void g() {
        this.f14456c = null;
    }

    public boolean i() {
        return this.f14456c != null;
    }

    public boolean j() {
        return this.f14455b != null;
    }

    public void k(int i10) {
        IOException iOException = this.f14456c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f14455b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f14459j;
            }
            dVar.e(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f14455b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f14454a.execute(new g(fVar));
        }
        this.f14454a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        this.f14456c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) p3.a.h(Looper.myLooper()), t10, bVar, i10, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
