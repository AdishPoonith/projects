package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q3  reason: invalid package */
/* loaded from: classes.dex */
public final class q3 implements t {

    /* renamed from: q  reason: collision with root package name */
    private static final String f5227q = "q3";

    /* renamed from: j  reason: collision with root package name */
    private String f5228j;

    /* renamed from: k  reason: collision with root package name */
    private String f5229k;

    /* renamed from: l  reason: collision with root package name */
    private long f5230l;

    /* renamed from: m  reason: collision with root package name */
    private String f5231m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f5232n;

    /* renamed from: o  reason: collision with root package name */
    private String f5233o;

    /* renamed from: p  reason: collision with root package name */
    private String f5234p;

    public final long a() {
        return this.f5230l;
    }

    public final String b() {
        return this.f5228j;
    }

    public final String c() {
        return this.f5234p;
    }

    public final String d() {
        return this.f5229k;
    }

    public final String e() {
        return this.f5233o;
    }

    public final boolean f() {
        return this.f5232n;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5228j = l.a(jSONObject.optString("idToken", null));
            this.f5229k = l.a(jSONObject.optString("refreshToken", null));
            this.f5230l = jSONObject.optLong("expiresIn", 0L);
            this.f5231m = l.a(jSONObject.optString("localId", null));
            this.f5232n = jSONObject.optBoolean("isNewUser", false);
            this.f5233o = l.a(jSONObject.optString("temporaryProof", null));
            this.f5234p = l.a(jSONObject.optString("phoneNumber", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5227q, str);
        }
    }
}
