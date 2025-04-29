package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class o0 extends h implements Cloneable {
    public static final Parcelable.Creator<o0> CREATOR = new o1();

    /* renamed from: j  reason: collision with root package name */
    private final String f6571j;

    /* renamed from: k  reason: collision with root package name */
    private final String f6572k;

    /* renamed from: l  reason: collision with root package name */
    private final String f6573l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6574m;

    /* renamed from: n  reason: collision with root package name */
    private final String f6575n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(String str, String str2, String str3, boolean z10, String str4) {
        boolean z11 = true;
        if ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) {
            z11 = false;
        }
        c4.s.b(z11, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f6571j = str;
        this.f6572k = str2;
        this.f6573l = str3;
        this.f6574m = z10;
        this.f6575n = str4;
    }

    public static o0 G(String str, String str2) {
        return new o0(str, str2, null, true, null);
    }

    public static o0 H(String str, String str2) {
        return new o0(null, null, str, true, str2);
    }

    @Override // com.google.firebase.auth.h
    public String B() {
        return "phone";
    }

    @Override // com.google.firebase.auth.h
    public String C() {
        return "phone";
    }

    @Override // com.google.firebase.auth.h
    public final h D() {
        return clone();
    }

    public String E() {
        return this.f6572k;
    }

    /* renamed from: F */
    public final o0 clone() {
        return new o0(this.f6571j, E(), this.f6573l, this.f6574m, this.f6575n);
    }

    public final o0 I(boolean z10) {
        this.f6574m = false;
        return this;
    }

    public final String J() {
        return this.f6573l;
    }

    public final String K() {
        return this.f6571j;
    }

    public final String L() {
        return this.f6575n;
    }

    public final boolean M() {
        return this.f6574m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6571j, false);
        d4.c.s(parcel, 2, E(), false);
        d4.c.s(parcel, 4, this.f6573l, false);
        d4.c.c(parcel, 5, this.f6574m);
        d4.c.s(parcel, 6, this.f6575n, false);
        d4.c.b(parcel, a10);
    }
}
