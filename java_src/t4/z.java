package t4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        boolean z11 = false;
        ArrayList arrayList = null;
        boolean z12 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 1) {
                arrayList = d4.b.h(parcel, q10, LocationRequest.CREATOR);
            } else if (j10 == 2) {
                z11 = d4.b.k(parcel, q10);
            } else if (j10 != 3) {
                d4.b.y(parcel, q10);
            } else {
                z12 = d4.b.k(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new f(arrayList, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
