package k9;

import i9.j1;
import i9.y0;
import i9.z0;
import io.grpc.internal.a;
import io.grpc.internal.i2;
import io.grpc.internal.o2;
import io.grpc.internal.p2;
import io.grpc.internal.r;
import io.grpc.internal.u0;
import java.util.List;
import k9.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h extends io.grpc.internal.a {

    /* renamed from: p  reason: collision with root package name */
    private static final okio.c f12706p = new okio.c();

    /* renamed from: h  reason: collision with root package name */
    private final z0<?, ?> f12707h;

    /* renamed from: i  reason: collision with root package name */
    private final String f12708i;

    /* renamed from: j  reason: collision with root package name */
    private final i2 f12709j;

    /* renamed from: k  reason: collision with root package name */
    private String f12710k;

    /* renamed from: l  reason: collision with root package name */
    private final b f12711l;

    /* renamed from: m  reason: collision with root package name */
    private final a f12712m;

    /* renamed from: n  reason: collision with root package name */
    private final i9.a f12713n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12714o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.b {
        a() {
        }

        @Override // io.grpc.internal.a.b
        public void a(j1 j1Var) {
            r9.c.f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (h.this.f12711l.f12717z) {
                    h.this.f12711l.a0(j1Var, true, null);
                }
            } finally {
                r9.c.h("OkHttpClientStream$Sink.cancel");
            }
        }

        @Override // io.grpc.internal.a.b
        public void b(p2 p2Var, boolean z10, boolean z11, int i10) {
            okio.c f10;
            r9.c.f("OkHttpClientStream$Sink.writeFrame");
            if (p2Var == null) {
                f10 = h.f12706p;
            } else {
                f10 = ((o) p2Var).f();
                int b02 = (int) f10.b0();
                if (b02 > 0) {
                    h.this.t(b02);
                }
            }
            try {
                synchronized (h.this.f12711l.f12717z) {
                    h.this.f12711l.e0(f10, z10, z11);
                    h.this.x().e(i10);
                }
            } finally {
                r9.c.h("OkHttpClientStream$Sink.writeFrame");
            }
        }

        @Override // io.grpc.internal.a.b
        public void c(y0 y0Var, byte[] bArr) {
            r9.c.f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + h.this.f12707h.c();
            if (bArr != null) {
                h.this.f12714o = true;
                str = str + "?" + c5.a.a().e(bArr);
            }
            try {
                synchronized (h.this.f12711l.f12717z) {
                    h.this.f12711l.g0(y0Var, str);
                }
            } finally {
                r9.c.h("OkHttpClientStream$Sink.writeHeaders");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends u0 implements q.b {
        private List<m9.d> A;
        private okio.c B;
        private boolean C;
        private boolean D;
        private boolean E;
        private int F;
        private int G;
        private final k9.b H;
        private final q I;
        private final i J;
        private boolean K;
        private final r9.d L;
        private q.c M;
        private int N;

        /* renamed from: y  reason: collision with root package name */
        private final int f12716y;

        /* renamed from: z  reason: collision with root package name */
        private final Object f12717z;

        public b(int i10, i2 i2Var, Object obj, k9.b bVar, q qVar, i iVar, int i11, String str) {
            super(i10, i2Var, h.this.x());
            this.B = new okio.c();
            this.C = false;
            this.D = false;
            this.E = false;
            this.K = true;
            this.N = -1;
            this.f12717z = b5.n.o(obj, "lock");
            this.H = bVar;
            this.I = qVar;
            this.J = iVar;
            this.F = i11;
            this.G = i11;
            this.f12716y = i11;
            this.L = r9.c.a(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(j1 j1Var, boolean z10, y0 y0Var) {
            if (this.E) {
                return;
            }
            this.E = true;
            if (!this.K) {
                this.J.U(c0(), j1Var, r.a.PROCESSED, z10, m9.a.CANCEL, y0Var);
                return;
            }
            this.J.h0(h.this);
            this.A = null;
            this.B.h();
            this.K = false;
            if (y0Var == null) {
                y0Var = new y0();
            }
            N(j1Var, true, y0Var);
        }

        private void d0() {
            if (G()) {
                this.J.U(c0(), null, r.a.PROCESSED, false, null, null);
            } else {
                this.J.U(c0(), null, r.a.PROCESSED, false, m9.a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(okio.c cVar, boolean z10, boolean z11) {
            if (this.E) {
                return;
            }
            if (!this.K) {
                b5.n.u(c0() != -1, "streamId should be set");
                this.I.d(z10, this.M, cVar, z11);
                return;
            }
            this.B.j(cVar, (int) cVar.b0());
            this.C |= z10;
            this.D |= z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(y0 y0Var, String str) {
            this.A = d.b(y0Var, str, h.this.f12710k, h.this.f12708i, h.this.f12714o, this.J.b0());
            this.J.o0(h.this);
        }

        @Override // io.grpc.internal.u0
        protected void P(j1 j1Var, boolean z10, y0 y0Var) {
            a0(j1Var, z10, y0Var);
        }

        @Override // io.grpc.internal.l1.b
        public void b(Throwable th) {
            P(j1.k(th), true, new y0());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public q.c b0() {
            q.c cVar;
            synchronized (this.f12717z) {
                cVar = this.M;
            }
            return cVar;
        }

        @Override // io.grpc.internal.g.d
        public void c(Runnable runnable) {
            synchronized (this.f12717z) {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int c0() {
            return this.N;
        }

        @Override // io.grpc.internal.u0, io.grpc.internal.a.c, io.grpc.internal.l1.b
        public void e(boolean z10) {
            d0();
            super.e(z10);
        }

        @Override // io.grpc.internal.l1.b
        public void f(int i10) {
            int i11 = this.G - i10;
            this.G = i11;
            int i12 = this.f12716y;
            if (i11 <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.F += i13;
                this.G = i11 + i13;
                this.H.g(c0(), i13);
            }
        }

        public void f0(int i10) {
            b5.n.v(this.N == -1, "the stream has been started with id %s", i10);
            this.N = i10;
            this.M = this.I.c(this, i10);
            h.this.f12711l.r();
            if (this.K) {
                this.H.X(h.this.f12714o, false, this.N, 0, this.A);
                h.this.f12709j.c();
                this.A = null;
                if (this.B.b0() > 0) {
                    this.I.d(this.C, this.M, this.B, this.D);
                }
                this.K = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public r9.d h0() {
            return this.L;
        }

        public void i0(okio.c cVar, boolean z10) {
            int b02 = this.F - ((int) cVar.b0());
            this.F = b02;
            if (b02 >= 0) {
                super.S(new l(cVar), z10);
                return;
            }
            this.H.d(c0(), m9.a.FLOW_CONTROL_ERROR);
            this.J.U(c0(), j1.f9937t.q("Received data size exceeded our receiving window size"), r.a.PROCESSED, false, null, null);
        }

        public void j0(List<m9.d> list, boolean z10) {
            if (z10) {
                U(r.c(list));
            } else {
                T(r.a(list));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        public void r() {
            super.r();
            m().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(z0<?, ?> z0Var, y0 y0Var, k9.b bVar, i iVar, q qVar, Object obj, int i10, int i11, String str, String str2, i2 i2Var, o2 o2Var, i9.c cVar, boolean z10) {
        super(new p(), i2Var, o2Var, y0Var, cVar, z10 && z0Var.f());
        this.f12712m = new a();
        this.f12714o = false;
        this.f12709j = (i2) b5.n.o(i2Var, "statsTraceCtx");
        this.f12707h = z0Var;
        this.f12710k = str;
        this.f12708i = str2;
        this.f12713n = iVar.V();
        this.f12711l = new b(i10, i2Var, obj, bVar, qVar, iVar, i11, z0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* renamed from: A */
    public a v() {
        return this.f12712m;
    }

    public z0.d M() {
        return this.f12707h.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* renamed from: N */
    public b z() {
        return this.f12711l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean O() {
        return this.f12714o;
    }

    @Override // io.grpc.internal.q
    public void k(String str) {
        this.f12710k = (String) b5.n.o(str, "authority");
    }

    @Override // io.grpc.internal.q
    public i9.a p() {
        return this.f12713n;
    }
}
