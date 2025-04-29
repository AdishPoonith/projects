package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m3  reason: invalid package */
/* loaded from: classes.dex */
public final class m3 implements t {

    /* renamed from: n  reason: collision with root package name */
    private static final String f4988n = "m3";

    /* renamed from: j  reason: collision with root package name */
    private String f4989j;

    /* renamed from: k  reason: collision with root package name */
    private String f4990k;

    /* renamed from: l  reason: collision with root package name */
    private long f4991l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f4992m;

    public final long a() {
        return this.f4991l;
    }

    public final String b() {
        return this.f4989j;
    }

    public final String c() {
        return this.f4990k;
    }

    public final boolean d() {
        return this.f4992m;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4989j = l.a(jSONObject.optString("idToken", null));
            this.f4990k = l.a(jSONObject.optString("refreshToken", null));
            this.f4991l = jSONObject.optLong("expiresIn", 0L);
            this.f4992m = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f4988n, str);
        }
    }
}
