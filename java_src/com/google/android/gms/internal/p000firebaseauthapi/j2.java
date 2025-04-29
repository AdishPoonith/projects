package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c4.s;
import d4.a;
import d4.c;
import h4.f;
import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j2  reason: invalid package */
/* loaded from: classes.dex */
public final class j2 extends a implements t<j2> {

    /* renamed from: j  reason: collision with root package name */
    private String f4798j;

    /* renamed from: k  reason: collision with root package name */
    private String f4799k;

    /* renamed from: l  reason: collision with root package name */
    private Long f4800l;

    /* renamed from: m  reason: collision with root package name */
    private String f4801m;

    /* renamed from: n  reason: collision with root package name */
    private Long f4802n;

    /* renamed from: o  reason: collision with root package name */
    private static final String f4797o = j2.class.getSimpleName();
    public static final Parcelable.Creator<j2> CREATOR = new k2();

    public j2() {
        this.f4802n = Long.valueOf(System.currentTimeMillis());
    }

    public j2(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(String str, String str2, Long l10, String str3, Long l11) {
        this.f4798j = str;
        this.f4799k = str2;
        this.f4800l = l10;
        this.f4801m = str3;
        this.f4802n = l11;
    }

    public static j2 D(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            j2 j2Var = new j2();
            j2Var.f4798j = jSONObject.optString("refresh_token", null);
            j2Var.f4799k = jSONObject.optString("access_token", null);
            j2Var.f4800l = Long.valueOf(jSONObject.optLong("expires_in"));
            j2Var.f4801m = jSONObject.optString("token_type", null);
            j2Var.f4802n = Long.valueOf(jSONObject.optLong("issued_at"));
            return j2Var;
        } catch (JSONException e10) {
            Log.d(f4797o, "Failed to read GetTokenResponse from JSONObject");
            throw new iv(e10);
        }
    }

    public final long B() {
        Long l10 = this.f4800l;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long C() {
        return this.f4802n.longValue();
    }

    public final String E() {
        return this.f4799k;
    }

    public final String F() {
        return this.f4798j;
    }

    public final String G() {
        return this.f4801m;
    }

    public final String H() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f4798j);
            jSONObject.put("access_token", this.f4799k);
            jSONObject.put("expires_in", this.f4800l);
            jSONObject.put("token_type", this.f4801m);
            jSONObject.put("issued_at", this.f4802n);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(f4797o, "Failed to convert GetTokenResponse to JSON");
            throw new iv(e10);
        }
    }

    public final void I(String str) {
        this.f4798j = s.f(str);
    }

    public final boolean J() {
        return f.c().b() + 300000 < this.f4802n.longValue() + (this.f4800l.longValue() * 1000);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, this.f4798j, false);
        c.s(parcel, 3, this.f4799k, false);
        c.q(parcel, 4, Long.valueOf(B()), false);
        c.s(parcel, 5, this.f4801m, false);
        c.q(parcel, 6, Long.valueOf(this.f4802n.longValue()), false);
        c.b(parcel, a10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4798j = l.a(jSONObject.optString("refresh_token"));
            this.f4799k = l.a(jSONObject.optString("access_token"));
            this.f4800l = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.f4801m = l.a(jSONObject.optString("token_type"));
            this.f4802n = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f4797o, str);
        }
    }
}
