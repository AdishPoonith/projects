package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v2  reason: invalid package */
/* loaded from: classes.dex */
public final class v2 implements s {

    /* renamed from: j  reason: collision with root package name */
    private String f5496j;

    /* renamed from: k  reason: collision with root package name */
    private String f5497k;

    /* renamed from: l  reason: collision with root package name */
    private String f5498l;

    /* renamed from: m  reason: collision with root package name */
    private String f5499m;

    /* renamed from: n  reason: collision with root package name */
    private String f5500n;

    /* renamed from: o  reason: collision with root package name */
    private String f5501o;

    /* renamed from: p  reason: collision with root package name */
    private final e3 f5502p = new e3(null);

    /* renamed from: q  reason: collision with root package name */
    private final e3 f5503q = new e3(null);

    /* renamed from: r  reason: collision with root package name */
    private String f5504r;

    public final v2 a(String str) {
        s.f(str);
        this.f5503q.a().add(str);
        return this;
    }

    public final v2 b(String str) {
        if (str == null) {
            this.f5502p.a().add("DISPLAY_NAME");
        } else {
            this.f5497k = str;
        }
        return this;
    }

    public final v2 c(String str) {
        if (str == null) {
            this.f5502p.a().add("EMAIL");
        } else {
            this.f5498l = str;
        }
        return this;
    }

    public final v2 d(String str) {
        this.f5496j = s.f(str);
        return this;
    }

    public final v2 e(String str) {
        this.f5500n = s.f(str);
        return this;
    }

    public final v2 f(String str) {
        if (str == null) {
            this.f5502p.a().add("PASSWORD");
        } else {
            this.f5499m = str;
        }
        return this;
    }

    public final v2 g(String str) {
        if (str == null) {
            this.f5502p.a().add("PHOTO_URL");
        } else {
            this.f5501o = str;
        }
        return this;
    }

    public final v2 h(String str) {
        this.f5504r = str;
        return this;
    }

    public final String i() {
        return this.f5497k;
    }

    public final String j() {
        return this.f5498l;
    }

    public final String k() {
        return this.f5499m;
    }

    public final String l() {
        return this.f5501o;
    }

    public final boolean m(String str) {
        s.f(str);
        return this.f5502p.a().contains(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        char c10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        if (!this.f5503q.a().isEmpty()) {
            List a10 = this.f5503q.a();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < a10.size(); i10++) {
                jSONArray.put(a10.get(i10));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List a11 = this.f5502p.a();
        int size = a11.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < a11.size(); i11++) {
            String str = (String) a11.get(i11);
            int i12 = 2;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
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
                i12 = 1;
            } else if (c10 != 1) {
                i12 = c10 != 2 ? c10 != 3 ? 0 : 4 : 5;
            }
            iArr[i11] = i12;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < size; i13++) {
                jSONArray2.put(iArr[i13]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.f5496j;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.f5498l;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.f5499m;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.f5497k;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.f5501o;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.f5500n;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.f5504r;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }
}
