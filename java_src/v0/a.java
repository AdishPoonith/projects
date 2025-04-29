package v0;

import f1.l0;
import f1.r;
import f1.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONObject;
import p0.f0;
import q0.d;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f19333b;

    /* renamed from: a  reason: collision with root package name */
    public static final a f19332a = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final List<C0275a> f19334c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static final Set<String> f19335d = new HashSet();

    /* renamed from: v0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0275a {

        /* renamed from: a  reason: collision with root package name */
        private String f19336a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f19337b;

        public C0275a(String eventName, List<String> deprecateParams) {
            l.e(eventName, "eventName");
            l.e(deprecateParams, "deprecateParams");
            this.f19336a = eventName;
            this.f19337b = deprecateParams;
        }

        public final List<String> a() {
            return this.f19337b;
        }

        public final String b() {
            return this.f19336a;
        }

        public final void c(List<String> list) {
            l.e(list, "<set-?>");
            this.f19337b = list;
        }
    }

    private a() {
    }

    public static final void a() {
        if (k1.a.d(a.class)) {
            return;
        }
        try {
            a aVar = f19332a;
            f19333b = true;
            aVar.b();
        } catch (Throwable th) {
            k1.a.b(th, a.class);
        }
    }

    private final synchronized void b() {
        r n10;
        if (k1.a.d(this)) {
            return;
        }
        try {
            v vVar = v.f8582a;
            f0 f0Var = f0.f14852a;
            n10 = v.n(f0.m(), false);
        } catch (Exception unused) {
        } catch (Throwable th) {
            k1.a.b(th, this);
            return;
        }
        if (n10 == null) {
            return;
        }
        String g10 = n10.g();
        if (g10 != null) {
            if (g10.length() > 0) {
                JSONObject jSONObject = new JSONObject(g10);
                f19334c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            Set<String> set = f19335d;
                            l.d(key, "key");
                            set.add(key);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            l.d(key, "key");
                            C0275a c0275a = new C0275a(key, new ArrayList());
                            if (optJSONArray != null) {
                                l0 l0Var = l0.f8470a;
                                c0275a.c(l0.m(optJSONArray));
                            }
                            f19334c.add(c0275a);
                        }
                    }
                }
            }
        }
    }

    public static final void c(Map<String, String> parameters, String eventName) {
        if (k1.a.d(a.class)) {
            return;
        }
        try {
            l.e(parameters, "parameters");
            l.e(eventName, "eventName");
            if (f19333b) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (C0275a c0275a : new ArrayList(f19334c)) {
                    if (l.a(c0275a.b(), eventName)) {
                        for (String str : arrayList) {
                            if (c0275a.a().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, a.class);
        }
    }

    public static final void d(List<d> events) {
        if (k1.a.d(a.class)) {
            return;
        }
        try {
            l.e(events, "events");
            if (f19333b) {
                Iterator<d> it = events.iterator();
                while (it.hasNext()) {
                    if (f19335d.contains(it.next().f())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            k1.a.b(th, a.class);
        }
    }
}
