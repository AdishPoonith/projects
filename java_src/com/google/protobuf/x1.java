package com.google.protobuf;
/* loaded from: classes.dex */
class x1 extends v1<w1, w1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: A */
    public w1 g(Object obj) {
        return ((z) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: B */
    public int h(w1 w1Var) {
        return w1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: C */
    public int i(w1 w1Var) {
        return w1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: D */
    public w1 k(w1 w1Var, w1 w1Var2) {
        return w1.c().equals(w1Var2) ? w1Var : w1.c().equals(w1Var) ? w1.j(w1Var, w1Var2) : w1Var.i(w1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: E */
    public w1 n() {
        return w1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: F */
    public void o(Object obj, w1 w1Var) {
        p(obj, w1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: G */
    public void p(Object obj, w1 w1Var) {
        ((z) obj).unknownFields = w1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: H */
    public w1 r(w1 w1Var) {
        w1Var.h();
        return w1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: I */
    public void s(w1 w1Var, c2 c2Var) {
        w1Var.p(c2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: J */
    public void t(w1 w1Var, c2 c2Var) {
        w1Var.r(c2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    public void j(Object obj) {
        g(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    public boolean q(l1 l1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: u */
    public void a(w1 w1Var, int i10, int i11) {
        w1Var.n(b2.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: v */
    public void b(w1 w1Var, int i10, long j10) {
        w1Var.n(b2.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: w */
    public void c(w1 w1Var, int i10, w1 w1Var2) {
        w1Var.n(b2.c(i10, 3), w1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: x */
    public void d(w1 w1Var, int i10, i iVar) {
        w1Var.n(b2.c(i10, 2), iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: y */
    public void e(w1 w1Var, int i10, long j10) {
        w1Var.n(b2.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.v1
    /* renamed from: z */
    public w1 f(Object obj) {
        w1 g10 = g(obj);
        if (g10 == w1.c()) {
            w1 k10 = w1.k();
            p(obj, k10);
            return k10;
        }
        return g10;
    }
}
