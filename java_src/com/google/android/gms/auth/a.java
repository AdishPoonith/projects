package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import d4.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = b.z(parcel);
        String str = null;
        Long l10 = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = b.q(parcel);
            switch (b.j(q10)) {
                case 1:
                    i10 = b.s(parcel, q10);
                    break;
                case 2:
                    str = b.e(parcel, q10);
                    break;
                case 3:
                    l10 = b.w(parcel, q10);
                    break;
                case 4:
                    z11 = b.k(parcel, q10);
                    break;
                case 5:
                    z12 = b.k(parcel, q10);
                    break;
                case 6:
                    arrayList = b.f(parcel, q10);
                    break;
                case 7:
                    str2 = b.e(parcel, q10);
                    break;
                default:
                    b.y(parcel, q10);
                    break;
            }
        }
        b.i(parcel, z10);
        return new TokenData(i10, str, l10, z11, z12, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
