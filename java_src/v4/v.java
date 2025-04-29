package v4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class v extends r4.o implements w {
    public v() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    @Override // r4.o
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            r4.e x10 = r4.d.x(parcel.readStrongBinder());
            r4.p.b(parcel);
            r2(x10);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
