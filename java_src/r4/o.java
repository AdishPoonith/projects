package r4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class o extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public o(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return p(i10, parcel, parcel2, i11);
    }

    protected boolean p(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
