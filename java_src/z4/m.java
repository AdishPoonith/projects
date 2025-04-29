package z4;

import android.os.Parcel;
import android.os.Parcelable;
import c4.t0;
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        b4.b bVar = null;
        t0 t0Var = null;
        int i10 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 == 2) {
                bVar = (b4.b) d4.b.d(parcel, q10, b4.b.CREATOR);
            } else if (j10 != 3) {
                d4.b.y(parcel, q10);
            } else {
                t0Var = (t0) d4.b.d(parcel, q10, t0.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new l(i10, bVar, t0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
