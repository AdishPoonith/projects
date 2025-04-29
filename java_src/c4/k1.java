package c4;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class k1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        u uVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    uVar = (u) d4.b.d(parcel, q10, u.CREATOR);
                    break;
                case 2:
                    z11 = d4.b.k(parcel, q10);
                    break;
                case 3:
                    z12 = d4.b.k(parcel, q10);
                    break;
                case 4:
                    iArr = d4.b.c(parcel, q10);
                    break;
                case 5:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 6:
                    iArr2 = d4.b.c(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new f(uVar, z11, z12, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
