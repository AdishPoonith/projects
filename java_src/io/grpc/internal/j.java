package io.grpc.internal;

import i9.a1;
import i9.f;
import i9.r0;
import io.grpc.internal.e2;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final i9.t0 f11379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11380b;

    /* loaded from: classes.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final r0.d f11381a;

        /* renamed from: b  reason: collision with root package name */
        private i9.r0 f11382b;

        /* renamed from: c  reason: collision with root package name */
        private i9.s0 f11383c;

        b(r0.d dVar) {
            this.f11381a = dVar;
            i9.s0 d10 = j.this.f11379a.d(j.this.f11380b);
            this.f11383c = d10;
            if (d10 != null) {
                this.f11382b = d10.a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + j.this.f11380b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        public i9.r0 a() {
            return this.f11382b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(i9.j1 j1Var) {
            a().c(j1Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            a().e();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f11382b.f();
            this.f11382b = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean e(r0.g gVar) {
            e2.b bVar = (e2.b) gVar.c();
            if (bVar == null) {
                try {
                    j jVar = j.this;
                    bVar = new e2.b(jVar.d(jVar.f11380b, "using default policy"), null);
                } catch (f e10) {
                    this.f11381a.f(i9.p.TRANSIENT_FAILURE, new d(i9.j1.f9937t.q(e10.getMessage())));
                    this.f11382b.f();
                    this.f11383c = null;
                    this.f11382b = new e();
                    return true;
                }
            }
            if (this.f11383c == null || !bVar.f11151a.b().equals(this.f11383c.b())) {
                this.f11381a.f(i9.p.CONNECTING, new c());
                this.f11382b.f();
                i9.s0 s0Var = bVar.f11151a;
                this.f11383c = s0Var;
                i9.r0 r0Var = this.f11382b;
                this.f11382b = s0Var.a(this.f11381a);
                this.f11381a.b().b(f.a.INFO, "Load balancer changed from {0} to {1}", r0Var.getClass().getSimpleName(), this.f11382b.getClass().getSimpleName());
            }
            Object obj = bVar.f11152b;
            if (obj != null) {
                this.f11381a.b().b(f.a.DEBUG, "Load-balancing config: {0}", bVar.f11152b);
            }
            return a().a(r0.g.d().b(gVar.a()).c(gVar.b()).d(obj).a());
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends r0.i {
        private c() {
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            return r0.e.g();
        }

        public String toString() {
            return b5.h.b(c.class).toString();
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends r0.i {

        /* renamed from: a  reason: collision with root package name */
        private final i9.j1 f11385a;

        d(i9.j1 j1Var) {
            this.f11385a = j1Var;
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            return r0.e.f(this.f11385a);
        }
    }

    /* loaded from: classes.dex */
    private static final class e extends i9.r0 {
        private e() {
        }

        @Override // i9.r0
        public boolean a(r0.g gVar) {
            return true;
        }

        @Override // i9.r0
        public void c(i9.j1 j1Var) {
        }

        @Override // i9.r0
        @Deprecated
        public void d(r0.g gVar) {
        }

        @Override // i9.r0
        public void f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f extends Exception {
        private f(String str) {
            super(str);
        }
    }

    j(i9.t0 t0Var, String str) {
        this.f11379a = (i9.t0) b5.n.o(t0Var, "registry");
        this.f11380b = (String) b5.n.o(str, "defaultPolicy");
    }

    public j(String str) {
        this(i9.t0.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i9.s0 d(String str, String str2) {
        i9.s0 d10 = this.f11379a.d(str);
        if (d10 != null) {
            return d10;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(r0.d dVar) {
        return new b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1.c f(Map<String, ?> map) {
        List<e2.a> A;
        if (map != null) {
            try {
                A = e2.A(e2.g(map));
            } catch (RuntimeException e10) {
                return a1.c.b(i9.j1.f9925h.q("can't parse load balancer configuration").p(e10));
            }
        } else {
            A = null;
        }
        if (A == null || A.isEmpty()) {
            return null;
        }
        return e2.y(A, this.f11379a);
    }
}
