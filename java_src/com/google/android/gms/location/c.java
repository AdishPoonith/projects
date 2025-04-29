package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        List list = LocationResult.f5839k;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            if (d4.b.j(q10) != 1) {
                d4.b.y(parcel, q10);
            } else {
                list = d4.b.h(parcel, q10, Location.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
