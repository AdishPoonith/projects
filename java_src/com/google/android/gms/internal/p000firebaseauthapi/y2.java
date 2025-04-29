package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y2  reason: invalid package */
/* loaded from: classes.dex */
public final class y2 implements t {

    /* renamed from: o  reason: collision with root package name */
    private static final String f5688o = "y2";

    /* renamed from: j  reason: collision with root package name */
    private String f5689j;

    /* renamed from: k  reason: collision with root package name */
    private String f5690k;

    /* renamed from: l  reason: collision with root package name */
    private String f5691l;

    /* renamed from: m  reason: collision with root package name */
    private String f5692m;

    /* renamed from: n  reason: collision with root package name */
    private long f5693n;

    public final long a() {
        return this.f5693n;
    }

    public final String b() {
        return this.f5689j;
    }

    public final String c() {
        return this.f5692m;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5689j = l.a(jSONObject.optString("idToken", null));
            this.f5690k = l.a(jSONObject.optString("displayName", null));
            this.f5691l = l.a(jSONObject.optString("email", null));
            this.f5692m = l.a(jSONObject.optString("refreshToken", null));
            this.f5693n = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5688o, str);
        }
    }
}
