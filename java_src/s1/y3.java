package s1;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.common.collect.q;
import s1.h;
import s1.v1;
import s1.y3;
import v2.c;
/* loaded from: classes.dex */
public abstract class y3 implements h {

    /* renamed from: j  reason: collision with root package name */
    public static final y3 f17792j = new a();

    /* renamed from: k  reason: collision with root package name */
    private static final String f17793k = p3.n0.q0(0);

    /* renamed from: l  reason: collision with root package name */
    private static final String f17794l = p3.n0.q0(1);

    /* renamed from: m  reason: collision with root package name */
    private static final String f17795m = p3.n0.q0(2);

    /* renamed from: n  reason: collision with root package name */
    public static final h.a<y3> f17796n = new h.a() { // from class: s1.x3
        @Override // s1.h.a
        public final h a(Bundle bundle) {
            y3 b10;
            b10 = y3.b(bundle);
            return b10;
        }
    };

    /* loaded from: classes.dex */
    class a extends y3 {
        a() {
        }

        @Override // s1.y3
        public int f(Object obj) {
            return -1;
        }

        @Override // s1.y3
        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // s1.y3
        public int m() {
            return 0;
        }

        @Override // s1.y3
        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // s1.y3
        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // s1.y3
        public int t() {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: q  reason: collision with root package name */
        private static final String f17797q = p3.n0.q0(0);

        /* renamed from: r  reason: collision with root package name */
        private static final String f17798r = p3.n0.q0(1);

        /* renamed from: s  reason: collision with root package name */
        private static final String f17799s = p3.n0.q0(2);

        /* renamed from: t  reason: collision with root package name */
        private static final String f17800t = p3.n0.q0(3);

        /* renamed from: u  reason: collision with root package name */
        private static final String f17801u = p3.n0.q0(4);

        /* renamed from: v  reason: collision with root package name */
        public static final h.a<b> f17802v = new h.a() { // from class: s1.z3
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                y3.b c10;
                c10 = y3.b.c(bundle);
                return c10;
            }
        };

        /* renamed from: j  reason: collision with root package name */
        public Object f17803j;

        /* renamed from: k  reason: collision with root package name */
        public Object f17804k;

        /* renamed from: l  reason: collision with root package name */
        public int f17805l;

        /* renamed from: m  reason: collision with root package name */
        public long f17806m;

        /* renamed from: n  reason: collision with root package name */
        public long f17807n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f17808o;

        /* renamed from: p  reason: collision with root package name */
        private v2.c f17809p = v2.c.f19395p;

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            int i10 = bundle.getInt(f17797q, 0);
            long j10 = bundle.getLong(f17798r, -9223372036854775807L);
            long j11 = bundle.getLong(f17799s, 0L);
            boolean z10 = bundle.getBoolean(f17800t, false);
            Bundle bundle2 = bundle.getBundle(f17801u);
            v2.c a10 = bundle2 != null ? v2.c.f19401v.a(bundle2) : v2.c.f19395p;
            b bVar = new b();
            bVar.v(null, null, i10, j10, j11, a10, z10);
            return bVar;
        }

        public int d(int i10) {
            return this.f17809p.c(i10).f19418k;
        }

