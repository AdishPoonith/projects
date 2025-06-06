package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 2:
                    str = d4.b.e(parcel, q10);
                    break;
                case 3:
                    str2 = d4.b.e(parcel, q10);
                    break;
                case 4:
                    str3 = d4.b.e(parcel, q10);
                    break;
                case 5:
                    str4 = d4.b.e(parcel, q10);
                    break;
                case 6:
                    uri = (Uri) d4.b.d(parcel, q10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = d4.b.e(parcel, q10);
                    break;
                case 8:
                    j10 = d4.b.v(parcel, q10);
                    break;
                case 9:
                    str6 = d4.b.e(parcel, q10);
                    break;
                case 10:
                    arrayList = d4.b.h(parcel, q10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = d4.b.e(parcel, q10);
                    break;
                case 12:
                    str8 = d4.b.e(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
