package t1;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import s1.a2;
import s1.b3;
import s1.c3;
import s1.d4;
import s1.v1;
import s1.y2;
import s1.y3;
import u2.u;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f17980a;

        /* renamed from: b  reason: collision with root package name */
        public final y3 f17981b;

        /* renamed from: c  reason: collision with root package name */
        public final int f17982c;

        /* renamed from: d  reason: collision with root package name */
        public final u.b f17983d;

        /* renamed from: e  reason: collision with root package name */
        public final long f17984e;

        /* renamed from: f  reason: collision with root package name */
        public final y3 f17985f;

        /* renamed from: g  reason: collision with root package name */
        public final int f17986g;

        /* renamed from: h  reason: collision with root package name */
        public final u.b f17987h;

        /* renamed from: i  reason: collision with root package name */
        public final long f17988i;

        /* renamed from: j  reason: collision with root package name */
        public final long f17989j;

        public a(long j10, y3 y3Var, int i10, u.b bVar, long j11, y3 y3Var2, int i11, u.b bVar2, long j12, long j13) {
            this.f17980a = j10;
            this.f17981b = y3Var;
            this.f17982c = i10;
            this.f17983d = bVar;
            this.f17984e = j11;
            this.f17985f = y3Var2;
            this.f17986g = i11;
            this.f17987h = bVar2;
            this.f17988i = j12;
            this.f17989j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17980a == aVar.f17980a && this.f17982c == aVar.f17982c && this.f17984e == aVar.f17984e && this.f17986g == aVar.f17986g && this.f17988i == aVar.f17988i && this.f17989j == aVar.f17989j && b5.j.a(this.f17981b, aVar.f17981b) && b5.j.a(this.f17983d, aVar.f17983d) && b5.j.a(this.f17985f, aVar.f17985f) && b5.j.a(this.f17987h, aVar.f17987h);
        }

        public int hashCode() {
            return b5.j.b(Long.valueOf(this.f17980a), this.f17981b, Integer.valueOf(this.f17982c), this.f17983d, Long.valueOf(this.f17984e), this.f17985f, Integer.valueOf(this.f17986g), this.f17987h, Long.valueOf(this.f17988i), Long.valueOf(this.f17989j));
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final p3.l f17990a;

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<a> f17991b;

        public b(p3.l lVar, SparseArray<a> sparseArray) {
            this.f17990a = lVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(lVar.c());
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                int b10 = lVar.b(i10);
                sparseArray2.append(b10, (a) p3.a.e(sparseArray.get(b10)));
            }
            this.f17991b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f17990a.a(i10);
        }

        public int b(int i10) {
            return this.f17990a.b(i10);
        }

        public a c(int i10) {
            return (a) p3.a.e(this.f17991b.get(i10));
        }

        public int d() {
            return this.f17990a.c();
        }
    }

    void A(a aVar, boolean z10);

    void B(a aVar, int i10);

    @Deprecated
    void C(a aVar, int i10);

    void D(a aVar);

    void E(a aVar, int i10, boolean z10);

    void F(a aVar, float f10);

    void G(a aVar, Exception exc);

    void H(a aVar, int i10);

    @Deprecated
    void I(a aVar, List<d3.b> list);

    void J(a aVar, y2 y2Var);

    void K(a aVar, u2.n nVar, u2.q qVar, IOException iOException, boolean z10);

    void L(a aVar, s1.n1 n1Var, v1.i iVar);

    void M(a aVar, boolean z10);

    void N(c3 c3Var, b bVar);

    @Deprecated
    void O(a aVar);

    void T(a aVar, s1.n1 n1Var, v1.i iVar);

    void U(a aVar, Exception exc);

    void V(a aVar, int i10, long j10, long j11);

    @Deprecated
    void W(a aVar, s1.n1 n1Var);

    void X(a aVar, int i10, long j10);

    @Deprecated
    void Y(a aVar, String str, long j10);

    void Z(a aVar, v1 v1Var, int i10);

    @Deprecated
    void a(a aVar);

    @Deprecated
    void a0(a aVar, boolean z10);

    @Deprecated
    void b(a aVar, int i10, s1.n1 n1Var);

    void b0(a aVar, Object obj, long j10);

    void c(a aVar, long j10, int i10);

    void c0(a aVar, boolean z10, int i10);

    @Deprecated
    void d(a aVar, String str, long j10);

    void d0(a aVar, int i10, int i11);

    void e(a aVar, q3.z zVar);

    @Deprecated
    void e0(a aVar);

    void f(a aVar);

    @Deprecated
    void f0(a aVar, int i10, int i11, int i12, float f10);

    void g(a aVar, u2.q qVar);

    void g0(a aVar, s1.o oVar);

    void h(a aVar, int i10, long j10, long j11);

    void h0(a aVar, String str);

    void i(a aVar, u2.q qVar);

    @Deprecated
    void i0(a aVar, boolean z10, int i10);

    void j(a aVar, v1.e eVar);

    void j0(a aVar, c3.e eVar, c3.e eVar2, int i10);

    void k(a aVar, b3 b3Var);

    void k0(a aVar, int i10);

    void l(a aVar);

    @Deprecated
    void l0(a aVar, int i10, v1.e eVar);

    void m(a aVar, String str, long j10, long j11);

    void m0(a aVar);

    @Deprecated
    void n(a aVar, int i10, v1.e eVar);

    void n0(a aVar, boolean z10);

    void o(a aVar, v1.e eVar);

    void o0(a aVar, u2.n nVar, u2.q qVar);

    @Deprecated
    void p(a aVar, s1.n1 n1Var);

    void p0(a aVar, Exception exc);

    @Deprecated
    void q(a aVar, int i10, String str, long j10);

    void q0(a aVar, v1.e eVar);

    void r(a aVar, d4 d4Var);

    void r0(a aVar, int i10);

    void s(a aVar, y2 y2Var);

    void s0(a aVar, u2.n nVar, u2.q qVar);

    void t(a aVar, u2.n nVar, u2.q qVar);

    void t0(a aVar, String str);

    void u(a aVar, long j10);

    void u0(a aVar, int i10);

    void v(a aVar, Exception exc);

    void v0(a aVar, k2.a aVar2);

    void w(a aVar, a2 a2Var);

    void w0(a aVar, u1.e eVar);

    void x(a aVar, v1.e eVar);

    void x0(a aVar, d3.e eVar);

    void y(a aVar, c3.b bVar);

    void y0(a aVar);

    void z(a aVar, String str, long j10, long j11);
}
