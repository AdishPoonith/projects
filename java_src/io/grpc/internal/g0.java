package io.grpc.internal;

import io.grpc.internal.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class g0 implements s {

    /* renamed from: a  reason: collision with root package name */
    final i9.j1 f11193a;

    /* renamed from: b  reason: collision with root package name */
    private final r.a f11194b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(i9.j1 j1Var, r.a aVar) {
        b5.n.e(!j1Var.o(), "error must not be OK");
        this.f11193a = j1Var;
        this.f11194b = aVar;
    }

    @Override // io.grpc.internal.s
    public q a(i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar, i9.k[] kVarArr) {
        return new f0(this.f11193a, this.f11194b, kVarArr);
    }

    @Override // i9.p0
    public i9.j0 f() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
