package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l1  reason: invalid package */
/* loaded from: classes.dex */
public final class l1 implements t {

    /* renamed from: k  reason: collision with root package name */
    private static final String f4898k = "com.google.android.gms.internal.firebase-auth-api.l1";

    /* renamed from: j  reason: collision with root package name */
    private String f4899j;

    public final l1 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f4899j = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e10) {
            String str2 = f4898k;
            String message = e10.getMessage();
            Log.e(str2, "Failed to parse error for string [" + str + "] with exception: " + message);
            throw new sx("Failed to parse error for string [" + str + "]", e10);
        }
    }

    public final String b() {
        return this.f4899j;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.f4899j);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        a(str);
        return this;
    }
}
