package w2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o3.g0;
import o3.h0;
import s1.n1;
import s1.o1;
import s1.q3;
import u2.b0;
import u2.m0;
import u2.n0;
import u2.o0;
import w1.w;
import w1.y;
import w2.j;
/* loaded from: classes.dex */
public class i<T extends j> implements n0, o0, h0.b<f>, h0.f {
    private b<T> A;
    private long B;
    private long C;
    private int D;
    private w2.a E;
    boolean F;

    /* renamed from: j  reason: collision with root package name */
    public final int f19803j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f19804k;

    /* renamed from: l  reason: collision with root package name */
    private final n1[] f19805l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean[] f19806m;

    /* renamed from: n  reason: collision with root package name */
    private final T f19807n;

    /* renamed from: o  reason: collision with root package name */
    private final o0.a<i<T>> f19808o;

    /* renamed from: p  reason: collision with root package name */
    private final b0.a f19809p;

    /* renamed from: q  reason: collision with root package name */
    private final g0 f19810q;

    /* renamed from: r  reason: collision with root package name */
    private final h0 f19811r;

    /* renamed from: s  reason: collision with root package name */
    private final h f19812s;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList<w2.a> f19813t;

    /* renamed from: u  reason: collision with root package name */
    private final List<w2.a> f19814u;

    /* renamed from: v  reason: collision with root package name */
    private final m0 f19815v;

    /* renamed from: w  reason: collision with root package name */
    private final m0[] f19816w;

    /* renamed from: x  reason: collision with root package name */
    private final c f19817x;

    /* renamed from: y  reason: collision with root package name */
    private f f19818y;

    /* renamed from: z  reason: collision with root package name */
    private n1 f19819z;

    /* loaded from: classes.dex */
    public final class a implements n0 {

        /* renamed from: j  reason: collision with root package name */
        public final i<T> f19820j;

        /* renamed from: k  reason: collision with root package name */
        private final m0 f19821k;

        /* renamed from: l  reason: collision with root package name */
        private final int f19822l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f19823m;

        public a(i<T> iVar, m0 m0Var, int i10) {
            this.f19820j = iVar;
            this.f19821k = m0Var;
            this.f19822l = i10;
        }

        private void a() {
            if (this.f19823m) {
                return;
            }
            i.this.f19809p.i(i.this.f19804k[this.f19822l], i.this.f19805l[this.f19822l], 0, null, i.this.C);
            this.f19823m = true;
        }

        @Override // u2.n0
        public void b() {
        }

        public void c() {
            p3.a.f(i.this.f19806m[this.f19822l]);
            i.this.f19806m[this.f19822l] = false;
        }

        @Override // u2.n0
        public boolean d() {
            return !i.this.I() && this.f19821k.K(i.this.F);
        }

        @Override // u2.n0
        public int k(o1 o1Var, v1.g gVar, int i10) {
            if (i.this.I()) {
                return -3;
            }
            if (i.this.E == null || i.this.E.i(this.f19822l + 1) > this.f19821k.C()) {
                a();
                return this.f19821k.S(o1Var, gVar, i10, i.this.F);
            }
            return -3;
        }

