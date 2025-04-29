package r4;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
/* loaded from: classes.dex */
public final class c extends a implements e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // r4.e
    public final void A(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(7, x10);
    }

    @Override // r4.e
    public final void E(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        M(13, x10);
    }

    @Override // r4.e
    public final void K(int i10) {
        Parcel x10 = x();
        x10.writeInt(i10);
        M(9, x10);
    }

    @Override // r4.e
    public final void L(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(21, x10);
    }

    @Override // r4.e
    public final boolean U0(e eVar) {
        Parcel x10 = x();
        p.f(x10, eVar);
        Parcel p10 = p(19, x10);
        boolean g10 = p.g(p10);
        p10.recycle();
        return g10;
    }

    @Override // r4.e
    public final void b1(List list) {
        Parcel x10 = x();
        x10.writeList(list);
        M(5, x10);
    }

    @Override // r4.e
    public final void g(int i10) {
        Parcel x10 = x();
        x10.writeInt(i10);
        M(11, x10);
    }

    @Override // r4.e
    public final void k0(List list) {
        Parcel x10 = x();
        x10.writeTypedList(list);
        M(3, x10);
    }

    @Override // r4.e
    public final void q(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(15, x10);
    }

    @Override // r4.e
    public final void t(boolean z10) {
        Parcel x10 = x();
        p.c(x10, z10);
        M(17, x10);
    }

    @Override // r4.e
    public final int zzi() {
        Parcel p10 = p(20, x());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    @Override // r4.e
    public final String zzk() {
        Parcel p10 = p(2, x());
        String readString = p10.readString();
        p10.recycle();
        return readString;
    }

    @Override // r4.e
    public final void zzo() {
        M(1, x());
    }
}
