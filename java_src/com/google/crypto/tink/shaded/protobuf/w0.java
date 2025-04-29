package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.v;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class w0<T> implements h1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f6427a;

    /* renamed from: b  reason: collision with root package name */
    private final o1<?, ?> f6428b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6429c;

    /* renamed from: d  reason: collision with root package name */
    private final r<?> f6430d;

    private w0(o1<?, ?> o1Var, r<?> rVar, s0 s0Var) {
        this.f6428b = o1Var;
        this.f6429c = rVar.e(s0Var);
        this.f6430d = rVar;
        this.f6427a = s0Var;
    }

    private <UT, UB> int k(o1<UT, UB> o1Var, T t10) {
        return o1Var.i(o1Var.g(t10));
    }

    private <UT, UB, ET extends v.b<ET>> void l(o1<UT, UB> o1Var, r<ET> rVar, T t10, g1 g1Var, q qVar) {
        UB f10 = o1Var.f(t10);
        v<ET> d10 = rVar.d(t10);
        do {
            try {
                if (g1Var.p() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                o1Var.o(t10, f10);
            }
        } while (n(g1Var, qVar, rVar, d10, o1Var, f10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> w0<T> m(o1<?, ?> o1Var, r<?> rVar, s0 s0Var) {
        return new w0<>(o1Var, rVar, s0Var);
    }

    private <UT, UB, ET extends v.b<ET>> boolean n(g1 g1Var, q qVar, r<ET> rVar, v<ET> vVar, o1<UT, UB> o1Var, UB ub) {
        int c10 = g1Var.c();
        if (c10 != u1.f6326a) {
            if (u1.b(c10) == 2) {
                Object b10 = rVar.b(qVar, this.f6427a, u1.a(c10));
                if (b10 != null) {
                    rVar.h(g1Var, b10, qVar, vVar);
                    return true;
                }
                return o1Var.m(ub, g1Var);
            }
            return g1Var.y();
        }
        int i10 = 0;
        Object obj = null;
        i iVar = null;
        while (g1Var.p() != Integer.MAX_VALUE) {
            int c11 = g1Var.c();
            if (c11 == u1.f6328c) {
                i10 = g1Var.w();
                obj = rVar.b(qVar, this.f6427a, i10);
            } else if (c11 == u1.f6329d) {
                if (obj != null) {
                    rVar.h(g1Var, obj, qVar, vVar);
                } else {
                    iVar = g1Var.u();
                }
            } else if (!g1Var.y()) {
                break;
            }
        }
        if (g1Var.c() == u1.f6327b) {
            if (iVar != null) {
                if (obj != null) {
                    rVar.i(iVar, obj, qVar, vVar);
                } else {
                    o1Var.d(ub, i10, iVar);
                }
            }
            return true;
        }
        throw c0.b();
    }

    private <UT, UB> void o(o1<UT, UB> o1Var, T t10, v1 v1Var) {
        o1Var.s(o1Var.g(t10), v1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void a(T t10, T t11) {
        j1.G(this.f6428b, t10, t11);
        if (this.f6429c) {
            j1.E(this.f6430d, t10, t11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void b(T t10) {
        this.f6428b.j(t10);
        this.f6430d.f(t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public final boolean c(T t10) {
        return this.f6430d.c(t10).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public boolean d(T t10, T t11) {
        if (this.f6428b.g(t10).equals(this.f6428b.g(t11))) {
            if (this.f6429c) {
                return this.f6430d.c(t10).equals(this.f6430d.c(t11));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public int e(T t10) {
        int k10 = k(this.f6428b, t10) + 0;
        return this.f6429c ? k10 + this.f6430d.c(t10).j() : k10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public T f() {
        return (T) this.f6427a.g().e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public int g(T t10) {
        int hashCode = this.f6428b.g(t10).hashCode();
        return this.f6429c ? (hashCode * 53) + this.f6430d.c(t10).hashCode() : hashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(T r11, byte[] r12, int r13, int r14, com.google.crypto.tink.shaded.protobuf.e.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.crypto.tink.shaded.protobuf.z r0 = (com.google.crypto.tink.shaded.protobuf.z) r0
            com.google.crypto.tink.shaded.protobuf.p1 r1 = r0.unknownFields
            com.google.crypto.tink.shaded.protobuf.p1 r2 = com.google.crypto.tink.shaded.protobuf.p1.c()
            if (r1 != r2) goto L11
            com.google.crypto.tink.shaded.protobuf.p1 r1 = com.google.crypto.tink.shaded.protobuf.p1.j()
            r0.unknownFields = r1
        L11:
            com.google.crypto.tink.shaded.protobuf.z$c r11 = (com.google.crypto.tink.shaded.protobuf.z.c) r11
            com.google.crypto.tink.shaded.protobuf.v r11 = r11.N()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r13, r15)
            int r13 = r15.f6158a
            int r3 = com.google.crypto.tink.shaded.protobuf.u1.f6326a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.crypto.tink.shaded.protobuf.u1.b(r13)
            if (r3 != r5) goto L66
            com.google.crypto.tink.shaded.protobuf.r<?> r2 = r10.f6430d
            com.google.crypto.tink.shaded.protobuf.q r3 = r15.f6161d
            com.google.crypto.tink.shaded.protobuf.s0 r5 = r10.f6427a
            int r6 = com.google.crypto.tink.shaded.protobuf.u1.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.crypto.tink.shaded.protobuf.z$e r8 = (com.google.crypto.tink.shaded.protobuf.z.e) r8
            if (r8 == 0) goto L5b
            com.google.crypto.tink.shaded.protobuf.d1 r13 = com.google.crypto.tink.shaded.protobuf.d1.a()
            com.google.crypto.tink.shaded.protobuf.s0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.crypto.tink.shaded.protobuf.h1 r13 = r13.d(r2)
            int r13 = com.google.crypto.tink.shaded.protobuf.e.p(r13, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.z$d r2 = r8.f6445b
            java.lang.Object r3 = r15.f6160c
            r11.w(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.crypto.tink.shaded.protobuf.e.G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.crypto.tink.shaded.protobuf.e.N(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r6 = r15.f6158a
            int r7 = com.google.crypto.tink.shaded.protobuf.u1.a(r6)
            int r8 = com.google.crypto.tink.shaded.protobuf.u1.b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.crypto.tink.shaded.protobuf.d1 r6 = com.google.crypto.tink.shaded.protobuf.d1.a()
            com.google.crypto.tink.shaded.protobuf.s0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.crypto.tink.shaded.protobuf.h1 r6 = r6.d(r7)
            int r4 = com.google.crypto.tink.shaded.protobuf.e.p(r6, r12, r4, r14, r15)
            com.google.crypto.tink.shaded.protobuf.z$d r6 = r2.f6445b
            java.lang.Object r7 = r15.f6160c
            r11.w(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.b(r12, r4, r15)
            java.lang.Object r3 = r15.f6160c
            com.google.crypto.tink.shaded.protobuf.i r3 = (com.google.crypto.tink.shaded.protobuf.i) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.crypto.tink.shaded.protobuf.e.I(r12, r4, r15)
            int r13 = r15.f6158a
            com.google.crypto.tink.shaded.protobuf.r<?> r2 = r10.f6430d
            com.google.crypto.tink.shaded.protobuf.q r6 = r15.f6161d
            com.google.crypto.tink.shaded.protobuf.s0 r7 = r10.f6427a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.crypto.tink.shaded.protobuf.z$e r2 = (com.google.crypto.tink.shaded.protobuf.z.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.crypto.tink.shaded.protobuf.u1.f6327b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.crypto.tink.shaded.protobuf.e.N(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.crypto.tink.shaded.protobuf.u1.c(r13, r5)
            r1.m(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.crypto.tink.shaded.protobuf.c0 r11 = com.google.crypto.tink.shaded.protobuf.c0.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.w0.h(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void i(T t10, v1 v1Var) {
        Iterator<Map.Entry<?, Object>> r10 = this.f6430d.c(t10).r();
        while (r10.hasNext()) {
            Map.Entry<?, Object> next = r10.next();
            v.b bVar = (v.b) next.getKey();
            if (bVar.e() != u1.c.MESSAGE || bVar.c() || bVar.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            v1Var.f(bVar.a(), next instanceof e0.b ? ((e0.b) next).a().e() : next.getValue());
        }
        o(this.f6428b, t10, v1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.h1
    public void j(T t10, g1 g1Var, q qVar) {
        l(this.f6428b, this.f6430d, t10, g1Var, qVar);
    }
}
