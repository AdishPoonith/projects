package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q1  reason: invalid package */
/* loaded from: classes.dex */
public final class q1 implements t {

    /* renamed from: r  reason: collision with root package name */
    private static final String f5218r = "q1";

    /* renamed from: j  reason: collision with root package name */
    private String f5219j;

    /* renamed from: k  reason: collision with root package name */
    private String f5220k;

    /* renamed from: l  reason: collision with root package name */
    private String f5221l;

    /* renamed from: m  reason: collision with root package name */
    private String f5222m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5223n;

    /* renamed from: o  reason: collision with root package name */
    private long f5224o;

    /* renamed from: p  reason: collision with root package name */
    private List f5225p;

    /* renamed from: q  reason: collision with root package name */
    private String f5226q;

    public final long a() {
        return this.f5224o;
    }

    public final String b() {
        return this.f5221l;
    }

    public final String c() {
        return this.f5226q;
    }

    public final String d() {
        return this.f5222m;
    }

    public final List e() {
        return this.f5225p;
    }

    public final boolean f() {
        return !TextUtils.isEmpty(this.f5226q);
    }

    public final boolean g() {
        return this.f5223n;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5219j = jSONObject.optString("localId", null);
            this.f5220k = jSONObject.optString("email", null);
            this.f5221l = jSONObject.optString("idToken", null);
            this.f5222m = jSONObject.optString("refreshToken", null);
            this.f5223n = jSONObject.optBoolean("isNewUser", false);
            this.f5224o = jSONObject.optLong("expiresIn", 0L);
            this.f5225p = n2.g(jSONObject.optJSONArray("mfaInfo"));
            this.f5226q = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5218r, str);
        }
    }
}
