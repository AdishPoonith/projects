package q4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class w0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        Status status = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            if (d4.b.j(q10) != 1) {
                d4.b.y(parcel, q10);
            } else {
                status = (Status) d4.b.d(parcel, q10, Status.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new v0(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v0[i10];
    }
}
