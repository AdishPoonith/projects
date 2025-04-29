package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a implements b {

            /* renamed from: b  reason: collision with root package name */
            public static b f3b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f4a;

            C0001a(IBinder iBinder) {
                this.f4a = iBinder;
            }

            @Override // a.b
            public boolean H1(a.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f4a.transact(3, obtain, obtain2, 0) || a.x() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.x().H1(aVar);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public boolean I0(a.a aVar, Uri uri, Bundle bundle, List<Bundle> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    if (this.f4a.transact(4, obtain, obtain2, 0) || a.x() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.x().I0(aVar, uri, bundle, list);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4a;
            }

            @Override // a.b
            public boolean e2(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j10);
                    if (this.f4a.transact(2, obtain, obtain2, 0) || a.x() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.x().e2(j10);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public boolean z2(a.a aVar, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f4a.transact(10, obtain, obtain2, 0) || a.x() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.x().z2(aVar, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b p(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0001a(iBinder) : (b) queryLocalInterface;
        }

        public static b x() {
            return C0001a.f3b;
        }
    }

    boolean H1(a.a aVar);

    boolean I0(a.a aVar, Uri uri, Bundle bundle, List<Bundle> list);

    boolean e2(long j10);

    boolean z2(a.a aVar, Bundle bundle);
}
