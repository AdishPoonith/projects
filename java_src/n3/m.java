package n3;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.common.collect.h0;
import com.google.common.collect.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import n3.a;
import n3.a0;
import n3.m;
import n3.t;
import n3.v;
import p3.n0;
import s1.h;
import s1.m3;
import s1.n1;
import s1.o3;
import s1.y3;
import u2.t0;
import u2.u;
import u2.v0;
/* loaded from: classes.dex */
public class m extends v {

    /* renamed from: k  reason: collision with root package name */
    private static final h0<Integer> f14171k = h0.a(new Comparator() { // from class: n3.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int M;
            M = m.M((Integer) obj, (Integer) obj2);
            return M;
        }
    });

    /* renamed from: l  reason: collision with root package name */
    private static final h0<Integer> f14172l = h0.a(new Comparator() { // from class: n3.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int N;
            N = m.N((Integer) obj, (Integer) obj2);
            return N;
        }
    });

    /* renamed from: d  reason: collision with root package name */
    private final Object f14173d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f14174e;

    /* renamed from: f  reason: collision with root package name */
    private final t.b f14175f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f14176g;

    /* renamed from: h  reason: collision with root package name */
    private d f14177h;

    /* renamed from: i  reason: collision with root package name */
    private f f14178i;

    /* renamed from: j  reason: collision with root package name */
    private u1.e f14179j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b extends h<b> implements Comparable<b> {
        private final int A;
        private final int B;
        private final int C;
        private final boolean D;
        private final boolean E;

        /* renamed from: n  reason: collision with root package name */
        private final int f14180n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f14181o;

        /* renamed from: p  reason: collision with root package name */
        private final String f14182p;

        /* renamed from: q  reason: collision with root package name */
        private final d f14183q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f14184r;

        /* renamed from: s  reason: collision with root package name */
        private final int f14185s;

        /* renamed from: t  reason: collision with root package name */
        private final int f14186t;

        /* renamed from: u  reason: collision with root package name */
        private final int f14187u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f14188v;

        /* renamed from: w  reason: collision with root package name */
        private final int f14189w;

        /* renamed from: x  reason: collision with root package name */
        private final int f14190x;

        /* renamed from: y  reason: collision with root package name */
        private final boolean f14191y;

        /* renamed from: z  reason: collision with root package name */
        private final int f14192z;

        public b(int i10, t0 t0Var, int i11, d dVar, int i12, boolean z10, b5.o<n1> oVar) {
            super(i10, t0Var, i11);
            int i13;
            int i14;
            int i15;
            this.f14183q = dVar;
            this.f14182p = m.Q(this.f14234m.f17410l);
            this.f14184r = m.I(i12, false);
            int i16 = 0;
            while (true) {
                i13 = Integer.MAX_VALUE;
                if (i16 >= dVar.f14113w.size()) {
                    i16 = Integer.MAX_VALUE;
                    i14 = 0;
                    break;
                }
                i14 = m.B(this.f14234m, dVar.f14113w.get(i16), false);
                if (i14 > 0) {
                    break;
                }
                i16++;
            }
            this.f14186t = i16;
            this.f14185s = i14;
            this.f14187u = m.E(this.f14234m.f17412n, dVar.f14114x);
            n1 n1Var = this.f14234m;
            int i17 = n1Var.f17412n;
            this.f14188v = i17 == 0 || (i17 & 1) != 0;
            this.f14191y = (n1Var.f17411m & 1) != 0;
            int i18 = n1Var.H;
            this.f14192z = i18;
            this.A = n1Var.I;
            int i19 = n1Var.f17415q;
            this.B = i19;
            this.f14181o = (i19 == -1 || i19 <= dVar.f14116z) && (i18 == -1 || i18 <= dVar.f14115y) && oVar.apply(n1Var);
            String[] g02 = n0.g0();
            int i20 = 0;
            while (true) {
                if (i20 >= g02.length) {
                    i20 = Integer.MAX_VALUE;
                    i15 = 0;
                    break;
                }
                i15 = m.B(this.f14234m, g02[i20], false);
                if (i15 > 0) {
                    break;
                }
                i20++;
            }
            this.f14189w = i20;
            this.f14190x = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.A.size()) {
                    String str = this.f14234m.f17419u;
                    if (str != null && str.equals(dVar.A.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.C = i13;
            this.D = m3.e(i12) == 128;
            this.E = m3.g(i12) == 64;
            this.f14180n = l(i12, z10);
        }

        public static int h(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static com.google.common.collect.q<b> k(int i10, t0 t0Var, d dVar, int[] iArr, boolean z10, b5.o<n1> oVar) {
            q.a t10 = com.google.common.collect.q.t();
            for (int i11 = 0; i11 < t0Var.f18978j; i11++) {
                t10.a(new b(i10, t0Var, i11, dVar, iArr[i11], z10, oVar));
            }
            return t10.h();
        }

        private int l(int i10, boolean z10) {
            if (m.I(i10, this.f14183q.f14205w0)) {
                if (this.f14181o || this.f14183q.f14199q0) {
                    if (m.I(i10, false) && this.f14181o && this.f14234m.f17415q != -1) {
                        d dVar = this.f14183q;
                        if (!dVar.G && !dVar.F && (dVar.f14207y0 || !z10)) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        @Override // n3.m.h
        public int b() {
            return this.f14180n;
        }

        @Override // java.lang.Comparable
        /* renamed from: i */
        public int compareTo(b bVar) {
            h0 d10 = (this.f14181o && this.f14184r) ? m.f14171k : m.f14171k.d();
            com.google.common.collect.k f10 = com.google.common.collect.k.j().g(this.f14184r, bVar.f14184r).f(Integer.valueOf(this.f14186t), Integer.valueOf(bVar.f14186t), h0.b().d()).d(this.f14185s, bVar.f14185s).d(this.f14187u, bVar.f14187u).g(this.f14191y, bVar.f14191y).g(this.f14188v, bVar.f14188v).f(Integer.valueOf(this.f14189w), Integer.valueOf(bVar.f14189w), h0.b().d()).d(this.f14190x, bVar.f14190x).g(this.f14181o, bVar.f14181o).f(Integer.valueOf(this.C), Integer.valueOf(bVar.C), h0.b().d()).f(Integer.valueOf(this.B), Integer.valueOf(bVar.B), this.f14183q.F ? m.f14171k.d() : m.f14172l).g(this.D, bVar.D).g(this.E, bVar.E).f(Integer.valueOf(this.f14192z), Integer.valueOf(bVar.f14192z), d10).f(Integer.valueOf(this.A), Integer.valueOf(bVar.A), d10);
            Integer valueOf = Integer.valueOf(this.B);
            Integer valueOf2 = Integer.valueOf(bVar.B);
            if (!n0.c(this.f14182p, bVar.f14182p)) {
                d10 = m.f14172l;
            }
            return f10.f(valueOf, valueOf2, d10).i();
        }

        @Override // n3.m.h
        /* renamed from: n */
        public boolean g(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f14183q;
            if ((dVar.f14202t0 || ((i11 = this.f14234m.H) != -1 && i11 == bVar.f14234m.H)) && (dVar.f14200r0 || ((str = this.f14234m.f17419u) != null && TextUtils.equals(str, bVar.f14234m.f17419u)))) {
                d dVar2 = this.f14183q;
                if ((dVar2.f14201s0 || ((i10 = this.f14234m.I) != -1 && i10 == bVar.f14234m.I)) && (dVar2.f14203u0 || (this.D == bVar.D && this.E == bVar.E))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: j  reason: collision with root package name */
        private final boolean f14193j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f14194k;

        public c(n1 n1Var, int i10) {
            this.f14193j = (n1Var.f17411m & 1) != 0;
            this.f14194k = m.I(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(c cVar) {
            return com.google.common.collect.k.j().g(this.f14194k, cVar.f14194k).g(this.f14193j, cVar.f14193j).i();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a0 {
        public static final d B0;
        @Deprecated
        public static final d C0;
        private static final String D0;
        private static final String E0;
        private static final String F0;
        private static final String G0;
        private static final String H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        public static final h.a<d> U0;
        private final SparseBooleanArray A0;

        /* renamed from: m0  reason: collision with root package name */
        public final boolean f14195m0;

        /* renamed from: n0  reason: collision with root package name */
        public final boolean f14196n0;

        /* renamed from: o0  reason: collision with root package name */
        public final boolean f14197o0;

        /* renamed from: p0  reason: collision with root package name */
        public final boolean f14198p0;

        /* renamed from: q0  reason: collision with root package name */
        public final boolean f14199q0;

        /* renamed from: r0  reason: collision with root package name */
        public final boolean f14200r0;

        /* renamed from: s0  reason: collision with root package name */
        public final boolean f14201s0;

        /* renamed from: t0  reason: collision with root package name */
        public final boolean f14202t0;

        /* renamed from: u0  reason: collision with root package name */
        public final boolean f14203u0;

        /* renamed from: v0  reason: collision with root package name */
        public final boolean f14204v0;

        /* renamed from: w0  reason: collision with root package name */
        public final boolean f14205w0;

        /* renamed from: x0  reason: collision with root package name */
        public final boolean f14206x0;

        /* renamed from: y0  reason: collision with root package name */
        public final boolean f14207y0;

        /* renamed from: z0  reason: collision with root package name */
        private final SparseArray<Map<v0, e>> f14208z0;

        /* loaded from: classes.dex */
        public static final class a extends a0.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private final SparseArray<Map<v0, e>> N;
            private final SparseBooleanArray O;

            @Deprecated
            public a() {
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray<>();
                this.O = new SparseBooleanArray();
                Z();
            }

            private a(Bundle bundle) {
                super(bundle);
                Z();
                d dVar = d.B0;
                n0(bundle.getBoolean(d.D0, dVar.f14195m0));
                i0(bundle.getBoolean(d.E0, dVar.f14196n0));
                j0(bundle.getBoolean(d.F0, dVar.f14197o0));
                h0(bundle.getBoolean(d.R0, dVar.f14198p0));
                l0(bundle.getBoolean(d.G0, dVar.f14199q0));
                e0(bundle.getBoolean(d.H0, dVar.f14200r0));
                f0(bundle.getBoolean(d.I0, dVar.f14201s0));
                c0(bundle.getBoolean(d.J0, dVar.f14202t0));
                d0(bundle.getBoolean(d.S0, dVar.f14203u0));
                k0(bundle.getBoolean(d.T0, dVar.f14204v0));
                m0(bundle.getBoolean(d.K0, dVar.f14205w0));
                r0(bundle.getBoolean(d.L0, dVar.f14206x0));
                g0(bundle.getBoolean(d.M0, dVar.f14207y0));
                this.N = new SparseArray<>();
                q0(bundle);
                this.O = a0(bundle.getIntArray(d.Q0));
            }

            private a(d dVar) {
                super(dVar);
                this.A = dVar.f14195m0;
                this.B = dVar.f14196n0;
                this.C = dVar.f14197o0;
                this.D = dVar.f14198p0;
                this.E = dVar.f14199q0;
                this.F = dVar.f14200r0;
                this.G = dVar.f14201s0;
                this.H = dVar.f14202t0;
                this.I = dVar.f14203u0;
                this.J = dVar.f14204v0;
                this.K = dVar.f14205w0;
                this.L = dVar.f14206x0;
                this.M = dVar.f14207y0;
                this.N = Y(dVar.f14208z0);
                this.O = dVar.A0.clone();
            }

            private static SparseArray<Map<v0, e>> Y(SparseArray<Map<v0, e>> sparseArray) {
                SparseArray<Map<v0, e>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void Z() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            private SparseBooleanArray a0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            private void q0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(d.N0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.O0);
                com.google.common.collect.q z10 = parcelableArrayList == null ? com.google.common.collect.q.z() : p3.c.b(v0.f18990o, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.P0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : p3.c.c(e.f14212q, sparseParcelableArray);
                if (intArray == null || intArray.length != z10.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    p0(intArray[i10], (v0) z10.get(i10), (e) sparseArray.get(i10));
                }
            }

            @Override // n3.a0.a
            /* renamed from: X */
            public d A() {
                return new d(this);
            }

            protected a b0(a0 a0Var) {
                super.D(a0Var);
                return this;
            }

            public a c0(boolean z10) {
                this.H = z10;
                return this;
            }

            public a d0(boolean z10) {
                this.I = z10;
                return this;
            }

            public a e0(boolean z10) {
                this.F = z10;
                return this;
            }

            public a f0(boolean z10) {
                this.G = z10;
                return this;
            }

            public a g0(boolean z10) {
                this.M = z10;
                return this;
            }

            public a h0(boolean z10) {
                this.D = z10;
                return this;
            }

            public a i0(boolean z10) {
                this.B = z10;
                return this;
            }

            public a j0(boolean z10) {
                this.C = z10;
                return this;
            }

            public a k0(boolean z10) {
                this.J = z10;
                return this;
            }

            public a l0(boolean z10) {
                this.E = z10;
                return this;
            }

            public a m0(boolean z10) {
                this.K = z10;
                return this;
            }

            public a n0(boolean z10) {
                this.A = z10;
                return this;
            }

            @Override // n3.a0.a
            /* renamed from: o0 */
            public a E(Context context) {
                super.E(context);
                return this;
            }

            @Deprecated
            public a p0(int i10, v0 v0Var, e eVar) {
                Map<v0, e> map = this.N.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.N.put(i10, map);
                }
                if (map.containsKey(v0Var) && n0.c(map.get(v0Var), eVar)) {
                    return this;
                }
                map.put(v0Var, eVar);
                return this;
            }

            public a r0(boolean z10) {
                this.L = z10;
                return this;
            }

            @Override // n3.a0.a
            /* renamed from: s0 */
            public a G(int i10, int i11, boolean z10) {
                super.G(i10, i11, z10);
                return this;
            }

            @Override // n3.a0.a
            /* renamed from: t0 */
            public a H(Context context, boolean z10) {
                super.H(context, z10);
                return this;
            }
        }

        static {
            d A = new a().A();
            B0 = A;
            C0 = A;
            D0 = n0.q0(1000);
            E0 = n0.q0(1001);
            F0 = n0.q0(1002);
            G0 = n0.q0(1003);
            H0 = n0.q0(1004);
            I0 = n0.q0(1005);
            J0 = n0.q0(1006);
            K0 = n0.q0(1007);
            L0 = n0.q0(1008);
            M0 = n0.q0(1009);
            N0 = n0.q0(1010);
            O0 = n0.q0(1011);
            P0 = n0.q0(1012);
            Q0 = n0.q0(1013);
            R0 = n0.q0(1014);
            S0 = n0.q0(1015);
            T0 = n0.q0(1016);
            U0 = new h.a() { // from class: n3.n
                @Override // s1.h.a
                public final s1.h a(Bundle bundle) {
                    m.d M;
                    M = m.d.M(bundle);
                    return M;
                }
            };
        }

        private d(a aVar) {
            super(aVar);
            this.f14195m0 = aVar.A;
            this.f14196n0 = aVar.B;
            this.f14197o0 = aVar.C;
            this.f14198p0 = aVar.D;
            this.f14199q0 = aVar.E;
            this.f14200r0 = aVar.F;
            this.f14201s0 = aVar.G;
            this.f14202t0 = aVar.H;
            this.f14203u0 = aVar.I;
            this.f14204v0 = aVar.J;
            this.f14205w0 = aVar.K;
            this.f14206x0 = aVar.L;
            this.f14207y0 = aVar.M;
            this.f14208z0 = aVar.N;
            this.A0 = aVar.O;
        }

        private static boolean E(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean F(SparseArray<Map<v0, e>> sparseArray, SparseArray<Map<v0, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !G(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean G(java.util.Map<u2.v0, n3.m.e> r4, java.util.Map<u2.v0, n3.m.e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                u2.v0 r1 = (u2.v0) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = p3.n0.c(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.m.d.G(java.util.Map, java.util.Map):boolean");
        }

        public static d I(Context context) {
            return new a(context).A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d M(Bundle bundle) {
            return new a(bundle).A();
        }

        public a H() {
            return new a();
        }

        public boolean J(int i10) {
            return this.A0.get(i10);
        }

        @Deprecated
        public e K(int i10, v0 v0Var) {
            Map<v0, e> map = this.f14208z0.get(i10);
            if (map != null) {
                return map.get(v0Var);
            }
            return null;
        }

        @Deprecated
        public boolean L(int i10, v0 v0Var) {
            Map<v0, e> map = this.f14208z0.get(i10);
            return map != null && map.containsKey(v0Var);
        }

        @Override // n3.a0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.f14195m0 == dVar.f14195m0 && this.f14196n0 == dVar.f14196n0 && this.f14197o0 == dVar.f14197o0 && this.f14198p0 == dVar.f14198p0 && this.f14199q0 == dVar.f14199q0 && this.f14200r0 == dVar.f14200r0 && this.f14201s0 == dVar.f14201s0 && this.f14202t0 == dVar.f14202t0 && this.f14203u0 == dVar.f14203u0 && this.f14204v0 == dVar.f14204v0 && this.f14205w0 == dVar.f14205w0 && this.f14206x0 == dVar.f14206x0 && this.f14207y0 == dVar.f14207y0 && E(this.A0, dVar.A0) && F(this.f14208z0, dVar.f14208z0);
        }

        @Override // n3.a0
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f14195m0 ? 1 : 0)) * 31) + (this.f14196n0 ? 1 : 0)) * 31) + (this.f14197o0 ? 1 : 0)) * 31) + (this.f14198p0 ? 1 : 0)) * 31) + (this.f14199q0 ? 1 : 0)) * 31) + (this.f14200r0 ? 1 : 0)) * 31) + (this.f14201s0 ? 1 : 0)) * 31) + (this.f14202t0 ? 1 : 0)) * 31) + (this.f14203u0 ? 1 : 0)) * 31) + (this.f14204v0 ? 1 : 0)) * 31) + (this.f14205w0 ? 1 : 0)) * 31) + (this.f14206x0 ? 1 : 0)) * 31) + (this.f14207y0 ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements s1.h {

        /* renamed from: n  reason: collision with root package name */
        private static final String f14209n = n0.q0(0);

        /* renamed from: o  reason: collision with root package name */
        private static final String f14210o = n0.q0(1);

        /* renamed from: p  reason: collision with root package name */
        private static final String f14211p = n0.q0(2);

        /* renamed from: q  reason: collision with root package name */
        public static final h.a<e> f14212q = new h.a() { // from class: n3.o
            @Override // s1.h.a
            public final s1.h a(Bundle bundle) {
                m.e b10;
                b10 = m.e.b(bundle);
                return b10;
            }
        };

        /* renamed from: j  reason: collision with root package name */
        public final int f14213j;

        /* renamed from: k  reason: collision with root package name */
        public final int[] f14214k;

        /* renamed from: l  reason: collision with root package name */
        public final int f14215l;

        /* renamed from: m  reason: collision with root package name */
        public final int f14216m;

        public e(int i10, int[] iArr, int i11) {
            this.f14213j = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f14214k = copyOf;
            this.f14215l = iArr.length;
            this.f14216m = i11;
            Arrays.sort(copyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e b(Bundle bundle) {
            int i10 = bundle.getInt(f14209n, -1);
            int[] intArray = bundle.getIntArray(f14210o);
            int i11 = bundle.getInt(f14211p, -1);
            p3.a.a(i10 >= 0 && i11 >= 0);
            p3.a.e(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f14213j == eVar.f14213j && Arrays.equals(this.f14214k, eVar.f14214k) && this.f14216m == eVar.f14216m;
        }

        public int hashCode() {
            return (((this.f14213j * 31) + Arrays.hashCode(this.f14214k)) * 31) + this.f14216m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final Spatializer f14217a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14218b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f14219c;

        /* renamed from: d  reason: collision with root package name */
        private Spatializer.OnSpatializerStateChangedListener f14220d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f14221a;

            a(f fVar, m mVar) {
                this.f14221a = mVar;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f14221a.P();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f14221a.P();
            }
        }

        private f(Spatializer spatializer) {
            this.f14217a = spatializer;
            this.f14218b = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static f g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        public boolean a(u1.e eVar, n1 n1Var) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(n0.G(("audio/eac3-joc".equals(n1Var.f17419u) && n1Var.H == 16) ? 12 : n1Var.H));
            int i10 = n1Var.I;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f14217a.canBeSpatialized(eVar.b().f18578a, channelMask.build());
        }

        public void b(m mVar, Looper looper) {
            if (this.f14220d == null && this.f14219c == null) {
                this.f14220d = new a(this, mVar);
                Handler handler = new Handler(looper);
                this.f14219c = handler;
                Spatializer spatializer = this.f14217a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new p(handler), this.f14220d);
            }
        }

        public boolean c() {
            return this.f14217a.isAvailable();
        }

        public boolean d() {
            return this.f14217a.isEnabled();
        }

        public boolean e() {
            return this.f14218b;
        }

        public void f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f14220d;
            if (onSpatializerStateChangedListener == null || this.f14219c == null) {
                return;
            }
            this.f14217a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) n0.j(this.f14219c)).removeCallbacksAndMessages(null);
            this.f14219c = null;
            this.f14220d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g extends h<g> implements Comparable<g> {

        /* renamed from: n  reason: collision with root package name */
        private final int f14222n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f14223o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f14224p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f14225q;

        /* renamed from: r  reason: collision with root package name */
        private final int f14226r;

        /* renamed from: s  reason: collision with root package name */
        private final int f14227s;

        /* renamed from: t  reason: collision with root package name */
        private final int f14228t;

        /* renamed from: u  reason: collision with root package name */
        private final int f14229u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f14230v;

        public g(int i10, t0 t0Var, int i11, d dVar, int i12, String str) {
            super(i10, t0Var, i11);
            int i13;
            int i14 = 0;
            this.f14223o = m.I(i12, false);
            int i15 = this.f14234m.f17411m & (~dVar.D);
            this.f14224p = (i15 & 1) != 0;
            this.f14225q = (i15 & 2) != 0;
            int i16 = Integer.MAX_VALUE;
            com.google.common.collect.q<String> A = dVar.B.isEmpty() ? com.google.common.collect.q.A("") : dVar.B;
            int i17 = 0;
            while (true) {
                if (i17 >= A.size()) {
                    i13 = 0;
                    break;
                }
                i13 = m.B(this.f14234m, A.get(i17), dVar.E);
                if (i13 > 0) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            this.f14226r = i16;
            this.f14227s = i13;
            int E = m.E(this.f14234m.f17412n, dVar.C);
            this.f14228t = E;
            this.f14230v = (this.f14234m.f17412n & 1088) != 0;
            int B = m.B(this.f14234m, str, m.Q(str) == null);
            this.f14229u = B;
            boolean z10 = i13 > 0 || (dVar.B.isEmpty() && E > 0) || this.f14224p || (this.f14225q && B > 0);
            if (m.I(i12, dVar.f14205w0) && z10) {
                i14 = 1;
            }
            this.f14222n = i14;
        }

        public static int h(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static com.google.common.collect.q<g> k(int i10, t0 t0Var, d dVar, int[] iArr, String str) {
            q.a t10 = com.google.common.collect.q.t();
            for (int i11 = 0; i11 < t0Var.f18978j; i11++) {
                t10.a(new g(i10, t0Var, i11, dVar, iArr[i11], str));
            }
            return t10.h();
        }

        @Override // n3.m.h
        public int b() {
            return this.f14222n;
        }

        @Override // java.lang.Comparable
        /* renamed from: i */
        public int compareTo(g gVar) {
            com.google.common.collect.k d10 = com.google.common.collect.k.j().g(this.f14223o, gVar.f14223o).f(Integer.valueOf(this.f14226r), Integer.valueOf(gVar.f14226r), h0.b().d()).d(this.f14227s, gVar.f14227s).d(this.f14228t, gVar.f14228t).g(this.f14224p, gVar.f14224p).f(Boolean.valueOf(this.f14225q), Boolean.valueOf(gVar.f14225q), this.f14227s == 0 ? h0.b() : h0.b().d()).d(this.f14229u, gVar.f14229u);
            if (this.f14228t == 0) {
                d10 = d10.h(this.f14230v, gVar.f14230v);
            }
            return d10.i();
        }

        @Override // n3.m.h
        /* renamed from: l */
        public boolean g(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class h<T extends h<T>> {

        /* renamed from: j  reason: collision with root package name */
        public final int f14231j;

        /* renamed from: k  reason: collision with root package name */
        public final t0 f14232k;

        /* renamed from: l  reason: collision with root package name */
        public final int f14233l;

        /* renamed from: m  reason: collision with root package name */
        public final n1 f14234m;

        /* loaded from: classes.dex */
        public interface a<T extends h<T>> {
            List<T> a(int i10, t0 t0Var, int[] iArr);
        }

        public h(int i10, t0 t0Var, int i11) {
            this.f14231j = i10;
            this.f14232k = t0Var;
            this.f14233l = i11;
            this.f14234m = t0Var.b(i11);
        }

        public abstract int b();

        public abstract boolean g(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class i extends h<i> {
        private final int A;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f14235n;

        /* renamed from: o  reason: collision with root package name */
        private final d f14236o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f14237p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f14238q;

        /* renamed from: r  reason: collision with root package name */
        private final int f14239r;

        /* renamed from: s  reason: collision with root package name */
        private final int f14240s;

        /* renamed from: t  reason: collision with root package name */
        private final int f14241t;

        /* renamed from: u  reason: collision with root package name */
        private final int f14242u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f14243v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f14244w;

        /* renamed from: x  reason: collision with root package name */
        private final int f14245x;

        /* renamed from: y  reason: collision with root package name */
        private final boolean f14246y;

        /* renamed from: z  reason: collision with root package name */
        private final boolean f14247z;

        /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00cc A[EDGE_INSN: B:78:0x00cc->B:68:0x00cc ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public i(int r5, u2.t0 r6, int r7, n3.m.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n3.m.i.<init>(int, u2.t0, int, n3.m$d, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int k(i iVar, i iVar2) {
            com.google.common.collect.k g10 = com.google.common.collect.k.j().g(iVar.f14238q, iVar2.f14238q).d(iVar.f14242u, iVar2.f14242u).g(iVar.f14243v, iVar2.f14243v).g(iVar.f14235n, iVar2.f14235n).g(iVar.f14237p, iVar2.f14237p).f(Integer.valueOf(iVar.f14241t), Integer.valueOf(iVar2.f14241t), h0.b().d()).g(iVar.f14246y, iVar2.f14246y).g(iVar.f14247z, iVar2.f14247z);
            if (iVar.f14246y && iVar.f14247z) {
                g10 = g10.d(iVar.A, iVar2.A);
            }
            return g10.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int l(i iVar, i iVar2) {
            h0 d10 = (iVar.f14235n && iVar.f14238q) ? m.f14171k : m.f14171k.d();
            return com.google.common.collect.k.j().f(Integer.valueOf(iVar.f14239r), Integer.valueOf(iVar2.f14239r), iVar.f14236o.F ? m.f14171k.d() : m.f14172l).f(Integer.valueOf(iVar.f14240s), Integer.valueOf(iVar2.f14240s), d10).f(Integer.valueOf(iVar.f14239r), Integer.valueOf(iVar2.f14239r), d10).i();
        }

        public static int n(List<i> list, List<i> list2) {
            return com.google.common.collect.k.j().f((i) Collections.max(list, new Comparator() { // from class: n3.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int k10;
                    k10 = m.i.k((m.i) obj, (m.i) obj2);
                    return k10;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: n3.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int k10;
                    k10 = m.i.k((m.i) obj, (m.i) obj2);
                    return k10;
                }
            }), new Comparator() { // from class: n3.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int k10;
                    k10 = m.i.k((m.i) obj, (m.i) obj2);
                    return k10;
                }
            }).d(list.size(), list2.size()).f((i) Collections.max(list, new Comparator() { // from class: n3.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l10;
                    l10 = m.i.l((m.i) obj, (m.i) obj2);
                    return l10;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: n3.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l10;
                    l10 = m.i.l((m.i) obj, (m.i) obj2);
                    return l10;
                }
            }), new Comparator() { // from class: n3.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int l10;
                    l10 = m.i.l((m.i) obj, (m.i) obj2);
                    return l10;
                }
            }).i();
        }

        public static com.google.common.collect.q<i> o(int i10, t0 t0Var, d dVar, int[] iArr, int i11) {
            int C = m.C(t0Var, dVar.f14108r, dVar.f14109s, dVar.f14110t);
            q.a t10 = com.google.common.collect.q.t();
            for (int i12 = 0; i12 < t0Var.f18978j; i12++) {
                int f10 = t0Var.b(i12).f();
                t10.a(new i(i10, t0Var, i12, dVar, iArr[i12], i11, C == Integer.MAX_VALUE || (f10 != -1 && f10 <= C)));
            }
            return t10.h();
        }

        private int p(int i10, int i11) {
            if ((this.f14234m.f17412n & 16384) == 0 && m.I(i10, this.f14236o.f14205w0)) {
                if (this.f14235n || this.f14236o.f14195m0) {
                    if (m.I(i10, false) && this.f14237p && this.f14235n && this.f14234m.f17415q != -1) {
                        d dVar = this.f14236o;
                        if (!dVar.G && !dVar.F && (i10 & i11) != 0) {
                            return 2;
                        }
                    }
                    return 1;
                }
                return 0;
            }
            return 0;
        }

        @Override // n3.m.h
        public int b() {
            return this.f14245x;
        }

        @Override // n3.m.h
        /* renamed from: q */
        public boolean g(i iVar) {
            return (this.f14244w || n0.c(this.f14234m.f17419u, iVar.f14234m.f17419u)) && (this.f14236o.f14198p0 || (this.f14246y == iVar.f14246y && this.f14247z == iVar.f14247z));
        }
    }

    public m(Context context) {
        this(context, new a.b());
    }

    public m(Context context, a0 a0Var, t.b bVar) {
        this(a0Var, bVar, context);
    }

    public m(Context context, t.b bVar) {
        this(context, d.I(context), bVar);
    }

    private m(a0 a0Var, t.b bVar, Context context) {
        d A;
        this.f14173d = new Object();
        this.f14174e = context != null ? context.getApplicationContext() : null;
        this.f14175f = bVar;
        if (a0Var instanceof d) {
            A = (d) a0Var;
        } else {
            A = (context == null ? d.B0 : d.I(context)).H().b0(a0Var).A();
        }
        this.f14177h = A;
        this.f14179j = u1.e.f18565p;
        boolean z10 = context != null && n0.w0(context);
        this.f14176g = z10;
        if (!z10 && context != null && n0.f15397a >= 32) {
            this.f14178i = f.g(context);
        }
        if (this.f14177h.f14204v0 && context == null) {
            p3.r.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static void A(v0 v0Var, a0 a0Var, Map<Integer, y> map) {
        y yVar;
        for (int i10 = 0; i10 < v0Var.f18991j; i10++) {
            y yVar2 = a0Var.H.get(v0Var.b(i10));
            if (yVar2 != null && ((yVar = map.get(Integer.valueOf(yVar2.b()))) == null || (yVar.f14271k.isEmpty() && !yVar2.f14271k.isEmpty()))) {
                map.put(Integer.valueOf(yVar2.b()), yVar2);
            }
        }
    }

    protected static int B(n1 n1Var, String str, boolean z10) {
        if (TextUtils.isEmpty(str) || !str.equals(n1Var.f17410l)) {
            String Q = Q(str);
            String Q2 = Q(n1Var.f17410l);
            if (Q2 == null || Q == null) {
                return (z10 && Q2 == null) ? 1 : 0;
            } else if (Q2.startsWith(Q) || Q.startsWith(Q2)) {
                return 3;
            } else {
                return n0.R0(Q2, "-")[0].equals(n0.R0(Q, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int C(t0 t0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < t0Var.f18978j; i14++) {
                n1 b10 = t0Var.b(i14);
                int i15 = b10.f17424z;
                if (i15 > 0 && (i12 = b10.A) > 0) {
                    Point D = D(z10, i10, i11, i15, i12);
                    int i16 = b10.f17424z;
                    int i17 = b10.A;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (D.x * 0.98f)) && i17 >= ((int) (D.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point D(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p3.n0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p3.n0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.m.D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int E(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G(n1 n1Var) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f14173d) {
            z10 = !this.f14177h.f14204v0 || this.f14176g || n1Var.H <= 2 || (H(n1Var) && (n0.f15397a < 32 || (fVar2 = this.f14178i) == null || !fVar2.e())) || (n0.f15397a >= 32 && (fVar = this.f14178i) != null && fVar.e() && this.f14178i.c() && this.f14178i.d() && this.f14178i.a(this.f14179j, n1Var));
        }
        return z10;
    }

    private static boolean H(n1 n1Var) {
        String str = n1Var.f17419u;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    protected static boolean I(int i10, boolean z10) {
        int f10 = m3.f(i10);
        return f10 == 4 || (z10 && f10 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List J(d dVar, boolean z10, int i10, t0 t0Var, int[] iArr) {
        return b.k(i10, t0Var, dVar, iArr, z10, new b5.o() { // from class: n3.d
            @Override // b5.o
            public final boolean apply(Object obj) {
                boolean G;
                G = m.this.G((n1) obj);
                return G;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List K(d dVar, String str, int i10, t0 t0Var, int[] iArr) {
        return g.k(i10, t0Var, dVar, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List L(d dVar, int[] iArr, int i10, t0 t0Var, int[] iArr2) {
        return i.o(i10, t0Var, dVar, iArr2, iArr[i10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int N(Integer num, Integer num2) {
        return 0;
    }

    private static void O(v.a aVar, int[][][] iArr, o3[] o3VarArr, t[] tVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int e10 = aVar.e(i12);
            t tVar = tVarArr[i12];
            if ((e10 == 1 || e10 == 2) && tVar != null && R(iArr[i12], aVar.f(i12), tVar)) {
                if (e10 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else if (i10 != -1) {
                    z10 = false;
                    break;
                } else {
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            o3 o3Var = new o3(true);
            o3VarArr[i11] = o3Var;
            o3VarArr[i10] = o3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        boolean z10;
        f fVar;
        synchronized (this.f14173d) {
            z10 = this.f14177h.f14204v0 && !this.f14176g && n0.f15397a >= 32 && (fVar = this.f14178i) != null && fVar.e();
        }
        if (z10) {
            c();
        }
    }

    protected static String Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean R(int[][] iArr, v0 v0Var, t tVar) {
        if (tVar == null) {
            return false;
        }
        int c10 = v0Var.c(tVar.c());
        for (int i10 = 0; i10 < tVar.length(); i10++) {
            if (m3.h(iArr[c10][tVar.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends h<T>> Pair<t.a, Integer> W(int i10, v.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccess;
        v.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d10 = aVar.d();
        int i12 = 0;
        while (i12 < d10) {
            if (i10 == aVar3.e(i12)) {
                v0 f10 = aVar3.f(i12);
                for (int i13 = 0; i13 < f10.f18991j; i13++) {
                    t0 b10 = f10.b(i13);
                    List<T> a10 = aVar2.a(i12, b10, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b10.f18978j];
                    int i14 = 0;
                    while (i14 < b10.f18978j) {
                        T t10 = a10.get(i14);
                        int b11 = t10.b();
                        if (zArr[i14] || b11 == 0) {
                            i11 = d10;
                        } else {
                            if (b11 == 1) {
                                randomAccess = com.google.common.collect.q.A(t10);
                                i11 = d10;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < b10.f18978j) {
                                    T t11 = a10.get(i15);
                                    int i16 = d10;
                                    if (t11.b() == 2 && t10.g(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    d10 = i16;
                                }
                                i11 = d10;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i14++;
                        d10 = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            d10 = d10;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f14233l;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new t.a(hVar.f14232k, iArr2), Integer.valueOf(hVar.f14231j));
    }

    private static void y(v.a aVar, d dVar, t.a[] aVarArr) {
        int d10 = aVar.d();
        for (int i10 = 0; i10 < d10; i10++) {
            v0 f10 = aVar.f(i10);
            if (dVar.L(i10, f10)) {
                e K = dVar.K(i10, f10);
                aVarArr[i10] = (K == null || K.f14214k.length == 0) ? null : new t.a(f10.b(K.f14213j), K.f14214k, K.f14216m);
            }
        }
    }

    private static void z(v.a aVar, a0 a0Var, t.a[] aVarArr) {
        int d10 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < d10; i10++) {
            A(aVar.f(i10), a0Var, hashMap);
        }
        A(aVar.h(), a0Var, hashMap);
        for (int i11 = 0; i11 < d10; i11++) {
            y yVar = (y) hashMap.get(Integer.valueOf(aVar.e(i11)));
            if (yVar != null) {
                aVarArr[i11] = (yVar.f14271k.isEmpty() || aVar.f(i11).c(yVar.f14270j) == -1) ? null : new t.a(yVar.f14270j, e5.e.k(yVar.f14271k));
            }
        }
    }

    protected t.a[] S(v.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int d10 = aVar.d();
        t.a[] aVarArr = new t.a[d10];
        Pair<t.a, Integer> X = X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (t.a) X.first;
        }
        Pair<t.a, Integer> T = T(aVar, iArr, iArr2, dVar);
        if (T != null) {
            aVarArr[((Integer) T.second).intValue()] = (t.a) T.first;
        }
        if (T == null) {
            str = null;
        } else {
            Object obj = T.first;
            str = ((t.a) obj).f14253a.b(((t.a) obj).f14254b[0]).f17410l;
        }
        Pair<t.a, Integer> V = V(aVar, iArr, dVar, str);
        if (V != null) {
            aVarArr[((Integer) V.second).intValue()] = (t.a) V.first;
        }
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (e10 != 2 && e10 != 1 && e10 != 3) {
                aVarArr[i10] = U(e10, aVar.f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    protected Pair<t.a, Integer> T(v.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f18991j > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return W(1, aVar, iArr, new h.a() { // from class: n3.l
            @Override // n3.m.h.a
            public final List a(int i11, t0 t0Var, int[] iArr3) {
                List J;
                J = m.this.J(dVar, z10, i11, t0Var, iArr3);
                return J;
            }
        }, new Comparator() { // from class: n3.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.b.h((List) obj, (List) obj2);
            }
        });
    }

    protected t.a U(int i10, v0 v0Var, int[][] iArr, d dVar) {
        t0 t0Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < v0Var.f18991j; i12++) {
            t0 b10 = v0Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b10.f18978j; i13++) {
                if (I(iArr2[i13], dVar.f14205w0)) {
                    c cVar2 = new c(b10.b(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        t0Var = b10;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (t0Var == null) {
            return null;
        }
        return new t.a(t0Var, i11);
    }

    protected Pair<t.a, Integer> V(v.a aVar, int[][][] iArr, final d dVar, final String str) {
        return W(3, aVar, iArr, new h.a() { // from class: n3.j
            @Override // n3.m.h.a
            public final List a(int i10, t0 t0Var, int[] iArr2) {
                List K;
                K = m.K(m.d.this, str, i10, t0Var, iArr2);
                return K;
            }
        }, new Comparator() { // from class: n3.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.g.h((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<t.a, Integer> X(v.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return W(2, aVar, iArr, new h.a() { // from class: n3.k
            @Override // n3.m.h.a
            public final List a(int i10, t0 t0Var, int[] iArr3) {
                List L;
                L = m.L(m.d.this, iArr2, i10, t0Var, iArr3);
                return L;
            }
        }, new Comparator() { // from class: n3.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return m.i.n((List) obj, (List) obj2);
            }
        });
    }

    @Override // n3.c0
    public boolean d() {
        return true;
    }

    @Override // n3.c0
    public void f() {
        f fVar;
        synchronized (this.f14173d) {
            if (n0.f15397a >= 32 && (fVar = this.f14178i) != null) {
                fVar.f();
            }
        }
        super.f();
    }

    @Override // n3.c0
    public void h(u1.e eVar) {
        boolean z10;
        synchronized (this.f14173d) {
            z10 = !this.f14179j.equals(eVar);
            this.f14179j = eVar;
        }
        if (z10) {
            P();
        }
    }

    @Override // n3.v
    protected final Pair<o3[], t[]> l(v.a aVar, int[][][] iArr, int[] iArr2, u.b bVar, y3 y3Var) {
        d dVar;
        f fVar;
        synchronized (this.f14173d) {
            dVar = this.f14177h;
            if (dVar.f14204v0 && n0.f15397a >= 32 && (fVar = this.f14178i) != null) {
                fVar.b(this, (Looper) p3.a.h(Looper.myLooper()));
            }
        }
        int d10 = aVar.d();
        t.a[] S = S(aVar, iArr, iArr2, dVar);
        z(aVar, dVar, S);
        y(aVar, dVar, S);
        for (int i10 = 0; i10 < d10; i10++) {
            int e10 = aVar.e(i10);
            if (dVar.J(i10) || dVar.I.contains(Integer.valueOf(e10))) {
                S[i10] = null;
            }
        }
        t[] a10 = this.f14175f.a(S, a(), bVar, y3Var);
        o3[] o3VarArr = new o3[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            boolean z10 = true;
            if ((dVar.J(i11) || dVar.I.contains(Integer.valueOf(aVar.e(i11)))) || (aVar.e(i11) != -2 && a10[i11] == null)) {
                z10 = false;
            }
            o3VarArr[i11] = z10 ? o3.f17468b : null;
        }
        if (dVar.f14206x0) {
            O(aVar, iArr, o3VarArr, a10);
        }
        return Pair.create(o3VarArr, a10);
    }
}
