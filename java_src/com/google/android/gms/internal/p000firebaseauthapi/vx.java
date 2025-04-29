package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vx  reason: invalid package */
/* loaded from: classes.dex */
public final class vx extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final kv f5556y;

    public vx(String str, String str2, String str3) {
        super(4);
        s.g(str, "code cannot be null or empty");
        s.g(str2, "new password cannot be null or empty");
        this.f5556y = new kv(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.n(this.f5556y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        l(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "confirmPasswordReset";
    }
}
