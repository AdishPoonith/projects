package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f1513a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f1514b;

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f1515c;

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f1516d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f1517e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f1518f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f1519g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C0020d f1520j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Object f1521k;

        a(C0020d c0020d, Object obj) {
            this.f1520j = c0020d;
            this.f1521k = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1520j.f1526j = this.f1521k;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Application f1522j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C0020d f1523k;

        b(Application application, C0020d c0020d) {
            this.f1522j = application;
            this.f1523k = c0020d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1522j.unregisterActivityLifecycleCallbacks(this.f1523k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f1524j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Object f1525k;

        c(Object obj, Object obj2) {
            this.f1524j = obj;
            this.f1525k = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f1516d;
                if (method != null) {
                    method.invoke(this.f1524j, this.f1525k, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f1517e.invoke(this.f1524j, this.f1525k, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0020d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: j  reason: collision with root package name */
        Object f1526j;

        /* renamed from: k  reason: collision with root package name */
        private Activity f1527k;

        /* renamed from: l  reason: collision with root package name */
        private final int f1528l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f1529m = false;

        /* renamed from: n  reason: collision with root package name */
        private boolean f1530n = false;

        /* renamed from: o  reason: collision with root package name */
        private boolean f1531o = false;

        C0020d(Activity activity) {
            this.f1527k = activity;
            this.f1528l = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1527k == activity) {
                this.f1527k = null;
                this.f1530n = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1530n || this.f1531o || this.f1529m || !d.h(this.f1526j, this.f1528l, activity)) {
                return;
            }
            this.f1531o = true;
            this.f1526j = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1527k == activity) {
                this.f1529m = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f1513a = a10;
        f1514b = b();
        f1515c = f();
        f1516d = d(a10);
        f1517e = c(a10);
        f1518f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f1515c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f1519g.postAtFrontOfQueue(new c(f1514b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f1518f == null) {
            return false;
        } else {
            if (f1517e == null && f1516d == null) {
                return false;
            }
            try {
                Object obj2 = f1515c.get(activity);
                if (obj2 == null || (obj = f1514b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C0020d c0020d = new C0020d(activity);
                application.registerActivityLifecycleCallbacks(c0020d);
                Handler handler = f1519g;
                handler.post(new a(c0020d, obj2));
                if (g()) {
                    Method method = f1518f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0020d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
