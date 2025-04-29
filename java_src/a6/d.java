package a6;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j12 = d4.b.j(q10);
            if (j12 == 1) {
                j10 = d4.b.v(parcel, q10);
            } else if (j12 != 2) {
                d4.b.y(parcel, q10);
            } else {
                j11 = d4.b.v(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new y1(j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new y1[i10];
    }
}
