package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
/* loaded from: classes.dex */
public class f0 extends h {
    public static final Parcelable.Creator<f0> CREATOR = new k1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6519j;

    /* renamed from: k  reason: collision with root package name */
    private final String f6520k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f6519j = str;
        this.f6520k = str2;
    }

    public static i3 E(f0 f0Var, String str) {
        c4.s.j(f0Var);
        return new i3(f0Var.f6519j, f0Var.f6520k, f0Var.B(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String B() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.h
    public String C() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.h
    public final h D() {
        return new f0(this.f6519j, this.f6520k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6519j, false);
        d4.c.s(parcel, 2, this.f6520k, false);
        d4.c.b(parcel, a10);
    }
}
