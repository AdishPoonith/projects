package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 4) {
                str = d4.b.e(parcel, q10);
            } else if (j10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) d4.b.d(parcel, q10, GoogleSignInAccount.CREATOR);
            } else if (j10 != 8) {
                d4.b.y(parcel, q10);
            } else {
                str2 = d4.b.e(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
