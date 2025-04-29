package t1;

import android.os.Looper;
import android.util.SparseArray;
import com.google.common.collect.r;
import java.io.IOException;
import java.util.List;
import p3.q;
import s1.a2;
import s1.b3;
import s1.c3;
import s1.d4;
import s1.v1;
import s1.y2;
import s1.y3;
import t1.c;
import u2.u;
/* loaded from: classes.dex */
public class o1 implements t1.a {

    /* renamed from: a  reason: collision with root package name */
    private final p3.d f18073a;

    /* renamed from: b  reason: collision with root package name */
    private final y3.b f18074b;

    /* renamed from: c  reason: collision with root package name */
    private final y3.d f18075c;

    /* renamed from: d  reason: collision with root package name */
    private final a f18076d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<c.a> f18077e;

    /* renamed from: f  reason: collision with root package name */
    private p3.q<c> f18078f;

    /* renamed from: g  reason: collision with root package name */
    private c3 f18079g;

    /* renamed from: h  reason: collision with root package name */
    private p3.n f18080h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f18081i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final y3.b f18082a;

        /* renamed from: b  reason: collision with root package name */
        private com.google.common.collect.q<u.b> f18083b = com.google.common.collect.q.z();

        /* renamed from: c  reason: collision with root package name */
        private com.google.common.collect.r<u.b, y3> f18084c = com.google.common.collect.r.j();

        /* renamed from: d  reason: collision with root package name */
        private u.b f18085d;

        /* renamed from: e  reason: collision with root package name */
        private u.b f18086e;

        /* renamed from: f  reason: collision with root package name */
        private u.b f18087f;

        public a(y3.b bVar) {
            this.f18082a = bVar;
        }

        private void b(r.a<u.b, y3> aVar, u.b bVar, y3 y3Var) {
            if (bVar == null) {
                return;
            }
            if (y3Var.f(bVar.f18969a) == -1 && (y3Var = this.f18084c.get(bVar)) == null) {
                return;
            }
            aVar.f(bVar, y3Var);
        }

