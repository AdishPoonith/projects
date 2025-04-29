package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.internal.p000firebaseauthapi.d9;
import java.util.HashMap;
import java.util.Set;
/* loaded from: classes.dex */
public class f {

    /* renamed from: g  reason: collision with root package name */
    private static final d9 f6512g;

    /* renamed from: a  reason: collision with root package name */
    private final String f6513a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6514b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6515c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6516d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6517e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6518f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f6512g = d9.c(hashMap.entrySet());
    }

    private f(String str) {
        String e10 = e(str, "apiKey");
        String e11 = e(str, "oobCode");
        String e12 = e(str, "mode");
        if (e10 == null || e11 == null || e12 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f6513a = c4.s.f(e10);
        this.f6514b = c4.s.f(e11);
        this.f6515c = c4.s.f(e12);
        this.f6516d = e(str, "continueUrl");
        this.f6517e = e(str, "languageCode");
        this.f6518f = e(str, "tenantId");
    }

    public static f c(String str) {
        c4.s.f(str);
        try {
            return new f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(c4.s.f(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f6514b;
    }

    public int b() {
        d9 d9Var = f6512g;
        if (d9Var.containsKey(this.f6515c)) {
            return ((Integer) d9Var.get(this.f6515c)).intValue();
        }
        return 3;
    }

    public final String d() {
        return this.f6518f;
    }
}
