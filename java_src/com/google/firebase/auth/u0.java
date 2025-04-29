package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
/* loaded from: classes.dex */
public class u0 extends h {
    public static final Parcelable.Creator<u0> CREATOR = new r1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6623j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(String str) {
        this.f6623j = c4.s.f(str);
    }

    public static i3 E(u0 u0Var, String str) {
        c4.s.j(u0Var);
        return new i3(null, null, u0Var.B(), null, null, u0Var.f6623j, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String B() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.h
    public String C() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.h
    public final h D() {
        return new u0(this.f6623j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6623j, false);
        d4.c.b(parcel, a10);
    }
}
