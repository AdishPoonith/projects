package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f13775a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13776b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f13775a = iBinder;
        this.f13776b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f13775a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f13776b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f13775a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
