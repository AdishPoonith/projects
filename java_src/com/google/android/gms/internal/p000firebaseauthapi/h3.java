package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import d4.b;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.h3  reason: invalid package */
/* loaded from: classes.dex */
public final class h3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = b.z(parcel);
        while (parcel.dataPosition() < z10) {
            int q10 = b.q(parcel);
            b.j(q10);
            b.y(parcel, q10);
        }
        b.i(parcel, z10);
        return new g3();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g3[i10];
    }
}
