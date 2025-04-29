package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dy  reason: invalid package */
/* loaded from: classes.dex */
public final class dy extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final mv f4519y;

    public dy(String str, String str2) {
        super(10);
        s.f("RECAPTCHA_ENTERPRISE");
        this.f4519y = new mv(str, "RECAPTCHA_ENTERPRISE");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.v(this.f4519y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        l(this.f4791t);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "getRecaptchaConfig";
    }
}
