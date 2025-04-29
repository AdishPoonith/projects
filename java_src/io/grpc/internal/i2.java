package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: c  reason: collision with root package name */
    public static final i2 f11376c = new i2(new i9.m1[0]);

    /* renamed from: a  reason: collision with root package name */
    private final i9.m1[] f11377a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f11378b = new AtomicBoolean(false);

    i2(i9.m1[] m1VarArr) {
        this.f11377a = m1VarArr;
    }

    public static i2 h(i9.k[] kVarArr, i9.a aVar, i9.y0 y0Var) {
        i2 i2Var = new i2(kVarArr);
        for (i9.k kVar : kVarArr) {
            kVar.m(aVar, y0Var);
        }
        return i2Var;
    }

    public void a() {
        for (i9.m1 m1Var : this.f11377a) {
            ((i9.k) m1Var).j();
        }
    }

    public void b(i9.y0 y0Var) {
        for (i9.m1 m1Var : this.f11377a) {
            ((i9.k) m1Var).k(y0Var);
        }
    }

    public void c() {
        for (i9.m1 m1Var : this.f11377a) {
            ((i9.k) m1Var).l();
        }
    }

    public void d(int i10) {
        for (i9.m1 m1Var : this.f11377a) {
            m1Var.a(i10);
        }
    }

    public void e(int i10, long j10, long j11) {
        for (i9.m1 m1Var : this.f11377a) {
            m1Var.b(i10, j10, j11);
        }
    }

    public void f(long j10) {
        for (i9.m1 m1Var : this.f11377a) {
            m1Var.c(j10);
        }
    }

    public void g(long j10) {
        for (i9.m1 m1Var : this.f11377a) {
            m1Var.d(j10);
        }
    }

    public void i(int i10) {
        for (i9.m1 m1Var : this.f11377a) {
            m1Var.e(i10);
        }
    }

    public void j(int i10, long j10, long j11) {
        for (i9.m1 m1Var : this.f11377a) {
            m1Var.f(i10, j10, j11);
        }
    }

    public void k(long j10) {
        for (i9.m1 m1Var : this.f11377a) {
            m1Var.g(j10);
        }
    }

    public void l(long j10) {
        for (i9.m1 m1Var : this.f11377a) {
            m1Var.h(j10);
        }
    }

    public void m(i9.j1 j1Var) {
        if (this.f11378b.compareAndSet(false, true)) {
            for (i9.m1 m1Var : this.f11377a) {
                m1Var.i(j1Var);
            }
        }
    }
}
