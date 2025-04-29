package r4;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
/* loaded from: classes.dex */
public final class f extends a implements h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // r4.h
    public final boolean C1(h hVar) {
        Parcel x10 = x();
        p.f(x10, hVar);
        Parcel p10 = p(15, x10);
        boolean g10 = p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // r4.h
    public final void D0(int i10) {
        Parcel x10 = x();
        x10.writeInt(i10);
        M(7, x10);
    }

    @Override // r4.h
    public final void K(int i10) {
        Parcel x10 = x();
        x10.writeInt(i10);
        M(23, x10);
    }

    @Override // r4.h
    public final void N(w4.d dVar) {
        Parcel x10 = x();
        p.d(x10, dVar);
        M(21, x10);
    }

    @Override // r4.h
    public final void R(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(5, x10);
    }

    @Override // r4.h
    public final void j(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(17, x10);
    }

    @Override // r4.h
    public final void q2(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(11, x10);
    }

    @Override // r4.h
    public final void s2(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(13, x10);
    }

    @Override // r4.h
    public final void t0(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(9, x10);
    }

    @Override // r4.h
    public final void z1(w4.d dVar) {
        Parcel x10 = x();
        p.d(x10, dVar);
        M(19, x10);
    }

    @Override // r4.h
    public final int zzh() {
        Parcel p10 = p(16, x());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    @Override // r4.h
    public final String zzl() {
        Parcel p10 = p(2, x());
        String readString = p10.readString();
        p10.recycle();
        return readString;
    }

    @Override // r4.h
    public final void zzp() {
        M(1, x());
    }

    @Override // r4.h
    public final void zzv(List list) {
        Parcel x10 = x();
        x10.writeTypedList(list);
        M(25, x10);
    }

    @Override // r4.h
    public final void zzw(List list) {
        Parcel x10 = x();
        x10.writeTypedList(list);
        M(3, x10);
    }
}
