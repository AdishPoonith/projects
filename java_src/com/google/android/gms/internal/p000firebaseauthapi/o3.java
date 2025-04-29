package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import h4.l;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o3  reason: invalid package */
/* loaded from: classes.dex */
public final class o3 implements t {

    /* renamed from: s  reason: collision with root package name */
    private static final String f5098s = "o3";

    /* renamed from: j  reason: collision with root package name */
    private String f5099j;

    /* renamed from: k  reason: collision with root package name */
    private String f5100k;

    /* renamed from: l  reason: collision with root package name */
    private String f5101l;

    /* renamed from: m  reason: collision with root package name */
    private String f5102m;

    /* renamed from: n  reason: collision with root package name */
    private String f5103n;

    /* renamed from: o  reason: collision with root package name */
    private String f5104o;

    /* renamed from: p  reason: collision with root package name */
    private long f5105p;

    /* renamed from: q  reason: collision with root package name */
    private List f5106q;

    /* renamed from: r  reason: collision with root package name */
    private String f5107r;

    public final long a() {
        return this.f5105p;
    }

    public final String b() {
        return this.f5102m;
    }

    public final String c() {
        return this.f5107r;
    }

    public final String d() {
        return this.f5104o;
    }

    public final List e() {
        return this.f5106q;
    }

    public final boolean f() {
        return !TextUtils.isEmpty(this.f5107r);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5099j = l.a(jSONObject.optString("localId", null));
            this.f5100k = l.a(jSONObject.optString("email", null));
            this.f5101l = l.a(jSONObject.optString("displayName", null));
            this.f5102m = l.a(jSONObject.optString("idToken", null));
            this.f5103n = l.a(jSONObject.optString("photoUrl", null));
            this.f5104o = l.a(jSONObject.optString("refreshToken", null));
            this.f5105p = jSONObject.optLong("expiresIn", 0L);
            this.f5106q = n2.g(jSONObject.optJSONArray("mfaInfo"));
            this.f5107r = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5098s, str);
        }
    }
}
