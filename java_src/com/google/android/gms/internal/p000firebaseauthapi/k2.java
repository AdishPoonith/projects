package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import d4.b;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k2  reason: invalid package */
/* loaded from: classes.dex */
public final class k2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = b.z(parcel);
        String str = null;
        String str2 = null;
        Long l10 = null;
        String str3 = null;
        Long l11 = null;
        while (parcel.dataPosition() < z10) {
            int q10 = b.q(parcel);
            int j10 = b.j(q10);
            if (j10 == 2) {
                str = b.e(parcel, q10);
            } else if (j10 == 3) {
                str2 = b.e(parcel, q10);
            } else if (j10 == 4) {
                l10 = b.w(parcel, q10);
            } else if (j10 == 5) {
                str3 = b.e(parcel, q10);
            } else if (j10 != 6) {
                b.y(parcel, q10);
            } else {
                l11 = b.w(parcel, q10);
            }
        }
        b.i(parcel, z10);
        return new j2(str, str2, l10, str3, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j2[i10];
    }
}
