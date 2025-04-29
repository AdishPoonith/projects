package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d  reason: invalid package */
/* loaded from: classes.dex */
public final class d extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final qv f4480y;

    public d(t2 t2Var) {
        super(8);
        s.j(t2Var);
        this.f4480y = new qv(t2Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.C(this.f4480y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "verifyPhoneNumber";
    }
}
