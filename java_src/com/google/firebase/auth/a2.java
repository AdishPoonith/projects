package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
/* loaded from: classes.dex */
public final class a2 extends m0 {
    public static final Parcelable.Creator<a2> CREATOR = new b2();

    /* renamed from: j  reason: collision with root package name */
    private final String f6480j;

    /* renamed from: k  reason: collision with root package name */
    private final String f6481k;

    /* renamed from: l  reason: collision with root package name */
    private final String f6482l;

    /* renamed from: m  reason: collision with root package name */
    private final i3 f6483m;

    /* renamed from: n  reason: collision with root package name */
    private final String f6484n;

    /* renamed from: o  reason: collision with root package name */
    private final String f6485o;

    /* renamed from: p  reason: collision with root package name */
    private final String f6486p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a2(String str, String str2, String str3, i3 i3Var, String str4, String str5, String str6) {
        this.f6480j = com.google.android.gms.internal.p000firebaseauthapi.d1.c(str);
        this.f6481k = str2;
        this.f6482l = str3;
        this.f6483m = i3Var;
        this.f6484n = str4;
        this.f6485o = str5;
        this.f6486p = str6;
    }

    public static a2 F(i3 i3Var) {
        c4.s.k(i3Var, "Must specify a non-null webSignInCredential");
        return new a2(null, null, null, i3Var, null, null, null);
    }

    public static a2 G(String str, String str2, String str3, String str4, String str5) {
        c4.s.g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new a2(str, str2, str3, null, str4, str5, null);
    }

    public static i3 H(a2 a2Var, String str) {
        c4.s.j(a2Var);
        i3 i3Var = a2Var.f6483m;
        return i3Var != null ? i3Var : new i3(a2Var.f6481k, a2Var.f6482l, a2Var.f6480j, null, a2Var.f6485o, null, str, a2Var.f6484n, a2Var.f6486p);
    }

    @Override // com.google.firebase.auth.h
    public final String B() {
        return this.f6480j;
    }

    @Override // com.google.firebase.auth.h
    public final String C() {
        return this.f6480j;
    }

    @Override // com.google.firebase.auth.h
    public final h D() {
        return new a2(this.f6480j, this.f6481k, this.f6482l, this.f6483m, this.f6484n, this.f6485o, this.f6486p);
    }

    @Override // com.google.firebase.auth.m0
    public final String E() {
        return this.f6482l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6480j, false);
        d4.c.s(parcel, 2, this.f6481k, false);
        d4.c.s(parcel, 3, this.f6482l, false);
        d4.c.r(parcel, 4, this.f6483m, i10, false);
        d4.c.s(parcel, 5, this.f6484n, false);
        d4.c.s(parcel, 6, this.f6485o, false);
        d4.c.s(parcel, 7, this.f6486p, false);
        d4.c.b(parcel, a10);
    }
}
