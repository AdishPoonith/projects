package q0;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import f1.l0;
import f1.m0;
import f1.n;
import f1.y;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p0.r0;
import q0.o;
import q0.r;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final a f15972c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final String f15973d;

    /* renamed from: e  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f15974e;

    /* renamed from: f  reason: collision with root package name */
    private static o.b f15975f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f15976g;

    /* renamed from: h  reason: collision with root package name */
    private static String f15977h;

    /* renamed from: i  reason: collision with root package name */
    private static boolean f15978i;

    /* renamed from: j  reason: collision with root package name */
    private static String f15979j;

    /* renamed from: a  reason: collision with root package name */
    private final String f15980a;

    /* renamed from: b  reason: collision with root package name */
    private q0.a f15981b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: q0.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0233a implements y.a {
            C0233a() {
            }

            @Override // f1.y.a
            public void a(String str) {
                r.f15972c.t(str);
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(Context context, r logger) {
            kotlin.jvm.internal.l.e(context, "$context");
            kotlin.jvm.internal.l.e(logger, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = i10 + 1;
                String str = strArr[i10];
                String str2 = strArr2[i10];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i11 |= 1 << i10;
                } catch (ClassNotFoundException unused) {
                }
                if (i12 > 10) {
                    break;
                }
                i10 = i12;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i11) {
                sharedPreferences.edit().putInt("kitsBitmask", i11).apply();
                logger.o("fb_sdk_initialize", null, bundle);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void o() {
            synchronized (r.e()) {
                if (r.b() != null) {
                    return;
                }
                a aVar = r.f15972c;
                r.i(new ScheduledThreadPoolExecutor(1));
                s9.u uVar = s9.u.f17878a;
                q qVar = new Runnable() { // from class: q0.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.p();
                    }
                };
                ScheduledThreadPoolExecutor b10 = r.b();
                if (b10 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                b10.scheduleAtFixedRate(qVar, 0L, 86400L, TimeUnit.SECONDS);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p() {
            HashSet<String> hashSet = new HashSet();
            m mVar = m.f15954a;
            for (q0.a aVar : m.p()) {
                hashSet.add(aVar.b());
            }
            for (String str : hashSet) {
                f1.v vVar = f1.v.f8582a;
                f1.v.n(str, true);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void q(d dVar, q0.a aVar) {
            m mVar = m.f15954a;
            m.g(aVar, dVar);
            f1.n nVar = f1.n.f8481a;
            if (f1.n.g(n.b.OnDevicePostInstallEventProcessing)) {
                a1.c cVar = a1.c.f22a;
                if (a1.c.d()) {
                    a1.c.e(aVar.b(), dVar);
                }
            }
            if (dVar.c() || r.f()) {
                return;
            }
            if (kotlin.jvm.internal.l.a(dVar.f(), "fb_mobile_activate_app")) {
                r.g(true);
            } else {
                f1.c0.f8388e.b(r0.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r(String str) {
            f1.c0.f8388e.b(r0.DEVELOPER_ERRORS, "AppEvents", str);
        }

        public final void f(Application application, String str) {
            kotlin.jvm.internal.l.e(application, "application");
            p0.f0 f0Var = p0.f0.f14852a;
            if (!p0.f0.F()) {
                throw new p0.s("The Facebook sdk must be initialized before calling activateApp");
            }
            c cVar = c.f15900a;
            c.d();
            g0 g0Var = g0.f15939a;
            g0.e();
            if (str == null) {
                str = p0.f0.m();
            }
            p0.f0.K(application, str);
            y0.f fVar = y0.f.f20302a;
            y0.f.x(application, str);
        }

        public final void g() {
            if (j() != o.b.EXPLICIT_ONLY) {
                m mVar = m.f15954a;
                m.l(z.EAGER_FLUSHING_EVENT);
            }
        }

        public final Executor h() {
            if (r.b() == null) {
                o();
            }
            ScheduledThreadPoolExecutor b10 = r.b();
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final String i(Context context) {
            kotlin.jvm.internal.l.e(context, "context");
            if (r.a() == null) {
                synchronized (r.e()) {
                    if (r.a() == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                        a aVar = r.f15972c;
                        r.h(sharedPreferences.getString("anonymousAppDeviceGUID", null));
                        if (r.a() == null) {
                            UUID randomUUID = UUID.randomUUID();
                            kotlin.jvm.internal.l.d(randomUUID, "randomUUID()");
                            r.h(kotlin.jvm.internal.l.k("XZ", randomUUID));
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", r.a()).apply();
                        }
                    }
                    s9.u uVar = s9.u.f17878a;
                }
            }
            String a10 = r.a();
            if (a10 != null) {
                return a10;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final o.b j() {
            o.b c10;
            synchronized (r.e()) {
                c10 = r.c();
            }
            return c10;
        }

        public final String k() {
            f1.y yVar = f1.y.f8600a;
            f1.y.d(new C0233a());
            p0.f0 f0Var = p0.f0.f14852a;
            return p0.f0.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public final String l() {
            String d10;
            synchronized (r.e()) {
                d10 = r.d();
            }
            return d10;
        }

        public final void m(final Context context, String str) {
            kotlin.jvm.internal.l.e(context, "context");
            p0.f0 f0Var = p0.f0.f14852a;
            if (p0.f0.p()) {
                final r rVar = new r(context, str, (p0.a) null);
                ScheduledThreadPoolExecutor b10 = r.b();
                if (b10 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                b10.execute(new Runnable() { // from class: q0.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.n(context, rVar);
                    }
                });
            }
        }

        public final void s() {
            m mVar = m.f15954a;
            m.s();
        }

        public final void t(String str) {
            p0.f0 f0Var = p0.f0.f14852a;
            SharedPreferences sharedPreferences = p0.f0.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = r.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f15973d = canonicalName;
        f15975f = o.b.AUTO;
        f15976g = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(Context context, String str, p0.a aVar) {
        this(l0.t(context), str, aVar);
        l0 l0Var = l0.f8470a;
    }

    public r(String activityName, String str, p0.a aVar) {
        q0.a aVar2;
        kotlin.jvm.internal.l.e(activityName, "activityName");
        m0 m0Var = m0.f8479a;
        m0.l();
        this.f15980a = activityName;
        aVar = aVar == null ? p0.a.f14786u.e() : aVar;
        if (aVar == null || aVar.z() || !(str == null || kotlin.jvm.internal.l.a(str, aVar.c()))) {
            if (str == null) {
                l0 l0Var = l0.f8470a;
                p0.f0 f0Var = p0.f0.f14852a;
                str = l0.F(p0.f0.l());
            }
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            aVar2 = new q0.a(null, str);
        } else {
            aVar2 = new q0.a(aVar);
        }
        this.f15981b = aVar2;
        f15972c.o();
    }

    public static final /* synthetic */ String a() {
        if (k1.a.d(r.class)) {
            return null;
        }
        try {
            return f15977h;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (k1.a.d(r.class)) {
            return null;
        }
        try {
            return f15974e;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
            return null;
        }
    }

    public static final /* synthetic */ o.b c() {
        if (k1.a.d(r.class)) {
            return null;
        }
        try {
            return f15975f;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (k1.a.d(r.class)) {
            return null;
        }
        try {
            return f15979j;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
            return null;
        }
    }

    public static final /* synthetic */ Object e() {
        if (k1.a.d(r.class)) {
            return null;
        }
        try {
            return f15976g;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
            return null;
        }
    }

    public static final /* synthetic */ boolean f() {
        if (k1.a.d(r.class)) {
            return false;
        }
        try {
            return f15978i;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
            return false;
        }
    }

    public static final /* synthetic */ void g(boolean z10) {
        if (k1.a.d(r.class)) {
            return;
        }
        try {
            f15978i = z10;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
        }
    }

    public static final /* synthetic */ void h(String str) {
        if (k1.a.d(r.class)) {
            return;
        }
        try {
            f15977h = str;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
        }
    }

    public static final /* synthetic */ void i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (k1.a.d(r.class)) {
            return;
        }
        try {
            f15974e = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            k1.a.b(th, r.class);
        }
    }

    public final void j() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            m mVar = m.f15954a;
            m.l(z.EXPLICIT);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void k(String str, double d10, Bundle bundle) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Double valueOf = Double.valueOf(d10);
            y0.f fVar = y0.f.f20302a;
            m(str, valueOf, bundle, false, y0.f.m());
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void l(String str, Bundle bundle) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            y0.f fVar = y0.f.f20302a;
            m(str, null, bundle, false, y0.f.m());
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void m(String str, Double d10, Bundle bundle, boolean z10, UUID uuid) {
        if (k1.a.d(this) || str == null) {
            return;
        }
        try {
            if (str.length() == 0) {
                return;
            }
            f1.q qVar = f1.q.f8511a;
            p0.f0 f0Var = p0.f0.f14852a;
            if (f1.q.d("app_events_killswitch", p0.f0.m(), false)) {
                f1.c0.f8388e.c(r0.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
                return;
            }
            try {
                String str2 = this.f15980a;
                y0.f fVar = y0.f.f20302a;
                f15972c.q(new d(str2, str, d10, bundle, z10, y0.f.o(), uuid), this.f15981b);
            } catch (JSONException e10) {
                f1.c0.f8388e.c(r0.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e10.toString());
            } catch (p0.s e11) {
                f1.c0.f8388e.c(r0.APP_EVENTS, "AppEvents", "Invalid app event: %s", e11.toString());
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void n(String str, String str2) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            l(str, bundle);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void o(String str, Double d10, Bundle bundle) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            y0.f fVar = y0.f.f20302a;
            m(str, d10, bundle, true, y0.f.m());
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void p(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                l0 l0Var = l0.f8470a;
                l0.e0(f15973d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            Double valueOf = Double.valueOf(bigDecimal.doubleValue());
            y0.f fVar = y0.f.f20302a;
            m(str, valueOf, bundle2, true, y0.f.m());
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void q(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z10) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f15972c.r("purchaseAmount cannot be null");
            } else if (currency == null) {
                f15972c.r("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putString("fb_currency", currency.getCurrencyCode());
                Double valueOf = Double.valueOf(bigDecimal.doubleValue());
                y0.f fVar = y0.f.f20302a;
                m("fb_mobile_purchase", valueOf, bundle2, z10, y0.f.m());
                f15972c.g();
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void r(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            q(bigDecimal, currency, bundle, true);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
