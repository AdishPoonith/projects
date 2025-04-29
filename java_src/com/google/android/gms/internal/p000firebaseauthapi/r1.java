package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.r1  reason: invalid package */
/* loaded from: classes.dex */
public final class r1 implements t {

    /* renamed from: l  reason: collision with root package name */
    private static final String f5276l = "r1";

    /* renamed from: j  reason: collision with root package name */
    private String f5277j;

    /* renamed from: k  reason: collision with root package name */
    private String f5278k;

    public final String a() {
        return this.f5277j;
    }

    public final String b() {
        return this.f5278k;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5277j = jSONObject.optString("idToken", null);
            this.f5278k = jSONObject.optString("refreshToken", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5276l, str);
        }
    }
}
