package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l0;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k implements g1 {

    /* renamed from: a  reason: collision with root package name */
    private final j f6227a;

    /* renamed from: b  reason: collision with root package name */
    private int f6228b;

    /* renamed from: c  reason: collision with root package name */
    private int f6229c;

    /* renamed from: d  reason: collision with root package name */
    private int f6230d = 0;

    private k(j jVar) {
        j jVar2 = (j) b0.b(jVar, "input");
        this.f6227a = jVar2;
        jVar2.f6209d = this;
    }

    public static k Q(j jVar) {
        k kVar = jVar.f6209d;
        return kVar != null ? kVar : new k(jVar);
    }

    private <T> T R(h1<T> h1Var, q qVar) {
        int i10 = this.f6229c;
        this.f6229c = u1.c(u1.a(this.f6228b), 4);
        try {
            T f10 = h1Var.f();
            h1Var.j(f10, this, qVar);
            h1Var.b(f10);
            if (this.f6228b == this.f6229c) {
                return f10;
            }
            throw c0.h();
        } finally {
            this.f6229c = i10;
        }
    }

    private <T> T S(h1<T> h1Var, q qVar) {
        j jVar;
        int A = this.f6227a.A();
        j jVar2 = this.f6227a;
        if (jVar2.f6206a < jVar2.f6207b) {
            int j10 = jVar2.j(A);
            T f10 = h1Var.f();
            this.f6227a.f6206a++;
            h1Var.j(f10, this, qVar);
            h1Var.b(f10);
            this.f6227a.a(0);
            jVar.f6206a--;
            this.f6227a.i(j10);
            return f10;
        }
        throw c0.i();
    }

    private void U(int i10) {
        if (this.f6227a.d() != i10) {
            throw c0.k();
        }
    }

    private void V(int i10) {
        if (u1.b(this.f6228b) != i10) {
            throw c0.e();
        }
    }

    private void W(int i10) {
        if ((i10 & 3) != 0) {
            throw c0.h();
        }
    }

    private void X(int i10) {
        if ((i10 & 7) != 0) {
            throw c0.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void A(List<i> list) {
        int z10;
        if (u1.b(this.f6228b) != 2) {
            throw c0.e();
        }
        do {
            list.add(u());
            if (this.f6227a.e()) {
                return;
            }
            z10 = this.f6227a.z();
        } while (z10 == this.f6228b);
        this.f6230d = z10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void B(List<Double> list) {
        int z10;
        int z11;
        if (!(list instanceof n)) {
            int b10 = u1.b(this.f6228b);
            if (b10 == 1) {
                do {
                    list.add(Double.valueOf(this.f6227a.m()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                int A = this.f6227a.A();
                X(A);
                int d10 = this.f6227a.d() + A;
                do {
                    list.add(Double.valueOf(this.f6227a.m()));
                } while (this.f6227a.d() < d10);
                return;
            }
        }
        n nVar = (n) list;
        int b11 = u1.b(this.f6228b);
        if (b11 == 1) {
            do {
                nVar.l(this.f6227a.m());
                if (this.f6227a.e()) {
                    return;
                }
                z11 = this.f6227a.z();
            } while (z11 == this.f6228b);
            this.f6230d = z11;
        } else if (b11 != 2) {
            throw c0.e();
        } else {
            int A2 = this.f6227a.A();
            X(A2);
            int d11 = this.f6227a.d() + A2;
            do {
                nVar.l(this.f6227a.m());
            } while (this.f6227a.d() < d11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void C(List<Long> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f6228b);
            if (b10 == 0) {
                do {
                    j0Var.m(this.f6227a.s());
                    if (this.f6227a.e()) {
                        return;
                    }
                    z11 = this.f6227a.z();
                } while (z11 == this.f6228b);
                this.f6230d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    j0Var.m(this.f6227a.s());
                } while (this.f6227a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f6228b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f6227a.s()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    list.add(Long.valueOf(this.f6227a.s()));
                } while (this.f6227a.d() < d10);
            }
        }
        U(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void D(List<Long> list) {
        int z10;
        int z11;
        if (!(list instanceof j0)) {
            int b10 = u1.b(this.f6228b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f6227a.u()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                int A = this.f6227a.A();
                X(A);
                int d10 = this.f6227a.d() + A;
                do {
                    list.add(Long.valueOf(this.f6227a.u()));
                } while (this.f6227a.d() < d10);
                return;
            }
        }
        j0 j0Var = (j0) list;
        int b11 = u1.b(this.f6228b);
        if (b11 == 1) {
            do {
                j0Var.m(this.f6227a.u());
                if (this.f6227a.e()) {
                    return;
                }
                z11 = this.f6227a.z();
            } while (z11 == this.f6228b);
            this.f6230d = z11;
        } else if (b11 != 2) {
            throw c0.e();
        } else {
            int A2 = this.f6227a.A();
            X(A2);
            int d11 = this.f6227a.d() + A2;
            do {
                j0Var.m(this.f6227a.u());
            } while (this.f6227a.d() < d11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long E() {
        V(0);
        return this.f6227a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public String F() {
        V(2);
        return this.f6227a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void G(List<Long> list) {
        int z10;
        int z11;
        if (!(list instanceof j0)) {
            int b10 = u1.b(this.f6228b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f6227a.p()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                int A = this.f6227a.A();
                X(A);
                int d10 = this.f6227a.d() + A;
                do {
                    list.add(Long.valueOf(this.f6227a.p()));
                } while (this.f6227a.d() < d10);
                return;
            }
        }
        j0 j0Var = (j0) list;
        int b11 = u1.b(this.f6228b);
        if (b11 == 1) {
            do {
                j0Var.m(this.f6227a.p());
                if (this.f6227a.e()) {
                    return;
                }
                z11 = this.f6227a.z();
            } while (z11 == this.f6228b);
            this.f6230d = z11;
        } else if (b11 != 2) {
            throw c0.e();
        } else {
            int A2 = this.f6227a.A();
            X(A2);
            int d11 = this.f6227a.d() + A2;
            do {
                j0Var.m(this.f6227a.p());
            } while (this.f6227a.d() < d11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void H(List<Integer> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b10 = u1.b(this.f6228b);
            if (b10 == 0) {
                do {
                    a0Var.l(this.f6227a.r());
                    if (this.f6227a.e()) {
                        return;
                    }
                    z11 = this.f6227a.z();
                } while (z11 == this.f6228b);
                this.f6230d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    a0Var.l(this.f6227a.r());
                } while (this.f6227a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f6228b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6227a.r()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    list.add(Integer.valueOf(this.f6227a.r()));
                } while (this.f6227a.d() < d10);
            }
        }
        U(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void I(List<Integer> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b10 = u1.b(this.f6228b);
            if (b10 == 0) {
                do {
                    a0Var.l(this.f6227a.n());
                    if (this.f6227a.e()) {
                        return;
                    }
                    z11 = this.f6227a.z();
                } while (z11 == this.f6228b);
                this.f6230d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    a0Var.l(this.f6227a.n());
                } while (this.f6227a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f6228b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6227a.n()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    list.add(Integer.valueOf(this.f6227a.n()));
                } while (this.f6227a.d() < d10);
            }
        }
        U(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> T J(h1<T> h1Var, q qVar) {
        V(3);
        return (T) R(h1Var, qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> T K(h1<T> h1Var, q qVar) {
        V(2);
        return (T) S(h1Var, qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> T L(Class<T> cls, q qVar) {
        V(3);
        return (T) R(d1.a().d(cls), qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> void M(List<T> list, h1<T> h1Var, q qVar) {
        int z10;
        if (u1.b(this.f6228b) != 2) {
            throw c0.e();
        }
        int i10 = this.f6228b;
        do {
            list.add(S(h1Var, qVar));
            if (this.f6227a.e() || this.f6230d != 0) {
                return;
            }
            z10 = this.f6227a.z();
        } while (z10 == i10);
        this.f6230d = z10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> T N(Class<T> cls, q qVar) {
        V(2);
        return (T) S(d1.a().d(cls), qVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <K, V> void O(Map<K, V> map, l0.a<K, V> aVar, q qVar) {
        V(2);
        this.f6227a.j(this.f6227a.A());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public <T> void P(List<T> list, h1<T> h1Var, q qVar) {
        int z10;
        if (u1.b(this.f6228b) != 3) {
            throw c0.e();
        }
        int i10 = this.f6228b;
        do {
            list.add(R(h1Var, qVar));
            if (this.f6227a.e() || this.f6230d != 0) {
                return;
            }
            z10 = this.f6227a.z();
        } while (z10 == i10);
        this.f6230d = z10;
    }

    public void T(List<String> list, boolean z10) {
        int z11;
        int z12;
        if (u1.b(this.f6228b) != 2) {
            throw c0.e();
        }
        if (!(list instanceof h0) || z10) {
            do {
                list.add(z10 ? F() : m());
                if (this.f6227a.e()) {
                    return;
                }
                z11 = this.f6227a.z();
            } while (z11 == this.f6228b);
            this.f6230d = z11;
            return;
        }
        h0 h0Var = (h0) list;
        do {
            h0Var.o(u());
            if (this.f6227a.e()) {
                return;
            }
            z12 = this.f6227a.z();
        } while (z12 == this.f6228b);
        this.f6230d = z12;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void a(List<Integer> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b10 = u1.b(this.f6228b);
            if (b10 == 0) {
                do {
                    a0Var.l(this.f6227a.v());
                    if (this.f6227a.e()) {
                        return;
                    }
                    z11 = this.f6227a.z();
                } while (z11 == this.f6228b);
                this.f6230d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    a0Var.l(this.f6227a.v());
                } while (this.f6227a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f6228b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6227a.v()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    list.add(Integer.valueOf(this.f6227a.v()));
                } while (this.f6227a.d() < d10);
            }
        }
        U(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int b() {
        V(0);
        return this.f6227a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int c() {
        return this.f6228b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long d() {
        V(0);
        return this.f6227a.B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void e(List<Integer> list) {
        int z10;
        int z11;
        if (!(list instanceof a0)) {
            int b10 = u1.b(this.f6228b);
            if (b10 == 2) {
                int A = this.f6227a.A();
                W(A);
                int d10 = this.f6227a.d() + A;
                do {
                    list.add(Integer.valueOf(this.f6227a.o()));
                } while (this.f6227a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.e();
            } else {
                do {
                    list.add(Integer.valueOf(this.f6227a.o()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            }
        }
        a0 a0Var = (a0) list;
        int b11 = u1.b(this.f6228b);
        if (b11 == 2) {
            int A2 = this.f6227a.A();
            W(A2);
            int d11 = this.f6227a.d() + A2;
            do {
                a0Var.l(this.f6227a.o());
            } while (this.f6227a.d() < d11);
        } else if (b11 != 5) {
            throw c0.e();
        } else {
            do {
                a0Var.l(this.f6227a.o());
                if (this.f6227a.e()) {
                    return;
                }
                z11 = this.f6227a.z();
            } while (z11 == this.f6228b);
            this.f6230d = z11;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long f() {
        V(1);
        return this.f6227a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void g(List<Integer> list) {
        int z10;
        int z11;
        if (!(list instanceof a0)) {
            int b10 = u1.b(this.f6228b);
            if (b10 == 2) {
                int A = this.f6227a.A();
                W(A);
                int d10 = this.f6227a.d() + A;
                do {
                    list.add(Integer.valueOf(this.f6227a.t()));
                } while (this.f6227a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.e();
            } else {
                do {
                    list.add(Integer.valueOf(this.f6227a.t()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            }
        }
        a0 a0Var = (a0) list;
        int b11 = u1.b(this.f6228b);
        if (b11 == 2) {
            int A2 = this.f6227a.A();
            W(A2);
            int d11 = this.f6227a.d() + A2;
            do {
                a0Var.l(this.f6227a.t());
            } while (this.f6227a.d() < d11);
        } else if (b11 != 5) {
            throw c0.e();
        } else {
            do {
                a0Var.l(this.f6227a.t());
                if (this.f6227a.e()) {
                    return;
                }
                z11 = this.f6227a.z();
            } while (z11 == this.f6228b);
            this.f6230d = z11;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int h() {
        V(0);
        return this.f6227a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void i(List<Long> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f6228b);
            if (b10 == 0) {
                do {
                    j0Var.m(this.f6227a.w());
                    if (this.f6227a.e()) {
                        return;
                    }
                    z11 = this.f6227a.z();
                } while (z11 == this.f6228b);
                this.f6230d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    j0Var.m(this.f6227a.w());
                } while (this.f6227a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f6228b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f6227a.w()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    list.add(Long.valueOf(this.f6227a.w()));
                } while (this.f6227a.d() < d10);
            }
        }
        U(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long j() {
        V(0);
        return this.f6227a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void k(List<Integer> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            int b10 = u1.b(this.f6228b);
            if (b10 == 0) {
                do {
                    a0Var.l(this.f6227a.A());
                    if (this.f6227a.e()) {
                        return;
                    }
                    z11 = this.f6227a.z();
                } while (z11 == this.f6228b);
                this.f6230d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    a0Var.l(this.f6227a.A());
                } while (this.f6227a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f6228b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f6227a.A()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    list.add(Integer.valueOf(this.f6227a.A()));
                } while (this.f6227a.d() < d10);
            }
        }
        U(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void l(List<Boolean> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof g) {
            g gVar = (g) list;
            int b10 = u1.b(this.f6228b);
            if (b10 == 0) {
                do {
                    gVar.m(this.f6227a.k());
                    if (this.f6227a.e()) {
                        return;
                    }
                    z11 = this.f6227a.z();
                } while (z11 == this.f6228b);
                this.f6230d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    gVar.m(this.f6227a.k());
                } while (this.f6227a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f6228b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f6227a.k()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    list.add(Boolean.valueOf(this.f6227a.k()));
                } while (this.f6227a.d() < d10);
            }
        }
        U(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public String m() {
        V(2);
        return this.f6227a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int n() {
        V(5);
        return this.f6227a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean o() {
        V(0);
        return this.f6227a.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int p() {
        int i10 = this.f6230d;
        if (i10 != 0) {
            this.f6228b = i10;
            this.f6230d = 0;
        } else {
            this.f6228b = this.f6227a.z();
        }
        int i11 = this.f6228b;
        if (i11 == 0 || i11 == this.f6229c) {
            return Integer.MAX_VALUE;
        }
        return u1.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void q(List<String> list) {
        T(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public long r() {
        V(1);
        return this.f6227a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public double readDouble() {
        V(1);
        return this.f6227a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public float readFloat() {
        V(5);
        return this.f6227a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void s(List<Long> list) {
        int z10;
        int d10;
        int z11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int b10 = u1.b(this.f6228b);
            if (b10 == 0) {
                do {
                    j0Var.m(this.f6227a.B());
                    if (this.f6227a.e()) {
                        return;
                    }
                    z11 = this.f6227a.z();
                } while (z11 == this.f6228b);
                this.f6230d = z11;
                return;
            } else if (b10 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    j0Var.m(this.f6227a.B());
                } while (this.f6227a.d() < d10);
            }
        } else {
            int b11 = u1.b(this.f6228b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f6227a.B()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            } else if (b11 != 2) {
                throw c0.e();
            } else {
                d10 = this.f6227a.d() + this.f6227a.A();
                do {
                    list.add(Long.valueOf(this.f6227a.B()));
                } while (this.f6227a.d() < d10);
            }
        }
        U(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void t(List<String> list) {
        T(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public i u() {
        V(2);
        return this.f6227a.l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public void v(List<Float> list) {
        int z10;
        int z11;
        if (!(list instanceof x)) {
            int b10 = u1.b(this.f6228b);
            if (b10 == 2) {
                int A = this.f6227a.A();
                W(A);
                int d10 = this.f6227a.d() + A;
                do {
                    list.add(Float.valueOf(this.f6227a.q()));
                } while (this.f6227a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw c0.e();
            } else {
                do {
                    list.add(Float.valueOf(this.f6227a.q()));
                    if (this.f6227a.e()) {
                        return;
                    }
                    z10 = this.f6227a.z();
                } while (z10 == this.f6228b);
                this.f6230d = z10;
                return;
            }
        }
        x xVar = (x) list;
        int b11 = u1.b(this.f6228b);
        if (b11 == 2) {
            int A2 = this.f6227a.A();
            W(A2);
            int d11 = this.f6227a.d() + A2;
            do {
                xVar.l(this.f6227a.q());
            } while (this.f6227a.d() < d11);
        } else if (b11 != 5) {
            throw c0.e();
        } else {
            do {
                xVar.l(this.f6227a.q());
                if (this.f6227a.e()) {
                    return;
                }
                z11 = this.f6227a.z();
            } while (z11 == this.f6228b);
            this.f6230d = z11;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int w() {
        V(0);
        return this.f6227a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int x() {
        V(0);
        return this.f6227a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public boolean y() {
        int i10;
        if (this.f6227a.e() || (i10 = this.f6228b) == this.f6229c) {
            return false;
        }
        return this.f6227a.C(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g1
    public int z() {
        V(5);
        return this.f6227a.t();
    }
}
