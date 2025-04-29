package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d10 = 0.0d;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f11 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 2:
                    latLng = (LatLng) d4.b.d(parcel, q10, LatLng.CREATOR);
                    break;
                case 3:
                    d10 = d4.b.n(parcel, q10);
                    break;
                case 4:
                    f10 = d4.b.o(parcel, q10);
                    break;
                case 5:
                    i10 = d4.b.s(parcel, q10);
                    break;
                case 6:
                    i11 = d4.b.s(parcel, q10);
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
                    arrayList = d4.b.h(parcel, q10, n.CREATOR);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new f(latLng, d10, f10, i10, i11, f11, z11, z12, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
