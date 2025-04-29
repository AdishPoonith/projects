package u2;

import s1.n1;
import s1.o1;
import u2.m0;
import w1.o;
import w1.w;
import w1.y;
import x1.e0;
/* loaded from: classes.dex */
public class m0 implements x1.e0 {
    private n1 A;
    private n1 B;
    private int C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* renamed from: a  reason: collision with root package name */
    private final k0 f18887a;

    /* renamed from: d  reason: collision with root package name */
    private final w1.y f18890d;

    /* renamed from: e  reason: collision with root package name */
    private final w.a f18891e;

    /* renamed from: f  reason: collision with root package name */
    private d f18892f;

    /* renamed from: g  reason: collision with root package name */
    private n1 f18893g;

    /* renamed from: h  reason: collision with root package name */
    private w1.o f18894h;

    /* renamed from: p  reason: collision with root package name */
    private int f18902p;

    /* renamed from: q  reason: collision with root package name */
    private int f18903q;

    /* renamed from: r  reason: collision with root package name */
    private int f18904r;

    /* renamed from: s  reason: collision with root package name */
    private int f18905s;

    /* renamed from: w  reason: collision with root package name */
    private boolean f18909w;

    /* renamed from: z  reason: collision with root package name */
    private boolean f18912z;

    /* renamed from: b  reason: collision with root package name */
    private final b f18888b = new b();

    /* renamed from: i  reason: collision with root package name */
    private int f18895i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private int[] f18896j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    private long[] f18897k = new long[1000];

    /* renamed from: n  reason: collision with root package name */
    private long[] f18900n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f18899m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    private int[] f18898l = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    private e0.a[] f18901o = new e0.a[1000];

    /* renamed from: c  reason: collision with root package name */
    private final r0<c> f18889c = new r0<>(new p3.h() { // from class: u2.l0
        @Override // p3.h
        public final void accept(Object obj) {
            m0.L((m0.c) obj);
        }
    });

    /* renamed from: t  reason: collision with root package name */
    private long f18906t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    private long f18907u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f18908v = Long.MIN_VALUE;

    /* renamed from: y  reason: collision with root package name */
    private boolean f18911y = true;

    /* renamed from: x  reason: collision with root package name */
    private boolean f18910x = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f18913a;

        /* renamed from: b  reason: collision with root package name */
        public long f18914b;

        /* renamed from: c  reason: collision with root package name */
        public e0.a f18915c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final n1 f18916a;

        /* renamed from: b  reason: collision with root package name */
        public final y.b f18917b;

        private c(n1 n1Var, y.b bVar) {
            this.f18916a = n1Var;
            this.f18917b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void b(n1 n1Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m0(o3.b bVar, w1.y yVar, w.a aVar) {
        this.f18890d = yVar;
        this.f18891e = aVar;
        this.f18887a = new k0(bVar);
    }

    private long B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int D = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f18900n[D]);
            if ((this.f18899m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.f18895i - 1;
            }
        }
        return j10;
    }

