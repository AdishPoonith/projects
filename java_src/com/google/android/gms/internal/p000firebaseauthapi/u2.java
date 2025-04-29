package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.u2  reason: invalid package */
/* loaded from: classes.dex */
public final class u2 implements t {

    /* renamed from: k  reason: collision with root package name */
    private static final String f5415k = "u2";

    /* renamed from: j  reason: collision with root package name */
    private String f5416j;

    public final String a() {
        return this.f5416j;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            this.f5416j = l.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5415k, str);
        }
    }
}
