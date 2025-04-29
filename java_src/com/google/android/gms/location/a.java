package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import t4.n;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        long j10 = 0;
        n[] nVarArr = null;
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    i11 = d4.b.s(parcel, q10);
                    break;
                case 2:
                    i12 = d4.b.s(parcel, q10);
                    break;
                case 3:
                    j10 = d4.b.v(parcel, q10);
                    break;
                case 4:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 5:
                    nVarArr = (n[]) d4.b.g(parcel, q10, n.CREATOR);
                    break;
                case 6:
                    z11 = d4.b.k(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new LocationAvailability(i10, i11, i12, j10, nVarArr, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
