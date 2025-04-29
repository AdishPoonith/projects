package i1;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import h1.c;
import h1.k;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import p0.f0;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9618a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final int f9619b = Process.myUid();

    /* renamed from: c  reason: collision with root package name */
    private static final ScheduledExecutorService f9620c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d  reason: collision with root package name */
    private static String f9621d = "";

    /* renamed from: e  reason: collision with root package name */
    private static final Runnable f9622e = new Runnable() { // from class: i1.a
        @Override // java.lang.Runnable
        public final void run() {
            b.b();
        }
    };

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            f0 f0Var = f0.f14852a;
            Object systemService = f0.l().getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    public static final void c(ActivityManager activityManager) {
        if (k1.a.d(b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f9619b) {
                    Thread thread = Looper.getMainLooper().getThread();
                    l.d(thread, "getMainLooper().thread");
                    k kVar = k.f9091a;
                    String g10 = k.g(thread);
                    if (!l.a(g10, f9621d) && k.k(thread)) {
                        f9621d = g10;
                        c.a aVar = c.a.f9074a;
                        c.a.a(processErrorStateInfo.shortMsg, g10).g();
                    }
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }

    public static final void d() {
        if (k1.a.d(b.class)) {
            return;
        }
        try {
            f9620c.scheduleAtFixedRate(f9622e, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            k1.a.b(th, b.class);
        }
    }
}
