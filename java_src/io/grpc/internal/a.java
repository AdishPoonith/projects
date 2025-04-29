package io.grpc.internal;

import i9.y0;
import io.grpc.internal.d;
import io.grpc.internal.m1;
import io.grpc.internal.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class a extends d implements q, m1.d {

    /* renamed from: g  reason: collision with root package name */
    private static final Logger f10952g = Logger.getLogger(a.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final o2 f10953a;

    /* renamed from: b  reason: collision with root package name */
    private final p0 f10954b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10955c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10956d;

    /* renamed from: e  reason: collision with root package name */
    private i9.y0 f10957e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f10958f;

    /* renamed from: io.grpc.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0170a implements p0 {

        /* renamed from: a  reason: collision with root package name */
        private i9.y0 f10959a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f10960b;

        /* renamed from: c  reason: collision with root package name */
        private final i2 f10961c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f10962d;

        public C0170a(i9.y0 y0Var, i2 i2Var) {
            this.f10959a = (i9.y0) b5.n.o(y0Var, "headers");
            this.f10961c = (i2) b5.n.o(i2Var, "statsTraceCtx");
        }

        @Override // io.grpc.internal.p0
        public p0 c(i9.n nVar) {
            return this;
        }

        @Override // io.grpc.internal.p0
        public void close() {
            this.f10960b = true;
            b5.n.u(this.f10962d != null, "Lack of request message. GET request is only supported for unary requests");
            a.this.v().c(this.f10959a, this.f10962d);
            this.f10962d = null;
            this.f10959a = null;
        }

        @Override // io.grpc.internal.p0
        public boolean d() {
            return this.f10960b;
        }

        @Override // io.grpc.internal.p0
        public void e(InputStream inputStream) {
            b5.n.u(this.f10962d == null, "writePayload should not be called multiple times");
            try {
                this.f10962d = c5.b.d(inputStream);
                this.f10961c.i(0);
                i2 i2Var = this.f10961c;
                byte[] bArr = this.f10962d;
                i2Var.j(0, bArr.length, bArr.length);
                this.f10961c.k(this.f10962d.length);
                this.f10961c.l(this.f10962d.length);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // io.grpc.internal.p0
        public void f(int i10) {
        }

        @Override // io.grpc.internal.p0
        public void flush() {
        }
    }

    /* loaded from: classes.dex */
    protected interface b {
        void a(i9.j1 j1Var);

        void b(p2 p2Var, boolean z10, boolean z11, int i10);

        void c(i9.y0 y0Var, byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static abstract class c extends d.a {

        /* renamed from: i  reason: collision with root package name */
        private final i2 f10964i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f10965j;

        /* renamed from: k  reason: collision with root package name */
        private r f10966k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f10967l;

        /* renamed from: m  reason: collision with root package name */
        private i9.v f10968m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f10969n;

        /* renamed from: o  reason: collision with root package name */
        private Runnable f10970o;

        /* renamed from: p  reason: collision with root package name */
        private volatile boolean f10971p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f10972q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f10973r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0171a implements Runnable {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ i9.j1 f10974j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ r.a f10975k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ i9.y0 f10976l;

            RunnableC0171a(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
                this.f10974j = j1Var;
                this.f10975k = aVar;
                this.f10976l = y0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.C(this.f10974j, this.f10975k, this.f10976l);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public c(int i10, i2 i2Var, o2 o2Var) {
            super(i10, i2Var, o2Var);
            this.f10968m = i9.v.c();
            this.f10969n = false;
            this.f10964i = (i2) b5.n.o(i2Var, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(i9.j1 j1Var, r.a aVar, i9.y0 y0Var) {
            if (this.f10965j) {
                return;
            }
            this.f10965j = true;
            this.f10964i.m(j1Var);
            o().c(j1Var, aVar, y0Var);
            if (m() != null) {
                m().f(j1Var.o());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I(i9.v vVar) {
            b5.n.u(this.f10966k == null, "Already called start");
            this.f10968m = (i9.v) b5.n.o(vVar, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(boolean z10) {
            this.f10967l = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L() {
            this.f10971p = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void D(v1 v1Var) {
            b5.n.o(v1Var, "frame");
            try {
                if (!this.f10972q) {
                    l(v1Var);
                    return;
                }
                a.f10952g.log(Level.INFO, "Received data on closed stream");
                v1Var.close();
            } catch (Throwable th) {
                if (1 != 0) {
                    v1Var.close();
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void E(i9.y0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f10972q
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                b5.n.u(r0, r2)
                io.grpc.internal.i2 r0 = r5.f10964i
                r0.a()
                i9.y0$g<java.lang.String> r0 = io.grpc.internal.r0.f11577g
                java.lang.Object r0 = r6.g(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f10967l
                r3 = 0
                if (r2 == 0) goto L4f
                if (r0 == 0) goto L4f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L2f
                io.grpc.internal.s0 r0 = new io.grpc.internal.s0
                r0.<init>()
                r5.w(r0)
                r0 = 1
                goto L50
            L2f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L4f
                i9.j1 r6 = i9.j1.f9937t
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                i9.j1 r6 = r6.q(r0)
                i9.l1 r6 = r6.d()
                r5.b(r6)
                return
            L4f:
                r0 = 0
            L50:
                i9.y0$g<java.lang.String> r2 = io.grpc.internal.r0.f11575e
                java.lang.Object r2 = r6.g(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L93
                i9.v r4 = r5.f10968m
                i9.u r4 = r4.e(r2)
                if (r4 != 0) goto L7a
                i9.j1 r6 = i9.j1.f9937t
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                i9.j1 r6 = r6.q(r0)
                i9.l1 r6 = r6.d()
                r5.b(r6)
                return
            L7a:
                i9.l r1 = i9.l.b.f9973a
                if (r4 == r1) goto L93
                if (r0 == 0) goto L90
                i9.j1 r6 = i9.j1.f9937t
                java.lang.String r0 = "Full stream and gRPC message encoding cannot both be set"
                i9.j1 r6 = r6.q(r0)
                i9.l1 r6 = r6.d()
                r5.b(r6)
                return
            L90:
                r5.v(r4)
            L93:
                io.grpc.internal.r r0 = r5.o()
                r0.d(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.a.c.E(i9.y0):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void F(i9.y0 y0Var, i9.j1 j1Var) {
            b5.n.o(j1Var, "status");
            b5.n.o(y0Var, "trailers");
            if (this.f10972q) {
                a.f10952g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{j1Var, y0Var});
                return;
            }
            this.f10964i.b(y0Var);
            N(j1Var, false, y0Var);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final boolean G() {
            return this.f10971p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        /* renamed from: H */
        public final r o() {
            return this.f10966k;
        }

        public final void K(r rVar) {
            b5.n.u(this.f10966k == null, "Already called setListener");
            this.f10966k = (r) b5.n.o(rVar, "listener");
        }

        public final void M(i9.j1 j1Var, r.a aVar, boolean z10, i9.y0 y0Var) {
            b5.n.o(j1Var, "status");
            b5.n.o(y0Var, "trailers");
            if (!this.f10972q || z10) {
                this.f10972q = true;
                this.f10973r = j1Var.o();
                s();
                if (this.f10969n) {
                    this.f10970o = null;
                    C(j1Var, aVar, y0Var);
                    return;
                }
                this.f10970o = new RunnableC0171a(j1Var, aVar, y0Var);
                k(z10);
            }
        }

        public final void N(i9.j1 j1Var, boolean z10, i9.y0 y0Var) {
            M(j1Var, r.a.PROCESSED, z10, y0Var);
        }

        @Override // io.grpc.internal.l1.b
        public void e(boolean z10) {
            b5.n.u(this.f10972q, "status should have been reported on deframer closed");
            this.f10969n = true;
            if (this.f10973r && z10) {
                N(i9.j1.f9937t.q("Encountered end-of-stream mid-frame"), true, new i9.y0());
            }
            Runnable runnable = this.f10970o;
            if (runnable != null) {
                runnable.run();
                this.f10970o = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(q2 q2Var, i2 i2Var, o2 o2Var, i9.y0 y0Var, i9.c cVar, boolean z10) {
        b5.n.o(y0Var, "headers");
        this.f10953a = (o2) b5.n.o(o2Var, "transportTracer");
        this.f10955c = r0.o(cVar);
        this.f10956d = z10;
        if (z10) {
            this.f10954b = new C0170a(y0Var, i2Var);
            return;
        }
        this.f10954b = new m1(this, q2Var, i2Var);
        this.f10957e = y0Var;
    }

    @Override // io.grpc.internal.q
    public final void a(i9.j1 j1Var) {
        b5.n.e(!j1Var.o(), "Should not cancel with OK status");
        this.f10958f = true;
        v().a(j1Var);
    }

    @Override // io.grpc.internal.d, io.grpc.internal.j2
    public final boolean d() {
        return super.d() && !this.f10958f;
    }

    @Override // io.grpc.internal.q
    public void e(int i10) {
        u().x(i10);
    }

    @Override // io.grpc.internal.q
    public void f(int i10) {
        this.f10954b.f(i10);
    }

    @Override // io.grpc.internal.q
    public final void g(r rVar) {
        u().K(rVar);
        if (this.f10956d) {
            return;
        }
        v().c(this.f10957e, null);
        this.f10957e = null;
    }

    @Override // io.grpc.internal.q
    public void h(i9.t tVar) {
        i9.y0 y0Var = this.f10957e;
        y0.g<Long> gVar = r0.f11574d;
        y0Var.e(gVar);
        this.f10957e.p(gVar, Long.valueOf(Math.max(0L, tVar.p(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.q
    public final void i(i9.v vVar) {
        u().I(vVar);
    }

    @Override // io.grpc.internal.q
    public final void l(x0 x0Var) {
        x0Var.b("remote_addr", p().b(i9.b0.f9831a));
    }

    @Override // io.grpc.internal.q
    public final void n() {
        if (u().G()) {
            return;
        }
        u().L();
        r();
    }

    @Override // io.grpc.internal.m1.d
    public final void o(p2 p2Var, boolean z10, boolean z11, int i10) {
        b5.n.e(p2Var != null || z10, "null frame before EOS");
        v().b(p2Var, z10, z11, i10);
    }

    @Override // io.grpc.internal.q
    public final void q(boolean z10) {
        u().J(z10);
    }

    @Override // io.grpc.internal.d
    protected final p0 s() {
        return this.f10954b;
    }

    protected abstract b v();

    /* JADX INFO: Access modifiers changed from: protected */
    public o2 x() {
        return this.f10953a;
    }

    public final boolean y() {
        return this.f10955c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.d
    /* renamed from: z */
    public abstract c u();
}
