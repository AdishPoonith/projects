package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t2  reason: invalid package */
/* loaded from: classes.dex */
public final class t2 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f5362j;

    /* renamed from: k  reason: collision with root package name */
    private final long f5363k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f5364l;

    /* renamed from: m  reason: collision with root package name */
    private final String f5365m;

    /* renamed from: n  reason: collision with root package name */
    private final String f5366n;

    /* renamed from: o  reason: collision with root package name */
    private final String f5367o;

    /* renamed from: p  reason: collision with root package name */
    private final String f5368p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f5369q;

    /* renamed from: r  reason: collision with root package name */
    private j1 f5370r;

    public t2(String str, long j10, boolean z10, String str2, String str3, String str4, String str5, boolean z11) {
        this.f5362j = s.f(str);
        this.f5363k = j10;
        this.f5364l = z10;
        this.f5365m = str2;
        this.f5366n = str3;
        this.f5367o = str4;
        this.f5368p = str5;
        this.f5369q = z11;
    }

    public final long a() {
        return this.f5363k;
    }

    public final String b() {
        return this.f5365m;
    }

    public final String c() {
        return this.f5362j;
    }

    public final void d(j1 j1Var) {
        this.f5370r = j1Var;
    }

    public final boolean e() {
        return this.f5364l;
    }

    public final boolean f() {
        return this.f5369q;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.f5362j);
        String str = this.f5366n;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.f5367o;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        j1 j1Var = this.f5370r;
        if (j1Var != null) {
            jSONObject.put("autoRetrievalInfo", j1Var.a());
        }
        String str3 = this.f5368p;
        if (str3 != null) {
            jSONObject.put("playIntegrityToken", str3);
        }
        return jSONObject.toString();
    }
}
