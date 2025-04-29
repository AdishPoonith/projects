package p6;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p6.l;
/* loaded from: classes.dex */
public final class j implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15581a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f15582b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f15583c;

    /* renamed from: d  reason: collision with root package name */
    private final List<q6.n<l.a>> f15584d = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f15585j;

        a(AtomicBoolean atomicBoolean) {
            this.f15585j = atomicBoolean;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.f15585j.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (this.f15585j.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f15585j.compareAndSet(true, false)) {
                j.this.l();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ComponentCallbacks2 {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f15587j;

        b(AtomicBoolean atomicBoolean) {
            this.f15587j = atomicBoolean;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            if (i10 == 20) {
                this.f15587j.set(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends ConnectivityManager.NetworkCallback {
        private c() {
        }

        /* synthetic */ c(j jVar, a aVar) {
            this();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            j.this.k(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            j.this.k(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15590a;

        private d() {
            this.f15590a = false;
        }

        /* synthetic */ d(j jVar, a aVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z10;
            boolean h10 = j.this.h();
            if (!j.this.h() || this.f15590a) {
                if (!h10 && this.f15590a) {
                    jVar = j.this;
                    z10 = false;
                }
                this.f15590a = h10;
            }
            jVar = j.this;
            z10 = true;
            jVar.k(z10);
            this.f15590a = h10;
        }
    }

    public j(Context context) {
        q6.b.d(context != null, "Context must be non-null", new Object[0]);
        this.f15581a = context;
        this.f15582b = (ConnectivityManager) context.getSystemService("connectivity");
        f();
        g();
    }

    private void f() {
        Application application = (Application) this.f15581a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    private void g() {
        Runnable runnable;
        if (Build.VERSION.SDK_INT < 24 || this.f15582b == null) {
            final d dVar = new d(this, null);
            this.f15581a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            runnable = new Runnable() { // from class: p6.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.j(dVar);
                }
            };
        } else {
            final c cVar = new c(this, null);
            this.f15582b.registerDefaultNetworkCallback(cVar);
            runnable = new Runnable() { // from class: p6.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.i(cVar);
                }
            };
        }
        this.f15583c = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f15581a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(c cVar) {
        this.f15582b.unregisterNetworkCallback(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(d dVar) {
        this.f15581a.unregisterReceiver(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z10) {
        synchronized (this.f15584d) {
            for (q6.n<l.a> nVar : this.f15584d) {
                nVar.accept(z10 ? l.a.REACHABLE : l.a.UNREACHABLE);
            }
        }
    }

    @Override // p6.l
    public void a(q6.n<l.a> nVar) {
        synchronized (this.f15584d) {
            this.f15584d.add(nVar);
        }
    }

    public void l() {
        q6.v.a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (h()) {
            k(true);
        }
    }

    @Override // p6.l
    public void shutdown() {
        Runnable runnable = this.f15583c;
        if (runnable != null) {
            runnable.run();
            this.f15583c = null;
        }
    }
}
