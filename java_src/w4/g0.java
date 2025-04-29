package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        IBinder iBinder = null;
        boolean z11 = false;
        float f10 = 0.0f;
        boolean z12 = true;
        float f11 = 0.0f;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 2) {
                iBinder = d4.b.r(parcel, q10);
            } else if (j10 == 3) {
                z11 = d4.b.k(parcel, q10);
            } else if (j10 == 4) {
                f10 = d4.b.o(parcel, q10);
            } else if (j10 == 5) {
                z12 = d4.b.k(parcel, q10);
            } else if (j10 != 6) {
                d4.b.y(parcel, q10);
            } else {
                f11 = d4.b.o(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new a0(iBinder, z11, f10, z12, f11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
