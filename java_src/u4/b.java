package u4;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static v4.a f19037a;

    public static a a(CameraPosition cameraPosition) {
        c4.s.k(cameraPosition, "cameraPosition must not be null");
        try {
            return new a(l().A0(cameraPosition));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a b(LatLng latLng) {
        c4.s.k(latLng, "latLng must not be null");
        try {
            return new a(l().k1(latLng));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a c(LatLngBounds latLngBounds, int i10) {
        c4.s.k(latLngBounds, "bounds must not be null");
        try {
            return new a(l().S(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a d(LatLng latLng, float f10) {
        c4.s.k(latLng, "latLng must not be null");
        try {
            return new a(l().W1(latLng, f10));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a e(float f10, float f11) {
        try {
            return new a(l().Z1(f10, f11));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a f(float f10) {
        try {
            return new a(l().W(f10));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a g(float f10, Point point) {
        c4.s.k(point, "focus must not be null");
        try {
            return new a(l().v2(f10, point.x, point.y));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a h() {
        try {
            return new a(l().M1());
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a i() {
        try {
            return new a(l().Z0());
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static a j(float f10) {
        try {
            return new a(l().L1(f10));
        } catch (RemoteException e10) {
            throw new w4.t(e10);
        }
    }

    public static void k(v4.a aVar) {
        f19037a = (v4.a) c4.s.j(aVar);
    }

    private static v4.a l() {
        return (v4.a) c4.s.k(f19037a, "CameraUpdateFactory is not initialized");
    }
}
