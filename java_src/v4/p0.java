package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class p0 extends r4.o implements q0 {
    public p0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            r4.v x10 = r4.u.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            e0(x10);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
