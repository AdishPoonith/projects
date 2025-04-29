package c4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
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
                    i12 = d4.b.s(parcel, q10);
                    break;
                case 4:
                    j10 = d4.b.v(parcel, q10);
                    break;
                case 5:
                    j11 = d4.b.v(parcel, q10);
                    break;
                case 6:
                    str = d4.b.e(parcel, q10);
                    break;
                case 7:
                    str2 = d4.b.e(parcel, q10);
                    break;
                case 8:
                    i13 = d4.b.s(parcel, q10);
                    break;
                case 9:
                    i14 = d4.b.s(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new p(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
