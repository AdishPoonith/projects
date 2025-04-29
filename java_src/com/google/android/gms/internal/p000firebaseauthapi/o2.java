package com.google.android.gms.internal.p000firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o2  reason: invalid package */
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a  reason: collision with root package name */
    private String f5091a;

    /* renamed from: b  reason: collision with root package name */
    private String f5092b;

    /* renamed from: c  reason: collision with root package name */
    private String f5093c;

    /* renamed from: d  reason: collision with root package name */
    private String f5094d;

    /* renamed from: e  reason: collision with root package name */
    private String f5095e;

    /* renamed from: f  reason: collision with root package name */
    private String f5096f;

    /* renamed from: g  reason: collision with root package name */
    private String f5097g;

    public o2() {
    }

    public o2(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f5091a = str;
        this.f5092b = str2;
        this.f5093c = str3;
        this.f5094d = str4;
        this.f5095e = null;
        this.f5096f = str6;
        this.f5097g = str7;
    }

    public final Uri a() {
        if (TextUtils.isEmpty(this.f5093c)) {
            return null;
        }
        return Uri.parse(this.f5093c);
    }

    public final String b() {
        return this.f5092b;
    }

    public final String c() {
        return this.f5097g;
    }

    public final String d() {
        return this.f5091a;
    }

    public final String e() {
        return this.f5096f;
    }

    public final String f() {
        return this.f5094d;
    }

    public final String g() {
        return this.f5095e;
    }

    public final void h(String str) {
        this.f5095e = str;
    }
}
