package w4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int z10 = d4.b.z(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f11 = 0.0f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 0;
        while (parcel.dataPosition() < z10) {
            int q10 = d4.b.q(parcel);
            switch (d4.b.j(q10)) {
                case 2:
                    arrayList2 = d4.b.h(parcel, q10, LatLng.CREATOR);
                    break;
                case 3:
                    d4.b.u(parcel, q10, arrayList, p0.class.getClassLoader());
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
                    z13 = d4.b.k(parcel, q10);
                    break;
                case 11:
                    i12 = d4.b.s(parcel, q10);
                    break;
                case 12:
                    arrayList3 = d4.b.h(parcel, q10, n.CREATOR);
                    break;
                default:
                    d4.b.y(parcel, q10);
                    break;
            }
        }
        d4.b.i(parcel, z10);
        return new p(arrayList2, arrayList, f10, i10, i11, f11, z11, z12, z13, i12, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new p[i10];
    }
}
