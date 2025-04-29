package z4;

import android.os.Parcel;
import android.os.Parcelable;
import c4.r0;
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        int i10 = 0;
        r0 r0Var = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 != 2) {
                d4.b.y(parcel, q10);
            } else {
                r0Var = (r0) d4.b.d(parcel, q10, r0.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new j(i10, r0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
