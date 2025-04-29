package z2;

import a3.h;
import a3.l;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import o3.g0;
import o3.p0;
import p3.v;
import s1.n1;
import s1.q3;
import t1.t1;
import u2.b0;
import u2.n0;
import u2.o0;
import u2.r;
import u2.t0;
import u2.v0;
import w1.w;
import w1.y;
import z2.p;
/* loaded from: classes.dex */
public final class k implements u2.r, l.b {
    private r.a A;
    private int B;
    private v0 C;
    private int G;
    private o0 H;

    /* renamed from: j  reason: collision with root package name */
    private final h f20782j;

    /* renamed from: k  reason: collision with root package name */
    private final a3.l f20783k;

    /* renamed from: l  reason: collision with root package name */
    private final g f20784l;

    /* renamed from: m  reason: collision with root package name */
    private final p0 f20785m;

    /* renamed from: n  reason: collision with root package name */
    private final y f20786n;

    /* renamed from: o  reason: collision with root package name */
    private final w.a f20787o;

    /* renamed from: p  reason: collision with root package name */
    private final g0 f20788p;

    /* renamed from: q  reason: collision with root package name */
    private final b0.a f20789q;

    /* renamed from: r  reason: collision with root package name */
    private final o3.b f20790r;

    /* renamed from: u  reason: collision with root package name */
    private final u2.h f20793u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f20794v;

    /* renamed from: w  reason: collision with root package name */
    private final int f20795w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f20796x;

    /* renamed from: y  reason: collision with root package name */
    private final t1 f20797y;

    /* renamed from: z  reason: collision with root package name */
    private final p.b f20798z = new b();

    /* renamed from: s  reason: collision with root package name */
    private final IdentityHashMap<n0, Integer> f20791s = new IdentityHashMap<>();

    /* renamed from: t  reason: collision with root package name */
    private final s f20792t = new s();
    private p[] D = new p[0];
    private p[] E = new p[0];
    private int[][] F = new int[0];

    /* loaded from: classes.dex */
    private class b implements p.b {
        private b() {
        }

        @Override // u2.o0.a
        /* renamed from: a */
        public void l(p pVar) {
            k.this.A.l(k.this);
        }

        @Override // z2.p.b
        public void b() {
            p[] pVarArr;
            if (k.i(k.this) > 0) {
                return;
            }
            int i10 = 0;
            for (p pVar : k.this.D) {
                i10 += pVar.p().f18991j;
            }
            t0[] t0VarArr = new t0[i10];
            int i11 = 0;
            for (p pVar2 : k.this.D) {
                int i12 = pVar2.p().f18991j;
                int i13 = 0;
                while (i13 < i12) {
                    t0VarArr[i11] = pVar2.p().b(i13);
                    i13++;
                    i11++;
                }
            }
            k.this.C = new v0(t0VarArr);
            k.this.A.i(k.this);
        }

        @Override // z2.p.b
        public void k(Uri uri) {
            k.this.f20783k.j(uri);
        }
    }

    public k(h hVar, a3.l lVar, g gVar, p0 p0Var, y yVar, w.a aVar, g0 g0Var, b0.a aVar2, o3.b bVar, u2.h hVar2, boolean z10, int i10, boolean z11, t1 t1Var) {
        this.f20782j = hVar;
        this.f20783k = lVar;
        this.f20784l = gVar;
        this.f20785m = p0Var;
        this.f20786n = yVar;
        this.f20787o = aVar;
        this.f20788p = g0Var;
        this.f20789q = aVar2;
        this.f20790r = bVar;
        this.f20793u = hVar2;
        this.f20794v = z10;
        this.f20795w = i10;
        this.f20796x = z11;
        this.f20797y = t1Var;
        this.H = hVar2.a(new o0[0]);
    }

    private static n1 A(n1 n1Var) {
        String L = p3.n0.L(n1Var.f17416r, 2);
        return new n1.b().U(n1Var.f17408j).W(n1Var.f17409k).M(n1Var.f17418t).g0(v.g(L)).K(L).Z(n1Var.f17417s).I(n1Var.f17413o).b0(n1Var.f17414p).n0(n1Var.f17424z).S(n1Var.A).R(n1Var.B).i0(n1Var.f17411m).e0(n1Var.f17412n).G();
    }

    static /* synthetic */ int i(k kVar) {
        int i10 = kVar.B - 1;
        kVar.B = i10;
        return i10;
    }

