package u2;

import s1.n1;
import s1.o1;
import s1.q3;
import u2.r;
/* loaded from: classes.dex */
public final class d implements r, r.a {

    /* renamed from: j  reason: collision with root package name */
    public final r f18773j;

    /* renamed from: k  reason: collision with root package name */
    private r.a f18774k;

    /* renamed from: l  reason: collision with root package name */
    private a[] f18775l = new a[0];

    /* renamed from: m  reason: collision with root package name */
    private long f18776m;

    /* renamed from: n  reason: collision with root package name */
    long f18777n;

    /* renamed from: o  reason: collision with root package name */
    long f18778o;

    /* loaded from: classes.dex */
    private final class a implements n0 {

        /* renamed from: j  reason: collision with root package name */
        public final n0 f18779j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f18780k;

        public a(n0 n0Var) {
            this.f18779j = n0Var;
        }

        public void a() {
            this.f18780k = false;
        }

        @Override // u2.n0
        public void b() {
            this.f18779j.b();
        }

        @Override // u2.n0
        public boolean d() {
            return !d.this.o() && this.f18779j.d();
        }

        @Override // u2.n0
        public int k(o1 o1Var, v1.g gVar, int i10) {
            if (d.this.o()) {
                return -3;
            }
            if (this.f18780k) {
                gVar.v(4);
                return -4;
            }
            int k10 = this.f18779j.k(o1Var, gVar, i10);
            if (k10 == -5) {
                n1 n1Var = (n1) p3.a.e(o1Var.f17464b);
                int i11 = n1Var.K;
                if (i11 != 0 || n1Var.L != 0) {
                    d dVar = d.this;
                    if (dVar.f18777n != 0) {
                        i11 = 0;
                    }
                    o1Var.f17464b = n1Var.b().P(i11).Q(dVar.f18778o == Long.MIN_VALUE ? n1Var.L : 0).G();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f18778o;
            if (j10 == Long.MIN_VALUE || ((k10 != -4 || gVar.f19366n < j10) && !(k10 == -3 && dVar2.f() == Long.MIN_VALUE && !gVar.f19365m))) {
                return k10;
            }
            gVar.l();
            gVar.v(4);
            this.f18780k = true;
            return -4;
        }

        @Override // u2.n0
        public int t(long j10) {
            if (d.this.o()) {
                return -3;
            }
            return this.f18779j.t(j10);
        }
    }

    public d(r rVar, boolean z10, long j10, long j11) {
        this.f18773j = rVar;
        this.f18776m = z10 ? j10 : -9223372036854775807L;
        this.f18777n = j10;
        this.f18778o = j11;
    }

    private q3 d(long j10, q3 q3Var) {
        long r10 = p3.n0.r(q3Var.f17502a, 0L, j10 - this.f18777n);
        long j11 = q3Var.f17503b;
        long j12 = this.f18778o;
        long r11 = p3.n0.r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (r10 == q3Var.f17502a && r11 == q3Var.f17503b) ? q3Var : new q3(r10, r11);
    }

    private static boolean u(long j10, n3.t[] tVarArr) {
        if (j10 != 0) {
            for (n3.t tVar : tVarArr) {
                if (tVar != null) {
                    n1 m10 = tVar.m();
                    if (!p3.v.a(m10.f17419u, m10.f17416r)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.f18773j.a();
    }

    @Override // u2.r, u2.o0
    public long c() {
        long c10 = this.f18773j.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.f18778o;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.r
    public long e(long j10, q3 q3Var) {
        long j11 = this.f18777n;
        if (j10 == j11) {
            return j11;
        }
        return this.f18773j.e(j10, d(j10, q3Var));
    }

    @Override // u2.r, u2.o0
    public long f() {
        long f10 = this.f18773j.f();
        if (f10 != Long.MIN_VALUE) {
            long j10 = this.f18778o;
            if (j10 == Long.MIN_VALUE || f10 < j10) {
                return f10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        return this.f18773j.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        this.f18773j.h(j10);
    }

    @Override // u2.r.a
    public void i(r rVar) {
        ((r.a) p3.a.e(this.f18774k)).i(this);
    }

    @Override // u2.r
    public void j(r.a aVar, long j10) {
        this.f18774k = aVar;
        this.f18773j.j(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // u2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m(n3.t[] r13, boolean[] r14, u2.n0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            u2.d$a[] r2 = new u2.d.a[r2]
            r0.f18775l = r2
            int r2 = r1.length
            u2.n0[] r9 = new u2.n0[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            u2.d$a[] r3 = r0.f18775l
            r4 = r1[r2]
            u2.d$a r4 = (u2.d.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            u2.n0 r11 = r3.f18779j
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            u2.r r2 = r0.f18773j
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.m(r3, r4, r5, r6, r7)
            boolean r4 = r12.o()
            if (r4 == 0) goto L47
            long r4 = r0.f18777n
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = u(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.f18776m = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.f18777n
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L65
            long r4 = r0.f18778o
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L67
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L65
            goto L67
        L65:
            r4 = 0
            goto L68
        L67:
            r4 = 1
        L68:
            p3.a.f(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L97
            r4 = r9[r10]
            if (r4 != 0) goto L77
            u2.d$a[] r4 = r0.f18775l
            r4[r10] = r11
            goto L8e
        L77:
            u2.d$a[] r4 = r0.f18775l
            r5 = r4[r10]
            if (r5 == 0) goto L85
            r5 = r4[r10]
            u2.n0 r5 = r5.f18779j
            r6 = r9[r10]
            if (r5 == r6) goto L8e
        L85:
            u2.d$a r5 = new u2.d$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L8e:
            u2.d$a[] r4 = r0.f18775l
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.m(n3.t[], boolean[], u2.n0[], boolean[], long):long");
    }

    @Override // u2.r
    public long n() {
        if (o()) {
            long j10 = this.f18776m;
            this.f18776m = -9223372036854775807L;
            long n10 = n();
            return n10 != -9223372036854775807L ? n10 : j10;
        }
        long n11 = this.f18773j.n();
        if (n11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        p3.a.f(n11 >= this.f18777n);
        long j11 = this.f18778o;
        if (j11 != Long.MIN_VALUE && n11 > j11) {
            z10 = false;
        }
        p3.a.f(z10);
        return n11;
    }

    boolean o() {
        return this.f18776m != -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        return this.f18773j.p();
    }

    @Override // u2.r
    public void q() {
        this.f18773j.q();
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        this.f18773j.r(j10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r7) goto L18;
     */
    @Override // u2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long s(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f18776m = r0
            u2.d$a[] r0 = r6.f18775l
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.a()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            u2.r r0 = r6.f18773j
            long r0 = r0.s(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.f18777n
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.f18778o
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            p3.a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.d.s(long):long");
    }

    @Override // u2.o0.a
    /* renamed from: t */
    public void l(r rVar) {
        ((r.a) p3.a.e(this.f18774k)).l(this);
    }

    public void v(long j10, long j11) {
        this.f18777n = j10;
        this.f18778o = j11;
    }
}
