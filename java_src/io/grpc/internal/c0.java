package io.grpc.internal;

import i9.a1;
import io.grpc.internal.f2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class c0 extends i9.a1 {
    private static final g A;
    private static String B;

    /* renamed from: s  reason: collision with root package name */
    private static final Logger f11061s = Logger.getLogger(c0.class.getName());

    /* renamed from: t  reason: collision with root package name */
    private static final Set<String> f11062t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: u  reason: collision with root package name */
    private static final String f11063u;

    /* renamed from: v  reason: collision with root package name */
    private static final String f11064v;

    /* renamed from: w  reason: collision with root package name */
    private static final String f11065w;

    /* renamed from: x  reason: collision with root package name */
    static boolean f11066x;

    /* renamed from: y  reason: collision with root package name */
    static boolean f11067y;

    /* renamed from: z  reason: collision with root package name */
    protected static boolean f11068z;

    /* renamed from: a  reason: collision with root package name */
    final i9.g1 f11069a;

    /* renamed from: b  reason: collision with root package name */
    private final Random f11070b = new Random();

    /* renamed from: c  reason: collision with root package name */
    protected volatile b f11071c = d.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<f> f11072d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private final String f11073e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11074f;

    /* renamed from: g  reason: collision with root package name */
    private final int f11075g;

    /* renamed from: h  reason: collision with root package name */
    private final f2.d<Executor> f11076h;

    /* renamed from: i  reason: collision with root package name */
    private final long f11077i;

    /* renamed from: j  reason: collision with root package name */
    private final i9.n1 f11078j;

    /* renamed from: k  reason: collision with root package name */
    private final b5.r f11079k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f11080l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11081m;

    /* renamed from: n  reason: collision with root package name */
    private Executor f11082n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f11083o;

    /* renamed from: p  reason: collision with root package name */
    private final a1.h f11084p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f11085q;

    /* renamed from: r  reason: collision with root package name */
    private a1.e f11086r;

    /* loaded from: classes.dex */
    public interface b {
        List<InetAddress> b(String str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private i9.j1 f11087a;

        /* renamed from: b  reason: collision with root package name */
        private List<i9.x> f11088b;

        /* renamed from: c  reason: collision with root package name */
        private a1.c f11089c;

        /* renamed from: d  reason: collision with root package name */
        public i9.a f11090d;

        private c() {
        }
    }

    /* loaded from: classes.dex */
    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.c0.b
        public List<InetAddress> b(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private final a1.e f11093j;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ boolean f11095j;

            a(boolean z10) {
                this.f11095j = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f11095j) {
                    c0 c0Var = c0.this;
                    c0Var.f11080l = true;
                    if (c0Var.f11077i > 0) {
                        c0.this.f11079k.f().g();
                    }
                }
                c0.this.f11085q = false;
            }
        }

        e(a1.e eVar) {
            this.f11093j = (a1.e) b5.n.o(eVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            i9.n1 n1Var;
            a aVar;
            Logger logger = c0.f11061s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                Logger logger2 = c0.f11061s;
                logger2.finer("Attempting DNS resolution of " + c0.this.f11074f);
            }
            c cVar = null;
            boolean z10 = true;
            try {
                try {
                    i9.x n10 = c0.this.n();
                    a1.g.a d10 = a1.g.d();
                    if (n10 != null) {
                        if (c0.f11061s.isLoggable(level)) {
                            Logger logger3 = c0.f11061s;
                            logger3.finer("Using proxy address " + n10);
                        }
                        d10.b(Collections.singletonList(n10));
                    } else {
                        cVar = c0.this.o(false);
                        if (cVar.f11087a != null) {
                            this.f11093j.b(cVar.f11087a);
                            return;
                        }
                        if (cVar.f11088b != null) {
                            d10.b(cVar.f11088b);
                        }
                        if (cVar.f11089c != null) {
                            d10.d(cVar.f11089c);
                        }
                        i9.a aVar2 = cVar.f11090d;
                        if (aVar2 != null) {
                            d10.c(aVar2);
                        }
                    }
                    this.f11093j.c(d10.a());
                    z10 = (cVar == null || cVar.f11087a != null) ? false : false;
                    n1Var = c0.this.f11078j;
                    aVar = new a(z10);
                } catch (IOException e10) {
                    a1.e eVar = this.f11093j;
                    i9.j1 j1Var = i9.j1.f9938u;
                    eVar.b(j1Var.q("Unable to resolve host " + c0.this.f11074f).p(e10));
                    z10 = (0 == 0 || null.f11087a != null) ? false : false;
                    n1Var = c0.this.f11078j;
                    aVar = new a(z10);
                }
                n1Var.execute(aVar);
            } finally {
                c0.this.f11078j.execute(new a((0 == 0 || null.f11087a != null) ? false : false));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        List<String> a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        f a();

        Throwable b();
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f11063u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f11064v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f11065w = property3;
        f11066x = Boolean.parseBoolean(property);
        f11067y = Boolean.parseBoolean(property2);
        f11068z = Boolean.parseBoolean(property3);
        A = v(c0.class.getClassLoader());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c0(String str, String str2, a1.b bVar, f2.d<Executor> dVar, b5.r rVar, boolean z10) {
        b5.n.o(bVar, "args");
        this.f11076h = dVar;
        URI create = URI.create("//" + ((String) b5.n.o(str2, "name")));
        b5.n.j(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f11073e = (String) b5.n.p(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f11074f = create.getHost();
        this.f11075g = create.getPort() == -1 ? bVar.a() : create.getPort();
        this.f11069a = (i9.g1) b5.n.o(bVar.c(), "proxyDetector");
        this.f11077i = s(z10);
        this.f11079k = (b5.r) b5.n.o(rVar, "stopwatch");
        this.f11078j = (i9.n1) b5.n.o(bVar.e(), "syncContext");
        Executor b10 = bVar.b();
        this.f11082n = b10;
        this.f11083o = b10 == null;
        this.f11084p = (a1.h) b5.n.o(bVar.d(), "serviceConfigParser");
    }

    private List<i9.x> A() {
        Exception e10 = null;
        try {
            try {
                List<InetAddress> b10 = this.f11071c.b(this.f11074f);
                ArrayList arrayList = new ArrayList(b10.size());
                for (InetAddress inetAddress : b10) {
                    arrayList.add(new i9.x(new InetSocketAddress(inetAddress, this.f11075g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e11) {
                e10 = e11;
                b5.u.f(e10);
                throw new RuntimeException(e10);
            }
        } catch (Throwable th) {
            if (e10 != null) {
                f11061s.log(Level.FINE, "Address resolution failure", (Throwable) e10);
            }
            throw th;
        }
    }

    private a1.c B() {
        List<String> emptyList = Collections.emptyList();
        f u10 = u();
        if (u10 != null) {
            try {
                emptyList = u10.a("_grpc_config." + this.f11074f);
            } catch (Exception e10) {
                f11061s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e10);
            }
        }
        if (emptyList.isEmpty()) {
            f11061s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f11074f});
            return null;
        }
        a1.c x10 = x(emptyList, this.f11070b, r());
        if (x10 != null) {
            return x10.d() != null ? a1.c.b(x10.d()) : this.f11084p.a((Map) x10.c());
        }
        return null;
    }

    protected static boolean C(boolean z10, boolean z11, String str) {
        if (z10) {
            if ("localhost".equalsIgnoreCase(str)) {
                return z11;
            }
            if (str.contains(":")) {
                return false;
            }
            boolean z12 = true;
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt != '.') {
                    z12 &= charAt >= '0' && charAt <= '9';
                }
            }
            return true ^ z12;
        }
        return false;
    }

    private boolean m() {
        if (this.f11080l) {
            long j10 = this.f11077i;
            if (j10 != 0 && (j10 <= 0 || this.f11079k.d(TimeUnit.NANOSECONDS) <= this.f11077i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i9.x n() {
        i9.f1 a10 = this.f11069a.a(InetSocketAddress.createUnresolved(this.f11074f, this.f11075g));
        if (a10 != null) {
            return new i9.x(a10);
        }
        return null;
    }

    private static final List<String> p(Map<String, ?> map) {
        return b1.g(map, "clientLanguage");
    }

    private static final List<String> q(Map<String, ?> map) {
        return b1.g(map, "clientHostname");
    }

    private static String r() {
        if (B == null) {
            try {
                B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }
        return B;
    }

    private static long s(boolean z10) {
        if (z10) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j10 = 30;
        if (property != null) {
            try {
                j10 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f11061s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j10 > 0 ? TimeUnit.SECONDS.toNanos(j10) : j10;
    }

    private static final Double t(Map<String, ?> map) {
        return b1.h(map, "percentage");
    }

    static g v(ClassLoader classLoader) {
        Logger logger;
        Level level;
        String str;
        g gVar;
        try {
            try {
                try {
                    gVar = (g) Class.forName("io.grpc.internal.z0", true, classLoader).asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    e = e10;
                    logger = f11061s;
                    level = Level.FINE;
                    str = "Can't construct JndiResourceResolverFactory, skipping.";
                }
            } catch (Exception e11) {
                e = e11;
                logger = f11061s;
                level = Level.FINE;
                str = "Can't find JndiResourceResolverFactory ctor, skipping.";
            }
        } catch (ClassCastException e12) {
            e = e12;
            logger = f11061s;
            level = Level.FINE;
            str = "Unable to cast JndiResourceResolverFactory, skipping.";
        } catch (ClassNotFoundException e13) {
            e = e13;
            logger = f11061s;
            level = Level.FINE;
            str = "Unable to find JndiResourceResolverFactory, skipping.";
        }
        if (gVar.b() != null) {
            logger = f11061s;
            level = Level.FINE;
            e = gVar.b();
            str = "JndiResourceResolverFactory not available, skipping.";
            logger.log(level, str, e);
            return null;
        }
        return gVar;
    }

    static Map<String, ?> w(Map<String, ?> map, Random random, String str) {
        boolean z10;
        boolean z11;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            b5.w.a(f11062t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> p10 = p(map);
        if (p10 != null && !p10.isEmpty()) {
            Iterator<String> it = p10.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("java".equalsIgnoreCase(it.next())) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                return null;
            }
        }
        Double t10 = t(map);
        if (t10 != null) {
            int intValue = t10.intValue();
            b5.w.a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", t10);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> q10 = q(map);
        if (q10 != null && !q10.isEmpty()) {
            Iterator<String> it2 = q10.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(str)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                return null;
            }
        }
        Map<String, ?> j10 = b1.j(map, "serviceConfig");
        if (j10 != null) {
            return j10;
        }
        throw new b5.x(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    static a1.c x(List<String> list, Random random, String str) {
        i9.j1 j1Var;
        String str2;
        try {
            Map<String, ?> map = null;
            for (Map<String, ?> map2 : y(list)) {
                try {
                    map = w(map2, random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    j1Var = i9.j1.f9925h;
                    str2 = "failed to pick service config choice";
                    return a1.c.b(j1Var.q(str2).p(e));
                }
            }
            if (map == null) {
                return null;
            }
            return a1.c.a(map);
        } catch (IOException | RuntimeException e11) {
            e = e11;
            j1Var = i9.j1.f9925h;
            str2 = "failed to parse TXT records";
        }
    }

    static List<Map<String, ?>> y(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                Object a10 = a1.a(str.substring(12));
                if (!(a10 instanceof List)) {
                    throw new ClassCastException("wrong type " + a10);
                }
                arrayList.addAll(b1.a((List) a10));
            } else {
                f11061s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    private void z() {
        if (this.f11085q || this.f11081m || !m()) {
            return;
        }
        this.f11085q = true;
        this.f11082n.execute(new e(this.f11086r));
    }

    @Override // i9.a1
    public String a() {
        return this.f11073e;
    }

    @Override // i9.a1
    public void b() {
        b5.n.u(this.f11086r != null, "not started");
        z();
    }

    @Override // i9.a1
    public void c() {
        if (this.f11081m) {
            return;
        }
        this.f11081m = true;
        Executor executor = this.f11082n;
        if (executor == null || !this.f11083o) {
            return;
        }
        this.f11082n = (Executor) f2.f(this.f11076h, executor);
    }

    @Override // i9.a1
    public void d(a1.e eVar) {
        b5.n.u(this.f11086r == null, "already started");
        if (this.f11083o) {
            this.f11082n = (Executor) f2.d(this.f11076h);
        }
        this.f11086r = (a1.e) b5.n.o(eVar, "listener");
        z();
    }

    protected c o(boolean z10) {
        c cVar = new c();
        try {
            cVar.f11088b = A();
        } catch (Exception e10) {
            if (!z10) {
                i9.j1 j1Var = i9.j1.f9938u;
                cVar.f11087a = j1Var.q("Unable to resolve host " + this.f11074f).p(e10);
                return cVar;
            }
        }
        if (f11068z) {
            cVar.f11089c = B();
        }
        return cVar;
    }

    protected f u() {
        g gVar;
        if (C(f11066x, f11067y, this.f11074f)) {
            f fVar = this.f11072d.get();
            return (fVar != null || (gVar = A) == null) ? fVar : gVar.a();
        }
        return null;
    }
}
