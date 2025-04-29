package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
/* loaded from: classes.dex */
public class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new d2();

    /* renamed from: j  reason: collision with root package name */
    private final String f6557j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str) {
        this.f6557j = c4.s.f(str);
    }

    public static i3 E(l lVar, String str) {
        c4.s.j(lVar);
        return new i3(null, lVar.f6557j, lVar.B(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public String B() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.h
    public String C() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.h
    public final h D() {
        return new l(this.f6557j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.s(parcel, 1, this.f6557j, false);
        d4.c.b(parcel, a10);
    }
}