        private static u.b c(c3 c3Var, com.google.common.collect.q<u.b> qVar, u.b bVar, y3.b bVar2) {
            y3 E = c3Var.E();
            int t10 = c3Var.t();
            Object q10 = E.u() ? null : E.q(t10);
            int g10 = (c3Var.i() || E.u()) ? -1 : E.j(t10, bVar2).g(p3.n0.B0(c3Var.H()) - bVar2.q());
            for (int i10 = 0; i10 < qVar.size(); i10++) {
                u.b bVar3 = qVar.get(i10);
                if (i(bVar3, q10, c3Var.i(), c3Var.u(), c3Var.z(), g10)) {
                    return bVar3;
                }
            }
            if (qVar.isEmpty() && bVar != null) {
                if (i(bVar, q10, c3Var.i(), c3Var.u(), c3Var.z(), g10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(u.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f18969a.equals(obj)) {
                return (z10 && bVar.f18970b == i10 && bVar.f18971c == i11) || (!z10 && bVar.f18970b == -1 && bVar.f18973e == i12);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
            if (b5.j.a(r3.f18085d, r3.f18087f) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
            if (r3.f18083b.contains(r3.f18085d) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
            b(r0, r3.f18085d, r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m(s1.y3 r4) {
            /*
                r3 = this;
                com.google.common.collect.r$a r0 = com.google.common.collect.r.a()
                com.google.common.collect.q<u2.u$b> r1 = r3.f18083b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L35
                u2.u$b r1 = r3.f18086e
                r3.b(r0, r1, r4)
                u2.u$b r1 = r3.f18087f
                u2.u$b r2 = r3.f18086e
                boolean r1 = b5.j.a(r1, r2)
                if (r1 != 0) goto L20
                u2.u$b r1 = r3.f18087f
                r3.b(r0, r1, r4)
            L20:
                u2.u$b r1 = r3.f18085d
                u2.u$b r2 = r3.f18086e
                boolean r1 = b5.j.a(r1, r2)
                if (r1 != 0) goto L5b
                u2.u$b r1 = r3.f18085d
                u2.u$b r2 = r3.f18087f
                boolean r1 = b5.j.a(r1, r2)
                if (r1 != 0) goto L5b
                goto L56
            L35:
                r1 = 0
            L36:
                com.google.common.collect.q<u2.u$b> r2 = r3.f18083b
                int r2 = r2.size()
                if (r1 >= r2) goto L4c
                com.google.common.collect.q<u2.u$b> r2 = r3.f18083b
                java.lang.Object r2 = r2.get(r1)
                u2.u$b r2 = (u2.u.b) r2
                r3.b(r0, r2, r4)
                int r1 = r1 + 1
                goto L36
            L4c:
                com.google.common.collect.q<u2.u$b> r1 = r3.f18083b
                u2.u$b r2 = r3.f18085d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5b
            L56:
                u2.u$b r1 = r3.f18085d
                r3.b(r0, r1, r4)
            L5b:
                com.google.common.collect.r r4 = r0.c()
                r3.f18084c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t1.o1.a.m(s1.y3):void");
        }

        public u.b d() {
            return this.f18085d;
        }

        public u.b e() {
            if (this.f18083b.isEmpty()) {
                return null;
            }
            return (u.b) com.google.common.collect.t.c(this.f18083b);
        }

        public y3 f(u.b bVar) {
            return this.f18084c.get(bVar);
        }

        public u.b g() {
            return this.f18086e;
        }

        public u.b h() {
            return this.f18087f;
        }

        public void j(c3 c3Var) {
            this.f18085d = c(c3Var, this.f18083b, this.f18086e, this.f18082a);
        }

        public void k(List<u.b> list, u.b bVar, c3 c3Var) {
            this.f18083b = com.google.common.collect.q.v(list);
            if (!list.isEmpty()) {
                this.f18086e = list.get(0);
                this.f18087f = (u.b) p3.a.e(bVar);
            }
            if (this.f18085d == null) {
                this.f18085d = c(c3Var, this.f18083b, this.f18086e, this.f18082a);
            }
            m(c3Var.E());
        }

        public void l(c3 c3Var) {
            this.f18085d = c(c3Var, this.f18083b, this.f18086e, this.f18082a);
            m(c3Var.E());
        }
    }

    public o1(p3.d dVar) {
        this.f18073a = (p3.d) p3.a.e(dVar);
        this.f18078f = new p3.q<>(p3.n0.Q(), dVar, new q.b() { // from class: t1.j1
            @Override // p3.q.b
            public final void a(Object obj, p3.l lVar) {
                o1.J1((c) obj, lVar);
            }
        });
        y3.b bVar = new y3.b();
        this.f18074b = bVar;
        this.f18075c = new y3.d();
        this.f18076d = new a(bVar);
        this.f18077e = new SparseArray<>();
    }

    private c.a D1(u.b bVar) {
        p3.a.e(this.f18079g);
        y3 f10 = bVar == null ? null : this.f18076d.f(bVar);
        if (bVar == null || f10 == null) {
            int v10 = this.f18079g.v();
            y3 E = this.f18079g.E();
            if (!(v10 < E.t())) {
                E = y3.f17792j;
            }
            return C1(E, v10, null);
        }
        return C1(f10, f10.l(bVar.f18969a, this.f18074b).f17805l, bVar);
    }

    private c.a E1() {
        return D1(this.f18076d.e());
    }

    private c.a F1(int i10, u.b bVar) {
        p3.a.e(this.f18079g);
        if (bVar != null) {
            return this.f18076d.f(bVar) != null ? D1(bVar) : C1(y3.f17792j, i10, bVar);
        }
        y3 E = this.f18079g.E();
        if (!(i10 < E.t())) {
            E = y3.f17792j;
        }
        return C1(E, i10, null);
    }

    private c.a G1() {
        return D1(this.f18076d.g());
    }

    private c.a H1() {
        return D1(this.f18076d.h());
    }

    private c.a I1(y2 y2Var) {
        u2.s sVar;
        return (!(y2Var instanceof s1.q) || (sVar = ((s1.q) y2Var).f17484w) == null) ? B1() : D1(new u.b(sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J1(c cVar, p3.l lVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void J2(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.d(aVar, str, j10);
        cVar.m(aVar, str, j11, j10);
        cVar.q(aVar, 2, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L2(c.a aVar, v1.e eVar, c cVar) {
        cVar.o(aVar, eVar);
        cVar.n(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M2(c.a aVar, v1.e eVar, c cVar) {
        cVar.q0(aVar, eVar);
        cVar.l0(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N1(c.a aVar, String str, long j10, long j11, c cVar) {
        cVar.Y(aVar, str, j10);
        cVar.z(aVar, str, j11, j10);
        cVar.q(aVar, 1, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O2(c.a aVar, s1.n1 n1Var, v1.i iVar, c cVar) {
        cVar.W(aVar, n1Var);
        cVar.L(aVar, n1Var, iVar);
        cVar.b(aVar, 2, n1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P1(c.a aVar, v1.e eVar, c cVar) {
        cVar.j(aVar, eVar);
        cVar.n(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P2(c.a aVar, q3.z zVar, c cVar) {
        cVar.e(aVar, zVar);
        cVar.f0(aVar, zVar.f16163j, zVar.f16164k, zVar.f16165l, zVar.f16166m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q1(c.a aVar, v1.e eVar, c cVar) {
        cVar.x(aVar, eVar);
        cVar.l0(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R1(c.a aVar, s1.n1 n1Var, v1.i iVar, c cVar) {
        cVar.p(aVar, n1Var);
        cVar.T(aVar, n1Var, iVar);
        cVar.b(aVar, 1, n1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S2(c3 c3Var, c cVar, p3.l lVar) {
        cVar.N(c3Var, new c.b(lVar, this.f18077e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T2() {
        final c.a B1 = B1();
        U2(B1, 1028, new q.a() { // from class: t1.z
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).y0(c.a.this);
            }
        });
        this.f18078f.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f2(c.a aVar, int i10, c cVar) {
        cVar.a(aVar);
        cVar.k0(aVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j2(c.a aVar, boolean z10, c cVar) {
        cVar.a0(aVar, z10);
        cVar.A(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z2(c.a aVar, int i10, c3.e eVar, c3.e eVar2, c cVar) {
        cVar.C(aVar, i10);
        cVar.j0(aVar, eVar, eVar2, i10);
    }

    @Override // s1.c3.d
    public final void A(final int i10) {
        final c.a B1 = B1();
        U2(B1, 6, new q.a() { // from class: t1.g
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).r0(c.a.this, i10);
            }
        });
    }

    @Override // s1.c3.d
    public final void B(final boolean z10, final int i10) {
        final c.a B1 = B1();
        U2(B1, -1, new q.a() { // from class: t1.h1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).i0(c.a.this, z10, i10);
            }
        });
    }

    protected final c.a B1() {
        return D1(this.f18076d.d());
    }

    @Override // w1.w
    public final void C(int i10, u.b bVar, final int i11) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1022, new q.a() { // from class: t1.e
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.f2(c.a.this, i11, (c) obj);
            }
        });
    }

    protected final c.a C1(y3 y3Var, int i10, u.b bVar) {
        long j10;
        u.b bVar2 = y3Var.u() ? null : bVar;
        long a10 = this.f18073a.a();
        boolean z10 = true;
        boolean z11 = y3Var.equals(this.f18079g.E()) && i10 == this.f18079g.v();
        long j11 = 0;
        if (bVar2 != null && bVar2.b()) {
            if ((z11 && this.f18079g.u() == bVar2.f18970b && this.f18079g.z() == bVar2.f18971c) ? false : false) {
                j11 = this.f18079g.H();
            }
        } else if (z11) {
            j10 = this.f18079g.j();
            return new c.a(a10, y3Var, i10, bVar2, j10, this.f18079g.E(), this.f18079g.v(), this.f18076d.d(), this.f18079g.H(), this.f18079g.l());
        } else if (!y3Var.u()) {
            j11 = y3Var.r(i10, this.f18075c).d();
        }
        j10 = j11;
        return new c.a(a10, y3Var, i10, bVar2, j10, this.f18079g.E(), this.f18079g.v(), this.f18076d.d(), this.f18079g.H(), this.f18079g.l());
    }

    @Override // s1.c3.d
    public void D(boolean z10) {
    }

    @Override // s1.c3.d
    public void E(int i10) {
    }

    @Override // s1.c3.d
    public final void F(final y2 y2Var) {
        final c.a I1 = I1(y2Var);
        U2(I1, 10, new q.a() { // from class: t1.l0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).J(c.a.this, y2Var);
            }
        });
    }

    @Override // w1.w
    public final void G(int i10, u.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1027, new q.a() { // from class: t1.o
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).f(c.a.this);
            }
        });
    }

    @Override // t1.a
    public void H(final c3 c3Var, Looper looper) {
        p3.a.f(this.f18079g == null || this.f18076d.f18083b.isEmpty());
        this.f18079g = (c3) p3.a.e(c3Var);
        this.f18080h = this.f18073a.c(looper, null);
        this.f18078f = this.f18078f.e(looper, new q.b() { // from class: t1.i1
            @Override // p3.q.b
            public final void a(Object obj, p3.l lVar) {
                o1.this.S2(c3Var, (c) obj, lVar);
            }
        });
    }

    @Override // w1.w
    public final void I(int i10, u.b bVar, final Exception exc) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1024, new q.a() { // from class: t1.v
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).p0(c.a.this, exc);
            }
        });
    }

    @Override // t1.a
    public void J(c cVar) {
        p3.a.e(cVar);
        this.f18078f.c(cVar);
    }

    @Override // s1.c3.d
    public final void K(final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 3, new q.a() { // from class: t1.e1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.j2(c.a.this, z10, (c) obj);
            }
        });
    }

    @Override // s1.c3.d
    public void L() {
    }

    @Override // s1.c3.d
    public final void M() {
        final c.a B1 = B1();
        U2(B1, -1, new q.a() { // from class: t1.v0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).O(c.a.this);
            }
        });
    }

    @Override // s1.c3.d
    public void N(final d4 d4Var) {
        final c.a B1 = B1();
        U2(B1, 2, new q.a() { // from class: t1.p0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).r(c.a.this, d4Var);
            }
        });
    }

    @Override // s1.c3.d
    public void O(final c3.b bVar) {
        final c.a B1 = B1();
        U2(B1, 13, new q.a() { // from class: t1.o0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).y(c.a.this, bVar);
            }
        });
    }

    @Override // w1.w
    public final void P(int i10, u.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1025, new q.a() { // from class: t1.k1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).D(c.a.this);
            }
        });
    }

    @Override // u2.b0
    public final void Q(int i10, u.b bVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1005, new q.a() { // from class: t1.x0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).g(c.a.this, qVar);
            }
        });
    }

    @Override // s1.c3.d
    public void R(final a2 a2Var) {
        final c.a B1 = B1();
        U2(B1, 14, new q.a() { // from class: t1.j0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).w(c.a.this, a2Var);
            }
        });
    }

    @Override // s1.c3.d
    public final void S(final float f10) {
        final c.a H1 = H1();
        U2(H1, 22, new q.a() { // from class: t1.m1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).F(c.a.this, f10);
            }
        });
    }

    @Override // u2.b0
    public final void T(int i10, u.b bVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1004, new q.a() { // from class: t1.w0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).i(c.a.this, qVar);
            }
        });
    }

    @Override // u2.b0
    public final void U(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1000, new q.a() { // from class: t1.t0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).o0(c.a.this, nVar, qVar);
            }
        });
    }

    protected final void U2(c.a aVar, int i10, q.a<c> aVar2) {
        this.f18077e.put(i10, aVar);
        this.f18078f.k(i10, aVar2);
    }

    @Override // u2.b0
    public final void V(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1001, new q.a() { // from class: t1.r0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).s0(c.a.this, nVar, qVar);
            }
        });
    }

    @Override // s1.c3.d
    public final void W(final int i10) {
        final c.a B1 = B1();
        U2(B1, 4, new q.a() { // from class: t1.f
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).H(c.a.this, i10);
            }
        });
    }

    @Override // s1.c3.d
    public final void X(final boolean z10, final int i10) {
        final c.a B1 = B1();
        U2(B1, 5, new q.a() { // from class: t1.f1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).c0(c.a.this, z10, i10);
            }
        });
    }

    @Override // u2.b0
    public final void Y(int i10, u.b bVar, final u2.n nVar, final u2.q qVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1002, new q.a() { // from class: t1.s0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).t(c.a.this, nVar, qVar);
            }
        });
    }

    @Override // t1.a
    public final void Z(List<u.b> list, u.b bVar) {
        this.f18076d.k(list, bVar, (c3) p3.a.e(this.f18079g));
    }

    @Override // t1.a
    public void a() {
        ((p3.n) p3.a.h(this.f18080h)).k(new Runnable() { // from class: t1.d
            @Override // java.lang.Runnable
            public final void run() {
                o1.this.T2();
            }
        });
    }

    @Override // w1.w
    public final void a0(int i10, u.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1023, new q.a() { // from class: t1.k0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).m0(c.a.this);
            }
        });
    }

    @Override // s1.c3.d
    public final void b(final boolean z10) {
        final c.a H1 = H1();
        U2(H1, 23, new q.a() { // from class: t1.d1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).M(c.a.this, z10);
            }
        });
    }

    @Override // s1.c3.d
    public final void b0(final c3.e eVar, final c3.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f18081i = false;
        }
        this.f18076d.j((c3) p3.a.e(this.f18079g));
        final c.a B1 = B1();
        U2(B1, 11, new q.a() { // from class: t1.m
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.z2(c.a.this, i10, eVar, eVar2, (c) obj);
            }
        });
    }

    @Override // t1.a
    public final void c(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1014, new q.a() { // from class: t1.u
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).v(c.a.this, exc);
            }
        });
    }

    @Override // o3.f.a
    public final void c0(final int i10, final long j10, final long j11) {
        final c.a E1 = E1();
        U2(E1, 1006, new q.a() { // from class: t1.k
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).h(c.a.this, i10, j10, j11);
            }
        });
    }

    @Override // s1.c3.d
    public void d(final d3.e eVar) {
        final c.a B1 = B1();
        U2(B1, 27, new q.a() { // from class: t1.r
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).x0(c.a.this, eVar);
            }
        });
    }

    @Override // s1.c3.d
    public void d0(final y2 y2Var) {
        final c.a I1 = I1(y2Var);
        U2(I1, 10, new q.a() { // from class: t1.m0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).s(c.a.this, y2Var);
            }
        });
    }

    @Override // t1.a
    public final void e(final String str) {
        final c.a H1 = H1();
        U2(H1, 1019, new q.a() { // from class: t1.x
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).t0(c.a.this, str);
            }
        });
    }

    @Override // t1.a
    public final void e0() {
        if (this.f18081i) {
            return;
        }
        final c.a B1 = B1();
        this.f18081i = true;
        U2(B1, -1, new q.a() { // from class: t1.l1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).e0(c.a.this);
            }
        });
    }

    @Override // t1.a
    public final void f(final Object obj, final long j10) {
        final c.a H1 = H1();
        U2(H1, 26, new q.a() { // from class: t1.w
            @Override // p3.q.a
            public final void invoke(Object obj2) {
                ((c) obj2).b0(c.a.this, obj, j10);
            }
        });
    }

    @Override // w1.w
    public final void f0(int i10, u.b bVar) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1026, new q.a() { // from class: t1.g1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).l(c.a.this);
            }
        });
    }

    @Override // t1.a
    public final void g(final String str, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1016, new q.a() { // from class: t1.b0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.J2(c.a.this, str, j11, j10, (c) obj);
            }
        });
    }

    @Override // s1.c3.d
    public final void g0(y3 y3Var, final int i10) {
        this.f18076d.l((c3) p3.a.e(this.f18079g));
        final c.a B1 = B1();
        U2(B1, 0, new q.a() { // from class: t1.h
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).u0(c.a.this, i10);
            }
        });
    }

    @Override // t1.a
    public final void h(final v1.e eVar) {
        final c.a H1 = H1();
        U2(H1, 1007, new q.a() { // from class: t1.a1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.Q1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // s1.c3.d
    public final void h0(final int i10, final int i11) {
        final c.a H1 = H1();
        U2(H1, 24, new q.a() { // from class: t1.i
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).d0(c.a.this, i10, i11);
            }
        });
    }

    @Override // s1.c3.d
    public void i(final List<d3.b> list) {
        final c.a B1 = B1();
        U2(B1, 27, new q.a() { // from class: t1.c0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).I(c.a.this, list);
            }
        });
    }

    @Override // s1.c3.d
    public final void i0(final v1 v1Var, final int i10) {
        final c.a B1 = B1();
        U2(B1, 1, new q.a() { // from class: t1.i0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).Z(c.a.this, v1Var, i10);
            }
        });
    }

    @Override // t1.a
    public final void j(final long j10) {
        final c.a H1 = H1();
        U2(H1, 1010, new q.a() { // from class: t1.p
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).u(c.a.this, j10);
            }
        });
    }

    @Override // s1.c3.d
    public void j0(c3 c3Var, c3.c cVar) {
    }

    @Override // t1.a
    public final void k(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1029, new q.a() { // from class: t1.s
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).U(c.a.this, exc);
            }
        });
    }

    @Override // w1.w
    public /* synthetic */ void k0(int i10, u.b bVar) {
        w1.p.a(this, i10, bVar);
    }

    @Override // s1.c3.d
    public final void l(final int i10) {
        final c.a B1 = B1();
        U2(B1, 8, new q.a() { // from class: t1.n1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).B(c.a.this, i10);
            }
        });
    }

    @Override // s1.c3.d
    public void l0(final s1.o oVar) {
        final c.a B1 = B1();
        U2(B1, 29, new q.a() { // from class: t1.f0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).g0(c.a.this, oVar);
            }
        });
    }

    @Override // t1.a
    public final void m(final Exception exc) {
        final c.a H1 = H1();
        U2(H1, 1030, new q.a() { // from class: t1.t
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).G(c.a.this, exc);
            }
        });
    }

    @Override // u2.b0
    public final void m0(int i10, u.b bVar, final u2.n nVar, final u2.q qVar, final IOException iOException, final boolean z10) {
        final c.a F1 = F1(i10, bVar);
        U2(F1, 1003, new q.a() { // from class: t1.u0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).K(c.a.this, nVar, qVar, iOException, z10);
            }
        });
    }

    @Override // t1.a
    public final void n(final v1.e eVar) {
        final c.a G1 = G1();
        U2(G1, 1013, new q.a() { // from class: t1.z0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.P1(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // s1.c3.d
    public final void n0(final u1.e eVar) {
        final c.a H1 = H1();
        U2(H1, 20, new q.a() { // from class: t1.q0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).w0(c.a.this, eVar);
            }
        });
    }

    @Override // s1.c3.d
    public final void o(final q3.z zVar) {
        final c.a H1 = H1();
        U2(H1, 25, new q.a() { // from class: t1.e0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.P2(c.a.this, zVar, (c) obj);
            }
        });
    }

    @Override // s1.c3.d
    public void o0(final int i10, final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 30, new q.a() { // from class: t1.n
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).E(c.a.this, i10, z10);
            }
        });
    }

    @Override // s1.c3.d
    public final void p(final b3 b3Var) {
        final c.a B1 = B1();
        U2(B1, 12, new q.a() { // from class: t1.n0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).k(c.a.this, b3Var);
            }
        });
    }

    @Override // s1.c3.d
    public void p0(final boolean z10) {
        final c.a B1 = B1();
        U2(B1, 7, new q.a() { // from class: t1.c1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).n0(c.a.this, z10);
            }
        });
    }

