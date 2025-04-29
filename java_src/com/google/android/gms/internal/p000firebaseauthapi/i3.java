package com.google.android.gms.internal.p000firebaseauthapi;

import a6.h1;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c4.s;
import d4.a;
import d4.c;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i3  reason: invalid package */
/* loaded from: classes.dex */
public final class i3 extends a implements s {
    public static final Parcelable.Creator<i3> CREATOR = new j3();

    /* renamed from: j  reason: collision with root package name */
    private String f4717j;

    /* renamed from: k  reason: collision with root package name */
    private String f4718k;

    /* renamed from: l  reason: collision with root package name */
    private String f4719l;

    /* renamed from: m  reason: collision with root package name */
    private String f4720m;

    /* renamed from: n  reason: collision with root package name */
    private String f4721n;

    /* renamed from: o  reason: collision with root package name */
    private String f4722o;

    /* renamed from: p  reason: collision with root package name */
    private String f4723p;

    /* renamed from: q  reason: collision with root package name */
    private String f4724q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f4725r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f4726s;

    /* renamed from: t  reason: collision with root package name */
    private String f4727t;

    /* renamed from: u  reason: collision with root package name */
    private String f4728u;

    /* renamed from: v  reason: collision with root package name */
    private String f4729v;

    /* renamed from: w  reason: collision with root package name */
    private String f4730w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f4731x;

    /* renamed from: y  reason: collision with root package name */
    private String f4732y;

    public i3() {
        this.f4725r = true;
        this.f4726s = true;
    }

    public i3(h1 h1Var, String str) {
        s.j(h1Var);
        this.f4728u = s.f(h1Var.d());
        this.f4729v = s.f(str);
        String f10 = s.f(h1Var.c());
        this.f4721n = f10;
        this.f4725r = true;
        this.f4723p = "providerId=".concat(String.valueOf(f10));
    }

    public i3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f4717j = "http://localhost";
        this.f4719l = str;
        this.f4720m = str2;
        this.f4724q = str5;
        this.f4727t = str6;
        this.f4730w = str7;
        this.f4732y = str8;
        this.f4725r = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.f4720m) && TextUtils.isEmpty(this.f4727t)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.f4721n = s.f(str3);
        this.f4722o = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f4719l)) {
            sb.append("id_token=");
            sb.append(this.f4719l);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f4720m)) {
            sb.append("access_token=");
            sb.append(this.f4720m);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f4722o)) {
            sb.append("identifier=");
            sb.append(this.f4722o);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f4724q)) {
            sb.append("oauth_token_secret=");
            sb.append(this.f4724q);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f4727t)) {
            sb.append("code=");
            sb.append(this.f4727t);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(str9)) {
            sb.append("nonce=");
            sb.append(str9);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.f4721n);
        this.f4723p = sb.toString();
        this.f4726s = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.f4717j = str;
        this.f4718k = str2;
        this.f4719l = str3;
        this.f4720m = str4;
        this.f4721n = str5;
        this.f4722o = str6;
        this.f4723p = str7;
        this.f4724q = str8;
        this.f4725r = z10;
        this.f4726s = z11;
        this.f4727t = str9;
        this.f4728u = str10;
        this.f4729v = str11;
        this.f4730w = str12;
        this.f4731x = z12;
        this.f4732y = str13;
    }

    public final i3 B(boolean z10) {
        this.f4726s = false;
        return this;
    }

    public final i3 C(String str) {
        this.f4718k = s.f(str);
        return this;
    }

    public final i3 D(boolean z10) {
        this.f4731x = true;
        return this;
    }

    public final i3 E(boolean z10) {
        this.f4725r = true;
        return this;
    }

    public final i3 F(String str) {
        this.f4730w = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, this.f4717j, false);
        c.s(parcel, 3, this.f4718k, false);
        c.s(parcel, 4, this.f4719l, false);
        c.s(parcel, 5, this.f4720m, false);
        c.s(parcel, 6, this.f4721n, false);
        c.s(parcel, 7, this.f4722o, false);
        c.s(parcel, 8, this.f4723p, false);
        c.s(parcel, 9, this.f4724q, false);
        c.c(parcel, 10, this.f4725r);
        c.c(parcel, 11, this.f4726s);
        c.s(parcel, 12, this.f4727t, false);
        c.s(parcel, 13, this.f4728u, false);
        c.s(parcel, 14, this.f4729v, false);
        c.s(parcel, 15, this.f4730w, false);
        c.c(parcel, 16, this.f4731x);
        c.s(parcel, 17, this.f4732y, false);
        c.b(parcel, a10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r1 != null) goto L19;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zza() {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r3.f4726s
            java.lang.String r2 = "autoCreate"
            r0.put(r2, r1)
            boolean r1 = r3.f4725r
            java.lang.String r2 = "returnSecureToken"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f4718k
            if (r1 == 0) goto L1c
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
        L1c:
            java.lang.String r1 = r3.f4723p
            if (r1 == 0) goto L25
            java.lang.String r2 = "postBody"
            r0.put(r2, r1)
        L25:
            java.lang.String r1 = r3.f4730w
            if (r1 == 0) goto L2e
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L2e:
            java.lang.String r1 = r3.f4732y
            if (r1 == 0) goto L37
            java.lang.String r2 = "pendingToken"
            r0.put(r2, r1)
        L37:
            java.lang.String r1 = r3.f4728u
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L46
            java.lang.String r1 = r3.f4728u
            java.lang.String r2 = "sessionId"
            r0.put(r2, r1)
        L46:
            java.lang.String r1 = r3.f4729v
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "requestUri"
            if (r1 != 0) goto L56
            java.lang.String r1 = r3.f4729v
        L52:
            r0.put(r2, r1)
            goto L5b
        L56:
            java.lang.String r1 = r3.f4717j
            if (r1 == 0) goto L5b
            goto L52
        L5b:
            boolean r1 = r3.f4731x
            java.lang.String r2 = "returnIdpCredential"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.i3.zza():java.lang.String");
    }
}
