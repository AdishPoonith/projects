package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class k extends r4.o implements l {
    public k() {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
