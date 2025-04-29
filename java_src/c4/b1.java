package c4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 == 2) {
                z11 = d4.b.k(parcel, q10);
            } else if (j10 == 3) {
                z12 = d4.b.k(parcel, q10);
            } else if (j10 == 4) {
                i11 = d4.b.s(parcel, q10);
            } else if (j10 != 5) {
                d4.b.y(parcel, q10);
            } else {
                i12 = d4.b.s(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new u(i10, z11, z12, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
