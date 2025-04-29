package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
/* loaded from: classes.dex */
public class w0 extends h {
    public static final Parcelable.Creator<w0> CREATOR = new v1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6628j;

    /* renamed from: k  reason: collision with root package name */
    private final String f6629k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(String str, String str2) {
        this.f6628j = c4.s.f(str);
        this.f6629k = c4.s.f(str2);
    }

    public static i3 E(w0 w0Var, String str) {
        c4.s.j(w0Var);
        return new i3(null, w0Var.f6628j, w0Var.B(), null, w0Var.f6629k, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String B() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.h
    public String C() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.h
    public final h D() {
        return new w0(this.f6628j, this.f6629k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6628j, false);
        d4.c.s(parcel, 2, this.f6629k, false);
        d4.c.b(parcel, a10);
    }
}
