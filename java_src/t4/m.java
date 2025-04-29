package t4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    z11 = d4.b.k(parcel, q10);
                    break;
                case 2:
                    z12 = d4.b.k(parcel, q10);
                    break;
                case 3:
                    z13 = d4.b.k(parcel, q10);
                    break;
                case 4:
                    z14 = d4.b.k(parcel, q10);
                    break;
                case 5:
                    z15 = d4.b.k(parcel, q10);
                    break;
                case 6:
                    z16 = d4.b.k(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new i(z11, z12, z13, z14, z15, z16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
