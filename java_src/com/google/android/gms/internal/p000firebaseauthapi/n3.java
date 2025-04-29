package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n3  reason: invalid package */
/* loaded from: classes.dex */
public final class n3 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5052j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5053k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5054l;

    /* renamed from: m  reason: collision with root package name */
    private final String f5055m;

    public n3(String str, String str2, String str3, String str4) {
        this.f5052j = s.f(str);
        this.f5053k = s.f(str2);
        this.f5054l = str3;
        this.f5055m = str4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f5052j);
        jSONObject.put("password", this.f5053k);
        jSONObject.put("returnSecureToken", true);
        String str = this.f5054l;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f5055m;
        if (str2 != null) {
            t3.d(jSONObject, "captchaResponse", str2);
        } else {
            t3.c(jSONObject);
        }
        return jSONObject.toString();
    }
}
