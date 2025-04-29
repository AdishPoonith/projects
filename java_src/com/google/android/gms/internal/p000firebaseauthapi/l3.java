package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l3  reason: invalid package */
/* loaded from: classes.dex */
public final class l3 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f4900j;

    /* renamed from: k  reason: collision with root package name */
    private final String f4901k;

    public l3(String str, String str2) {
        this.f4900j = s.f(str);
        this.f4901k = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f4900j);
        jSONObject.put("returnSecureToken", true);
        String str = this.f4901k;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
