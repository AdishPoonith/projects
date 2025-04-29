package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class n0 extends r4.o implements o0 {
    public n0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            r4.p.b(parcel);
            m1(readInt);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
