package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.x2  reason: invalid package */
/* loaded from: classes.dex */
public final class x2 implements s {

    /* renamed from: j  reason: collision with root package name */
    private String f5619j;

    /* renamed from: k  reason: collision with root package name */
    private String f5620k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5621l;

    /* renamed from: m  reason: collision with root package name */
    private String f5622m;

    public x2(String str) {
        this.f5621l = str;
    }

    public x2(String str, String str2, String str3, String str4, String str5) {
        this.f5619j = s.f(str);
        this.f5620k = s.f(str2);
        this.f5621l = str4;
        this.f5622m = str5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f5619j;
        if (str != null) {
            jSONObject.put("email", str);
        }
        String str2 = this.f5620k;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.f5621l;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.f5622m;
        if (str4 != null) {
            t3.d(jSONObject, "captchaResponse", str4);
        } else {
            t3.c(jSONObject);
        }
        return jSONObject.toString();
    }
}
