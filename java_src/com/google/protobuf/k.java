package com.google.protobuf;

import com.google.protobuf.b2;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k implements l1 {

    /* renamed from: a  reason: collision with root package name */
    private final j f7218a;

    /* renamed from: b  reason: collision with root package name */
    private int f7219b;

    /* renamed from: c  reason: collision with root package name */
    private int f7220c;

    /* renamed from: d  reason: collision with root package name */
    private int f7221d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7222a;

        static {
            int[] iArr = new int[b2.b.values().length];
            f7222a = iArr;
            try {
                iArr[b2.b.f7058s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7222a[b2.b.f7062w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7222a[b2.b.f7051l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7222a[b2.b.f7064y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7222a[b2.b.f7057r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7222a[b2.b.f7056q.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7222a[b2.b.f7052m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7222a[b2.b.f7055p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7222a[b2.b.f7053n.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7222a[b2.b.f7061v.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7222a[b2.b.f7065z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7222a[b2.b.A.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7222a[b2.b.B.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7222a[b2.b.C.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7222a[b2.b.f7059t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7222a[b2.b.f7063x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7222a[b2.b.f7054o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private k(j jVar) {
        j jVar2 = (j) d0.b(jVar, "input");
        this.f7218a = jVar2;
        jVar2.f7167d = this;
    }

    public static k Q(j jVar) {
        k kVar = jVar.f7167d;
        return kVar != null ? kVar : new k(jVar);
    }

    private <T> void R(T t10, n1<T> n1Var, q qVar) {
        int i10 = this.f7220c;
        this.f7220c = b2.c(b2.a(this.f7219b), 4);
        try {
            n1Var.i(t10, this, qVar);
            if (this.f7219b == this.f7220c) {
                return;
            }
            throw e0.h();
        } finally {
            this.f7220c = i10;
        }
    }

    private <T> void S(T t10, n1<T> n1Var, q qVar) {
        j jVar;
        int E = this.f7218a.E();
        j jVar2 = this.f7218a;
        if (jVar2.f7164a >= jVar2.f7165b) {
            throw e0.i();
        }
        int n10 = jVar2.n(E);
        this.f7218a.f7164a++;
        n1Var.i(t10, this, qVar);
        this.f7218a.a(0);
        jVar.f7164a--;
        this.f7218a.m(n10);
    }

    private Object T(b2.b bVar, Class<?> cls, q qVar) {
        switch (a.f7222a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(o());
            case 2:
                return u();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(b());
            case 5:
                return Integer.valueOf(n());
            case 6:
                return Long.valueOf(f());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(x());
            case 9:
                return Long.valueOf(E());
            case 10:
                return K(cls, qVar);
            case 11:
                return Integer.valueOf(z());
            case 12:
                return Long.valueOf(r());
            case 13:
                return Integer.valueOf(h());
            case 14:
                return Long.valueOf(j());
            case 15:
                return F();
            case 16:
                return Integer.valueOf(w());
            case 17:
                return Long.valueOf(d());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T U(n1<T> n1Var, q qVar) {
        T f10 = n1Var.f();
        R(f10, n1Var, qVar);
        n1Var.b(f10);
        return f10;
    }

    private <T> T V(n1<T> n1Var, q qVar) {
        T f10 = n1Var.f();
        S(f10, n1Var, qVar);
        n1Var.b(f10);
        return f10;
    }

    private void X(int i10) {
        if (this.f7218a.d() != i10) {
            throw e0.m();
        }
    }

    private void Y(int i10) {
        if (b2.b(this.f7219b) != i10) {
            throw e0.e();
        }
    }

    private void Z(int i10) {
        if ((i10 & 3) != 0) {
            throw e0.h();
        }
    }

    private void a0(int i10) {
        if ((i10 & 7) != 0) {
            throw e0.h();
        }
    }

    @Override // com.google.protobuf.l1
    public void A(List<i> list) {
        int D;
        if (b2.b(this.f7219b) != 2) {
            throw e0.e();
        }
        do {
            list.add(u());
            if (this.f7218a.e()) {
                return;
            }
            D = this.f7218a.D();
        } while (D == this.f7219b);
        this.f7221d = D;
    }

    @Override // com.google.protobuf.l1
    public void B(List<Double> list) {
        int D;
        int D2;
        if (!(list instanceof n)) {
            int b10 = b2.b(this.f7219b);
            if (b10 == 1) {
                do {
                    list.add(Double.valueOf(this.f7218a.q()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                int E = this.f7218a.E();
                a0(E);
                int d10 = this.f7218a.d() + E;
                do {
                    list.add(Double.valueOf(this.f7218a.q()));
                } while (this.f7218a.d() < d10);
                return;
            }
        }
        n nVar = (n) list;
        int b11 = b2.b(this.f7219b);
        if (b11 == 1) {
            do {
                nVar.l(this.f7218a.q());
                if (this.f7218a.e()) {
                    return;
                }
                D2 = this.f7218a.D();
            } while (D2 == this.f7219b);
            this.f7221d = D2;
        } else if (b11 != 2) {
            throw e0.e();
        } else {
            int E2 = this.f7218a.E();
            a0(E2);
            int d11 = this.f7218a.d() + E2;
            do {
                nVar.l(this.f7218a.q());
            } while (this.f7218a.d() < d11);
        }
    }

    @Override // com.google.protobuf.l1
    public void C(List<Long> list) {
        int D;
        int d10;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b10 = b2.b(this.f7219b);
            if (b10 == 0) {
                do {
                    m0Var.m(this.f7218a.w());
                    if (this.f7218a.e()) {
                        return;
                    }
                    D2 = this.f7218a.D();
                } while (D2 == this.f7219b);
                this.f7221d = D2;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    m0Var.m(this.f7218a.w());
                } while (this.f7218a.d() < d10);
            }
        } else {
            int b11 = b2.b(this.f7219b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7218a.w()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b11 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    list.add(Long.valueOf(this.f7218a.w()));
                } while (this.f7218a.d() < d10);
            }
        }
        X(d10);
    }

    @Override // com.google.protobuf.l1
    public void D(List<Long> list) {
        int D;
        int D2;
        if (!(list instanceof m0)) {
            int b10 = b2.b(this.f7219b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f7218a.y()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                int E = this.f7218a.E();
                a0(E);
                int d10 = this.f7218a.d() + E;
                do {
                    list.add(Long.valueOf(this.f7218a.y()));
                } while (this.f7218a.d() < d10);
                return;
            }
        }
        m0 m0Var = (m0) list;
        int b11 = b2.b(this.f7219b);
        if (b11 == 1) {
            do {
                m0Var.m(this.f7218a.y());
                if (this.f7218a.e()) {
                    return;
                }
                D2 = this.f7218a.D();
            } while (D2 == this.f7219b);
            this.f7221d = D2;
        } else if (b11 != 2) {
            throw e0.e();
        } else {
            int E2 = this.f7218a.E();
            a0(E2);
            int d11 = this.f7218a.d() + E2;
            do {
                m0Var.m(this.f7218a.y());
            } while (this.f7218a.d() < d11);
        }
    }

    @Override // com.google.protobuf.l1
    public long E() {
        Y(0);
        return this.f7218a.w();
    }

    @Override // com.google.protobuf.l1
    public String F() {
        Y(2);
        return this.f7218a.C();
    }

    @Override // com.google.protobuf.l1
    public void G(List<Long> list) {
        int D;
        int D2;
        if (!(list instanceof m0)) {
            int b10 = b2.b(this.f7219b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f7218a.t()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                int E = this.f7218a.E();
                a0(E);
                int d10 = this.f7218a.d() + E;
                do {
                    list.add(Long.valueOf(this.f7218a.t()));
                } while (this.f7218a.d() < d10);
                return;
            }
        }
        m0 m0Var = (m0) list;
        int b11 = b2.b(this.f7219b);
        if (b11 == 1) {
            do {
                m0Var.m(this.f7218a.t());
                if (this.f7218a.e()) {
                    return;
                }
                D2 = this.f7218a.D();
            } while (D2 == this.f7219b);
            this.f7221d = D2;
        } else if (b11 != 2) {
            throw e0.e();
        } else {
            int E2 = this.f7218a.E();
            a0(E2);
            int d11 = this.f7218a.d() + E2;
            do {
                m0Var.m(this.f7218a.t());
            } while (this.f7218a.d() < d11);
        }
    }

    @Override // com.google.protobuf.l1
    public void H(List<Integer> list) {
        int D;
        int d10;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f7219b);
            if (b10 == 0) {
                do {
                    c0Var.l(this.f7218a.v());
                    if (this.f7218a.e()) {
                        return;
                    }
                    D2 = this.f7218a.D();
                } while (D2 == this.f7219b);
                this.f7221d = D2;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    c0Var.l(this.f7218a.v());
                } while (this.f7218a.d() < d10);
            }
        } else {
            int b11 = b2.b(this.f7219b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7218a.v()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b11 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    list.add(Integer.valueOf(this.f7218a.v()));
                } while (this.f7218a.d() < d10);
            }
        }
        X(d10);
    }

    @Override // com.google.protobuf.l1
    public void I(List<Integer> list) {
        int D;
        int d10;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f7219b);
            if (b10 == 0) {
                do {
                    c0Var.l(this.f7218a.r());
                    if (this.f7218a.e()) {
                        return;
                    }
                    D2 = this.f7218a.D();
                } while (D2 == this.f7219b);
                this.f7221d = D2;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    c0Var.l(this.f7218a.r());
                } while (this.f7218a.d() < d10);
            }
        } else {
            int b11 = b2.b(this.f7219b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7218a.r()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b11 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    list.add(Integer.valueOf(this.f7218a.r()));
                } while (this.f7218a.d() < d10);
            }
        }
        X(d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l1
    @Deprecated
    public <T> void J(List<T> list, n1<T> n1Var, q qVar) {
        int D;
        if (b2.b(this.f7219b) != 3) {
            throw e0.e();
        }
        int i10 = this.f7219b;
        do {
            list.add(U(n1Var, qVar));
            if (this.f7218a.e() || this.f7221d != 0) {
                return;
            }
            D = this.f7218a.D();
        } while (D == i10);
        this.f7221d = D;
    }

    @Override // com.google.protobuf.l1
    public <T> T K(Class<T> cls, q qVar) {
        Y(2);
        return (T) V(i1.a().c(cls), qVar);
    }

    @Override // com.google.protobuf.l1
    public <T> void L(T t10, n1<T> n1Var, q qVar) {
        Y(3);
        R(t10, n1Var, qVar);
    }

    @Override // com.google.protobuf.l1
    @Deprecated
    public <T> T M(Class<T> cls, q qVar) {
        Y(3);
        return (T) U(i1.a().c(cls), qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l1
    public <T> void N(List<T> list, n1<T> n1Var, q qVar) {
        int D;
        if (b2.b(this.f7219b) != 2) {
            throw e0.e();
        }
        int i10 = this.f7219b;
        do {
            list.add(V(n1Var, qVar));
            if (this.f7218a.e() || this.f7221d != 0) {
                return;
            }
            D = this.f7218a.D();
        } while (D == i10);
        this.f7221d = D;
    }

    @Override // com.google.protobuf.l1
    public <T> void O(T t10, n1<T> n1Var, q qVar) {
        Y(2);
        S(t10, n1Var, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void P(java.util.Map<K, V> r8, com.google.protobuf.o0.a<K, V> r9, com.google.protobuf.q r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.j r1 = r7.f7218a
            int r1 = r1.E()
            com.google.protobuf.j r2 = r7.f7218a
            int r1 = r2.n(r1)
            K r2 = r9.f7270b
            V r3 = r9.f7272d
        L14:
            int r4 = r7.p()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.j r5 = r7.f7218a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.y()     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.e0 r4 = new com.google.protobuf.e0     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.b2$b r4 = r9.f7271c     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f7272d     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.b2$b r4 = r9.f7269a     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: com.google.protobuf.e0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.y()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.e0 r8 = new com.google.protobuf.e0     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.j r8 = r7.f7218a
            r8.m(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.j r9 = r7.f7218a
            r9.m(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.P(java.util.Map, com.google.protobuf.o0$a, com.google.protobuf.q):void");
    }

    public void W(List<String> list, boolean z10) {
        int D;
        int D2;
        if (b2.b(this.f7219b) != 2) {
            throw e0.e();
        }
        if (!(list instanceof k0) || z10) {
            do {
                list.add(z10 ? F() : m());
                if (this.f7218a.e()) {
                    return;
                }
                D = this.f7218a.D();
            } while (D == this.f7219b);
            this.f7221d = D;
            return;
        }
        k0 k0Var = (k0) list;
        do {
            k0Var.j(u());
            if (this.f7218a.e()) {
                return;
            }
            D2 = this.f7218a.D();
        } while (D2 == this.f7219b);
        this.f7221d = D2;
    }

    @Override // com.google.protobuf.l1
    public void a(List<Integer> list) {
        int D;
        int d10;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f7219b);
            if (b10 == 0) {
                do {
                    c0Var.l(this.f7218a.z());
                    if (this.f7218a.e()) {
                        return;
                    }
                    D2 = this.f7218a.D();
                } while (D2 == this.f7219b);
                this.f7221d = D2;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    c0Var.l(this.f7218a.z());
                } while (this.f7218a.d() < d10);
            }
        } else {
            int b11 = b2.b(this.f7219b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7218a.z()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b11 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    list.add(Integer.valueOf(this.f7218a.z()));
                } while (this.f7218a.d() < d10);
            }
        }
        X(d10);
    }

    @Override // com.google.protobuf.l1
    public int b() {
        Y(0);
        return this.f7218a.r();
    }

    @Override // com.google.protobuf.l1
    public int c() {
        return this.f7219b;
    }

    @Override // com.google.protobuf.l1
    public long d() {
        Y(0);
        return this.f7218a.F();
    }

    @Override // com.google.protobuf.l1
    public void e(List<Integer> list) {
        int D;
        int D2;
        if (!(list instanceof c0)) {
            int b10 = b2.b(this.f7219b);
            if (b10 == 2) {
                int E = this.f7218a.E();
                Z(E);
                int d10 = this.f7218a.d() + E;
                do {
                    list.add(Integer.valueOf(this.f7218a.s()));
                } while (this.f7218a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw e0.e();
            } else {
                do {
                    list.add(Integer.valueOf(this.f7218a.s()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            }
        }
        c0 c0Var = (c0) list;
        int b11 = b2.b(this.f7219b);
        if (b11 == 2) {
            int E2 = this.f7218a.E();
            Z(E2);
            int d11 = this.f7218a.d() + E2;
            do {
                c0Var.l(this.f7218a.s());
            } while (this.f7218a.d() < d11);
        } else if (b11 != 5) {
            throw e0.e();
        } else {
            do {
                c0Var.l(this.f7218a.s());
                if (this.f7218a.e()) {
                    return;
                }
                D2 = this.f7218a.D();
            } while (D2 == this.f7219b);
            this.f7221d = D2;
        }
    }

    @Override // com.google.protobuf.l1
    public long f() {
        Y(1);
        return this.f7218a.t();
    }

    @Override // com.google.protobuf.l1
    public void g(List<Integer> list) {
        int D;
        int D2;
        if (!(list instanceof c0)) {
            int b10 = b2.b(this.f7219b);
            if (b10 == 2) {
                int E = this.f7218a.E();
                Z(E);
                int d10 = this.f7218a.d() + E;
                do {
                    list.add(Integer.valueOf(this.f7218a.x()));
                } while (this.f7218a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw e0.e();
            } else {
                do {
                    list.add(Integer.valueOf(this.f7218a.x()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            }
        }
        c0 c0Var = (c0) list;
        int b11 = b2.b(this.f7219b);
        if (b11 == 2) {
            int E2 = this.f7218a.E();
            Z(E2);
            int d11 = this.f7218a.d() + E2;
            do {
                c0Var.l(this.f7218a.x());
            } while (this.f7218a.d() < d11);
        } else if (b11 != 5) {
            throw e0.e();
        } else {
            do {
                c0Var.l(this.f7218a.x());
                if (this.f7218a.e()) {
                    return;
                }
                D2 = this.f7218a.D();
            } while (D2 == this.f7219b);
            this.f7221d = D2;
        }
    }

    @Override // com.google.protobuf.l1
    public int h() {
        Y(0);
        return this.f7218a.z();
    }

    @Override // com.google.protobuf.l1
    public void i(List<Long> list) {
        int D;
        int d10;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b10 = b2.b(this.f7219b);
            if (b10 == 0) {
                do {
                    m0Var.m(this.f7218a.A());
                    if (this.f7218a.e()) {
                        return;
                    }
                    D2 = this.f7218a.D();
                } while (D2 == this.f7219b);
                this.f7221d = D2;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    m0Var.m(this.f7218a.A());
                } while (this.f7218a.d() < d10);
            }
        } else {
            int b11 = b2.b(this.f7219b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7218a.A()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b11 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    list.add(Long.valueOf(this.f7218a.A()));
                } while (this.f7218a.d() < d10);
            }
        }
        X(d10);
    }

    @Override // com.google.protobuf.l1
    public long j() {
        Y(0);
        return this.f7218a.A();
    }

    @Override // com.google.protobuf.l1
    public void k(List<Integer> list) {
        int D;
        int d10;
        int D2;
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            int b10 = b2.b(this.f7219b);
            if (b10 == 0) {
                do {
                    c0Var.l(this.f7218a.E());
                    if (this.f7218a.e()) {
                        return;
                    }
                    D2 = this.f7218a.D();
                } while (D2 == this.f7219b);
                this.f7221d = D2;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    c0Var.l(this.f7218a.E());
                } while (this.f7218a.d() < d10);
            }
        } else {
            int b11 = b2.b(this.f7219b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f7218a.E()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b11 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    list.add(Integer.valueOf(this.f7218a.E()));
                } while (this.f7218a.d() < d10);
            }
        }
        X(d10);
    }

    @Override // com.google.protobuf.l1
    public void l(List<Boolean> list) {
        int D;
        int d10;
        int D2;
        if (list instanceof g) {
            g gVar = (g) list;
            int b10 = b2.b(this.f7219b);
            if (b10 == 0) {
                do {
                    gVar.m(this.f7218a.o());
                    if (this.f7218a.e()) {
                        return;
                    }
                    D2 = this.f7218a.D();
                } while (D2 == this.f7219b);
                this.f7221d = D2;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    gVar.m(this.f7218a.o());
                } while (this.f7218a.d() < d10);
            }
        } else {
            int b11 = b2.b(this.f7219b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f7218a.o()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b11 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    list.add(Boolean.valueOf(this.f7218a.o()));
                } while (this.f7218a.d() < d10);
            }
        }
        X(d10);
    }

    @Override // com.google.protobuf.l1
    public String m() {
        Y(2);
        return this.f7218a.B();
    }

    @Override // com.google.protobuf.l1
    public int n() {
        Y(5);
        return this.f7218a.s();
    }

    @Override // com.google.protobuf.l1
    public boolean o() {
        Y(0);
        return this.f7218a.o();
    }

    @Override // com.google.protobuf.l1
    public int p() {
        int i10 = this.f7221d;
        if (i10 != 0) {
            this.f7219b = i10;
            this.f7221d = 0;
        } else {
            this.f7219b = this.f7218a.D();
        }
        int i11 = this.f7219b;
        if (i11 == 0 || i11 == this.f7220c) {
            return Integer.MAX_VALUE;
        }
        return b2.a(i11);
    }

    @Override // com.google.protobuf.l1
    public void q(List<String> list) {
        W(list, false);
    }

    @Override // com.google.protobuf.l1
    public long r() {
        Y(1);
        return this.f7218a.y();
    }

    @Override // com.google.protobuf.l1
    public double readDouble() {
        Y(1);
        return this.f7218a.q();
    }

    @Override // com.google.protobuf.l1
    public float readFloat() {
        Y(5);
        return this.f7218a.u();
    }

    @Override // com.google.protobuf.l1
    public void s(List<Long> list) {
        int D;
        int d10;
        int D2;
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            int b10 = b2.b(this.f7219b);
            if (b10 == 0) {
                do {
                    m0Var.m(this.f7218a.F());
                    if (this.f7218a.e()) {
                        return;
                    }
                    D2 = this.f7218a.D();
                } while (D2 == this.f7219b);
                this.f7221d = D2;
                return;
            } else if (b10 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    m0Var.m(this.f7218a.F());
                } while (this.f7218a.d() < d10);
            }
        } else {
            int b11 = b2.b(this.f7219b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f7218a.F()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            } else if (b11 != 2) {
                throw e0.e();
            } else {
                d10 = this.f7218a.d() + this.f7218a.E();
                do {
                    list.add(Long.valueOf(this.f7218a.F()));
                } while (this.f7218a.d() < d10);
            }
        }
        X(d10);
    }

    @Override // com.google.protobuf.l1
    public void t(List<String> list) {
        W(list, true);
    }

    @Override // com.google.protobuf.l1
    public i u() {
        Y(2);
        return this.f7218a.p();
    }

    @Override // com.google.protobuf.l1
    public void v(List<Float> list) {
        int D;
        int D2;
        if (!(list instanceof x)) {
            int b10 = b2.b(this.f7219b);
            if (b10 == 2) {
                int E = this.f7218a.E();
                Z(E);
                int d10 = this.f7218a.d() + E;
                do {
                    list.add(Float.valueOf(this.f7218a.u()));
                } while (this.f7218a.d() < d10);
                return;
            } else if (b10 != 5) {
                throw e0.e();
            } else {
                do {
                    list.add(Float.valueOf(this.f7218a.u()));
                    if (this.f7218a.e()) {
                        return;
                    }
                    D = this.f7218a.D();
                } while (D == this.f7219b);
                this.f7221d = D;
                return;
            }
        }
        x xVar = (x) list;
        int b11 = b2.b(this.f7219b);
        if (b11 == 2) {
            int E2 = this.f7218a.E();
            Z(E2);
            int d11 = this.f7218a.d() + E2;
            do {
                xVar.l(this.f7218a.u());
            } while (this.f7218a.d() < d11);
        } else if (b11 != 5) {
            throw e0.e();
        } else {
            do {
                xVar.l(this.f7218a.u());
                if (this.f7218a.e()) {
                    return;
                }
                D2 = this.f7218a.D();
            } while (D2 == this.f7219b);
            this.f7221d = D2;
        }
    }

    @Override // com.google.protobuf.l1
    public int w() {
        Y(0);
        return this.f7218a.E();
    }

    @Override // com.google.protobuf.l1
    public int x() {
        Y(0);
        return this.f7218a.v();
    }

    @Override // com.google.protobuf.l1
    public boolean y() {
        int i10;
        if (this.f7218a.e() || (i10 = this.f7219b) == this.f7220c) {
            return false;
        }
        return this.f7218a.H(i10);
    }

    @Override // com.google.protobuf.l1
    public int z() {
        Y(5);
        return this.f7218a.x();
    }
}
