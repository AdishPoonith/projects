package c4;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
final class y0 implements n {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f3410a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(IBinder iBinder) {
        this.f3410a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3410a;
    }

    @Override // c4.n
    public final void n2(m mVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                l1.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f3410a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
