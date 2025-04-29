package v4;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public abstract class i extends r4.o implements j {
    public i() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            r4.p.b(parcel);
            s((LatLng) r4.p.a(parcel, LatLng.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
