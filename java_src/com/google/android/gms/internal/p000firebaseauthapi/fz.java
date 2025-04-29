package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fz  reason: invalid package */
/* loaded from: classes.dex */
public final class fz extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final uv f4598y;

    public fz(String str, String str2, e eVar) {
        super(6);
        s.f(str);
        s.f(str2);
        s.j(eVar);
        this.f4598y = new uv(str, str2, eVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.h(this.f4598y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        l(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }
}
