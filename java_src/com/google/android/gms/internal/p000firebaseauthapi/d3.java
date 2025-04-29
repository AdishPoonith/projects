package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.d3  reason: invalid package */
/* loaded from: classes.dex */
public final class d3 extends z2 {

    /* renamed from: l  reason: collision with root package name */
    private static final String f4482l = "d3";

    /* renamed from: k  reason: collision with root package name */
    private String f4483k;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z2
    public final /* bridge */ /* synthetic */ z2 a(String str) {
        c(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z2
    public final String b() {
        return this.f4483k;
    }

    public final d3 c(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.f4483k = d1.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f4482l, str);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.z2, com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        c(str);
        return this;
    }
}
