package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.y1  reason: invalid package */
/* loaded from: classes.dex */
public final class y1 implements t {

    /* renamed from: k  reason: collision with root package name */
    private static final String f5686k = "y1";

    /* renamed from: j  reason: collision with root package name */
    private a2 f5687j;

    public final List a() {
        return this.f5687j.a();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        a2 a2Var;
        int i10;
        z1 z1Var;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            z1Var = new z1();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            z1Var = new z1(l.a(jSONObject2.optString("localId", null)), l.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z10), l.a(jSONObject2.optString("displayName", null)), l.a(jSONObject2.optString("photoUrl", null)), p2.a(jSONObject2.optJSONArray("providerUserInfo")), l.a(jSONObject2.optString("rawPassword", null)), l.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, n2.g(jSONObject2.optJSONArray("mfaInfo")));
                        }
                        arrayList.add(z1Var);
                        i11 = i10 + 1;
                        z10 = false;
                    }
                    a2Var = new a2(arrayList);
                }
                a2Var = new a2(new ArrayList());
            } else {
                a2Var = new a2();
            }
            this.f5687j = a2Var;
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5686k, str);
        }
    }
}
