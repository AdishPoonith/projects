package v4;

import android.graphics.Bitmap;
import android.os.Parcel;
import k4.b;
/* loaded from: classes.dex */
public abstract class a0 extends r4.o implements b0 {
    public a0() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            r4.p.b(parcel);
            u1((Bitmap) r4.p.a(parcel, Bitmap.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            k4.b x10 = b.a.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            a1(x10);
        }
        parcel2.writeNoException();
        return true;
    }
}
