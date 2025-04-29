package v4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import k4.b;
/* loaded from: classes.dex */
public final class z extends r4.a implements d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // v4.d
    public final w4.c0 S1() {
        Parcel p10 = p(3, x());
        w4.c0 c0Var = (w4.c0) r4.p.a(p10, w4.c0.CREATOR);
        p10.recycle();
        return c0Var;
    }

    @Override // v4.d
    public final LatLng f1(k4.b bVar) {
        Parcel x10 = x();
        r4.p.f(x10, bVar);
        Parcel p10 = p(1, x10);
        LatLng latLng = (LatLng) r4.p.a(p10, LatLng.CREATOR);
        p10.recycle();
        return latLng;
    }

    @Override // v4.d
    public final k4.b o1(LatLng latLng) {
        Parcel x10 = x();
        r4.p.d(x10, latLng);
        Parcel p10 = p(2, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }
}
