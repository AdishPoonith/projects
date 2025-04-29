package t0;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import f1.l0;
import f1.r;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.v;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.f0;
import p0.j0;
import t0.m;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static SensorManager f17923c;

    /* renamed from: d  reason: collision with root package name */
    private static l f17924d;

    /* renamed from: e  reason: collision with root package name */
    private static String f17925e;

    /* renamed from: h  reason: collision with root package name */
    private static volatile boolean f17928h;

    /* renamed from: a  reason: collision with root package name */
    public static final e f17921a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final m f17922b = new m();

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicBoolean f17926f = new AtomicBoolean(true);

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicBoolean f17927g = new AtomicBoolean(false);

    private e() {
    }

    private final void c(final String str) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            if (f17928h) {
                return;
            }
            f17928h = true;
            f0 f0Var = f0.f14852a;
            f0.t().execute(new Runnable() { // from class: t0.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.d(str);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str) {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            f0 f0Var = f0.f14852a;
            f1.a e10 = f1.a.f8366f.e(f0.l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((e10 == null ? null : e10.h()) != null) {
                jSONArray.put(e10.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            y0.g gVar = y0.g.f20314a;
            jSONArray.put(y0.g.f() ? "1" : "0");
            l0 l0Var = l0.f8470a;
            Locale y10 = l0.y();
            jSONArray.put(y10.getLanguage() + '_' + ((Object) y10.getCountry()));
            String jSONArray2 = jSONArray.toString();
            kotlin.jvm.internal.l.d(jSONArray2, "extInfoArray.toString()");
            bundle.putString("device_session_id", g());
            bundle.putString("extinfo", jSONArray2);
            j0.c cVar = j0.f14918n;
            v vVar = v.f12860a;
            boolean z10 = true;
            String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            JSONObject c10 = cVar.B(null, format, bundle, null).k().c();
            AtomicBoolean atomicBoolean = f17927g;
            if (c10 == null || !c10.optBoolean("is_app_indexing_enabled", false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                l lVar = f17924d;
                if (lVar != null) {
                    lVar.h();
                }
            } else {
                f17925e = null;
            }
            f17928h = false;
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    public static final void e() {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            f17926f.set(false);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    public static final void f() {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            f17926f.set(true);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    public static final String g() {
        if (k1.a.d(e.class)) {
            return null;
        }
        try {
            if (f17925e == null) {
                f17925e = UUID.randomUUID().toString();
            }
            String str = f17925e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            k1.a.b(th, e.class);
            return null;
        }
    }

    public static final boolean h() {
        if (k1.a.d(e.class)) {
            return false;
        }
        try {
            return f17927g.get();
        } catch (Throwable th) {
            k1.a.b(th, e.class);
            return false;
        }
    }

    private final boolean i() {
        k1.a.d(this);
        return false;
    }

    public static final void j(Activity activity) {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(activity, "activity");
            g.f17930f.a().f(activity);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    public static final void k(Activity activity) {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(activity, "activity");
            if (f17926f.get()) {
                g.f17930f.a().h(activity);
                l lVar = f17924d;
                if (lVar != null) {
                    lVar.l();
                }
                SensorManager sensorManager = f17923c;
                if (sensorManager == null) {
                    return;
                }
                sensorManager.unregisterListener(f17922b);
            }
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    public static final void l(Activity activity) {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(activity, "activity");
            if (f17926f.get()) {
                g.f17930f.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                f0 f0Var = f0.f14852a;
                final String m10 = f0.m();
                f1.v vVar = f1.v.f8582a;
                final r f10 = f1.v.f(m10);
                if (kotlin.jvm.internal.l.a(f10 == null ? null : Boolean.valueOf(f10.b()), Boolean.TRUE) || f17921a.i()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager == null) {
                        return;
                    }
                    f17923c = sensorManager;
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    l lVar = new l(activity);
                    f17924d = lVar;
                    m mVar = f17922b;
                    mVar.a(new m.b() { // from class: t0.d
                        @Override // t0.m.b
                        public final void a() {
                            e.m(r.this, m10);
                        }
                    });
                    sensorManager.registerListener(mVar, defaultSensor, 2);
                    if (f10 != null && f10.b()) {
                        lVar.h();
                    }
                }
                e eVar = f17921a;
                if (!eVar.i() || f17927g.get()) {
                    return;
                }
                eVar.c(m10);
            }
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(r rVar, String appId) {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(appId, "$appId");
            boolean z10 = rVar != null && rVar.b();
            f0 f0Var = f0.f14852a;
            boolean z11 = f0.s();
            if (z10 && z11) {
                f17921a.c(appId);
            }
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    public static final void n(boolean z10) {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            f17927g.set(z10);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }
}
