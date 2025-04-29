package com.google.crypto.tink.shaded.protobuf;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o1<T, B> {
    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(B b10, int i10, i iVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T k(T t10, T t11);

    final void l(B b10, g1 g1Var) {
        while (g1Var.p() != Integer.MAX_VALUE && m(b10, g1Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(B b10, g1 g1Var) {
        int c10 = g1Var.c();
        int a10 = u1.a(c10);
        int b11 = u1.b(c10);
        if (b11 == 0) {
            e(b10, a10, g1Var.E());
            return true;
        } else if (b11 == 1) {
            b(b10, a10, g1Var.f());
            return true;
        } else if (b11 == 2) {
            d(b10, a10, g1Var.u());
            return true;
        } else if (b11 != 3) {
            if (b11 != 4) {
                if (b11 == 5) {
                    a(b10, a10, g1Var.n());
                    return true;
                }
                throw c0.e();
            }
            return false;
        } else {
            B n10 = n();
            int c11 = u1.c(a10, 4);
            l(n10, g1Var);
            if (c11 == g1Var.c()) {
                c(b10, a10, r(n10));
                return true;
            }
            throw c0.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(Object obj, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(g1 g1Var);

    abstract T r(B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(T t10, v1 v1Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t(T t10, v1 v1Var);
}
