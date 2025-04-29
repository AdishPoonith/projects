package q9;

import b5.n;
import i9.j1;
import i9.p;
import i9.r0;
/* loaded from: classes.dex */
public final class d extends q9.a {

    /* renamed from: l  reason: collision with root package name */
    static final r0.i f16505l = new c();

    /* renamed from: c  reason: collision with root package name */
    private final r0 f16506c;

    /* renamed from: d  reason: collision with root package name */
    private final r0.d f16507d;

    /* renamed from: e  reason: collision with root package name */
    private r0.c f16508e;

    /* renamed from: f  reason: collision with root package name */
    private r0 f16509f;

    /* renamed from: g  reason: collision with root package name */
    private r0.c f16510g;

    /* renamed from: h  reason: collision with root package name */
    private r0 f16511h;

    /* renamed from: i  reason: collision with root package name */
    private p f16512i;

    /* renamed from: j  reason: collision with root package name */
    private r0.i f16513j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16514k;

    /* loaded from: classes.dex */
    class a extends r0 {

        /* renamed from: q9.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0239a extends r0.i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j1 f16516a;

            C0239a(j1 j1Var) {
                this.f16516a = j1Var;
            }

            @Override // i9.r0.i
            public r0.e a(r0.f fVar) {
                return r0.e.f(this.f16516a);
            }

            public String toString() {
                return b5.h.b(C0239a.class).d("error", this.f16516a).toString();
            }
        }

        a() {
        }

        @Override // i9.r0
        public void c(j1 j1Var) {
            d.this.f16507d.f(p.TRANSIENT_FAILURE, new C0239a(j1Var));
        }

        @Override // i9.r0
        public void d(r0.g gVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // i9.r0
        public void f() {
        }
    }

    /* loaded from: classes.dex */
    class b extends q9.b {

        /* renamed from: a  reason: collision with root package name */
        r0 f16518a;

        b() {
        }

        @Override // i9.r0.d
        public void f(p pVar, r0.i iVar) {
            if (this.f16518a == d.this.f16511h) {
                n.u(d.this.f16514k, "there's pending lb while current lb has been out of READY");
                d.this.f16512i = pVar;
                d.this.f16513j = iVar;
                if (pVar != p.READY) {
                    return;
                }
            } else if (this.f16518a != d.this.f16509f) {
                return;
            } else {
                d.this.f16514k = pVar == p.READY;
                if (d.this.f16514k || d.this.f16511h == d.this.f16506c) {
                    d.this.f16507d.f(pVar, iVar);
                    return;
                }
            }
            d.this.q();
        }

        @Override // q9.b
        protected r0.d g() {
            return d.this.f16507d;
        }
    }

    /* loaded from: classes.dex */
    class c extends r0.i {
        c() {
        }

        @Override // i9.r0.i
        public r0.e a(r0.f fVar) {
            return r0.e.g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public d(r0.d dVar) {
        a aVar = new a();
        this.f16506c = aVar;
        this.f16509f = aVar;
        this.f16511h = aVar;
        this.f16507d = (r0.d) n.o(dVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.f16507d.f(this.f16512i, this.f16513j);
        this.f16509f.f();
        this.f16509f = this.f16511h;
        this.f16508e = this.f16510g;
        this.f16511h = this.f16506c;
        this.f16510g = null;
    }

    @Override // i9.r0
    public void f() {
        this.f16511h.f();
        this.f16509f.f();
    }

    @Override // q9.a
    protected r0 g() {
        r0 r0Var = this.f16511h;
        return r0Var == this.f16506c ? this.f16509f : r0Var;
    }

    public void r(r0.c cVar) {
        n.o(cVar, "newBalancerFactory");
        if (cVar.equals(this.f16510g)) {
            return;
        }
        this.f16511h.f();
        this.f16511h = this.f16506c;
        this.f16510g = null;
        this.f16512i = p.CONNECTING;
        this.f16513j = f16505l;
        if (cVar.equals(this.f16508e)) {
            return;
        }
        b bVar = new b();
        r0 a10 = cVar.a(bVar);
        bVar.f16518a = a10;
        this.f16511h = a10;
        this.f16510g = cVar;
        if (this.f16514k) {
            return;
        }
        q();
    }
}
