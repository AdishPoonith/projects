package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x1  reason: invalid package */
/* loaded from: classes.dex */
public final class x1 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5618j;

    public x1(String str) {
        this.f5618j = s.f(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f5618j);
        return jSONObject.toString();
    }
}
