package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c3  reason: invalid package */
/* loaded from: classes.dex */
public final class c3 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f4427j;

    /* renamed from: k  reason: collision with root package name */
    private final String f4428k = s.f("phone");

    /* renamed from: l  reason: collision with root package name */
    private final String f4429l;

    /* renamed from: m  reason: collision with root package name */
    private final String f4430m;

    /* renamed from: n  reason: collision with root package name */
    private final String f4431n;

    /* renamed from: o  reason: collision with root package name */
    private final String f4432o;

    /* renamed from: p  reason: collision with root package name */
    private j1 f4433p;

    private c3(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f4427j = s.f(str);
        this.f4429l = str3;
        this.f4430m = str4;
        this.f4431n = str5;
        this.f4432o = str6;
    }

    public static c3 a(String str, String str2, String str3, String str4, String str5, String str6) {
        s.f(str2);
        return new c3(str, "phone", str2, str3, str4, str5, null);
    }

    public final String b() {
        return this.f4430m;
    }

    public final void c(j1 j1Var) {
        this.f4433p = j1Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f4427j);
        jSONObject.put("mfaProvider", 1);
        if (this.f4429l != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f4429l);
            if (!TextUtils.isEmpty(this.f4431n)) {
                jSONObject2.put("recaptchaToken", this.f4431n);
            }
            if (!TextUtils.isEmpty(this.f4432o)) {
                jSONObject2.put("playIntegrityToken", this.f4432o);
            }
            j1 j1Var = this.f4433p;
            if (j1Var != null) {
                jSONObject2.put("autoRetrievalInfo", j1Var.a());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty(null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }
}
