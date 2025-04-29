package s1;

import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import p3.l;
import s1.c3;
import s1.h;
/* loaded from: classes.dex */
public interface c3 {

    /* loaded from: classes.dex */
    public static final class b implements h {

        /* renamed from: k  reason: collision with root package name */
        public static final b f17125k = new a().e();

        /* renamed from: l  reason: collision with root package name */
        private static final String f17126l = p3.n0.q0(0);

        /* renamed from: m  reason: collision with root package name */
        public static final h.a<b> f17127m = new h.a() { // from class: s1.d3
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                c3.b c10;
                c10 = c3.b.c(bundle);
                return c10;
            }
        };

        /* renamed from: j  reason: collision with root package name */
        private final p3.l f17128j;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f17129b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a  reason: collision with root package name */
            private final l.b f17130a = new l.b();

            public a a(int i10) {
                this.f17130a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f17130a.b(bVar.f17128j);
                return this;
            }

            public a c(int... iArr) {
                this.f17130a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f17130a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f17130a.e());
            }
        }

        private b(p3.l lVar) {
            this.f17128j = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f17126l);
            if (integerArrayList == null) {
                return f17125k;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f17128j.equals(((b) obj).f17128j);
            }
            return false;
        }

        public int hashCode() {
            return this.f17128j.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final p3.l f17131a;

        public c(p3.l lVar) {
            this.f17131a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f17131a.equals(((c) obj).f17131a);
            }
            return false;
        }

        public int hashCode() {
            return this.f17131a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void A(int i10);

        @Deprecated
        void B(boolean z10, int i10);

        @Deprecated
        void D(boolean z10);

        @Deprecated
        void E(int i10);

        void F(y2 y2Var);

        void K(boolean z10);

        void L();

        @Deprecated
        void M();

        void N(d4 d4Var);

        void O(b bVar);

        void R(a2 a2Var);

        void S(float f10);

        void W(int i10);

        void X(boolean z10, int i10);

        void b(boolean z10);

        void b0(e eVar, e eVar2, int i10);

        void d(d3.e eVar);

        void d0(y2 y2Var);

        void g0(y3 y3Var, int i10);

        void h0(int i10, int i11);

        @Deprecated
        void i(List<d3.b> list);

        void i0(v1 v1Var, int i10);

        void j0(c3 c3Var, c cVar);

        void l(int i10);

        void l0(o oVar);

        void n0(u1.e eVar);

        void o(q3.z zVar);

        void o0(int i10, boolean z10);

        void p(b3 b3Var);

        void p0(boolean z10);

        void x(k2.a aVar);
    }

    /* loaded from: classes.dex */
    public static final class e implements h {

        /* renamed from: j  reason: collision with root package name */
        public final Object f17139j;
        @Deprecated

        /* renamed from: k  reason: collision with root package name */
        public final int f17140k;

        /* renamed from: l  reason: collision with root package name */
        public final int f17141l;

        /* renamed from: m  reason: collision with root package name */
        public final v1 f17142m;

        /* renamed from: n  reason: collision with root package name */
        public final Object f17143n;

        /* renamed from: o  reason: collision with root package name */
        public final int f17144o;

        /* renamed from: p  reason: collision with root package name */
        public final long f17145p;

        /* renamed from: q  reason: collision with root package name */
        public final long f17146q;

        /* renamed from: r  reason: collision with root package name */
        public final int f17147r;

        /* renamed from: s  reason: collision with root package name */
        public final int f17148s;

        /* renamed from: t  reason: collision with root package name */
        private static final String f17132t = p3.n0.q0(0);

        /* renamed from: u  reason: collision with root package name */
        private static final String f17133u = p3.n0.q0(1);

        /* renamed from: v  reason: collision with root package name */
        private static final String f17134v = p3.n0.q0(2);

        /* renamed from: w  reason: collision with root package name */
        private static final String f17135w = p3.n0.q0(3);

        /* renamed from: x  reason: collision with root package name */
        private static final String f17136x = p3.n0.q0(4);

        /* renamed from: y  reason: collision with root package name */
        private static final String f17137y = p3.n0.q0(5);

        /* renamed from: z  reason: collision with root package name */
        private static final String f17138z = p3.n0.q0(6);
        public static final h.a<e> A = new h.a() { // from class: s1.f3
            @Override // s1.h.a
            public final h a(Bundle bundle) {
                c3.e b10;
                b10 = c3.e.b(bundle);
                return b10;
            }
        };

        public e(Object obj, int i10, v1 v1Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f17139j = obj;
            this.f17140k = i10;
            this.f17141l = i10;
            this.f17142m = v1Var;
            this.f17143n = obj2;
            this.f17144o = i11;
            this.f17145p = j10;
            this.f17146q = j11;
            this.f17147r = i12;
            this.f17148s = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e b(Bundle bundle) {
            int i10 = bundle.getInt(f17132t, 0);
            Bundle bundle2 = bundle.getBundle(f17133u);
            return new e(null, i10, bundle2 == null ? null : v1.f17601x.a(bundle2), null, bundle.getInt(f17134v, 0), bundle.getLong(f17135w, 0L), bundle.getLong(f17136x, 0L), bundle.getInt(f17137y, -1), bundle.getInt(f17138z, -1));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f17141l == eVar.f17141l && this.f17144o == eVar.f17144o && this.f17145p == eVar.f17145p && this.f17146q == eVar.f17146q && this.f17147r == eVar.f17147r && this.f17148s == eVar.f17148s && b5.j.a(this.f17139j, eVar.f17139j) && b5.j.a(this.f17143n, eVar.f17143n) && b5.j.a(this.f17142m, eVar.f17142m);
        }

        public int hashCode() {
            return b5.j.b(this.f17139j, Integer.valueOf(this.f17141l), this.f17142m, this.f17143n, Integer.valueOf(this.f17144o), Long.valueOf(this.f17145p), Long.valueOf(this.f17146q), Integer.valueOf(this.f17147r), Integer.valueOf(this.f17148s));
        }
    }

    boolean A();

    int B();

    int C();

    long D();

    y3 E();

    boolean F();

    void G(long j10);

    long H();

    boolean I();

    void a();

    void b();

    void c(b3 b3Var);

    void e(float f10);

    y2 f();

    void g(boolean z10);

    void h(Surface surface);

    boolean i();

    long j();

    void k(d dVar);

    long l();

    long m();

    boolean n();

    boolean o();

    int p();

    d4 r();

    boolean s();

    void stop();

    int t();

    int u();

    int v();

    void w(int i10);

    boolean x();

    int z();
}
