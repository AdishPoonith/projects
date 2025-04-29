package w0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
import w0.a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f19551a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f19552b = a.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f19553c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f19554d;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f19555e;

    /* renamed from: f  reason: collision with root package name */
    private static ServiceConnection f19556f;

    /* renamed from: g  reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f19557g;

    /* renamed from: h  reason: collision with root package name */
    private static Intent f19558h;

    /* renamed from: i  reason: collision with root package name */
    private static Object f19559i;

    /* renamed from: w0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class ServiceConnectionC0282a implements ServiceConnection {
        ServiceConnectionC0282a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            kotlin.jvm.internal.l.e(name, "name");
            kotlin.jvm.internal.l.e(service, "service");
            a aVar = a.f19551a;
            i iVar = i.f19595a;
            f0 f0Var = f0.f14852a;
            a.f19559i = i.a(f0.l(), service);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            kotlin.jvm.internal.l.e(name, "name");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            f0 f0Var = f0.f14852a;
            Context l10 = f0.l();
            i iVar = i.f19595a;
            ArrayList<String> i10 = i.i(l10, a.f19559i);
            a aVar = a.f19551a;
            aVar.f(l10, i10, false);
            aVar.f(l10, i.j(l10, a.f19559i), true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d() {
            f0 f0Var = f0.f14852a;
            Context l10 = f0.l();
            i iVar = i.f19595a;
            ArrayList<String> i10 = i.i(l10, a.f19559i);
            if (i10.isEmpty()) {
                i10 = i.g(l10, a.f19559i);
            }
            a.f19551a.f(l10, i10, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            try {
                f0 f0Var = f0.f14852a;
                f0.t().execute(new Runnable() { // from class: w0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.l.e(activity, "activity");
            kotlin.jvm.internal.l.e(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            try {
                if (kotlin.jvm.internal.l.a(a.f19555e, Boolean.TRUE) && kotlin.jvm.internal.l.a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    f0 f0Var = f0.f14852a;
                    f0.t().execute(new Runnable() { // from class: w0.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    private a() {
    }

    private final void e() {
        if (f19554d != null) {
            return;
        }
        m mVar = m.f19616a;
        Boolean valueOf = Boolean.valueOf(m.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        f19554d = valueOf;
        if (kotlin.jvm.internal.l.a(valueOf, Boolean.FALSE)) {
            return;
        }
        f19555e = Boolean.valueOf(m.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        i iVar = i.f19595a;
        i.b();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        kotlin.jvm.internal.l.d(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        f19558h = intent;
        f19556f = new ServiceConnectionC0282a();
        f19557g = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context, ArrayList<String> arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String purchase = it.next();
            try {
                String sku = new JSONObject(purchase).getString("productId");
                kotlin.jvm.internal.l.d(sku, "sku");
                kotlin.jvm.internal.l.d(purchase, "purchase");
                hashMap.put(sku, purchase);
                arrayList2.add(sku);
            } catch (JSONException e10) {
                Log.e(f19552b, "Error parsing in-app purchase data.", e10);
            }
        }
        i iVar = i.f19595a;
        for (Map.Entry<String, String> entry : i.k(context, arrayList2, f19559i, z10).entrySet()) {
            String value = entry.getValue();
            String str = (String) hashMap.get(entry.getKey());
            if (str != null) {
                y0.i iVar2 = y0.i.f20320a;
                y0.i.f(str, value, z10);
            }
        }
    }

    public static final void g() {
        a aVar = f19551a;
        aVar.e();
        if (kotlin.jvm.internal.l.a(f19554d, Boolean.FALSE)) {
            return;
        }
        y0.i iVar = y0.i.f20320a;
        if (y0.i.c()) {
            aVar.h();
        }
    }

    private final void h() {
        if (f19553c.compareAndSet(false, true)) {
            f0 f0Var = f0.f14852a;
            Context l10 = f0.l();
            if (l10 instanceof Application) {
                Application application = (Application) l10;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f19557g;
                if (activityLifecycleCallbacks == null) {
                    kotlin.jvm.internal.l.p("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f19558h;
                if (intent == null) {
                    kotlin.jvm.internal.l.p("intent");
                    throw null;
                }
                ServiceConnection serviceConnection = f19556f;
                if (serviceConnection != null) {
                    l10.bindService(intent, serviceConnection, 1);
                } else {
                    kotlin.jvm.internal.l.p("serviceConnection");
                    throw null;
                }
            }
        }
    }
}