        public long e(int i10, int i11) {
            c.a c10 = this.f17809p.c(i10);
            if (c10.f19418k != -1) {
                return c10.f19422o[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return p3.n0.c(this.f17803j, bVar.f17803j) && p3.n0.c(this.f17804k, bVar.f17804k) && this.f17805l == bVar.f17805l && this.f17806m == bVar.f17806m && this.f17807n == bVar.f17807n && this.f17808o == bVar.f17808o && p3.n0.c(this.f17809p, bVar.f17809p);
        }

        public int f() {
            return this.f17809p.f19403k;
        }

        public int g(long j10) {
            return this.f17809p.d(j10, this.f17806m);
        }

        public int h(long j10) {
            return this.f17809p.e(j10, this.f17806m);
        }

        public int hashCode() {
            Object obj = this.f17803j;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f17804k;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            long j10 = this.f17806m;
            long j11 = this.f17807n;
            return ((((((((((hashCode + hashCode2) * 31) + this.f17805l) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f17808o ? 1 : 0)) * 31) + this.f17809p.hashCode();
        }

        public long i(int i10) {
            return this.f17809p.c(i10).f19417j;
        }

        public long j() {
            return this.f17809p.f19404l;
        }

        public int k(int i10, int i11) {
            c.a c10 = this.f17809p.c(i10);
            if (c10.f19418k != -1) {
                return c10.f19421n[i11];
            }
            return 0;
        }

        public long l(int i10) {
            return this.f17809p.c(i10).f19423p;
        }

        public long m() {
            return this.f17806m;
        }

        public int n(int i10) {
            return this.f17809p.c(i10).e();
        }

        public int o(int i10, int i11) {
            return this.f17809p.c(i10).f(i11);
        }

        public long p() {
            return p3.n0.Y0(this.f17807n);
        }

        public long q() {
            return this.f17807n;
        }

        public int r() {
            return this.f17809p.f19406n;
        }

        public boolean s(int i10) {
            return !this.f17809p.c(i10).g();
        }

        public boolean t(int i10) {
            return this.f17809p.c(i10).f19424q;
        }

        public b u(Object obj, Object obj2, int i10, long j10, long j11) {
            return v(obj, obj2, i10, j10, j11, v2.c.f19395p, false);
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11, v2.c cVar, boolean z10) {
            this.f17803j = obj;
            this.f17804k = obj2;
            this.f17805l = i10;
            this.f17806m = j10;
            this.f17807n = j11;
            this.f17809p = cVar;
            this.f17808o = z10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends y3 {

        /* renamed from: o  reason: collision with root package name */
        private final com.google.common.collect.q<d> f17810o;

        /* renamed from: p  reason: collision with root package name */
        private final com.google.common.collect.q<b> f17811p;

        /* renamed from: q  reason: collision with root package name */
        private final int[] f17812q;

        /* renamed from: r  reason: collision with root package name */
        private final int[] f17813r;

        public c(com.google.common.collect.q<d> qVar, com.google.common.collect.q<b> qVar2, int[] iArr) {
            p3.a.a(qVar.size() == iArr.length);
            this.f17810o = qVar;
            this.f17811p = qVar2;
            this.f17812q = iArr;
            this.f17813r = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f17813r[iArr[i10]] = i10;
            }
        }

        @Override // s1.y3
        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f17812q[0];
            }
            return 0;
        }

        @Override // s1.y3
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // s1.y3
        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            return z10 ? this.f17812q[t() - 1] : t() - 1;
        }

        @Override // s1.y3
        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != g(z10)) {
                return z10 ? this.f17812q[this.f17813r[i10] + 1] : i10 + 1;
            } else if (i11 == 2) {
                return e(z10);
            } else {
                return -1;
            }
        }

        @Override // s1.y3
        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = this.f17811p.get(i10);
            bVar.v(bVar2.f17803j, bVar2.f17804k, bVar2.f17805l, bVar2.f17806m, bVar2.f17807n, bVar2.f17809p, bVar2.f17808o);
            return bVar;
        }

        @Override // s1.y3
        public int m() {
            return this.f17811p.size();
        }

        @Override // s1.y3
        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != e(z10)) {
                return z10 ? this.f17812q[this.f17813r[i10] - 1] : i10 - 1;
            } else if (i11 == 2) {
                return g(z10);
            } else {
                return -1;
            }
        }

        @Override // s1.y3
        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // s1.y3
        public d s(int i10, d dVar, long j10) {
            d dVar2 = this.f17810o.get(i10);
            dVar.h(dVar2.f17814j, dVar2.f17816l, dVar2.f17817m, dVar2.f17818n, dVar2.f17819o, dVar2.f17820p, dVar2.f17821q, dVar2.f17822r, dVar2.f17824t, dVar2.f17826v, dVar2.f17827w, dVar2.f17828x, dVar2.f17829y, dVar2.f17830z);
            dVar.f17825u = dVar2.f17825u;
            return dVar;
        }

        @Override // s1.y3
        public int t() {
            return this.f17810o.size();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements h {
        public static final Object A = new Object();
        private static final Object B = new Object();
        private static final v1 C = new v1.c().c("com.google.android.exoplayer2.Timeline").e(Uri.EMPTY).a();
        private static final String D = p3.n0.q0(1);
        private static final String E = p3.n0.q0(2);
        private static final String F = p3.n0.q0(3);
        private static final String G = p3.n0.q0(4);
        private static final String H = p3.n0.q0(5);
        private static final String I = p3.n0.q0(6);
        private static final String J = p3.n0.q0(7);
        private static final String K = p3.n0.q0(8);
        private static final String L = p3.n0.q0(9);
        private static final String M = p3.n0.q0(10);
        private static final String N = p3.n0.q0(11);
        private static final String O = p3.n0.q0(12);
        private static final String P = p3.n0.q0(13);
        public static final h.a<d> Q = new h.a() { // from class: s1.a4
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                y3.d b10;
                b10 = y3.d.b(bundle);
                return b10;
            }
        };
        @Deprecated

        /* renamed from: k  reason: collision with root package name */
        public Object f17815k;

        /* renamed from: m  reason: collision with root package name */
        public Object f17817m;

        /* renamed from: n  reason: collision with root package name */
        public long f17818n;

        /* renamed from: o  reason: collision with root package name */
        public long f17819o;

        /* renamed from: p  reason: collision with root package name */
        public long f17820p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f17821q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f17822r;
        @Deprecated

        /* renamed from: s  reason: collision with root package name */
        public boolean f17823s;

        /* renamed from: t  reason: collision with root package name */
        public v1.g f17824t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f17825u;

        /* renamed from: v  reason: collision with root package name */
        public long f17826v;

        /* renamed from: w  reason: collision with root package name */
        public long f17827w;

        /* renamed from: x  reason: collision with root package name */
        public int f17828x;

        /* renamed from: y  reason: collision with root package name */
        public int f17829y;

        /* renamed from: z  reason: collision with root package name */
        public long f17830z;

        /* renamed from: j  reason: collision with root package name */
        public Object f17814j = A;

        /* renamed from: l  reason: collision with root package name */
        public v1 f17816l = C;

        /* JADX INFO: Access modifiers changed from: private */
        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(D);
            v1 a10 = bundle2 != null ? v1.f17601x.a(bundle2) : v1.f17595r;
            long j10 = bundle.getLong(E, -9223372036854775807L);
            long j11 = bundle.getLong(F, -9223372036854775807L);
            long j12 = bundle.getLong(G, -9223372036854775807L);
            boolean z10 = bundle.getBoolean(H, false);
            boolean z11 = bundle.getBoolean(I, false);
            Bundle bundle3 = bundle.getBundle(J);
            v1.g a11 = bundle3 != null ? v1.g.f17665u.a(bundle3) : null;
            boolean z12 = bundle.getBoolean(K, false);
            long j13 = bundle.getLong(L, 0L);
            long j14 = bundle.getLong(M, -9223372036854775807L);
            int i10 = bundle.getInt(N, 0);
            int i11 = bundle.getInt(O, 0);
            long j15 = bundle.getLong(P, 0L);
            d dVar = new d();
            dVar.h(B, a10, null, j10, j11, j12, z10, z11, a11, j13, j14, i10, i11, j15);
            dVar.f17825u = z12;
            return dVar;
        }

        public long c() {
            return p3.n0.a0(this.f17820p);
        }

        public long d() {
            return p3.n0.Y0(this.f17826v);
        }

        public long e() {
            return this.f17826v;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return p3.n0.c(this.f17814j, dVar.f17814j) && p3.n0.c(this.f17816l, dVar.f17816l) && p3.n0.c(this.f17817m, dVar.f17817m) && p3.n0.c(this.f17824t, dVar.f17824t) && this.f17818n == dVar.f17818n && this.f17819o == dVar.f17819o && this.f17820p == dVar.f17820p && this.f17821q == dVar.f17821q && this.f17822r == dVar.f17822r && this.f17825u == dVar.f17825u && this.f17826v == dVar.f17826v && this.f17827w == dVar.f17827w && this.f17828x == dVar.f17828x && this.f17829y == dVar.f17829y && this.f17830z == dVar.f17830z;
        }

        public long f() {
            return p3.n0.Y0(this.f17827w);
        }

        public boolean g() {
            p3.a.f(this.f17823s == (this.f17824t != null));
            return this.f17824t != null;
        }

        public d h(Object obj, v1 v1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, v1.g gVar, long j13, long j14, int i10, int i11, long j15) {
            v1.h hVar;
            this.f17814j = obj;
            this.f17816l = v1Var != null ? v1Var : C;
            this.f17815k = (v1Var == null || (hVar = v1Var.f17603k) == null) ? null : hVar.f17683h;
            this.f17817m = obj2;
            this.f17818n = j10;
            this.f17819o = j11;
            this.f17820p = j12;
            this.f17821q = z10;
            this.f17822r = z11;
            this.f17823s = gVar != null;
            this.f17824t = gVar;
            this.f17826v = j13;
            this.f17827w = j14;
            this.f17828x = i10;
            this.f17829y = i11;
            this.f17830z = j15;
            this.f17825u = false;
            return this;
        }

        public int hashCode() {
            int hashCode = (((217 + this.f17814j.hashCode()) * 31) + this.f17816l.hashCode()) * 31;
            Object obj = this.f17817m;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            v1.g gVar = this.f17824t;
            int hashCode3 = gVar != null ? gVar.hashCode() : 0;
            long j10 = this.f17818n;
            long j11 = this.f17819o;
            long j12 = this.f17820p;
            long j13 = this.f17826v;
            long j14 = this.f17827w;
            long j15 = this.f17830z;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f17821q ? 1 : 0)) * 31) + (this.f17822r ? 1 : 0)) * 31) + (this.f17825u ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f17828x) * 31) + this.f17829y) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y3 b(Bundle bundle) {
        com.google.common.collect.q c10 = c(d.Q, p3.b.a(bundle, f17793k));
        com.google.common.collect.q c11 = c(b.f17802v, p3.b.a(bundle, f17794l));
        int[] intArray = bundle.getIntArray(f17795m);
        if (intArray == null) {
            intArray = d(c10.size());
        }
        return new c(c10, c11, intArray);
    }

    private static <T extends h> com.google.common.collect.q<T> c(h.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return com.google.common.collect.q.z();
        }
        q.a aVar2 = new q.a();
        com.google.common.collect.q<Bundle> a10 = g.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.a(aVar.a(a10.get(i10)));
        }
        return aVar2.h();
    }

    private static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public int e(boolean z10) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int g10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            if (y3Var.t() == t() && y3Var.m() == m()) {
                d dVar = new d();
                b bVar = new b();
                d dVar2 = new d();
                b bVar2 = new b();
                for (int i10 = 0; i10 < t(); i10++) {
                    if (!r(i10, dVar).equals(y3Var.r(i10, dVar2))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < m(); i11++) {
                    if (!k(i11, bVar, true).equals(y3Var.k(i11, bVar2, true))) {
                        return false;
                    }
                }
                int e10 = e(true);
                if (e10 == y3Var.e(true) && (g10 = g(true)) == y3Var.g(true)) {
                    while (e10 != g10) {
                        int i12 = i(e10, 0, true);
                        if (i12 != y3Var.i(e10, 0, true)) {
                            return false;
                        }
                        e10 = i12;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f17805l;
        if (r(i12, dVar).f17829y == i10) {
            int i13 = i(i12, i11, z10);
            if (i13 == -1) {
                return -1;
            }
            return r(i13, dVar).f17828x;
        }
        return i10 + 1;
    }

    public int hashCode() {
        int i10;
        d dVar = new d();
        b bVar = new b();
        int t10 = 217 + t();
        int i11 = 0;
        while (true) {
            i10 = t10 * 31;
            if (i11 >= t()) {
                break;
            }
            t10 = i10 + r(i11, dVar).hashCode();
            i11++;
        }
        int m10 = i10 + m();
        for (int i12 = 0; i12 < m(); i12++) {
            m10 = (m10 * 31) + k(i12, bVar, true).hashCode();
        }
        int e10 = e(true);
        while (e10 != -1) {
            m10 = (m10 * 31) + e10;
            e10 = i(e10, 0, true);
        }
        return m10;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == g(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == g(z10) ? e(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair<Object, Long> n(d dVar, b bVar, int i10, long j10) {
        return (Pair) p3.a.e(o(dVar, bVar, i10, j10, 0L));
    }

    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10, long j11) {
        p3.a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f17828x;
        j(i11, bVar);
        while (i11 < dVar.f17829y && bVar.f17807n != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f17807n > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long j12 = j10 - bVar.f17807n;
        long j13 = bVar.f17806m;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(p3.a.e(bVar.f17804k), Long.valueOf(Math.max(0L, j12)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == e(z10)) {
                return -1;
            }
            return i10 - 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == e(z10) ? g(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0L);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        return h(i10, bVar, dVar, i11, z10) == -1;
    }
}
