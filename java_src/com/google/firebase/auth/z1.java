package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.q0;
/* loaded from: classes.dex */
public final class z1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            d4.b.j(q10);
            d4.b.y(parcel, q10);
        }
        d4.b.i(parcel, z10);
        return new q0.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q0.a[i10];
    }
}
