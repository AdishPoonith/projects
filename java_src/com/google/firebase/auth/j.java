package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new c2();

    /* renamed from: j  reason: collision with root package name */
    private final String f6546j;

    /* renamed from: k  reason: collision with root package name */
    private String f6547k;

    /* renamed from: l  reason: collision with root package name */
    private final String f6548l;

    /* renamed from: m  reason: collision with root package name */
    private String f6549m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6550n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2, String str3, String str4, boolean z10) {
        this.f6546j = c4.s.f(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f6547k = str2;
        this.f6548l = str3;
        this.f6549m = str4;
        this.f6550n = z10;
    }

    public static boolean L(String str) {
        f c10;
        return (TextUtils.isEmpty(str) || (c10 = f.c(str)) == null || c10.b() != 4) ? false : true;
    }

    @Override // com.google.firebase.auth.h
    public String B() {
        return "password";
    }

    @Override // com.google.firebase.auth.h
    public String C() {
        return !TextUtils.isEmpty(this.f6547k) ? "password" : "emailLink";
    }

    @Override // com.google.firebase.auth.h
    public final h D() {
        return new j(this.f6546j, this.f6547k, this.f6548l, this.f6549m, this.f6550n);
    }

    public final j E(a0 a0Var) {
        this.f6549m = a0Var.b0();
        this.f6550n = true;
        return this;
    }

    public final String F() {
        return this.f6549m;
    }

    public final String G() {
        return this.f6546j;
    }

    public final String H() {
        return this.f6547k;
    }

    public final String I() {
        return this.f6548l;
    }

    public final boolean J() {
        return !TextUtils.isEmpty(this.f6548l);
    }

    public final boolean K() {
        return this.f6550n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6546j, false);
        d4.c.s(parcel, 2, this.f6547k, false);
        d4.c.s(parcel, 3, this.f6548l, false);
        d4.c.s(parcel, 4, this.f6549m, false);
        d4.c.c(parcel, 5, this.f6550n);
        d4.c.b(parcel, a10);
    }
}
