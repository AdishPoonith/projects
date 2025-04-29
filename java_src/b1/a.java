package b1;

import android.util.Log;
import f1.l0;
import f1.r;
import f1.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.l;
import org.json.JSONException;
import org.json.JSONObject;
import p0.f0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2852b;

    /* renamed from: a  reason: collision with root package name */
    public static final a f2851a = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final String f2853c = a.class.getCanonicalName();

    /* renamed from: d  reason: collision with root package name */
    private static final List<C0057a> f2854d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private static final Set<String> f2855e = new CopyOnWriteArraySet();

    /* renamed from: b1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0057a {

        /* renamed from: a  reason: collision with root package name */
        private String f2856a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f2857b;

        public C0057a(String eventName, Map<String, String> restrictiveParams) {
            l.e(eventName, "eventName");
            l.e(restrictiveParams, "restrictiveParams");
            this.f2856a = eventName;
            this.f2857b = restrictiveParams;
        }

        public final String a() {
            return this.f2856a;
        }

        public final Map<String, String> b() {
            return this.f2857b;
        }

        public final void c(Map<String, String> map) {
            l.e(map, "<set-?>");
            this.f2857b = map;
        }
    }

    private a() {
    }

    public static final void a() {
        if (k1.a.d(a.class)) {
            return;
        }
        try {
            a aVar = f2851a;
            f2852b = true;
            aVar.c();
        } catch (Throwable th) {
            k1.a.b(th, a.class);
        }
    }

    private final String b(String str, String str2) {
        try {
            if (k1.a.d(this)) {
                return null;
            }
            try {
                for (C0057a c0057a : new ArrayList(f2854d)) {
                    if (c0057a != null && l.a(str, c0057a.a())) {
                        for (String str3 : c0057a.b().keySet()) {
                            if (l.a(str2, str3)) {
                                return c0057a.b().get(str3);
                            }
                        }
                        continue;
                    }
                }
            } catch (Exception e10) {
                Log.w(f2853c, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    private final void c() {
        String g10;
        if (k1.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f8582a;
            f0 f0Var = f0.f14852a;
            r n10 = v.n(f0.m(), false);
            if (n10 == null || (g10 = n10.g()) == null) {
                return;
            }
            if (g10.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(g10);
            f2854d.clear();
            f2855e.clear();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                if (jSONObject2 != null) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                    l.d(key, "key");
                    C0057a c0057a = new C0057a(key, new HashMap());
                    if (optJSONObject != null) {
                        l0 l0Var = l0.f8470a;
                        c0057a.c(l0.o(optJSONObject));
                        f2854d.add(c0057a);
                    }
                    if (jSONObject2.has("process_event_name")) {
                        f2855e.add(c0057a.a());
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final boolean d(String str) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            return f2855e.contains(str);
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    public static final String e(String eventName) {
        if (k1.a.d(a.class)) {
            return null;
        }
        try {
            l.e(eventName, "eventName");
            return f2852b ? f2851a.d(eventName) ? "_removed_" : eventName : eventName;
        } catch (Throwable th) {
            k1.a.b(th, a.class);
            return null;
        }
    }

    public static final void f(Map<String, String> parameters, String eventName) {
        if (k1.a.d(a.class)) {
            return;
        }
        try {
            l.e(parameters, "parameters");
            l.e(eventName, "eventName");
            if (f2852b) {
                HashMap hashMap = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String b10 = f2851a.b(eventName, str);
                    if (b10 != null) {
                        hashMap.put(str, b10);
                        parameters.remove(str);
                    }
                }
                if (!hashMap.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        parameters.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, a.class);
        }
    }
}
