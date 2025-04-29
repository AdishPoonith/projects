package r4;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class d extends o implements e {
    public static e x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new c(iBinder);
    }
}
