package i9;

import i9.a1;
import i9.i1;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f9865e = Logger.getLogger(c1.class.getName());

    /* renamed from: f  reason: collision with root package name */
    private static c1 f9866f;

    /* renamed from: a  reason: collision with root package name */
    private final a1.d f9867a = new b();

    /* renamed from: b  reason: collision with root package name */
    private String f9868b = "unknown";

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<b1> f9869c = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private com.google.common.collect.r<String, b1> f9870d = com.google.common.collect.r.j();

    /* loaded from: classes.dex */
    private final class b extends a1.d {
        private b() {
        }

        @Override // i9.a1.d
        public String a() {
            String str;
            synchronized (c1.this) {
                str = c1.this.f9868b;
            }
            return str;
        }

        @Override // i9.a1.d
        public a1 b(URI uri, a1.b bVar) {
            b1 b1Var = c1.this.f().get(uri.getScheme());
            if (b1Var == null) {
                return null;
            }
            return b1Var.b(uri, bVar);
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements i1.b<b1> {
        private c() {
        }

        @Override // i9.i1.b
        /* renamed from: c */
        public int b(b1 b1Var) {
            return b1Var.e();
        }

        @Override // i9.i1.b
        /* renamed from: d */
        public boolean a(b1 b1Var) {
            return b1Var.d();
        }
    }

    private synchronized void b(b1 b1Var) {
        b5.n.e(b1Var.d(), "isAvailable() returned false");
        this.f9869c.add(b1Var);
    }

    public static synchronized c1 d() {
        c1 c1Var;
        synchronized (c1.class) {
            if (f9866f == null) {
                List<b1> e10 = i1.e(b1.class, e(), b1.class.getClassLoader(), new c());
                if (e10.isEmpty()) {
                    f9865e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f9866f = new c1();
                for (b1 b1Var : e10) {
                    Logger logger = f9865e;
                    logger.fine("Service loader found " + b1Var);
                    f9866f.b(b1Var);
                }
                f9866f.g();
            }
            c1Var = f9866f;
        }
        return c1Var;
    }

    static List<Class<?>> e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(io.grpc.internal.d0.class);
        } catch (ClassNotFoundException e10) {
            f9865e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e10);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void g() {
        HashMap hashMap = new HashMap();
        int i10 = Integer.MIN_VALUE;
        String str = "unknown";
        Iterator<b1> it = this.f9869c.iterator();
        while (it.hasNext()) {
            b1 next = it.next();
            String c10 = next.c();
            b1 b1Var = (b1) hashMap.get(c10);
            if (b1Var == null || b1Var.e() < next.e()) {
                hashMap.put(c10, next);
            }
            if (i10 < next.e()) {
                i10 = next.e();
                str = next.c();
            }
        }
        this.f9870d = com.google.common.collect.r.c(hashMap);
        this.f9868b = str;
    }

    public a1.d c() {
        return this.f9867a;
    }

    synchronized Map<String, b1> f() {
        return this.f9870d;
    }
}
