package v4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class o extends r4.o implements p {
    public o() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        b h0Var;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                h0Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                h0Var = queryLocalInterface instanceof b ? (b) queryLocalInterface : new h0(readStrongBinder);
            }
            r4.p.b(parcel);
            B0(h0Var);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
