package com.google.firebase.auth;

import com.google.firebase.auth.q0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h2 extends q0.b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q0.b f6535b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6536c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(FirebaseAuth firebaseAuth, q0.b bVar) {
        this.f6536c = firebaseAuth;
        this.f6535b = bVar;
    }

    @Override // com.google.firebase.auth.q0.b
    public final void a(String str) {
    }

    @Override // com.google.firebase.auth.q0.b
    public final void b(String str, q0.a aVar) {
        a6.v1 v1Var;
        q0.b bVar = this.f6535b;
        v1Var = this.f6536c.f6462g;
        bVar.c(q0.a(str, (String) c4.s.j(v1Var.e())));
    }

    @Override // com.google.firebase.auth.q0.b
    public final void c(o0 o0Var) {
        this.f6535b.c(o0Var);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void d(w5.l lVar) {
        this.f6535b.d(lVar);
    }
}
