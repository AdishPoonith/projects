package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n2 implements a6.q {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f6569a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6570b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n2(FirebaseAuth firebaseAuth, a0 a0Var) {
        this.f6570b = firebaseAuth;
        this.f6569a = a0Var;
    }

    @Override // a6.r
    public final void z(Status status) {
        if (status.C() == 17011 || status.C() == 17021 || status.C() == 17005) {
            this.f6570b.C();
        }
    }

    @Override // a6.q
    public final void zza() {
        a0 a0Var;
        a0 a0Var2;
        FirebaseAuth firebaseAuth = this.f6570b;
        a0Var = firebaseAuth.f6461f;
        if (a0Var != null) {
            a0Var2 = firebaseAuth.f6461f;
            if (a0Var2.a().equalsIgnoreCase(this.f6569a.a())) {
                this.f6570b.U();
            }
        }
    }
}
