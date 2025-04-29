package p4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f15490a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15491b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(IBinder iBinder, String str) {
        this.f15490a = iBinder;
        this.f15491b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15490a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel p(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15490a.transact(i10, parcel, obtain, 0);
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
        obtain.writeInterfaceToken(this.f15491b);
        return obtain;
    }
}
