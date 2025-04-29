package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a3  reason: invalid package */
/* loaded from: classes.dex */
public final class a3 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f4310j = s.f("phone");

    /* renamed from: k  reason: collision with root package name */
    private final String f4311k;

    /* renamed from: l  reason: collision with root package name */
    private final String f4312l;

    /* renamed from: m  reason: collision with root package name */
    private final String f4313m;

    /* renamed from: n  reason: collision with root package name */
    private final String f4314n;

    /* renamed from: o  reason: collision with root package name */
    private final String f4315o;

    /* renamed from: p  reason: collision with root package name */
    private final String f4316p;

    /* renamed from: q  reason: collision with root package name */
    private j1 f4317q;

    private a3(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f4311k = s.f(str2);
        this.f4312l = s.f(str3);
        this.f4314n = str4;
        this.f4313m = str5;
        this.f4315o = str6;
        this.f4316p = str7;
    }

    public static a3 a(String str, String str2, String str3, String str4, String str5, String str6) {
        s.f(str3);
        return new a3("phone", str, str2, str3, str4, str5, str6);
    }

    public final String b() {
        return this.f4313m;
    }

    public final void c(j1 j1Var) {
        this.f4317q = j1Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f4311k);
        jSONObject.put("mfaEnrollmentId", this.f4312l);
        this.f4310j.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f4314n != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f4314n);
            if (!TextUtils.isEmpty(this.f4315o)) {
                jSONObject2.put("recaptchaToken", this.f4315o);
            }
            if (!TextUtils.isEmpty(this.f4316p)) {
                jSONObject2.put("playIntegrityToken", this.f4316p);
            }
            j1 j1Var = this.f4317q;
            if (j1Var != null) {
                jSONObject2.put("autoRetrievalInfo", j1Var.a());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
