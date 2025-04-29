package w4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public final class n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        float f12 = 0.0f;
        float f13 = 0.5f;
        float f14 = 0.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 2:
                    latLng = (LatLng) d4.b.d(parcel, q10, LatLng.CREATOR);
                    break;
                case 3:
                    str = d4.b.e(parcel, q10);
                    break;
                case 4:
                    str2 = d4.b.e(parcel, q10);
                    break;
                case 5:
                    iBinder = d4.b.r(parcel, q10);
                    break;
                case 6:
                    f10 = d4.b.o(parcel, q10);
                    break;
                case 7:
                    f11 = d4.b.o(parcel, q10);
                    break;
                case 8:
                    z11 = d4.b.k(parcel, q10);
                    break;
                case 9:
                    z12 = d4.b.k(parcel, q10);
                    break;
                case 10:
                    z13 = d4.b.k(parcel, q10);
                    break;
                case 11:
                    f12 = d4.b.o(parcel, q10);
                    break;
                case 12:
                    f13 = d4.b.o(parcel, q10);
                    break;
                case 13:
                    f14 = d4.b.o(parcel, q10);
                    break;
                case 14:
                    f15 = d4.b.o(parcel, q10);
                    break;
                case 15:
                    f16 = d4.b.o(parcel, q10);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new m(latLng, str, str2, iBinder, f10, f11, z11, z12, z13, f12, f13, f14, f15, f16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
