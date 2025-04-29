package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: n  reason: collision with root package name */
    private static final c f3800n = new c();

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f3801j = new AtomicBoolean();

    /* renamed from: k  reason: collision with root package name */
    private final AtomicBoolean f3802k = new AtomicBoolean();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList f3803l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private boolean f3804m = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    private c() {
    }

    public static c b() {
        return f3800n;
    }

    public static void c(Application application) {
        c cVar = f3800n;
        synchronized (cVar) {
            if (!cVar.f3804m) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f3804m = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f3800n) {
            Iterator it = this.f3803l.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(z10);
            }
        }
    }

    public void a(a aVar) {
        synchronized (f3800n) {
            this.f3803l.add(aVar);
        }
    }

    public boolean d() {
        return this.f3801j.get();
    }

    public boolean e(boolean z10) {
        if (!this.f3802k.get()) {
            if (!h4.j.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f3802k.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f3801j.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f3801j.compareAndSet(true, false);
        this.f3802k.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f3801j.compareAndSet(true, false);
        this.f3802k.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f3801j.compareAndSet(false, true)) {
            this.f3802k.set(true);
            f(true);
        }
    }
}
