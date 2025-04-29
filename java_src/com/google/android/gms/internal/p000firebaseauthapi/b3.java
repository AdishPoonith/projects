package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b3  reason: invalid package */
/* loaded from: classes.dex */
public final class b3 implements t {

    /* renamed from: k  reason: collision with root package name */
    private static final String f4377k = "b3";

    /* renamed from: j  reason: collision with root package name */
    private String f4378j;

    public final String a() {
        return this.f4378j;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.f4378j = l.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f4377k, str);
        }
    }
}
