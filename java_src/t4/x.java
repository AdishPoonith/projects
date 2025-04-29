package t4;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class x extends q4.e implements y {
    public static y x(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof y ? (y) queryLocalInterface : new w(iBinder);
    }
}
