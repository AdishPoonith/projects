package t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        Status status = null;
        i iVar = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                status = (Status) d4.b.d(parcel, q10, Status.CREATOR);
            } else if (j10 != 2) {
                d4.b.y(parcel, q10);
            } else {
                iVar = (i) d4.b.d(parcel, q10, i.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new h(status, iVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
