package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.w2  reason: invalid package */
/* loaded from: classes.dex */
public final class w2 implements t {

    /* renamed from: s  reason: collision with root package name */
    private static final String f5568s = "w2";

    /* renamed from: j  reason: collision with root package name */
    private String f5569j;

    /* renamed from: k  reason: collision with root package name */
    private String f5570k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f5571l;

    /* renamed from: m  reason: collision with root package name */
    private String f5572m;

    /* renamed from: n  reason: collision with root package name */
    private String f5573n;

    /* renamed from: o  reason: collision with root package name */
    private p2 f5574o;

    /* renamed from: p  reason: collision with root package name */
    private String f5575p;

    /* renamed from: q  reason: collision with root package name */
    private String f5576q;

    /* renamed from: r  reason: collision with root package name */
    private long f5577r;

    public final long a() {
        return this.f5577r;
    }

    public final String b() {
        return this.f5569j;
    }

    public final String c() {
        return this.f5575p;
    }

    public final String d() {
        return this.f5576q;
    }

    public final List e() {
        p2 p2Var = this.f5574o;
        if (p2Var != null) {
            return p2Var.c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5569j = l.a(jSONObject.optString("email", null));
            this.f5570k = l.a(jSONObject.optString("passwordHash", null));
            this.f5571l = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.f5572m = l.a(jSONObject.optString("displayName", null));
            this.f5573n = l.a(jSONObject.optString("photoUrl", null));
            this.f5574o = p2.a(jSONObject.optJSONArray("providerUserInfo"));
            this.f5575p = l.a(jSONObject.optString("idToken", null));
            this.f5576q = l.a(jSONObject.optString("refreshToken", null));
            this.f5577r = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5568s, str);
        }
    }
}
