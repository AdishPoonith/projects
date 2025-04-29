package t4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* loaded from: classes.dex */
public abstract class u extends q4.e implements v {
    public u() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static v x(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof v ? (v) queryLocalInterface : new t(iBinder);
    }

    @Override // q4.e
    protected final boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            q4.m.b(parcel);
            F2((LocationResult) q4.m.a(parcel, LocationResult.CREATOR));
        } else if (i10 == 2) {
            q4.m.b(parcel);
            K0((LocationAvailability) q4.m.a(parcel, LocationAvailability.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            zzf();
        }
        return true;
    }
}
