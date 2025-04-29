package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r3  reason: invalid package */
/* loaded from: classes.dex */
public final class r3 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5282j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5283k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5284l;

    public r3(String str, String str2, String str3) {
        this.f5282j = s.f(str);
        this.f5283k = s.f(str2);
        this.f5284l = str3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f5282j);
        jSONObject.put("mfaEnrollmentId", this.f5283k);
        String str = this.f5284l;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
