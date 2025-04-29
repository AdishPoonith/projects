package c4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3414a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f3415b;

    /* renamed from: c  reason: collision with root package name */
    private static String f3416c;

    /* renamed from: d  reason: collision with root package name */
    private static int f3417d;

    public static int a(Context context) {
        b(context);
        return f3417d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f3414a) {
            if (f3415b) {
                return;
            }
            f3415b = true;
            try {
                bundle = j4.c.a(context).a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f3416c = bundle.getString("com.google.app.id");
            f3417d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
