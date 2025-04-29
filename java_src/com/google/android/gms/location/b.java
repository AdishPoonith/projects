package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import q4.z;
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        WorkSource workSource = new WorkSource();
        String str = null;
        z zVar = null;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        long j12 = 3600000;
        long j13 = 600000;
        long j14 = 0;
        long j15 = -1;
        int i10 = 102;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z12 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 2:
                    j12 = d4.b.v(parcel, q10);
                    break;
                case 3:
                    j13 = d4.b.v(parcel, q10);
                    break;
                case 4:
                default:
                    d4.b.y(parcel, q10);
                    break;
                case 5:
                    j10 = d4.b.v(parcel, q10);
                    break;
                case 6:
                    i11 = d4.b.s(parcel, q10);
                    break;
                case 7:
                    f10 = d4.b.o(parcel, q10);
                    break;
                case 8:
                    j14 = d4.b.v(parcel, q10);
                    break;
                case 9:
                    z11 = d4.b.k(parcel, q10);
                    break;
                case 10:
                    j11 = d4.b.v(parcel, q10);
                    break;
                case 11:
                    j15 = d4.b.v(parcel, q10);
                    break;
                case 12:
                    i12 = d4.b.s(parcel, q10);
                    break;
                case 13:
                    i13 = d4.b.s(parcel, q10);
                    break;
                case 14:
                    str = d4.b.e(parcel, q10);
                    break;
                case 15:
                    z12 = d4.b.k(parcel, q10);
                    break;
                case 16:
                    workSource = (WorkSource) d4.b.d(parcel, q10, WorkSource.CREATOR);
                    break;
                case 17:
                    zVar = (z) d4.b.d(parcel, q10, z.CREATOR);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new LocationRequest(i10, j12, j13, j14, j10, j11, i11, f10, z11, j15, i12, i13, str, z12, workSource, zVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
