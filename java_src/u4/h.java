package u4;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import w4.c0;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final v4.d f19048a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(v4.d dVar) {
        this.f19048a = dVar;
    }

    public LatLng a(Point point) {
        c4.s.j(point);
        try {
            return this.f19048a.f1(k4.d.H2(point));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public c0 b() {
        try {
            return this.f19048a.S1();
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public Point c(LatLng latLng) {
        c4.s.j(latLng);
        try {
            return (Point) k4.d.M(this.f19048a.o1(latLng));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }
}
