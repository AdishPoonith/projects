package r4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w4.y;
/* loaded from: classes.dex */
public abstract class m extends o implements n {
    public m() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static n x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            p.b(parcel);
            y C0 = C0(readInt, readInt2, readInt3);
            parcel2.writeNoException();
            p.e(parcel2, C0);
            return true;
        }
        return false;
    }
}
