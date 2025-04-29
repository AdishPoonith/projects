package f1;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import f1.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.j0;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f8511a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final String f8512b = kotlin.jvm.internal.t.b(q.class).a();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f8513c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentLinkedQueue<a> f8514d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, JSONObject> f8515e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private static Long f8516f;

    /* renamed from: g  reason: collision with root package name */
    private static g1.b f8517g;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    private q() {
    }

    private final JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        p0.f0 f0Var = p0.f0.f14852a;
        bundle.putString("sdk_version", p0.f0.B());
        bundle.putString("fields", "gatekeepers");
        j0.c cVar = p0.j0.f14918n;
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        p0.j0 x10 = cVar.x(null, format, null);
        x10.H(bundle);
        JSONObject d10 = x10.k().d();
        return d10 == null ? new JSONObject() : d10;
    }

    public static final boolean d(String name, String str, boolean z10) {
        Boolean bool;
        kotlin.jvm.internal.l.e(name, "name");
        Map<String, Boolean> e10 = f8511a.e(str);
        return (e10.containsKey(name) && (bool = e10.get(name)) != null) ? bool.booleanValue() : z10;
    }

    private final boolean f(Long l10) {
        return l10 != null && System.currentTimeMillis() - l10.longValue() < 3600000;
    }

    public static final synchronized void h(a aVar) {
        synchronized (q.class) {
            if (aVar != null) {
                f8514d.add(aVar);
            }
            p0.f0 f0Var = p0.f0.f14852a;
            final String m10 = p0.f0.m();
            q qVar = f8511a;
            if (qVar.f(f8516f) && f8515e.containsKey(m10)) {
                qVar.k();
                return;
            }
            final Context l10 = p0.f0.l();
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            final String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{m10}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
            if (l10 == null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = l10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(format, null);
            l0 l0Var = l0.f8470a;
            if (!l0.X(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e10) {
                    l0 l0Var2 = l0.f8470a;
                    l0.d0("FacebookSDK", e10);
                }
                if (jSONObject != null) {
                    j(m10, jSONObject);
                }
            }
            p0.f0 f0Var2 = p0.f0.f14852a;
            Executor t10 = p0.f0.t();
            if (t10 == null) {
                return;
            }
            if (f8513c.compareAndSet(false, true)) {
                t10.execute(new Runnable() { // from class: f1.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.i(m10, l10, format);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(String applicationId, Context context, String gateKeepersKey) {
        kotlin.jvm.internal.l.e(applicationId, "$applicationId");
        kotlin.jvm.internal.l.e(context, "$context");
        kotlin.jvm.internal.l.e(gateKeepersKey, "$gateKeepersKey");
        q qVar = f8511a;
        JSONObject c10 = qVar.c(applicationId);
        if (c10.length() != 0) {
            j(applicationId, c10);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(gateKeepersKey, c10.toString()).apply();
            f8516f = Long.valueOf(System.currentTimeMillis());
        }
        qVar.k();
        f8513c.set(false);
    }

    public static final synchronized JSONObject j(String applicationId, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray optJSONArray;
        synchronized (q.class) {
            kotlin.jvm.internal.l.e(applicationId, "applicationId");
            jSONObject2 = f8515e.get(applicationId);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            int i10 = 0;
            JSONObject jSONObject3 = null;
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            int length = optJSONArray2.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i10);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException e10) {
                        l0 l0Var = l0.f8470a;
                        l0.d0("FacebookSDK", e10);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            f8515e.put(applicationId, jSONObject2);
        }
        return jSONObject2;
    }

    private final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = f8514d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a poll = concurrentLinkedQueue.poll();
            if (poll != null) {
                handler.post(new Runnable() { // from class: f1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.l(q.a.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar) {
        aVar.a();
    }

    public static final JSONObject m(String applicationId, boolean z10) {
        kotlin.jvm.internal.l.e(applicationId, "applicationId");
        if (!z10) {
            Map<String, JSONObject> map = f8515e;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject c10 = f8511a.c(applicationId);
        p0.f0 f0Var = p0.f0.f14852a;
        Context l10 = p0.f0.l();
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        l10.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(format, c10.toString()).apply();
        return j(applicationId, c10);
    }

    public final Map<String, Boolean> e(String str) {
        g();
        if (str != null) {
            Map<String, JSONObject> map = f8515e;
            if (map.containsKey(str)) {
                g1.b bVar = f8517g;
                List<g1.a> a10 = bVar == null ? null : bVar.a(str);
                if (a10 != null) {
                    HashMap hashMap = new HashMap();
                    for (g1.a aVar : a10) {
                        hashMap.put(aVar.a(), Boolean.valueOf(aVar.b()));
                    }
                    return hashMap;
                }
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject = map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    kotlin.jvm.internal.l.d(key, "key");
                    hashMap2.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
                }
                g1.b bVar2 = f8517g;
                if (bVar2 == null) {
                    bVar2 = new g1.b();
                }
                ArrayList arrayList = new ArrayList(hashMap2.size());
                for (Map.Entry entry : hashMap2.entrySet()) {
                    arrayList.add(new g1.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(str, arrayList);
                f8517g = bVar2;
                return hashMap2;
            }
        }
        return new HashMap();
    }

    public final void g() {
        h(null);
    }
}
