package w0;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: h  reason: collision with root package name */
    private static l f19608h;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f19610a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f19611b;

    /* renamed from: c  reason: collision with root package name */
    private final Method f19612c;

    /* renamed from: d  reason: collision with root package name */
    private final Method f19613d;

    /* renamed from: e  reason: collision with root package name */
    private final Method f19614e;

    /* renamed from: f  reason: collision with root package name */
    private final Method f19615f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f19607g = new a(null);

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicBoolean f19609i = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final void a() {
            m mVar = m.f19616a;
            Class<?> a10 = m.a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> a11 = m.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a10 == null || a11 == null) {
                return;
            }
            Method d10 = m.d(a10, "newBuilder", new Class[0]);
            Method d11 = m.d(a11, "setType", String.class);
            Method d12 = m.d(a11, "setSkusList", List.class);
            Method d13 = m.d(a11, "build", new Class[0]);
            if (d10 == null || d11 == null || d12 == null || d13 == null) {
                return;
            }
            l.c(new l(a10, a11, d10, d11, d12, d13));
        }

        public final l b() {
            if (l.a().get()) {
                return l.b();
            }
            a();
            l.a().set(true);
            return l.b();
        }
    }

    public l(Class<?> skuDetailsParamsClazz, Class<?> builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        kotlin.jvm.internal.l.e(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        kotlin.jvm.internal.l.e(builderClazz, "builderClazz");
        kotlin.jvm.internal.l.e(newBuilderMethod, "newBuilderMethod");
        kotlin.jvm.internal.l.e(setTypeMethod, "setTypeMethod");
        kotlin.jvm.internal.l.e(setSkusListMethod, "setSkusListMethod");
        kotlin.jvm.internal.l.e(buildMethod, "buildMethod");
        this.f19610a = skuDetailsParamsClazz;
        this.f19611b = builderClazz;
        this.f19612c = newBuilderMethod;
        this.f19613d = setTypeMethod;
        this.f19614e = setSkusListMethod;
        this.f19615f = buildMethod;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (k1.a.d(l.class)) {
            return null;
        }
        try {
            return f19609i;
        } catch (Throwable th) {
            k1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ l b() {
        if (k1.a.d(l.class)) {
            return null;
        }
        try {
            return f19608h;
        } catch (Throwable th) {
            k1.a.b(th, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(l lVar) {
        if (k1.a.d(l.class)) {
            return;
        }
        try {
            f19608h = lVar;
        } catch (Throwable th) {
            k1.a.b(th, l.class);
        }
    }

    public final Object d(String str, List<String> list) {
        Object e10;
        Object e11;
        if (k1.a.d(this)) {
            return null;
        }
        try {
            m mVar = m.f19616a;
            Object e12 = m.e(this.f19610a, this.f19612c, null, new Object[0]);
            if (e12 != null && (e10 = m.e(this.f19611b, this.f19613d, e12, str)) != null && (e11 = m.e(this.f19611b, this.f19614e, e10, list)) != null) {
                return m.e(this.f19611b, this.f19615f, e11, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }

    public final Class<?> e() {
        if (k1.a.d(this)) {
            return null;
        }
        try {
            return this.f19610a;
        } catch (Throwable th) {
            k1.a.b(th, this);
            return null;
        }
    }
}
