package com.google.android.gms.internal.p000firebaseauthapi;

import a6.e0;
import a6.f1;
import android.text.TextUtils;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.by  reason: invalid package */
/* loaded from: classes.dex */
public final class by extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final String f4412y;

    public by(String str) {
        super(1);
        s.g(str, "refresh token cannot be null");
        this.f4412y = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.s(this.f4412y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        if (TextUtils.isEmpty(this.f4781j.F())) {
            this.f4781j.I(this.f4412y);
        }
        ((f1) this.f4776e).a(this.f4781j, this.f4775d);
        l(e0.a(this.f4781j.E()));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "getAccessToken";
    }
}
