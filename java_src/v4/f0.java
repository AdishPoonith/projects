package v4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.GoogleMapOptions;
/* loaded from: classes.dex */
public final class f0 extends r4.a implements g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // v4.g0
    public final void D1(k4.b bVar, int i10) {
        Parcel x10 = x();
        r4.p.f(x10, bVar);
        x10.writeInt(i10);
        M(6, x10);
    }

    @Override // v4.g0
    public final void J0(k4.b bVar, int i10) {
        Parcel x10 = x();
        r4.p.f(x10, bVar);
        x10.writeInt(i10);
        M(10, x10);
    }

    @Override // v4.g0
    public final c R0(k4.b bVar, GoogleMapOptions googleMapOptions) {
        c i0Var;
        Parcel x10 = x();
        r4.p.f(x10, bVar);
        r4.p.d(x10, googleMapOptions);
        Parcel p10 = p(3, x10);
        IBinder readStrongBinder = p10.readStrongBinder();
        if (readStrongBinder == null) {
            i0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            i0Var = queryLocalInterface instanceof c ? (c) queryLocalInterface : new i0(readStrongBinder);
        }
        p10.recycle();
        return i0Var;
    }

    @Override // v4.g0
    public final int zzd() {
        Parcel p10 = p(9, x());
        int readInt = p10.readInt();
        p10.recycle();
        return readInt;
    }

    @Override // v4.g0
    public final a zze() {
        a uVar;
        Parcel p10 = p(4, x());
        IBinder readStrongBinder = p10.readStrongBinder();
        if (readStrongBinder == null) {
            uVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            uVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new u(readStrongBinder);
        }
        p10.recycle();
        return uVar;
    }

    @Override // v4.g0
    public final r4.s zzj() {
        Parcel p10 = p(5, x());
        r4.s x10 = r4.r.x(p10.readStrongBinder());
        p10.recycle();
        return x10;
    }
}
