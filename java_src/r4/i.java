package r4;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class i extends a implements k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // r4.k
    public final void Q(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(6, x10);
    }

    @Override // r4.k
    public final void a0(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(4, x10);
    }

    @Override // r4.k
    public final boolean l0(k kVar) {
        Parcel x10 = x();
        p.f(x10, kVar);
        Parcel p10 = p(8, x10);
        boolean g10 = p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // r4.k
    public final void l1(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(10, x10);
    }

    @Override // r4.k
    public final void v1(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(12, x10);
    }

    @Override // r4.k
    public final float zzd() {
        Parcel p10 = p(13, x());
        float readFloat = p10.readFloat();
        p10.recycle();
        return readFloat;
    }

    @Override // r4.k
    public final float zze() {
        Parcel p10 = p(5, x());
        float readFloat = p10.readFloat();
        p10.recycle();
        return readFloat;
    }

    @Override // r4.k
    public final int zzf() {
        Parcel p10 = p(9, x());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    @Override // r4.k
    public final String zzg() {
        Parcel p10 = p(3, x());
        String readString = p10.readString();
        p10.recycle();
        return readString;
    }

    @Override // r4.k
    public final void zzh() {
        M(2, x());
    }

    @Override // r4.k
    public final void zzi() {
        M(1, x());
    }

    @Override // r4.k
    public final boolean zzo() {
        Parcel p10 = p(11, x());
        boolean g10 = p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // r4.k
    public final boolean zzp() {
        Parcel p10 = p(7, x());
        boolean g10 = p.g(p10);
        p10.recycle();
        return g10;
    }
}
