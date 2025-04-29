package w4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        int i10 = 0;
        byte[] bArr = null;
        int i11 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 2) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 == 3) {
                i11 = d4.b.s(parcel, q10);
            } else if (j10 != 4) {
                d4.b.y(parcel, q10);
            } else {
                bArr = d4.b.b(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new y(i10, i11, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new y[i10];
    }
}
