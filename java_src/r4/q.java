package r4;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import k4.b;
/* loaded from: classes.dex */
public final class q extends a implements s {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // r4.s
    public final k4.b L0(String str) {
        Parcel x10 = x();
        x10.writeString(str);
        Parcel p10 = p(2, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // r4.s
    public final k4.b Y0(Bitmap bitmap) {
        Parcel x10 = x();
        p.d(x10, bitmap);
        Parcel p10 = p(6, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // r4.s
    public final k4.b v0(float f10) {
        Parcel x10 = x();
        x10.writeFloat(f10);
        Parcel p10 = p(5, x10);
        k4.b x11 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x11;
    }

    @Override // r4.s
    public final k4.b zzd() {
        Parcel p10 = p(4, x());
        k4.b x10 = b.a.x(p10.readStrongBinder());
        p10.recycle();
        return x10;
    }
}
