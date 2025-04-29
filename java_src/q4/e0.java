package q4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        long j10 = Long.MAX_VALUE;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j11 = d4.b.j(q10);
            if (j11 == 1) {
                locationRequest = (LocationRequest) d4.b.d(parcel, q10, LocationRequest.CREATOR);
            } else if (j11 != 5) {
                switch (j11) {
                    case 8:
                        z11 = d4.b.k(parcel, q10);
                        continue;
                    case 9:
                        z12 = d4.b.k(parcel, q10);
                        continue;
                    case 10:
                        str = d4.b.e(parcel, q10);
                        continue;
                    case 11:
                        z13 = d4.b.k(parcel, q10);
                        continue;
                    case 12:
                        z14 = d4.b.k(parcel, q10);
                        continue;
                    case 13:
                        str2 = d4.b.e(parcel, q10);
                        continue;
                    case 14:
                        j10 = d4.b.v(parcel, q10);
                        continue;
                    default:
                        d4.b.y(parcel, q10);
                        continue;
                }
            } else {
                arrayList = d4.b.h(parcel, q10, c4.d.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new d0(locationRequest, arrayList, z11, z12, str, z13, z14, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0[i10];
    }
}
