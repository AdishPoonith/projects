package w4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        w wVar = null;
        double d10 = 0.0d;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 2) {
                wVar = (w) d4.b.d(parcel, q10, w.CREATOR);
            } else if (j10 != 3) {
                d4.b.y(parcel, q10);
            } else {
                d10 = d4.b.n(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new x(wVar, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