    private int D(int i10) {
        int i11 = this.f18904r + i10;
        int i12 = this.f18895i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean H() {
        return this.f18905s != this.f18902p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(c cVar) {
        cVar.f18917b.a();
    }

    private boolean M(int i10) {
        w1.o oVar = this.f18894h;
        return oVar == null || oVar.getState() == 4 || ((this.f18899m[i10] & 1073741824) == 0 && this.f18894h.b());
    }

    private void O(n1 n1Var, o1 o1Var) {
        n1 n1Var2 = this.f18893g;
        boolean z10 = n1Var2 == null;
        w1.m mVar = z10 ? null : n1Var2.f17422x;
        this.f18893g = n1Var;
        w1.m mVar2 = n1Var.f17422x;
        w1.y yVar = this.f18890d;
        o1Var.f17464b = yVar != null ? n1Var.c(yVar.f(n1Var)) : n1Var;
        o1Var.f17463a = this.f18894h;
        if (this.f18890d == null) {
            return;
        }
        if (z10 || !p3.n0.c(mVar, mVar2)) {
            w1.o oVar = this.f18894h;
            w1.o c10 = this.f18890d.c(this.f18891e, n1Var);
            this.f18894h = c10;
            o1Var.f17463a = c10;
            if (oVar != null) {
                oVar.d(this.f18891e);
            }
        }
    }

    private synchronized int P(o1 o1Var, v1.g gVar, boolean z10, boolean z11, b bVar) {
        gVar.f19365m = false;
        if (!H()) {
            if (!z11 && !this.f18909w) {
                n1 n1Var = this.B;
                if (n1Var == null || (!z10 && n1Var == this.f18893g)) {
                    return -3;
                }
                O((n1) p3.a.e(n1Var), o1Var);
                return -5;
            }
            gVar.v(4);
            return -4;
        }
        n1 n1Var2 = this.f18889c.e(C()).f18916a;
        if (!z10 && n1Var2 == this.f18893g) {
            int D = D(this.f18905s);
            if (!M(D)) {
                gVar.f19365m = true;
                return -3;
            }
            gVar.v(this.f18899m[D]);
            if (this.f18905s == this.f18902p - 1 && (z11 || this.f18909w)) {
                gVar.k(536870912);
            }
            long j10 = this.f18900n[D];
            gVar.f19366n = j10;
            if (j10 < this.f18906t) {
                gVar.k(Integer.MIN_VALUE);
            }
            bVar.f18913a = this.f18898l[D];
            bVar.f18914b = this.f18897k[D];
            bVar.f18915c = this.f18901o[D];
            return -4;
        }
        O(n1Var2, o1Var);
        return -5;
    }

    private void U() {
        w1.o oVar = this.f18894h;
        if (oVar != null) {
            oVar.d(this.f18891e);
            this.f18894h = null;
            this.f18893g = null;
        }
    }

    private synchronized void X() {
        this.f18905s = 0;
        this.f18887a.o();
    }

    private synchronized boolean c0(n1 n1Var) {
        this.f18911y = false;
        if (p3.n0.c(n1Var, this.B)) {
            return false;
        }
        if (!this.f18889c.g() && this.f18889c.f().f18916a.equals(n1Var)) {
            n1Var = this.f18889c.f().f18916a;
        }
        this.B = n1Var;
        n1 n1Var2 = this.B;
        this.D = p3.v.a(n1Var2.f17419u, n1Var2.f17416r);
        this.E = false;
        return true;
    }

    private synchronized boolean h(long j10) {
        if (this.f18902p == 0) {
            return j10 > this.f18907u;
        } else if (A() >= j10) {
            return false;
        } else {
            t(this.f18903q + j(j10));
            return true;
        }
    }

    private synchronized void i(long j10, int i10, long j11, int i11, e0.a aVar) {
        int i12 = this.f18902p;
        if (i12 > 0) {
            int D = D(i12 - 1);
            p3.a.a(this.f18897k[D] + ((long) this.f18898l[D]) <= j11);
        }
        this.f18909w = (536870912 & i10) != 0;
        this.f18908v = Math.max(this.f18908v, j10);
        int D2 = D(this.f18902p);
        this.f18900n[D2] = j10;
        this.f18897k[D2] = j11;
        this.f18898l[D2] = i11;
        this.f18899m[D2] = i10;
        this.f18901o[D2] = aVar;
        this.f18896j[D2] = this.C;
        if (this.f18889c.g() || !this.f18889c.f().f18916a.equals(this.B)) {
            w1.y yVar = this.f18890d;
            this.f18889c.a(G(), new c((n1) p3.a.e(this.B), yVar != null ? yVar.d(this.f18891e, this.B) : y.b.f19762a));
        }
        int i13 = this.f18902p + 1;
        this.f18902p = i13;
        int i14 = this.f18895i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            e0.a[] aVarArr = new e0.a[i15];
            int i16 = this.f18904r;
            int i17 = i14 - i16;
            System.arraycopy(this.f18897k, i16, jArr, 0, i17);
            System.arraycopy(this.f18900n, this.f18904r, jArr2, 0, i17);
            System.arraycopy(this.f18899m, this.f18904r, iArr2, 0, i17);
            System.arraycopy(this.f18898l, this.f18904r, iArr3, 0, i17);
            System.arraycopy(this.f18901o, this.f18904r, aVarArr, 0, i17);
            System.arraycopy(this.f18896j, this.f18904r, iArr, 0, i17);
            int i18 = this.f18904r;
            System.arraycopy(this.f18897k, 0, jArr, i17, i18);
            System.arraycopy(this.f18900n, 0, jArr2, i17, i18);
            System.arraycopy(this.f18899m, 0, iArr2, i17, i18);
            System.arraycopy(this.f18898l, 0, iArr3, i17, i18);
            System.arraycopy(this.f18901o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f18896j, 0, iArr, i17, i18);
            this.f18897k = jArr;
            this.f18900n = jArr2;
            this.f18899m = iArr2;
            this.f18898l = iArr3;
            this.f18901o = aVarArr;
            this.f18896j = iArr;
            this.f18904r = 0;
            this.f18895i = i15;
        }
    }

    private int j(long j10) {
        int i10 = this.f18902p;
        int D = D(i10 - 1);
        while (i10 > this.f18905s && this.f18900n[D] >= j10) {
            i10--;
            D--;
            if (D == -1) {
                D = this.f18895i - 1;
            }
        }
        return i10;
    }

    public static m0 k(o3.b bVar, w1.y yVar, w.a aVar) {
        return new m0(bVar, (w1.y) p3.a.e(yVar), (w.a) p3.a.e(aVar));
    }

    public static m0 l(o3.b bVar) {
        return new m0(bVar, null, null);
    }

    private synchronized long m(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f18902p;
        if (i11 != 0) {
            long[] jArr = this.f18900n;
            int i12 = this.f18904r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f18905s) != i11) {
                    i11 = i10 + 1;
                }
                int v10 = v(i12, i11, j10, z10);
                if (v10 == -1) {
                    return -1L;
                }
                return p(v10);
            }
        }
        return -1L;
    }

    private synchronized long n() {
        int i10 = this.f18902p;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    private long p(int i10) {
        int i11;
        this.f18907u = Math.max(this.f18907u, B(i10));
        this.f18902p -= i10;
        int i12 = this.f18903q + i10;
        this.f18903q = i12;
        int i13 = this.f18904r + i10;
        this.f18904r = i13;
        int i14 = this.f18895i;
        if (i13 >= i14) {
            this.f18904r = i13 - i14;
        }
        int i15 = this.f18905s - i10;
        this.f18905s = i15;
        if (i15 < 0) {
            this.f18905s = 0;
        }
        this.f18889c.d(i12);
        if (this.f18902p == 0) {
            int i16 = this.f18904r;
            if (i16 == 0) {
                i16 = this.f18895i;
            }
            return this.f18897k[i16 - 1] + this.f18898l[i11];
        }
        return this.f18897k[this.f18904r];
    }

    private long t(int i10) {
        int G = G() - i10;
        boolean z10 = false;
        p3.a.a(G >= 0 && G <= this.f18902p - this.f18905s);
        int i11 = this.f18902p - G;
        this.f18902p = i11;
        this.f18908v = Math.max(this.f18907u, B(i11));
        if (G == 0 && this.f18909w) {
            z10 = true;
        }
        this.f18909w = z10;
        this.f18889c.c(i10);
        int i12 = this.f18902p;
        if (i12 != 0) {
            int D = D(i12 - 1);
            return this.f18897k[D] + this.f18898l[D];
        }
        return 0L;
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f18900n;
            if (jArr[i10] > j10) {
                return i12;
            }
            if (!z10 || (this.f18899m[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f18895i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f18907u, B(this.f18905s));
    }

    public final int C() {
        return this.f18903q + this.f18905s;
    }

    public final synchronized int E(long j10, boolean z10) {
        int D = D(this.f18905s);
        if (H() && j10 >= this.f18900n[D]) {
            if (j10 > this.f18908v && z10) {
                return this.f18902p - this.f18905s;
            }
            int v10 = v(D, this.f18902p - this.f18905s, j10, true);
            if (v10 == -1) {
                return 0;
            }
            return v10;
        }
        return 0;
    }

    public final synchronized n1 F() {
        return this.f18911y ? null : this.B;
    }

    public final int G() {
        return this.f18903q + this.f18902p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void I() {
        this.f18912z = true;
    }

    public final synchronized boolean J() {
        return this.f18909w;
    }

    public synchronized boolean K(boolean z10) {
        n1 n1Var;
        boolean z11 = true;
        if (H()) {
            if (this.f18889c.e(C()).f18916a != this.f18893g) {
                return true;
            }
            return M(D(this.f18905s));
        }
        if (!z10 && !this.f18909w && ((n1Var = this.B) == null || n1Var == this.f18893g)) {
            z11 = false;
        }
        return z11;
    }

    public void N() {
        w1.o oVar = this.f18894h;
        if (oVar != null && oVar.getState() == 1) {
            throw ((o.a) p3.a.e(this.f18894h.a()));
        }
    }

    public final synchronized int Q() {
        return H() ? this.f18896j[D(this.f18905s)] : this.C;
    }

    public void R() {
        r();
        U();
    }

    public int S(o1 o1Var, v1.g gVar, int i10, boolean z10) {
        int P = P(o1Var, gVar, (i10 & 2) != 0, z10, this.f18888b);
        if (P == -4 && !gVar.r()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                k0 k0Var = this.f18887a;
                b bVar = this.f18888b;
                if (z11) {
                    k0Var.f(gVar, bVar);
                } else {
                    k0Var.m(gVar, bVar);
                }
            }
            if (!z11) {
                this.f18905s++;
            }
        }
        return P;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z10) {
        this.f18887a.n();
        this.f18902p = 0;
        this.f18903q = 0;
        this.f18904r = 0;
        this.f18905s = 0;
        this.f18910x = true;
        this.f18906t = Long.MIN_VALUE;
        this.f18907u = Long.MIN_VALUE;
        this.f18908v = Long.MIN_VALUE;
        this.f18909w = false;
        this.f18889c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f18911y = true;
        }
    }

    public final synchronized boolean Y(int i10) {
        boolean z10;
        X();
        int i11 = this.f18903q;
        if (i10 >= i11 && i10 <= this.f18902p + i11) {
            this.f18906t = Long.MIN_VALUE;
            this.f18905s = i10 - i11;
            z10 = true;
        }
        z10 = false;
        return z10;
    }

    public final synchronized boolean Z(long j10, boolean z10) {
        X();
        int D = D(this.f18905s);
        if (H() && j10 >= this.f18900n[D] && (j10 <= this.f18908v || z10)) {
            int v10 = v(D, this.f18902p - this.f18905s, j10, true);
            if (v10 == -1) {
                return false;
            }
            this.f18906t = j10;
            this.f18905s += v10;
            return true;
        }
        return false;
    }

    @Override // x1.e0
    public final int a(o3.i iVar, int i10, boolean z10, int i11) {
        return this.f18887a.p(iVar, i10, z10);
    }

    public final void a0(long j10) {
        if (this.F != j10) {
            this.F = j10;
            I();
        }
    }

    @Override // x1.e0
    public final void b(p3.a0 a0Var, int i10, int i11) {
        this.f18887a.q(a0Var, i10);
    }

    public final void b0(long j10) {
        this.f18906t = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // x1.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r12, int r14, int r15, int r16, x1.e0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f18912z
            if (r0 == 0) goto L10
            s1.n1 r0 = r8.A
            java.lang.Object r0 = p3.a.h(r0)
            s1.n1 r0 = (s1.n1) r0
            r11.e(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            boolean r4 = r8.f18910x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f18910x = r1
        L22:
            long r4 = r8.F
            long r4 = r4 + r12
            boolean r6 = r8.D
            if (r6 == 0) goto L54
            long r6 = r8.f18906t
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            s1.n1 r6 = r8.B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            p3.r.i(r6, r0)
            r8.E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.G = r1
            goto L66
        L65:
            return
        L66:
            u2.k0 r0 = r8.f18887a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.m0.c(long, int, int, int, x1.e0$a):void");
    }

    @Override // x1.e0
    public /* synthetic */ void d(p3.a0 a0Var, int i10) {
        x1.d0.b(this, a0Var, i10);
    }

    public final void d0(d dVar) {
        this.f18892f = dVar;
    }

    @Override // x1.e0
    public final void e(n1 n1Var) {
        n1 w10 = w(n1Var);
        this.f18912z = false;
        this.A = n1Var;
        boolean c02 = c0(w10);
        d dVar = this.f18892f;
        if (dVar == null || !c02) {
            return;
        }
        dVar.b(w10);
    }

    public final synchronized void e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f18905s + i10 <= this.f18902p) {
                    z10 = true;
                    p3.a.a(z10);
                    this.f18905s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z10 = false;
        p3.a.a(z10);
        this.f18905s += i10;
    }

    @Override // x1.e0
    public /* synthetic */ int f(o3.i iVar, int i10, boolean z10) {
        return x1.d0.a(this, iVar, i10, z10);
    }

    public final void f0(int i10) {
        this.C = i10;
    }

    public final void g0() {
        this.G = true;
    }

    public synchronized long o() {
        int i10 = this.f18905s;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f18887a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f18887a.b(n());
    }

    public final void s() {
        this.f18887a.b(o());
    }

    public final void u(int i10) {
        this.f18887a.c(t(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public n1 w(n1 n1Var) {
        return (this.F == 0 || n1Var.f17423y == Long.MAX_VALUE) ? n1Var : n1Var.b().k0(n1Var.f17423y + this.F).G();
    }

    public final int x() {
        return this.f18903q;
    }

    public final synchronized long y() {
        return this.f18902p == 0 ? Long.MIN_VALUE : this.f18900n[this.f18904r];
    }

    public final synchronized long z() {
        return this.f18908v;
    }
}
