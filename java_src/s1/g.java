package s1;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.common.collect.q;
/* loaded from: classes.dex */
public final class g extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private static final int f17221a;

    static {
        f17221a = p3.n0.f15397a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public static com.google.common.collect.q<Bundle> a(IBinder iBinder) {
        int readInt;
        q.a t10 = com.google.common.collect.q.t();
        int i10 = 1;
        int i11 = 0;
        while (i10 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i11);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            t10.a((Bundle) p3.a.e(obtain2.readBundle()));
                            i11++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i10 = readInt;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        return t10.h();
    }
}
