package u2;

import android.os.Looper;
import o3.l;
import s1.v1;
import s1.y3;
import t1.t1;
import u2.c0;
import u2.h0;
import u2.i0;
import u2.u;
/* loaded from: classes.dex */
public final class i0 extends u2.a implements h0.b {
    private boolean A;
    private o3.p0 B;

    /* renamed from: q  reason: collision with root package name */
    private final v1 f18839q;

    /* renamed from: r  reason: collision with root package name */
    private final v1.h f18840r;

    /* renamed from: s  reason: collision with root package name */
    private final l.a f18841s;

    /* renamed from: t  reason: collision with root package name */
    private final c0.a f18842t;

    /* renamed from: u  reason: collision with root package name */
    private final w1.y f18843u;

    /* renamed from: v  reason: collision with root package name */
    private final o3.g0 f18844v;

    /* renamed from: w  reason: collision with root package name */
    private final int f18845w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f18846x;

    /* renamed from: y  reason: collision with root package name */
    private long f18847y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f18848z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends l {
        a(i0 i0Var, y3 y3Var) {
            super(y3Var);
        }

        @Override // u2.l, s1.y3
        public y3.b k(int i10, y3.b bVar, boolean z10) {
            super.k(i10, bVar, z10);
            bVar.f17808o = true;
            return bVar;
        }

        @Override // u2.l, s1.y3
        public y3.d s(int i10, y3.d dVar, long j10) {
            super.s(i10, dVar, j10);
            dVar.f17825u = true;
            return dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f18849a;

        /* renamed from: b  reason: collision with root package name */
        private c0.a f18850b;

        /* renamed from: c  reason: collision with root package name */
        private w1.b0 f18851c;

        /* renamed from: d  reason: collision with root package name */
        private o3.g0 f18852d;

        /* renamed from: e  reason: collision with root package name */
        private int f18853e;

        /* renamed from: f  reason: collision with root package name */
        private String f18854f;

        /* renamed from: g  reason: collision with root package name */
        private Object f18855g;

        public b(l.a aVar) {
            this(aVar, new x1.i());
        }

        public b(l.a aVar, c0.a aVar2) {
            this(aVar, aVar2, new w1.l(), new o3.x(), 1048576);
        }

        public b(l.a aVar, c0.a aVar2, w1.b0 b0Var, o3.g0 g0Var, int i10) {
            this.f18849a = aVar;
            this.f18850b = aVar2;
            this.f18851c = b0Var;
            this.f18852d = g0Var;
            this.f18853e = i10;
        }

        public b(l.a aVar, final x1.r rVar) {
            this(aVar, new c0.a() { // from class: u2.j0
                @Override // u2.c0.a
                public final c0 a(t1 t1Var) {
                    c0 c10;
                    c10 = i0.b.c(x1.r.this, t1Var);
                    return c10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ c0 c(x1.r rVar, t1 t1Var) {
            return new c(rVar);
        }

        public i0 b(v1 v1Var) {
            v1.c b10;
            v1.c d10;
            p3.a.e(v1Var.f17603k);
            v1.h hVar = v1Var.f17603k;
            boolean z10 = true;
            boolean z11 = hVar.f17683h == null && this.f18855g != null;
            z10 = (hVar.f17680e != null || this.f18854f == null) ? false : false;
            if (!z11 || !z10) {
                if (z11) {
                    d10 = v1Var.b().d(this.f18855g);
                    v1Var = d10.a();
                    v1 v1Var2 = v1Var;
                    return new i0(v1Var2, this.f18849a, this.f18850b, this.f18851c.a(v1Var2), this.f18852d, this.f18853e, null);
                }
                if (z10) {
                    b10 = v1Var.b();
                }
                v1 v1Var22 = v1Var;
                return new i0(v1Var22, this.f18849a, this.f18850b, this.f18851c.a(v1Var22), this.f18852d, this.f18853e, null);
            }
            b10 = v1Var.b().d(this.f18855g);
            d10 = b10.b(this.f18854f);
            v1Var = d10.a();
            v1 v1Var222 = v1Var;
            return new i0(v1Var222, this.f18849a, this.f18850b, this.f18851c.a(v1Var222), this.f18852d, this.f18853e, null);
        }
    }

    private i0(v1 v1Var, l.a aVar, c0.a aVar2, w1.y yVar, o3.g0 g0Var, int i10) {
        this.f18840r = (v1.h) p3.a.e(v1Var.f17603k);
        this.f18839q = v1Var;
        this.f18841s = aVar;
        this.f18842t = aVar2;
        this.f18843u = yVar;
        this.f18844v = g0Var;
        this.f18845w = i10;
        this.f18846x = true;
        this.f18847y = -9223372036854775807L;
    }

    /* synthetic */ i0(v1 v1Var, l.a aVar, c0.a aVar2, w1.y yVar, o3.g0 g0Var, int i10, a aVar3) {
        this(v1Var, aVar, aVar2, yVar, g0Var, i10);
    }

    private void F() {
        y3 q0Var = new q0(this.f18847y, this.f18848z, false, this.A, null, this.f18839q);
        if (this.f18846x) {
            q0Var = new a(this, q0Var);
        }
        D(q0Var);
    }

    @Override // u2.a
    protected void C(o3.p0 p0Var) {
        this.B = p0Var;
        this.f18843u.e((Looper) p3.a.e(Looper.myLooper()), A());
        this.f18843u.b();
        F();
    }

    @Override // u2.a
    protected void E() {
        this.f18843u.a();
    }

    @Override // u2.u
    public v1 a() {
        return this.f18839q;
    }

    @Override // u2.u
    public void b(r rVar) {
        ((h0) rVar).f0();
    }

    @Override // u2.u
    public void f() {
    }

    @Override // u2.u
    public r n(u.b bVar, o3.b bVar2, long j10) {
        o3.l a10 = this.f18841s.a();
        o3.p0 p0Var = this.B;
        if (p0Var != null) {
            a10.h(p0Var);
        }
        return new h0(this.f18840r.f17676a, a10, this.f18842t.a(A()), this.f18843u, t(bVar), this.f18844v, w(bVar), this, bVar2, this.f18840r.f17680e, this.f18845w);
    }

    @Override // u2.h0.b
    public void r(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f18847y;
        }
        if (!this.f18846x && this.f18847y == j10 && this.f18848z == z10 && this.A == z11) {
            return;
        }
        this.f18847y = j10;
        this.f18848z = z10;
        this.A = z11;
        this.f18846x = false;
        F();
    }
}
