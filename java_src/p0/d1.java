package p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f14828a = new d1();

    /* renamed from: b  reason: collision with root package name */
    private static final String f14829b = d1.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f14830c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f14831d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static final a f14832e = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: f  reason: collision with root package name */
    private static final a f14833f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: g  reason: collision with root package name */
    private static final a f14834g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: h  reason: collision with root package name */
    private static final a f14835h = new a(false, "auto_event_setup_enabled");

    /* renamed from: i  reason: collision with root package name */
    private static final a f14836i = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: j  reason: collision with root package name */
    private static SharedPreferences f14837j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f14838a;

        /* renamed from: b  reason: collision with root package name */
        private String f14839b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f14840c;

        /* renamed from: d  reason: collision with root package name */
        private long f14841d;

        public a(boolean z10, String key) {
            kotlin.jvm.internal.l.e(key, "key");
            this.f14838a = z10;
            this.f14839b = key;
        }

        public final boolean a() {
            return this.f14838a;
        }

        public final String b() {
            return this.f14839b;
        }

        public final long c() {
            return this.f14841d;
        }

        public final Boolean d() {
            return this.f14840c;
        }

        public final boolean e() {
            Boolean bool = this.f14840c;
            return bool == null ? this.f14838a : bool.booleanValue();
        }

        public final void f(long j10) {
            this.f14841d = j10;
        }

        public final void g(Boolean bool) {
            this.f14840c = bool;
        }
    }

    private d1() {
    }

    public static final boolean b() {
        if (k1.a.d(d1.class)) {
            return false;
        }
        try {
            f14828a.h();
            return f14834g.e();
        } catch (Throwable th) {
            k1.a.b(th, d1.class);
            return false;
        }
    }

    public static final boolean c() {
        if (k1.a.d(d1.class)) {
            return false;
        }
        try {
            f14828a.h();
            return f14832e.e();
        } catch (Throwable th) {
            k1.a.b(th, d1.class);
            return false;
        }
    }

    public static final boolean d() {
        if (k1.a.d(d1.class)) {
            return false;
        }
        try {
            f14828a.h();
            return f14833f.e();
        } catch (Throwable th) {
            k1.a.b(th, d1.class);
            return false;
        }
    }

    public static final boolean e() {
        if (k1.a.d(d1.class)) {
            return false;
        }
        try {
            f14828a.h();
            return f14835h.e();
        } catch (Throwable th) {
            k1.a.b(th, d1.class);
            return false;
        }
    }

    private final void f() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            a aVar = f14835h;
            n(aVar);
            final long currentTimeMillis = System.currentTimeMillis();
            if (aVar.d() == null || currentTimeMillis - aVar.c() >= 604800000) {
                aVar.g(null);
                aVar.f(0L);
                if (f14831d.compareAndSet(false, true)) {
                    f0 f0Var = f0.f14852a;
                    f0.t().execute(new Runnable() { // from class: p0.c1
                        @Override // java.lang.Runnable
                        public final void run() {
                            d1.g(currentTimeMillis);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(long j10) {
        if (k1.a.d(d1.class)) {
            return;
        }
        try {
            if (f14834g.e()) {
                f1.v vVar = f1.v.f8582a;
                f0 f0Var = f0.f14852a;
                f1.r n10 = f1.v.n(f0.m(), false);
                if (n10 != null && n10.b()) {
                    f1.a e10 = f1.a.f8366f.e(f0.l());
                    String h10 = (e10 == null || e10.h() == null) ? null : e10.h();
                    if (h10 != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", h10);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        j0 x10 = j0.f14918n.x(null, "app", null);
                        x10.H(bundle);
                        JSONObject c10 = x10.k().c();
                        if (c10 != null) {
                            a aVar = f14835h;
                            aVar.g(Boolean.valueOf(c10.optBoolean("auto_event_setup_enabled", false)));
                            aVar.f(j10);
                            f14828a.p(aVar);
                        }
                    }
                }
            }
            f14831d.set(false);
        } catch (Throwable th) {
            k1.a.b(th, d1.class);
        }
    }

    private final void h() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            f0 f0Var = f0.f14852a;
            if (f0.F() && f14830c.compareAndSet(false, true)) {
                SharedPreferences sharedPreferences = f0.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                kotlin.jvm.internal.l.d(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
                f14837j = sharedPreferences;
                i(f14833f, f14834g, f14832e);
                f();
                m();
                l();
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void i(a... aVarArr) {
        if (k1.a.d(this)) {
            return;
        }
        int i10 = 0;
        try {
            int length = aVarArr.length;
            while (i10 < length) {
                a aVar = aVarArr[i10];
                i10++;
                if (aVar == f14835h) {
                    f();
                } else if (aVar.d() == null) {
                    n(aVar);
                    if (aVar.d() == null) {
                        j(aVar);
                    }
                } else {
                    p(aVar);
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void j(a aVar) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            o();
            try {
                f0 f0Var = f0.f14852a;
                Context l10 = f0.l();
                ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                kotlin.jvm.internal.l.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey(aVar.b())) {
                    return;
                }
                aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.b(), aVar.a())));
            } catch (PackageManager.NameNotFoundException e10) {
                f1.l0 l0Var = f1.l0.f8470a;
                f1.l0.d0(f14829b, e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public static final void k() {
        if (k1.a.d(d1.class)) {
            return;
        }
        try {
            f0 f0Var = f0.f14852a;
            Context l10 = f0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            kotlin.jvm.internal.l.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            q0.c0 c0Var = new q0.c0(l10);
            Bundle bundle2 = new Bundle();
            f1.l0 l0Var = f1.l0.f8470a;
            if (!f1.l0.P()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(f14829b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            c0Var.d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            k1.a.b(th, d1.class);
        }
    }

    private final void l() {
        int i10;
        int i11;
        ApplicationInfo applicationInfo;
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (f14830c.get()) {
                f0 f0Var = f0.f14852a;
                if (f0.F()) {
                    Context l10 = f0.l();
                    int i12 = 0;
                    int i13 = ((f14832e.e() ? 1 : 0) << 0) | 0 | ((f14833f.e() ? 1 : 0) << 1) | ((f14834g.e() ? 1 : 0) << 2) | ((f14836i.e() ? 1 : 0) << 3);
                    SharedPreferences sharedPreferences = f14837j;
                    if (sharedPreferences == null) {
                        kotlin.jvm.internal.l.p("userSettingPref");
                        throw null;
                    }
                    int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                    if (i14 != i13) {
                        SharedPreferences sharedPreferences2 = f14837j;
                        if (sharedPreferences2 == null) {
                            kotlin.jvm.internal.l.p("userSettingPref");
                            throw null;
                        }
                        sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).apply();
                        try {
                            applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
                            kotlin.jvm.internal.l.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                        } catch (PackageManager.NameNotFoundException unused) {
                            i10 = 0;
                        }
                        if (applicationInfo.metaData == null) {
                            i11 = 0;
                            q0.c0 c0Var = new q0.c0(l10);
                            Bundle bundle = new Bundle();
                            bundle.putInt("usage", i12);
                            bundle.putInt("initial", i11);
                            bundle.putInt("previous", i14);
                            bundle.putInt("current", i13);
                            c0Var.b(bundle);
                        }
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        int i15 = 0;
                        i10 = 0;
                        i11 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            try {
                                i10 |= (applicationInfo.metaData.containsKey(strArr[i15]) ? 1 : 0) << i15;
                                i11 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                                if (i16 > 3) {
                                    break;
                                }
                                i15 = i16;
                            } catch (PackageManager.NameNotFoundException unused2) {
                                i12 = i11;
                                i11 = i12;
                                i12 = i10;
                                q0.c0 c0Var2 = new q0.c0(l10);
                                Bundle bundle2 = new Bundle();
                                bundle2.putInt("usage", i12);
                                bundle2.putInt("initial", i11);
                                bundle2.putInt("previous", i14);
                                bundle2.putInt("current", i13);
                                c0Var2.b(bundle2);
                            }
                        }
                        i12 = i10;
                        q0.c0 c0Var22 = new q0.c0(l10);
                        Bundle bundle22 = new Bundle();
                        bundle22.putInt("usage", i12);
                        bundle22.putInt("initial", i11);
                        bundle22.putInt("previous", i14);
                        bundle22.putInt("current", i13);
                        c0Var22.b(bundle22);
                    }
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void m() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            f0 f0Var = f0.f14852a;
            Context l10 = f0.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            kotlin.jvm.internal.l.d(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(f14829b, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(f14829b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (b()) {
                    return;
                }
                Log.w(f14829b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void n(a aVar) {
        String str = "";
        if (k1.a.d(this)) {
            return;
        }
        try {
            o();
            try {
                SharedPreferences sharedPreferences = f14837j;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.l.p("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.b(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e10) {
                f1.l0 l0Var = f1.l0.f8470a;
                f1.l0.d0(f14829b, e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void o() {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (f14830c.get()) {
                return;
            }
            throw new g0("The UserSettingManager has not been initialized successfully");
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void p(a aVar) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            o();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.d());
                jSONObject.put("last_timestamp", aVar.c());
                SharedPreferences sharedPreferences = f14837j;
                if (sharedPreferences == null) {
                    kotlin.jvm.internal.l.p("userSettingPref");
                    throw null;
                }
                sharedPreferences.edit().putString(aVar.b(), jSONObject.toString()).apply();
                l();
            } catch (Exception e10) {
                f1.l0 l0Var = f1.l0.f8470a;
                f1.l0.d0(f14829b, e10);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
