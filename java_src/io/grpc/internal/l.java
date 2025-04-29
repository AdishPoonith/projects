package io.grpc.internal;

import i9.b;
import io.grpc.internal.n1;
import io.grpc.internal.t;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
final class l implements t {

    /* renamed from: j  reason: collision with root package name */
    private final t f11400j;

    /* renamed from: k  reason: collision with root package name */
    private final i9.b f11401k;

    /* renamed from: l  reason: collision with root package name */
    private final Executor f11402l;

    /* loaded from: classes.dex */
    private class a extends k0 {

        /* renamed from: a  reason: collision with root package name */
        private final v f11403a;

        /* renamed from: b  reason: collision with root package name */
        private final String f11404b;

        /* renamed from: d  reason: collision with root package name */
        private volatile i9.j1 f11406d;

        /* renamed from: e  reason: collision with root package name */
        private i9.j1 f11407e;

        /* renamed from: f  reason: collision with root package name */
        private i9.j1 f11408f;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicInteger f11405c = new AtomicInteger(-2147483647);

        /* renamed from: g  reason: collision with root package name */
        private final n1.a f11409g = new C0174a();

        /* renamed from: io.grpc.internal.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0174a implements n1.a {
            C0174a() {
            }

            @Override // io.grpc.internal.n1.a
            public void a() {
                if (a.this.f11405c.decrementAndGet() == 0) {
                    a.this.j();
                }
            }
        }

        /* loaded from: classes.dex */
        class b extends b.AbstractC0161b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i9.z0 f11412a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i9.c f11413b;

            b(i9.z0 z0Var, i9.c cVar) {
                this.f11412a = z0Var;
                this.f11413b = cVar;
            }
        }

        a(v vVar, String str) {
            this.f11403a = (v) b5.n.o(vVar, "delegate");
            this.f11404b = (String) b5.n.o(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            synchronized (this) {
                if (this.f11405c.get() != 0) {
                    return;
                }
                i9.j1 j1Var = this.f11407e;
                i9.j1 j1Var2 = this.f11408f;
                this.f11407e = null;
                this.f11408f = null;
                if (j1Var != null) {
                    super.c(j1Var);
                }
                if (j1Var2 != null) {
                    super.g(j1Var2);
                }
            }
        }

        @Override // io.grpc.internal.k0, io.grpc.internal.s
        public q a(i9.z0<?, ?> z0Var, i9.y0 y0Var, i9.c cVar, i9.k[] kVarArr) {
            i9.b c10 = cVar.c();
            if (c10 == null) {
                c10 = l.this.f11401k;
            } else if (l.this.f11401k != null) {
                c10 = new i9.m(l.this.f11401k, c10);
            }
            if (c10 == null) {
                return this.f11405c.get() >= 0 ? new f0(this.f11406d, kVarArr) : this.f11403a.a(z0Var, y0Var, cVar, kVarArr);
            }
            n1 n1Var = new n1(this.f11403a, z0Var, y0Var, cVar, this.f11409g, kVarArr);
            if (this.f11405c.incrementAndGet() > 0) {
                this.f11409g.a();
                return new f0(this.f11406d, kVarArr);
            }
            try {
                c10.a(new b(z0Var, cVar), ((c10 instanceof i9.l0) && ((i9.l0) c10).a() && cVar.e() != null) ? cVar.e() : l.this.f11402l, n1Var);
            } catch (Throwable th) {
                n1Var.b(i9.j1.f9931n.q("Credentials should use fail() instead of throwing exceptions").p(th));
            }
            return n1Var.d();
        }

        @Override // io.grpc.internal.k0
        protected v b() {
            return this.f11403a;
        }

        @Override // io.grpc.internal.k0, io.grpc.internal.k1
        public void c(i9.j1 j1Var) {
            b5.n.o(j1Var, "status");
            synchronized (this) {
                if (this.f11405c.get() < 0) {
                    this.f11406d = j1Var;
                    this.f11405c.addAndGet(Integer.MAX_VALUE);
                    if (this.f11405c.get() != 0) {
                        this.f11407e = j1Var;
                    } else {
                        super.c(j1Var);
                    }
                }
            }
        }

        @Override // io.grpc.internal.k0, io.grpc.internal.k1
        public void g(i9.j1 j1Var) {
            b5.n.o(j1Var, "status");
            synchronized (this) {
                if (this.f11405c.get() < 0) {
                    this.f11406d = j1Var;
                    this.f11405c.addAndGet(Integer.MAX_VALUE);
                } else if (this.f11408f != null) {
                    return;
                }
                if (this.f11405c.get() != 0) {
                    this.f11408f = j1Var;
                } else {
                    super.g(j1Var);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(t tVar, i9.b bVar, Executor executor) {
        this.f11400j = (t) b5.n.o(tVar, "delegate");
        this.f11401k = bVar;
        this.f11402l = (Executor) b5.n.o(executor, "appExecutor");
    }

    @Override // io.grpc.internal.t
    public ScheduledExecutorService S() {
        return this.f11400j.S();
    }

    @Override // io.grpc.internal.t
    public v W(SocketAddress socketAddress, t.a aVar, i9.f fVar) {
        return new a(this.f11400j.W(socketAddress, aVar, fVar), aVar.a());
    }

    @Override // io.grpc.internal.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f11400j.close();
    }
}
