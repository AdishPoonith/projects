package q1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: q1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0234a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q1.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0235a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static a f15996b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f15997a;

            C0235a(IBinder iBinder) {
                this.f15997a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15997a;
            }

            @Override // q1.a
            public int u0(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f15997a.transact(1, obtain, obtain2, 0) || AbstractBinderC0234a.x() == null) {
                        obtain2.readException();
                        return obtain2.readInt();
                    }
                    return AbstractBinderC0234a.x().u0(bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0235a(iBinder) : (a) queryLocalInterface;
        }

        public static a x() {
            return C0235a.f15996b;
        }
    }

    int u0(Bundle bundle);
}
