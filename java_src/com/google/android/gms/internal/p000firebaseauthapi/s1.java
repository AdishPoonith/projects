package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s1  reason: invalid package */
/* loaded from: classes.dex */
public final class s1 implements t {

    /* renamed from: l  reason: collision with root package name */
    private static final String f5313l = "s1";

    /* renamed from: j  reason: collision with root package name */
    private String f5314j;

    /* renamed from: k  reason: collision with root package name */
    private String f5315k;

    public final String a() {
        return this.f5314j;
    }

    public final String b() {
        return this.f5315k;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5314j = jSONObject.optString("idToken", null);
            this.f5315k = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5313l, str);
        }
    }
}
