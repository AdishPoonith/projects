package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        IBinder iBinder = null;
        Float f10 = null;
        int i10 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 2) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 == 3) {
                iBinder = d4.b.r(parcel, q10);
            } else if (j10 != 4) {
                d4.b.y(parcel, q10);
            } else {
                f10 = d4.b.p(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new d(i10, iBinder, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
