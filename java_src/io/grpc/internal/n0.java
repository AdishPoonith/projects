package io.grpc.internal;

import i9.a1;
/* loaded from: classes.dex */
abstract class n0 extends i9.a1 {

    /* renamed from: a  reason: collision with root package name */
    private final i9.a1 f11472a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(i9.a1 a1Var) {
        b5.n.o(a1Var, "delegate can not be null");
        this.f11472a = a1Var;
    }

    @Override // i9.a1
    public void b() {
        this.f11472a.b();
    }

    @Override // i9.a1
    public void c() {
        this.f11472a.c();
    }

    @Override // i9.a1
    public void d(a1.e eVar) {
        this.f11472a.d(eVar);
    }

    @Override // i9.a1
    @Deprecated
    public void e(a1.f fVar) {
        this.f11472a.e(fVar);
    }

    public String toString() {
        return b5.h.c(this).d("delegate", this.f11472a).toString();
    }
}
