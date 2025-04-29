package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s2 implements a6.y0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6607a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2(FirebaseAuth firebaseAuth) {
        this.f6607a = firebaseAuth;
    }

    @Override // a6.f1
    public final void a(com.google.android.gms.internal.p000firebaseauthapi.j2 j2Var, a0 a0Var) {
        FirebaseAuth.Z(this.f6607a, a0Var, j2Var, true, true);
    }

    @Override // a6.r
    public final void z(Status status) {
        int C = status.C();
        if (C == 17011 || C == 17021 || C == 17005) {
            this.f6607a.C();
        }
    }
}
