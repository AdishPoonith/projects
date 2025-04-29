package io.grpc.internal;

import i9.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class z<ReqT, RespT> extends i9.g<ReqT, RespT> {

    /* renamed from: j  reason: collision with root package name */
    private static final Logger f11780j = Logger.getLogger(z.class.getName());

    /* renamed from: k  reason: collision with root package name */
    private static final i9.g<Object, Object> f11781k = new i();

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledFuture<?> f11782a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11783b;

    /* renamed from: c  reason: collision with root package name */
    private final i9.r f11784c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f11785d;

    /* renamed from: e  reason: collision with root package name */
    private g.a<RespT> f11786e;

    /* renamed from: f  reason: collision with root package name */
    private i9.g<ReqT, RespT> f11787f;

    /* renamed from: g  reason: collision with root package name */
    private i9.j1 f11788g;

    /* renamed from: h  reason: collision with root package name */
    private List<Runnable> f11789h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private k<RespT> f11790i;

    /* loaded from: classes.dex */
    class a extends x {
        a(i9.r rVar) {
            super(rVar);
        }

        @Override // io.grpc.internal.x
        public void a() {
            z.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ StringBuilder f11792j;

        b(StringBuilder sb) {
            this.f11792j = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.k(i9.j1.f9927j.q(this.f11792j.toString()), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends x {

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ k f11794k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(z.this.f11784c);
            this.f11794k = kVar;
        }

        @Override // io.grpc.internal.x
        public void a() {
            this.f11794k.g();
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ g.a f11796j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ i9.y0 f11797k;

        d(g.a aVar, i9.y0 y0Var) {
            this.f11796j = aVar;
            this.f11797k = y0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f11787f.e(this.f11796j, this.f11797k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.j1 f11799j;

        e(i9.j1 j1Var) {
            this.f11799j = j1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f11787f.a(this.f11799j.n(), this.f11799j.l());
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Object f11801j;

        f(Object obj) {
            this.f11801j = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            z.this.f11787f.d(this.f11801j);
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11803j;

        g(int i10) {
            this.f11803j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f11787f.c(this.f11803j);
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f11787f.b();
        }
    }

    /* loaded from: classes.dex */
    class i extends i9.g<Object, Object> {
        i() {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class j extends x {

        /* renamed from: k  reason: collision with root package name */
        final g.a<RespT> f11806k;

        /* renamed from: l  reason: collision with root package name */
        final i9.j1 f11807l;

        j(g.a<RespT> aVar, i9.j1 j1Var) {
            super(z.this.f11784c);
            this.f11806k = aVar;
            this.f11807l = j1Var;
        }

        @Override // io.grpc.internal.x
        public void a() {
            this.f11806k.a(this.f11807l, new i9.y0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class k<RespT> extends g.a<RespT> {

        /* renamed from: a  reason: collision with root package name */
        private final g.a<RespT> f11809a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f11810b;

        /* renamed from: c  reason: collision with root package name */
        private List<Runnable> f11811c = new ArrayList();

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i9.y0 f11812j;

            a(i9.y0 y0Var) {
                this.f11812j = y0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f11809a.b(this.f11812j);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ Object f11814j;

            b(Object obj) {
                this.f11814j = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f11809a.c(this.f11814j);
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i9.j1 f11816j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ i9.y0 f11817k;

            c(i9.j1 j1Var, i9.y0 y0Var) {
                this.f11816j = j1Var;
                this.f11817k = y0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f11809a.a(this.f11816j, this.f11817k);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f11809a.d();
            }
        }

        public k(g.a<RespT> aVar) {
            this.f11809a = aVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (this.f11810b) {
                    runnable.run();
                } else {
                    this.f11811c.add(runnable);
                }
            }
        }

        @Override // i9.g.a
        public void a(i9.j1 j1Var, i9.y0 y0Var) {
            f(new c(j1Var, y0Var));
        }

        @Override // i9.g.a
        public void b(i9.y0 y0Var) {
            if (this.f11810b) {
                this.f11809a.b(y0Var);
            } else {
                f(new a(y0Var));
            }
        }

        @Override // i9.g.a
        public void c(RespT respt) {
            if (this.f11810b) {
                this.f11809a.c(respt);
            } else {
                f(new b(respt));
            }
        }

        @Override // i9.g.a
        public void d() {
            if (this.f11810b) {
                this.f11809a.d();
            } else {
                f(new d());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            List<Runnable> list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f11811c.isEmpty()) {
                        this.f11811c = null;
                        this.f11810b = true;
                        return;
                    }
                    list = this.f11811c;
                    this.f11811c = arrayList;
                }
                for (Runnable runnable : list) {
                    runnable.run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z(Executor executor, ScheduledExecutorService scheduledExecutorService, i9.t tVar) {
        this.f11783b = (Executor) b5.n.o(executor, "callExecutor");
        b5.n.o(scheduledExecutorService, "scheduler");
        this.f11784c = i9.r.e();
        this.f11782a = o(scheduledExecutorService, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void k(i9.j1 j1Var, boolean z10) {
        boolean z11;
        g.a<RespT> aVar;
        synchronized (this) {
            if (this.f11787f == null) {
                q(f11781k);
                z11 = false;
                aVar = this.f11786e;
                this.f11788g = j1Var;
            } else if (z10) {
                return;
            } else {
                z11 = true;
                aVar = null;
            }
            if (z11) {
                l(new e(j1Var));
            } else {
                if (aVar != null) {
                    this.f11783b.execute(new j(aVar, j1Var));
                }
                m();
            }
            j();
        }
    }

    private void l(Runnable runnable) {
        synchronized (this) {
            if (this.f11785d) {
                runnable.run();
            } else {
                this.f11789h.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f11789h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f11789h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f11785d = r0     // Catch: java.lang.Throwable -> L42
            io.grpc.internal.z$k<RespT> r0 = r3.f11790i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f11783b
            io.grpc.internal.z$c r2 = new io.grpc.internal.z$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.f11789h     // Catch: java.lang.Throwable -> L42
            r3.f11789h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z.m():void");
    }

    private boolean n(i9.t tVar, i9.t tVar2) {
        if (tVar2 == null) {
            return true;
        }
        if (tVar == null) {
            return false;
        }
        return tVar.l(tVar2);
    }

    private ScheduledFuture<?> o(ScheduledExecutorService scheduledExecutorService, i9.t tVar) {
        String str;
        i9.t g10 = this.f11784c.g();
        if (tVar == null && g10 == null) {
            return null;
        }
        long p10 = tVar != null ? tVar.p(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (g10 != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (g10.p(timeUnit) < p10) {
                p10 = g10.p(timeUnit);
                Logger logger = f11780j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(p10)));
                    sb.append(tVar == null ? " Explicit call timeout was not set." : String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(tVar.p(timeUnit))));
                    logger.fine(sb.toString());
                }
            }
        }
        long abs = Math.abs(p10);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1L);
        long abs2 = Math.abs(p10) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        String str2 = n(g10, tVar) ? "Context" : "CallOptions";
        if (p10 < 0) {
            sb2.append("ClientCall started after ");
            sb2.append(str2);
            str = " deadline was exceeded. Deadline has been exceeded for ";
        } else {
            sb2.append("Deadline ");
            sb2.append(str2);
            str = " will be exceeded in ";
        }
        sb2.append(str);
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new b(sb2), p10, TimeUnit.NANOSECONDS);
    }

    private void q(i9.g<ReqT, RespT> gVar) {
        i9.g<ReqT, RespT> gVar2 = this.f11787f;
        b5.n.w(gVar2 == null, "realCall already set to %s", gVar2);
        ScheduledFuture<?> scheduledFuture = this.f11782a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f11787f = gVar;
    }

    @Override // i9.g
    public final void a(String str, Throwable th) {
        i9.j1 j1Var = i9.j1.f9924g;
        if (str == null) {
            str = "Call cancelled without message";
        }
        i9.j1 q10 = j1Var.q(str);
        if (th != null) {
            q10 = q10.p(th);
        }
        k(q10, false);
    }

    @Override // i9.g
    public final void b() {
        l(new h());
    }

    @Override // i9.g
    public final void c(int i10) {
        if (this.f11785d) {
            this.f11787f.c(i10);
        } else {
            l(new g(i10));
        }
    }

    @Override // i9.g
    public final void d(ReqT reqt) {
        if (this.f11785d) {
            this.f11787f.d(reqt);
        } else {
            l(new f(reqt));
        }
    }

    @Override // i9.g
    public final void e(g.a<RespT> aVar, i9.y0 y0Var) {
        i9.j1 j1Var;
        boolean z10;
        b5.n.u(this.f11786e == null, "already started");
        synchronized (this) {
            this.f11786e = (g.a) b5.n.o(aVar, "listener");
            j1Var = this.f11788g;
            z10 = this.f11785d;
            if (!z10) {
                k<RespT> kVar = new k<>(aVar);
                this.f11790i = kVar;
                aVar = kVar;
            }
        }
        if (j1Var != null) {
            this.f11783b.execute(new j(aVar, j1Var));
        } else if (z10) {
            this.f11787f.e(aVar, y0Var);
        } else {
            l(new d(aVar, y0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
    }

    public final Runnable p(i9.g<ReqT, RespT> gVar) {
        synchronized (this) {
            if (this.f11787f != null) {
                return null;
            }
            q((i9.g) b5.n.o(gVar, "call"));
            return new a(this.f11784c);
        }
    }

    public String toString() {
        return b5.h.c(this).d("realCall", this.f11787f).toString();
    }
}
