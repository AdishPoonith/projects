package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.firebase.auth.f;
import com.google.firebase.auth.j;
import f4.a;
import org.json.JSONObject;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.p1  reason: invalid package */
/* loaded from: classes.dex */
public final class p1 implements s {

    /* renamed from: n  reason: collision with root package name */
    private static final a f5159n = new a(p1.class.getSimpleName(), new String[0]);

    /* renamed from: j  reason: collision with root package name */
    private final String f5160j;

    /* renamed from: k  reason: collision with root package name */
    private final String f5161k;

    /* renamed from: l  reason: collision with root package name */
    private final String f5162l;

    /* renamed from: m  reason: collision with root package name */
    private final String f5163m;

    public p1(j jVar, String str, String str2) {
        this.f5160j = s.f(jVar.G());
        this.f5161k = s.f(jVar.I());
        this.f5162l = str;
        this.f5163m = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s
    public final String zza() {
        f c10 = f.c(this.f5161k);
        String a10 = c10 != null ? c10.a() : null;
        String d10 = c10 != null ? c10.d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.f5160j);
        if (a10 != null) {
            jSONObject.put("oobCode", a10);
        }
        if (d10 != null) {
            jSONObject.put("tenantId", d10);
        }
        String str = this.f5162l;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.f5163m;
        if (str2 != null) {
            t3.d(jSONObject, "captchaResp", str2);
        } else {
            t3.c(jSONObject);
        }
        return jSONObject.toString();
    }
}
