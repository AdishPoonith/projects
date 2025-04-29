package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class x extends r4.o implements y {
    public x() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            r4.h x10 = r4.g.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            t1(x10);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
