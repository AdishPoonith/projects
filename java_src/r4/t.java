package r4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public final class t extends a implements v {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // r4.v
    public final void A(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(13, x10);
    }

    @Override // r4.v
    public final void B1(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(15, x10);
    }

    @Override // r4.v
    public final void B2(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(7, x10);
    }

    @Override // r4.v
    public final void L(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(19, x10);
    }

    @Override // r4.v
    public final boolean c1(v vVar) {
        Parcel x10 = x();
        p.f(x10, vVar);
        Parcel p10 = p(17, x10);
        boolean g10 = p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // r4.v
    public final void g(int i10) {
        Parcel x10 = x();
        x10.writeInt(i10);
        M(11, x10);
    }

    @Override // r4.v
    public final void g1(LatLng latLng) {
        Parcel x10 = x();
        p.d(x10, latLng);
        M(3, x10);
    }

    @Override // r4.v
    public final void q1(int i10) {
        Parcel x10 = x();
        x10.writeInt(i10);
        M(9, x10);
    }

    @Override // r4.v
    public final void r0(double d10) {
        Parcel x10 = x();
        x10.writeDouble(d10);
        M(5, x10);
    }

    @Override // r4.v
    public final int zzi() {
        Parcel p10 = p(18, x());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    @Override // r4.v
    public final String zzl() {
        Parcel p10 = p(2, x());
        String readString = p10.readString();
        p10.recycle();
        return readString;
    }

    @Override // r4.v
    public final void zzn() {
        M(1, x());
    }
}
