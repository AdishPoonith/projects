package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: d  reason: collision with root package name */
    public static final String f2849d = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0055a extends Binder implements a {

        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0056a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f2850a;

            C0056a(IBinder iBinder) {
                this.f2850a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2850a;
            }

            @Override // b.a
            public void h2(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f2849d);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f2850a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f2849d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0056a(iBinder) : (a) queryLocalInterface;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void b(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t10.writeToParcel(parcel, i10);
        }
    }

    void h2(String str, int i10, String str2, Notification notification);
}
