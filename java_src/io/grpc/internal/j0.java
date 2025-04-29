package io.grpc.internal;

import io.grpc.internal.k2;
import io.grpc.internal.r;
/* loaded from: classes.dex */
abstract class j0 implements r {
    @Override // io.grpc.internal.k2
    public void a(k2.a aVar) {
        e().a(aVar);
    }

    @Override // io.grpc.internal.k2
    public void b() {
        e().b();
    }

    @Override // io.grpc.internal.r
    public void c(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
        e().c(j1Var, aVar, y0Var);
    }

    @Override // io.grpc.internal.r
    public void d(i9.y0 y0Var) {
        e().d(y0Var);
    }

    protected abstract r e();

    public String toString() {
        return b5.h.c(this).d("delegate", e()).toString();
    }
}
