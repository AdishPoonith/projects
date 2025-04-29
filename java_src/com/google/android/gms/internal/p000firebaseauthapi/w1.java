package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w1  reason: invalid package */
/* loaded from: classes.dex */
public final class w1 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5566j = v1.REFRESH_TOKEN.toString();

    /* renamed from: k  reason: collision with root package name */
    private final String f5567k;

    public w1(String str) {
        this.f5567k = s.f(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.f5566j);
        jSONObject.put("refreshToken", this.f5567k);
        return jSONObject.toString();
    }
}
