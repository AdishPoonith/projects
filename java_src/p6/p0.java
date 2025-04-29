package p6;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.z;
import i9.j1;
import j6.b1;
import j6.k1;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l6.g1;
import l6.h4;
import p6.j0;
import p6.l;
import p6.p0;
import p6.w0;
import p6.x0;
import p6.y0;
import p6.z0;
/* loaded from: classes.dex */
public final class p0 implements x0.b {

    /* renamed from: a  reason: collision with root package name */
    private final c f15641a;

    /* renamed from: b  reason: collision with root package name */
    private final l6.i0 f15642b;

    /* renamed from: c  reason: collision with root package name */
    private final o f15643c;

    /* renamed from: d  reason: collision with root package name */
    private final l f15644d;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f15646f;

    /* renamed from: h  reason: collision with root package name */
    private final y0 f15648h;

    /* renamed from: i  reason: collision with root package name */
    private final z0 f15649i;

    /* renamed from: j  reason: collision with root package name */
    private x0 f15650j;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15647g = false;

    /* renamed from: e  reason: collision with root package name */
    private final Map<Integer, h4> f15645e = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private final Deque<n6.g> f15651k = new ArrayDeque();

    /* loaded from: classes.dex */
    class a implements y0.a {
        a() {
        }

        @Override // p6.r0
        public void a(j1 j1Var) {
            p0.this.w(j1Var);
        }

        @Override // p6.r0
        public void b() {
            p0.this.x();
        }

        @Override // p6.y0.a
        public void d(m6.w wVar, w0 w0Var) {
            p0.this.v(wVar, w0Var);
        }
    }

    /* loaded from: classes.dex */
    class b implements z0.a {
        b() {
        }

        @Override // p6.r0
        public void a(j1 j1Var) {
            p0.this.A(j1Var);
        }

        @Override // p6.r0
        public void b() {
            p0.this.f15649i.C();
        }

        @Override // p6.z0.a
        public void c() {
            p0.this.B();
        }

        @Override // p6.z0.a
        public void e(m6.w wVar, List<n6.i> list) {
            p0.this.C(wVar, list);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(j6.z0 z0Var);

        d6.e<m6.l> b(int i10);

        void c(int i10, j1 j1Var);

        void d(int i10, j1 j1Var);

        void e(n6.h hVar);

        void f(k0 k0Var);
    }

