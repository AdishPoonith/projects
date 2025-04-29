package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t1  reason: invalid package */
/* loaded from: classes.dex */
public final class t1 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5357j = s.f("phone");

    /* renamed from: k  reason: collision with root package name */
    private String f5358k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5359l;

    /* renamed from: m  reason: collision with root package name */
    private final String f5360m;

    /* renamed from: n  reason: collision with root package name */
    private final String f5361n;

    private t1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f5358k = s.f(str2);
        this.f5360m = str3;
        this.f5361n = str4;
        this.f5359l = str5;
    }

    public static t1 a(String str, String str2, String str3, String str4, String str5) {
        s.f(str3);
        s.f(str2);
        return new t1("phone", str, str2, str3, str4, null);
    }

    public final t1 b(String str) {
        this.f5358k = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f5358k);
        jSONObject.put("mfaProvider", 1);
        String str = this.f5359l;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f5360m;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f5361n;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
