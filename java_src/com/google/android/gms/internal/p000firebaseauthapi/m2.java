package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.m2  reason: invalid package */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    private String f4983a;

    /* renamed from: b  reason: collision with root package name */
    private String f4984b;

    /* renamed from: c  reason: collision with root package name */
    private String f4985c;

    /* renamed from: d  reason: collision with root package name */
    private Long f4986d;

    /* renamed from: e  reason: collision with root package name */
    private Long f4987e;

    public static m2 a(String str) {
        try {
            m2 m2Var = new m2();
            JSONObject jSONObject = new JSONObject(str);
            m2Var.f4983a = jSONObject.optString("iss");
            m2Var.f4984b = jSONObject.optString("aud");
            m2Var.f4985c = jSONObject.optString("sub");
            m2Var.f4986d = Long.valueOf(jSONObject.optLong("iat"));
            m2Var.f4987e = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return m2Var;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(e10.toString()));
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e10.toString()));
        }
    }

    public final Long b() {
        return this.f4987e;
    }

    public final Long c() {
        return this.f4986d;
    }
}
