package com.google.android.gms.internal.p000firebaseauthapi;

import h4.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i2  reason: invalid package */
/* loaded from: classes.dex */
public final class i2 implements t {

    /* renamed from: m  reason: collision with root package name */
    private static final String f4713m = "i2";

    /* renamed from: j  reason: collision with root package name */
    private String f4714j;

    /* renamed from: k  reason: collision with root package name */
    private a9 f4715k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4716l = false;

    public final String a() {
        return this.f4714j;
    }

    public final boolean b() {
        return this.f4716l;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        a9 q10;
        String a10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4714j = l.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                boolean z10 = false;
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    i8 i8Var = new i8();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        i8Var.b(jSONObject2 == null ? new k1(null, null) : new k1(l.a(jSONObject2.optString("provider")), l.a(jSONObject2.optString("enforcementState"))));
                    }
                    q10 = i8Var.c();
                    this.f4715k = q10;
                    if (q10 != null && !q10.isEmpty()) {
                        a10 = ((q2) q10.get(0)).a();
                        String b10 = ((q2) q10.get(0)).b();
                        if (a10 != null && b10 != null && ((a10.equals("ENFORCE") || a10.equals("AUDIT")) && b10.equals("EMAIL_PASSWORD_PROVIDER"))) {
                            z10 = true;
                        }
                    }
                    this.f4716l = z10;
                }
                q10 = a9.q(new ArrayList());
                this.f4715k = q10;
                if (q10 != null) {
                    a10 = ((q2) q10.get(0)).a();
                    String b102 = ((q2) q10.get(0)).b();
                    if (a10 != null) {
                        z10 = true;
                    }
                }
                this.f4716l = z10;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f4713m, str);
        }
    }
}
