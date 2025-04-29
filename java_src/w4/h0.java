package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 2) {
                latLng = (LatLng) d4.b.d(parcel, q10, LatLng.CREATOR);
            } else if (j10 == 3) {
                latLng2 = (LatLng) d4.b.d(parcel, q10, LatLng.CREATOR);
            } else if (j10 == 4) {
                latLng3 = (LatLng) d4.b.d(parcel, q10, LatLng.CREATOR);
            } else if (j10 == 5) {
                latLng4 = (LatLng) d4.b.d(parcel, q10, LatLng.CREATOR);
            } else if (j10 != 6) {
                d4.b.y(parcel, q10);
            } else {
                latLngBounds = (LatLngBounds) d4.b.d(parcel, q10, LatLngBounds.CREATOR);
            }
        }
        d4.b.i(parcel, z10);
        return new c0(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c0[i10];
    }
}
