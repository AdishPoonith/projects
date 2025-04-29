package io.grpc.internal;

import io.grpc.internal.s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class c1 {

    /* renamed from: l  reason: collision with root package name */
    private static final long f11097l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m  reason: collision with root package name */
    private static final long f11098m = TimeUnit.MILLISECONDS.toNanos(10);

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f11099a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.r f11100b;

    /* renamed from: c  reason: collision with root package name */
    private final d f11101c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11102d;

    /* renamed from: e  reason: collision with root package name */
    private e f11103e;

    /* renamed from: f  reason: collision with root package name */
    private ScheduledFuture<?> f11104f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f11105g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f11106h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f11107i;

    /* renamed from: j  reason: collision with root package name */
    private final long f11108j;

    /* renamed from: k  reason: collision with root package name */
    private final long f11109k;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (c1.this) {
                e eVar = c1.this.f11103e;
                e eVar2 = e.DISCONNECTED;
                if (eVar != eVar2) {
                    c1.this.f11103e = eVar2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                c1.this.f11101c.a();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (c1.this) {
                c1.this.f11105g = null;
                e eVar = c1.this.f11103e;
                e eVar2 = e.PING_SCHEDULED;
                if (eVar == eVar2) {
                    z10 = true;
                    c1.this.f11103e = e.PING_SENT;
                    c1 c1Var = c1.this;
                    c1Var.f11104f = c1Var.f11099a.schedule(c1.this.f11106h, c1.this.f11109k, TimeUnit.NANOSECONDS);
                } else {
                    if (c1.this.f11103e == e.PING_DELAYED) {
                        c1 c1Var2 = c1.this;
                        ScheduledExecutorService scheduledExecutorService = c1Var2.f11099a;
                        Runnable runnable = c1.this.f11107i;
                        long j10 = c1.this.f11108j;
                        b5.r rVar = c1.this.f11100b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        c1Var2.f11105g = scheduledExecutorService.schedule(runnable, j10 - rVar.d(timeUnit), timeUnit);
                        c1.this.f11103e = eVar2;
                    }
                    z10 = false;
                }
            }
            if (z10) {
                c1.this.f11101c.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final v f11112a;

        /* loaded from: classes.dex */
        class a implements s.a {
            a() {
            }

            @Override // io.grpc.internal.s.a
            public void a(Throwable th) {
                c.this.f11112a.g(i9.j1.f9938u.q("Keepalive failed. The connection is likely gone"));
            }

            @Override // io.grpc.internal.s.a
            public void b(long j10) {
            }
        }

        public c(v vVar) {
            this.f11112a = vVar;
        }

        @Override // io.grpc.internal.c1.d
        public void a() {
            this.f11112a.g(i9.j1.f9938u.q("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.internal.c1.d
        public void b() {
            this.f11112a.h(new a(), com.google.common.util.concurrent.e.a());
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public c1(d dVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        this(dVar, scheduledExecutorService, b5.r.c(), j10, j11, z10);
    }

    c1(d dVar, ScheduledExecutorService scheduledExecutorService, b5.r rVar, long j10, long j11, boolean z10) {
        this.f11103e = e.IDLE;
        this.f11106h = new d1(new a());
        this.f11107i = new d1(new b());
        this.f11101c = (d) b5.n.o(dVar, "keepAlivePinger");
        this.f11099a = (ScheduledExecutorService) b5.n.o(scheduledExecutorService, "scheduler");
        this.f11100b = (b5.r) b5.n.o(rVar, "stopwatch");
        this.f11108j = j10;
        this.f11109k = j11;
        this.f11102d = z10;
        rVar.f().g();
    }

    public static long l(long j10) {
        return Math.max(j10, f11097l);
    }

    public synchronized void m() {
        this.f11100b.f().g();
        e eVar = this.f11103e;
        e eVar2 = e.PING_SCHEDULED;
        if (eVar == eVar2) {
            this.f11103e = e.PING_DELAYED;
        } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
            ScheduledFuture<?> scheduledFuture = this.f11104f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f11103e == e.IDLE_AND_PING_SENT) {
                this.f11103e = e.IDLE;
                return;
            }
            this.f11103e = eVar2;
            b5.n.u(this.f11105g == null, "There should be no outstanding pingFuture");
            this.f11105g = this.f11099a.schedule(this.f11107i, this.f11108j, TimeUnit.NANOSECONDS);
        }
    }

    public synchronized void n() {
        e eVar = this.f11103e;
        if (eVar == e.IDLE) {
            this.f11103e = e.PING_SCHEDULED;
            if (this.f11105g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f11099a;
                Runnable runnable = this.f11107i;
                long j10 = this.f11108j;
                b5.r rVar = this.f11100b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f11105g = scheduledExecutorService.schedule(runnable, j10 - rVar.d(timeUnit), timeUnit);
            }
        } else if (eVar == e.IDLE_AND_PING_SENT) {
            this.f11103e = e.PING_SENT;
        }
    }

    public synchronized void o() {
        if (this.f11102d) {
            return;
        }
        e eVar = this.f11103e;
        if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
            this.f11103e = e.IDLE;
        }
        if (this.f11103e == e.PING_SENT) {
            this.f11103e = e.IDLE_AND_PING_SENT;
        }
    }

    public synchronized void p() {
        if (this.f11102d) {
            n();
        }
    }

    public synchronized void q() {
        e eVar = this.f11103e;
        e eVar2 = e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f11103e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f11104f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f11105g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f11105g = null;
            }
        }
    }
}
