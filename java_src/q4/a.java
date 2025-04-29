package q4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f16167a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16168b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f16167a = iBinder;
        this.f16168b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16167a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel p() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16168b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16167a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
