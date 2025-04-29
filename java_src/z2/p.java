package z2;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.common.collect.q;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k2.a;
import o3.c0;
import o3.g0;
import o3.h0;
import p3.a0;
import p3.n0;
import p3.v;
import s1.n1;
import s1.o1;
import s1.q3;
import s1.u2;
import u2.b0;
import u2.m0;
import u2.o0;
import u2.t0;
import u2.v0;
import w1.w;
import w1.y;
import x1.d0;
import x1.e0;
import z2.f;
import z2.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements h0.b<w2.f>, h0.f, o0, x1.n, m0.d {

    /* renamed from: h0  reason: collision with root package name */
    private static final Set<Integer> f20806h0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private final Handler A;
    private final ArrayList<l> B;
    private final Map<String, w1.m> C;
    private w2.f D;
    private d[] E;
    private Set<Integer> G;
    private SparseIntArray H;
    private e0 I;
    private int J;
    private int K;
    private boolean L;
    private boolean M;
    private int N;
    private n1 O;
    private n1 P;
    private boolean Q;
    private v0 R;
    private Set<t0> S;
    private int[] T;
    private int U;
    private boolean V;
    private boolean[] W;
    private boolean[] X;
    private long Y;
    private long Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f20807a0;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f20808b0;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f20809c0;

    /* renamed from: d0  reason: collision with root package name */
    private boolean f20810d0;

    /* renamed from: e0  reason: collision with root package name */
    private long f20811e0;

    /* renamed from: f0  reason: collision with root package name */
    private w1.m f20812f0;

    /* renamed from: g0  reason: collision with root package name */
    private i f20813g0;

    /* renamed from: j  reason: collision with root package name */
    private final String f20814j;

    /* renamed from: k  reason: collision with root package name */
    private final int f20815k;

    /* renamed from: l  reason: collision with root package name */
    private final b f20816l;

    /* renamed from: m  reason: collision with root package name */
    private final f f20817m;

    /* renamed from: n  reason: collision with root package name */
    private final o3.b f20818n;

    /* renamed from: o  reason: collision with root package name */
    private final n1 f20819o;

    /* renamed from: p  reason: collision with root package name */
    private final y f20820p;

    /* renamed from: q  reason: collision with root package name */
    private final w.a f20821q;

    /* renamed from: r  reason: collision with root package name */
    private final g0 f20822r;

    /* renamed from: t  reason: collision with root package name */
    private final b0.a f20824t;

    /* renamed from: u  reason: collision with root package name */
    private final int f20825u;

    /* renamed from: w  reason: collision with root package name */
    private final ArrayList<i> f20827w;

    /* renamed from: x  reason: collision with root package name */
    private final List<i> f20828x;

    /* renamed from: y  reason: collision with root package name */
    private final Runnable f20829y;

    /* renamed from: z  reason: collision with root package name */
    private final Runnable f20830z;

    /* renamed from: s  reason: collision with root package name */
    private final h0 f20823s = new h0("Loader:HlsSampleStreamWrapper");

    /* renamed from: v  reason: collision with root package name */
    private final f.b f20826v = new f.b();
    private int[] F = new int[0];

    /* loaded from: classes.dex */
    public interface b extends o0.a<p> {
        void b();

        void k(Uri uri);
    }

    /* loaded from: classes.dex */
    private static class c implements e0 {

        /* renamed from: g  reason: collision with root package name */
        private static final n1 f20831g = new n1.b().g0("application/id3").G();

        /* renamed from: h  reason: collision with root package name */
        private static final n1 f20832h = new n1.b().g0("application/x-emsg").G();

        /* renamed from: a  reason: collision with root package name */
        private final m2.b f20833a = new m2.b();

        /* renamed from: b  reason: collision with root package name */
        private final e0 f20834b;

        /* renamed from: c  reason: collision with root package name */
        private final n1 f20835c;

        /* renamed from: d  reason: collision with root package name */
        private n1 f20836d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f20837e;

        /* renamed from: f  reason: collision with root package name */
        private int f20838f;

        public c(e0 e0Var, int i10) {
            n1 n1Var;
            this.f20834b = e0Var;
            if (i10 == 1) {
                n1Var = f20831g;
            } else if (i10 != 3) {
                throw new IllegalArgumentException("Unknown metadataType: " + i10);
            } else {
                n1Var = f20832h;
            }
            this.f20835c = n1Var;
            this.f20837e = new byte[0];
            this.f20838f = 0;
        }

        private boolean g(m2.a aVar) {
            n1 n10 = aVar.n();
            return n10 != null && n0.c(this.f20835c.f17419u, n10.f17419u);
        }

        private void h(int i10) {
            byte[] bArr = this.f20837e;
            if (bArr.length < i10) {
                this.f20837e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private a0 i(int i10, int i11) {
            int i12 = this.f20838f - i11;
            a0 a0Var = new a0(Arrays.copyOfRange(this.f20837e, i12 - i10, i12));
            byte[] bArr = this.f20837e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f20838f = i11;
            return a0Var;
        }

        @Override // x1.e0
        public int a(o3.i iVar, int i10, boolean z10, int i11) {
            h(this.f20838f + i10);
            int read = iVar.read(this.f20837e, this.f20838f, i10);
            if (read != -1) {
                this.f20838f += read;
                return read;
            } else if (z10) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        @Override // x1.e0
        public void b(a0 a0Var, int i10, int i11) {
            h(this.f20838f + i10);
            a0Var.l(this.f20837e, this.f20838f, i10);
            this.f20838f += i10;
        }

        @Override // x1.e0
        public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
            p3.a.e(this.f20836d);
            a0 i13 = i(i11, i12);
            if (!n0.c(this.f20836d.f17419u, this.f20835c.f17419u)) {
                if (!"application/x-emsg".equals(this.f20836d.f17419u)) {
                    p3.r.i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f20836d.f17419u);
                    return;
                }
                m2.a c10 = this.f20833a.c(i13);
                if (!g(c10)) {
                    p3.r.i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f20835c.f17419u, c10.n()));
                    return;
                }
                i13 = new a0((byte[]) p3.a.e(c10.w()));
            }
            int a10 = i13.a();
            this.f20834b.d(i13, a10);
            this.f20834b.c(j10, i10, a10, i12, aVar);
        }

        @Override // x1.e0
        public /* synthetic */ void d(a0 a0Var, int i10) {
            d0.b(this, a0Var, i10);
        }

        @Override // x1.e0
        public void e(n1 n1Var) {
            this.f20836d = n1Var;
            this.f20834b.e(this.f20835c);
        }

        @Override // x1.e0
        public /* synthetic */ int f(o3.i iVar, int i10, boolean z10) {
            return d0.a(this, iVar, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d extends m0 {
        private final Map<String, w1.m> H;
        private w1.m I;

        private d(o3.b bVar, y yVar, w.a aVar, Map<String, w1.m> map) {
            super(bVar, yVar, aVar);
            this.H = map;
        }

        private k2.a h0(k2.a aVar) {
            if (aVar == null) {
                return null;
            }
            int e10 = aVar.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= e10) {
                    i11 = -1;
                    break;
                }
                a.b d10 = aVar.d(i11);
                if ((d10 instanceof p2.l) && "com.apple.streaming.transportStreamTimestamp".equals(((p2.l) d10).f15321k)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return aVar;
            }
            if (e10 == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[e10 - 1];
            while (i10 < e10) {
                if (i10 != i11) {
                    bVarArr[i10 < i11 ? i10 : i10 - 1] = aVar.d(i10);
                }
                i10++;
            }
            return new k2.a(bVarArr);
        }

        @Override // u2.m0, x1.e0
        public void c(long j10, int i10, int i11, int i12, e0.a aVar) {
            super.c(j10, i10, i11, i12, aVar);
        }

        public void i0(w1.m mVar) {
            this.I = mVar;
            I();
        }

        public void j0(i iVar) {
            f0(iVar.f20766k);
        }

        @Override // u2.m0
        public n1 w(n1 n1Var) {
            w1.m mVar;
            w1.m mVar2 = this.I;
            if (mVar2 == null) {
                mVar2 = n1Var.f17422x;
            }
            if (mVar2 != null && (mVar = this.H.get(mVar2.f19728l)) != null) {
                mVar2 = mVar;
            }
            k2.a h02 = h0(n1Var.f17417s);
            if (mVar2 != n1Var.f17422x || h02 != n1Var.f17417s) {
                n1Var = n1Var.b().O(mVar2).Z(h02).G();
            }
            return super.w(n1Var);
        }
    }

    public p(String str, int i10, b bVar, f fVar, Map<String, w1.m> map, o3.b bVar2, long j10, n1 n1Var, y yVar, w.a aVar, g0 g0Var, b0.a aVar2, int i11) {
        this.f20814j = str;
        this.f20815k = i10;
        this.f20816l = bVar;
        this.f20817m = fVar;
        this.C = map;
        this.f20818n = bVar2;
        this.f20819o = n1Var;
        this.f20820p = yVar;
        this.f20821q = aVar;
        this.f20822r = g0Var;
        this.f20824t = aVar2;
        this.f20825u = i11;
        Set<Integer> set = f20806h0;
        this.G = new HashSet(set.size());
        this.H = new SparseIntArray(set.size());
        this.E = new d[0];
        this.X = new boolean[0];
        this.W = new boolean[0];
        ArrayList<i> arrayList = new ArrayList<>();
        this.f20827w = arrayList;
        this.f20828x = Collections.unmodifiableList(arrayList);
        this.B = new ArrayList<>();
        this.f20829y = new Runnable() { // from class: z2.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.T();
            }
        };
        this.f20830z = new Runnable() { // from class: z2.n
            @Override // java.lang.Runnable
            public final void run() {
                p.this.c0();
            }
        };
        this.A = n0.w();
        this.Y = j10;
        this.Z = j10;
    }

    private boolean A(int i10) {
        for (int i11 = i10; i11 < this.f20827w.size(); i11++) {
            if (this.f20827w.get(i11).f20769n) {
                return false;
            }
        }
        i iVar = this.f20827w.get(i10);
        for (int i12 = 0; i12 < this.E.length; i12++) {
            if (this.E[i12].C() > iVar.m(i12)) {
                return false;
            }
        }
        return true;
    }

    private static x1.k C(int i10, int i11) {
        p3.r.i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new x1.k();
    }

    private m0 D(int i10, int i11) {
        int length = this.E.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f20818n, this.f20820p, this.f20821q, this.C);
        dVar.b0(this.Y);
        if (z10) {
            dVar.i0(this.f20812f0);
        }
        dVar.a0(this.f20811e0);
        i iVar = this.f20813g0;
        if (iVar != null) {
            dVar.j0(iVar);
        }
        dVar.d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.F, i12);
        this.F = copyOf;
        copyOf[length] = i10;
        this.E = (d[]) n0.E0(this.E, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.X, i12);
        this.X = copyOf2;
        copyOf2[length] = z10;
        this.V = copyOf2[length] | this.V;
        this.G.add(Integer.valueOf(i11));
        this.H.append(i11, length);
        if (M(i11) > M(this.J)) {
            this.K = length;
            this.J = i11;
        }
        this.W = Arrays.copyOf(this.W, i12);
        return dVar;
    }

    private v0 E(t0[] t0VarArr) {
        for (int i10 = 0; i10 < t0VarArr.length; i10++) {
            t0 t0Var = t0VarArr[i10];
            n1[] n1VarArr = new n1[t0Var.f18978j];
            for (int i11 = 0; i11 < t0Var.f18978j; i11++) {
                n1 b10 = t0Var.b(i11);
                n1VarArr[i11] = b10.c(this.f20820p.f(b10));
            }
            t0VarArr[i10] = new t0(t0Var.f18979k, n1VarArr);
        }
        return new v0(t0VarArr);
    }

    private static n1 F(n1 n1Var, n1 n1Var2, boolean z10) {
        String d10;
        String str;
        if (n1Var == null) {
            return n1Var2;
        }
        int k10 = v.k(n1Var2.f17419u);
        if (n0.K(n1Var.f17416r, k10) == 1) {
            d10 = n0.L(n1Var.f17416r, k10);
            str = v.g(d10);
        } else {
            d10 = v.d(n1Var.f17416r, n1Var2.f17419u);
            str = n1Var2.f17419u;
        }
        n1.b K = n1Var2.b().U(n1Var.f17408j).W(n1Var.f17409k).X(n1Var.f17410l).i0(n1Var.f17411m).e0(n1Var.f17412n).I(z10 ? n1Var.f17413o : -1).b0(z10 ? n1Var.f17414p : -1).K(d10);
        if (k10 == 2) {
            K.n0(n1Var.f17424z).S(n1Var.A).R(n1Var.B);
        }
        if (str != null) {
            K.g0(str);
        }
        int i10 = n1Var.H;
        if (i10 != -1 && k10 == 1) {
            K.J(i10);
        }
        k2.a aVar = n1Var.f17417s;
        if (aVar != null) {
            k2.a aVar2 = n1Var2.f17417s;
            if (aVar2 != null) {
                aVar = aVar2.b(aVar);
            }
            K.Z(aVar);
        }
        return K.G();
    }

    private void G(int i10) {
        p3.a.f(!this.f20823s.j());
        while (true) {
            if (i10 >= this.f20827w.size()) {
                i10 = -1;
                break;
            } else if (A(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = K().f19799h;
        i H = H(i10);
        if (this.f20827w.isEmpty()) {
            this.Z = this.Y;
        } else {
            ((i) com.google.common.collect.t.c(this.f20827w)).o();
        }
        this.f20809c0 = false;
        this.f20824t.D(this.J, H.f19798g, j10);
    }

    private i H(int i10) {
        i iVar = this.f20827w.get(i10);
        ArrayList<i> arrayList = this.f20827w;
        n0.M0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.E.length; i11++) {
            this.E[i11].u(iVar.m(i11));
        }
        return iVar;
    }

    private boolean I(i iVar) {
        int i10 = iVar.f20766k;
        int length = this.E.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.W[i11] && this.E[i11].Q() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(n1 n1Var, n1 n1Var2) {
        String str = n1Var.f17419u;
        String str2 = n1Var2.f17419u;
        int k10 = v.k(str);
        if (k10 != 3) {
            return k10 == v.k(str2);
        } else if (n0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || n1Var.M == n1Var2.M;
        } else {
            return false;
        }
    }

    private i K() {
        ArrayList<i> arrayList = this.f20827w;
        return arrayList.get(arrayList.size() - 1);
    }

    private e0 L(int i10, int i11) {
        p3.a.a(f20806h0.contains(Integer.valueOf(i11)));
        int i12 = this.H.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.G.add(Integer.valueOf(i11))) {
            this.F[i12] = i10;
        }
        return this.F[i12] == i10 ? this.E[i12] : C(i10, i11);
    }

    private static int M(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0 : 1;
            }
            return 3;
        }
        return 2;
    }

    private void N(i iVar) {
        d[] dVarArr;
        this.f20813g0 = iVar;
        this.O = iVar.f19795d;
        this.Z = -9223372036854775807L;
        this.f20827w.add(iVar);
        q.a t10 = com.google.common.collect.q.t();
        for (d dVar : this.E) {
            t10.a(Integer.valueOf(dVar.G()));
        }
        iVar.n(this, t10.h());
        for (d dVar2 : this.E) {
            dVar2.j0(iVar);
            if (iVar.f20769n) {
                dVar2.g0();
            }
        }
    }

    private static boolean O(w2.f fVar) {
        return fVar instanceof i;
    }

    private boolean P() {
        return this.Z != -9223372036854775807L;
    }

    private void S() {
        int i10 = this.R.f18991j;
        int[] iArr = new int[i10];
        this.T = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.E;
                if (i12 >= dVarArr.length) {
                    break;
                } else if (J((n1) p3.a.h(dVarArr[i12].F()), this.R.b(i11).b(0))) {
                    this.T[i11] = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        Iterator<l> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (!this.Q && this.T == null && this.L) {
            for (d dVar : this.E) {
                if (dVar.F() == null) {
                    return;
                }
            }
            if (this.R != null) {
                S();
                return;
            }
            z();
            l0();
            this.f20816l.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        this.L = true;
        T();
    }

    private void g0() {
        for (d dVar : this.E) {
            dVar.W(this.f20807a0);
        }
        this.f20807a0 = false;
    }

    private boolean h0(long j10) {
        int length = this.E.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.E[i10].Z(j10, false) && (this.X[i10] || !this.V)) {
                return false;
            }
        }
        return true;
    }

    private void l0() {
        this.M = true;
    }

    private void q0(u2.n0[] n0VarArr) {
        this.B.clear();
        for (u2.n0 n0Var : n0VarArr) {
            if (n0Var != null) {
                this.B.add((l) n0Var);
            }
        }
    }

    private void x() {
        p3.a.f(this.M);
        p3.a.e(this.R);
        p3.a.e(this.S);
    }

    private void z() {
        n1 n1Var;
        int length = this.E.length;
        int i10 = 0;
        int i11 = -2;
        int i12 = -1;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String str = ((n1) p3.a.h(this.E[i10].F())).f17419u;
            int i13 = v.s(str) ? 2 : v.o(str) ? 1 : v.r(str) ? 3 : -2;
            if (M(i13) > M(i11)) {
                i12 = i10;
                i11 = i13;
            } else if (i13 == i11 && i12 != -1) {
                i12 = -1;
            }
            i10++;
        }
        t0 j10 = this.f20817m.j();
        int i14 = j10.f18978j;
        this.U = -1;
        this.T = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.T[i15] = i15;
        }
        t0[] t0VarArr = new t0[length];
        int i16 = 0;
        while (i16 < length) {
            n1 n1Var2 = (n1) p3.a.h(this.E[i16].F());
            if (i16 == i12) {
                n1[] n1VarArr = new n1[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    n1 b10 = j10.b(i17);
                    if (i11 == 1 && (n1Var = this.f20819o) != null) {
                        b10 = b10.j(n1Var);
                    }
                    n1VarArr[i17] = i14 == 1 ? n1Var2.j(b10) : F(b10, n1Var2, true);
                }
                t0VarArr[i16] = new t0(this.f20814j, n1VarArr);
                this.U = i16;
            } else {
                n1 n1Var3 = (i11 == 2 && v.o(n1Var2.f17419u)) ? this.f20819o : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f20814j);
                sb.append(":muxed:");
                sb.append(i16 < i12 ? i16 : i16 - 1);
                t0VarArr[i16] = new t0(sb.toString(), F(n1Var3, n1Var2, false));
            }
            i16++;
        }
        this.R = E(t0VarArr);
        p3.a.f(this.S == null);
        this.S = Collections.emptySet();
    }

    public void B() {
        if (this.M) {
            return;
        }
        g(this.Y);
    }

    public boolean Q(int i10) {
        return !P() && this.E[i10].K(this.f20809c0);
    }

    public boolean R() {
        return this.J == 2;
    }

    public void U() {
        this.f20823s.b();
        this.f20817m.n();
    }

    public void V(int i10) {
        U();
        this.E[i10].N();
    }

    @Override // o3.h0.b
    /* renamed from: W */
    public void i(w2.f fVar, long j10, long j11, boolean z10) {
        this.D = null;
        u2.n nVar = new u2.n(fVar.f19792a, fVar.f19793b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f20822r.a(fVar.f19792a);
        this.f20824t.r(nVar, fVar.f19794c, this.f20815k, fVar.f19795d, fVar.f19796e, fVar.f19797f, fVar.f19798g, fVar.f19799h);
        if (z10) {
            return;
        }
        if (P() || this.N == 0) {
            g0();
        }
        if (this.N > 0) {
            this.f20816l.l(this);
        }
    }

    @Override // o3.h0.b
    /* renamed from: X */
    public void o(w2.f fVar, long j10, long j11) {
        this.D = null;
        this.f20817m.p(fVar);
        u2.n nVar = new u2.n(fVar.f19792a, fVar.f19793b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f20822r.a(fVar.f19792a);
        this.f20824t.u(nVar, fVar.f19794c, this.f20815k, fVar.f19795d, fVar.f19796e, fVar.f19797f, fVar.f19798g, fVar.f19799h);
        if (this.M) {
            this.f20816l.l(this);
        } else {
            g(this.Y);
        }
    }

    @Override // o3.h0.b
    /* renamed from: Y */
    public h0.c u(w2.f fVar, long j10, long j11, IOException iOException, int i10) {
        h0.c h10;
        int i11;
        boolean O = O(fVar);
        if (O && !((i) fVar).q() && (iOException instanceof c0) && ((i11 = ((c0) iOException).f14414m) == 410 || i11 == 404)) {
            return h0.f14450d;
        }
        long a10 = fVar.a();
        u2.n nVar = new u2.n(fVar.f19792a, fVar.f19793b, fVar.f(), fVar.e(), j10, j11, a10);
        g0.c cVar = new g0.c(nVar, new u2.q(fVar.f19794c, this.f20815k, fVar.f19795d, fVar.f19796e, fVar.f19797f, n0.Y0(fVar.f19798g), n0.Y0(fVar.f19799h)), iOException, i10);
        g0.b c10 = this.f20822r.c(n3.b0.c(this.f20817m.k()), cVar);
        boolean m10 = (c10 == null || c10.f14438a != 2) ? false : this.f20817m.m(fVar, c10.f14439b);
        if (m10) {
            if (O && a10 == 0) {
                ArrayList<i> arrayList = this.f20827w;
                p3.a.f(arrayList.remove(arrayList.size() - 1) == fVar);
                if (this.f20827w.isEmpty()) {
                    this.Z = this.Y;
                } else {
                    ((i) com.google.common.collect.t.c(this.f20827w)).o();
                }
            }
            h10 = h0.f14452f;
        } else {
            long b10 = this.f20822r.b(cVar);
            h10 = b10 != -9223372036854775807L ? h0.h(false, b10) : h0.f14453g;
        }
        h0.c cVar2 = h10;
        boolean z10 = !cVar2.c();
        this.f20824t.w(nVar, fVar.f19794c, this.f20815k, fVar.f19795d, fVar.f19796e, fVar.f19797f, fVar.f19798g, fVar.f19799h, iOException, z10);
        if (z10) {
            this.D = null;
            this.f20822r.a(fVar.f19792a);
        }
        if (m10) {
            if (this.M) {
                this.f20816l.l(this);
            } else {
                g(this.Y);
            }
        }
        return cVar2;
    }

    public void Z() {
        this.G.clear();
    }

    @Override // u2.o0
    public boolean a() {
        return this.f20823s.j();
    }

    public boolean a0(Uri uri, g0.c cVar, boolean z10) {
        g0.b c10;
        if (this.f20817m.o(uri)) {
            long j10 = (z10 || (c10 = this.f20822r.c(n3.b0.c(this.f20817m.k()), cVar)) == null || c10.f14438a != 2) ? -9223372036854775807L : c10.f14439b;
            return this.f20817m.q(uri, j10) && j10 != -9223372036854775807L;
        }
        return true;
    }

    @Override // u2.m0.d
    public void b(n1 n1Var) {
        this.A.post(this.f20829y);
    }

    public void b0() {
        if (this.f20827w.isEmpty()) {
            return;
        }
        i iVar = (i) com.google.common.collect.t.c(this.f20827w);
        int c10 = this.f20817m.c(iVar);
        if (c10 == 1) {
            iVar.v();
        } else if (c10 == 2 && !this.f20809c0 && this.f20823s.j()) {
            this.f20823s.f();
        }
    }

    @Override // u2.o0
    public long c() {
        if (P()) {
            return this.Z;
        }
        if (this.f20809c0) {
            return Long.MIN_VALUE;
        }
        return K().f19799h;
    }

    @Override // x1.n
    public e0 d(int i10, int i11) {
        e0 e0Var;
        if (!f20806h0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                e0[] e0VarArr = this.E;
                if (i12 >= e0VarArr.length) {
                    e0Var = null;
                    break;
                } else if (this.F[i12] == i10) {
                    e0Var = e0VarArr[i12];
                    break;
                } else {
                    i12++;
                }
            }
        } else {
            e0Var = L(i10, i11);
        }
        if (e0Var == null) {
            if (this.f20810d0) {
                return C(i10, i11);
            }
            e0Var = D(i10, i11);
        }
        if (i11 == 5) {
            if (this.I == null) {
                this.I = new c(e0Var, this.f20825u);
            }
            return this.I;
        }
        return e0Var;
    }

    public void d0(t0[] t0VarArr, int i10, int... iArr) {
        this.R = E(t0VarArr);
        this.S = new HashSet();
        for (int i11 : iArr) {
            this.S.add(this.R.b(i11));
        }
        this.U = i10;
        Handler handler = this.A;
        final b bVar = this.f20816l;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: z2.m
            @Override // java.lang.Runnable
            public final void run() {
                p.b.this.b();
            }
        });
        l0();
    }

    public long e(long j10, q3 q3Var) {
        return this.f20817m.b(j10, q3Var);
    }

    public int e0(int i10, o1 o1Var, v1.g gVar, int i11) {
        if (P()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f20827w.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f20827w.size() - 1 && I(this.f20827w.get(i13))) {
                i13++;
            }
            n0.M0(this.f20827w, 0, i13);
            i iVar = this.f20827w.get(0);
            n1 n1Var = iVar.f19795d;
            if (!n1Var.equals(this.P)) {
                this.f20824t.i(this.f20815k, n1Var, iVar.f19796e, iVar.f19797f, iVar.f19798g);
            }
            this.P = n1Var;
        }
        if (this.f20827w.isEmpty() || this.f20827w.get(0).q()) {
            int S = this.E[i10].S(o1Var, gVar, i11, this.f20809c0);
            if (S == -5) {
                n1 n1Var2 = (n1) p3.a.e(o1Var.f17464b);
                if (i10 == this.K) {
                    int Q = this.E[i10].Q();
                    while (i12 < this.f20827w.size() && this.f20827w.get(i12).f20766k != Q) {
                        i12++;
                    }
                    n1Var2 = n1Var2.j(i12 < this.f20827w.size() ? this.f20827w.get(i12).f19795d : (n1) p3.a.e(this.O));
                }
                o1Var.f17464b = n1Var2;
            }
            return S;
        }
        return -3;
    }

    @Override // u2.o0
    public long f() {
        ArrayList<i> arrayList;
        if (this.f20809c0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.Z;
        }
        long j10 = this.Y;
        i K = K();
        if (!K.h()) {
            K = this.f20827w.size() > 1 ? this.f20827w.get(arrayList.size() - 2) : null;
        }
        if (K != null) {
            j10 = Math.max(j10, K.f19799h);
        }
        if (this.L) {
            for (d dVar : this.E) {
                j10 = Math.max(j10, dVar.z());
            }
        }
        return j10;
    }

    public void f0() {
        if (this.M) {
            for (d dVar : this.E) {
                dVar.R();
            }
        }
        this.f20823s.m(this);
        this.A.removeCallbacksAndMessages(null);
        this.Q = true;
        this.B.clear();
    }

    @Override // u2.o0
    public boolean g(long j10) {
        List<i> list;
        long max;
        if (this.f20809c0 || this.f20823s.j() || this.f20823s.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            max = this.Z;
            for (d dVar : this.E) {
                dVar.b0(this.Z);
            }
        } else {
            list = this.f20828x;
            i K = K();
            max = K.h() ? K.f19799h : Math.max(this.Y, K.f19798g);
        }
        List<i> list2 = list;
        long j11 = max;
        this.f20826v.a();
        this.f20817m.e(j10, j11, list2, this.M || !list2.isEmpty(), this.f20826v);
        f.b bVar = this.f20826v;
        boolean z10 = bVar.f20755b;
        w2.f fVar = bVar.f20754a;
        Uri uri = bVar.f20756c;
        if (z10) {
            this.Z = -9223372036854775807L;
            this.f20809c0 = true;
            return true;
        } else if (fVar == null) {
            if (uri != null) {
                this.f20816l.k(uri);
            }
            return false;
        } else {
            if (O(fVar)) {
                N((i) fVar);
            }
            this.D = fVar;
            this.f20824t.A(new u2.n(fVar.f19792a, fVar.f19793b, this.f20823s.n(fVar, this, this.f20822r.d(fVar.f19794c))), fVar.f19794c, this.f20815k, fVar.f19795d, fVar.f19796e, fVar.f19797f, fVar.f19798g, fVar.f19799h);
            return true;
        }
    }

    @Override // u2.o0
    public void h(long j10) {
        if (this.f20823s.i() || P()) {
            return;
        }
        if (this.f20823s.j()) {
            p3.a.e(this.D);
            if (this.f20817m.v(j10, this.D, this.f20828x)) {
                this.f20823s.f();
                return;
            }
            return;
        }
        int size = this.f20828x.size();
        while (size > 0 && this.f20817m.c(this.f20828x.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f20828x.size()) {
            G(size);
        }
        int h10 = this.f20817m.h(j10, this.f20828x);
        if (h10 < this.f20827w.size()) {
            G(h10);
        }
    }

    public boolean i0(long j10, boolean z10) {
        this.Y = j10;
        if (P()) {
            this.Z = j10;
            return true;
        }
        if (this.L && !z10 && h0(j10)) {
            return false;
        }
        this.Z = j10;
        this.f20809c0 = false;
        this.f20827w.clear();
        if (this.f20823s.j()) {
            if (this.L) {
                for (d dVar : this.E) {
                    dVar.r();
                }
            }
            this.f20823s.f();
        } else {
            this.f20823s.g();
            g0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j0(n3.t[] r20, boolean[] r21, u2.n0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.p.j0(n3.t[], boolean[], u2.n0[], boolean[], long, boolean):boolean");
    }

    @Override // x1.n
    public void k() {
        this.f20810d0 = true;
        this.A.post(this.f20830z);
    }

    public void k0(w1.m mVar) {
        if (n0.c(this.f20812f0, mVar)) {
            return;
        }
        this.f20812f0 = mVar;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.E;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.X[i10]) {
                dVarArr[i10].i0(mVar);
            }
            i10++;
        }
    }

    @Override // o3.h0.f
    public void l() {
        for (d dVar : this.E) {
            dVar.T();
        }
    }

    public void m0(boolean z10) {
        this.f20817m.t(z10);
    }

    public void n0(long j10) {
        if (this.f20811e0 != j10) {
            this.f20811e0 = j10;
            for (d dVar : this.E) {
                dVar.a0(j10);
            }
        }
    }

    public int o0(int i10, long j10) {
        if (P()) {
            return 0;
        }
        d dVar = this.E[i10];
        int E = dVar.E(j10, this.f20809c0);
        i iVar = (i) com.google.common.collect.t.d(this.f20827w, null);
        if (iVar != null && !iVar.q()) {
            E = Math.min(E, iVar.m(i10) - dVar.C());
        }
        dVar.e0(E);
        return E;
    }

    public v0 p() {
        x();
        return this.R;
    }

    public void p0(int i10) {
        x();
        p3.a.e(this.T);
        int i11 = this.T[i10];
        p3.a.f(this.W[i11]);
        this.W[i11] = false;
    }

    public void q() {
        U();
        if (this.f20809c0 && !this.M) {
            throw u2.a("Loading finished before preparation is complete.", null);
        }
    }

    public void r(long j10, boolean z10) {
        if (!this.L || P()) {
            return;
        }
        int length = this.E.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.E[i10].q(j10, z10, this.W[i10]);
        }
    }

    @Override // x1.n
    public void t(x1.b0 b0Var) {
    }

    public int y(int i10) {
        x();
        p3.a.e(this.T);
        int i11 = this.T[i10];
        if (i11 == -1) {
            return this.S.contains(this.R.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.W;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }
}
