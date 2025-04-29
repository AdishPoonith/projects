package q4;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class y0 extends e implements z0 {
    public y0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // q4.e
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            m.b(parcel);
            d0((v0) m.a(parcel, v0.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            zze();
        }
        return true;
    }
}
