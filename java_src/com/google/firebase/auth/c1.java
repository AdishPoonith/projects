package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c1 implements a6.y0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6491a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(FirebaseAuth firebaseAuth) {
        this.f6491a = firebaseAuth;
    }

    @Override // a6.f1
    public final void a(com.google.android.gms.internal.p000firebaseauthapi.j2 j2Var, a0 a0Var) {
        c4.s.j(j2Var);
        c4.s.j(a0Var);
        a0Var.d0(j2Var);
        FirebaseAuth.Z(this.f6491a, a0Var, j2Var, true, true);
    }

    @Override // a6.r
    public final void z(Status status) {
        if (status.C() == 17011 || status.C() == 17021 || status.C() == 17005 || status.C() == 17091) {
            this.f6491a.C();
        }
    }
}