        @Override // u2.n0
        public int t(long j10) {
            if (i.this.I()) {
                return 0;
            }
            int E = this.f19821k.E(j10, i.this.F);
            if (i.this.E != null) {
                E = Math.min(E, i.this.E.i(this.f19822l + 1) - this.f19821k.C());
            }
            this.f19821k.e0(E);
            if (E > 0) {
                a();
            }
            return E;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends j> {
        void d(i<T> iVar);
    }

    public i(int i10, int[] iArr, n1[] n1VarArr, T t10, o0.a<i<T>> aVar, o3.b bVar, long j10, y yVar, w.a aVar2, g0 g0Var, b0.a aVar3) {
        this.f19803j = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f19804k = iArr;
        this.f19805l = n1VarArr == null ? new n1[0] : n1VarArr;
        this.f19807n = t10;
        this.f19808o = aVar;
        this.f19809p = aVar3;
        this.f19810q = g0Var;
        this.f19811r = new h0("ChunkSampleStream");
        this.f19812s = new h();
        ArrayList<w2.a> arrayList = new ArrayList<>();
        this.f19813t = arrayList;
        this.f19814u = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f19816w = new m0[length];
        this.f19806m = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        m0[] m0VarArr = new m0[i12];
        m0 k10 = m0.k(bVar, yVar, aVar2);
        this.f19815v = k10;
        iArr2[0] = i10;
        m0VarArr[0] = k10;
        while (i11 < length) {
            m0 l10 = m0.l(bVar);
            this.f19816w[i11] = l10;
            int i13 = i11 + 1;
            m0VarArr[i13] = l10;
            iArr2[i13] = this.f19804k[i11];
            i11 = i13;
        }
        this.f19817x = new c(iArr2, m0VarArr);
        this.B = j10;
        this.C = j10;
    }

    private void B(int i10) {
        int min = Math.min(O(i10, 0), this.D);
        if (min > 0) {
            p3.n0.M0(this.f19813t, 0, min);
            this.D -= min;
        }
    }

    private void C(int i10) {
        p3.a.f(!this.f19811r.j());
        int size = this.f19813t.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!G(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = F().f19799h;
        w2.a D = D(i10);
        if (this.f19813t.isEmpty()) {
            this.B = this.C;
        }
        this.F = false;
        this.f19809p.D(this.f19803j, D.f19798g, j10);
    }

    private w2.a D(int i10) {
        w2.a aVar = this.f19813t.get(i10);
        ArrayList<w2.a> arrayList = this.f19813t;
        p3.n0.M0(arrayList, i10, arrayList.size());
        this.D = Math.max(this.D, this.f19813t.size());
        m0 m0Var = this.f19815v;
        int i11 = 0;
        while (true) {
            m0Var.u(aVar.i(i11));
            m0[] m0VarArr = this.f19816w;
            if (i11 >= m0VarArr.length) {
                return aVar;
            }
            m0Var = m0VarArr[i11];
            i11++;
        }
    }

    private w2.a F() {
        ArrayList<w2.a> arrayList = this.f19813t;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean G(int i10) {
        int C;
        w2.a aVar = this.f19813t.get(i10);
        if (this.f19815v.C() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            m0[] m0VarArr = this.f19816w;
            if (i11 >= m0VarArr.length) {
                return false;
            }
            C = m0VarArr[i11].C();
            i11++;
        } while (C <= aVar.i(i11));
        return true;
    }

    private boolean H(f fVar) {
        return fVar instanceof w2.a;
    }

    private void J() {
        int O = O(this.f19815v.C(), this.D - 1);
        while (true) {
            int i10 = this.D;
            if (i10 > O) {
                return;
            }
            this.D = i10 + 1;
            K(i10);
        }
    }

    private void K(int i10) {
        w2.a aVar = this.f19813t.get(i10);
        n1 n1Var = aVar.f19795d;
        if (!n1Var.equals(this.f19819z)) {
            this.f19809p.i(this.f19803j, n1Var, aVar.f19796e, aVar.f19797f, aVar.f19798g);
        }
        this.f19819z = n1Var;
    }

    private int O(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f19813t.size()) {
                return this.f19813t.size() - 1;
            }
        } while (this.f19813t.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    private void R() {
        this.f19815v.V();
        for (m0 m0Var : this.f19816w) {
            m0Var.V();
        }
    }

    public T E() {
        return this.f19807n;
    }

    boolean I() {
        return this.B != -9223372036854775807L;
    }

    @Override // o3.h0.b
    /* renamed from: L */
    public void i(f fVar, long j10, long j11, boolean z10) {
        this.f19818y = null;
        this.E = null;
        u2.n nVar = new u2.n(fVar.f19792a, fVar.f19793b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f19810q.a(fVar.f19792a);
        this.f19809p.r(nVar, fVar.f19794c, this.f19803j, fVar.f19795d, fVar.f19796e, fVar.f19797f, fVar.f19798g, fVar.f19799h);
        if (z10) {
            return;
        }
        if (I()) {
            R();
        } else if (H(fVar)) {
            D(this.f19813t.size() - 1);
            if (this.f19813t.isEmpty()) {
                this.B = this.C;
            }
        }
        this.f19808o.l(this);
    }

    @Override // o3.h0.b
    /* renamed from: M */
    public void o(f fVar, long j10, long j11) {
        this.f19818y = null;
        this.f19807n.k(fVar);
        u2.n nVar = new u2.n(fVar.f19792a, fVar.f19793b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f19810q.a(fVar.f19792a);
        this.f19809p.u(nVar, fVar.f19794c, this.f19803j, fVar.f19795d, fVar.f19796e, fVar.f19797f, fVar.f19798g, fVar.f19799h);
        this.f19808o.l(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    @Override // o3.h0.b
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o3.h0.c u(w2.f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.i.u(w2.f, long, long, java.io.IOException, int):o3.h0$c");
    }

    public void P() {
        Q(null);
    }

    public void Q(b<T> bVar) {
        this.A = bVar;
        this.f19815v.R();
        for (m0 m0Var : this.f19816w) {
            m0Var.R();
        }
        this.f19811r.m(this);
    }

    public void S(long j10) {
        boolean Z;
        this.C = j10;
        if (I()) {
            this.B = j10;
            return;
        }
        w2.a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f19813t.size()) {
                break;
            }
            w2.a aVar2 = this.f19813t.get(i11);
            int i12 = (aVar2.f19798g > j10 ? 1 : (aVar2.f19798g == j10 ? 0 : -1));
            if (i12 == 0 && aVar2.f19764k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i12 > 0) {
                break;
            } else {
                i11++;
            }
        }
        if (aVar != null) {
            Z = this.f19815v.Y(aVar.i(0));
        } else {
            Z = this.f19815v.Z(j10, j10 < c());
        }
        if (Z) {
            this.D = O(this.f19815v.C(), 0);
            m0[] m0VarArr = this.f19816w;
            int length = m0VarArr.length;
            while (i10 < length) {
                m0VarArr[i10].Z(j10, true);
                i10++;
            }
            return;
        }
        this.B = j10;
        this.F = false;
        this.f19813t.clear();
        this.D = 0;
        if (!this.f19811r.j()) {
            this.f19811r.g();
            R();
            return;
        }
        this.f19815v.r();
        m0[] m0VarArr2 = this.f19816w;
        int length2 = m0VarArr2.length;
        while (i10 < length2) {
            m0VarArr2[i10].r();
            i10++;
        }
        this.f19811r.f();
    }

    public i<T>.a T(long j10, int i10) {
        for (int i11 = 0; i11 < this.f19816w.length; i11++) {
            if (this.f19804k[i11] == i10) {
                p3.a.f(!this.f19806m[i11]);
                this.f19806m[i11] = true;
                this.f19816w[i11].Z(j10, true);
                return new a(this, this.f19816w[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // u2.o0
    public boolean a() {
        return this.f19811r.j();
    }

    @Override // u2.n0
    public void b() {
        this.f19811r.b();
        this.f19815v.N();
        if (this.f19811r.j()) {
            return;
        }
        this.f19807n.b();
    }

    @Override // u2.o0
    public long c() {
        if (I()) {
            return this.B;
        }
        if (this.F) {
            return Long.MIN_VALUE;
        }
        return F().f19799h;
    }

    @Override // u2.n0
    public boolean d() {
        return !I() && this.f19815v.K(this.F);
    }

    public long e(long j10, q3 q3Var) {
        return this.f19807n.e(j10, q3Var);
    }

    @Override // u2.o0
    public long f() {
        if (this.F) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.B;
        }
        long j10 = this.C;
        w2.a F = F();
        if (!F.h()) {
            if (this.f19813t.size() > 1) {
                ArrayList<w2.a> arrayList = this.f19813t;
                F = arrayList.get(arrayList.size() - 2);
            } else {
                F = null;
            }
        }
        if (F != null) {
            j10 = Math.max(j10, F.f19799h);
        }
        return Math.max(j10, this.f19815v.z());
    }

    @Override // u2.o0
    public boolean g(long j10) {
        List<w2.a> list;
        long j11;
        if (this.F || this.f19811r.j() || this.f19811r.i()) {
            return false;
        }
        boolean I = I();
        if (I) {
            list = Collections.emptyList();
            j11 = this.B;
        } else {
            list = this.f19814u;
            j11 = F().f19799h;
        }
        this.f19807n.i(j10, j11, list, this.f19812s);
        h hVar = this.f19812s;
        boolean z10 = hVar.f19802b;
        f fVar = hVar.f19801a;
        hVar.a();
        if (z10) {
            this.B = -9223372036854775807L;
            this.F = true;
            return true;
        } else if (fVar == null) {
            return false;
        } else {
            this.f19818y = fVar;
            if (H(fVar)) {
                w2.a aVar = (w2.a) fVar;
                if (I) {
                    long j12 = aVar.f19798g;
                    long j13 = this.B;
                    if (j12 != j13) {
                        this.f19815v.b0(j13);
                        for (m0 m0Var : this.f19816w) {
                            m0Var.b0(this.B);
                        }
                    }
                    this.B = -9223372036854775807L;
                }
                aVar.k(this.f19817x);
                this.f19813t.add(aVar);
            } else if (fVar instanceof m) {
                ((m) fVar).g(this.f19817x);
            }
            this.f19809p.A(new u2.n(fVar.f19792a, fVar.f19793b, this.f19811r.n(fVar, this, this.f19810q.d(fVar.f19794c))), fVar.f19794c, this.f19803j, fVar.f19795d, fVar.f19796e, fVar.f19797f, fVar.f19798g, fVar.f19799h);
            return true;
        }
    }

    @Override // u2.o0
    public void h(long j10) {
        if (this.f19811r.i() || I()) {
            return;
        }
        if (!this.f19811r.j()) {
            int g10 = this.f19807n.g(j10, this.f19814u);
            if (g10 < this.f19813t.size()) {
                C(g10);
                return;
            }
            return;
        }
        f fVar = (f) p3.a.e(this.f19818y);
        if (!(H(fVar) && G(this.f19813t.size() - 1)) && this.f19807n.d(j10, fVar, this.f19814u)) {
            this.f19811r.f();
            if (H(fVar)) {
                this.E = (w2.a) fVar;
            }
        }
    }

    @Override // u2.n0
    public int k(o1 o1Var, v1.g gVar, int i10) {
        if (I()) {
            return -3;
        }
        w2.a aVar = this.E;
        if (aVar == null || aVar.i(0) > this.f19815v.C()) {
            J();
            return this.f19815v.S(o1Var, gVar, i10, this.F);
        }
        return -3;
    }

    @Override // o3.h0.f
    public void l() {
        this.f19815v.T();
        for (m0 m0Var : this.f19816w) {
            m0Var.T();
        }
        this.f19807n.a();
        b<T> bVar = this.A;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void r(long j10, boolean z10) {
        if (I()) {
            return;
        }
        int x10 = this.f19815v.x();
        this.f19815v.q(j10, z10, true);
        int x11 = this.f19815v.x();
        if (x11 > x10) {
            long y10 = this.f19815v.y();
            int i10 = 0;
            while (true) {
                m0[] m0VarArr = this.f19816w;
                if (i10 >= m0VarArr.length) {
                    break;
                }
                m0VarArr[i10].q(y10, z10, this.f19806m[i10]);
                i10++;
            }
        }
        B(x11);
    }

    @Override // u2.n0
    public int t(long j10) {
        if (I()) {
            return 0;
        }
        int E = this.f19815v.E(j10, this.F);
        w2.a aVar = this.E;
        if (aVar != null) {
            E = Math.min(E, aVar.i(0) - this.f19815v.C());
        }
        this.f19815v.e0(E);
        J();
        return E;
    }
}
