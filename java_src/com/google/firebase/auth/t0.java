package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.iv;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class t0 extends j0 {
    public static final Parcelable.Creator<t0> CREATOR = new q1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6608j;

    /* renamed from: k  reason: collision with root package name */
    private final String f6609k;

    /* renamed from: l  reason: collision with root package name */
    private final long f6610l;

    /* renamed from: m  reason: collision with root package name */
    private final String f6611m;

    public t0(String str, String str2, long j10, String str3) {
        this.f6608j = c4.s.f(str);
        this.f6609k = str2;
        this.f6610l = j10;
        this.f6611m = c4.s.f(str3);
    }

    @Override // com.google.firebase.auth.j0
    public long B() {
        return this.f6610l;
    }

    @Override // com.google.firebase.auth.j0
    public String C() {
        return "phone";
    }

    @Override // com.google.firebase.auth.j0
    public JSONObject D() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f6608j);
            jSONObject.putOpt("displayName", this.f6609k);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f6610l));
            jSONObject.putOpt("phoneNumber", this.f6611m);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new iv(e10);
        }
    }

    @Override // com.google.firebase.auth.j0
    public String a() {
        return this.f6608j;
    }

    public String j() {
        return this.f6611m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, a(), false);
        d4.c.s(parcel, 2, x(), false);
        d4.c.p(parcel, 3, B());
        d4.c.s(parcel, 4, j(), false);
        d4.c.b(parcel, a10);
    }

    @Override // com.google.firebase.auth.j0
    public String x() {
        return this.f6609k;
    }
}
