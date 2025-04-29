package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f11771a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11772b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f11773c;

    /* renamed from: d  reason: collision with root package name */
    private final b5.r f11774d;

    /* renamed from: e  reason: collision with root package name */
    private long f11775e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11776f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f11777g;

    /* loaded from: classes.dex */
    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!y1.this.f11776f) {
                y1.this.f11777g = null;
                return;
            }
            long j10 = y1.this.j();
            if (y1.this.f11775e - j10 > 0) {
                y1 y1Var = y1.this;
                y1Var.f11777g = y1Var.f11771a.schedule(new c(), y1.this.f11775e - j10, TimeUnit.NANOSECONDS);
                return;
            }
            y1.this.f11776f = false;
            y1.this.f11777g = null;
            y1.this.f11773c.run();
        }
    }

    /* loaded from: classes.dex */
    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y1.this.f11772b.execute(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, b5.r rVar) {
        this.f11773c = runnable;
        this.f11772b = executor;
        this.f11771a = scheduledExecutorService;
        this.f11774d = rVar;
        rVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f11774d.d(TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        this.f11776f = false;
        if (!z10 || (scheduledFuture = this.f11777g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f11777g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        long j11 = j() + nanos;
        this.f11776f = true;
        if (j11 - this.f11775e < 0 || this.f11777g == null) {
            ScheduledFuture<?> scheduledFuture = this.f11777g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f11777g = this.f11771a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f11775e = j11;
    }
}
