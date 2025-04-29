package b4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        long j10 = -1;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j11 = d4.b.j(q10);
            if (j11 == 1) {
                str = d4.b.e(parcel, q10);
            } else if (j11 == 2) {
                i10 = d4.b.s(parcel, q10);
            } else if (j11 != 3) {
                d4.b.y(parcel, q10);
            } else {
                j10 = d4.b.v(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new d(str, i10, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
