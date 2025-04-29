package a6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                arrayList = d4.b.h(parcel, q10, com.google.firebase.auth.t0.CREATOR);
            } else if (j10 != 2) {
                d4.b.y(parcel, q10);
            } else {
                arrayList2 = d4.b.h(parcel, q10, com.google.firebase.auth.t1.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new h0(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h0[i10];
    }
}
