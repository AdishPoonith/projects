package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import c4.s;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n2  reason: invalid package */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5046a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5047b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5048c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5049d;

    /* renamed from: e  reason: collision with root package name */
    private final g3 f5050e;

    /* renamed from: f  reason: collision with root package name */
    private String f5051f;

    public n2(String str, String str2, String str3, long j10, g3 g3Var) {
        if (!TextUtils.isEmpty(str) && g3Var != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.f5046a = str;
        this.f5047b = s.f(str2);
        this.f5048c = str3;
        this.f5049d = j10;
        this.f5050e = g3Var;
    }

    public static n2 b(JSONObject jSONObject) {
        n2 n2Var = new n2(jSONObject.optString("phoneInfo", null), jSONObject.optString("mfaEnrollmentId", null), jSONObject.optString("displayName", null), h(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new g3() : null);
        n2Var.f5051f = jSONObject.optString("unobfuscatedPhoneInfo");
        return n2Var;
    }

    public static List g(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(b(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    private static long h(String str) {
        try {
            b8 b10 = x8.b(str);
            x8.a(b10);
            return b10.D();
        } catch (ParseException e10) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e10);
            return 0L;
        }
    }

    public final long a() {
        return this.f5049d;
    }

    public final g3 c() {
        return this.f5050e;
    }

    public final String d() {
        return this.f5048c;
    }

    public final String e() {
        return this.f5047b;
    }

    public final String f() {
        return this.f5046a;
    }
}
