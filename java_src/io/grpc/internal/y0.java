package io.grpc.internal;

import i9.f;
import i9.n1;
import io.grpc.internal.k;
import io.grpc.internal.k1;
import io.grpc.internal.r;
import io.grpc.internal.t;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y0 implements i9.i0<Object>, n2 {

    /* renamed from: a  reason: collision with root package name */
    private final i9.j0 f11714a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11715b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11716c;

    /* renamed from: d  reason: collision with root package name */
    private final k.a f11717d;

    /* renamed from: e  reason: collision with root package name */
    private final j f11718e;

    /* renamed from: f  reason: collision with root package name */
    private final t f11719f;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f11720g;

    /* renamed from: h  reason: collision with root package name */
    private final i9.d0 f11721h;

    /* renamed from: i  reason: collision with root package name */
    private final io.grpc.internal.m f11722i;

    /* renamed from: j  reason: collision with root package name */
    private final o f11723j;

    /* renamed from: k  reason: collision with root package name */
    private final i9.f f11724k;

    /* renamed from: l  reason: collision with root package name */
    private final i9.n1 f11725l;

    /* renamed from: m  reason: collision with root package name */
    private final k f11726m;

    /* renamed from: n  reason: collision with root package name */
    private volatile List<i9.x> f11727n;

    /* renamed from: o  reason: collision with root package name */
    private io.grpc.internal.k f11728o;

    /* renamed from: p  reason: collision with root package name */
    private final b5.r f11729p;

    /* renamed from: q  reason: collision with root package name */
    private n1.d f11730q;

    /* renamed from: r  reason: collision with root package name */
    private n1.d f11731r;

    /* renamed from: s  reason: collision with root package name */
    private k1 f11732s;

    /* renamed from: v  reason: collision with root package name */
    private v f11735v;

    /* renamed from: w  reason: collision with root package name */
    private volatile k1 f11736w;

    /* renamed from: y  reason: collision with root package name */
    private i9.j1 f11738y;

    /* renamed from: t  reason: collision with root package name */
    private final Collection<v> f11733t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    private final w0<v> f11734u = new a();

    /* renamed from: x  reason: collision with root package name */
    private volatile i9.q f11737x = i9.q.a(i9.p.IDLE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends w0<v> {
        a() {
        }

        @Override // io.grpc.internal.w0
        protected void b() {
            y0.this.f11718e.a(y0.this);
        }

        @Override // io.grpc.internal.w0
        protected void c() {
            y0.this.f11718e.b(y0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y0.this.f11730q = null;
            y0.this.f11724k.a(f.a.INFO, "CONNECTING after backoff");
            y0.this.N(i9.p.CONNECTING);
            y0.this.T();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y0.this.f11737x.c() == i9.p.IDLE) {
                y0.this.f11724k.a(f.a.INFO, "CONNECTING as requested");
                y0.this.N(i9.p.CONNECTING);
                y0.this.T();
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ List f11742j;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k1 k1Var = y0.this.f11732s;
                y0.this.f11731r = null;
                y0.this.f11732s = null;
                k1Var.c(i9.j1.f9938u.q("InternalSubchannel closed transport due to address change"));
            }
        }

        d(List list) {
            this.f11742j = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r0 = io.grpc.internal.y0.I(r0)
                java.net.SocketAddress r0 = r0.a()
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r1 = io.grpc.internal.y0.I(r1)
                java.util.List r2 = r7.f11742j
                r1.h(r2)
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                java.util.List r2 = r7.f11742j
                io.grpc.internal.y0.J(r1, r2)
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                i9.q r1 = io.grpc.internal.y0.i(r1)
                i9.p r1 = r1.c()
                i9.p r2 = i9.p.READY
                r3 = 0
                if (r1 == r2) goto L39
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                i9.q r1 = io.grpc.internal.y0.i(r1)
                i9.p r1 = r1.c()
                i9.p r4 = i9.p.CONNECTING
                if (r1 != r4) goto L91
            L39:
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r1 = io.grpc.internal.y0.I(r1)
                boolean r0 = r1.g(r0)
                if (r0 != 0) goto L91
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                i9.q r0 = io.grpc.internal.y0.i(r0)
                i9.p r0 = r0.c()
                if (r0 != r2) goto L6d
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.k1 r0 = io.grpc.internal.y0.j(r0)
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0.k(r1, r3)
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r1 = io.grpc.internal.y0.I(r1)
                r1.f()
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                i9.p r2 = i9.p.IDLE
                io.grpc.internal.y0.E(r1, r2)
                goto L92
            L6d:
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.v r0 = io.grpc.internal.y0.l(r0)
                i9.j1 r1 = i9.j1.f9938u
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                i9.j1 r1 = r1.q(r2)
                r0.c(r1)
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.y0.m(r0, r3)
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.y0$k r0 = io.grpc.internal.y0.I(r0)
                r0.f()
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                io.grpc.internal.y0.F(r0)
            L91:
                r0 = r3
            L92:
                if (r0 == 0) goto Le1
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                i9.n1$d r1 = io.grpc.internal.y0.n(r1)
                if (r1 == 0) goto Lc0
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.k1 r1 = io.grpc.internal.y0.p(r1)
                i9.j1 r2 = i9.j1.f9938u
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                i9.j1 r2 = r2.q(r4)
                r1.c(r2)
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                i9.n1$d r1 = io.grpc.internal.y0.n(r1)
                r1.a()
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0.o(r1, r3)
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0.q(r1, r3)
            Lc0:
                io.grpc.internal.y0 r1 = io.grpc.internal.y0.this
                io.grpc.internal.y0.q(r1, r0)
                io.grpc.internal.y0 r0 = io.grpc.internal.y0.this
                i9.n1 r1 = io.grpc.internal.y0.s(r0)
                io.grpc.internal.y0$d$a r2 = new io.grpc.internal.y0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.internal.y0 r6 = io.grpc.internal.y0.this
                java.util.concurrent.ScheduledExecutorService r6 = io.grpc.internal.y0.r(r6)
                i9.n1$d r1 = r1.c(r2, r3, r5, r6)
                io.grpc.internal.y0.o(r0, r1)
            Le1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y0.d.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.j1 f11745j;

        e(i9.j1 j1Var) {
            this.f11745j = j1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            i9.p c10 = y0.this.f11737x.c();
            i9.p pVar = i9.p.SHUTDOWN;
            if (c10 == pVar) {
                return;
            }
            y0.this.f11738y = this.f11745j;
            k1 k1Var = y0.this.f11736w;
            v vVar = y0.this.f11735v;
            y0.this.f11736w = null;
            y0.this.f11735v = null;
            y0.this.N(pVar);
            y0.this.f11726m.f();
            if (y0.this.f11733t.isEmpty()) {
                y0.this.P();
            }
            y0.this.K();
            if (y0.this.f11731r != null) {
                y0.this.f11731r.a();
                y0.this.f11732s.c(this.f11745j);
                y0.this.f11731r = null;
                y0.this.f11732s = null;
            }
            if (k1Var != null) {
                k1Var.c(this.f11745j);
            }
            if (vVar != null) {
                vVar.c(this.f11745j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y0.this.f11724k.a(f.a.INFO, "Terminated");
            y0.this.f11718e.d(y0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ v f11748j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f11749k;

        g(v vVar, boolean z10) {
            this.f11748j = vVar;
            this.f11749k = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            y0.this.f11734u.e(this.f11748j, this.f11749k);
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.j1 f11751j;

        h(i9.j1 j1Var) {
            this.f11751j = j1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (k1 k1Var : new ArrayList(y0.this.f11733t)) {
                k1Var.g(this.f11751j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class i extends k0 {

        /* renamed from: a  reason: collision with root package name */
        private final v f11753a;

        /* renamed from: b  reason: collision with root package name */
        private final io.grpc.internal.m f11754b;

        /* loaded from: classes.dex */
        class a extends i0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f11755a;

            /* renamed from: io.grpc.internal.y0$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0176a extends j0 {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ r f11757a;

                C0176a(r rVar) {
                    this.f11757a = rVar;
                }

                @Override // io.grpc.internal.j0, io.grpc.internal.r
                public void c(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
                    i.this.f11754b.a(j1Var.o());
                    super.c(j1Var, aVar, y0Var);
                }

                @Override // io.grpc.internal.j0
                protected r e() {
                    return this.f11757a;
                }
            }

            a(q qVar) {
                this.f11755a = qVar;
            }

            @Override // io.grpc.internal.i0, io.grpc.internal.q
            public void g(r rVar) {
                i.this.f11754b.b();
                super.g(new C0176a(rVar));
            }

            @Override // io.grpc.internal.i0
            protected q o() {
                return this.f11755a;
            }
        }

        private i(v vVar, io.grpc.internal.m mVar) {
            this.f11753a = vVar;
            this.f11754b = mVar;
        }

        /* synthetic */ i(v vVar, io.grpc.internal.m mVar, a aVar) {
            this(vVar, mVar);
        }

        @Override // io.grpc.internal.k0, io.grpc.internal.s
        public q a(i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar, i9.k[] kVarArr) {
            return new a(super.a(z0Var, y0Var, cVar, kVarArr));
        }

        @Override // io.grpc.internal.k0
        protected v b() {
            return this.f11753a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class j {
        abstract void a(y0 y0Var);

        abstract void b(y0 y0Var);

        abstract void c(y0 y0Var, i9.q qVar);

        abstract void d(y0 y0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        private List<i9.x> f11759a;

        /* renamed from: b  reason: collision with root package name */
        private int f11760b;

        /* renamed from: c  reason: collision with root package name */
        private int f11761c;

        public k(List<i9.x> list) {
            this.f11759a = list;
        }

        public SocketAddress a() {
            return this.f11759a.get(this.f11760b).a().get(this.f11761c);
        }

        public i9.a b() {
            return this.f11759a.get(this.f11760b).b();
        }

        public void c() {
            int i10 = this.f11761c + 1;
            this.f11761c = i10;
            if (i10 >= this.f11759a.get(this.f11760b).a().size()) {
                this.f11760b++;
                this.f11761c = 0;
            }
        }

        public boolean d() {
            return this.f11760b == 0 && this.f11761c == 0;
        }

        public boolean e() {
            return this.f11760b < this.f11759a.size();
        }

        public void f() {
            this.f11760b = 0;
            this.f11761c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            for (int i10 = 0; i10 < this.f11759a.size(); i10++) {
                int indexOf = this.f11759a.get(i10).a().indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f11760b = i10;
                    this.f11761c = indexOf;
                    return true;
                }
            }
            return false;
        }

        public void h(List<i9.x> list) {
            this.f11759a = list;
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l implements k1.a {

        /* renamed from: a  reason: collision with root package name */
        final v f11762a;

        /* renamed from: b  reason: collision with root package name */
        final SocketAddress f11763b;

        /* renamed from: c  reason: collision with root package name */
        boolean f11764c = false;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                y0.this.f11728o = null;
                if (y0.this.f11738y != null) {
                    b5.n.u(y0.this.f11736w == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f11762a.c(y0.this.f11738y);
                    return;
                }
                v vVar = y0.this.f11735v;
                l lVar2 = l.this;
                v vVar2 = lVar2.f11762a;
                if (vVar == vVar2) {
                    y0.this.f11736w = vVar2;
                    y0.this.f11735v = null;
                    y0.this.N(i9.p.READY);
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i9.j1 f11767j;

            b(i9.j1 j1Var) {
                this.f11767j = j1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (y0.this.f11737x.c() == i9.p.SHUTDOWN) {
                    return;
                }
                k1 k1Var = y0.this.f11736w;
                l lVar = l.this;
                if (k1Var == lVar.f11762a) {
                    y0.this.f11736w = null;
                    y0.this.f11726m.f();
                    y0.this.N(i9.p.IDLE);
                    return;
                }
                v vVar = y0.this.f11735v;
                l lVar2 = l.this;
                if (vVar == lVar2.f11762a) {
                    b5.n.w(y0.this.f11737x.c() == i9.p.CONNECTING, "Expected state is CONNECTING, actual state is %s", y0.this.f11737x.c());
                    y0.this.f11726m.c();
                    if (y0.this.f11726m.e()) {
                        y0.this.T();
                        return;
                    }
                    y0.this.f11735v = null;
                    y0.this.f11726m.f();
                    y0.this.S(this.f11767j);
                }
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                y0.this.f11733t.remove(l.this.f11762a);
                if (y0.this.f11737x.c() == i9.p.SHUTDOWN && y0.this.f11733t.isEmpty()) {
                    y0.this.P();
                }
            }
        }

        l(v vVar, SocketAddress socketAddress) {
            this.f11762a = vVar;
            this.f11763b = socketAddress;
        }

        @Override // io.grpc.internal.k1.a
        public void a() {
            b5.n.u(this.f11764c, "transportShutdown() must be called before transportTerminated().");
            y0.this.f11724k.b(f.a.INFO, "{0} Terminated", this.f11762a.f());
            y0.this.f11721h.i(this.f11762a);
            y0.this.Q(this.f11762a, false);
            y0.this.f11725l.execute(new c());
        }

        @Override // io.grpc.internal.k1.a
        public void b(i9.j1 j1Var) {
            y0.this.f11724k.b(f.a.INFO, "{0} SHUTDOWN with {1}", this.f11762a.f(), y0.this.R(j1Var));
            this.f11764c = true;
            y0.this.f11725l.execute(new b(j1Var));
        }

        @Override // io.grpc.internal.k1.a
        public void c(boolean z10) {
            y0.this.Q(this.f11762a, z10);
        }

        @Override // io.grpc.internal.k1.a
        public void d() {
            y0.this.f11724k.a(f.a.INFO, "READY");
            y0.this.f11725l.execute(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class m extends i9.f {

        /* renamed from: a  reason: collision with root package name */
        i9.j0 f11770a;

        m() {
        }

        @Override // i9.f
        public void a(f.a aVar, String str) {
            n.d(this.f11770a, aVar, str);
        }

        @Override // i9.f
        public void b(f.a aVar, String str, Object... objArr) {
            n.e(this.f11770a, aVar, str, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(List<i9.x> list, String str, String str2, k.a aVar, t tVar, ScheduledExecutorService scheduledExecutorService, b5.t<b5.r> tVar2, i9.n1 n1Var, j jVar, i9.d0 d0Var, io.grpc.internal.m mVar, o oVar, i9.j0 j0Var, i9.f fVar) {
        b5.n.o(list, "addressGroups");
        b5.n.e(!list.isEmpty(), "addressGroups is empty");
        L(list, "addressGroups contains null entry");
        List<i9.x> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f11727n = unmodifiableList;
        this.f11726m = new k(unmodifiableList);
        this.f11715b = str;
        this.f11716c = str2;
        this.f11717d = aVar;
        this.f11719f = tVar;
        this.f11720g = scheduledExecutorService;
        this.f11729p = tVar2.get();
        this.f11725l = n1Var;
        this.f11718e = jVar;
        this.f11721h = d0Var;
        this.f11722i = mVar;
        this.f11723j = (o) b5.n.o(oVar, "channelTracer");
        this.f11714a = (i9.j0) b5.n.o(j0Var, "logId");
        this.f11724k = (i9.f) b5.n.o(fVar, "channelLogger");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        this.f11725l.e();
        n1.d dVar = this.f11730q;
        if (dVar != null) {
            dVar.a();
            this.f11730q = null;
            this.f11728o = null;
        }
    }

    private static void L(List<?> list, String str) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            b5.n.o(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(i9.p pVar) {
        this.f11725l.e();
        O(i9.q.a(pVar));
    }

    private void O(i9.q qVar) {
        this.f11725l.e();
        if (this.f11737x.c() != qVar.c()) {
            boolean z10 = this.f11737x.c() != i9.p.SHUTDOWN;
            b5.n.u(z10, "Cannot transition out of SHUTDOWN to " + qVar);
            this.f11737x = qVar;
            this.f11718e.c(this, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        this.f11725l.execute(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(v vVar, boolean z10) {
        this.f11725l.execute(new g(vVar, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String R(i9.j1 j1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(j1Var.m());
        if (j1Var.n() != null) {
            sb.append("(");
            sb.append(j1Var.n());
            sb.append(")");
        }
        if (j1Var.l() != null) {
            sb.append("[");
            sb.append(j1Var.l());
            sb.append("]");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(i9.j1 j1Var) {
        this.f11725l.e();
        O(i9.q.b(j1Var));
        if (this.f11728o == null) {
            this.f11728o = this.f11717d.get();
        }
        long a10 = this.f11728o.a();
        b5.r rVar = this.f11729p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long d10 = a10 - rVar.d(timeUnit);
        this.f11724k.b(f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", R(j1Var), Long.valueOf(d10));
        b5.n.u(this.f11730q == null, "previous reconnectTask is not done");
        this.f11730q = this.f11725l.c(new b(), d10, timeUnit, this.f11720g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        InetSocketAddress inetSocketAddress;
        i9.c0 c0Var;
        this.f11725l.e();
        b5.n.u(this.f11730q == null, "Should have no reconnectTask scheduled");
        if (this.f11726m.d()) {
            this.f11729p.f().g();
        }
        SocketAddress a10 = this.f11726m.a();
        if (a10 instanceof i9.c0) {
            c0Var = (i9.c0) a10;
            inetSocketAddress = c0Var.c();
        } else {
            inetSocketAddress = a10;
            c0Var = null;
        }
        i9.a b10 = this.f11726m.b();
        String str = (String) b10.b(i9.x.f10064d);
        t.a aVar = new t.a();
        if (str == null) {
            str = this.f11715b;
        }
        t.a g10 = aVar.e(str).f(b10).h(this.f11716c).g(c0Var);
        m mVar = new m();
        mVar.f11770a = f();
        i iVar = new i(this.f11719f.W(inetSocketAddress, g10, mVar), this.f11722i, null);
        mVar.f11770a = iVar.f();
        this.f11721h.c(iVar);
        this.f11735v = iVar;
        this.f11733t.add(iVar);
        Runnable d10 = iVar.d(new l(iVar, inetSocketAddress));
        if (d10 != null) {
            this.f11725l.b(d10);
        }
        this.f11724k.b(f.a.INFO, "Started transport {0}", mVar.f11770a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i9.p M() {
        return this.f11737x.c();
    }

    public void U(List<i9.x> list) {
        b5.n.o(list, "newAddressGroups");
        L(list, "newAddressGroups contains null entry");
        b5.n.e(!list.isEmpty(), "newAddressGroups is empty");
        this.f11725l.execute(new d(Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.internal.n2
    public s b() {
        k1 k1Var = this.f11736w;
        if (k1Var != null) {
            return k1Var;
        }
        this.f11725l.execute(new c());
        return null;
    }

    public void c(i9.j1 j1Var) {
        this.f11725l.execute(new e(j1Var));
    }

    @Override // i9.p0
    public i9.j0 f() {
        return this.f11714a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(i9.j1 j1Var) {
        c(j1Var);
        this.f11725l.execute(new h(j1Var));
    }

    public String toString() {
        return b5.h.c(this).c("logId", this.f11714a.d()).d("addressGroups", this.f11727n).toString();
    }
}