    public p0(final c cVar, l6.i0 i0Var, o oVar, final q6.g gVar, l lVar) {
        this.f15641a = cVar;
        this.f15642b = i0Var;
        this.f15643c = oVar;
        this.f15644d = lVar;
        Objects.requireNonNull(cVar);
        this.f15646f = new j0(gVar, new j0.a() { // from class: p6.n0
            @Override // p6.j0.a
            public final void a(j6.z0 z0Var) {
                p0.c.this.a(z0Var);
            }
        });
        this.f15648h = oVar.f(new a());
        this.f15649i = oVar.g(new b());
        lVar.a(new q6.n() { // from class: p6.o0
            @Override // q6.n
            public final void accept(Object obj) {
                p0.this.E(gVar, (l.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(j1 j1Var) {
        if (j1Var.o()) {
            q6.b.d(!N(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!j1Var.o() && !this.f15651k.isEmpty()) {
            if (this.f15649i.z()) {
                y(j1Var);
            } else {
                z(j1Var);
            }
        }
        if (N()) {
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        this.f15642b.k0(this.f15649i.y());
        for (n6.g gVar : this.f15651k) {
            this.f15649i.D(gVar.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(m6.w wVar, List<n6.i> list) {
        this.f15641a.e(n6.h.a(this.f15651k.poll(), wVar, list, this.f15649i.y()));
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(l.a aVar) {
        if (aVar.equals(l.a.REACHABLE) && this.f15646f.c().equals(j6.z0.ONLINE)) {
            return;
        }
        if (!(aVar.equals(l.a.UNREACHABLE) && this.f15646f.c().equals(j6.z0.OFFLINE)) && n()) {
            q6.v.a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(q6.g gVar, final l.a aVar) {
        gVar.l(new Runnable() { // from class: p6.m0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.D(aVar);
            }
        });
    }

    private void G(w0.d dVar) {
        q6.b.d(dVar.a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer num : dVar.d()) {
            if (this.f15645e.containsKey(num)) {
                this.f15645e.remove(num);
                this.f15650j.n(num.intValue());
                this.f15641a.c(num.intValue(), dVar.a());
            }
        }
    }

    private void H(m6.w wVar) {
        q6.b.d(!wVar.equals(m6.w.f13842k), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        k0 b10 = this.f15650j.b(wVar);
        for (Map.Entry<Integer, s0> entry : b10.d().entrySet()) {
            s0 value = entry.getValue();
            if (!value.e().isEmpty()) {
                int intValue = entry.getKey().intValue();
                h4 h4Var = this.f15645e.get(Integer.valueOf(intValue));
                if (h4Var != null) {
                    this.f15645e.put(Integer.valueOf(intValue), h4Var.i(value.e(), wVar));
                }
            }
        }
        for (Integer num : b10.e()) {
            int intValue2 = num.intValue();
            h4 h4Var2 = this.f15645e.get(Integer.valueOf(intValue2));
            if (h4Var2 != null) {
                this.f15645e.put(Integer.valueOf(intValue2), h4Var2.i(com.google.protobuf.i.f7143k, h4Var2.e()));
                K(intValue2);
                L(new h4(h4Var2.f(), intValue2, h4Var2.d(), g1.EXISTENCE_FILTER_MISMATCH));
            }
        }
        this.f15641a.f(b10);
    }

    private void I() {
        this.f15647g = false;
        r();
        this.f15646f.i(j6.z0.UNKNOWN);
        this.f15649i.l();
        this.f15648h.l();
        s();
    }

    private void K(int i10) {
        this.f15650j.l(i10);
        this.f15648h.z(i10);
    }

    private void L(h4 h4Var) {
        this.f15650j.l(h4Var.g());
        this.f15648h.A(h4Var);
    }

    private boolean M() {
        return (!n() || this.f15648h.n() || this.f15645e.isEmpty()) ? false : true;
    }

    private boolean N() {
        return (!n() || this.f15649i.n() || this.f15651k.isEmpty()) ? false : true;
    }

    private void Q() {
        q6.b.d(M(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f15650j = new x0(this);
        this.f15648h.u();
        this.f15646f.e();
    }

    private void R() {
        q6.b.d(N(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f15649i.u();
    }

    private void l(n6.g gVar) {
        q6.b.d(m(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f15651k.add(gVar);
        if (this.f15649i.m() && this.f15649i.z()) {
            this.f15649i.D(gVar.h());
        }
    }

    private boolean m() {
        return n() && this.f15651k.size() < 10;
    }

    private void o() {
        this.f15650j = null;
    }

    private void r() {
        this.f15648h.v();
        this.f15649i.v();
        if (!this.f15651k.isEmpty()) {
            q6.v.a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f15651k.size()));
            this.f15651k.clear();
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(m6.w wVar, w0 w0Var) {
        this.f15646f.i(j6.z0.ONLINE);
        q6.b.d((this.f15648h == null || this.f15650j == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z10 = w0Var instanceof w0.d;
        w0.d dVar = z10 ? (w0.d) w0Var : null;
        if (dVar != null && dVar.b().equals(w0.e.Removed) && dVar.a() != null) {
            G(dVar);
            return;
        }
        if (w0Var instanceof w0.b) {
            this.f15650j.g((w0.b) w0Var);
        } else if (w0Var instanceof w0.c) {
            this.f15650j.h((w0.c) w0Var);
        } else {
            q6.b.d(z10, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
            this.f15650j.i((w0.d) w0Var);
        }
        if (wVar.equals(m6.w.f13842k) || wVar.compareTo(this.f15642b.E()) < 0) {
            return;
        }
        H(wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(j1 j1Var) {
        if (j1Var.o()) {
            q6.b.d(!M(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        o();
        if (!M()) {
            this.f15646f.i(j6.z0.UNKNOWN);
            return;
        }
        this.f15646f.d(j1Var);
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        for (h4 h4Var : this.f15645e.values()) {
            L(h4Var);
        }
    }

    private void y(j1 j1Var) {
        q6.b.d(!j1Var.o(), "Handling write error with status OK.", new Object[0]);
        if (o.l(j1Var)) {
            this.f15649i.l();
            this.f15641a.d(this.f15651k.poll().e(), j1Var);
            t();
        }
    }

    private void z(j1 j1Var) {
        q6.b.d(!j1Var.o(), "Handling write error with status OK.", new Object[0]);
        if (o.k(j1Var)) {
            q6.v.a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", q6.g0.A(this.f15649i.y()), j1Var);
            z0 z0Var = this.f15649i;
            com.google.protobuf.i iVar = z0.f15748v;
            z0Var.B(iVar);
            this.f15642b.k0(iVar);
        }
    }

    public void F(h4 h4Var) {
        Integer valueOf = Integer.valueOf(h4Var.g());
        if (this.f15645e.containsKey(valueOf)) {
            return;
        }
        this.f15645e.put(valueOf, h4Var);
        if (M()) {
            Q();
        } else if (this.f15648h.m()) {
            L(h4Var);
        }
    }

    public Task<Map<String, d7.b0>> J(b1 b1Var, List<com.google.firebase.firestore.a> list) {
        return n() ? this.f15643c.p(b1Var, list) : Tasks.forException(new com.google.firebase.firestore.z("Failed to get result from server.", z.a.UNAVAILABLE));
    }

    public void O() {
        q6.v.a("RemoteStore", "Shutting down", new Object[0]);
        this.f15644d.shutdown();
        this.f15647g = false;
        r();
        this.f15643c.q();
        this.f15646f.i(j6.z0.UNKNOWN);
    }

    public void P() {
        s();
    }

    public void S(int i10) {
        q6.b.d(this.f15645e.remove(Integer.valueOf(i10)) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i10));
        if (this.f15648h.m()) {
            K(i10);
        }
        if (this.f15645e.isEmpty()) {
            if (this.f15648h.m()) {
                this.f15648h.q();
            } else if (n()) {
                this.f15646f.i(j6.z0.UNKNOWN);
            }
        }
    }

    @Override // p6.x0.b
    public h4 a(int i10) {
        return this.f15645e.get(Integer.valueOf(i10));
    }

    @Override // p6.x0.b
    public d6.e<m6.l> b(int i10) {
        return this.f15641a.b(i10);
    }

    public boolean n() {
        return this.f15647g;
    }

    public k1 p() {
        return new k1(this.f15643c);
    }

    public void q() {
        this.f15647g = false;
        r();
        this.f15646f.i(j6.z0.OFFLINE);
    }

    public void s() {
        this.f15647g = true;
        if (n()) {
            this.f15649i.B(this.f15642b.F());
            if (M()) {
                Q();
            } else {
                this.f15646f.i(j6.z0.UNKNOWN);
            }
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0032 -> B:6:0x0013). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            r2 = this;
            java.util.Deque<n6.g> r0 = r2.f15651k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = -1
            goto L13
        La:
            java.util.Deque<n6.g> r0 = r2.f15651k
            java.lang.Object r0 = r0.getLast()
            n6.g r0 = (n6.g) r0
            goto L32
        L13:
            boolean r1 = r2.m()
            if (r1 == 0) goto L37
            l6.i0 r1 = r2.f15642b
            n6.g r0 = r1.I(r0)
            if (r0 != 0) goto L2f
            java.util.Deque<n6.g> r0 = r2.f15651k
            int r0 = r0.size()
            if (r0 != 0) goto L37
            p6.z0 r0 = r2.f15649i
            r0.q()
            goto L37
        L2f:
            r2.l(r0)
        L32:
            int r0 = r0.e()
            goto L13
        L37:
            boolean r0 = r2.N()
            if (r0 == 0) goto L40
            r2.R()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.p0.t():void");
    }

    public void u() {
        if (n()) {
            q6.v.a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            I();
        }
    }
}
