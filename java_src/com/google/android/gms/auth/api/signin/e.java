package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 2:
                    arrayList = d4.b.h(parcel, q10, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) d4.b.d(parcel, q10, Account.CREATOR);
                    break;
                case 4:
                    z11 = d4.b.k(parcel, q10);
                    break;
                case 5:
                    z12 = d4.b.k(parcel, q10);
                    break;
                case 6:
                    z13 = d4.b.k(parcel, q10);
                    break;
                case 7:
                    str = d4.b.e(parcel, q10);
                    break;
                case 8:
                    str2 = d4.b.e(parcel, q10);
                    break;
                case 9:
                    arrayList2 = d4.b.h(parcel, q10, z3.a.CREATOR);
                    break;
                case 10:
                    str3 = d4.b.e(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new GoogleSignInOptions(i10, arrayList, account, z11, z12, z13, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
