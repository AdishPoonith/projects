package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.h0;
import com.google.protobuf.v;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class z0<T> implements n1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f7422a;

    /* renamed from: b  reason: collision with root package name */
    private final v1<?, ?> f7423b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7424c;

    /* renamed from: d  reason: collision with root package name */
    private final r<?> f7425d;

    private z0(v1<?, ?> v1Var, r<?> rVar, v0 v0Var) {
        this.f7423b = v1Var;
        this.f7424c = rVar.e(v0Var);
        this.f7425d = rVar;
        this.f7422a = v0Var;
    }

    private <UT, UB> int k(v1<UT, UB> v1Var, T t10) {
        return v1Var.i(v1Var.g(t10));
    }

    private <UT, UB, ET extends v.b<ET>> void l(v1<UT, UB> v1Var, r<ET> rVar, T t10, l1 l1Var, q qVar) {
        UB f10 = v1Var.f(t10);
        v<ET> d10 = rVar.d(t10);
        do {
            try {
                if (l1Var.p() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                v1Var.o(t10, f10);
            }
        } while (n(l1Var, qVar, rVar, d10, v1Var, f10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> z0<T> m(v1<?, ?> v1Var, r<?> rVar, v0 v0Var) {
        return new z0<>(v1Var, rVar, v0Var);
    }

    private <UT, UB, ET extends v.b<ET>> boolean n(l1 l1Var, q qVar, r<ET> rVar, v<ET> vVar, v1<UT, UB> v1Var, UB ub) {
        int c10 = l1Var.c();
        if (c10 != b2.f7047a) {
            if (b2.b(c10) == 2) {
                Object b10 = rVar.b(qVar, this.f7422a, b2.a(c10));
                if (b10 != null) {
                    rVar.h(l1Var, b10, qVar, vVar);
                    return true;
                }
                return v1Var.m(ub, l1Var);
            }
            return l1Var.y();
        }
        int i10 = 0;
        Object obj = null;
        i iVar = null;
        while (l1Var.p() != Integer.MAX_VALUE) {
            int c11 = l1Var.c();
            if (c11 == b2.f7049c) {
                i10 = l1Var.w();
                obj = rVar.b(qVar, this.f7422a, i10);
            } else if (c11 == b2.f7050d) {
                if (obj != null) {
                    rVar.h(l1Var, obj, qVar, vVar);
                } else {
                    iVar = l1Var.u();
                }
            } else if (!l1Var.y()) {
                break;
            }
        }
        if (l1Var.c() == b2.f7048b) {
            if (iVar != null) {
                if (obj != null) {
                    rVar.i(iVar, obj, qVar, vVar);
                } else {
                    v1Var.d(ub, i10, iVar);
                }
            }
            return true;
        }
        throw e0.b();
    }

    private <UT, UB> void o(v1<UT, UB> v1Var, T t10, c2 c2Var) {
        v1Var.s(v1Var.g(t10), c2Var);
    }

    @Override // com.google.protobuf.n1
    public void a(T t10, T t11) {
        p1.G(this.f7423b, t10, t11);
        if (this.f7424c) {
            p1.E(this.f7425d, t10, t11);
        }
    }

    @Override // com.google.protobuf.n1
    public void b(T t10) {
        this.f7423b.j(t10);
        this.f7425d.f(t10);
    }

    @Override // com.google.protobuf.n1
    public final boolean c(T t10) {
        return this.f7425d.c(t10).p();
    }

    @Override // com.google.protobuf.n1
    public boolean d(T t10, T t11) {
        if (this.f7423b.g(t10).equals(this.f7423b.g(t11))) {
            if (this.f7424c) {
                return this.f7425d.c(t10).equals(this.f7425d.c(t11));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.n1
    public int e(T t10) {
        int k10 = k(this.f7423b, t10) + 0;
        return this.f7424c ? k10 + this.f7425d.c(t10).j() : k10;
    }

    @Override // com.google.protobuf.n1
    public T f() {
        v0 v0Var = this.f7422a;
        return v0Var instanceof z ? (T) ((z) v0Var).U() : (T) v0Var.g().e();
    }

    @Override // com.google.protobuf.n1
    public int g(T t10) {
        int hashCode = this.f7423b.g(t10).hashCode();
        return this.f7424c ? (hashCode * 53) + this.f7425d.c(t10).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.n1
    public void h(T t10, c2 c2Var) {
        Iterator<Map.Entry<?, Object>> t11 = this.f7425d.c(t10).t();
        while (t11.hasNext()) {
            Map.Entry<?, Object> next = t11.next();
            v.b bVar = (v.b) next.getKey();
            if (bVar.e() != b2.c.MESSAGE || bVar.c() || bVar.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            c2Var.f(bVar.a(), next instanceof h0.b ? ((h0.b) next).a().e() : next.getValue());
        }
        o(this.f7423b, t10, c2Var);
    }

    @Override // com.google.protobuf.n1
    public void i(T t10, l1 l1Var, q qVar) {
        l(this.f7423b, this.f7425d, t10, l1Var, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[EDGE_INSN: B:57:0x00cb->B:34:0x00cb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.protobuf.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(T r11, byte[] r12, int r13, int r14, com.google.protobuf.f.b r15) {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.z r0 = (com.google.protobuf.z) r0
            com.google.protobuf.w1 r1 = r0.unknownFields
            com.google.protobuf.w1 r2 = com.google.protobuf.w1.c()
            if (r1 != r2) goto L11
            com.google.protobuf.w1 r1 = com.google.protobuf.w1.k()
            r0.unknownFields = r1
        L11:
            com.google.protobuf.z$c r11 = (com.google.protobuf.z.c) r11
            com.google.protobuf.v r11 = r11.e0()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld7
            int r4 = com.google.protobuf.f.I(r12, r13, r15)
            int r13 = r15.f7107a
            int r3 = com.google.protobuf.b2.f7047a
            r5 = 2
            if (r13 == r3) goto L6b
            int r3 = com.google.protobuf.b2.b(r13)
            if (r3 != r5) goto L66
            com.google.protobuf.r<?> r2 = r10.f7425d
            com.google.protobuf.q r3 = r15.f7110d
            com.google.protobuf.v0 r5 = r10.f7422a
            int r6 = com.google.protobuf.b2.a(r13)
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.z$e r8 = (com.google.protobuf.z.e) r8
            if (r8 == 0) goto L5b
            com.google.protobuf.i1 r13 = com.google.protobuf.i1.a()
            com.google.protobuf.v0 r2 = r8.b()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.n1 r13 = r13.c(r2)
            int r13 = com.google.protobuf.f.p(r13, r12, r4, r14, r15)
            com.google.protobuf.z$d r2 = r8.f7413b
            java.lang.Object r3 = r15.f7109c
            r11.y(r2, r3)
            goto L64
        L5b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.f.G(r2, r3, r4, r5, r6, r7)
        L64:
            r2 = r8
            goto L19
        L66:
            int r13 = com.google.protobuf.f.P(r13, r12, r4, r14, r15)
            goto L19
        L6b:
            r13 = 0
            r3 = r0
        L6d:
            if (r4 >= r14) goto Lcb
            int r4 = com.google.protobuf.f.I(r12, r4, r15)
            int r6 = r15.f7107a
            int r7 = com.google.protobuf.b2.a(r6)
            int r8 = com.google.protobuf.b2.b(r6)
            if (r7 == r5) goto Lac
            r9 = 3
            if (r7 == r9) goto L83
            goto Lc1
        L83:
            if (r2 == 0) goto La1
            com.google.protobuf.i1 r6 = com.google.protobuf.i1.a()
            com.google.protobuf.v0 r7 = r2.b()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.n1 r6 = r6.c(r7)
            int r4 = com.google.protobuf.f.p(r6, r12, r4, r14, r15)
            com.google.protobuf.z$d r6 = r2.f7413b
            java.lang.Object r7 = r15.f7109c
            r11.y(r6, r7)
            goto L6d
        La1:
            if (r8 != r5) goto Lc1
            int r4 = com.google.protobuf.f.b(r12, r4, r15)
            java.lang.Object r3 = r15.f7109c
            com.google.protobuf.i r3 = (com.google.protobuf.i) r3
            goto L6d
        Lac:
            if (r8 != 0) goto Lc1
            int r4 = com.google.protobuf.f.I(r12, r4, r15)
            int r13 = r15.f7107a
            com.google.protobuf.r<?> r2 = r10.f7425d
            com.google.protobuf.q r6 = r15.f7110d
            com.google.protobuf.v0 r7 = r10.f7422a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            com.google.protobuf.z$e r2 = (com.google.protobuf.z.e) r2
            goto L6d
        Lc1:
            int r7 = com.google.protobuf.b2.f7048b
            if (r6 != r7) goto Lc6
            goto Lcb
        Lc6:
            int r4 = com.google.protobuf.f.P(r6, r12, r4, r14, r15)
            goto L6d
        Lcb:
            if (r3 == 0) goto Ld4
            int r13 = com.google.protobuf.b2.c(r13, r5)
            r1.n(r13, r3)
        Ld4:
            r13 = r4
            goto L19
        Ld7:
            if (r13 != r14) goto Lda
            return
        Lda:
            com.google.protobuf.e0 r11 = com.google.protobuf.e0.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z0.j(java.lang.Object, byte[], int, int, com.google.protobuf.f$b):void");
    }
}
