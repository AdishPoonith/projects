package io.grpc.internal;

import io.grpc.internal.k2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
class b0 implements q {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f11011a;

    /* renamed from: b  reason: collision with root package name */
    private r f11012b;

    /* renamed from: c  reason: collision with root package name */
    private q f11013c;

    /* renamed from: d  reason: collision with root package name */
    private i9.j1 f11014d;

    /* renamed from: f  reason: collision with root package name */
    private o f11016f;

    /* renamed from: g  reason: collision with root package name */
    private long f11017g;

    /* renamed from: h  reason: collision with root package name */
    private long f11018h;

    /* renamed from: e  reason: collision with root package name */
    private List<Runnable> f11015e = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private List<Runnable> f11019i = new ArrayList();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11020j;

        a(int i10) {
            this.f11020j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.b(this.f11020j);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.m();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.n f11023j;

        c(i9.n nVar) {
            this.f11023j = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.c(this.f11023j);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f11025j;

        d(boolean z10) {
            this.f11025j = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.q(this.f11025j);
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.v f11027j;

        e(i9.v vVar) {
            this.f11027j = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.i(this.f11027j);
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11029j;

        f(int i10) {
            this.f11029j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.e(this.f11029j);
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f11031j;

        g(int i10) {
            this.f11031j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.f(this.f11031j);
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.t f11033j;

        h(i9.t tVar) {
            this.f11033j = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.h(this.f11033j);
        }
    }

    /* loaded from: classes.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.t();
        }
    }

    /* loaded from: classes.dex */
    class j implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f11036j;

        j(String str) {
            this.f11036j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.k(this.f11036j);
        }
    }

    /* loaded from: classes.dex */
    class k implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ InputStream f11038j;

        k(InputStream inputStream) {
            this.f11038j = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.j(this.f11038j);
        }
    }

    /* loaded from: classes.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.flush();
        }
    }

    /* loaded from: classes.dex */
    class m implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i9.j1 f11041j;

        m(i9.j1 j1Var) {
            this.f11041j = j1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.a(this.f11041j);
        }
    }

    /* loaded from: classes.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f11013c.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o implements r {

        /* renamed from: a  reason: collision with root package name */
        private final r f11044a;

        /* renamed from: b  reason: collision with root package name */
        private volatile boolean f11045b;

        /* renamed from: c  reason: collision with root package name */
        private List<Runnable> f11046c = new ArrayList();

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ k2.a f11047j;

            a(k2.a aVar) {
                this.f11047j = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f11044a.a(this.f11047j);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f11044a.b();
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i9.y0 f11050j;

            c(i9.y0 y0Var) {
                this.f11050j = y0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f11044a.d(this.f11050j);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i9.j1 f11052j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ r.a f11053k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ i9.y0 f11054l;

            d(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
                this.f11052j = j1Var;
                this.f11053k = aVar;
                this.f11054l = y0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f11044a.c(this.f11052j, this.f11053k, this.f11054l);
            }
        }

        public o(r rVar) {
            this.f11044a = rVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (this.f11045b) {
                    runnable.run();
                } else {
                    this.f11046c.add(runnable);
                }
            }
        }

        @Override // io.grpc.internal.k2
        public void a(k2.a aVar) {
            if (this.f11045b) {
                this.f11044a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        @Override // io.grpc.internal.k2
        public void b() {
            if (this.f11045b) {
                this.f11044a.b();
            } else {
                f(new b());
            }
        }

        @Override // io.grpc.internal.r
        public void c(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
            f(new d(j1Var, aVar, y0Var));
        }

        @Override // io.grpc.internal.r
        public void d(i9.y0 y0Var) {
            f(new c(y0Var));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g() {
            List<Runnable> list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f11046c.isEmpty()) {
                        this.f11046c = null;
                        this.f11045b = true;
                        return;
                    }
                    list = this.f11046c;
                    this.f11046c = arrayList;
                }
                for (Runnable runnable : list) {
                    runnable.run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    private void s(Runnable runnable) {
        b5.n.u(this.f11012b != null, "May only be called after start");
        synchronized (this) {
            if (this.f11011a) {
                runnable.run();
            } else {
                this.f11015e.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0.hasNext() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f11015e     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L1d
            r0 = 0
            r3.f11015e = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            r3.f11011a = r0     // Catch: java.lang.Throwable -> L3b
            io.grpc.internal.b0$o r0 = r3.f11016f     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L1c
            r0.g()
        L1c:
            return
        L1d:
            java.util.List<java.lang.Runnable> r1 = r3.f11015e     // Catch: java.lang.Throwable -> L3b
            r3.f11015e = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r1.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L26
        L36:
            r1.clear()
            r0 = r1
            goto L5
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.t():void");
    }

    private void u(r rVar) {
        for (Runnable runnable : this.f11019i) {
            runnable.run();
        }
        this.f11019i = null;
        this.f11013c.g(rVar);
    }

    private void w(q qVar) {
        q qVar2 = this.f11013c;
        b5.n.w(qVar2 == null, "realStream already set to %s", qVar2);
        this.f11013c = qVar;
        this.f11018h = System.nanoTime();
    }

    @Override // io.grpc.internal.q
    public void a(i9.j1 j1Var) {
        boolean z10 = true;
        b5.n.u(this.f11012b != null, "May only be called after start");
        b5.n.o(j1Var, "reason");
        synchronized (this) {
            if (this.f11013c == null) {
                w(o1.f11494a);
                this.f11014d = j1Var;
                z10 = false;
            }
        }
        if (z10) {
            s(new m(j1Var));
            return;
        }
        t();
        v(j1Var);
        this.f11012b.c(j1Var, r.a.PROCESSED, new i9.y0());
    }

    @Override // io.grpc.internal.j2
    public void b(int i10) {
        b5.n.u(this.f11012b != null, "May only be called after start");
        if (this.f11011a) {
            this.f11013c.b(i10);
        } else {
            s(new a(i10));
        }
    }

    @Override // io.grpc.internal.j2
    public void c(i9.n nVar) {
        b5.n.u(this.f11012b == null, "May only be called before start");
        b5.n.o(nVar, "compressor");
        this.f11019i.add(new c(nVar));
    }

    @Override // io.grpc.internal.j2
    public boolean d() {
        if (this.f11011a) {
            return this.f11013c.d();
        }
        return false;
    }

    @Override // io.grpc.internal.q
    public void e(int i10) {
        b5.n.u(this.f11012b == null, "May only be called before start");
        this.f11019i.add(new f(i10));
    }

    @Override // io.grpc.internal.q
    public void f(int i10) {
        b5.n.u(this.f11012b == null, "May only be called before start");
        this.f11019i.add(new g(i10));
    }

    @Override // io.grpc.internal.j2
    public void flush() {
        b5.n.u(this.f11012b != null, "May only be called after start");
        if (this.f11011a) {
            this.f11013c.flush();
        } else {
            s(new l());
        }
    }

    @Override // io.grpc.internal.q
    public void g(r rVar) {
        i9.j1 j1Var;
        boolean z10;
        b5.n.o(rVar, "listener");
        b5.n.u(this.f11012b == null, "already started");
        synchronized (this) {
            j1Var = this.f11014d;
            z10 = this.f11011a;
            if (!z10) {
                o oVar = new o(rVar);
                this.f11016f = oVar;
                rVar = oVar;
            }
            this.f11012b = rVar;
            this.f11017g = System.nanoTime();
        }
        if (j1Var != null) {
            rVar.c(j1Var, r.a.PROCESSED, new i9.y0());
        } else if (z10) {
            u(rVar);
        }
    }

    @Override // io.grpc.internal.q
    public void h(i9.t tVar) {
        b5.n.u(this.f11012b == null, "May only be called before start");
        this.f11019i.add(new h(tVar));
    }

    @Override // io.grpc.internal.q
    public void i(i9.v vVar) {
        b5.n.u(this.f11012b == null, "May only be called before start");
        b5.n.o(vVar, "decompressorRegistry");
        this.f11019i.add(new e(vVar));
    }

    @Override // io.grpc.internal.j2
    public void j(InputStream inputStream) {
        b5.n.u(this.f11012b != null, "May only be called after start");
        b5.n.o(inputStream, "message");
        if (this.f11011a) {
            this.f11013c.j(inputStream);
        } else {
            s(new k(inputStream));
        }
    }

    @Override // io.grpc.internal.q
    public void k(String str) {
        b5.n.u(this.f11012b == null, "May only be called before start");
        b5.n.o(str, "authority");
        this.f11019i.add(new j(str));
    }

    @Override // io.grpc.internal.q
    public void l(x0 x0Var) {
        synchronized (this) {
            if (this.f11012b == null) {
                return;
            }
            if (this.f11013c != null) {
                x0Var.b("buffered_nanos", Long.valueOf(this.f11018h - this.f11017g));
                this.f11013c.l(x0Var);
            } else {
                x0Var.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f11017g));
                x0Var.a("waiting_for_connection");
            }
        }
    }

    @Override // io.grpc.internal.j2
    public void m() {
        b5.n.u(this.f11012b == null, "May only be called before start");
        this.f11019i.add(new b());
    }

    @Override // io.grpc.internal.q
    public void n() {
        b5.n.u(this.f11012b != null, "May only be called after start");
        s(new n());
    }

    @Override // io.grpc.internal.q
    public void q(boolean z10) {
        b5.n.u(this.f11012b == null, "May only be called before start");
        this.f11019i.add(new d(z10));
    }

    protected void v(i9.j1 j1Var) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Runnable x(q qVar) {
        synchronized (this) {
            if (this.f11013c != null) {
                return null;
            }
            w((q) b5.n.o(qVar, "stream"));
            r rVar = this.f11012b;
            if (rVar == null) {
                this.f11015e = null;
                this.f11011a = true;
            }
            if (rVar == null) {
                return null;
            }
            u(rVar);
            return new i();
        }
    }
}
