package io.grpc.internal;

import i9.a1;
import io.grpc.internal.e0;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class h1 extends i9.v0<h1> {
    private static final Logger H = Logger.getLogger(h1.class.getName());
    static final long I = TimeUnit.MINUTES.toMillis(30);
    static final long J = TimeUnit.SECONDS.toMillis(1);
    private static final p1<? extends Executor> K = g2.c(r0.f11591u);
    private static final i9.v L = i9.v.c();
    private static final i9.o M = i9.o.a();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private final c F;
    private final b G;

    /* renamed from: a  reason: collision with root package name */
    p1<? extends Executor> f11336a;

    /* renamed from: b  reason: collision with root package name */
    p1<? extends Executor> f11337b;

    /* renamed from: c  reason: collision with root package name */
    private final List<i9.h> f11338c;

    /* renamed from: d  reason: collision with root package name */
    final i9.c1 f11339d;

    /* renamed from: e  reason: collision with root package name */
    a1.d f11340e;

    /* renamed from: f  reason: collision with root package name */
    final String f11341f;

    /* renamed from: g  reason: collision with root package name */
    final i9.b f11342g;

    /* renamed from: h  reason: collision with root package name */
    private final SocketAddress f11343h;

    /* renamed from: i  reason: collision with root package name */
    String f11344i;

    /* renamed from: j  reason: collision with root package name */
    String f11345j;

    /* renamed from: k  reason: collision with root package name */
    String f11346k;

    /* renamed from: l  reason: collision with root package name */
    boolean f11347l;

    /* renamed from: m  reason: collision with root package name */
    i9.v f11348m;

    /* renamed from: n  reason: collision with root package name */
    i9.o f11349n;

    /* renamed from: o  reason: collision with root package name */
    long f11350o;

    /* renamed from: p  reason: collision with root package name */
    int f11351p;

    /* renamed from: q  reason: collision with root package name */
    int f11352q;

    /* renamed from: r  reason: collision with root package name */
    long f11353r;

    /* renamed from: s  reason: collision with root package name */
    long f11354s;

    /* renamed from: t  reason: collision with root package name */
    boolean f11355t;

    /* renamed from: u  reason: collision with root package name */
    i9.d0 f11356u;

    /* renamed from: v  reason: collision with root package name */
    int f11357v;

    /* renamed from: w  reason: collision with root package name */
    Map<String, ?> f11358w;

    /* renamed from: x  reason: collision with root package name */
    boolean f11359x;

    /* renamed from: y  reason: collision with root package name */
    i9.g1 f11360y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11361z;

    /* loaded from: classes.dex */
    public interface b {
        int a();
    }

    /* loaded from: classes.dex */
    public interface c {
        t a();
    }

    /* loaded from: classes.dex */
    private static final class d implements b {
        private d() {
        }

        @Override // io.grpc.internal.h1.b
        public int a() {
            return 443;
        }
    }

    public h1(String str, i9.e eVar, i9.b bVar, c cVar, b bVar2) {
        p1<? extends Executor> p1Var = K;
        this.f11336a = p1Var;
        this.f11337b = p1Var;
        this.f11338c = new ArrayList();
        i9.c1 d10 = i9.c1.d();
        this.f11339d = d10;
        this.f11340e = d10.c();
        this.f11346k = "pick_first";
        this.f11348m = L;
        this.f11349n = M;
        this.f11350o = I;
        this.f11351p = 5;
        this.f11352q = 5;
        this.f11353r = 16777216L;
        this.f11354s = 1048576L;
        this.f11355t = true;
        this.f11356u = i9.d0.g();
        this.f11359x = true;
        this.f11361z = true;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = true;
        this.f11341f = (String) b5.n.o(str, "target");
        this.f11342g = bVar;
        this.F = (c) b5.n.o(cVar, "clientTransportFactoryBuilder");
        this.f11343h = null;
        if (bVar2 != null) {
            this.G = bVar2;
        } else {
            this.G = new d();
        }
    }

    public h1(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    @Override // i9.v0
    public i9.u0 a() {
        return new i1(new g1(this, this.F.a(), new e0.a(), g2.c(r0.f11591u), r0.f11593w, f(), l2.f11442a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.G.a();
    }

    List<i9.h> f() {
        boolean z10;
        i9.h hVar;
        ArrayList arrayList = new ArrayList(this.f11338c);
        List<i9.h> a10 = i9.h0.a();
        if (a10 != null) {
            arrayList.addAll(a10);
            z10 = true;
        } else {
            z10 = false;
        }
        i9.h hVar2 = null;
        if (!z10 && this.f11361z) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class<?> cls2 = Boolean.TYPE;
                hVar = (i9.h) cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.A), Boolean.valueOf(this.B), Boolean.valueOf(this.C), Boolean.valueOf(this.D));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                H.log(Level.FINE, "Unable to apply census stats", e10);
                hVar = null;
            }
            if (hVar != null) {
                arrayList.add(0, hVar);
            }
        }
        if (!z10 && this.E) {
            try {
                hVar2 = (i9.h) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e11) {
                H.log(Level.FINE, "Unable to apply census stats", e11);
            }
            if (hVar2 != null) {
                arrayList.add(0, hVar2);
            }
        }
        return arrayList;
    }
}
