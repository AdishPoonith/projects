package g4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import c4.r1;
import c4.s;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import h4.j;
import j4.c;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8967b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f8968c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f8969a = new ConcurrentHashMap();

    private a() {
    }

    public static a a() {
        if (f8968c == null) {
            synchronized (f8967b) {
                if (f8968c == null) {
                    f8968c = new a();
                }
            }
        }
        a aVar = f8968c;
        s.j(aVar);
        return aVar;
    }

    private static void d(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (f(serviceConnection)) {
            ServiceConnection serviceConnection2 = (ServiceConnection) this.f8969a.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean g10 = g(context, intent, serviceConnection, i10, executor);
                if (g10) {
                    return g10;
                }
                return false;
            } finally {
                this.f8969a.remove(serviceConnection, serviceConnection);
            }
        }
        return g(context, intent, serviceConnection, i10, executor);
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof r1);
    }

    private static final boolean g(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return (!j.j() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.f8969a.containsKey(serviceConnection)) {
            d(context, serviceConnection);
            return;
        }
        try {
            d(context, (ServiceConnection) this.f8969a.get(serviceConnection));
        } finally {
            this.f8969a.remove(serviceConnection);
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return e(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
