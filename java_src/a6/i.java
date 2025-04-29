package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.a2;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        ArrayList arrayList = null;
        j jVar = null;
        String str = null;
        a2 a2Var = null;
        w1 w1Var = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 1:
                    arrayList = d4.b.h(parcel, q10, com.google.firebase.auth.t0.CREATOR);
                    break;
                case 2:
                    jVar = (j) d4.b.d(parcel, q10, j.CREATOR);
                    break;
                case 3:
                    str = d4.b.e(parcel, q10);
                    break;
                case 4:
                    a2Var = (a2) d4.b.d(parcel, q10, a2.CREATOR);
                    break;
                case 5:
                    w1Var = (w1) d4.b.d(parcel, q10, w1.CREATOR);
                    break;
                case 6:
                    arrayList2 = d4.b.h(parcel, q10, com.google.firebase.auth.t1.CREATOR);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new h(arrayList, jVar, str, a2Var, w1Var, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
