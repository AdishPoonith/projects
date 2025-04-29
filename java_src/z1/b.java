package z1;

import com.google.common.collect.s0;
import java.util.ArrayList;
import p3.a0;
import p3.r;
import p3.v;
import s1.n1;
import s1.u2;
import x1.b0;
import x1.e0;
import x1.j;
import x1.l;
import x1.m;
import x1.n;
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: c  reason: collision with root package name */
    private int f20677c;

    /* renamed from: e  reason: collision with root package name */
    private z1.c f20679e;

    /* renamed from: h  reason: collision with root package name */
    private long f20682h;

    /* renamed from: i  reason: collision with root package name */
    private e f20683i;

    /* renamed from: m  reason: collision with root package name */
    private int f20687m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f20688n;

    /* renamed from: a  reason: collision with root package name */
    private final a0 f20675a = new a0(12);

    /* renamed from: b  reason: collision with root package name */
    private final c f20676b = new c();

    /* renamed from: d  reason: collision with root package name */
    private n f20678d = new j();

    /* renamed from: g  reason: collision with root package name */
    private e[] f20681g = new e[0];

    /* renamed from: k  reason: collision with root package name */
    private long f20685k = -1;

    /* renamed from: l  reason: collision with root package name */
    private long f20686l = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f20684j = -1;

    /* renamed from: f  reason: collision with root package name */
    private long f20680f = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0294b implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final long f20689a;

        public C0294b(long j10) {
            this.f20689a = j10;
        }

        @Override // x1.b0
        public boolean f() {
            return true;
        }

        @Override // x1.b0
        public b0.a g(long j10) {
            b0.a i10 = b.this.f20681g[0].i(j10);
            for (int i11 = 1; i11 < b.this.f20681g.length; i11++) {
                b0.a i12 = b.this.f20681g[i11].i(j10);
                if (i12.f20103a.f20109b < i10.f20103a.f20109b) {
                    i10 = i12;
                }
            }
            return i10;
        }

        @Override // x1.b0
        public long h() {
            return this.f20689a;
        }
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f20691a;

        /* renamed from: b  reason: collision with root package name */
        public int f20692b;

        /* renamed from: c  reason: collision with root package name */
        public int f20693c;

        private c() {
        }

        public void a(a0 a0Var) {
            this.f20691a = a0Var.t();
            this.f20692b = a0Var.t();
            this.f20693c = 0;
        }

        public void b(a0 a0Var) {
            a(a0Var);
            if (this.f20691a == 1414744396) {
                this.f20693c = a0Var.t();
                return;
            }
            throw u2.a("LIST expected, found: " + this.f20691a, null);
        }
    }

    private static void e(m mVar) {
        if ((mVar.p() & 1) == 1) {
            mVar.g(1);
        }
    }

    private e f(int i10) {
        e[] eVarArr;
        for (e eVar : this.f20681g) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void g(a0 a0Var) {
        f d10 = f.d(1819436136, a0Var);
        if (d10.a() != 1819436136) {
            throw u2.a("Unexpected header list type " + d10.a(), null);
        }
        z1.c cVar = (z1.c) d10.c(z1.c.class);
        if (cVar == null) {
            throw u2.a("AviHeader not found", null);
        }
        this.f20679e = cVar;
        this.f20680f = cVar.f20696c * cVar.f20694a;
        ArrayList arrayList = new ArrayList();
        s0<z1.a> it = d10.f20716a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            z1.a next = it.next();
            if (next.a() == 1819440243) {
                int i11 = i10 + 1;
                e l10 = l((f) next, i10);
                if (l10 != null) {
                    arrayList.add(l10);
                }
                i10 = i11;
            }
        }
        this.f20681g = (e[]) arrayList.toArray(new e[0]);
        this.f20678d.k();
    }

    private void h(a0 a0Var) {
        long k10 = k(a0Var);
        while (a0Var.a() >= 16) {
            int t10 = a0Var.t();
            int t11 = a0Var.t();
            long t12 = a0Var.t() + k10;
            a0Var.t();
            e f10 = f(t10);
            if (f10 != null) {
                if ((t11 & 16) == 16) {
                    f10.b(t12);
                }
                f10.k();
            }
        }
        for (e eVar : this.f20681g) {
            eVar.c();
        }
        this.f20688n = true;
        this.f20678d.t(new C0294b(this.f20680f));
    }

    private long k(a0 a0Var) {
        if (a0Var.a() < 16) {
            return 0L;
        }
        int f10 = a0Var.f();
        a0Var.U(8);
        long j10 = this.f20685k;
        long j11 = ((long) a0Var.t()) <= j10 ? 8 + j10 : 0L;
        a0Var.T(f10);
        return j11;
    }

    private e l(f fVar, int i10) {
        String str;
        d dVar = (d) fVar.c(d.class);
        g gVar = (g) fVar.c(g.class);
        if (dVar == null) {
            str = "Missing Stream Header";
        } else if (gVar != null) {
            long b10 = dVar.b();
            n1 n1Var = gVar.f20718a;
            n1.b b11 = n1Var.b();
            b11.T(i10);
            int i11 = dVar.f20703f;
            if (i11 != 0) {
                b11.Y(i11);
            }
            h hVar = (h) fVar.c(h.class);
            if (hVar != null) {
                b11.W(hVar.f20719a);
            }
            int k10 = v.k(n1Var.f17419u);
            if (k10 == 1 || k10 == 2) {
                e0 d10 = this.f20678d.d(i10, k10);
                d10.e(b11.G());
                e eVar = new e(i10, k10, b10, dVar.f20702e, d10);
                this.f20680f = b10;
                return eVar;
            }
            return null;
        } else {
            str = "Missing Stream Format";
        }
        r.i("AviExtractor", str);
        return null;
    }

    private int m(m mVar) {
        if (mVar.p() >= this.f20686l) {
            return -1;
        }
        e eVar = this.f20683i;
        if (eVar == null) {
            e(mVar);
            mVar.n(this.f20675a.e(), 0, 12);
            this.f20675a.T(0);
            int t10 = this.f20675a.t();
            if (t10 == 1414744396) {
                this.f20675a.T(8);
                mVar.g(this.f20675a.t() != 1769369453 ? 8 : 12);
                mVar.f();
                return 0;
            }
            int t11 = this.f20675a.t();
            if (t10 == 1263424842) {
                this.f20682h = mVar.p() + t11 + 8;
                return 0;
            }
            mVar.g(8);
            mVar.f();
            e f10 = f(t10);
            if (f10 == null) {
                this.f20682h = mVar.p() + t11;
                return 0;
            }
            f10.n(t11);
            this.f20683i = f10;
        } else if (eVar.m(mVar)) {
            this.f20683i = null;
        }
        return 0;
    }

    private boolean n(m mVar, x1.a0 a0Var) {
        boolean z10;
        if (this.f20682h != -1) {
            long p10 = mVar.p();
            long j10 = this.f20682h;
            if (j10 < p10 || j10 > 262144 + p10) {
                a0Var.f20102a = j10;
                z10 = true;
                this.f20682h = -1L;
                return z10;
            }
            mVar.g((int) (j10 - p10));
        }
        z10 = false;
        this.f20682h = -1L;
        return z10;
    }

    @Override // x1.l
    public void a() {
    }

    @Override // x1.l
    public void b(long j10, long j11) {
        this.f20682h = -1L;
        this.f20683i = null;
        for (e eVar : this.f20681g) {
            eVar.o(j10);
        }
        if (j10 != 0) {
            this.f20677c = 6;
        } else if (this.f20681g.length == 0) {
            this.f20677c = 0;
        } else {
            this.f20677c = 3;
        }
    }

    @Override // x1.l
    public void c(n nVar) {
        this.f20677c = 0;
        this.f20678d = nVar;
        this.f20682h = -1L;
    }

    @Override // x1.l
    public int i(m mVar, x1.a0 a0Var) {
        if (n(mVar, a0Var)) {
            return 1;
        }
        switch (this.f20677c) {
            case 0:
                if (j(mVar)) {
                    mVar.g(12);
                    this.f20677c = 1;
                    return 0;
                }
                throw u2.a("AVI Header List not found", null);
            case 1:
                mVar.readFully(this.f20675a.e(), 0, 12);
                this.f20675a.T(0);
                this.f20676b.b(this.f20675a);
                c cVar = this.f20676b;
                if (cVar.f20693c == 1819436136) {
                    this.f20684j = cVar.f20692b;
                    this.f20677c = 2;
                    return 0;
                }
                throw u2.a("hdrl expected, found: " + this.f20676b.f20693c, null);
            case 2:
                int i10 = this.f20684j - 4;
                a0 a0Var2 = new a0(i10);
                mVar.readFully(a0Var2.e(), 0, i10);
                g(a0Var2);
                this.f20677c = 3;
                return 0;
            case 3:
                if (this.f20685k != -1) {
                    long p10 = mVar.p();
                    long j10 = this.f20685k;
                    if (p10 != j10) {
                        this.f20682h = j10;
                        return 0;
                    }
                }
                mVar.n(this.f20675a.e(), 0, 12);
                mVar.f();
                this.f20675a.T(0);
                this.f20676b.a(this.f20675a);
                int t10 = this.f20675a.t();
                int i11 = this.f20676b.f20691a;
                if (i11 == 1179011410) {
                    mVar.g(12);
                    return 0;
                } else if (i11 != 1414744396 || t10 != 1769369453) {
                    this.f20682h = mVar.p() + this.f20676b.f20692b + 8;
                    return 0;
                } else {
                    long p11 = mVar.p();
                    this.f20685k = p11;
                    this.f20686l = p11 + this.f20676b.f20692b + 8;
                    if (!this.f20688n) {
                        if (((z1.c) p3.a.e(this.f20679e)).b()) {
                            this.f20677c = 4;
                            this.f20682h = this.f20686l;
                            return 0;
                        }
                        this.f20678d.t(new b0.b(this.f20680f));
                        this.f20688n = true;
                    }
                    this.f20682h = mVar.p() + 12;
                    this.f20677c = 6;
                    return 0;
                }
            case 4:
                mVar.readFully(this.f20675a.e(), 0, 8);
                this.f20675a.T(0);
                int t11 = this.f20675a.t();
                int t12 = this.f20675a.t();
                if (t11 == 829973609) {
                    this.f20677c = 5;
                    this.f20687m = t12;
                } else {
                    this.f20682h = mVar.p() + t12;
                }
                return 0;
            case 5:
                a0 a0Var3 = new a0(this.f20687m);
                mVar.readFully(a0Var3.e(), 0, this.f20687m);
                h(a0Var3);
                this.f20677c = 6;
                this.f20682h = this.f20685k;
                return 0;
            case 6:
                return m(mVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // x1.l
    public boolean j(m mVar) {
        mVar.n(this.f20675a.e(), 0, 12);
        this.f20675a.T(0);
        if (this.f20675a.t() != 1179011410) {
            return false;
        }
        this.f20675a.U(4);
        return this.f20675a.t() == 541677121;
    }
}
