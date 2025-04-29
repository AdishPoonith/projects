package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class q1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j10 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j11 = d4.b.j(q10);
            if (j11 == 1) {
                str = d4.b.e(parcel, q10);
            } else if (j11 == 2) {
                str2 = d4.b.e(parcel, q10);
            } else if (j11 == 3) {
                j10 = d4.b.v(parcel, q10);
            } else if (j11 != 4) {
                d4.b.y(parcel, q10);
            } else {
                str3 = d4.b.e(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new t0(str, str2, j10, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t0[i10];
    }
}