    private void u(long j10, List<h.a> list, List<p> list2, List<int[]> list3, Map<String, w1.m> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f148d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (p3.n0.c(str, list.get(i11).f148d)) {
                        h.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f145a);
                        arrayList2.add(aVar.f146b);
                        z10 &= p3.n0.K(aVar.f146b.f17416r, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                p x10 = x(str2, 1, (Uri[]) arrayList.toArray((Uri[]) p3.n0.k(new Uri[0])), (n1[]) arrayList2.toArray(new n1[0]), null, Collections.emptyList(), map, j10);
                list3.add(e5.e.k(arrayList3));
                list2.add(x10);
                if (this.f20794v && z10) {
                    x10.d0(new t0[]{new t0(str2, (n1[]) arrayList2.toArray(new n1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v(a3.h r21, long r22, java.util.List<z2.p> r24, java.util.List<int[]> r25, java.util.Map<java.lang.String, w1.m> r26) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.k.v(a3.h, long, java.util.List, java.util.List, java.util.Map):void");
    }

    private void w(long j10) {
        a3.h hVar = (a3.h) p3.a.e(this.f20783k.b());
        Map<String, w1.m> z10 = this.f20796x ? z(hVar.f144m) : Collections.emptyMap();
        boolean z11 = !hVar.f136e.isEmpty();
        List<h.a> list = hVar.f138g;
        List<h.a> list2 = hVar.f139h;
        this.B = 0;
        ArrayList arrayList = new ArrayList();
        List<int[]> arrayList2 = new ArrayList<>();
        if (z11) {
            v(hVar, j10, arrayList, arrayList2, z10);
        }
        u(j10, list, arrayList, arrayList2, z10);
        this.G = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            h.a aVar = list2.get(i10);
            String str = "subtitle:" + i10 + ":" + aVar.f148d;
            ArrayList arrayList3 = arrayList2;
            int i11 = i10;
            p x10 = x(str, 3, new Uri[]{aVar.f145a}, new n1[]{aVar.f146b}, null, Collections.emptyList(), z10, j10);
            arrayList3.add(new int[]{i11});
            arrayList.add(x10);
            x10.d0(new t0[]{new t0(str, aVar.f146b)}, 0, new int[0]);
            i10 = i11 + 1;
            arrayList2 = arrayList3;
        }
        this.D = (p[]) arrayList.toArray(new p[0]);
        this.F = (int[][]) arrayList2.toArray(new int[0]);
        this.B = this.D.length;
        for (int i12 = 0; i12 < this.G; i12++) {
            this.D[i12].m0(true);
        }
        for (p pVar : this.D) {
            pVar.B();
        }
        this.E = this.D;
    }

    private p x(String str, int i10, Uri[] uriArr, n1[] n1VarArr, n1 n1Var, List<n1> list, Map<String, w1.m> map, long j10) {
        return new p(str, i10, this.f20798z, new f(this.f20782j, this.f20783k, uriArr, n1VarArr, this.f20784l, this.f20785m, this.f20792t, list, this.f20797y), map, this.f20790r, j10, n1Var, this.f20786n, this.f20787o, this.f20788p, this.f20789q, this.f20795w);
    }

    private static n1 y(n1 n1Var, n1 n1Var2, boolean z10) {
        String str;
        k2.a aVar;
        int i10;
        int i11;
        int i12;
        String str2;
        String str3;
        if (n1Var2 != null) {
            str2 = n1Var2.f17416r;
            aVar = n1Var2.f17417s;
            int i13 = n1Var2.H;
            i11 = n1Var2.f17411m;
            int i14 = n1Var2.f17412n;
            String str4 = n1Var2.f17410l;
            str3 = n1Var2.f17409k;
            i12 = i13;
            i10 = i14;
            str = str4;
        } else {
            String L = p3.n0.L(n1Var.f17416r, 1);
            k2.a aVar2 = n1Var.f17417s;
            if (z10) {
                int i15 = n1Var.H;
                int i16 = n1Var.f17411m;
                int i17 = n1Var.f17412n;
                str = n1Var.f17410l;
                str2 = L;
                str3 = n1Var.f17409k;
                i12 = i15;
                i11 = i16;
                aVar = aVar2;
                i10 = i17;
            } else {
                str = null;
                aVar = aVar2;
                i10 = 0;
                i11 = 0;
                i12 = -1;
                str2 = L;
                str3 = null;
            }
        }
        return new n1.b().U(n1Var.f17408j).W(str3).M(n1Var.f17418t).g0(v.g(str2)).K(str2).Z(aVar).I(z10 ? n1Var.f17413o : -1).b0(z10 ? n1Var.f17414p : -1).J(i12).i0(i11).e0(i10).X(str).G();
    }

    private static Map<String, w1.m> z(List<w1.m> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            w1.m mVar = list.get(i10);
            String str = mVar.f19728l;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                w1.m mVar2 = (w1.m) arrayList.get(i11);
                if (TextUtils.equals(mVar2.f19728l, str)) {
                    mVar = mVar.f(mVar2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, mVar);
        }
        return hashMap;
    }

    public void B() {
        this.f20783k.d(this);
        for (p pVar : this.D) {
            pVar.f0();
        }
        this.A = null;
    }

    @Override // u2.r, u2.o0
    public boolean a() {
        return this.H.a();
    }

    @Override // a3.l.b
    public void b() {
        for (p pVar : this.D) {
            pVar.b0();
        }
        this.A.l(this);
    }

    @Override // u2.r, u2.o0
    public long c() {
        return this.H.c();
    }

    @Override // a3.l.b
    public boolean d(Uri uri, g0.c cVar, boolean z10) {
        boolean z11 = true;
        for (p pVar : this.D) {
            z11 &= pVar.a0(uri, cVar, z10);
        }
        this.A.l(this);
        return z11;
    }

    @Override // u2.r
    public long e(long j10, q3 q3Var) {
        p[] pVarArr;
        for (p pVar : this.E) {
            if (pVar.R()) {
                return pVar.e(j10, q3Var);
            }
        }
        return j10;
    }

    @Override // u2.r, u2.o0
    public long f() {
        return this.H.f();
    }

    @Override // u2.r, u2.o0
    public boolean g(long j10) {
        if (this.C == null) {
            for (p pVar : this.D) {
                pVar.B();
            }
            return false;
        }
        return this.H.g(j10);
    }

    @Override // u2.r, u2.o0
    public void h(long j10) {
        this.H.h(j10);
    }

    @Override // u2.r
    public void j(r.a aVar, long j10) {
        this.A = aVar;
        this.f20783k.l(this);
        w(j10);
    }

    @Override // u2.r
    public long m(n3.t[] tVarArr, boolean[] zArr, n0[] n0VarArr, boolean[] zArr2, long j10) {
        n0[] n0VarArr2 = n0VarArr;
        int[] iArr = new int[tVarArr.length];
        int[] iArr2 = new int[tVarArr.length];
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            iArr[i10] = n0VarArr2[i10] == null ? -1 : this.f20791s.get(n0VarArr2[i10]).intValue();
            iArr2[i10] = -1;
            if (tVarArr[i10] != null) {
                t0 c10 = tVarArr[i10].c();
                int i11 = 0;
                while (true) {
                    p[] pVarArr = this.D;
                    if (i11 >= pVarArr.length) {
                        break;
                    } else if (pVarArr[i11].p().c(c10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.f20791s.clear();
        int length = tVarArr.length;
        n0[] n0VarArr3 = new n0[length];
        n0[] n0VarArr4 = new n0[tVarArr.length];
        n3.t[] tVarArr2 = new n3.t[tVarArr.length];
        p[] pVarArr2 = new p[this.D.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.D.length) {
            for (int i14 = 0; i14 < tVarArr.length; i14++) {
                n3.t tVar = null;
                n0VarArr4[i14] = iArr[i14] == i13 ? n0VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    tVar = tVarArr[i14];
                }
                tVarArr2[i14] = tVar;
            }
            p pVar = this.D[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            n3.t[] tVarArr3 = tVarArr2;
            p[] pVarArr3 = pVarArr2;
            boolean j02 = pVar.j0(tVarArr2, zArr, n0VarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= tVarArr.length) {
                    break;
                }
                n0 n0Var = n0VarArr4[i18];
                if (iArr2[i18] == i17) {
                    p3.a.e(n0Var);
                    n0VarArr3[i18] = n0Var;
                    this.f20791s.put(n0Var, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    p3.a.f(n0Var == null);
                }
                i18++;
            }
            if (z11) {
                pVarArr3[i15] = pVar;
                i12 = i15 + 1;
                if (i15 == 0) {
                    pVar.m0(true);
                    if (!j02) {
                        p[] pVarArr4 = this.E;
                        if (pVarArr4.length != 0 && pVar == pVarArr4[0]) {
                        }
                    }
                    this.f20792t.b();
                    z10 = true;
                } else {
                    pVar.m0(i17 < this.G);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            n0VarArr2 = n0VarArr;
            pVarArr2 = pVarArr3;
            length = i16;
            tVarArr2 = tVarArr3;
        }
        System.arraycopy(n0VarArr3, 0, n0VarArr2, 0, length);
        p[] pVarArr5 = (p[]) p3.n0.G0(pVarArr2, i12);
        this.E = pVarArr5;
        this.H = this.f20793u.a(pVarArr5);
        return j10;
    }

    @Override // u2.r
    public long n() {
        return -9223372036854775807L;
    }

    @Override // u2.r
    public v0 p() {
        return (v0) p3.a.e(this.C);
    }

    @Override // u2.r
    public void q() {
        for (p pVar : this.D) {
            pVar.q();
        }
    }

    @Override // u2.r
    public void r(long j10, boolean z10) {
        for (p pVar : this.E) {
            pVar.r(j10, z10);
        }
    }

    @Override // u2.r
    public long s(long j10) {
        p[] pVarArr = this.E;
        if (pVarArr.length > 0) {
            boolean i02 = pVarArr[0].i0(j10, false);
            int i10 = 1;
            while (true) {
                p[] pVarArr2 = this.E;
                if (i10 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i10].i0(j10, i02);
                i10++;
            }
            if (i02) {
                this.f20792t.b();
            }
        }
        return j10;
    }
}
