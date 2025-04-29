package c4;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f3327a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static q1 f3328b = null;

    /* renamed from: c  reason: collision with root package name */
    static HandlerThread f3329c = null;

    /* renamed from: d  reason: collision with root package name */
    private static Executor f3330d = null;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f3331e = false;

    public static int b() {
        return 4225;
    }

    public static i c(Context context) {
        synchronized (f3327a) {
            if (f3328b == null) {
                f3328b = new q1(context.getApplicationContext(), f3331e ? d().getLooper() : context.getMainLooper(), f3330d);
            }
        }
        return f3328b;
    }

    public static HandlerThread d() {
        synchronized (f3327a) {
            HandlerThread handlerThread = f3329c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f3329c = handlerThread2;
            handlerThread2.start();
            return f3329c;
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return h(new m1(componentName, 4225), serviceConnection, str, null);
    }

    public void e(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        f(new m1(componentName, 4225), serviceConnection, str);
    }

    protected abstract void f(m1 m1Var, ServiceConnection serviceConnection, String str);

    public final void g(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        f(new m1(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean h(m1 m1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