    @Override // t1.a
    public final void q(final String str) {
        final c.a H1 = H1();
        U2(H1, 1012, new q.a() { // from class: t1.y
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).h0(c.a.this, str);
            }
        });
    }

    @Override // t1.a
    public final void r(final String str, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1008, new q.a() { // from class: t1.a0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.N1(c.a.this, str, j11, j10, (c) obj);
            }
        });
    }

    @Override // t1.a
    public final void s(final s1.n1 n1Var, final v1.i iVar) {
        final c.a H1 = H1();
        U2(H1, 1009, new q.a() { // from class: t1.h0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.R1(c.a.this, n1Var, iVar, (c) obj);
            }
        });
    }

    @Override // t1.a
    public final void t(final v1.e eVar) {
        final c.a G1 = G1();
        U2(G1, 1020, new q.a() { // from class: t1.y0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.L2(c.a.this, eVar, (c) obj);
            }
        });
    }

    @Override // t1.a
    public final void u(final int i10, final long j10, final long j11) {
        final c.a H1 = H1();
        U2(H1, 1011, new q.a() { // from class: t1.l
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).V(c.a.this, i10, j10, j11);
            }
        });
    }

    @Override // t1.a
    public final void v(final int i10, final long j10) {
        final c.a G1 = G1();
        U2(G1, 1018, new q.a() { // from class: t1.j
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).X(c.a.this, i10, j10);
            }
        });
    }

    @Override // t1.a
    public final void w(final s1.n1 n1Var, final v1.i iVar) {
        final c.a H1 = H1();
        U2(H1, 1017, new q.a() { // from class: t1.g0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.O2(c.a.this, n1Var, iVar, (c) obj);
            }
        });
    }

    @Override // s1.c3.d
    public final void x(final k2.a aVar) {
        final c.a B1 = B1();
        U2(B1, 28, new q.a() { // from class: t1.d0
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).v0(c.a.this, aVar);
            }
        });
    }

    @Override // t1.a
    public final void y(final long j10, final int i10) {
        final c.a G1 = G1();
        U2(G1, 1021, new q.a() { // from class: t1.q
            @Override // p3.q.a
            public final void invoke(Object obj) {
                ((c) obj).c(c.a.this, j10, i10);
            }
        });
    }

    @Override // t1.a
    public final void z(final v1.e eVar) {
        final c.a H1 = H1();
        U2(H1, 1015, new q.a() { // from class: t1.b1
            @Override // p3.q.a
            public final void invoke(Object obj) {
                o1.M2(c.a.this, eVar, (c) obj);
            }
        });
    }
}
