package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.i3;
/* loaded from: classes.dex */
public final class b2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        i3 i3Var = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    str = d4.b.e(parcel, q10);
                    break;
                case 2:
                    str2 = d4.b.e(parcel, q10);
                    break;
                case 3:
                    str3 = d4.b.e(parcel, q10);
                    break;
                case 4:
                    i3Var = (i3) d4.b.d(parcel, q10, i3.CREATOR);
                    break;
                case 5:
                    str4 = d4.b.e(parcel, q10);
                    break;
                case 6:
                    str5 = d4.b.e(parcel, q10);
                    break;
                case 7:
                    str6 = d4.b.e(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new a2(str, str2, str3, i3Var, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a2[i10];
    }
}
