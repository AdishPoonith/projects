package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r2  reason: invalid package */
/* loaded from: classes.dex */
public final class r2 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5279j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5280k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5281l;

    public r2(String str, String str2, String str3) {
        this.f5279j = s.f(str);
        this.f5280k = str2;
        this.f5281l = str3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.f5279j);
        String str = this.f5280k;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.f5281l;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
