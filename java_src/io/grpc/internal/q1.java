package io.grpc.internal;

import io.grpc.internal.p;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
/* loaded from: classes.dex */
final class q1 extends i9.u0 implements i9.i0<Object> {

    /* renamed from: k  reason: collision with root package name */
    private static final Logger f11555k = Logger.getLogger(q1.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private y0 f11556a;

    /* renamed from: b  reason: collision with root package name */
    private final i9.j0 f11557b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11558c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f11559d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f11560e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f11561f;

    /* renamed from: g  reason: collision with root package name */
    private final CountDownLatch f11562g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f11563h;

    /* renamed from: i  reason: collision with root package name */
    private final m f11564i;

    /* renamed from: j  reason: collision with root package name */
    private final p.e f11565j;

    @Override // i9.d
    public String b() {
        return this.f11558c;
    }

    @Override // i9.d
    public <RequestT, ResponseT> i9.g<RequestT, ResponseT> e(i9.z0<RequestT, ResponseT> z0Var, i9.c cVar) {
        return new p(z0Var, cVar.e() == null ? this.f11560e : cVar.e(), cVar, this.f11565j, this.f11561f, this.f11564i, null);
    }

    @Override // i9.p0
    public i9.j0 f() {
        return this.f11557b;
    }

    @Override // i9.u0
    public boolean i(long j10, TimeUnit timeUnit) {
        return this.f11562g.await(j10, timeUnit);
    }

    @Override // i9.u0
    public i9.p k(boolean z10) {
        y0 y0Var = this.f11556a;
        return y0Var == null ? i9.p.IDLE : y0Var.M();
    }

    @Override // i9.u0
    public i9.u0 m() {
        this.f11563h = true;
        this.f11559d.c(i9.j1.f9938u.q("OobChannel.shutdown() called"));
        return this;
    }

    @Override // i9.u0
    public i9.u0 n() {
        this.f11563h = true;
        this.f11559d.g(i9.j1.f9938u.q("OobChannel.shutdownNow() called"));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0 o() {
        return this.f11556a;
    }

    public String toString() {
        return b5.h.c(this).c("logId", this.f11557b.d()).d("authority", this.f11558c).toString();
    }
}
