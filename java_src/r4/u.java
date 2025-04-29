package r4;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class u extends o implements v {
    public static v x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof v ? (v) queryLocalInterface : new t(iBinder);
    }
}
