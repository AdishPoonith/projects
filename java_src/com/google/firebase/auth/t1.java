package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.g3;
import com.google.android.gms.internal.p000firebaseauthapi.iv;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class t1 extends j0 {
    public static final Parcelable.Creator<t1> CREATOR = new u1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6612j;

    /* renamed from: k  reason: collision with root package name */
    private final String f6613k;

    /* renamed from: l  reason: collision with root package name */
    private final long f6614l;

    /* renamed from: m  reason: collision with root package name */
    private final g3 f6615m;

    public t1(String str, String str2, long j10, g3 g3Var) {
        this.f6612j = c4.s.f(str);
        this.f6613k = str2;
        this.f6614l = j10;
        this.f6615m = (g3) c4.s.k(g3Var, "totpInfo cannot not be null.");
    }

    @Override // com.google.firebase.auth.j0
    public final long B() {
        return this.f6614l;
    }

    @Override // com.google.firebase.auth.j0
    public final String C() {
        return "totp";
    }

    @Override // com.google.firebase.auth.j0
    public final JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f6612j);
            jSONObject.putOpt("displayName", this.f6613k);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6614l));
            jSONObject.putOpt("totpInfo", this.f6615m);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new iv(e10);
        }
    }

    @Override // com.google.firebase.auth.j0
    public final String a() {
        return this.f6612j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6612j, false);
        d4.c.s(parcel, 2, this.f6613k, false);
        d4.c.p(parcel, 3, this.f6614l);
        d4.c.r(parcel, 4, this.f6615m, i10, false);
        d4.c.b(parcel, a10);
    }

    @Override // com.google.firebase.auth.j0
    public final String x() {
        return this.f6613k;
    }
}
