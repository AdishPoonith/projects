package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m1  reason: invalid package */
/* loaded from: classes.dex */
public final class m1 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f4980j;

    /* renamed from: k  reason: collision with root package name */
    private final String f4981k = "http://localhost";

    /* renamed from: l  reason: collision with root package name */
    private final String f4982l;

    public m1(String str, String str2) {
        this.f4980j = s.f(str);
        this.f4982l = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f4980j);
        jSONObject.put("continueUri", this.f4981k);
        String str = this.f4982l;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
