package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class g extends d4.a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: j  reason: collision with root package name */
    final int f4056j;

    /* renamed from: k  reason: collision with root package name */
    String f4057k;

    public g() {
        this.f4056j = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10, String str) {
        this.f4056j = i10;
        this.f4057k = str;
    }

    public final g B(String str) {
        this.f4057k = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = d4.c.a(parcel);
        d4.c.l(parcel, 1, this.f4056j);
        d4.c.s(parcel, 2, this.f4057k, false);
        d4.c.b(parcel, a10);
    }
}
