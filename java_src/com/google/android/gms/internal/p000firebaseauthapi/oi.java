package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Build;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.oi  reason: invalid package */
/* loaded from: classes.dex */
public final class oi {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f5133d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final String f5134e = "oi";

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f5135f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final qa f5136a;

    /* renamed from: b  reason: collision with root package name */
    private final s9 f5137b;

    /* renamed from: c  reason: collision with root package name */
    private final oa f5138c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ oi(mi miVar, ni niVar) {
        this.f5136a = new ri(mi.a(miVar), mi.h(miVar), mi.i(miVar));
        this.f5137b = mi.b(miVar);
        this.f5138c = mi.c(miVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean d() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public final synchronized na a() {
        return this.f5138c.b();
    }
}
