package u2;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o3.g0;
import o3.h0;
import o3.p;
import s1.n1;
import s1.o1;
import s1.q3;
import s1.u2;
import u2.b0;
import u2.m;
import u2.m0;
import u2.r;
import w1.w;
import x1.b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h0 implements r, x1.n, h0.b<a>, h0.f, m0.d {
    private static final Map<String, String> V = L();
    private static final n1 W = new n1.b().U("icy").g0("application/x-icy").G();
    private o2.b A;
    private boolean D;
    private boolean E;
    private boolean F;
    private e G;
    private x1.b0 H;
    private boolean J;
    private boolean L;
    private boolean M;
    private int N;
    private boolean O;
    private long P;
    private boolean R;
    private int S;
    private boolean T;
    private boolean U;

    /* renamed from: j  reason: collision with root package name */
    private final Uri f18800j;

    /* renamed from: k  reason: collision with root package name */
    private final o3.l f18801k;

    /* renamed from: l  reason: collision with root package name */
    private final w1.y f18802l;

    /* renamed from: m  reason: collision with root package name */
    private final o3.g0 f18803m;

    /* renamed from: n  reason: collision with root package name */
    private final b0.a f18804n;

    /* renamed from: o  reason: collision with root package name */
    private final w.a f18805o;

    /* renamed from: p  reason: collision with root package name */
    private final b f18806p;

    /* renamed from: q  reason: collision with root package name */
    private final o3.b f18807q;

    /* renamed from: r  reason: collision with root package name */
    private final String f18808r;

    /* renamed from: s  reason: collision with root package name */
    private final long f18809s;

    /* renamed from: u  reason: collision with root package name */
    private final c0 f18811u;

    /* renamed from: z  reason: collision with root package name */
    private r.a f18816z;

    /* renamed from: t  reason: collision with root package name */
    private final o3.h0 f18810t = new o3.h0("ProgressiveMediaPeriod");

    /* renamed from: v  reason: collision with root package name */
    private final p3.g f18812v = new p3.g();

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f18813w = new Runnable() { // from class: u2.d0
        @Override // java.lang.Runnable
        public final void run() {
            h0.this.U();
        }
    };

    /* renamed from: x  reason: collision with root package name */
    private final Runnable f18814x = new Runnable() { // from class: u2.f0
        @Override // java.lang.Runnable
        public final void run() {
            h0.this.R();
        }
    };

    /* renamed from: y  reason: collision with root package name */
    private final Handler f18815y = p3.n0.w();
    private d[] C = new d[0];
    private m0[] B = new m0[0];
    private long Q = -9223372036854775807L;
    private long I = -9223372036854775807L;
    private int K = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements h0.e, m.a {

        /* renamed from: b  reason: collision with root package name */
        private final Uri f18818b;

        /* renamed from: c  reason: collision with root package name */
        private final o3.o0 f18819c;

        /* renamed from: d  reason: collision with root package name */
        private final c0 f18820d;

        /* renamed from: e  reason: collision with root package name */
        private final x1.n f18821e;

        /* renamed from: f  reason: collision with root package name */
        private final p3.g f18822f;

        /* renamed from: h  reason: collision with root package name */
        private volatile boolean f18824h;

        /* renamed from: j  reason: collision with root package name */
        private long f18826j;

        /* renamed from: l  reason: collision with root package name */
        private x1.e0 f18828l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f18829m;

        /* renamed from: g  reason: collision with root package name */
        private final x1.a0 f18823g = new x1.a0();

        /* renamed from: i  reason: collision with root package name */
        private boolean f18825i = true;

        /* renamed from: a  reason: collision with root package name */
        private final long f18817a = n.a();

        /* renamed from: k  reason: collision with root package name */
        private o3.p f18827k = i(0);

        public a(Uri uri, o3.l lVar, c0 c0Var, x1.n nVar, p3.g gVar) {
            this.f18818b = uri;
            this.f18819c = new o3.o0(lVar);
            this.f18820d = c0Var;
            this.f18821e = nVar;
            this.f18822f = gVar;
        }

        private o3.p i(long j10) {
            return new p.b().i(this.f18818b).h(j10).f(h0.this.f18808r).b(6).e(h0.V).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f18823g.f20102a = j10;
            this.f18826j = j11;
            this.f18825i = true;
            this.f18829m = false;
        }

        @Override // u2.m.a
        public void a(p3.a0 a0Var) {
            long max = !this.f18829m ? this.f18826j : Math.max(h0.this.N(true), this.f18826j);
            int a10 = a0Var.a();
            x1.e0 e0Var = (x1.e0) p3.a.e(this.f18828l);
            e0Var.d(a0Var, a10);
            e0Var.c(max, 1, a10, 0, null);
            this.f18829m = true;
        }

        @Override // o3.h0.e
        public void b() {
            int i10 = 0;
            while (i10 == 0 && !this.f18824h) {
                try {
                    long j10 = this.f18823g.f20102a;
                    o3.p i11 = i(j10);
                    this.f18827k = i11;
                    long m10 = this.f18819c.m(i11);
                    if (m10 != -1) {
                        m10 += j10;
                        h0.this.Z();
                    }
                    long j11 = m10;
                    h0.this.A = o2.b.a(this.f18819c.e());
                    o3.i iVar = this.f18819c;
                    if (h0.this.A != null && h0.this.A.f14400o != -1) {
                        iVar = new m(this.f18819c, h0.this.A.f14400o, this);
                        x1.e0 O = h0.this.O();
                        this.f18828l = O;
                        O.e(h0.W);
                    }
                    long j12 = j10;
                    this.f18820d.d(iVar, this.f18818b, this.f18819c.e(), j10, j11, this.f18821e);
                    if (h0.this.A != null) {
                        this.f18820d.f();
                    }
                    if (this.f18825i) {
                        this.f18820d.b(j12, this.f18826j);
                        this.f18825i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f18824h) {
                            try {
                                this.f18822f.a();
                                i10 = this.f18820d.c(this.f18823g);
                                j12 = this.f18820d.e();
                                if (j12 > h0.this.f18809s + j13) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f18822f.c();
                        h0.this.f18815y.post(h0.this.f18814x);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f18820d.e() != -1) {
                        this.f18823g.f20102a = this.f18820d.e();
                    }
                    o3.o.a(this.f18819c);
                } catch (Throwable th) {
                    if (i10 != 1 && this.f18820d.e() != -1) {
                        this.f18823g.f20102a = this.f18820d.e();
                    }
                    o3.o.a(this.f18819c);
                    throw th;
                }
            }
        }

        @Override // o3.h0.e
        public void c() {
            this.f18824h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void r(long j10, boolean z10, boolean z11);
    }

    /* loaded from: classes.dex */
    private final class c implements n0 {

        /* renamed from: j  reason: collision with root package name */
        private final int f18831j;

        public c(int i10) {
            this.f18831j = i10;
        }

        @Override // u2.n0
        public void b() {
            h0.this.Y(this.f18831j);
        }

        @Override // u2.n0
        public boolean d() {
            return h0.this.Q(this.f18831j);
        }

        @Override // u2.n0
        public int k(o1 o1Var, v1.g gVar, int i10) {
            return h0.this.e0(this.f18831j, o1Var, gVar, i10);
        }

        @Override // u2.n0
        public int t(long j10) {
            return h0.this.i0(this.f18831j, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f18833a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f18834b;

        public d(int i10, boolean z10) {
            this.f18833a = i10;
            this.f18834b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f18833a == dVar.f18833a && this.f18834b == dVar.f18834b;
        }

        public int hashCode() {
            return (this.f18833a * 31) + (this.f18834b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final v0 f18835a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f18836b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f18837c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f18838d;

        public e(v0 v0Var, boolean[] zArr) {
            this.f18835a = v0Var;
            this.f18836b = zArr;
            int i10 = v0Var.f18991j;
            this.f18837c = new boolean[i10];
            this.f18838d = new boolean[i10];
        }
    }

    public h0(Uri uri, o3.l lVar, c0 c0Var, w1.y yVar, w.a aVar, o3.g0 g0Var, b0.a aVar2, b bVar, o3.b bVar2, String str, int i10) {
        this.f18800j = uri;
        this.f18801k = lVar;
        this.f18802l = yVar;
        this.f18805o = aVar;
        this.f18803m = g0Var;
        this.f18804n = aVar2;
        this.f18806p = bVar;
        this.f18807q = bVar2;
        this.f18808r = str;
        this.f18809s = i10;
        this.f18811u = c0Var;
    }

    private void J() {
        p3.a.f(this.E);
        p3.a.e(this.G);
        p3.a.e(this.H);
    }

    private boolean K(a aVar, int i10) {
        x1.b0 b0Var;
        if (this.O || !((b0Var = this.H) == null || b0Var.h() == -9223372036854775807L)) {
            this.S = i10;
            return true;
        }
        if (this.E && !k0()) {
            this.R = true;
            return false;
        }
        this.M = this.E;
        this.P = 0L;
        this.S = 0;
        for (m0 m0Var : this.B) {
            m0Var.V();
        }
        aVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> L() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int M() {
        int i10 = 0;
        for (m0 m0Var : this.B) {
            i10 += m0Var.G();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long N(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.B.length; i10++) {
            if (z10 || ((e) p3.a.e(this.G)).f18837c[i10]) {
                j10 = Math.max(j10, this.B[i10].z());
            }
        }
        return j10;
    }

    private boolean P() {
        return this.Q != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        if (this.U) {
            return;
        }
        ((r.a) p3.a.e(this.f18816z)).l(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.O = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (this.U || this.E || !this.D || this.H == null) {
            return;
        }
        for (m0 m0Var : this.B) {
            if (m0Var.F() == null) {
                return;
            }
        }
        this.f18812v.c();
        int length = this.B.length;
        t0[] t0VarArr = new t0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            n1 n1Var = (n1) p3.a.e(this.B[i10].F());
            String str = n1Var.f17419u;
            boolean o10 = p3.v.o(str);
            boolean z10 = o10 || p3.v.s(str);
            zArr[i10] = z10;
            this.F = z10 | this.F;
            o2.b bVar = this.A;
            if (bVar != null) {
                if (o10 || this.C[i10].f18834b) {
                    k2.a aVar = n1Var.f17417s;
                    n1Var = n1Var.b().Z(aVar == null ? new k2.a(bVar) : aVar.a(bVar)).G();
                }
                if (o10 && n1Var.f17413o == -1 && n1Var.f17414p == -1 && bVar.f14395j != -1) {
                    n1Var = n1Var.b().I(bVar.f14395j).G();
                }
            }
            t0VarArr[i10] = new t0(Integer.toString(i10), n1Var.c(this.f18802l.f(n1Var)));
        }
        this.G = new e(new v0(t0VarArr), zArr);
        this.E = true;
        ((r.a) p3.a.e(this.f18816z)).i(this);
    }

    private void V(int i10) {
        J();
        e eVar = this.G;
        boolean[] zArr = eVar.f18838d;
        if (zArr[i10]) {
            return;
        }
        n1 b10 = eVar.f18835a.b(i10).b(0);
        this.f18804n.i(p3.v.k(b10.f17419u), b10, 0, null, this.P);
        zArr[i10] = true;
    }

    private void W(int i10) {
        J();
        boolean[] zArr = this.G.f18836b;
        if (this.R && zArr[i10]) {
            if (this.B[i10].K(false)) {
                return;
            }
            this.Q = 0L;
            this.R = false;
            this.M = true;
            this.P = 0L;
            this.S = 0;
            for (m0 m0Var : this.B) {
                m0Var.V();
            }
            ((r.a) p3.a.e(this.f18816z)).l(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.f18815y.post(new Runnable() { // from class: u2.e0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.S();
            }
        });
    }

    private x1.e0 d0(d dVar) {
        int length = this.B.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.C[i10])) {
                return this.B[i10];
            }
        }
        m0 k10 = m0.k(this.f18807q, this.f18802l, this.f18805o);
        k10.d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.C, i11);
        dVarArr[length] = dVar;
        this.C = (d[]) p3.n0.k(dVarArr);
        m0[] m0VarArr = (m0[]) Arrays.copyOf(this.B, i11);
        m0VarArr[length] = k10;
        this.B = (m0[]) p3.n0.k(m0VarArr);
        return k10;
    }

    private boolean g0(boolean[] zArr, long j10) {
        int length = this.B.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.B[i10].Z(j10, false) && (zArr[i10] || !this.F)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public void T(x1.b0 b0Var) {
        this.H = this.A == null ? b0Var : new b0.b(-9223372036854775807L);
        this.I = b0Var.h();
        boolean z10 = !this.O && b0Var.h() == -9223372036854775807L;
        this.J = z10;
        this.K = z10 ? 7 : 1;
        this.f18806p.r(this.I, b0Var.f(), this.J);
        if (this.E) {
            return;
        }
        U();
    }

    private void j0() {
        a aVar = new a(this.f18800j, this.f18801k, this.f18811u, this, this.f18812v);
        if (this.E) {
            p3.a.f(P());
            long j10 = this.I;
            if (j10 != -9223372036854775807L && this.Q > j10) {
                this.T = true;
                this.Q = -9223372036854775807L;
                return;
            }
            aVar.j(((x1.b0) p3.a.e(this.H)).g(this.Q).f20103a.f20109b, this.Q);
            for (m0 m0Var : this.B) {
                m0Var.b0(this.Q);
            }
            this.Q = -9223372036854775807L;
        }
        this.S = M();
        this.f18804n.A(new n(aVar.f18817a, aVar.f18827k, this.f18810t.n(aVar, this, this.f18803m.d(this.K))), 1, -1, null, 0, null, aVar.f18826j, this.I);
    }

    private boolean k0() {
        return this.M || P();
    }

    x1.e0 O() {
        return d0(new d(0, true));
    }

    boolean Q(int i10) {
        return !k0() && this.B[i10].K(this.T);
    }

    void X() {
        this.f18810t.k(this.f18803m.d(this.K));
    }

    void Y(int i10) {
        this.B[i10].N();
        X();
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.f18810t.j() && this.f18812v.d();
    }

    @Override // o3.h0.b
    /* renamed from: a0 */
    public void i(a aVar, long j10, long j11, boolean z10) {
        o3.o0 o0Var = aVar.f18819c;
        n nVar = new n(aVar.f18817a, aVar.f18827k, o0Var.r(), o0Var.s(), j10, j11, o0Var.q());
        this.f18803m.a(aVar.f18817a);
        this.f18804n.r(nVar, 1, -1, null, 0, null, aVar.f18826j, this.I);
        if (z10) {
            return;
        }
        for (m0 m0Var : this.B) {
            m0Var.V();
        }
        if (this.N > 0) {
            ((r.a) p3.a.e(this.f18816z)).l(this);
        }
    }

    @Override // u2.m0.d
    public void b(n1 n1Var) {
        this.f18815y.post(this.f18813w);
    }

    @Override // o3.h0.b
    /* renamed from: b0 */
    public void o(a aVar, long j10, long j11) {
        x1.b0 b0Var;
        if (this.I == -9223372036854775807L && (b0Var = this.H) != null) {
            boolean f10 = b0Var.f();
            long N = N(true);
            long j12 = N == Long.MIN_VALUE ? 0L : N + 10000;
            this.I = j12;
            this.f18806p.r(j12, f10, this.J);
        }
        o3.o0 o0Var = aVar.f18819c;
        n nVar = new n(aVar.f18817a, aVar.f18827k, o0Var.r(), o0Var.s(), j10, j11, o0Var.q());
        this.f18803m.a(aVar.f18817a);
        this.f18804n.u(nVar, 1, -1, null, 0, null, aVar.f18826j, this.I);
        this.T = true;
        ((r.a) p3.a.e(this.f18816z)).l(this);
    }

    @Override // u2.r, u2.o0
    public long c() {
        return f();
    }

    @Override // o3.h0.b
    /* renamed from: c0 */
    public h0.c u(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        h0.c h10;
        o3.o0 o0Var = aVar.f18819c;
        n nVar = new n(aVar.f18817a, aVar.f18827k, o0Var.r(), o0Var.s(), j10, j11, o0Var.q());
        long b10 = this.f18803m.b(new g0.c(nVar, new q(1, -1, null, 0, null, p3.n0.Y0(aVar.f18826j), p3.n0.Y0(this.I)), iOException, i10));
        if (b10 == -9223372036854775807L) {
            h10 = o3.h0.f14453g;
        } else {
            int M = M();
            if (M > this.S) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            h10 = K(aVar2, M) ? o3.h0.h(z10, b10) : o3.h0.f14452f;
        }
        boolean z11 = !h10.c();
        this.f18804n.w(nVar, 1, -1, null, 0, null, aVar.f18826j, this.I, iOException, z11);
        if (z11) {
            this.f18803m.a(aVar.f18817a);
        }
        return h10;
    }

    @Override // x1.n
    public x1.e0 d(int i10, int i11) {
        return d0(new d(i10, false));
    }

    @Override // u2.r
    public long e(long j10, q3 q3Var) {
        J();
        if (this.H.f()) {
            b0.a g10 = this.H.g(j10);
            return q3Var.a(j10, g10.f20103a.f20108a, g10.f20104b.f20108a);
        }
        return 0L;
    }

    int e0(int i10, o1 o1Var, v1.g gVar, int i11) {
        if (k0()) {
            return -3;
        }
        V(i10);
        int S = this.B[i10].S(o1Var, gVar, i11, this.T);
        if (S == -3) {
            W(i10);
        }
        return S;
    }

    @Override // u2.r, u2.o0
    public long f() {
        long j10;
        J();
        if (this.T || this.N == 0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.Q;
        }
        if (this.F) {
            int length = this.B.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.G;
                if (eVar.f18836b[i10] && eVar.f18837c[i10] && !this.B[i10].J()) {
                    j10 = Math.min(j10, this.B[i10].z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = N(false);
        }
        return j10 == Long.MIN_VALUE ? this.P : j10;
    }

    public void f0() {
        if (this.E) {
            for (m0 m0Var : this.B) {
                m0Var.R();
            }
        }
        this.f18810t.m(this);
        this.f18815y.removeCallbacksAndMessages(null);
        this.f18816z = null;
        this.U = true;
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        if (this.T || this.f18810t.i() || this.R) {
            return false;
        }
        if (this.E && this.N == 0) {
            return false;
        }
        boolean e10 = this.f18812v.e();
        if (this.f18810t.j()) {
            return e10;
        }
        j0();
        return true;
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
    }

    int i0(int i10, long j10) {
        if (k0()) {
            return 0;
        }
        V(i10);
        m0 m0Var = this.B[i10];
        int E = m0Var.E(j10, this.T);
        m0Var.e0(E);
        if (E == 0) {
            W(i10);
        }
        return E;
    }

    @Override // u2.r
    public void j(r.a aVar, long j10) {
        this.f18816z = aVar;
        this.f18812v.e();
        j0();
    }

    @Override // x1.n
    public void k() {
        this.D = true;
        this.f18815y.post(this.f18813w);
    }

    @Override // o3.h0.f
    public void l() {
        for (m0 m0Var : this.B) {
            m0Var.T();
        }
        this.f18811u.a();
    }

    @Override // u2.r
    public long m(n3.t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        J();
        e eVar = this.G;
        v0 v0Var = eVar.f18835a;
        boolean[] zArr3 = eVar.f18837c;
        int i10 = this.N;
        int i11 = 0;
        for (int i12 = 0; i12 < tVarArr.length; i12++) {
            if (n0VarArr[i12] != null && (tVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) n0VarArr[i12]).f18831j;
                p3.a.f(zArr3[i13]);
                this.N--;
                zArr3[i13] = false;
                n0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.L ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < tVarArr.length; i14++) {
            if (n0VarArr[i14] == null && tVarArr[i14] != null) {
                n3.t tVar = tVarArr[i14];
                p3.a.f(tVar.length() == 1);
                p3.a.f(tVar.b(0) == 0);
                int c10 = v0Var.c(tVar.c());
                p3.a.f(!zArr3[c10]);
                this.N++;
                zArr3[c10] = true;
                n0VarArr[i14] = new c(c10);
                zArr2[i14] = true;
                if (!z10) {
                    m0 m0Var = this.B[c10];
                    z10 = (m0Var.Z(j10, true) || m0Var.C() == 0) ? false : true;
                }
            }
        }
        if (this.N == 0) {
            this.R = false;
            this.M = false;
            if (this.f18810t.j()) {
                m0[] m0VarArr = this.B;
                int length = m0VarArr.length;
                while (i11 < length) {
                    m0VarArr[i11].r();
                    i11++;
                }
                this.f18810t.f();
            } else {
                m0[] m0VarArr2 = this.B;
                int length2 = m0VarArr2.length;
                while (i11 < length2) {
                    m0VarArr2[i11].V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = s(j10);
            while (i11 < n0VarArr.length) {
                if (n0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.L = true;
        return j10;
    }

    @Override // u2.r
    public long n() {
        if (this.M) {
            if (this.T || M() > this.S) {
                this.M = false;
                return this.P;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        J();
        return this.G.f18835a;
    }

    @Override // u2.r
    public void q() {
        X();
        if (this.T && !this.E) {
            throw u2.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        J();
        if (P()) {
            return;
        }
        boolean[] zArr = this.G.f18837c;
        int length = this.B.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.B[i10].q(j10, z10, zArr[i10]);
        }
    }

    @Override // u2.r
    public long s(long j10) {
        J();
        boolean[] zArr = this.G.f18836b;
        if (!this.H.f()) {
            j10 = 0;
        }
        int i10 = 0;
        this.M = false;
        this.P = j10;
        if (P()) {
            this.Q = j10;
            return j10;
        } else if (this.K == 7 || !g0(zArr, j10)) {
            this.R = false;
            this.Q = j10;
            this.T = false;
            if (this.f18810t.j()) {
                m0[] m0VarArr = this.B;
                int length = m0VarArr.length;
                while (i10 < length) {
                    m0VarArr[i10].r();
                    i10++;
                }
                this.f18810t.f();
            } else {
                this.f18810t.g();
                m0[] m0VarArr2 = this.B;
                int length2 = m0VarArr2.length;
                while (i10 < length2) {
                    m0VarArr2[i10].V();
                    i10++;
                }
            }
            return j10;
        } else {
            return j10;
        }
    }

    @Override // x1.n
    public void t(final x1.b0 b0Var) {
        this.f18815y.post(new Runnable() { // from class: u2.g0
            @Override // java.lang.Runnable
            public final void run() {
                h0.this.T(b0Var);
            }
        });
    }
}
