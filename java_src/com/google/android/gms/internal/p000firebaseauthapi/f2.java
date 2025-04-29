package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f2  reason: invalid package */
/* loaded from: classes.dex */
public final class f2 implements t {

    /* renamed from: k  reason: collision with root package name */
    private static final String f4565k = "f2";

    /* renamed from: j  reason: collision with root package name */
    private String f4566j;

    public f2() {
    }

    public f2(String str) {
        this.f4566j = str;
    }

    public final String a() {
        return this.f4566j;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            this.f4566j = l.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f4565k, str);
        }
    }
}
