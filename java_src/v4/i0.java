package v4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import k4.b;
/* loaded from: classes.dex */
public final class i0 extends r4.a implements c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // v4.c
    public final void H() {
        M(5, x());
    }

    @Override // v4.c
    public final void I(Bundle bundle) {
        Parcel x10 = x();
        r4.p.d(x10, bundle);
        M(2, x10);
    }

    @Override // v4.c
    public final void P0(p pVar) {
        Parcel x10 = x();
        r4.p.f(x10, pVar);
        M(9, x10);
    }

    @Override // v4.c
    public final void a(Bundle bundle) {
        Parcel x10 = x();
        r4.p.d(x10, bundle);
        Parcel p10 = p(7, x10);
        if (p10.readInt() != 0) {
            bundle.readFromParcel(p10);
        }
        p10.recycle();
    }

    @Override // v4.c
    public final void c() {
        M(3, x());
    }

    @Override // v4.c
    public final void d() {
        M(12, x());
    }

    @Override // v4.c
    public final void r() {
        M(13, x());
    }

    @Override // v4.c
    public final k4.b w() {
        Parcel p10 = p(8, x());
        k4.b x10 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x10;
    }
}
