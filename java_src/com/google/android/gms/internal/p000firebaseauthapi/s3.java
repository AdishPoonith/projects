package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s3  reason: invalid package */
/* loaded from: classes.dex */
public final class s3 implements t {

    /* renamed from: l  reason: collision with root package name */
    private static final String f5321l = "s3";

    /* renamed from: j  reason: collision with root package name */
    private String f5322j;

    /* renamed from: k  reason: collision with root package name */
    private String f5323k;

    public final String a() {
        return this.f5322j;
    }

    public final String b() {
        return this.f5323k;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5322j = l.a(jSONObject.optString("idToken", null));
            this.f5323k = l.a(jSONObject.optString("refreshToken", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5321l, str);
        }
    }
}
