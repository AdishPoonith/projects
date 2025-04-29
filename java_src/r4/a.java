package r4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f16688a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16689b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f16688a = iBinder;
        this.f16689b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f16688a.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16688a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel p(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f16688a.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel x() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16689b);
        return obtain;
    }
}
