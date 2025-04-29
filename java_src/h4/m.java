package h4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
/* loaded from: classes.dex */
public final class m {
    public static boolean a(Context context, int i10) {
        if (b(context, i10, "com.google.android.gms")) {
            try {
                return b4.k.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
                return false;
            }
        }
        return false;
    }

    public static boolean b(Context context, int i10, String str) {
        return j4.c.a(context).d(i10, str);
    }
}
