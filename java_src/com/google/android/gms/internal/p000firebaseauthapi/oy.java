package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.oy  reason: invalid package */
/* loaded from: classes.dex */
public final class oy extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final ov f5158y;

    public oy(String str, e eVar) {
        super(6);
        s.g(str, "token cannot be null or empty");
        this.f5158y = new ov(str, eVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.A(this.f5158y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        l(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "sendEmailVerification";
    }
}
