package r4;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class r extends o implements s {
    public static s x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return queryLocalInterface instanceof s ? (s) queryLocalInterface : new q(iBinder);
    }
}
