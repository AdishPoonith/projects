package v4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import k4.b;
/* loaded from: classes.dex */
public final class u extends r4.a implements a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // v4.a
    public final k4.b A0(CameraPosition cameraPosition) {
        Parcel x10 = x();
        r4.p.d(x10, cameraPosition);
        Parcel p10 = p(7, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.a
    public final k4.b L1(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        Parcel p10 = p(4, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.a
    public final k4.b M1() {
        Parcel p10 = p(1, x());
        k4.b x10 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x10;
    }

    @Override // v4.a
    public final k4.b S(LatLngBounds latLngBounds, int i10) {
        Parcel x10 = x();
        r4.p.d(x10, latLngBounds);
        x10.writeInt(i10);
        Parcel p10 = p(10, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.a
    public final k4.b W(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        Parcel p10 = p(5, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.a
    public final k4.b W1(LatLng latLng, float f10) {
        Parcel x10 = x();
        r4.p.d(x10, latLng);
        x10.writeFloat(f10);
        Parcel p10 = p(9, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.a
    public final k4.b Z0() {
        Parcel p10 = p(2, x());
        k4.b x10 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x10;
    }

    @Override // v4.a
    public final k4.b Z1(float f10, float f11) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        x10.writeFloat(f11);
        Parcel p10 = p(3, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.a
    public final k4.b k1(LatLng latLng) {
        Parcel x10 = x();
        r4.p.d(x10, latLng);
        Parcel p10 = p(8, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.a
    public final k4.b v2(float f10, int i10, int i11) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        x10.writeInt(i10);
        x10.writeInt(i11);
        Parcel p10 = p(6, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }
}
