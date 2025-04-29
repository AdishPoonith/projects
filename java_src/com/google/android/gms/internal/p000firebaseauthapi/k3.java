package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.a2;
import h4.l;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k3  reason: invalid package */
/* loaded from: classes.dex */
public final class k3 implements t {
    private static final String C = "k3";
    private List A;
    private String B;

    /* renamed from: j  reason: collision with root package name */
    private boolean f4852j;

    /* renamed from: k  reason: collision with root package name */
    private String f4853k;

    /* renamed from: l  reason: collision with root package name */
    private String f4854l;

    /* renamed from: m  reason: collision with root package name */
    private long f4855m;

    /* renamed from: n  reason: collision with root package name */
    private String f4856n;

    /* renamed from: o  reason: collision with root package name */
    private String f4857o;

    /* renamed from: p  reason: collision with root package name */
    private String f4858p;

    /* renamed from: q  reason: collision with root package name */
    private String f4859q;

    /* renamed from: r  reason: collision with root package name */
    private String f4860r;

    /* renamed from: s  reason: collision with root package name */
    private String f4861s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f4862t;

    /* renamed from: u  reason: collision with root package name */
    private String f4863u;

    /* renamed from: v  reason: collision with root package name */
    private String f4864v;

    /* renamed from: w  reason: collision with root package name */
    private String f4865w;

    /* renamed from: x  reason: collision with root package name */
    private String f4866x;

    /* renamed from: y  reason: collision with root package name */
    private String f4867y;

    /* renamed from: z  reason: collision with root package name */
    private String f4868z;

    public final long a() {
        return this.f4855m;
    }

    public final a2 b() {
        if (TextUtils.isEmpty(this.f4863u) && TextUtils.isEmpty(this.f4864v)) {
            return null;
        }
        return a2.G(this.f4860r, this.f4864v, this.f4863u, this.f4867y, this.f4865w);
    }

    public final String c() {
        return this.f4857o;
    }

    public final String d() {
        return this.f4866x;
    }

    public final String e() {
        return this.f4853k;
    }

    public final String f() {
        return this.B;
    }

    public final String g() {
        return this.f4860r;
    }

    public final String h() {
        return this.f4861s;
    }

    public final String i() {
        return this.f4854l;
    }

    public final String j() {
        return this.f4868z;
    }

    public final List k() {
        return this.A;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(this.B);
    }

    public final boolean m() {
        return this.f4852j;
    }

    public final boolean n() {
        return this.f4862t;
    }

    public final boolean o() {
        return this.f4852j || !TextUtils.isEmpty(this.f4866x);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4852j = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f4853k = l.a(jSONObject.optString("idToken", null));
            this.f4854l = l.a(jSONObject.optString("refreshToken", null));
            this.f4855m = jSONObject.optLong("expiresIn", 0L);
            this.f4856n = l.a(jSONObject.optString("localId", null));
            this.f4857o = l.a(jSONObject.optString("email", null));
            this.f4858p = l.a(jSONObject.optString("displayName", null));
            this.f4859q = l.a(jSONObject.optString("photoUrl", null));
            this.f4860r = l.a(jSONObject.optString("providerId", null));
            this.f4861s = l.a(jSONObject.optString("rawUserInfo", null));
            this.f4862t = jSONObject.optBoolean("isNewUser", false);
            this.f4863u = jSONObject.optString("oauthAccessToken", null);
            this.f4864v = jSONObject.optString("oauthIdToken", null);
            this.f4866x = l.a(jSONObject.optString("errorMessage", null));
            this.f4867y = l.a(jSONObject.optString("pendingToken", null));
            this.f4868z = l.a(jSONObject.optString("tenantId", null));
            this.A = n2.g(jSONObject.optJSONArray("mfaInfo"));
            this.B = l.a(jSONObject.optString("mfaPendingCredential", null));
            this.f4865w = l.a(jSONObject.optString("oauthTokenSecret", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, C, str);
        }
    }
}
