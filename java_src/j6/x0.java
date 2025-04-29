package j6;

import j6.j;
import l6.f4;
import l6.o0;
import p6.p0;
/* loaded from: classes.dex */
public class x0 extends j {

    /* loaded from: classes.dex */
    private class b implements p0.c {
        private b() {
        }

        @Override // p6.p0.c
        public void a(z0 z0Var) {
            x0.this.p().a(z0Var);
        }

        @Override // p6.p0.c
        public d6.e<m6.l> b(int i10) {
            return x0.this.p().b(i10);
        }

        @Override // p6.p0.c
        public void c(int i10, i9.j1 j1Var) {
            x0.this.p().c(i10, j1Var);
        }

        @Override // p6.p0.c
        public void d(int i10, i9.j1 j1Var) {
            x0.this.p().d(i10, j1Var);
        }

        @Override // p6.p0.c
        public void e(n6.h hVar) {
            x0.this.p().e(hVar);
        }

        @Override // p6.p0.c
        public void f(p6.k0 k0Var) {
            x0.this.p().f(k0Var);
        }
    }

    private boolean s(com.google.firebase.firestore.a0 a0Var) {
        if (a0Var.f() == null || !(a0Var.f() instanceof com.google.firebase.firestore.k0)) {
            return false;
        }
        return ((com.google.firebase.firestore.k0) a0Var.f()).a() instanceof com.google.firebase.firestore.m0;
    }

    @Override // j6.j
    protected p b(j.a aVar) {
        return new p(p());
    }

    @Override // j6.j
    protected f4 c(j.a aVar) {
        return null;
    }

    @Override // j6.j
    protected l6.k d(j.a aVar) {
        return null;
    }

    @Override // j6.j
    protected l6.i0 e(j.a aVar) {
        return new l6.i0(n(), new l6.f1(), aVar.e());
    }

    @Override // j6.j
    protected l6.e1 f(j.a aVar) {
        if (s(aVar.g())) {
            return l6.y0.o(o0.b.a(aVar.g().g()), new l6.o(new p6.l0(aVar.c().a())));
        }
        return l6.y0.n();
    }

    @Override // j6.j
    protected p6.p0 g(j.a aVar) {
        return new p6.p0(new b(), m(), aVar.d(), aVar.a(), i());
    }

    @Override // j6.j
    protected f1 h(j.a aVar) {
        return new f1(m(), o(), aVar.e(), aVar.f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j6.j
    /* renamed from: r */
    public p6.j a(j.a aVar) {
        return new p6.j(aVar.b());
    }
}
