package com.google.android.gms.internal.p000firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z2  reason: invalid package */
/* loaded from: classes.dex */
public class z2 implements t {

    /* renamed from: j  reason: collision with root package name */
    private static final String f5749j = "z2";

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    /* renamed from: a */
    public z2 zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                d3 d3Var = new d3();
                d3Var.c(str);
                return d3Var;
            } else if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                throw new IllegalArgumentException("Not Implemented.");
            } else {
                throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
            }
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5749j, str);
        }
    }

    public String b() {
        return null;
    }
}
