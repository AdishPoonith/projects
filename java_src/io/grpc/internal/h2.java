package io.grpc.internal;

import io.grpc.internal.k2;
import io.grpc.internal.l1;
import java.io.Closeable;
/* loaded from: classes.dex */
final class h2 extends l0 {

    /* renamed from: a  reason: collision with root package name */
    private final l1.b f11362a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11363b;

    public h2(l1.b bVar) {
        this.f11362a = bVar;
    }

    @Override // io.grpc.internal.l0, io.grpc.internal.l1.b
    public void a(k2.a aVar) {
        if (!this.f11363b) {
            super.a(aVar);
        } else if (aVar instanceof Closeable) {
            r0.e((Closeable) aVar);
        }
    }

    @Override // io.grpc.internal.l0, io.grpc.internal.l1.b
    public void b(Throwable th) {
        this.f11363b = true;
        super.b(th);
    }

    @Override // io.grpc.internal.l0
    protected l1.b c() {
        return this.f11362a;
    }

    @Override // io.grpc.internal.l0, io.grpc.internal.l1.b
    public void e(boolean z10) {
        this.f11363b = true;
        super.e(z10);
    }
}
