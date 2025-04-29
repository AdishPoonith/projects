package y0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import f1.c0;
import f1.l0;
import f1.n;
import f1.r;
import f1.v;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p0.f0;
import p0.r0;
import s9.u;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f20302a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final String f20303b;

    /* renamed from: c  reason: collision with root package name */
    private static final ScheduledExecutorService f20304c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile ScheduledFuture<?> f20305d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f20306e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicInteger f20307f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile m f20308g;

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicBoolean f20309h;

    /* renamed from: i  reason: collision with root package name */
    private static String f20310i;

    /* renamed from: j  reason: collision with root package name */
    private static long f20311j;

    /* renamed from: k  reason: collision with root package name */
    private static int f20312k;

    /* renamed from: l  reason: collision with root package name */
    private static WeakReference<Activity> f20313l;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.e(activity, "activity");
            c0.f8388e.b(r0.APP_EVENTS, f.f20303b, "onActivityCreated");
            g gVar = g.f20314a;
            g.a();
            f fVar = f.f20302a;
            f.p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            c0.f8388e.b(r0.APP_EVENTS, f.f20303b, "onActivityDestroyed");
            f.f20302a.r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            c0.f8388e.b(r0.APP_EVENTS, f.f20303b, "onActivityPaused");
            g gVar = g.f20314a;
            g.a();
            f.f20302a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            c0.f8388e.b(r0.APP_EVENTS, f.f20303b, "onActivityResumed");
            g gVar = g.f20314a;
            g.a();
            f fVar = f.f20302a;
            f.v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.l.e(activity, "activity");
            kotlin.jvm.internal.l.e(outState, "outState");
            c0.f8388e.b(r0.APP_EVENTS, f.f20303b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            f fVar = f.f20302a;
            f.f20312k++;
            c0.f8388e.b(r0.APP_EVENTS, f.f20303b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.l.e(activity, "activity");
            c0.f8388e.b(r0.APP_EVENTS, f.f20303b, "onActivityStopped");
            q0.o.f15963b.g();
            f fVar = f.f20302a;
            f.f20312k--;
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f20303b = canonicalName;
        f20304c = Executors.newSingleThreadScheduledExecutor();
        f20306e = new Object();
        f20307f = new AtomicInteger(0);
        f20309h = new AtomicBoolean(false);
    }

    private f() {
    }

    private final void k() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f20306e) {
            if (f20305d != null && (scheduledFuture = f20305d) != null) {
                scheduledFuture.cancel(false);
            }
            f20305d = null;
            u uVar = u.f17878a;
        }
    }

    public static final Activity l() {
        WeakReference<Activity> weakReference = f20313l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final UUID m() {
        m mVar;
        if (f20308g == null || (mVar = f20308g) == null) {
            return null;
        }
        return mVar.d();
    }

    private final int n() {
        v vVar = v.f8582a;
        f0 f0Var = f0.f14852a;
        r f10 = v.f(f0.m());
        if (f10 == null) {
            j jVar = j.f20326a;
            return j.a();
        }
        return f10.i();
    }

    public static final boolean o() {
        return f20312k == 0;
    }

    public static final void p(Activity activity) {
        f20304c.execute(new Runnable() { // from class: y0.e
            @Override // java.lang.Runnable
            public final void run() {
                f.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q() {
        if (f20308g == null) {
            f20308g = m.f20337g.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Activity activity) {
        t0.e eVar = t0.e.f17921a;
        t0.e.j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Activity activity) {
        AtomicInteger atomicInteger = f20307f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f20303b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        k();
        final long currentTimeMillis = System.currentTimeMillis();
        l0 l0Var = l0.f8470a;
        final String t10 = l0.t(activity);
        t0.e eVar = t0.e.f17921a;
        t0.e.k(activity);
        f20304c.execute(new Runnable() { // from class: y0.b
            @Override // java.lang.Runnable
            public final void run() {
                f.t(currentTimeMillis, t10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final long j10, final String activityName) {
        kotlin.jvm.internal.l.e(activityName, "$activityName");
        if (f20308g == null) {
            f20308g = new m(Long.valueOf(j10), null, null, 4, null);
        }
        m mVar = f20308g;
        if (mVar != null) {
            mVar.k(Long.valueOf(j10));
        }
        if (f20307f.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: y0.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.u(j10, activityName);
                }
            };
            synchronized (f20306e) {
                f20305d = f20304c.schedule(runnable, f20302a.n(), TimeUnit.SECONDS);
                u uVar = u.f17878a;
            }
        }
        long j11 = f20311j;
        long j12 = j11 > 0 ? (j10 - j11) / 1000 : 0L;
        i iVar = i.f20320a;
        i.e(activityName, j12);
        m mVar2 = f20308g;
        if (mVar2 == null) {
            return;
        }
        mVar2.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(long j10, String activityName) {
        kotlin.jvm.internal.l.e(activityName, "$activityName");
        if (f20308g == null) {
            f20308g = new m(Long.valueOf(j10), null, null, 4, null);
        }
        if (f20307f.get() <= 0) {
            n nVar = n.f20344a;
            n.e(activityName, f20308g, f20310i);
            m.f20337g.a();
            f20308g = null;
        }
        synchronized (f20306e) {
            f20305d = null;
            u uVar = u.f17878a;
        }
    }

    public static final void v(Activity activity) {
        kotlin.jvm.internal.l.e(activity, "activity");
        f fVar = f20302a;
        f20313l = new WeakReference<>(activity);
        f20307f.incrementAndGet();
        fVar.k();
        final long currentTimeMillis = System.currentTimeMillis();
        f20311j = currentTimeMillis;
        l0 l0Var = l0.f8470a;
        final String t10 = l0.t(activity);
        t0.e eVar = t0.e.f17921a;
        t0.e.l(activity);
        r0.b bVar = r0.b.f16618a;
        r0.b.d(activity);
        c1.e eVar2 = c1.e.f3146a;
        c1.e.h(activity);
        w0.k kVar = w0.k.f19605a;
        w0.k.b();
        final Context applicationContext = activity.getApplicationContext();
        f20304c.execute(new Runnable() { // from class: y0.d
            @Override // java.lang.Runnable
            public final void run() {
                f.w(currentTimeMillis, t10, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(long j10, String activityName, Context appContext) {
        m mVar;
        kotlin.jvm.internal.l.e(activityName, "$activityName");
        m mVar2 = f20308g;
        Long e10 = mVar2 == null ? null : mVar2.e();
        if (f20308g == null) {
            f20308g = new m(Long.valueOf(j10), null, null, 4, null);
            n nVar = n.f20344a;
            String str = f20310i;
            kotlin.jvm.internal.l.d(appContext, "appContext");
            n.c(activityName, null, str, appContext);
        } else if (e10 != null) {
            long longValue = j10 - e10.longValue();
            if (longValue > f20302a.n() * 1000) {
                n nVar2 = n.f20344a;
                n.e(activityName, f20308g, f20310i);
                String str2 = f20310i;
                kotlin.jvm.internal.l.d(appContext, "appContext");
                n.c(activityName, null, str2, appContext);
                f20308g = new m(Long.valueOf(j10), null, null, 4, null);
            } else if (longValue > 1000 && (mVar = f20308g) != null) {
                mVar.h();
            }
        }
        m mVar3 = f20308g;
        if (mVar3 != null) {
            mVar3.k(Long.valueOf(j10));
        }
        m mVar4 = f20308g;
        if (mVar4 == null) {
            return;
        }
        mVar4.m();
    }

    public static final void x(Application application, String str) {
        kotlin.jvm.internal.l.e(application, "application");
        if (f20309h.compareAndSet(false, true)) {
            f1.n nVar = f1.n.f8481a;
            f1.n.a(n.b.CodelessEvents, new n.a() { // from class: y0.a
                @Override // f1.n.a
                public final void a(boolean z10) {
                    f.y(z10);
                }
            });
            f20310i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(boolean z10) {
        if (z10) {
            t0.e eVar = t0.e.f17921a;
            t0.e.f();
            return;
        }
        t0.e eVar2 = t0.e.f17921a;
        t0.e.e();
    }
}
