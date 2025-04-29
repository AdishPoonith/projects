package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
/* loaded from: classes.dex */
public class d0 extends h {
    public static final Parcelable.Creator<d0> CREATOR = new j1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6492j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(String str) {
        this.f6492j = c4.s.f(str);
    }

    public static i3 E(d0 d0Var, String str) {
        c4.s.j(d0Var);
        return new i3(null, d0Var.f6492j, d0Var.B(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String B() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.h
    public String C() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.h
    public final h D() {
        return new d0(this.f6492j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6492j, false);
        d4.c.b(parcel, a10);
    }
}
