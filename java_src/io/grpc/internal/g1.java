package io.grpc.internal;

import i9.a1;
import i9.e0;
import i9.f;
import i9.f0;
import i9.g;
import i9.k;
import i9.n1;
import i9.r0;
import io.grpc.internal.j;
import io.grpc.internal.j1;
import io.grpc.internal.k;
import io.grpc.internal.k1;
import io.grpc.internal.m;
import io.grpc.internal.p;
import io.grpc.internal.y0;
import io.grpc.internal.z1;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g1 extends i9.u0 implements i9.i0<Object> {

    /* renamed from: n0  reason: collision with root package name */
    static final Logger f11195n0 = Logger.getLogger(g1.class.getName());

    /* renamed from: o0  reason: collision with root package name */
    static final Pattern f11196o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: p0  reason: collision with root package name */
    static final i9.j1 f11197p0;

    /* renamed from: q0  reason: collision with root package name */
    static final i9.j1 f11198q0;

    /* renamed from: r0  reason: collision with root package name */
    static final i9.j1 f11199r0;

    /* renamed from: s0  reason: collision with root package name */
    private static final j1 f11200s0;

    /* renamed from: t0  reason: collision with root package name */
    private static final i9.f0 f11201t0;

    /* renamed from: u0  reason: collision with root package name */
    private static final i9.g<Object, Object> f11202u0;
    private final i9.d A;
    private final String B;
    private i9.a1 C;
    private boolean D;
    private t E;
    private volatile r0.i F;
    private boolean G;
    private final Set<y0> H;
    private Collection<v.g<?, ?>> I;
    private final Object J;
    private final Set<q1> K;
    private final a0 L;
    private final z M;
    private final AtomicBoolean N;
    private boolean O;
    private boolean P;
    private volatile boolean Q;
    private final CountDownLatch R;
    private final m.b S;
    private final io.grpc.internal.m T;
    private final io.grpc.internal.o U;
    private final i9.f V;
    private final i9.d0 W;
    private final v X;
    private w Y;
    private j1 Z;

    /* renamed from: a  reason: collision with root package name */
    private final i9.j0 f11203a;

    /* renamed from: a0  reason: collision with root package name */
    private final j1 f11204a0;

    /* renamed from: b  reason: collision with root package name */
    private final String f11205b;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f11206b0;

    /* renamed from: c  reason: collision with root package name */
    private final String f11207c;

    /* renamed from: c0  reason: collision with root package name */
    private final boolean f11208c0;

    /* renamed from: d  reason: collision with root package name */
    private final i9.c1 f11209d;

    /* renamed from: d0  reason: collision with root package name */
    private final z1.t f11210d0;

    /* renamed from: e  reason: collision with root package name */
    private final a1.d f11211e;

    /* renamed from: e0  reason: collision with root package name */
    private final long f11212e0;

    /* renamed from: f  reason: collision with root package name */
    private final a1.b f11213f;

    /* renamed from: f0  reason: collision with root package name */
    private final long f11214f0;

    /* renamed from: g  reason: collision with root package name */
    private final io.grpc.internal.j f11215g;

    /* renamed from: g0  reason: collision with root package name */
    private final boolean f11216g0;

    /* renamed from: h  reason: collision with root package name */
    private final io.grpc.internal.t f11217h;

    /* renamed from: h0  reason: collision with root package name */
    private final k1.a f11218h0;

    /* renamed from: i  reason: collision with root package name */
    private final io.grpc.internal.t f11219i;

    /* renamed from: i0  reason: collision with root package name */
    final w0<Object> f11220i0;

    /* renamed from: j  reason: collision with root package name */
    private final io.grpc.internal.t f11221j;

    /* renamed from: j0  reason: collision with root package name */
    private n1.d f11222j0;

    /* renamed from: k  reason: collision with root package name */
    private final x f11223k;

    /* renamed from: k0  reason: collision with root package name */
    private io.grpc.internal.k f11224k0;

    /* renamed from: l  reason: collision with root package name */
    private final Executor f11225l;

    /* renamed from: l0  reason: collision with root package name */
    private final p.e f11226l0;

    /* renamed from: m  reason: collision with root package name */
    private final p1<? extends Executor> f11227m;

    /* renamed from: m0  reason: collision with root package name */
    private final y1 f11228m0;

    /* renamed from: n  reason: collision with root package name */
    private final p1<? extends Executor> f11229n;

    /* renamed from: o  reason: collision with root package name */
    private final q f11230o;

    /* renamed from: p  reason: collision with root package name */
    private final q f11231p;

    /* renamed from: q  reason: collision with root package name */
    private final l2 f11232q;

    /* renamed from: r  reason: collision with root package name */
    private final int f11233r;

    /* renamed from: s  reason: collision with root package name */
    final i9.n1 f11234s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f11235t;

    /* renamed from: u  reason: collision with root package name */
    private final i9.v f11236u;

    /* renamed from: v  reason: collision with root package name */
    private final i9.o f11237v;

    /* renamed from: w  reason: collision with root package name */
    private final b5.t<b5.r> f11238w;

    /* renamed from: x  reason: collision with root package name */
    private final long f11239x;

    /* renamed from: y  reason: collision with root package name */
    private final io.grpc.internal.w f11240y;

    /* renamed from: z  reason: collision with root package name */
    private final k.a f11241z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends i9.f0 {
        a() {
        }

        @Override // i9.f0
        public f0.b a(r0.f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1.this.A0(true);
        }
    }

    /* loaded from: classes.dex */
    final class c implements m.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l2 f11243a;

        c(l2 l2Var) {
            this.f11243a = l2Var;
        }

        @Override // io.grpc.internal.m.b
        public io.grpc.internal.m a() {
            return new io.grpc.internal.m(this.f11243a);
        }
    }

    /* loaded from: classes.dex */
    final class d implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Runnable f11245j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ i9.p f11246k;

        d(Runnable runnable, i9.p pVar) {
            this.f11245j = runnable;
            this.f11246k = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g1.this.f11240y.c(this.f11245j, g1.this.f11225l, this.f11246k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class e extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final r0.e f11248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f11249b;

        e(Throwable th) {
            this.f11249b = th;
            this.f11248a = r0.e.e(i9.j1.f9937t.q("Panic! This is a bug!").p(th));
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            return this.f11248a;
        }

        public String toString() {
            return b5.h.b(e.class).d("panicPickResult", this.f11248a).toString();
        }
    }

    /* loaded from: classes.dex */
    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g1.this.N.get() || g1.this.E == null) {
                return;
            }
            g1.this.A0(false);
            g1.this.C0();
        }
    }

    /* loaded from: classes.dex */
    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1.this.D0();
            if (g1.this.F != null) {
                g1.this.F.b();
            }
            if (g1.this.E != null) {
                g1.this.E.f11275a.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1.this.V.a(f.a.INFO, "Entering SHUTDOWN state");
            g1.this.f11240y.b(i9.p.SHUTDOWN);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g1.this.O) {
                return;
            }
            g1.this.O = true;
            g1.this.H0();
        }
    }

    /* loaded from: classes.dex */
    class j implements Thread.UncaughtExceptionHandler {
        j() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            Logger logger = g1.f11195n0;
            Level level = Level.SEVERE;
            logger.log(level, "[" + g1.this.f() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            g1.this.J0(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k extends n0 {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(i9.a1 a1Var, String str) {
            super(a1Var);
            this.f11256b = str;
        }

        @Override // i9.a1
        public String a() {
            return this.f11256b;
        }
    }

    /* loaded from: classes.dex */
    class l extends i9.g<Object, Object> {
        l() {
        }

        @Override // i9.g
        public void a(String str, Throwable th) {
        }

        @Override // i9.g
        public void b() {
        }

        @Override // i9.g
        public void c(int i10) {
        }

        @Override // i9.g
        public void d(Object obj) {
        }

        @Override // i9.g
        public void e(g.a<Object> aVar, i9.y0 y0Var) {
        }
    }

    /* loaded from: classes.dex */
    private final class m implements p.e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g1.this.D0();
            }
        }

        /* loaded from: classes.dex */
        final class b<ReqT> extends z1<ReqT> {
            final /* synthetic */ i9.z0 E;
            final /* synthetic */ i9.y0 F;
            final /* synthetic */ i9.c G;
            final /* synthetic */ a2 H;
            final /* synthetic */ t0 I;
            final /* synthetic */ z1.c0 J;
            final /* synthetic */ i9.r K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i9.z0 z0Var, i9.y0 y0Var, i9.c cVar, a2 a2Var, t0 t0Var, z1.c0 c0Var, i9.r rVar) {
                super(z0Var, y0Var, g1.this.f11210d0, g1.this.f11212e0, g1.this.f11214f0, g1.this.E0(cVar), g1.this.f11219i.S(), a2Var, t0Var, c0Var);
                this.E = z0Var;
                this.F = y0Var;
                this.G = cVar;
                this.H = a2Var;
                this.I = t0Var;
                this.J = c0Var;
                this.K = rVar;
            }

            @Override // io.grpc.internal.z1
            io.grpc.internal.q j0(i9.y0 y0Var, k.a aVar, int i10, boolean z10) {
                i9.c r10 = this.G.r(aVar);
                i9.k[] f10 = r0.f(r10, y0Var, i10, z10);
                io.grpc.internal.s c10 = m.this.c(new t1(this.E, y0Var, r10));
                i9.r b10 = this.K.b();
                try {
                    return c10.a(this.E, y0Var, r10, f10);
                } finally {
                    this.K.f(b10);
                }
            }

            @Override // io.grpc.internal.z1
            void k0() {
                g1.this.M.d(this);
            }

            @Override // io.grpc.internal.z1
            i9.j1 l0() {
                return g1.this.M.a(this);
            }
        }

        private m() {
        }

        /* synthetic */ m(g1 g1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public io.grpc.internal.s c(r0.f fVar) {
            r0.i iVar = g1.this.F;
            if (!g1.this.N.get()) {
                if (iVar == null) {
                    g1.this.f11234s.execute(new a());
                } else {
                    io.grpc.internal.s j10 = r0.j(iVar.a(fVar), fVar.a().j());
                    if (j10 != null) {
                        return j10;
                    }
                }
            }
            return g1.this.L;
        }

        @Override // io.grpc.internal.p.e
        public io.grpc.internal.q a(i9.z0<?, ?> z0Var, i9.c cVar, i9.y0 y0Var, i9.r rVar) {
            if (g1.this.f11216g0) {
                z1.c0 g10 = g1.this.Z.g();
                j1.b bVar = (j1.b) cVar.h(j1.b.f11392g);
                return new b(z0Var, y0Var, cVar, bVar == null ? null : bVar.f11397e, bVar == null ? null : bVar.f11398f, g10, rVar);
            }
            io.grpc.internal.s c10 = c(new t1(z0Var, y0Var, cVar));
            i9.r b10 = rVar.b();
            try {
                return c10.a(z0Var, y0Var, cVar, r0.f(cVar, y0Var, 0, false));
            } finally {
                rVar.f(b10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class n<ReqT, RespT> extends i9.z<ReqT, RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final i9.f0 f11259a;

        /* renamed from: b  reason: collision with root package name */
        private final i9.d f11260b;

        /* renamed from: c  reason: collision with root package name */
        private final Executor f11261c;

        /* renamed from: d  reason: collision with root package name */
        private final i9.z0<ReqT, RespT> f11262d;

        /* renamed from: e  reason: collision with root package name */
        private final i9.r f11263e;

        /* renamed from: f  reason: collision with root package name */
        private i9.c f11264f;

        /* renamed from: g  reason: collision with root package name */
        private i9.g<ReqT, RespT> f11265g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends io.grpc.internal.x {

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ g.a f11266k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ i9.j1 f11267l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g.a aVar, i9.j1 j1Var) {
                super(n.this.f11263e);
                this.f11266k = aVar;
                this.f11267l = j1Var;
            }

            @Override // io.grpc.internal.x
            public void a() {
                this.f11266k.a(this.f11267l, new i9.y0());
            }
        }

        n(i9.f0 f0Var, i9.d dVar, Executor executor, i9.z0<ReqT, RespT> z0Var, i9.c cVar) {
            this.f11259a = f0Var;
            this.f11260b = dVar;
            this.f11262d = z0Var;
            executor = cVar.e() != null ? cVar.e() : executor;
            this.f11261c = executor;
            this.f11264f = cVar.n(executor);
            this.f11263e = i9.r.e();
        }

        private void h(g.a<RespT> aVar, i9.j1 j1Var) {
            this.f11261c.execute(new a(aVar, j1Var));
        }

        @Override // i9.z, i9.d1, i9.g
        public void a(String str, Throwable th) {
            i9.g<ReqT, RespT> gVar = this.f11265g;
            if (gVar != null) {
                gVar.a(str, th);
            }
        }

        @Override // i9.z, i9.g
        public void e(g.a<RespT> aVar, i9.y0 y0Var) {
            f0.b a10 = this.f11259a.a(new t1(this.f11262d, y0Var, this.f11264f));
            i9.j1 c10 = a10.c();
            if (!c10.o()) {
                h(aVar, r0.n(c10));
                this.f11265g = g1.f11202u0;
                return;
            }
            i9.h b10 = a10.b();
            j1.b f10 = ((j1) a10.a()).f(this.f11262d);
            if (f10 != null) {
                this.f11264f = this.f11264f.q(j1.b.f11392g, f10);
            }
            this.f11265g = b10 != null ? b10.a(this.f11262d, this.f11264f, this.f11260b) : this.f11260b.e(this.f11262d, this.f11264f);
            this.f11265g.e(aVar, y0Var);
        }

        @Override // i9.z, i9.d1
        protected i9.g<ReqT, RespT> f() {
            return this.f11265g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g1.this.f11222j0 = null;
            g1.this.L0();
        }
    }

    /* loaded from: classes.dex */
    private final class p implements k1.a {
        private p() {
        }

        /* synthetic */ p(g1 g1Var, a aVar) {
            this();
        }

        @Override // io.grpc.internal.k1.a
        public void a() {
            b5.n.u(g1.this.N.get(), "Channel must have been shut down");
            g1.this.P = true;
            g1.this.O0(false);
            g1.this.H0();
            g1.this.I0();
        }

        @Override // io.grpc.internal.k1.a
        public void b(i9.j1 j1Var) {
            b5.n.u(g1.this.N.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.internal.k1.a
        public void c(boolean z10) {
            g1 g1Var = g1.this;
            g1Var.f11220i0.e(g1Var.L, z10);
        }

        @Override // io.grpc.internal.k1.a
        public void d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class q implements Executor {

        /* renamed from: j  reason: collision with root package name */
        private final p1<? extends Executor> f11271j;

        /* renamed from: k  reason: collision with root package name */
        private Executor f11272k;

        q(p1<? extends Executor> p1Var) {
            this.f11271j = (p1) b5.n.o(p1Var, "executorPool");
        }

        synchronized Executor a() {
            if (this.f11272k == null) {
                this.f11272k = (Executor) b5.n.p(this.f11271j.a(), "%s.getObject()", this.f11272k);
            }
            return this.f11272k;
        }

        synchronized void b() {
            Executor executor = this.f11272k;
            if (executor != null) {
                this.f11272k = this.f11271j.b(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a().execute(runnable);
        }
    }

    /* loaded from: classes.dex */
    private final class r extends w0<Object> {
        private r() {
        }

        /* synthetic */ r(g1 g1Var, a aVar) {
            this();
        }

        @Override // io.grpc.internal.w0
        protected void b() {
            g1.this.D0();
        }

        @Override // io.grpc.internal.w0
        protected void c() {
            if (g1.this.N.get()) {
                return;
            }
            g1.this.M0();
        }
    }

    /* loaded from: classes.dex */
    private class s implements Runnable {
        private s() {
        }

        /* synthetic */ s(g1 g1Var, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g1.this.E == null) {
                return;
            }
            g1.this.C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class t extends r0.d {

        /* renamed from: a  reason: collision with root package name */
        j.b f11275a;

        /* loaded from: classes.dex */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g1.this.K0();
            }
        }

        /* loaded from: classes.dex */
        final class b implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ r0.i f11278j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ i9.p f11279k;

            b(r0.i iVar, i9.p pVar) {
                this.f11278j = iVar;
                this.f11279k = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = t.this;
                if (tVar != g1.this.E) {
                    return;
                }
                g1.this.Q0(this.f11278j);
                if (this.f11279k != i9.p.SHUTDOWN) {
                    g1.this.V.b(f.a.INFO, "Entering {0} state with picker: {1}", this.f11279k, this.f11278j);
                    g1.this.f11240y.b(this.f11279k);
                }
            }
        }

        private t() {
        }

        /* synthetic */ t(g1 g1Var, a aVar) {
            this();
        }

        @Override // i9.r0.d
        public i9.f b() {
            return g1.this.V;
        }

        @Override // i9.r0.d
        public ScheduledExecutorService c() {
            return g1.this.f11223k;
        }

        @Override // i9.r0.d
        public i9.n1 d() {
            return g1.this.f11234s;
        }

        @Override // i9.r0.d
        public void e() {
            g1.this.f11234s.e();
            g1.this.f11234s.execute(new a());
        }

        @Override // i9.r0.d
        public void f(i9.p pVar, r0.i iVar) {
            g1.this.f11234s.e();
            b5.n.o(pVar, "newState");
            b5.n.o(iVar, "newPicker");
            g1.this.f11234s.execute(new b(iVar, pVar));
        }

        @Override // i9.r0.d
        /* renamed from: g */
        public io.grpc.internal.e a(r0.b bVar) {
            g1.this.f11234s.e();
            b5.n.u(!g1.this.P, "Channel is being terminated");
            return new y(bVar, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class u extends a1.e {

        /* renamed from: a  reason: collision with root package name */
        final t f11281a;

        /* renamed from: b  reason: collision with root package name */
        final i9.a1 f11282b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i9.j1 f11284j;

            a(i9.j1 j1Var) {
                this.f11284j = j1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                u.this.f(this.f11284j);
            }
        }

        /* loaded from: classes.dex */
        final class b implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ a1.g f11286j;

            b(a1.g gVar) {
                this.f11286j = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 562
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.g1.u.b.run():void");
            }
        }

        u(t tVar, i9.a1 a1Var) {
            this.f11281a = (t) b5.n.o(tVar, "helperImpl");
            this.f11282b = (i9.a1) b5.n.o(a1Var, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(i9.j1 j1Var) {
            g1.f11195n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{g1.this.f(), j1Var});
            g1.this.X.m();
            w wVar = g1.this.Y;
            w wVar2 = w.ERROR;
            if (wVar != wVar2) {
                g1.this.V.b(f.a.WARNING, "Failed to resolve name: {0}", j1Var);
                g1.this.Y = wVar2;
            }
            if (this.f11281a != g1.this.E) {
                return;
            }
            this.f11281a.f11275a.b(j1Var);
            g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            if (g1.this.f11222j0 == null || !g1.this.f11222j0.b()) {
                if (g1.this.f11224k0 == null) {
                    g1 g1Var = g1.this;
                    g1Var.f11224k0 = g1Var.f11241z.get();
                }
                long a10 = g1.this.f11224k0.a();
                g1.this.V.b(f.a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a10));
                g1 g1Var2 = g1.this;
                g1Var2.f11222j0 = g1Var2.f11234s.c(new o(), a10, TimeUnit.NANOSECONDS, g1.this.f11219i.S());
            }
        }

        @Override // i9.a1.e, i9.a1.f
        public void b(i9.j1 j1Var) {
            b5.n.e(!j1Var.o(), "the error status must not be OK");
            g1.this.f11234s.execute(new a(j1Var));
        }

        @Override // i9.a1.e
        public void c(a1.g gVar) {
            g1.this.f11234s.execute(new b(gVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class v extends i9.d {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReference<i9.f0> f11288a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11289b;

        /* renamed from: c  reason: collision with root package name */
        private final i9.d f11290c;

        /* loaded from: classes.dex */
        class a extends i9.d {
            a() {
            }

            @Override // i9.d
            public String b() {
                return v.this.f11289b;
            }

            @Override // i9.d
            public <RequestT, ResponseT> i9.g<RequestT, ResponseT> e(i9.z0<RequestT, ResponseT> z0Var, i9.c cVar) {
                return new io.grpc.internal.p(z0Var, g1.this.E0(cVar), cVar, g1.this.f11226l0, g1.this.Q ? null : g1.this.f11219i.S(), g1.this.T, null).C(g1.this.f11235t).B(g1.this.f11236u).A(g1.this.f11237v);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (g1.this.I == null) {
                    if (v.this.f11288a.get() == g1.f11201t0) {
                        v.this.f11288a.set(null);
                    }
                    g1.this.M.b(g1.f11198q0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public final class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (v.this.f11288a.get() == g1.f11201t0) {
                    v.this.f11288a.set(null);
                }
                if (g1.this.I != null) {
                    for (g gVar : g1.this.I) {
                        gVar.a("Channel is forcefully shutdown", null);
                    }
                }
                g1.this.M.c(g1.f11197p0);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g1.this.D0();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        /* loaded from: classes.dex */
        class e<ReqT, RespT> extends i9.g<ReqT, RespT> {
            e() {
            }

            @Override // i9.g
            public void a(String str, Throwable th) {
            }

            @Override // i9.g
            public void b() {
            }

            @Override // i9.g
            public void c(int i10) {
            }

            @Override // i9.g
            public void d(ReqT reqt) {
            }

            @Override // i9.g
            public void e(g.a<RespT> aVar, i9.y0 y0Var) {
                aVar.a(g1.f11198q0, new i9.y0());
            }
        }

        /* loaded from: classes.dex */
        class f implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ g f11297j;

            f(g gVar) {
                this.f11297j = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (v.this.f11288a.get() != g1.f11201t0) {
                    this.f11297j.r();
                    return;
                }
                if (g1.this.I == null) {
                    g1.this.I = new LinkedHashSet();
                    g1 g1Var = g1.this;
                    g1Var.f11220i0.e(g1Var.J, true);
                }
                g1.this.I.add(this.f11297j);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public final class g<ReqT, RespT> extends io.grpc.internal.z<ReqT, RespT> {

            /* renamed from: l  reason: collision with root package name */
            final i9.r f11299l;

            /* renamed from: m  reason: collision with root package name */
            final i9.z0<ReqT, RespT> f11300m;

            /* renamed from: n  reason: collision with root package name */
            final i9.c f11301n;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public class a implements Runnable {

                /* renamed from: j  reason: collision with root package name */
                final /* synthetic */ Runnable f11303j;

                a(Runnable runnable) {
                    this.f11303j = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f11303j.run();
                    g gVar = g.this;
                    g1.this.f11234s.execute(new b());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* loaded from: classes.dex */
            public final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (g1.this.I != null) {
                        g1.this.I.remove(g.this);
                        if (g1.this.I.isEmpty()) {
                            g1 g1Var = g1.this;
                            g1Var.f11220i0.e(g1Var.J, false);
                            g1.this.I = null;
                            if (g1.this.N.get()) {
                                g1.this.M.b(g1.f11198q0);
                            }
                        }
                    }
                }
            }

            g(i9.r rVar, i9.z0<ReqT, RespT> z0Var, i9.c cVar) {
                super(g1.this.E0(cVar), g1.this.f11223k, cVar.d());
                this.f11299l = rVar;
                this.f11300m = z0Var;
                this.f11301n = cVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // io.grpc.internal.z
            public void j() {
                super.j();
                g1.this.f11234s.execute(new b());
            }

            void r() {
                i9.r b10 = this.f11299l.b();
                try {
                    i9.g<ReqT, RespT> l10 = v.this.l(this.f11300m, this.f11301n);
                    this.f11299l.f(b10);
                    Runnable p10 = p(l10);
                    if (p10 == null) {
                        g1.this.f11234s.execute(new b());
                    } else {
                        g1.this.E0(this.f11301n).execute(new a(p10));
                    }
                } catch (Throwable th) {
                    this.f11299l.f(b10);
                    throw th;
                }
            }
        }

        private v(String str) {
            this.f11288a = new AtomicReference<>(g1.f11201t0);
            this.f11290c = new a();
            this.f11289b = (String) b5.n.o(str, "authority");
        }

        /* synthetic */ v(g1 g1Var, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <ReqT, RespT> i9.g<ReqT, RespT> l(i9.z0<ReqT, RespT> z0Var, i9.c cVar) {
            i9.f0 f0Var = this.f11288a.get();
            if (f0Var != null) {
                if (!(f0Var instanceof j1.c)) {
                    return new n(f0Var, this.f11290c, g1.this.f11225l, z0Var, cVar);
                }
                j1.b f10 = ((j1.c) f0Var).f11399b.f(z0Var);
                if (f10 != null) {
                    cVar = cVar.q(j1.b.f11392g, f10);
                }
            }
            return this.f11290c.e(z0Var, cVar);
        }

        @Override // i9.d
        public String b() {
            return this.f11289b;
        }

        @Override // i9.d
        public <ReqT, RespT> i9.g<ReqT, RespT> e(i9.z0<ReqT, RespT> z0Var, i9.c cVar) {
            if (this.f11288a.get() != g1.f11201t0) {
                return l(z0Var, cVar);
            }
            g1.this.f11234s.execute(new d());
            if (this.f11288a.get() != g1.f11201t0) {
                return l(z0Var, cVar);
            }
            if (g1.this.N.get()) {
                return new e();
            }
            g gVar = new g(i9.r.e(), z0Var, cVar);
            g1.this.f11234s.execute(new f(gVar));
            return gVar;
        }

        void m() {
            if (this.f11288a.get() == g1.f11201t0) {
                p(null);
            }
        }

        void n() {
            g1.this.f11234s.execute(new b());
        }

        void o() {
            g1.this.f11234s.execute(new c());
        }

        void p(i9.f0 f0Var) {
            i9.f0 f0Var2 = this.f11288a.get();
            this.f11288a.set(f0Var);
            if (f0Var2 != g1.f11201t0 || g1.this.I == null) {
                return;
            }
            for (g gVar : g1.this.I) {
                gVar.r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum w {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* loaded from: classes.dex */
    private static final class x implements ScheduledExecutorService {

        /* renamed from: j  reason: collision with root package name */
        final ScheduledExecutorService f11310j;

        private x(ScheduledExecutorService scheduledExecutorService) {
            this.f11310j = (ScheduledExecutorService) b5.n.o(scheduledExecutorService, "delegate");
        }

        /* synthetic */ x(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f11310j.awaitTermination(j10, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f11310j.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f11310j.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return this.f11310j.invokeAll(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f11310j.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
            return (T) this.f11310j.invokeAny(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f11310j.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f11310j.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f11310j.schedule(runnable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
            return this.f11310j.schedule(callable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f11310j.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f11310j.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f11310j.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t10) {
            return this.f11310j.submit(runnable, t10);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f11310j.submit(callable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class y extends io.grpc.internal.e {

        /* renamed from: a  reason: collision with root package name */
        final r0.b f11311a;

        /* renamed from: b  reason: collision with root package name */
        final t f11312b;

        /* renamed from: c  reason: collision with root package name */
        final i9.j0 f11313c;

        /* renamed from: d  reason: collision with root package name */
        final io.grpc.internal.n f11314d;

        /* renamed from: e  reason: collision with root package name */
        final io.grpc.internal.o f11315e;

        /* renamed from: f  reason: collision with root package name */
        List<i9.x> f11316f;

        /* renamed from: g  reason: collision with root package name */
        y0 f11317g;

        /* renamed from: h  reason: collision with root package name */
        boolean f11318h;

        /* renamed from: i  reason: collision with root package name */
        boolean f11319i;

        /* renamed from: j  reason: collision with root package name */
        n1.d f11320j;

        /* loaded from: classes.dex */
        final class a extends y0.j {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ r0.j f11322a;

            a(r0.j jVar) {
                this.f11322a = jVar;
            }

            @Override // io.grpc.internal.y0.j
            void a(y0 y0Var) {
                g1.this.f11220i0.e(y0Var, true);
            }

            @Override // io.grpc.internal.y0.j
            void b(y0 y0Var) {
                g1.this.f11220i0.e(y0Var, false);
            }

            @Override // io.grpc.internal.y0.j
            void c(y0 y0Var, i9.q qVar) {
                b5.n.u(this.f11322a != null, "listener is null");
                this.f11322a.a(qVar);
            }

            @Override // io.grpc.internal.y0.j
            void d(y0 y0Var) {
                g1.this.H.remove(y0Var);
                g1.this.W.k(y0Var);
                g1.this.I0();
            }
        }

        /* loaded from: classes.dex */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                y.this.f11317g.c(g1.f11199r0);
            }
        }

        y(r0.b bVar, t tVar) {
            b5.n.o(bVar, "args");
            this.f11316f = bVar.a();
            if (g1.this.f11207c != null) {
                bVar = bVar.d().e(i(bVar.a())).b();
            }
            this.f11311a = bVar;
            this.f11312b = (t) b5.n.o(tVar, "helper");
            i9.j0 b10 = i9.j0.b("Subchannel", g1.this.b());
            this.f11313c = b10;
            int i10 = g1.this.f11233r;
            long a10 = g1.this.f11232q.a();
            io.grpc.internal.o oVar = new io.grpc.internal.o(b10, i10, a10, "Subchannel for " + bVar.a());
            this.f11315e = oVar;
            this.f11314d = new io.grpc.internal.n(oVar, g1.this.f11232q);
        }

        private List<i9.x> i(List<i9.x> list) {
            ArrayList arrayList = new ArrayList();
            for (i9.x xVar : list) {
                arrayList.add(new i9.x(xVar.a(), xVar.b().d().c(i9.x.f10064d).a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // i9.r0.h
        public List<i9.x> b() {
            g1.this.f11234s.e();
            b5.n.u(this.f11318h, "not started");
            return this.f11316f;
        }

        @Override // i9.r0.h
        public i9.a c() {
            return this.f11311a.b();
        }

        @Override // i9.r0.h
        public Object d() {
            b5.n.u(this.f11318h, "Subchannel is not started");
            return this.f11317g;
        }

        @Override // i9.r0.h
        public void e() {
            g1.this.f11234s.e();
            b5.n.u(this.f11318h, "not started");
            this.f11317g.b();
        }

        @Override // i9.r0.h
        public void f() {
            n1.d dVar;
            g1.this.f11234s.e();
            if (this.f11317g == null) {
                this.f11319i = true;
                return;
            }
            if (!this.f11319i) {
                this.f11319i = true;
            } else if (!g1.this.P || (dVar = this.f11320j) == null) {
                return;
            } else {
                dVar.a();
                this.f11320j = null;
            }
            if (g1.this.P) {
                this.f11317g.c(g1.f11198q0);
            } else {
                this.f11320j = g1.this.f11234s.c(new d1(new b()), 5L, TimeUnit.SECONDS, g1.this.f11219i.S());
            }
        }

        @Override // i9.r0.h
        public void g(r0.j jVar) {
            g1.this.f11234s.e();
            b5.n.u(!this.f11318h, "already started");
            b5.n.u(!this.f11319i, "already shutdown");
            b5.n.u(!g1.this.P, "Channel is being terminated");
            this.f11318h = true;
            y0 y0Var = new y0(this.f11311a.a(), g1.this.b(), g1.this.B, g1.this.f11241z, g1.this.f11219i, g1.this.f11219i.S(), g1.this.f11238w, g1.this.f11234s, new a(jVar), g1.this.W, g1.this.S.a(), this.f11315e, this.f11313c, this.f11314d);
            g1.this.U.e(new e0.a().b("Child Subchannel started").c(e0.b.CT_INFO).e(g1.this.f11232q.a()).d(y0Var).a());
            this.f11317g = y0Var;
            g1.this.W.e(y0Var);
            g1.this.H.add(y0Var);
        }

        @Override // i9.r0.h
        public void h(List<i9.x> list) {
            g1.this.f11234s.e();
            this.f11316f = list;
            if (g1.this.f11207c != null) {
                list = i(list);
            }
            this.f11317g.U(list);
        }

        public String toString() {
            return this.f11313c.toString();
        }
    }

    /* loaded from: classes.dex */
    private final class z {

        /* renamed from: a  reason: collision with root package name */
        final Object f11325a;

        /* renamed from: b  reason: collision with root package name */
        Collection<io.grpc.internal.q> f11326b;

        /* renamed from: c  reason: collision with root package name */
        i9.j1 f11327c;

        private z() {
            this.f11325a = new Object();
            this.f11326b = new HashSet();
        }

        /* synthetic */ z(g1 g1Var, a aVar) {
            this();
        }

        i9.j1 a(z1<?> z1Var) {
            synchronized (this.f11325a) {
                i9.j1 j1Var = this.f11327c;
                if (j1Var != null) {
                    return j1Var;
                }
                this.f11326b.add(z1Var);
                return null;
            }
        }

        void b(i9.j1 j1Var) {
            synchronized (this.f11325a) {
                if (this.f11327c != null) {
                    return;
                }
                this.f11327c = j1Var;
                boolean isEmpty = this.f11326b.isEmpty();
                if (isEmpty) {
                    g1.this.L.c(j1Var);
                }
            }
        }

        void c(i9.j1 j1Var) {
            ArrayList<io.grpc.internal.q> arrayList;
            b(j1Var);
            synchronized (this.f11325a) {
                arrayList = new ArrayList(this.f11326b);
            }
            for (io.grpc.internal.q qVar : arrayList) {
                qVar.a(j1Var);
            }
            g1.this.L.g(j1Var);
        }

        void d(z1<?> z1Var) {
            i9.j1 j1Var;
            synchronized (this.f11325a) {
                this.f11326b.remove(z1Var);
                if (this.f11326b.isEmpty()) {
                    j1Var = this.f11327c;
                    this.f11326b = new HashSet();
                } else {
                    j1Var = null;
                }
            }
            if (j1Var != null) {
                g1.this.L.c(j1Var);
            }
        }
    }

    static {
        i9.j1 j1Var = i9.j1.f9938u;
        f11197p0 = j1Var.q("Channel shutdownNow invoked");
        f11198q0 = j1Var.q("Channel shutdown invoked");
        f11199r0 = j1Var.q("Subchannel shutdown invoked");
        f11200s0 = j1.a();
        f11201t0 = new a();
        f11202u0 = new l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(h1 h1Var, io.grpc.internal.t tVar, k.a aVar, p1<? extends Executor> p1Var, b5.t<b5.r> tVar2, List<i9.h> list, l2 l2Var) {
        a aVar2;
        i9.n1 n1Var = new i9.n1(new j());
        this.f11234s = n1Var;
        this.f11240y = new io.grpc.internal.w();
        this.H = new HashSet(16, 0.75f);
        this.J = new Object();
        this.K = new HashSet(1, 0.75f);
        this.M = new z(this, null);
        this.N = new AtomicBoolean(false);
        this.R = new CountDownLatch(1);
        this.Y = w.NO_RESOLUTION;
        this.Z = f11200s0;
        this.f11206b0 = false;
        this.f11210d0 = new z1.t();
        p pVar = new p(this, null);
        this.f11218h0 = pVar;
        this.f11220i0 = new r(this, null);
        this.f11226l0 = new m(this, null);
        String str = (String) b5.n.o(h1Var.f11341f, "target");
        this.f11205b = str;
        i9.j0 b10 = i9.j0.b("Channel", str);
        this.f11203a = b10;
        this.f11232q = (l2) b5.n.o(l2Var, "timeProvider");
        p1<? extends Executor> p1Var2 = (p1) b5.n.o(h1Var.f11336a, "executorPool");
        this.f11227m = p1Var2;
        Executor executor = (Executor) b5.n.o(p1Var2.a(), "executor");
        this.f11225l = executor;
        this.f11217h = tVar;
        q qVar = new q((p1) b5.n.o(h1Var.f11337b, "offloadExecutorPool"));
        this.f11231p = qVar;
        io.grpc.internal.l lVar = new io.grpc.internal.l(tVar, h1Var.f11342g, qVar);
        this.f11219i = lVar;
        this.f11221j = new io.grpc.internal.l(tVar, null, qVar);
        x xVar = new x(lVar.S(), null);
        this.f11223k = xVar;
        this.f11233r = h1Var.f11357v;
        int i10 = h1Var.f11357v;
        long a10 = l2Var.a();
        io.grpc.internal.o oVar = new io.grpc.internal.o(b10, i10, a10, "Channel for '" + str + "'");
        this.U = oVar;
        io.grpc.internal.n nVar = new io.grpc.internal.n(oVar, l2Var);
        this.V = nVar;
        i9.g1 g1Var = h1Var.f11360y;
        g1Var = g1Var == null ? r0.f11587q : g1Var;
        boolean z10 = h1Var.f11355t;
        this.f11216g0 = z10;
        io.grpc.internal.j jVar = new io.grpc.internal.j(h1Var.f11346k);
        this.f11215g = jVar;
        this.f11209d = h1Var.f11339d;
        b2 b2Var = new b2(z10, h1Var.f11351p, h1Var.f11352q, jVar);
        String str2 = h1Var.f11345j;
        this.f11207c = str2;
        a1.b a11 = a1.b.f().c(h1Var.e()).f(g1Var).i(n1Var).g(xVar).h(b2Var).b(nVar).d(qVar).e(str2).a();
        this.f11213f = a11;
        a1.d dVar = h1Var.f11340e;
        this.f11211e = dVar;
        this.C = G0(str, str2, dVar, a11);
        this.f11229n = (p1) b5.n.o(p1Var, "balancerRpcExecutorPool");
        this.f11230o = new q(p1Var);
        a0 a0Var = new a0(executor, n1Var);
        this.L = a0Var;
        a0Var.d(pVar);
        this.f11241z = aVar;
        Map<String, ?> map = h1Var.f11358w;
        if (map != null) {
            a1.c a12 = b2Var.a(map);
            b5.n.w(a12.d() == null, "Default config is invalid: %s", a12.d());
            j1 j1Var = (j1) a12.c();
            this.f11204a0 = j1Var;
            this.Z = j1Var;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f11204a0 = null;
        }
        boolean z11 = h1Var.f11359x;
        this.f11208c0 = z11;
        v vVar = new v(this, this.C.a(), aVar2);
        this.X = vVar;
        this.A = i9.j.a(vVar, list);
        this.f11238w = (b5.t) b5.n.o(tVar2, "stopwatchSupplier");
        long j10 = h1Var.f11350o;
        if (j10 != -1) {
            b5.n.i(j10 >= h1.J, "invalid idleTimeoutMillis %s", j10);
            j10 = h1Var.f11350o;
        }
        this.f11239x = j10;
        this.f11228m0 = new y1(new s(this, null), n1Var, lVar.S(), tVar2.get());
        this.f11235t = h1Var.f11347l;
        this.f11236u = (i9.v) b5.n.o(h1Var.f11348m, "decompressorRegistry");
        this.f11237v = (i9.o) b5.n.o(h1Var.f11349n, "compressorRegistry");
        this.B = h1Var.f11344i;
        this.f11214f0 = h1Var.f11353r;
        this.f11212e0 = h1Var.f11354s;
        c cVar = new c(l2Var);
        this.S = cVar;
        this.T = cVar.a();
        i9.d0 d0Var = (i9.d0) b5.n.n(h1Var.f11356u);
        this.W = d0Var;
        d0Var.d(this);
        if (z11) {
            return;
        }
        if (this.f11204a0 != null) {
            nVar.a(f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f11206b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(boolean z10) {
        this.f11228m0.i(z10);
    }

    private void B0() {
        this.f11234s.e();
        n1.d dVar = this.f11222j0;
        if (dVar != null) {
            dVar.a();
            this.f11222j0 = null;
            this.f11224k0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        O0(true);
        this.L.r(null);
        this.V.a(f.a.INFO, "Entering IDLE state");
        this.f11240y.b(i9.p.IDLE);
        if (this.f11220i0.a(this.J, this.L)) {
            D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor E0(i9.c cVar) {
        Executor e10 = cVar.e();
        return e10 == null ? this.f11225l : e10;
    }

    private static i9.a1 F0(String str, a1.d dVar, a1.b bVar) {
        URI uri;
        i9.a1 b10;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e10) {
            sb.append(e10.getMessage());
            uri = null;
        }
        if (uri == null || (b10 = dVar.b(uri, bVar)) == null) {
            String str2 = "";
            if (!f11196o0.matcher(str).matches()) {
                try {
                    i9.a1 b11 = dVar.b(new URI(dVar.a(), "", "/" + str, null), bVar);
                    if (b11 != null) {
                        return b11;
                    }
                } catch (URISyntaxException e11) {
                    throw new IllegalArgumentException(e11);
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            objArr[1] = str2;
            throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
        }
        return b10;
    }

    static i9.a1 G0(String str, String str2, a1.d dVar, a1.b bVar) {
        i9.a1 F0 = F0(str, dVar, bVar);
        return str2 == null ? F0 : new k(F0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() {
        if (this.O) {
            for (y0 y0Var : this.H) {
                y0Var.g(f11197p0);
            }
            for (q1 q1Var : this.K) {
                q1Var.o().g(f11197p0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        if (!this.Q && this.N.get() && this.H.isEmpty() && this.K.isEmpty()) {
            this.V.a(f.a.INFO, "Terminated");
            this.W.j(this);
            this.f11227m.b(this.f11225l);
            this.f11230o.b();
            this.f11231p.b();
            this.f11219i.close();
            this.Q = true;
            this.R.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        this.f11234s.e();
        B0();
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0() {
        this.f11234s.e();
        if (this.D) {
            this.C.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0() {
        long j10 = this.f11239x;
        if (j10 == -1) {
            return;
        }
        this.f11228m0.k(j10, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(boolean z10) {
        this.f11234s.e();
        if (z10) {
            b5.n.u(this.D, "nameResolver is not started");
            b5.n.u(this.E != null, "lbHelper is null");
        }
        if (this.C != null) {
            B0();
            this.C.c();
            this.D = false;
            if (z10) {
                this.C = G0(this.f11205b, this.f11207c, this.f11211e, this.f11213f);
            } else {
                this.C = null;
            }
        }
        t tVar = this.E;
        if (tVar != null) {
            tVar.f11275a.d();
            this.E = null;
        }
        this.F = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(r0.i iVar) {
        this.F = iVar;
        this.L.r(iVar);
    }

    void D0() {
        this.f11234s.e();
        if (this.N.get() || this.G) {
            return;
        }
        if (this.f11220i0.d()) {
            A0(false);
        } else {
            M0();
        }
        if (this.E != null) {
            return;
        }
        this.V.a(f.a.INFO, "Exiting idle mode");
        t tVar = new t(this, null);
        tVar.f11275a = this.f11215g.e(tVar);
        this.E = tVar;
        this.C.d(new u(tVar, this.C));
        this.D = true;
    }

    void J0(Throwable th) {
        if (this.G) {
            return;
        }
        this.G = true;
        A0(true);
        O0(false);
        Q0(new e(th));
        this.X.p(null);
        this.V.a(f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f11240y.b(i9.p.TRANSIENT_FAILURE);
    }

    @Override // i9.u0
    /* renamed from: N0 */
    public g1 m() {
        this.V.a(f.a.DEBUG, "shutdown() called");
        if (this.N.compareAndSet(false, true)) {
            this.f11234s.execute(new h());
            this.X.n();
            this.f11234s.execute(new b());
            return this;
        }
        return this;
    }

    @Override // i9.u0
    /* renamed from: P0 */
    public g1 n() {
        this.V.a(f.a.DEBUG, "shutdownNow() called");
        m();
        this.X.o();
        this.f11234s.execute(new i());
        return this;
    }

    @Override // i9.d
    public String b() {
        return this.A.b();
    }

    @Override // i9.d
    public <ReqT, RespT> i9.g<ReqT, RespT> e(i9.z0<ReqT, RespT> z0Var, i9.c cVar) {
        return this.A.e(z0Var, cVar);
    }

    @Override // i9.p0
    public i9.j0 f() {
        return this.f11203a;
    }

    @Override // i9.u0
    public boolean i(long j10, TimeUnit timeUnit) {
        return this.R.await(j10, timeUnit);
    }

    @Override // i9.u0
    public void j() {
        this.f11234s.execute(new f());
    }

    @Override // i9.u0
    public i9.p k(boolean z10) {
        i9.p a10 = this.f11240y.a();
        if (z10 && a10 == i9.p.IDLE) {
            this.f11234s.execute(new g());
        }
        return a10;
    }

    @Override // i9.u0
    public void l(i9.p pVar, Runnable runnable) {
        this.f11234s.execute(new d(runnable, pVar));
    }

    public String toString() {
        return b5.h.c(this).c("logId", this.f11203a.d()).d("target", this.f11205b).toString();
    }
}
