package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        float f10 = 0.0f;
        LatLng latLng = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            int j10 = d4.b.j(q10);
            if (j10 == 2) {
                latLng = (LatLng) d4.b.d(parcel, q10, LatLng.CREATOR);
            } else if (j10 == 3) {
                f10 = d4.b.o(parcel, q10);
            } else if (j10 == 4) {
                f11 = d4.b.o(parcel, q10);
            } else if (j10 != 5) {
                d4.b.y(parcel, q10);
            } else {
                f12 = d4.b.o(parcel, q10);
            }
        }
        d4.b.i(parcel, z10);
        return new CameraPosition(latLng, f10, f11, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
