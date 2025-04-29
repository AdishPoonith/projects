package r4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public final class w extends a implements b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // r4.b
    public final void E(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(27, x10);
    }

    @Override // r4.b
    public final void K1(String str) {
        Parcel x10 = x();
        x10.writeString(str);
        M(7, x10);
    }

    @Override // r4.b
    public final void N1(k4.b bVar) {
        Parcel x10 = x();
        p.f(x10, bVar);
        M(18, x10);
    }

    @Override // r4.b
    public final void U1(float f10, float f11) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        x10.writeFloat(f11);
        M(24, x10);
    }

    @Override // r4.b
    public final void b2(float f10, float f11) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        x10.writeFloat(f11);
        M(19, x10);
    }

    @Override // r4.b
    public final void d2(LatLng latLng) {
        Parcel x10 = x();
        p.d(x10, latLng);
        M(3, x10);
    }

    @Override // r4.b
    public final boolean g0() {
        Parcel p10 = p(13, x());
        boolean g10 = p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // r4.b
    public final void j(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(9, x10);
    }

    @Override // r4.b
    public final void m0(String str) {
        Parcel x10 = x();
        x10.writeString(str);
        M(5, x10);
    }

    @Override // r4.b
    public final void n1(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(25, x10);
    }

    @Override // r4.b
    public final boolean p2(b bVar) {
        Parcel x10 = x();
        p.f(x10, bVar);
        Parcel p10 = p(16, x10);
        boolean g10 = p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // r4.b
    public final void q(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(14, x10);
    }

    @Override // r4.b
    public final void q0() {
        M(11, x());
    }

    @Override // r4.b
    public final void t(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(20, x10);
    }

    @Override // r4.b
    public final void x0(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(22, x10);
    }

    @Override // r4.b
    public final int zzg() {
        Parcel p10 = p(17, x());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    @Override // r4.b
    public final LatLng zzi() {
        Parcel p10 = p(4, x());
        LatLng latLng = (LatLng) p.a(p10, LatLng.CREATOR);
        p10.recycle();
        return latLng;
    }

    @Override // r4.b
    public final String zzj() {
        Parcel p10 = p(2, x());
        String readString = p10.readString();
        p10.recycle();
        return readString;
    }

    @Override // r4.b
    public final void zzm() {
        M(12, x());
    }

    @Override // r4.b
    public final void zzn() {
        M(1, x());
    }
}
