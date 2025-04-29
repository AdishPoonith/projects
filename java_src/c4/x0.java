package c4;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class x0 extends p4.b implements m {
    public x0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p4.b
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            p4.c.b(parcel);
            E2(parcel.readInt(), parcel.readStrongBinder(), (Bundle) p4.c.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            p4.c.b(parcel);
            x1(parcel.readInt(), (Bundle) p4.c.a(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            p4.c.b(parcel);
            Z(parcel.readInt(), parcel.readStrongBinder(), (i1) p4.c.a(parcel, i1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
