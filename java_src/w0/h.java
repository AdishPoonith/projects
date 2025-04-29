package w0;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.p;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: u  reason: collision with root package name */
    private static h f19569u;

    /* renamed from: a  reason: collision with root package name */
    private final Context f19573a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f19574b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f19575c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<?> f19576d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f19577e;

    /* renamed from: f  reason: collision with root package name */
    private final Class<?> f19578f;

    /* renamed from: g  reason: collision with root package name */
    private final Class<?> f19579g;

    /* renamed from: h  reason: collision with root package name */
    private final Class<?> f19580h;

    /* renamed from: i  reason: collision with root package name */
    private final Class<?> f19581i;

    /* renamed from: j  reason: collision with root package name */
    private final Method f19582j;

    /* renamed from: k  reason: collision with root package name */
    private final Method f19583k;

    /* renamed from: l  reason: collision with root package name */
    private final Method f19584l;

    /* renamed from: m  reason: collision with root package name */
    private final Method f19585m;

    /* renamed from: n  reason: collision with root package name */
    private final Method f19586n;

    /* renamed from: o  reason: collision with root package name */
    private final Method f19587o;

    /* renamed from: p  reason: collision with root package name */
    private final Method f19588p;

    /* renamed from: q  reason: collision with root package name */
    private final l f19589q;

    /* renamed from: r  reason: collision with root package name */
    private final Set<String> f19590r;

    /* renamed from: s  reason: collision with root package name */
    public static final b f19567s = new b(null);

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicBoolean f19568t = new AtomicBoolean(false);

    /* renamed from: v  reason: collision with root package name */
    private static final AtomicBoolean f19570v = new AtomicBoolean(false);

    /* renamed from: w  reason: collision with root package name */
    private static final Map<String, JSONObject> f19571w = new ConcurrentHashMap();

    /* renamed from: x  reason: collision with root package name */
    private static final Map<String, JSONObject> f19572x = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            boolean k10;
            if (k1.a.d(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.l.e(proxy, "proxy");
                kotlin.jvm.internal.l.e(m10, "m");
                if (kotlin.jvm.internal.l.a(m10.getName(), "onBillingSetupFinished")) {
                    h.f19567s.f().set(true);
                } else {
                    String name = m10.getName();
                    kotlin.jvm.internal.l.d(name, "m.name");
                    k10 = p.k(name, "onBillingServiceDisconnected", false, 2, null);
                    if (k10) {
                        h.f19567s.f().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                k1.a.b(th, this);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final Object a(Context context, Class<?> cls) {
            Object e10;
            Object e11;
            Object e12;
            m mVar = m.f19616a;
            Class<?> a10 = m.a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> a11 = m.a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (a10 == null || a11 == null) {
                return null;
            }
            Method d10 = m.d(cls, "newBuilder", Context.class);
            Method d11 = m.d(a10, "enablePendingPurchases", new Class[0]);
            Method d12 = m.d(a10, "setListener", a11);
            Method d13 = m.d(a10, "build", new Class[0]);
            if (d10 == null || d11 == null || d12 == null || d13 == null || (e10 = m.e(cls, d10, null, context)) == null || (e11 = m.e(a10, d12, e10, Proxy.newProxyInstance(a11.getClassLoader(), new Class[]{a11}, new d()))) == null || (e12 = m.e(a10, d11, e11, new Object[0])) == null) {
                return null;
            }
            return m.e(a10, d13, e12, new Object[0]);
        }

        private final void b(Context context) {
            l b10 = l.f19607g.b();
            if (b10 == null) {
                return;
            }
            m mVar = m.f19616a;
            Class<?> a10 = m.a("com.android.billingclient.api.BillingClient");
            Class<?> a11 = m.a("com.android.billingclient.api.Purchase");
            Class<?> a12 = m.a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> a13 = m.a("com.android.billingclient.api.SkuDetails");
            Class<?> a14 = m.a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> a15 = m.a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> a16 = m.a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (a10 == null || a12 == null || a11 == null || a13 == null || a15 == null || a14 == null || a16 == null) {
                return;
            }
            Method d10 = m.d(a10, "queryPurchases", String.class);
            Method d11 = m.d(a12, "getPurchasesList", new Class[0]);
            Method d12 = m.d(a11, "getOriginalJson", new Class[0]);
            Method d13 = m.d(a13, "getOriginalJson", new Class[0]);
            Method d14 = m.d(a14, "getOriginalJson", new Class[0]);
            Method d15 = m.d(a10, "querySkuDetailsAsync", b10.e(), a15);
            Method d16 = m.d(a10, "queryPurchaseHistoryAsync", String.class, a16);
            if (d10 == null || d11 == null || d12 == null || d13 == null || d14 == null || d15 == null || d16 == null) {
                return;
            }
            Object a17 = a(context, a10);
            if (a17 == null) {
                return;
            }
            h.m(new h(context, a17, a10, a12, a11, a13, a14, a15, a16, d10, d11, d12, d13, d14, d15, d16, b10, null));
            h g10 = h.g();
            Objects.requireNonNull(g10, "null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            h.n(g10);
        }

        public final synchronized h c(Context context) {
            kotlin.jvm.internal.l.e(context, "context");
            if (h.f().get()) {
                return h.g();
            }
            b(context);
            h.f().set(true);
            return h.g();
        }

        public final Map<String, JSONObject> d() {
            return h.h();
        }

        public final Map<String, JSONObject> e() {
            return h.k();
        }

        public final AtomicBoolean f() {
            return h.l();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f19591a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19592b;

        public c(h this$0, Runnable runnable) {
            kotlin.jvm.internal.l.e(this$0, "this$0");
            kotlin.jvm.internal.l.e(runnable, "runnable");
            this.f19592b = this$0;
            this.f19591a = runnable;
        }

        private final void a(List<?> list) {
            if (k1.a.d(this)) {
                return;
            }
            try {
                for (Object obj : list) {
                    try {
                        m mVar = m.f19616a;
                        Object e10 = m.e(h.i(this.f19592b), h.c(this.f19592b), obj, new Object[0]);
                        String str = e10 instanceof String ? (String) e10 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            jSONObject.put("packageName", h.b(this.f19592b).getPackageName());
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                h.e(this.f19592b).add(skuID);
                                Map<String, JSONObject> d10 = h.f19567s.d();
                                kotlin.jvm.internal.l.d(skuID, "skuID");
                                d10.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f19591a.run();
            } catch (Throwable th) {
                k1.a.b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            if (k1.a.d(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.l.e(proxy, "proxy");
                kotlin.jvm.internal.l.e(method, "method");
                if (kotlin.jvm.internal.l.a(method.getName(), "onPurchaseHistoryResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th) {
                k1.a.b(th, this);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (k1.a.d(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.l.e(proxy, "proxy");
                kotlin.jvm.internal.l.e(m10, "m");
                return null;
            } catch (Throwable th) {
                k1.a.b(th, this);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class e implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f19593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f19594b;

        public e(h this$0, Runnable runnable) {
            kotlin.jvm.internal.l.e(this$0, "this$0");
            kotlin.jvm.internal.l.e(runnable, "runnable");
            this.f19594b = this$0;
            this.f19593a = runnable;
        }

        public final void a(List<?> skuDetailsObjectList) {
            if (k1.a.d(this)) {
                return;
            }
            try {
                kotlin.jvm.internal.l.e(skuDetailsObjectList, "skuDetailsObjectList");
                for (Object obj : skuDetailsObjectList) {
                    try {
                        m mVar = m.f19616a;
                        Object e10 = m.e(h.j(this.f19594b), h.d(this.f19594b), obj, new Object[0]);
                        String str = e10 instanceof String ? (String) e10 : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String skuID = jSONObject.getString("productId");
                                Map<String, JSONObject> e11 = h.f19567s.e();
                                kotlin.jvm.internal.l.d(skuID, "skuID");
                                e11.put(skuID, jSONObject);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f19593a.run();
            } catch (Throwable th) {
                k1.a.b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method m10, Object[] objArr) {
            if (k1.a.d(this)) {
                return null;
            }
            try {
                kotlin.jvm.internal.l.e(proxy, "proxy");
                kotlin.jvm.internal.l.e(m10, "m");
                if (kotlin.jvm.internal.l.a(m10.getName(), "onSkuDetailsResponse")) {
                    Object obj = objArr == null ? null : objArr[1];
                    if (obj != null && (obj instanceof List)) {
                        a((List) obj);
                    }
                }
                return null;
            } catch (Throwable th) {
                k1.a.b(th, this);
                return null;
            }
        }
    }

    private h(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar) {
        this.f19573a = context;
        this.f19574b = obj;
        this.f19575c = cls;
        this.f19576d = cls2;
        this.f19577e = cls3;
        this.f19578f = cls4;
        this.f19579g = cls5;
        this.f19580h = cls6;
        this.f19581i = cls7;
        this.f19582j = method;
        this.f19583k = method2;
        this.f19584l = method3;
        this.f19585m = method4;
        this.f19586n = method5;
        this.f19587o = method6;
        this.f19588p = method7;
        this.f19589q = lVar;
        this.f19590r = new CopyOnWriteArraySet();
    }

    public /* synthetic */ h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, l lVar, kotlin.jvm.internal.g gVar) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, lVar);
    }

    public static final /* synthetic */ Context b(h hVar) {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f19573a;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method c(h hVar) {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f19586n;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Method d(h hVar) {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f19585m;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Set e(h hVar) {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f19590r;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean f() {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return f19568t;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ h g() {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return f19569u;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map h() {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return f19571w;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class i(h hVar) {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f19579g;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Class j(h hVar) {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return hVar.f19578f;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ Map k() {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return f19572x;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean l() {
        if (k1.a.d(h.class)) {
            return null;
        }
        try {
            return f19570v;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
            return null;
        }
    }

    public static final /* synthetic */ void m(h hVar) {
        if (k1.a.d(h.class)) {
            return;
        }
        try {
            f19569u = hVar;
        } catch (Throwable th) {
            k1.a.b(th, h.class);
        }
    }

    public static final /* synthetic */ void n(h hVar) {
        if (k1.a.d(h.class)) {
            return;
        }
        try {
            hVar.t();
        } catch (Throwable th) {
            k1.a.b(th, h.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(h this$0, Runnable queryPurchaseHistoryRunnable) {
        if (k1.a.d(h.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(this$0, "this$0");
            kotlin.jvm.internal.l.e(queryPurchaseHistoryRunnable, "$queryPurchaseHistoryRunnable");
            this$0.s("inapp", new ArrayList(this$0.f19590r), queryPurchaseHistoryRunnable);
        } catch (Throwable th) {
            k1.a.b(th, h.class);
        }
    }

    private final void r(String str, Runnable runnable) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f19581i.getClassLoader(), new Class[]{this.f19581i}, new c(this, runnable));
            m mVar = m.f19616a;
            m.e(this.f19575c, this.f19588p, this.f19574b, str, newProxyInstance);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void s(String str, List<String> list, Runnable runnable) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f19580h.getClassLoader(), new Class[]{this.f19580h}, new e(this, runnable));
            Object d10 = this.f19589q.d(str, list);
            m mVar = m.f19616a;
            m.e(this.f19575c, this.f19587o, this.f19574b, d10, newProxyInstance);
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    private final void t() {
        Method d10;
        if (k1.a.d(this)) {
            return;
        }
        try {
            m mVar = m.f19616a;
            Class<?> a10 = m.a("com.android.billingclient.api.BillingClientStateListener");
            if (a10 == null || (d10 = m.d(this.f19575c, "startConnection", a10)) == null) {
                return;
            }
            m.e(this.f19575c, d10, this.f19574b, Proxy.newProxyInstance(a10.getClassLoader(), new Class[]{a10}, new a()));
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void o(String skuType, Runnable querySkuRunnable) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(skuType, "skuType");
            kotlin.jvm.internal.l.e(querySkuRunnable, "querySkuRunnable");
            m mVar = m.f19616a;
            Object e10 = m.e(this.f19576d, this.f19583k, m.e(this.f19575c, this.f19582j, this.f19574b, "inapp"), new Object[0]);
            List list = e10 instanceof List ? (List) e10 : null;
            if (list == null) {
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    m mVar2 = m.f19616a;
                    Object e11 = m.e(this.f19577e, this.f19584l, obj, new Object[0]);
                    String str = e11 instanceof String ? (String) e11 : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String skuID = jSONObject.getString("productId");
                            arrayList.add(skuID);
                            Map<String, JSONObject> map = f19571w;
                            kotlin.jvm.internal.l.d(skuID, "skuID");
                            map.put(skuID, jSONObject);
                        }
                    }
                }
                s(skuType, arrayList, querySkuRunnable);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }

    public final void p(String skuType, final Runnable queryPurchaseHistoryRunnable) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(skuType, "skuType");
            kotlin.jvm.internal.l.e(queryPurchaseHistoryRunnable, "queryPurchaseHistoryRunnable");
            r(skuType, new Runnable() { // from class: w0.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.q(h.this, queryPurchaseHistoryRunnable);
                }
            });
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
