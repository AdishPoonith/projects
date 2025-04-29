package q4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        List u10 = q0.u();
        String str = null;
        String str2 = null;
        String str3 = null;
        z zVar = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 2:
                    i11 = d4.b.s(parcel, q10);
                    break;
                case 3:
                    str = d4.b.e(parcel, q10);
                    break;
                case 4:
                    str2 = d4.b.e(parcel, q10);
                    break;
                case 5:
                    i12 = d4.b.s(parcel, q10);
                    break;
                case 6:
                    str3 = d4.b.e(parcel, q10);
                    break;
                case 7:
                    zVar = (z) d4.b.d(parcel, q10, z.CREATOR);
                    break;
                case 8:
                    u10 = d4.b.h(parcel, q10, b4.d.CREATOR);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new z(i10, i11, str, str2, str3, i12, u10, zVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
