package c4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class j1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        Bundle bundle = null;
        b4.d[] dVarArr = null;
        f fVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                bundle = d4.b.a(parcel, q10);
            } else if (j10 == 2) {
                dVarArr = (b4.d[]) d4.b.g(parcel, q10, b4.d.CREATOR);
            } else if (j10 == 3) {
                i10 = d4.b.s(parcel, q10);
            } else if (j10 != 4) {
                d4.b.y(parcel, q10);
            } else {
                fVar = (f) d4.b.d(parcel, q10, f.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new i1(bundle, dVarArr, i10, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i1[i10];
    }
}
