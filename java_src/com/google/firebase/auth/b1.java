package com.google.firebase.auth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b1 implements a6.f1 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6488a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(FirebaseAuth firebaseAuth) {
        this.f6488a = firebaseAuth;
    }

    @Override // a6.f1
    public final void a(com.google.android.gms.internal.p000firebaseauthapi.j2 j2Var, a0 a0Var) {
        c4.s.j(j2Var);
        c4.s.j(a0Var);
        a0Var.d0(j2Var);
        this.f6488a.W(a0Var, j2Var, true);
    }
}
