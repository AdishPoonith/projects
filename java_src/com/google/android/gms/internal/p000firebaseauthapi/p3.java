package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p3  reason: invalid package */
/* loaded from: classes.dex */
public final class p3 implements s {

    /* renamed from: j  reason: collision with root package name */
    private String f5165j;

    /* renamed from: k  reason: collision with root package name */
    private String f5166k;

    /* renamed from: l  reason: collision with root package name */
    private String f5167l;

    /* renamed from: m  reason: collision with root package name */
    private String f5168m;

    /* renamed from: n  reason: collision with root package name */
    private String f5169n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5170o;

    private p3() {
    }

    public static p3 a(String str, String str2, boolean z10) {
        p3 p3Var = new p3();
        p3Var.f5166k = s.f(str);
        p3Var.f5167l = s.f(str2);
        p3Var.f5170o = z10;
        return p3Var;
    }

    public static p3 b(String str, String str2, boolean z10) {
        p3 p3Var = new p3();
        p3Var.f5165j = s.f(str);
        p3Var.f5168m = s.f(str2);
        p3Var.f5170o = z10;
        return p3Var;
    }

    public final void c(String str) {
        this.f5169n = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.f5168m)) {
            jSONObject.put("sessionInfo", this.f5166k);
            str = this.f5167l;
            str2 = "code";
        } else {
            jSONObject.put("phoneNumber", this.f5165j);
            str = this.f5168m;
            str2 = "temporaryProof";
        }
        jSONObject.put(str2, str);
        String str3 = this.f5169n;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        if (!this.f5170o) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
