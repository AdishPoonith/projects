package io.grpc.internal;

import io.grpc.internal.k2;
import io.grpc.internal.l1;
/* loaded from: classes.dex */
abstract class l0 implements l1.b {
    @Override // io.grpc.internal.l1.b
    public void a(k2.a aVar) {
        c().a(aVar);
    }

    @Override // io.grpc.internal.l1.b
    public void b(Throwable th) {
        c().b(th);
    }

    protected abstract l1.b c();

    @Override // io.grpc.internal.l1.b
    public void e(boolean z10) {
        c().e(z10);
    }

    @Override // io.grpc.internal.l1.b
    public void f(int i10) {
        c().f(i10);
    }
}
