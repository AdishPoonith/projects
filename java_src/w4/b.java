package w4;

import android.graphics.Bitmap;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static r4.s f19853a;

    public static a a() {
        try {
            return new a(f().zzd());
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a b(float f10) {
        try {
            return new a(f().v0(f10));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a c(String str) {
        c4.s.k(str, "assetName must not be null");
        try {
            return new a(f().L0(str));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a d(Bitmap bitmap) {
        c4.s.k(bitmap, "image must not be null");
        try {
            return new a(f().Y0(bitmap));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static void e(r4.s sVar) {
        if (f19853a != null) {
            return;
        }
        f19853a = (r4.s) c4.s.k(sVar, "delegate must not be null");
    }

    private static r4.s f() {
        return (r4.s) c4.s.k(f19853a, "IBitmapDescriptorFactory is not initialized");
    }
}
