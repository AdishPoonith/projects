package t4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        long j10 = -1;
        long j11 = -1;
        int i10 = 1;
        int i11 = 1;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j12 = d4.b.j(q10);
            if (j12 == 1) {
                i10 = d4.b.s(parcel, q10);
            } else if (j12 == 2) {
                i11 = d4.b.s(parcel, q10);
            } else if (j12 == 3) {
                j10 = d4.b.v(parcel, q10);
            } else if (j12 != 4) {
                d4.b.y(parcel, q10);
            } else {
                j11 = d4.b.v(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new n(i10, i11, j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
