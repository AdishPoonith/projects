package io.grpc.internal;

import java.io.InputStream;
/* loaded from: classes.dex */
abstract class i0 implements q {
    @Override // io.grpc.internal.q
    public void a(i9.j1 j1Var) {
        o().a(j1Var);
    }

    @Override // io.grpc.internal.j2
    public void b(int i10) {
        o().b(i10);
    }

    @Override // io.grpc.internal.j2
    public void c(i9.n nVar) {
        o().c(nVar);
    }

    @Override // io.grpc.internal.j2
    public boolean d() {
        return o().d();
    }

    @Override // io.grpc.internal.q
    public void e(int i10) {
        o().e(i10);
    }

    @Override // io.grpc.internal.q
    public void f(int i10) {
        o().f(i10);
    }

    @Override // io.grpc.internal.j2
    public void flush() {
        o().flush();
    }

    @Override // io.grpc.internal.q
    public void g(r rVar) {
        o().g(rVar);
    }

    @Override // io.grpc.internal.q
    public void h(i9.t tVar) {
        o().h(tVar);
    }

    @Override // io.grpc.internal.q
    public void i(i9.v vVar) {
        o().i(vVar);
    }

    @Override // io.grpc.internal.j2
    public void j(InputStream inputStream) {
        o().j(inputStream);
    }

    @Override // io.grpc.internal.q
    public void k(String str) {
        o().k(str);
    }

    @Override // io.grpc.internal.q
    public void l(x0 x0Var) {
        o().l(x0Var);
    }

    @Override // io.grpc.internal.j2
    public void m() {
        o().m();
    }

    @Override // io.grpc.internal.q
    public void n() {
        o().n();
    }

    protected abstract q o();

    @Override // io.grpc.internal.q
    public void q(boolean z10) {
        o().q(z10);
    }

    public String toString() {
        return b5.h.c(this).d("delegate", o()).toString();
    }
}
