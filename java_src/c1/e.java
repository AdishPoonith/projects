package c1;

import android.app.Activity;
import f1.r;
import f1.v;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.f0;
import z0.f;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f3146a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f3147b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f3148c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f3149d = new LinkedHashSet();

    private e() {
    }

    public static final synchronized void b() {
        synchronized (e.class) {
            if (k1.a.d(e.class)) {
                return;
            }
            f0 f0Var = f0.f14852a;
            f0.t().execute(new Runnable() { // from class: c1.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f3147b;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f3146a.d();
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    private final void d() {
        String k10;
        if (k1.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f8582a;
            f0 f0Var = f0.f14852a;
            r n10 = v.n(f0.m(), false);
            if (n10 == null || (k10 = n10.k()) == null) {
                return;
            }
            g(k10);
            if ((!f3148c.isEmpty()) || (!f3149d.isEmpty())) {
                z0.f fVar = z0.f.f20652a;
                File l10 = z0.f.l(f.a.MTML_APP_EVENT_PREDICTION);
                if (l10 == null) {
                    return;
                }
                a aVar = a.f3133a;
                a.d(l10);
                y0.f fVar2 = y0.f.f20302a;
                Activity l11 = y0.f.l();
                if (l11 != null) {
                    h(l11);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public static final boolean e(String event) {
        if (k1.a.d(e.class)) {
            return false;
        }
        try {
            l.e(event, "event");
            return f3149d.contains(event);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
            return false;
        }
    }

    public static final boolean f(String event) {
        if (k1.a.d(e.class)) {
            return false;
        }
        try {
            l.e(event, "event");
            return f3148c.contains(event);
        } catch (Throwable th) {
            k1.a.b(th, e.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (k1.a.d(e.class)) {
            return;
        }
        try {
            l.e(activity, "activity");
            try {
                if (f3147b.get()) {
                    a aVar = a.f3133a;
                    if (a.f() && (!f3148c.isEmpty() || !f3149d.isEmpty())) {
                        g.f3151m.a(activity);
                        return;
                    }
                }
                g.f3151m.b(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            k1.a.b(th, e.class);
        }
    }

    public final void g(String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (k1.a.d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    Set<String> set = f3148c;
                    String string = jSONArray2.getString(i11);
                    l.d(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                Set<String> set2 = f3149d;
                String string2 = jSONArray.getString(i10);
                l.d(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i13 >= length) {
                    return;
                }
                i10 = i13;
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
