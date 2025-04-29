package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n3.t;
import o3.g0;
import o3.i0;
import o3.p0;
import p3.n0;
import s1.n1;
import s1.q3;
import t1.t1;
import u2.b0;
import u2.h;
import u2.k;
import u2.o0;
import u2.r;
import u2.t0;
import u2.v0;
import w1.w;
import w1.y;
import w2.i;
import y2.f;
import y2.g;
import y2.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements r, o0.a<i<com.google.android.exoplayer2.source.dash.a>>, i.b<com.google.android.exoplayer2.source.dash.a> {
    private static final Pattern H = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern I = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private r.a A;
    private o0 D;
    private y2.c E;
    private int F;
    private List<f> G;

    /* renamed from: j  reason: collision with root package name */
    final int f3533j;

    /* renamed from: k  reason: collision with root package name */
    private final a.InterfaceC0082a f3534k;

    /* renamed from: l  reason: collision with root package name */
    private final p0 f3535l;

    /* renamed from: m  reason: collision with root package name */
    private final y f3536m;

    /* renamed from: n  reason: collision with root package name */
    private final g0 f3537n;

    /* renamed from: o  reason: collision with root package name */
    private final x2.b f3538o;

    /* renamed from: p  reason: collision with root package name */
    private final long f3539p;

    /* renamed from: q  reason: collision with root package name */
    private final i0 f3540q;

    /* renamed from: r  reason: collision with root package name */
    private final o3.b f3541r;

    /* renamed from: s  reason: collision with root package name */
    private final v0 f3542s;

    /* renamed from: t  reason: collision with root package name */
    private final a[] f3543t;

    /* renamed from: u  reason: collision with root package name */
    private final h f3544u;

    /* renamed from: v  reason: collision with root package name */
    private final e f3545v;

    /* renamed from: x  reason: collision with root package name */
    private final b0.a f3547x;

    /* renamed from: y  reason: collision with root package name */
    private final w.a f3548y;

    /* renamed from: z  reason: collision with root package name */
    private final t1 f3549z;
    private i<com.google.android.exoplayer2.source.dash.a>[] B = F(0);
    private d[] C = new d[0];

    /* renamed from: w  reason: collision with root package name */
    private final IdentityHashMap<i<com.google.android.exoplayer2.source.dash.a>, e.c> f3546w = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f3550a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3551b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3552c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3553d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3554e;

        /* renamed from: f  reason: collision with root package name */
        public final int f3555f;

        /* renamed from: g  reason: collision with root package name */
        public final int f3556g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f3551b = i10;
            this.f3550a = iArr;
            this.f3552c = i11;
            this.f3554e = i12;
            this.f3555f = i13;
            this.f3556g = i14;
            this.f3553d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, y2.c cVar, x2.b bVar, int i11, a.InterfaceC0082a interfaceC0082a, p0 p0Var, y yVar, w.a aVar, g0 g0Var, b0.a aVar2, long j10, i0 i0Var, o3.b bVar2, h hVar, e.b bVar3, t1 t1Var) {
        this.f3533j = i10;
        this.E = cVar;
        this.f3538o = bVar;
        this.F = i11;
        this.f3534k = interfaceC0082a;
        this.f3535l = p0Var;
        this.f3536m = yVar;
        this.f3548y = aVar;
        this.f3537n = g0Var;
        this.f3547x = aVar2;
        this.f3539p = j10;
        this.f3540q = i0Var;
        this.f3541r = bVar2;
        this.f3544u = hVar;
        this.f3549z = t1Var;
        this.f3545v = new e(cVar, bVar3, bVar2);
        this.D = hVar.a(this.B);
        g d10 = cVar.d(i11);
        List<f> list = d10.f20420d;
        this.G = list;
        Pair<v0, a[]> v10 = v(yVar, d10.f20419c, list);
        this.f3542s = (v0) v10.first;
        this.f3543t = (a[]) v10.second;
    }

    private static int[][] A(List<y2.a> list) {
        int i10;
        y2.e w10;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(list.get(i11).f20372a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            y2.a aVar = list.get(i12);
            y2.e y10 = y(aVar.f20376e);
            if (y10 == null) {
                y10 = y(aVar.f20377f);
            }
            if (y10 == null || (i10 = sparseIntArray.get(Integer.parseInt(y10.f20410b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (w10 = w(aVar.f20377f)) != null) {
                for (String str : n0.Q0(w10.f20410b, ",")) {
                    int i13 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i14 = 0; i14 < size2; i14++) {
            iArr[i14] = e5.e.k((Collection) arrayList.get(i14));
            Arrays.sort(iArr[i14]);
        }
        return iArr;
    }

    private int B(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f3543t[i11].f3554e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f3543t[i14].f3552c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] C(t[] tVarArr) {
        int[] iArr = new int[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if (tVarArr[i10] != null) {
                iArr[i10] = this.f3542s.c(tVarArr[i10].c());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean D(List<y2.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<j> list2 = list.get(i10).f20374c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f20435e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int E(int i10, List<y2.a> list, int[][] iArr, boolean[] zArr, n1[][] n1VarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (D(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            n1VarArr[i12] = z(list, iArr[i12]);
            if (n1VarArr[i12].length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static i<com.google.android.exoplayer2.source.dash.a>[] F(int i10) {
        return new i[i10];
    }

    private static n1[] H(y2.e eVar, Pattern pattern, n1 n1Var) {
        String str = eVar.f20410b;
        if (str == null) {
            return new n1[]{n1Var};
        }
        String[] Q0 = n0.Q0(str, ";");
        n1[] n1VarArr = new n1[Q0.length];
        for (int i10 = 0; i10 < Q0.length; i10++) {
            Matcher matcher = pattern.matcher(Q0[i10]);
            if (!matcher.matches()) {
                return new n1[]{n1Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            n1.b b10 = n1Var.b();
            n1VarArr[i10] = b10.U(n1Var.f17408j + ":" + parseInt).H(parseInt).X(matcher.group(2)).G();
        }
        return n1VarArr;
    }

    private void J(t[] tVarArr, boolean[] zArr, u2.n0[] n0VarArr) {
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if (tVarArr[i10] == null || !zArr[i10]) {
                if (n0VarArr[i10] instanceof i) {
                    ((i) n0VarArr[i10]).Q(this);
                } else if (n0VarArr[i10] instanceof i.a) {
                    ((i.a) n0VarArr[i10]).c();
                }
                n0VarArr[i10] = null;
            }
        }
    }

    private void K(t[] tVarArr, u2.n0[] n0VarArr, int[] iArr) {
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            if ((n0VarArr[i10] instanceof k) || (n0VarArr[i10] instanceof i.a)) {
                int B = B(i10, iArr);
                if (!(B == -1 ? n0VarArr[i10] instanceof k : (n0VarArr[i10] instanceof i.a) && ((i.a) n0VarArr[i10]).f19820j == n0VarArr[B])) {
                    if (n0VarArr[i10] instanceof i.a) {
                        ((i.a) n0VarArr[i10]).c();
                    }
                    n0VarArr[i10] = null;
                }
            }
        }
    }

    private void L(t[] tVarArr, u2.n0[] n0VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            t tVar = tVarArr[i10];
            if (tVar != null) {
                if (n0VarArr[i10] == null) {
                    zArr[i10] = true;
                    a aVar = this.f3543t[iArr[i10]];
                    int i11 = aVar.f3552c;
                    if (i11 == 0) {
                        n0VarArr[i10] = u(aVar, tVar, j10);
                    } else if (i11 == 2) {
                        n0VarArr[i10] = new d(this.G.get(aVar.f3553d), tVar.c().b(0), this.E.f20385d);
                    }
                } else if (n0VarArr[i10] instanceof i) {
                    ((com.google.android.exoplayer2.source.dash.a) ((i) n0VarArr[i10]).E()).c(tVar);
                }
            }
        }
        for (int i12 = 0; i12 < tVarArr.length; i12++) {
            if (n0VarArr[i12] == null && tVarArr[i12] != null) {
                a aVar2 = this.f3543t[iArr[i12]];
                if (aVar2.f3552c == 1) {
                    int B = B(i12, iArr);
                    if (B == -1) {
                        n0VarArr[i12] = new k();
                    } else {
                        n0VarArr[i12] = ((i) n0VarArr[B]).T(j10, aVar2.f3551b);
                    }
                }
            }
        }
    }

    private static void o(List<f> list, t0[] t0VarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            f fVar = list.get(i11);
            n1 G = new n1.b().U(fVar.a()).g0("application/x-emsg").G();
            t0VarArr[i10] = new t0(fVar.a() + ":" + i11, G);
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int t(y yVar, List<y2.a> list, int[][] iArr, int i10, boolean[] zArr, n1[][] n1VarArr, t0[] t0VarArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f20374c);
            }
            int size = arrayList.size();
            n1[] n1VarArr2 = new n1[size];
            for (int i16 = 0; i16 < size; i16++) {
                n1 n1Var = ((j) arrayList.get(i16)).f20432b;
                n1VarArr2[i16] = n1Var.c(yVar.f(n1Var));
            }
            y2.a aVar = list.get(iArr2[0]);
            int i17 = aVar.f20372a;
            String num = i17 != -1 ? Integer.toString(i17) : "unset:" + i13;
            int i18 = i14 + 1;
            if (zArr[i13]) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
                i18 = -1;
            }
            if (n1VarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            t0VarArr[i14] = new t0(num, n1VarArr2);
            aVarArr[i14] = a.d(aVar.f20373b, iArr2, i14, i18, i11);
            if (i18 != -1) {
                String str = num + ":emsg";
                t0VarArr[i18] = new t0(str, new n1.b().U(str).g0("application/x-emsg").G());
                aVarArr[i18] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                t0VarArr[i11] = new t0(num + ":cc", n1VarArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private i<com.google.android.exoplayer2.source.dash.a> u(a aVar, t tVar, long j10) {
        t0 t0Var;
        int i10;
        t0 t0Var2;
        int i11;
        int i12 = aVar.f3555f;
        boolean z10 = i12 != -1;
        e.c cVar = null;
        if (z10) {
            t0Var = this.f3542s.b(i12);
            i10 = 1;
        } else {
            t0Var = null;
            i10 = 0;
        }
        int i13 = aVar.f3556g;
        boolean z11 = i13 != -1;
        if (z11) {
            t0Var2 = this.f3542s.b(i13);
            i10 += t0Var2.f18978j;
        } else {
            t0Var2 = null;
        }
        n1[] n1VarArr = new n1[i10];
        int[] iArr = new int[i10];
        if (z10) {
            n1VarArr[0] = t0Var.b(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < t0Var2.f18978j; i14++) {
                n1VarArr[i11] = t0Var2.b(i14);
                iArr[i11] = 3;
                arrayList.add(n1VarArr[i11]);
                i11++;
            }
        }
        if (this.E.f20385d && z10) {
            cVar = this.f3545v.k();
        }
        e.c cVar2 = cVar;
        i<com.google.android.exoplayer2.source.dash.a> iVar = new i<>(aVar.f3551b, iArr, n1VarArr, this.f3534k.a(this.f3540q, this.E, this.f3538o, this.F, aVar.f3550a, tVar, aVar.f3551b, this.f3539p, z10, arrayList, cVar2, this.f3535l, this.f3549z), this, this.f3541r, j10, this.f3536m, this.f3548y, this.f3537n, this.f3547x);
        synchronized (this) {
            this.f3546w.put(iVar, cVar2);
        }
        return iVar;
    }

    private static Pair<v0, a[]> v(y yVar, List<y2.a> list, List<f> list2) {
        int[][] A = A(list);
        int length = A.length;
        boolean[] zArr = new boolean[length];
        n1[][] n1VarArr = new n1[length];
        int E = E(length, list, A, zArr, n1VarArr) + length + list2.size();
        t0[] t0VarArr = new t0[E];
        a[] aVarArr = new a[E];
        o(list2, t0VarArr, aVarArr, t(yVar, list, A, length, zArr, n1VarArr, t0VarArr, aVarArr));
        return Pair.create(new v0(t0VarArr), aVarArr);
    }

    private static y2.e w(List<y2.e> list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static y2.e x(List<y2.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            y2.e eVar = list.get(i10);
            if (str.equals(eVar.f20409a)) {
                return eVar;
            }
        }
        return null;
    }

    private static y2.e y(List<y2.e> list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    private static n1[] z(List<y2.a> list, int[] iArr) {
        n1 G;
        Pattern pattern;
        for (int i10 : iArr) {
            y2.a aVar = list.get(i10);
            List<y2.e> list2 = list.get(i10).f20375d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                y2.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f20409a)) {
                    G = new n1.b().g0("application/cea-608").U(aVar.f20372a + ":cea608").G();
                    pattern = H;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f20409a)) {
                    G = new n1.b().g0("application/cea-708").U(aVar.f20372a + ":cea708").G();
                    pattern = I;
                }
                return H(eVar, pattern, G);
            }
        }
        return new n1[0];
    }

    @Override // u2.o0.a
    /* renamed from: G */
    public void l(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        this.A.l(this);
    }

    public void I() {
        this.f3545v.o();
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.B) {
            iVar.Q(this);
        }
        this.A = null;
    }

    public void M(y2.c cVar, int i10) {
        d[] dVarArr;
        this.E = cVar;
        this.F = i10;
        this.f3545v.q(cVar);
        i<com.google.android.exoplayer2.source.dash.a>[] iVarArr = this.B;
        if (iVarArr != null) {
            for (i<com.google.android.exoplayer2.source.dash.a> iVar : iVarArr) {
                iVar.E().h(cVar, i10);
            }
            this.A.l(this);
        }
        this.G = cVar.d(i10).f20420d;
        for (d dVar : this.C) {
            Iterator<f> it = this.G.iterator();
            while (true) {
                if (it.hasNext()) {
                    f next = it.next();
                    if (next.a().equals(dVar.a())) {
                        boolean z10 = true;
                        dVar.e(next, (cVar.f20385d && i10 == cVar.e() - 1) ? false : false);
                    }
                }
            }
        }
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.D.a();
    }

    @Override // u2.r, u2.o0
    public long c() {
        return this.D.c();
    }

    @Override // w2.i.b
    public synchronized void d(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        e.c remove = this.f3546w.remove(iVar);
        if (remove != null) {
            remove.n();
        }
    }

    @Override // u2.r
    public long e(long j10, q3 q3Var) {
        i<com.google.android.exoplayer2.source.dash.a>[] iVarArr;
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.B) {
            if (iVar.f19803j == 2) {
                return iVar.e(j10, q3Var);
            }
        }
        return j10;
    }

    @Override // u2.r, u2.o0
    public long f() {
        return this.D.f();
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        return this.D.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        this.D.h(j10);
    }

    @Override // u2.r
    public void j(r.a aVar, long j10) {
        this.A = aVar;
        aVar.i(this);
    }

    @Override // u2.r
    public long m(t[] tVarArr, boolean[] zArr, u2.n0[] n0VarArr, boolean[] zArr2, long j10) {
        int[] C = C(tVarArr);
        J(tVarArr, zArr, n0VarArr);
        K(tVarArr, n0VarArr, C);
        L(tVarArr, n0VarArr, zArr2, j10, C);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (u2.n0 n0Var : n0VarArr) {
            if (n0Var instanceof i) {
                arrayList.add((i) n0Var);
            } else if (n0Var instanceof d) {
                arrayList2.add((d) n0Var);
            }
        }
        i<com.google.android.exoplayer2.source.dash.a>[] F = F(arrayList.size());
        this.B = F;
        arrayList.toArray(F);
        d[] dVarArr = new d[arrayList2.size()];
        this.C = dVarArr;
        arrayList2.toArray(dVarArr);
        this.D = this.f3544u.a(this.B);
        return j10;
    }

    @Override // u2.r
    public long n() {
        return -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        return this.f3542s;
    }

    @Override // u2.r
    public void q() {
        this.f3540q.b();
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.B) {
            iVar.r(j10, z10);
        }
    }

    @Override // u2.r
    public long s(long j10) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.B) {
            iVar.S(j10);
        }
        for (d dVar : this.C) {
            dVar.c(j10);
        }
        return j10;
    }
}
