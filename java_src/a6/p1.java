package a6;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        String str2 = null;
        boolean z11 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                str = d4.b.e(parcel, q10);
            } else if (j10 == 2) {
                str2 = d4.b.e(parcel, q10);
            } else if (j10 != 3) {
                d4.b.y(parcel, q10);
            } else {
                z11 = d4.b.k(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new o1(str, str2, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o1[i10];
    }
}
