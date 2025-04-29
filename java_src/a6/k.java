package a6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        w1 w1Var = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                str = d4.b.e(parcel, q10);
            } else if (j10 == 2) {
                str2 = d4.b.e(parcel, q10);
            } else if (j10 == 3) {
                arrayList = d4.b.h(parcel, q10, com.google.firebase.auth.t0.CREATOR);
            } else if (j10 == 4) {
                arrayList2 = d4.b.h(parcel, q10, com.google.firebase.auth.t1.CREATOR);
            } else if (j10 != 5) {
                d4.b.y(parcel, q10);
            } else {
                w1Var = (w1) d4.b.d(parcel, q10, w1.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new j(str, str2, arrayList, arrayList2, w1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
