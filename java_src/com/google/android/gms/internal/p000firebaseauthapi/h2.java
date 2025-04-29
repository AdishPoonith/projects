package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h2  reason: invalid package */
/* loaded from: classes.dex */
public final class h2 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f4669j;

    /* renamed from: k  reason: collision with root package name */
    private final String f4670k = "CLIENT_TYPE_ANDROID";

    /* renamed from: l  reason: collision with root package name */
    private final String f4671l = "RECAPTCHA_ENTERPRISE";

    private h2(String str, String str2) {
        this.f4669j = str;
    }

    public static h2 a(String str, String str2) {
        return new h2(str, "RECAPTCHA_ENTERPRISE");
    }

    public final String b() {
        return this.f4670k;
    }

    public final String c() {
        return this.f4671l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f4669j)) {
            jSONObject.put("tenantId", this.f4669j);
        }
        if (!TextUtils.isEmpty(this.f4670k)) {
            jSONObject.put("clientType", this.f4670k);
        }
        if (!TextUtils.isEmpty(this.f4671l)) {
            jSONObject.put("recaptchaVersion", this.f4671l);
        }
        return jSONObject.toString();
    }
}
