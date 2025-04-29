package io.grpc.internal;

import io.grpc.internal.k1;
import io.grpc.internal.s;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
abstract class k0 implements v {
    @Override // io.grpc.internal.s
    public q a(i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar, i9.k[] kVarArr) {
        return b().a(z0Var, y0Var, cVar, kVarArr);
    }

    protected abstract v b();

    @Override // io.grpc.internal.k1
    public void c(i9.j1 j1Var) {
        b().c(j1Var);
    }

    @Override // io.grpc.internal.k1
    public Runnable d(k1.a aVar) {
        return b().d(aVar);
    }

    @Override // i9.p0
    public i9.j0 f() {
        return b().f();
    }

    @Override // io.grpc.internal.k1
    public void g(i9.j1 j1Var) {
        b().g(j1Var);
    }

    @Override // io.grpc.internal.s
    public void h(s.a aVar, Executor executor) {
        b().h(aVar, executor);
    }

    public String toString() {
        return b5.h.c(this).d("delegate", b()).toString();
    }
}
