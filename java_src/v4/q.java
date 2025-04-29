package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class q extends r4.o implements r {
    public q() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            r4.b x10 = r4.x.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            boolean b10 = b(x10);
            parcel2.writeNoException();
            r4.p.c(parcel2, b10);
            return true;
        }
        return false;
    }
}
