package c4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        IBinder iBinder = null;
        b4.b bVar = null;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 == 2) {
                iBinder = d4.b.r(parcel, q10);
            } else if (j10 == 3) {
                bVar = (b4.b) d4.b.d(parcel, q10, b4.b.CREATOR);
            } else if (j10 == 4) {
                z11 = d4.b.k(parcel, q10);
            } else if (j10 != 5) {
                d4.b.y(parcel, q10);
            } else {
                z12 = d4.b.k(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new t0(i10, iBinder, bVar, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t0[i10];
    }
}
