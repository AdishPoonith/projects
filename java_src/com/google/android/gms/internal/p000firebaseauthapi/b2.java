package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.firebase.auth.e;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b2  reason: invalid package */
/* loaded from: classes.dex */
public final class b2 implements s {

    /* renamed from: j  reason: collision with root package name */
    private final String f4370j;

    /* renamed from: k  reason: collision with root package name */
    private String f4371k;

    /* renamed from: l  reason: collision with root package name */
    private String f4372l;

    /* renamed from: m  reason: collision with root package name */
    private String f4373m;

    /* renamed from: n  reason: collision with root package name */
    private e f4374n;

    /* renamed from: o  reason: collision with root package name */
    private String f4375o;

    /* renamed from: p  reason: collision with root package name */
    private String f4376p;

    public b2(int i10) {
        this.f4370j = i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    private b2(int i10, e eVar, String str, String str2, String str3, String str4, String str5) {
        this.f4370j = "VERIFY_AND_CHANGE_EMAIL";
        this.f4374n = (e) s.j(eVar);
        this.f4371k = null;
        this.f4372l = str2;
        this.f4373m = str3;
        this.f4375o = null;
        this.f4376p = null;
    }

    public static b2 b(e eVar, String str, String str2) {
        s.f(str);
        s.f(str2);
        s.j(eVar);
        return new b2(7, eVar, null, str2, str, null, null);
    }

    public final e a() {
        return this.f4374n;
    }

    public final b2 c(e eVar) {
        this.f4374n = (e) s.j(eVar);
        return this;
    }

    public final b2 d(String str) {
        this.f4376p = str;
        return this;
    }

    public final b2 e(String str) {
        this.f4371k = s.f(str);
        return this;
    }

    public final b2 f(String str) {
        this.f4375o = str;
        return this;
    }

    public final b2 g(String str) {
        this.f4373m = s.f(str);
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        char c10;
        JSONObject jSONObject = new JSONObject();
        String str = this.f4370j;
        int i10 = 0;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            i10 = 1;
        } else if (c10 == 1) {
            i10 = 4;
        } else if (c10 == 2) {
            i10 = 6;
        } else if (c10 == 3) {
            i10 = 7;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.f4371k;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.f4372l;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.f4373m;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        e eVar = this.f4374n;
        if (eVar != null) {
            jSONObject.put("androidInstallApp", eVar.C());
            jSONObject.put("canHandleCodeInApp", this.f4374n.B());
            if (this.f4374n.G() != null) {
                jSONObject.put("continueUrl", this.f4374n.G());
            }
            if (this.f4374n.F() != null) {
                jSONObject.put("iosBundleId", this.f4374n.F());
            }
            if (this.f4374n.L() != null) {
                jSONObject.put("iosAppStoreId", this.f4374n.L());
            }
            if (this.f4374n.E() != null) {
                jSONObject.put("androidPackageName", this.f4374n.E());
            }
            if (this.f4374n.D() != null) {
                jSONObject.put("androidMinimumVersion", this.f4374n.D());
            }
            if (this.f4374n.K() != null) {
                jSONObject.put("dynamicLinkDomain", this.f4374n.K());
            }
        }
        String str5 = this.f4375o;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.f4376p;
        if (str6 != null) {
            t3.d(jSONObject, "captchaResp", str6);
        } else {
            t3.c(jSONObject);
        }
        return jSONObject.toString();
    }
}
