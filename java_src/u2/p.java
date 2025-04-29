package u2;

import s1.v1;
import s1.y3;
import u2.u;
/* loaded from: classes.dex */
public final class p extends x0 {
    private boolean A;
    private boolean B;
    private boolean C;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f18935v;

    /* renamed from: w  reason: collision with root package name */
    private final y3.d f18936w;

    /* renamed from: x  reason: collision with root package name */
    private final y3.b f18937x;

    /* renamed from: y  reason: collision with root package name */
    private a f18938y;

    /* renamed from: z  reason: collision with root package name */
    private o f18939z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends l {

        /* renamed from: r  reason: collision with root package name */
        public static final Object f18940r = new Object();

        /* renamed from: p  reason: collision with root package name */
        private final Object f18941p;

        /* renamed from: q  reason: collision with root package name */
        private final Object f18942q;

        private a(y3 y3Var, Object obj, Object obj2) {
            super(y3Var);
            this.f18941p = obj;
            this.f18942q = obj2;
        }

        public static a y(v1 v1Var) {
            return new a(new b(v1Var), y3.d.A, f18940r);
        }

        public static a z(y3 y3Var, Object obj, Object obj2) {
            return new a(y3Var, obj, obj2);
        }

        @Override // u2.l, s1.y3
        public int f(Object obj) {
            Object obj2;
            y3 y3Var = this.f18880o;
            if (f18940r.equals(obj) && (obj2 = this.f18942q) != null) {
                obj = obj2;
            }
            return y3Var.f(obj);
        }

        @Override // u2.l, s1.y3
        public y3.b k(int i10, y3.b bVar, boolean z10) {
            this.f18880o.k(i10, bVar, z10);
            if (p3.n0.c(bVar.f17804k, this.f18942q) && z10) {
                bVar.f17804k = f18940r;
            }
            return bVar;
        }

        @Override // u2.l, s1.y3
        public Object q(int i10) {
            Object q10 = this.f18880o.q(i10);
            return p3.n0.c(q10, this.f18942q) ? f18940r : q10;
        }

        @Override // u2.l, s1.y3
        public y3.d s(int i10, y3.d dVar, long j10) {
            this.f18880o.s(i10, dVar, j10);
            if (p3.n0.c(dVar.f17814j, this.f18941p)) {
                dVar.f17814j = y3.d.A;
            }
            return dVar;
        }

        public a x(y3 y3Var) {
            return new a(y3Var, this.f18941p, this.f18942q);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends y3 {

        /* renamed from: o  reason: collision with root package name */
        private final v1 f18943o;

        public b(v1 v1Var) {
            this.f18943o = v1Var;
        }

        @Override // s1.y3
        public int f(Object obj) {
            return obj == a.f18940r ? 0 : -1;
        }

        @Override // s1.y3
        public y3.b k(int i10, y3.b bVar, boolean z10) {
            bVar.v(z10 ? 0 : null, z10 ? a.f18940r : null, 0, -9223372036854775807L, 0L, v2.c.f19395p, true);
            return bVar;
        }

        @Override // s1.y3
        public int m() {
            return 1;
        }

        @Override // s1.y3
        public Object q(int i10) {
            return a.f18940r;
        }

        @Override // s1.y3
        public y3.d s(int i10, y3.d dVar, long j10) {
            dVar.h(y3.d.A, this.f18943o, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f17825u = true;
            return dVar;
        }

        @Override // s1.y3
        public int t() {
            return 1;
        }
    }

    public p(u uVar, boolean z10) {
        super(uVar);
        this.f18935v = z10 && uVar.g();
        this.f18936w = new y3.d();
        this.f18937x = new y3.b();
        y3 j10 = uVar.j();
        if (j10 == null) {
            this.f18938y = a.y(uVar.a());
            return;
        }
        this.f18938y = a.z(j10, null, null);
        this.C = true;
    }

    private Object X(Object obj) {
        return (this.f18938y.f18942q == null || !this.f18938y.f18942q.equals(obj)) ? obj : a.f18940r;
    }

    private Object Y(Object obj) {
        return (this.f18938y.f18942q == null || !obj.equals(a.f18940r)) ? obj : this.f18938y.f18942q;
    }

    private void a0(long j10) {
        o oVar = this.f18939z;
        int f10 = this.f18938y.f(oVar.f18926j.f18969a);
        if (f10 == -1) {
            return;
        }
        long j11 = this.f18938y.j(f10, this.f18937x).f17806m;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.w(j10);
    }

    @Override // u2.f, u2.a
    public void E() {
        this.B = false;
        this.A = false;
        super.E();
    }

    @Override // u2.x0
    protected u.b N(u.b bVar) {
        return bVar.c(X(bVar.f18969a));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // u2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void T(s1.y3 r15) {
        /*
            r14 = this;
            boolean r0 = r14.B
            if (r0 == 0) goto L19
            u2.p$a r0 = r14.f18938y
            u2.p$a r15 = r0.x(r15)
            r14.f18938y = r15
            u2.o r15 = r14.f18939z
            if (r15 == 0) goto Lae
            long r0 = r15.o()
            r14.a0(r0)
            goto Lae
        L19:
            boolean r0 = r15.u()
            if (r0 == 0) goto L36
            boolean r0 = r14.C
            if (r0 == 0) goto L2a
            u2.p$a r0 = r14.f18938y
            u2.p$a r15 = r0.x(r15)
            goto L32
        L2a:
            java.lang.Object r0 = s1.y3.d.A
            java.lang.Object r1 = u2.p.a.f18940r
            u2.p$a r15 = u2.p.a.z(r15, r0, r1)
        L32:
            r14.f18938y = r15
            goto Lae
        L36:
            s1.y3$d r0 = r14.f18936w
            r1 = 0
            r15.r(r1, r0)
            s1.y3$d r0 = r14.f18936w
            long r2 = r0.e()
            s1.y3$d r0 = r14.f18936w
            java.lang.Object r0 = r0.f17814j
            u2.o r4 = r14.f18939z
            if (r4 == 0) goto L74
            long r4 = r4.t()
            u2.p$a r6 = r14.f18938y
            u2.o r7 = r14.f18939z
            u2.u$b r7 = r7.f18926j
            java.lang.Object r7 = r7.f18969a
            s1.y3$b r8 = r14.f18937x
            r6.l(r7, r8)
            s1.y3$b r6 = r14.f18937x
            long r6 = r6.q()
            long r6 = r6 + r4
            u2.p$a r4 = r14.f18938y
            s1.y3$d r5 = r14.f18936w
            s1.y3$d r1 = r4.r(r1, r5)
            long r4 = r1.e()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            s1.y3$d r9 = r14.f18936w
            s1.y3$b r10 = r14.f18937x
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.n(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.C
            if (r1 == 0) goto L94
            u2.p$a r0 = r14.f18938y
            u2.p$a r15 = r0.x(r15)
            goto L98
        L94:
            u2.p$a r15 = u2.p.a.z(r15, r0, r2)
        L98:
            r14.f18938y = r15
            u2.o r15 = r14.f18939z
            if (r15 == 0) goto Lae
            r14.a0(r3)
            u2.u$b r15 = r15.f18926j
            java.lang.Object r0 = r15.f18969a
            java.lang.Object r0 = r14.Y(r0)
            u2.u$b r15 = r15.c(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.C = r0
            r14.B = r0
            u2.p$a r0 = r14.f18938y
            r14.D(r0)
            if (r15 == 0) goto Lc6
            u2.o r0 = r14.f18939z
            java.lang.Object r0 = p3.a.e(r0)
            u2.o r0 = (u2.o) r0
            r0.d(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.p.T(s1.y3):void");
    }

    @Override // u2.x0
    public void V() {
        if (this.f18935v) {
            return;
        }
        this.A = true;
        U();
    }

    @Override // u2.u
    /* renamed from: W */
    public o n(u.b bVar, o3.b bVar2, long j10) {
        o oVar = new o(bVar, bVar2, j10);
        oVar.y(this.f19004t);
        if (this.B) {
            oVar.d(bVar.c(Y(bVar.f18969a)));
        } else {
            this.f18939z = oVar;
            if (!this.A) {
                this.A = true;
                U();
            }
        }
        return oVar;
    }

    public y3 Z() {
        return this.f18938y;
    }

    @Override // u2.u
    public void b(r rVar) {
        ((o) rVar).x();
        if (rVar == this.f18939z) {
            this.f18939z = null;
        }
    }

    @Override // u2.u
    public void f() {
    }
}
