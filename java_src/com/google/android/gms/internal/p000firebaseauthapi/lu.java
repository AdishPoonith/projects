package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lu  reason: invalid package */
/* loaded from: classes.dex */
public final class lu {

    /* renamed from: b  reason: collision with root package name */
    public static final lu f4963b = new lu(new mu());

    /* renamed from: c  reason: collision with root package name */
    public static final lu f4964c = new lu(new qu());

    /* renamed from: d  reason: collision with root package name */
    public static final lu f4965d = new lu(new su());

    /* renamed from: e  reason: collision with root package name */
    public static final lu f4966e = new lu(new ru());

    /* renamed from: f  reason: collision with root package name */
    public static final lu f4967f = new lu(new nu());

    /* renamed from: g  reason: collision with root package name */
    public static final lu f4968g = new lu(new pu());

    /* renamed from: h  reason: collision with root package name */
    public static final lu f4969h = new lu(new ou());

    /* renamed from: a  reason: collision with root package name */
    private final ku f4970a;

    public lu(tu tuVar) {
        this.f4970a = fg.b() ? new ju(tuVar, null) : cv.a() ? new eu(tuVar, null) : new gu(tuVar, null);
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.f4970a.zza(str);
    }
}
