package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.t0;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xy  reason: invalid package */
/* loaded from: classes.dex */
public final class xy extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final tv f5683y;

    public xy(t0 t0Var, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        s.j(t0Var);
        s.f(str);
        this.f5683y = new tv(t0Var, str, str2, j10, z10, z11, str3, str4, z12);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.c(this.f5683y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }
}
