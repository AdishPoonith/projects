package e2;

import android.net.Uri;
import e2.g;
import java.io.EOFException;
import java.util.Map;
import k2.a;
import p2.h;
import p3.a0;
import p3.n0;
import s1.n1;
import u1.h0;
import x1.e0;
import x1.k;
import x1.l;
import x1.m;
import x1.n;
import x1.q;
import x1.r;
import x1.x;
import x1.y;
/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: u  reason: collision with root package name */
    public static final r f7996u = new r() { // from class: e2.e
        @Override // x1.r
        public final l[] a() {
            l[] p10;
            p10 = f.p();
            return p10;
        }

        @Override // x1.r
        public /* synthetic */ l[] b(Uri uri, Map map) {
            return q.a(this, uri, map);
        }
    };

    /* renamed from: v  reason: collision with root package name */
    private static final h.a f7997v = new h.a() { // from class: e2.d
        @Override // p2.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            boolean q10;
            q10 = f.q(i10, i11, i12, i13, i14);
            return q10;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final int f7998a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7999b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f8000c;

    /* renamed from: d  reason: collision with root package name */
    private final h0.a f8001d;

    /* renamed from: e  reason: collision with root package name */
    private final x f8002e;

    /* renamed from: f  reason: collision with root package name */
    private final y f8003f;

    /* renamed from: g  reason: collision with root package name */
    private final e0 f8004g;

    /* renamed from: h  reason: collision with root package name */
    private n f8005h;

    /* renamed from: i  reason: collision with root package name */
    private e0 f8006i;

    /* renamed from: j  reason: collision with root package name */
    private e0 f8007j;

    /* renamed from: k  reason: collision with root package name */
    private int f8008k;

    /* renamed from: l  reason: collision with root package name */
    private k2.a f8009l;

    /* renamed from: m  reason: collision with root package name */
    private long f8010m;

    /* renamed from: n  reason: collision with root package name */
    private long f8011n;

    /* renamed from: o  reason: collision with root package name */
    private long f8012o;

    /* renamed from: p  reason: collision with root package name */
    private int f8013p;

    /* renamed from: q  reason: collision with root package name */
    private g f8014q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f8015r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f8016s;

    /* renamed from: t  reason: collision with root package name */
    private long f8017t;

    public f() {
        this(0);
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f7998a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f7999b = j10;
        this.f8000c = new a0(10);
        this.f8001d = new h0.a();
        this.f8002e = new x();
        this.f8010m = -9223372036854775807L;
        this.f8003f = new y();
        k kVar = new k();
        this.f8004g = kVar;
        this.f8007j = kVar;
    }

    private void f() {
        p3.a.h(this.f8006i);
        n0.j(this.f8005h);
    }

    private g g(m mVar) {
        long m10;
        long j10;
        long h10;
        long e10;
        g s10 = s(mVar);
        c r10 = r(this.f8009l, mVar.p());
        if (this.f8015r) {
            return new g.a();
        }
        if ((this.f7998a & 4) != 0) {
            if (r10 != null) {
                h10 = r10.h();
                e10 = r10.e();
            } else if (s10 != null) {
                h10 = s10.h();
                e10 = s10.e();
            } else {
                m10 = m(this.f8009l);
                j10 = -1;
                s10 = new b(m10, mVar.p(), j10);
            }
            j10 = e10;
            m10 = h10;
            s10 = new b(m10, mVar.p(), j10);
        } else if (r10 != null) {
            s10 = r10;
        } else if (s10 == null) {
            s10 = null;
        }
        if (s10 == null || !(s10.f() || (this.f7998a & 1) == 0)) {
            return l(mVar, (this.f7998a & 2) != 0);
        }
        return s10;
    }

    private long h(long j10) {
        return this.f8010m + ((j10 * 1000000) / this.f8001d.f18611d);
    }

    private g l(m mVar, boolean z10) {
        mVar.n(this.f8000c.e(), 0, 4);
        this.f8000c.T(0);
        this.f8001d.a(this.f8000c.p());
        return new a(mVar.a(), mVar.p(), this.f8001d, z10);
    }

    private static long m(k2.a aVar) {
        if (aVar != null) {
            int e10 = aVar.e();
            for (int i10 = 0; i10 < e10; i10++) {
                a.b d10 = aVar.d(i10);
                if (d10 instanceof p2.m) {
                    p2.m mVar = (p2.m) d10;
                    if (mVar.f15312j.equals("TLEN")) {
                        return n0.B0(Long.parseLong(mVar.f15325m.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private static int n(a0 a0Var, int i10) {
        if (a0Var.g() >= i10 + 4) {
            a0Var.T(i10);
            int p10 = a0Var.p();
            if (p10 == 1483304551 || p10 == 1231971951) {
                return p10;
            }
        }
        if (a0Var.g() >= 40) {
            a0Var.T(36);
            return a0Var.p() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private static boolean o(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l[] p() {
        return new l[]{new f()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean q(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static c r(k2.a aVar, long j10) {
        if (aVar != null) {
            int e10 = aVar.e();
            for (int i10 = 0; i10 < e10; i10++) {
                a.b d10 = aVar.d(i10);
                if (d10 instanceof p2.k) {
                    return c.a(j10, (p2.k) d10, m(aVar));
                }
            }
            return null;
        }
        return null;
    }

    private g s(m mVar) {
        int i10;
        a0 a0Var = new a0(this.f8001d.f18610c);
        mVar.n(a0Var.e(), 0, this.f8001d.f18610c);
        h0.a aVar = this.f8001d;
        int i11 = aVar.f18608a & 1;
        int i12 = aVar.f18612e;
        if (i11 != 0) {
            if (i12 != 1) {
                i10 = 36;
            }
            i10 = 21;
        } else {
            if (i12 == 1) {
                i10 = 13;
            }
            i10 = 21;
        }
        int n10 = n(a0Var, i10);
        if (n10 != 1483304551 && n10 != 1231971951) {
            if (n10 != 1447187017) {
                mVar.f();
                return null;
            }
            h a10 = h.a(mVar.a(), mVar.p(), this.f8001d, a0Var);
            mVar.g(this.f8001d.f18610c);
            return a10;
        }
        i a11 = i.a(mVar.a(), mVar.p(), this.f8001d, a0Var);
        if (a11 != null && !this.f8002e.a()) {
            mVar.f();
            mVar.o(i10 + 141);
            mVar.n(this.f8000c.e(), 0, 3);
            this.f8000c.T(0);
            this.f8002e.d(this.f8000c.J());
        }
        mVar.g(this.f8001d.f18610c);
        return (a11 == null || a11.f() || n10 != 1231971951) ? a11 : l(mVar, false);
    }

    private boolean t(m mVar) {
        g gVar = this.f8014q;
        if (gVar != null) {
            long e10 = gVar.e();
            if (e10 != -1 && mVar.l() > e10 - 4) {
                return true;
            }
        }
        try {
            return !mVar.k(this.f8000c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int u(m mVar) {
        if (this.f8008k == 0) {
            try {
                w(mVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f8014q == null) {
            g g10 = g(mVar);
            this.f8014q = g10;
            this.f8005h.t(g10);
            this.f8007j.e(new n1.b().g0(this.f8001d.f18609b).Y(4096).J(this.f8001d.f18612e).h0(this.f8001d.f18611d).P(this.f8002e.f20212a).Q(this.f8002e.f20213b).Z((this.f7998a & 8) != 0 ? null : this.f8009l).G());
            this.f8012o = mVar.p();
        } else if (this.f8012o != 0) {
            long p10 = mVar.p();
            long j10 = this.f8012o;
            if (p10 < j10) {
                mVar.g((int) (j10 - p10));
            }
        }
        return v(mVar);
    }

    private int v(m mVar) {
        h0.a aVar;
        if (this.f8013p == 0) {
            mVar.f();
            if (t(mVar)) {
                return -1;
            }
            this.f8000c.T(0);
            int p10 = this.f8000c.p();
            if (!o(p10, this.f8008k) || h0.j(p10) == -1) {
                mVar.g(1);
                this.f8008k = 0;
                return 0;
            }
            this.f8001d.a(p10);
            if (this.f8010m == -9223372036854775807L) {
                this.f8010m = this.f8014q.d(mVar.p());
                if (this.f7999b != -9223372036854775807L) {
                    this.f8010m += this.f7999b - this.f8014q.d(0L);
                }
            }
            this.f8013p = this.f8001d.f18610c;
            g gVar = this.f8014q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(h(this.f8011n + aVar.f18614g), mVar.p() + this.f8001d.f18610c);
                if (this.f8016s && bVar.a(this.f8017t)) {
                    this.f8016s = false;
                    this.f8007j = this.f8006i;
                }
            }
        }
        int f10 = this.f8007j.f(mVar, this.f8013p, true);
        if (f10 == -1) {
            return -1;
        }
        int i10 = this.f8013p - f10;
        this.f8013p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f8007j.c(h(this.f8011n), 1, this.f8001d.f18610c, 0, null);
        this.f8011n += this.f8001d.f18614g;
        this.f8013p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r13 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
        r12.g(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
        r12.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
        r11.f8008k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean w(x1.m r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.f()
            long r1 = r12.p()
            r3 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L42
            int r1 = r11.f7998a
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L25
            r1 = r5
            goto L27
        L25:
            p2.h$a r1 = e2.f.f7997v
        L27:
            x1.y r2 = r11.f8003f
            k2.a r1 = r2.a(r12, r1)
            r11.f8009l = r1
            if (r1 == 0) goto L36
            x1.x r2 = r11.f8002e
            r2.c(r1)
        L36:
            long r1 = r12.l()
            int r2 = (int) r1
            if (r13 != 0) goto L40
            r12.g(r2)
        L40:
            r1 = 0
            goto L44
        L42:
            r1 = 0
            r2 = 0
        L44:
            r3 = 0
            r4 = 0
        L46:
            boolean r8 = r11.t(r12)
            if (r8 == 0) goto L55
            if (r3 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            p3.a0 r8 = r11.f8000c
            r8.T(r7)
            p3.a0 r8 = r11.f8000c
            int r8 = r8.p()
            if (r1 == 0) goto L69
            long r9 = (long) r1
            boolean r9 = o(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = u1.h0.j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r1 = r4 + 1
            if (r4 != r0) goto L7e
            if (r13 == 0) goto L77
            return r7
        L77:
            java.lang.String r12 = "Searched too many bytes."
            s1.u2 r12 = s1.u2.a(r12, r5)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.f()
            int r3 = r2 + r1
            r12.o(r3)
            goto L8c
        L89:
            r12.g(r6)
        L8c:
            r4 = r1
            r1 = 0
            r3 = 0
            goto L46
        L90:
            int r3 = r3 + 1
            if (r3 != r6) goto L9b
            u1.h0$a r1 = r11.f8001d
            r1.a(r8)
            r1 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r3 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r2 = r2 + r4
            r12.g(r2)
            goto La8
        La5:
            r12.f()
        La8:
            r11.f8008k = r1
            return r6
        Lab:
            int r9 = r9 + (-4)
            r12.o(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f.w(x1.m, boolean):boolean");
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f8008k = 0;
        this.f8010m = -9223372036854775807L;
        this.f8011n = 0L;
        this.f8013p = 0;
        this.f8017t = j11;
        g gVar = this.f8014q;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f8016s = true;
        this.f8007j = this.f8004g;
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f8005h = nVar;
        e0 d10 = nVar.d(0, 1);
        this.f8006i = d10;
        this.f8007j = d10;
        this.f8005h.k();
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        f();
        int u10 = u(mVar);
        if (u10 == -1 && (this.f8014q instanceof b)) {
            long h10 = h(this.f8011n);
            if (this.f8014q.h() != h10) {
                ((b) this.f8014q).c(h10);
                this.f8005h.t(this.f8014q);
            }
        }
        return u10;
    }

    @Override // x1.l
    public boolean j(m mVar) {
        return w(mVar, true);
    }

    public void k() {
        this.f8015r = true;
    }
}
