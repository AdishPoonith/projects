package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u1  reason: invalid package */
/* loaded from: classes.dex */
public final class u1 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5410j = s.f("phone");

    /* renamed from: k  reason: collision with root package name */
    private final String f5411k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5412l;

    /* renamed from: m  reason: collision with root package name */
    private final String f5413m;

    /* renamed from: n  reason: collision with root package name */
    private final String f5414n;

    u1(String str, String str2, String str3, String str4, String str5) {
        this.f5411k = s.f(str2);
        this.f5412l = str3;
        this.f5413m = str4;
        this.f5414n = str5;
    }

    public static u1 a(String str, String str2, String str3, String str4) {
        s.f(str3);
        s.f(str2);
        return new u1("phone", str, str2, str3, str4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f5412l;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.f5413m;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.f5411k);
        String str3 = this.f5414n;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
