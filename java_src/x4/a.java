package x4;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import b4.f;
import b4.g;
import b4.j;
import c4.s;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final f f20228a = f.e();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f20229b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Method f20230c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Method f20231d = null;

    public static void a(Context context) {
        Context context2;
        s.k(context, "Context must not be null");
        f20228a.j(context, 11925000);
        synchronized (f20229b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.c(context, DynamiteModule.f3976f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context c10 = j.c(context);
            if (c10 != null) {
                try {
                    if (f20231d == null) {
                        Class cls = Long.TYPE;
                        f20231d = b(c10, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f20231d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e11) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                }
            }
            if (c10 != null) {
                c(c10, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new g(8);
            }
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, Context context2, String str) {
        try {
            if (f20230c == null) {
                f20230c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f20230c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.getMessage() : cause.getMessage())));
            }
            throw new g(8);
        }
    }
}
