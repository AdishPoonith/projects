package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class j0 extends r4.o implements k0 {
    public j0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
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
