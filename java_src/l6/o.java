package l6;

import b7.a;
import c7.a;
import d7.c0;
import d7.i;
import d7.n;
import d7.y;
import j6.b1;
import java.util.ArrayList;
import java.util.List;
import m6.q;
import o6.a;
import o6.b;
import o6.c;
import o6.d;
import o6.e;
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final p6.l0 f13258a;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13259a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f13260b;

        static {
            int[] iArr = new int[c.EnumC0218c.values().length];
            f13260b = iArr;
            try {
                iArr[c.EnumC0218c.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13260b[c.EnumC0218c.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[a.c.values().length];
            f13259a = iArr2;
            try {
                iArr2[a.c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13259a[a.c.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13259a[a.c.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public o(p6.l0 l0Var) {
        this.f13258a = l0Var;
    }

    private m6.s b(d7.i iVar, boolean z10) {
        m6.s p10 = m6.s.p(this.f13258a.l(iVar.l0()), this.f13258a.y(iVar.m0()), m6.t.i(iVar.j0()));
        return z10 ? p10.t() : p10;
    }

    private m6.s g(o6.b bVar, boolean z10) {
        m6.s r10 = m6.s.r(this.f13258a.l(bVar.i0()), this.f13258a.y(bVar.j0()));
        return z10 ? r10.t() : r10;
    }

    private m6.s i(o6.d dVar) {
        return m6.s.s(this.f13258a.l(dVar.i0()), this.f13258a.y(dVar.j0()));
    }

    private d7.i k(m6.i iVar) {
        i.b p02 = d7.i.p0();
        p02.I(this.f13258a.L(iVar.getKey()));
        p02.H(iVar.k().o());
        p02.J(this.f13258a.W(iVar.j().g()));
        return p02.b();
    }

    private o6.b p(m6.i iVar) {
        b.C0217b k02 = o6.b.k0();
        k02.H(this.f13258a.L(iVar.getKey()));
        k02.I(this.f13258a.W(iVar.j().g()));
        return k02.b();
    }

    private o6.d r(m6.i iVar) {
        d.b k02 = o6.d.k0();
        k02.H(this.f13258a.L(iVar.getKey()));
        k02.I(this.f13258a.W(iVar.j().g()));
        return k02.b();
    }

    public i6.i a(c7.a aVar) {
        return new i6.i(this.f13258a.u(aVar.j0(), aVar.k0()), aVar.i0().equals(a.c.FIRST) ? b1.a.LIMIT_TO_FIRST : b1.a.LIMIT_TO_LAST);
    }

    public List<q.c> c(b7.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (a.c cVar : aVar.j0()) {
            arrayList.add(q.c.g(m6.r.v(cVar.i0()), cVar.k0().equals(a.c.d.ARRAY_CONFIG) ? q.c.a.CONTAINS : cVar.j0().equals(a.c.EnumC0065c.ASCENDING) ? q.c.a.ASCENDING : q.c.a.DESCENDING));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6.s d(o6.a aVar) {
        int i10 = a.f13259a[aVar.k0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return i(aVar.n0());
                }
                throw q6.b.a("Unknown MaybeDocument %s", aVar);
            }
            return g(aVar.m0(), aVar.l0());
        }
        return b(aVar.j0(), aVar.l0());
    }

    public n6.f e(d7.c0 c0Var) {
        return this.f13258a.o(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n6.g f(o6.e eVar) {
        int p02 = eVar.p0();
        w5.q w10 = this.f13258a.w(eVar.q0());
        int o02 = eVar.o0();
        ArrayList arrayList = new ArrayList(o02);
        for (int i10 = 0; i10 < o02; i10++) {
            arrayList.add(this.f13258a.o(eVar.n0(i10)));
        }
        ArrayList arrayList2 = new ArrayList(eVar.s0());
        int i11 = 0;
        while (i11 < eVar.s0()) {
            d7.c0 r02 = eVar.r0(i11);
            int i12 = i11 + 1;
            if (i12 < eVar.s0() && eVar.r0(i12).w0()) {
                q6.b.d(eVar.r0(i11).x0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                c0.b A0 = d7.c0.A0(r02);
                for (n.c cVar : eVar.r0(i12).q0().g0()) {
                    A0.H(cVar);
                }
                arrayList2.add(this.f13258a.o(A0.b()));
                i11 = i12;
            } else {
                arrayList2.add(this.f13258a.o(r02));
            }
            i11++;
        }
        return new n6.g(p02, w10, arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h4 h(o6.c cVar) {
        j6.g1 e10;
        int u02 = cVar.u0();
        m6.w y10 = this.f13258a.y(cVar.t0());
        m6.w y11 = this.f13258a.y(cVar.p0());
        com.google.protobuf.i s02 = cVar.s0();
        long q02 = cVar.q0();
        int i10 = a.f13260b[cVar.v0().ordinal()];
        if (i10 == 1) {
            e10 = this.f13258a.e(cVar.o0());
        } else if (i10 != 2) {
            throw q6.b.a("Unknown targetType %d", cVar.v0());
        } else {
            e10 = this.f13258a.t(cVar.r0());
        }
        return new h4(e10, u02, q02, g1.LISTEN, y10, y11, s02);
    }

    public c7.a j(i6.i iVar) {
        y.d S = this.f13258a.S(iVar.b());
        a.b l02 = c7.a.l0();
        l02.H(iVar.a().equals(b1.a.LIMIT_TO_FIRST) ? a.c.FIRST : a.c.LAST);
        l02.I(S.i0());
        l02.J(S.j0());
        return l02.b();
    }

    public b7.a l(List<q.c> list) {
        a.b k02 = b7.a.k0();
        k02.I(a.d.COLLECTION_GROUP);
        for (q.c cVar : list) {
            a.c.b l02 = a.c.l0();
            l02.I(cVar.h().h());
            if (cVar.i() == q.c.a.CONTAINS) {
                l02.H(a.c.EnumC0063a.CONTAINS);
            } else {
                l02.J(cVar.i() == q.c.a.ASCENDING ? a.c.EnumC0065c.ASCENDING : a.c.EnumC0065c.DESCENDING);
            }
            k02.H(l02);
        }
        return k02.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6.a m(m6.i iVar) {
        a.b o02 = o6.a.o0();
        if (iVar.h()) {
            o02.J(p(iVar));
        } else if (iVar.c()) {
            o02.H(k(iVar));
        } else if (!iVar.i()) {
            throw q6.b.a("Cannot encode invalid document %s", iVar);
        } else {
            o02.K(r(iVar));
        }
        o02.I(iVar.d());
        return o02.b();
    }

    public d7.c0 n(n6.f fVar) {
        return this.f13258a.O(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6.e o(n6.g gVar) {
        e.b t02 = o6.e.t0();
        t02.J(gVar.e());
        t02.K(this.f13258a.W(gVar.g()));
        for (n6.f fVar : gVar.d()) {
            t02.H(this.f13258a.O(fVar));
        }
        for (n6.f fVar2 : gVar.h()) {
            t02.I(this.f13258a.O(fVar2));
        }
        return t02.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o6.c q(h4 h4Var) {
        g1 g1Var = g1.LISTEN;
        q6.b.d(g1Var.equals(h4Var.b()), "Only queries with purpose %s may be stored, got %s", g1Var, h4Var.b());
        c.b w02 = o6.c.w0();
        w02.O(h4Var.g()).K(h4Var.d()).J(this.f13258a.Y(h4Var.a())).N(this.f13258a.Y(h4Var.e())).M(h4Var.c());
        j6.g1 f10 = h4Var.f();
        if (f10.s()) {
            w02.I(this.f13258a.F(f10));
        } else {
            w02.L(this.f13258a.S(f10));
        }
        return w02.b();
    }
}
