package w4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        v vVar = null;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 2) {
                f10 = d4.b.o(parcel, q10);
            } else if (j10 == 3) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 == 4) {
                i11 = d4.b.s(parcel, q10);
            } else if (j10 == 5) {
                z11 = d4.b.k(parcel, q10);
            } else if (j10 != 6) {
                d4.b.y(parcel, q10);
            } else {
                vVar = (v) d4.b.d(parcel, q10, v.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new w(f10, i10, i11, z11, vVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new w[i10];
    }
}
