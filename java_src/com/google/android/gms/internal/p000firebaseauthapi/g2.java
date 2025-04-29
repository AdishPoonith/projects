package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.g2  reason: invalid package */
/* loaded from: classes.dex */
public final class g2 implements t {

    /* renamed from: k  reason: collision with root package name */
    private static final String f4604k = "g2";

    /* renamed from: j  reason: collision with root package name */
    private List f4605j;

    public final g2 a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4605j = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.f4605j.add(optJSONArray.getString(i10));
                }
            }
            return this;
        } catch (JSONException e10) {
            throw t3.a(e10, f4604k, str);
        }
    }

    public final List b() {
        return this.f4605j;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        a(str);
        return this;
    }
}
