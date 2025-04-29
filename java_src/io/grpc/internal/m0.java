package io.grpc.internal;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
abstract class m0 extends i9.u0 {

    /* renamed from: a  reason: collision with root package name */
    private final i9.u0 f11449a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(i9.u0 u0Var) {
        this.f11449a = u0Var;
    }

    @Override // i9.d
    public String b() {
        return this.f11449a.b();
    }

    @Override // i9.d
    public <RequestT, ResponseT> i9.g<RequestT, ResponseT> e(i9.z0<RequestT, ResponseT> z0Var, i9.c cVar) {
        return this.f11449a.e(z0Var, cVar);
    }

    @Override // i9.u0
    public boolean i(long j10, TimeUnit timeUnit) {
        return this.f11449a.i(j10, timeUnit);
    }

    @Override // i9.u0
    public void j() {
        this.f11449a.j();
    }

    @Override // i9.u0
    public i9.p k(boolean z10) {
        return this.f11449a.k(z10);
    }

    @Override // i9.u0
    public void l(i9.p pVar, Runnable runnable) {
        this.f11449a.l(pVar, runnable);
    }

    @Override // i9.u0
    public i9.u0 m() {
        return this.f11449a.m();
    }

    @Override // i9.u0
    public i9.u0 n() {
        return this.f11449a.n();
    }

    public String toString() {
        return b5.h.c(this).d("delegate", this.f11449a).toString();
    }
}
