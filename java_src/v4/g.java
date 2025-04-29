package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class g extends r4.o implements h {
    public g() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            r4.b x10 = r4.x.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            b(x10);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
