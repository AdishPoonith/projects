package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n1  reason: invalid package */
/* loaded from: classes.dex */
public final class n1 implements t {

    /* renamed from: n  reason: collision with root package name */
    private static final String f5041n = "n1";

    /* renamed from: j  reason: collision with root package name */
    private String f5042j;

    /* renamed from: k  reason: collision with root package name */
    private String f5043k;

    /* renamed from: l  reason: collision with root package name */
    private e3 f5044l = new e3(null);

    /* renamed from: m  reason: collision with root package name */
    private List f5045m;

    public final List a() {
        return this.f5045m;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5042j = jSONObject.optString("authUri", null);
            jSONObject.optBoolean("registered", false);
            this.f5043k = jSONObject.optString("providerId", null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                this.f5044l = new e3(1, t3.b(jSONObject.optJSONArray("allProviders")));
            } else {
                this.f5044l = new e3(null);
            }
            this.f5045m = t3.b(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5041n, str);
        }
    }
}
