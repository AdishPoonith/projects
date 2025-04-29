package r4;

import android.os.IBinder;
import android.os.Parcel;
import w4.y;
/* loaded from: classes.dex */
public final class l extends a implements n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // r4.n
    public final y C0(int i10, int i11, int i12) {
        Parcel x10 = x();
        x10.writeInt(i10);
        x10.writeInt(i11);
        x10.writeInt(i12);
        Parcel p10 = p(1, x10);
        y yVar = (y) p.a(p10, y.CREATOR);
        p10.recycle();
        return yVar;
    }
}
