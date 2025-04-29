package s3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: s3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0255a extends Binder implements a {

        /* renamed from: s3.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0256a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f17855a;

            C0256a(IBinder iBinder) {
                this.f17855a = iBinder;
            }

            @Override // s3.a
            public Bundle T1(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17855a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f17855a;
            }
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0256a(iBinder) : (a) queryLocalInterface;
        }
    }

    Bundle T1(Bundle bundle);
}
