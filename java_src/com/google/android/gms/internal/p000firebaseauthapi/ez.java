package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.z0;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ez  reason: invalid package */
/* loaded from: classes.dex */
public final class ez extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final z0 f4562y;

    public ez(z0 z0Var) {
        super(2);
        this.f4562y = (z0) s.k(z0Var, "request cannot be null");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.g(this.f4775d.b0(), this.f4562y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        ((f1) this.f4776e).a(this.f4781j, e.r(this.f4774c, this.f4782k));
        l(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "updateProfile";
    }
}
