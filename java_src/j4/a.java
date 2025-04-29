package j4;

import android.content.Context;
import h4.j;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f12107a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f12108b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f12107a;
            if (context2 != null && (bool2 = f12108b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f12108b = null;
            if (!j.h()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f12108b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f12107a = applicationContext;
                return f12108b.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f12108b = bool;
            f12107a = applicationContext;
            return f12108b.booleanValue();
        }
    }
}
