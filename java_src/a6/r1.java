package a6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.a2;
/* loaded from: classes.dex */
public final class r1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        w1 w1Var = null;
        o1 o1Var = null;
        a2 a2Var = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                w1Var = (w1) d4.b.d(parcel, q10, w1.CREATOR);
            } else if (j10 == 2) {
                o1Var = (o1) d4.b.d(parcel, q10, o1.CREATOR);
            } else if (j10 != 3) {
                d4.b.y(parcel, q10);
            } else {
                a2Var = (a2) d4.b.d(parcel, q10, a2.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new q1(w1Var, o1Var, a2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new q1[i10];
    }
}
