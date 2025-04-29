package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import d4.b;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.j3  reason: invalid package */
/* loaded from: classes.dex */
public final class j3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = b.q(parcel);
            switch (b.j(q10)) {
                case 2:
                    str = b.e(parcel, q10);
                    break;
                case 3:
                    str2 = b.e(parcel, q10);
                    break;
                case 4:
                    str3 = b.e(parcel, q10);
                    break;
                case 5:
                    str4 = b.e(parcel, q10);
                    break;
                case 6:
                    str5 = b.e(parcel, q10);
                    break;
                case 7:
                    str6 = b.e(parcel, q10);
                    break;
                case 8:
                    str7 = b.e(parcel, q10);
                    break;
                case 9:
                    str8 = b.e(parcel, q10);
                    break;
                case 10:
                    z11 = b.k(parcel, q10);
                    break;
                case 11:
                    z12 = b.k(parcel, q10);
                    break;
                case 12:
                    str9 = b.e(parcel, q10);
                    break;
                case 13:
                    str10 = b.e(parcel, q10);
                    break;
                case 14:
                    str11 = b.e(parcel, q10);
                    break;
                case 15:
                    str12 = b.e(parcel, q10);
                    break;
                case 16:
                    z13 = b.k(parcel, q10);
                    break;
                case 17:
                    str13 = b.e(parcel, q10);
                    break;
                default:
                    b.y(parcel, q10);
                    break;
            }
        }
        b.i(parcel, z10);
        return new i3(str, str2, str3, str4, str5, str6, str7, str8, z11, z12, str9, str10, str11, str12, z13, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i3[i10];
    }
}
