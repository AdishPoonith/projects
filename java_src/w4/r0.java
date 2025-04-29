package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            if (d4.b.j(q10) != 2) {
                d4.b.y(parcel, q10);
            } else {
                iBinder = d4.b.r(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new v(iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
