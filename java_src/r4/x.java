package r4;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class x extends o implements b {
    public static b x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new w(iBinder);
    }
}
