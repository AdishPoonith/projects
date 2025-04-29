package n3;

import com.google.common.collect.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n3.t;
import p3.n0;
import s1.n1;
import s1.y3;
import u2.t0;
import u2.u;
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: h  reason: collision with root package name */
    private final o3.f f14063h;

    /* renamed from: i  reason: collision with root package name */
    private final long f14064i;

    /* renamed from: j  reason: collision with root package name */
    private final long f14065j;

    /* renamed from: k  reason: collision with root package name */
    private final long f14066k;

    /* renamed from: l  reason: collision with root package name */
    private final int f14067l;

    /* renamed from: m  reason: collision with root package name */
    private final int f14068m;

    /* renamed from: n  reason: collision with root package name */
    private final float f14069n;

    /* renamed from: o  reason: collision with root package name */
    private final float f14070o;

    /* renamed from: p  reason: collision with root package name */
    private final com.google.common.collect.q<C0206a> f14071p;

    /* renamed from: q  reason: collision with root package name */
    private final p3.d f14072q;

    /* renamed from: r  reason: collision with root package name */
    private float f14073r;

    /* renamed from: s  reason: collision with root package name */
    private int f14074s;

    /* renamed from: t  reason: collision with root package name */
    private int f14075t;

    /* renamed from: u  reason: collision with root package name */
    private long f14076u;

    /* renamed from: v  reason: collision with root package name */
    private w2.n f14077v;

    /* renamed from: n3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0206a {

        /* renamed from: a  reason: collision with root package name */
        public final long f14078a;

        /* renamed from: b  reason: collision with root package name */
        public final long f14079b;

        public C0206a(long j10, long j11) {
            this.f14078a = j10;
            this.f14079b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0206a) {
                C0206a c0206a = (C0206a) obj;
                return this.f14078a == c0206a.f14078a && this.f14079b == c0206a.f14079b;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f14078a) * 31) + ((int) this.f14079b);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements t.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f14080a;

        /* renamed from: b  reason: collision with root package name */
        private final int f14081b;

        /* renamed from: c  reason: collision with root package name */
        private final int f14082c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14083d;

        /* renamed from: e  reason: collision with root package name */
        private final int f14084e;

        /* renamed from: f  reason: collision with root package name */
        private final float f14085f;

        /* renamed from: g  reason: collision with root package name */
        private final float f14086g;

        /* renamed from: h  reason: collision with root package name */
        private final p3.d f14087h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, p3.d.f15342a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, p3.d dVar) {
            this.f14080a = i10;
            this.f14081b = i11;
            this.f14082c = i12;
            this.f14083d = i13;
            this.f14084e = i14;
            this.f14085f = f10;
            this.f14086g = f11;
            this.f14087h = dVar;
        }

        @Override // n3.t.b
        public final t[] a(t.a[] aVarArr, o3.f fVar, u.b bVar, y3 y3Var) {
            com.google.common.collect.q B = a.B(aVarArr);
            t[] tVarArr = new t[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                t.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f14254b;
                    if (iArr.length != 0) {
                        tVarArr[i10] = iArr.length == 1 ? new u(aVar.f14253a, iArr[0], aVar.f14255c) : b(aVar.f14253a, iArr, aVar.f14255c, fVar, (com.google.common.collect.q) B.get(i10));
                    }
                }
            }
            return tVarArr;
        }

        protected a b(t0 t0Var, int[] iArr, int i10, o3.f fVar, com.google.common.collect.q<C0206a> qVar) {
            return new a(t0Var, iArr, i10, fVar, this.f14080a, this.f14081b, this.f14082c, this.f14083d, this.f14084e, this.f14085f, this.f14086g, qVar, this.f14087h);
        }
    }

    protected a(t0 t0Var, int[] iArr, int i10, o3.f fVar, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<C0206a> list, p3.d dVar) {
        super(t0Var, iArr, i10);
        o3.f fVar2;
        long j13;
        if (j12 < j10) {
            p3.r.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            fVar2 = fVar;
            j13 = j10;
        } else {
            fVar2 = fVar;
            j13 = j12;
        }
        this.f14063h = fVar2;
        this.f14064i = j10 * 1000;
        this.f14065j = j11 * 1000;
        this.f14066k = j13 * 1000;
        this.f14067l = i11;
        this.f14068m = i12;
        this.f14069n = f10;
        this.f14070o = f11;
        this.f14071p = com.google.common.collect.q.v(list);
        this.f14072q = dVar;
        this.f14073r = 1.0f;
        this.f14075t = 0;
        this.f14076u = -9223372036854775807L;
    }

    private int A(long j10, long j11) {
        long C = C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f14145b; i11++) {
            if (j10 == Long.MIN_VALUE || !g(i11, j10)) {
                n1 a10 = a(i11);
                if (z(a10, a10.f17415q, C)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.q<com.google.common.collect.q<C0206a>> B(t.a[] aVarArr) {
        q.a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10] == null || aVarArr[i10].f14254b.length <= 1) {
                aVar = null;
            } else {
                aVar = com.google.common.collect.q.t();
                aVar.a(new C0206a(0L, 0L));
            }
            arrayList.add(aVar);
        }
        long[][] G = G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i11 = 0; i11 < G.length; i11++) {
            jArr[i11] = G[i11].length == 0 ? 0L : G[i11][0];
        }
        y(arrayList, jArr);
        com.google.common.collect.q<Integer> H = H(G);
        for (int i12 = 0; i12 < H.size(); i12++) {
            int intValue = H.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = G[intValue][i13];
            y(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        y(arrayList, jArr);
        q.a t10 = com.google.common.collect.q.t();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            q.a aVar2 = (q.a) arrayList.get(i15);
            t10.a(aVar2 == null ? com.google.common.collect.q.z() : aVar2.h());
        }
        return t10.h();
    }

    private long C(long j10) {
        long I = I(j10);
        if (this.f14071p.isEmpty()) {
            return I;
        }
        int i10 = 1;
        while (i10 < this.f14071p.size() - 1 && this.f14071p.get(i10).f14078a < I) {
            i10++;
        }
        C0206a c0206a = this.f14071p.get(i10 - 1);
        C0206a c0206a2 = this.f14071p.get(i10);
        long j11 = c0206a.f14078a;
        long j12 = c0206a.f14079b;
        return j12 + ((((float) (I - j11)) / ((float) (c0206a2.f14078a - j11))) * ((float) (c0206a2.f14079b - j12)));
    }

    private long D(List<? extends w2.n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        w2.n nVar = (w2.n) com.google.common.collect.t.c(list);
        long j10 = nVar.f19798g;
        if (j10 != -9223372036854775807L) {
            long j11 = nVar.f19799h;
            if (j11 != -9223372036854775807L) {
                return j11 - j10;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    private long F(w2.o[] oVarArr, List<? extends w2.n> list) {
        int i10 = this.f14074s;
        if (i10 < oVarArr.length && oVarArr[i10].next()) {
            w2.o oVar = oVarArr[this.f14074s];
            return oVar.a() - oVar.b();
        }
        for (w2.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.a() - oVar2.b();
            }
        }
        return D(list);
    }

    private static long[][] G(t.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            t.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f14254b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f14254b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f14253a.b(iArr[i11]).f17415q;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    private static com.google.common.collect.q<Integer> H(long[][] jArr) {
        com.google.common.collect.z c10 = com.google.common.collect.b0.a().a().c();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                int length = jArr[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double d10 = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        d10 = Math.log(jArr[i10][i11]);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    c10.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return com.google.common.collect.q.v(c10.values());
    }

    private long I(long j10) {
        long f10;
        long g10 = ((float) this.f14063h.g()) * this.f14069n;
        if (this.f14063h.f() == -9223372036854775807L || j10 == -9223372036854775807L) {
            return ((float) g10) / this.f14073r;
        }
        float f11 = (float) j10;
        return (((float) g10) * Math.max((f11 / this.f14073r) - ((float) f10), 0.0f)) / f11;
    }

    private long J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f14064i;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min(((float) j10) * this.f14070o, this.f14064i);
    }

    private static void y(List<q.a<C0206a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            q.a<C0206a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.a(new C0206a(j10, jArr[i10]));
            }
        }
    }

    protected long E() {
        return this.f14066k;
    }

    protected boolean K(long j10, List<? extends w2.n> list) {
        long j11 = this.f14076u;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((w2.n) com.google.common.collect.t.c(list)).equals(this.f14077v));
    }

    @Override // n3.c, n3.t
    public void e() {
        this.f14077v = null;
    }

    @Override // n3.c, n3.t
    public void i() {
        this.f14076u = -9223372036854775807L;
        this.f14077v = null;
    }

    @Override // n3.c, n3.t
    public int j(long j10, List<? extends w2.n> list) {
        int i10;
        int i11;
        long a10 = this.f14072q.a();
        if (K(a10, list)) {
            this.f14076u = a10;
            this.f14077v = list.isEmpty() ? null : (w2.n) com.google.common.collect.t.c(list);
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            long e02 = n0.e0(list.get(size - 1).f19798g - j10, this.f14073r);
            long E = E();
            if (e02 < E) {
                return size;
            }
            n1 a11 = a(A(a10, D(list)));
            for (int i12 = 0; i12 < size; i12++) {
                w2.n nVar = list.get(i12);
                n1 n1Var = nVar.f19795d;
                if (n0.e0(nVar.f19798g - j10, this.f14073r) >= E && n1Var.f17415q < a11.f17415q && (i10 = n1Var.A) != -1 && i10 <= this.f14068m && (i11 = n1Var.f17424z) != -1 && i11 <= this.f14067l && i10 < a11.A) {
                    return i12;
                }
            }
            return size;
        }
        return list.size();
    }

    @Override // n3.t
    public int n() {
        return this.f14075t;
    }

    @Override // n3.t
    public int o() {
        return this.f14074s;
    }

    @Override // n3.t
    public void p(long j10, long j11, long j12, List<? extends w2.n> list, w2.o[] oVarArr) {
        long a10 = this.f14072q.a();
        long F = F(oVarArr, list);
        int i10 = this.f14075t;
        if (i10 == 0) {
            this.f14075t = 1;
            this.f14074s = A(a10, F);
            return;
        }
        int i11 = this.f14074s;
        int d10 = list.isEmpty() ? -1 : d(((w2.n) com.google.common.collect.t.c(list)).f19795d);
        if (d10 != -1) {
            i10 = ((w2.n) com.google.common.collect.t.c(list)).f19796e;
            i11 = d10;
        }
        int A = A(a10, F);
        if (!g(i11, a10)) {
            n1 a11 = a(i11);
            n1 a12 = a(A);
            long J = J(j12, F);
            int i12 = a12.f17415q;
            int i13 = a11.f17415q;
            if ((i12 > i13 && j11 < J) || (i12 < i13 && j11 >= this.f14065j)) {
                A = i11;
            }
        }
        if (A != i11) {
            i10 = 3;
        }
        this.f14075t = i10;
        this.f14074s = A;
    }

    @Override // n3.c, n3.t
    public void q(float f10) {
        this.f14073r = f10;
    }

    @Override // n3.t
    public Object r() {
        return null;
    }

    protected boolean z(n1 n1Var, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
