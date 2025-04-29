package o4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f14622a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14623b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f14622a = iBinder;
        this.f14623b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(int i10, Parcel parcel) {
        try {
            this.f14622a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14622a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14623b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f14622a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
