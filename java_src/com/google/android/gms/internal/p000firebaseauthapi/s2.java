package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import h4.l;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s2  reason: invalid package */
/* loaded from: classes.dex */
public final class s2 implements t {

    /* renamed from: n  reason: collision with root package name */
    private static final String f5316n = "s2";

    /* renamed from: j  reason: collision with root package name */
    private String f5317j;

    /* renamed from: k  reason: collision with root package name */
    private String f5318k;

    /* renamed from: l  reason: collision with root package name */
    private String f5319l;

    /* renamed from: m  reason: collision with root package name */
    private n2 f5320m;

    public final n2 a() {
        return this.f5320m;
    }

    public final String b() {
        return this.f5317j;
    }

    public final String c() {
        return this.f5318k;
    }

    public final String d() {
        return this.f5319l;
    }

    public final boolean e() {
        return this.f5317j != null;
    }

    public final boolean f() {
        return this.f5320m != null;
    }

    public final boolean g() {
        return this.f5318k != null;
    }

    public final boolean h() {
        return this.f5319l != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.t
    public final /* bridge */ /* synthetic */ t zza(String str) {
        String str2;
        char c10;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f5317j = l.a(jSONObject.optString("email"));
            this.f5318k = l.a(jSONObject.optString("newEmail"));
            int optInt = jSONObject.optInt("reqType");
            if (optInt != 1) {
                switch (optInt) {
                    case 4:
                        str2 = "VERIFY_EMAIL";
                        break;
                    case 5:
                        str2 = "RECOVER_EMAIL";
                        break;
                    case 6:
                        str2 = "EMAIL_SIGNIN";
                        break;
                    case 7:
                        str2 = "VERIFY_AND_CHANGE_EMAIL";
                        break;
                    case 8:
                        str2 = "REVERT_SECOND_FACTOR_ADDITION";
                        break;
                    default:
                        str2 = null;
                        break;
                }
            } else {
                str2 = "PASSWORD_RESET";
            }
            this.f5319l = str2;
            if (TextUtils.isEmpty(str2)) {
                String optString = jSONObject.optString("requestType");
                switch (optString.hashCode()) {
                    case -1874510116:
                        if (optString.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1452371317:
                        if (optString.equals("PASSWORD_RESET")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1341836234:
                        if (optString.equals("VERIFY_EMAIL")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1099157829:
                        if (optString.equals("VERIFY_AND_CHANGE_EMAIL")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 870738373:
                        if (optString.equals("EMAIL_SIGNIN")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 970484929:
                        if (optString.equals("RECOVER_EMAIL")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                this.f5319l = (c10 == 0 || c10 == 1 || c10 == 2 || c10 == 3 || c10 == 4 || c10 == 5) ? optString : null;
            }
            if (jSONObject.has("mfaInfo")) {
                this.f5320m = n2.b(jSONObject.optJSONObject("mfaInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw t3.a(e10, f5316n, str);
        }
    }
}
