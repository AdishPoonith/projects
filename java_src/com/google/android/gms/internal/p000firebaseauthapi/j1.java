package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j1  reason: invalid package */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4796a;

    public j1(String str) {
        this.f4796a = s.f(str);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.f4796a);
        return jSONObject;
    }
}
