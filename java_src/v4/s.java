package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class s extends r4.o implements t {
    public s() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            r4.b x10 = r4.x.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            I1(x10);
        } else if (i10 == 2) {
            r4.b x11 = r4.x.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            b(x11);
        } else if (i10 != 3) {
            return false;
        } else {
            r4.b x12 = r4.x.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            j1(x12);
        }
        parcel2.writeNoException();
        return true;
    }
}
