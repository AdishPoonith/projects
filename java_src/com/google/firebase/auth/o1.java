package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                str = d4.b.e(parcel, q10);
            } else if (j10 == 2) {
                str2 = d4.b.e(parcel, q10);
            } else if (j10 == 4) {
                str3 = d4.b.e(parcel, q10);
            } else if (j10 == 5) {
                z11 = d4.b.k(parcel, q10);
            } else if (j10 != 6) {
                d4.b.y(parcel, q10);
            } else {
                str4 = d4.b.e(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new o0(str, str2, str3, z11, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o0[i10];
    }
}
