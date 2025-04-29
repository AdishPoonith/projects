package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o1  reason: invalid package */
/* loaded from: classes.dex */
public final class o1 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5090j;

    public o1(String str) {
        this.f5090j = s.f(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f5090j);
        return jSONObject.toString();
    }
}
