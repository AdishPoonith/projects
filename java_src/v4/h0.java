package v4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes.dex */
public final class h0 extends r4.a implements b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // v4.b
    public final void A1(h hVar) {
        Parcel x10 = x();
        r4.p.f(x10, hVar);
        M(32, x10);
    }

    @Override // v4.b
    public final void A2(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(92, x10);
    }

    @Override // v4.b
    public final void C(boolean z10) {
        Parcel x10 = x();
        r4.p.c(x10, z10);
        M(22, x10);
    }

    @Override // v4.b
    public final r4.v E0(w4.f fVar) {
        Parcel x10 = x();
        r4.p.d(x10, fVar);
        Parcel p10 = p(35, x10);
        r4.v x11 = r4.u.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.b
    public final void E1(m0 m0Var) {
        Parcel x10 = x();
        r4.p.f(x10, m0Var);
        M(97, x10);
    }

    @Override // v4.b
    public final void G(boolean z10) {
        Parcel x10 = x();
        r4.p.c(x10, z10);
        M(18, x10);
    }

    @Override // v4.b
    public final boolean G0() {
        Parcel p10 = p(40, x());
        boolean g10 = r4.p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // v4.b
    public final void G1(k0 k0Var) {
        Parcel x10 = x();
        r4.p.f(x10, k0Var);
        M(99, x10);
    }

    @Override // v4.b
    public final void H0(n nVar) {
        Parcel x10 = x();
        r4.p.f(x10, nVar);
        M(29, x10);
    }

    @Override // v4.b
    public final r4.e J1(w4.p pVar) {
        Parcel x10 = x();
        r4.p.d(x10, pVar);
        Parcel p10 = p(10, x10);
        r4.e x11 = r4.d.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.b
    public final void N0(t tVar) {
        Parcel x10 = x();
        r4.p.f(x10, tVar);
        M(31, x10);
    }

    @Override // v4.b
    public final float Q1() {
        Parcel p10 = p(2, x());
        float readFloat = p10.readFloat();
        p10.recycle();
        return readFloat;
    }

    @Override // v4.b
    public final void U() {
        M(94, x());
    }

    @Override // v4.b
    public final void W0(int i10, int i11, int i12, int i13) {
        Parcel x10 = x();
        x10.writeInt(i10);
        x10.writeInt(i11);
        x10.writeInt(i12);
        x10.writeInt(i13);
        M(39, x10);
    }

    @Override // v4.b
    public final d X0() {
        d zVar;
        Parcel p10 = p(26, x());
        IBinder readStrongBinder = p10.readStrongBinder();
        if (readStrongBinder == null) {
            zVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            zVar = queryLocalInterface instanceof d ? (d) queryLocalInterface : new z(readStrongBinder);
        }
        p10.recycle();
        return zVar;
    }

    @Override // v4.b
    public final void X1(k4.b bVar) {
        Parcel x10 = x();
        r4.p.f(x10, bVar);
        M(5, x10);
    }

    @Override // v4.b
    public final float Y() {
        Parcel p10 = p(3, x());
        float readFloat = p10.readFloat();
        p10.recycle();
        return readFloat;
    }

    @Override // v4.b
    public final void c0(w wVar) {
        Parcel x10 = x();
        r4.p.f(x10, wVar);
        M(85, x10);
    }

    @Override // v4.b
    public final void e(int i10) {
        Parcel x10 = x();
        x10.writeInt(i10);
        M(16, x10);
    }

    @Override // v4.b
    public final void f(boolean z10) {
        Parcel x10 = x();
        r4.p.c(x10, z10);
        M(41, x10);
    }

    @Override // v4.b
    public final void f0(k4.b bVar) {
        Parcel x10 = x();
        r4.p.f(x10, bVar);
        M(4, x10);
    }

    @Override // v4.b
    public final boolean f2() {
        Parcel p10 = p(17, x());
        boolean g10 = r4.p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // v4.b
    public final void g2(o0 o0Var) {
        Parcel x10 = x();
        r4.p.f(x10, o0Var);
        M(96, x10);
    }

    @Override // v4.b
    public final r4.k h1(w4.a0 a0Var) {
        Parcel x10 = x();
        r4.p.d(x10, a0Var);
        Parcel p10 = p(13, x10);
        r4.k x11 = r4.j.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.b
    public final void i0(b0 b0Var, k4.b bVar) {
        Parcel x10 = x();
        r4.p.f(x10, b0Var);
        r4.p.f(x10, bVar);
        M(38, x10);
    }

    @Override // v4.b
    public final boolean j2(w4.k kVar) {
        Parcel x10 = x();
        r4.p.d(x10, kVar);
        Parcel p10 = p(91, x10);
        boolean g10 = r4.p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // v4.b
    public final boolean k(boolean z10) {
        Parcel x10 = x();
        r4.p.c(x10, z10);
        Parcel p10 = p(20, x10);
        boolean g10 = r4.p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // v4.b
    public final void l2(l lVar) {
        Parcel x10 = x();
        r4.p.f(x10, lVar);
        M(42, x10);
    }

    @Override // v4.b
    public final r4.b o0(w4.m mVar) {
        Parcel x10 = x();
        r4.p.d(x10, mVar);
        Parcel p10 = p(11, x10);
        r4.b x11 = r4.x.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.b
    public final void o2(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(93, x10);
    }

    @Override // v4.b
    public final void p0(r rVar) {
        Parcel x10 = x();
        r4.p.f(x10, rVar);
        M(30, x10);
    }

    @Override // v4.b
    public final r4.h r1(w4.r rVar) {
        Parcel x10 = x();
        r4.p.d(x10, rVar);
        Parcel p10 = p(9, x10);
        r4.h x11 = r4.g.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // v4.b
    public final e s0() {
        e c0Var;
        Parcel p10 = p(25, x());
        IBinder readStrongBinder = p10.readStrongBinder();
        if (readStrongBinder == null) {
            c0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            c0Var = queryLocalInterface instanceof e ? (e) queryLocalInterface : new c0(readStrongBinder);
        }
        p10.recycle();
        return c0Var;
    }

    @Override // v4.b
    public final CameraPosition s1() {
        Parcel p10 = p(1, x());
        CameraPosition cameraPosition = (CameraPosition) r4.p.a(p10, CameraPosition.CREATOR);
        p10.recycle();
        return cameraPosition;
    }

    @Override // v4.b
    public final void t2(y yVar) {
        Parcel x10 = x();
        r4.p.f(x10, yVar);
        M(87, x10);
    }

    @Override // v4.b
    public final void u2(j jVar) {
        Parcel x10 = x();
        r4.p.f(x10, jVar);
        M(28, x10);
    }

    @Override // v4.b
    public final void w0(q0 q0Var) {
        Parcel x10 = x();
        r4.p.f(x10, q0Var);
        M(89, x10);
    }

    @Override // v4.b
    public final void z0(LatLngBounds latLngBounds) {
        Parcel x10 = x();
        r4.p.d(x10, latLngBounds);
        M(95, x10);
    }
}
