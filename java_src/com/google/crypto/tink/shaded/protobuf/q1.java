package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
class q1 extends o1<p1, p1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: A */
    public p1 g(Object obj) {
        return ((z) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: B */
    public int h(p1 p1Var) {
        return p1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: C */
    public int i(p1 p1Var) {
        return p1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: D */
    public p1 k(p1 p1Var, p1 p1Var2) {
        return p1Var2.equals(p1.c()) ? p1Var : p1.i(p1Var, p1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: E */
    public p1 n() {
        return p1.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: F */
    public void o(Object obj, p1 p1Var) {
        p(obj, p1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: G */
    public void p(Object obj, p1 p1Var) {
        ((z) obj).unknownFields = p1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: H */
    public p1 r(p1 p1Var) {
        p1Var.h();
        return p1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: I */
    public void s(p1 p1Var, v1 v1Var) {
        p1Var.o(v1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: J */
    public void t(p1 p1Var, v1 v1Var) {
        p1Var.q(v1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    public void j(Object obj) {
        g(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    public boolean q(g1 g1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: u */
    public void a(p1 p1Var, int i10, int i11) {
        p1Var.m(u1.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: v */
    public void b(p1 p1Var, int i10, long j10) {
        p1Var.m(u1.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: w */
    public void c(p1 p1Var, int i10, p1 p1Var2) {
        p1Var.m(u1.c(i10, 3), p1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: x */
    public void d(p1 p1Var, int i10, i iVar) {
        p1Var.m(u1.c(i10, 2), iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: y */
    public void e(p1 p1Var, int i10, long j10) {
        p1Var.m(u1.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.o1
    /* renamed from: z */
    public p1 f(Object obj) {
        p1 g10 = g(obj);
        if (g10 == p1.c()) {
            p1 j10 = p1.j();
            p(obj, j10);
            return j10;
        }
        return g10;
    }
}
