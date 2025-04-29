package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            if (d4.b.j(q10) != 1) {
                d4.b.y(parcel, q10);
            } else {
                str = d4.b.e(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new l(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
