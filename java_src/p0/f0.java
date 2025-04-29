package p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import f1.n;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import p0.j0;
import p0.t0;
import q0.o;
import y0.h;
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f14852a = new f0();

    /* renamed from: b  reason: collision with root package name */
    private static final String f14853b = f0.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet<r0> f14854c;

    /* renamed from: d  reason: collision with root package name */
    private static Executor f14855d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile String f14856e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile String f14857f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile String f14858g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Boolean f14859h;

    /* renamed from: i  reason: collision with root package name */
    private static AtomicLong f14860i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile boolean f14861j;

    /* renamed from: k  reason: collision with root package name */
    private static boolean f14862k;

    /* renamed from: l  reason: collision with root package name */
    private static f1.b0<File> f14863l;

    /* renamed from: m  reason: collision with root package name */
    private static Context f14864m;

    /* renamed from: n  reason: collision with root package name */
    private static int f14865n;

    /* renamed from: o  reason: collision with root package name */
    private static final ReentrantLock f14866o;

    /* renamed from: p  reason: collision with root package name */
    private static String f14867p;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f14868q;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f14869r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f14870s;

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicBoolean f14871t;

    /* renamed from: u  reason: collision with root package name */
    private static volatile String f14872u;

    /* renamed from: v  reason: collision with root package name */
    private static volatile String f14873v;

    /* renamed from: w  reason: collision with root package name */
    private static a f14874w;

    /* renamed from: x  reason: collision with root package name */
    private static boolean f14875x;

    /* loaded from: classes.dex */
    public interface a {
        j0 a(p0.a aVar, String str, JSONObject jSONObject, j0.b bVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    static {
        HashSet<r0> c10;
        c10 = t9.m0.c(r0.DEVELOPER_ERRORS);
        f14854c = c10;
        f14860i = new AtomicLong(65536L);
        f14865n = 64206;
        f14866o = new ReentrantLock();
        f1.h0 h0Var = f1.h0.f8445a;
        f14867p = f1.h0.a();
        f14871t = new AtomicBoolean(false);
        f14872u = "instagram.com";
        f14873v = "facebook.com";
        f14874w = new a() { // from class: p0.e0
            @Override // p0.f0.a
            public final j0 a(a aVar, String str, JSONObject jSONObject, j0.b bVar) {
                j0 C;
                C = f0.C(aVar, str, jSONObject, bVar);
                return C;
            }
        };
    }

    private f0() {
    }

    public static final long A() {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.l();
        return f14860i.get();
    }

    public static final String B() {
        return "16.0.1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 C(p0.a aVar, String str, JSONObject jSONObject, j0.b bVar) {
        return j0.f14918n.A(aVar, str, jSONObject, bVar);
    }

    public static final boolean D() {
        return f14861j;
    }

    public static final synchronized boolean E() {
        boolean z10;
        synchronized (f0.class) {
            z10 = f14875x;
        }
        return z10;
    }

    public static final boolean F() {
        return f14871t.get();
    }

    public static final boolean G() {
        return f14862k;
    }

    public static final boolean H(r0 behavior) {
        boolean z10;
        kotlin.jvm.internal.l.e(behavior, "behavior");
        HashSet<r0> hashSet = f14854c;
        synchronized (hashSet) {
            if (D()) {
                z10 = hashSet.contains(behavior);
            }
        }
        return z10;
    }

    public static final void I(Context context) {
        boolean t10;
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.l.d(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f14856e == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.l.d(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.l.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    t10 = ka.p.t(lowerCase, "fb", false, 2, null);
                    if (t10) {
                        str = str.substring(2);
                        kotlin.jvm.internal.l.d(str, "(this as java.lang.String).substring(startIndex)");
                    }
                    f14856e = str;
                } else if (obj instanceof Number) {
                    throw new s("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f14857f == null) {
                f14857f = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f14858g == null) {
                f14858g = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f14865n == 64206) {
                f14865n = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f14859h == null) {
                f14859h = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private final void J(Context context, String str) {
        try {
            if (k1.a.d(this)) {
                return;
            }
            try {
                f1.a e10 = f1.a.f8366f.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String k10 = kotlin.jvm.internal.l.k(str, "ping");
                long j10 = sharedPreferences.getLong(k10, 0L);
                try {
                    y0.h hVar = y0.h.f20315a;
                    JSONObject a10 = y0.h.a(h.a.MOBILE_INSTALL_EVENT, e10, q0.o.f15963b.b(context), z(context), context);
                    kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
                    String format = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
                    j0 a11 = f14874w.a(null, format, a10, null);
                    if (j10 == 0 && a11.k().b() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(k10, System.currentTimeMillis());
                        edit.apply();
                    }
                } catch (JSONException e11) {
                    throw new s("An error occurred while publishing install.", e11);
                }
            } catch (Exception e12) {
                f1.l0 l0Var = f1.l0.f8470a;
                f1.l0.d0("Facebook-publish", e12);
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public static final void K(Context context, final String applicationId) {
        if (k1.a.d(f0.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(context, "context");
            kotlin.jvm.internal.l.e(applicationId, "applicationId");
            final Context applicationContext = context.getApplicationContext();
            t().execute(new Runnable() { // from class: p0.b0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.L(applicationContext, applicationId);
                }
            });
            f1.n nVar = f1.n.f8481a;
            if (f1.n.g(n.b.OnDeviceEventProcessing)) {
                a1.c cVar = a1.c.f22a;
                if (a1.c.d()) {
                    a1.c.g(applicationId, "com.facebook.sdk.attributionTracking");
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, f0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(Context applicationContext, String applicationId) {
        kotlin.jvm.internal.l.e(applicationId, "$applicationId");
        f0 f0Var = f14852a;
        kotlin.jvm.internal.l.d(applicationContext, "applicationContext");
        f0Var.J(applicationContext, applicationId);
    }

    public static final synchronized void M(Context applicationContext) {
        synchronized (f0.class) {
            kotlin.jvm.internal.l.e(applicationContext, "applicationContext");
            N(applicationContext, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:11:0x0018, B:13:0x0036, B:15:0x003e, B:21:0x004a, B:23:0x004e, B:27:0x0057, B:29:0x0060, B:30:0x0063, B:32:0x0067, B:34:0x006b, B:36:0x0073, B:38:0x0079, B:39:0x0081, B:40:0x0086, B:41:0x0087, B:43:0x0097, B:46:0x00db, B:47:0x00e0, B:48:0x00e1, B:49:0x00e6, B:50:0x00e7, B:51:0x00ee, B:52:0x00ef, B:53:0x00f6, B:54:0x00f7, B:55:0x00fc), top: B:59:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:4:0x0003, B:8:0x0013, B:11:0x0018, B:13:0x0036, B:15:0x003e, B:21:0x004a, B:23:0x004e, B:27:0x0057, B:29:0x0060, B:30:0x0063, B:32:0x0067, B:34:0x006b, B:36:0x0073, B:38:0x0079, B:39:0x0081, B:40:0x0086, B:41:0x0087, B:43:0x0097, B:46:0x00db, B:47:0x00e0, B:48:0x00e1, B:49:0x00e6, B:50:0x00e7, B:51:0x00ee, B:52:0x00ef, B:53:0x00f6, B:54:0x00f7, B:55:0x00fc), top: B:59:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void N(android.content.Context r5, final p0.f0.b r6) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.f0.N(android.content.Context, p0.f0$b):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File O() {
        Context context = f14864m;
        if (context != null) {
            return context.getCacheDir();
        }
        kotlin.jvm.internal.l.p("applicationContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(boolean z10) {
        if (z10) {
            h1.g gVar = h1.g.f9087a;
            h1.g.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(boolean z10) {
        if (z10) {
            q0.y yVar = q0.y.f15988a;
            q0.y.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(boolean z10) {
        if (z10) {
            f14868q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(boolean z10) {
        if (z10) {
            f14869r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(boolean z10) {
        if (z10) {
            f14870s = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void U(b bVar) {
        g.f14876f.e().j();
        v0.f15053d.a().d();
        if (p0.a.f14786u.g()) {
            t0.b bVar2 = t0.f15019q;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        o.a aVar = q0.o.f15963b;
        aVar.e(l(), f14856e);
        d1 d1Var = d1.f14828a;
        d1.k();
        Context applicationContext = l().getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext, "getApplicationContext().applicationContext");
        aVar.f(applicationContext).a();
        return null;
    }

    public static final void j() {
        f14875x = true;
    }

    public static final boolean k() {
        d1 d1Var = d1.f14828a;
        return d1.b();
    }

    public static final Context l() {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.l();
        Context context = f14864m;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.l.p("applicationContext");
        throw null;
    }

    public static final String m() {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.l();
        String str = f14856e;
        if (str != null) {
            return str;
        }
        throw new s("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.l();
        return f14857f;
    }

    public static final boolean o() {
        d1 d1Var = d1.f14828a;
        return d1.c();
    }

    public static final boolean p() {
        d1 d1Var = d1.f14828a;
        return d1.d();
    }

    public static final int q() {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.l();
        return f14865n;
    }

    public static final String r() {
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.l();
        String str = f14858g;
        if (str != null) {
            return str;
        }
        throw new s("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        d1 d1Var = d1.f14828a;
        return d1.e();
    }

    public static final Executor t() {
        ReentrantLock reentrantLock = f14866o;
        reentrantLock.lock();
        try {
            if (f14855d == null) {
                f14855d = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            s9.u uVar = s9.u.f17878a;
            reentrantLock.unlock();
            Executor executor = f14855d;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String u() {
        return f14873v;
    }

    public static final String v() {
        return "fb.gg";
    }

    public static final String w() {
        f1.l0 l0Var = f1.l0.f8470a;
        String str = f14853b;
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f14867p}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        f1.l0.e0(str, format);
        return f14867p;
    }

    public static final String x() {
        p0.a e10 = p0.a.f14786u.e();
        String l10 = e10 != null ? e10.l() : null;
        f1.l0 l0Var = f1.l0.f8470a;
        return f1.l0.B(l10);
    }

    public static final String y() {
        return f14872u;
    }

    public static final boolean z(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        f1.m0 m0Var = f1.m0.f8479a;
        f1.m0.l();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }
}
