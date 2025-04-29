package p6;

import com.google.firebase.firestore.a;
import com.google.protobuf.t1;
import d7.c0;
import d7.e;
import d7.h;
import d7.i;
import d7.l;
import d7.n;
import d7.r;
import d7.t;
import d7.w;
import d7.x;
import d7.y;
import d7.z;
import i9.j1;
import j6.a1;
import j6.b1;
import j6.l;
import j6.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l6.g1;
import l6.h4;
import n6.a;
import p6.w0;
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final m6.f f15608a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15609b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15610a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f15611b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f15612c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f15613d;

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ int[] f15614e;

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ int[] f15615f;

        /* renamed from: g  reason: collision with root package name */
        static final /* synthetic */ int[] f15616g;

        /* renamed from: h  reason: collision with root package name */
        static final /* synthetic */ int[] f15617h;

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ int[] f15618i;

        /* renamed from: j  reason: collision with root package name */
        static final /* synthetic */ int[] f15619j;

        /* renamed from: k  reason: collision with root package name */
        static final /* synthetic */ int[] f15620k;

        /* renamed from: l  reason: collision with root package name */
        static final /* synthetic */ int[] f15621l;

        /* renamed from: m  reason: collision with root package name */
        static final /* synthetic */ int[] f15622m;

        static {
            int[] iArr = new int[r.c.values().length];
            f15622m = iArr;
            try {
                iArr[r.c.TARGET_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15622m[r.c.DOCUMENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15622m[r.c.DOCUMENT_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15622m[r.c.DOCUMENT_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15622m[r.c.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15622m[r.c.RESPONSETYPE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[z.c.values().length];
            f15621l = iArr2;
            try {
                iArr2[z.c.NO_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15621l[z.c.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15621l[z.c.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15621l[z.c.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15621l[z.c.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15621l[z.c.UNRECOGNIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[x.e.values().length];
            f15620k = iArr3;
            try {
                iArr3[x.e.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f15620k[x.e.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[x.f.b.values().length];
            f15619j = iArr4;
            try {
                iArr4[x.f.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f15619j[x.f.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f15619j[x.f.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f15619j[x.f.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f15619j[x.f.b.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f15619j[x.f.b.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f15619j[x.f.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f15619j[x.f.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f15619j[x.f.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f15619j[x.f.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[q.b.values().length];
            f15618i = iArr5;
            try {
                iArr5[q.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f15618i[q.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f15618i[q.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f15618i[q.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f15618i[q.b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f15618i[q.b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f15618i[q.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f15618i[q.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f15618i[q.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f15618i[q.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[x.k.b.values().length];
            f15617h = iArr6;
            try {
                iArr6[x.k.b.IS_NAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f15617h[x.k.b.IS_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f15617h[x.k.b.IS_NOT_NAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f15617h[x.k.b.IS_NOT_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[x.h.b.values().length];
            f15616g = iArr7;
            try {
                iArr7[x.h.b.COMPOSITE_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f15616g[x.h.b.FIELD_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f15616g[x.h.b.UNARY_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[x.d.b.values().length];
            f15615f = iArr8;
            try {
                iArr8[x.d.b.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f15615f[x.d.b.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[l.a.values().length];
            f15614e = iArr9;
            try {
                iArr9[l.a.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f15614e[l.a.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[g1.values().length];
            f15613d = iArr10;
            try {
                iArr10[g1.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f15613d[g1.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f15613d[g1.LIMBO_RESOLUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            int[] iArr11 = new int[n.c.EnumC0122c.values().length];
            f15612c = iArr11;
            try {
                iArr11[n.c.EnumC0122c.SET_TO_SERVER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f15612c[n.c.EnumC0122c.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f15612c[n.c.EnumC0122c.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f15612c[n.c.EnumC0122c.INCREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused52) {
            }
            int[] iArr12 = new int[t.c.values().length];
            f15611b = iArr12;
            try {
                iArr12[t.c.UPDATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f15611b[t.c.EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f15611b[t.c.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            int[] iArr13 = new int[c0.c.values().length];
            f15610a = iArr13;
            try {
                iArr13[c0.c.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f15610a[c0.c.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f15610a[c0.c.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
        }
    }

    public l0(m6.f fVar) {
        this.f15608a = fVar;
        this.f15609b = Z(fVar).h();
    }

    private d7.l E(n6.d dVar) {
        l.b l02 = d7.l.l0();
        for (m6.r rVar : dVar.c()) {
            l02.H(rVar.h());
        }
        return l02.b();
    }

    private x.f.b G(q.b bVar) {
        switch (a.f15618i[bVar.ordinal()]) {
            case 1:
                return x.f.b.LESS_THAN;
            case 2:
                return x.f.b.LESS_THAN_OR_EQUAL;
            case 3:
                return x.f.b.EQUAL;
            case 4:
                return x.f.b.NOT_EQUAL;
            case 5:
                return x.f.b.GREATER_THAN;
            case 6:
                return x.f.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return x.f.b.ARRAY_CONTAINS;
            case 8:
                return x.f.b.IN;
            case 9:
                return x.f.b.ARRAY_CONTAINS_ANY;
            case 10:
                return x.f.b.NOT_IN;
            default:
                throw q6.b.a("Unknown operator %d", bVar);
        }
    }

    private x.g H(m6.r rVar) {
        return x.g.i0().H(rVar.h()).b();
    }

    private n.c I(n6.e eVar) {
        n.c.a J;
        n6.p b10 = eVar.b();
        if (b10 instanceof n6.n) {
            J = n.c.q0().I(eVar.a().h()).L(n.c.b.REQUEST_TIME);
        } else if (b10 instanceof a.b) {
            J = n.c.q0().I(eVar.a().h()).H(d7.b.o0().H(((a.b) b10).f()));
        } else if (b10 instanceof a.C0208a) {
            J = n.c.q0().I(eVar.a().h()).K(d7.b.o0().H(((a.C0208a) b10).f()));
        } else if (!(b10 instanceof n6.j)) {
            throw q6.b.a("Unknown transform: %s", b10);
        } else {
            J = n.c.q0().I(eVar.a().h()).J(((n6.j) b10).d());
        }
        return J.b();
    }

    private x.h K(List<j6.r> list) {
        return J(new j6.l(list, l.a.AND));
    }

    private String M(g1 g1Var) {
        int i10 = a.f15613d[g1Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "limbo-document";
                }
                throw q6.b.a("Unrecognized query purpose: %s", g1Var);
            }
            return "existence-filter-mismatch";
        }
        return null;
    }

    private x.i P(a1 a1Var) {
        x.i.a j02 = x.i.j0();
        j02.H(a1Var.b().equals(a1.a.ASCENDING) ? x.e.ASCENDING : x.e.DESCENDING);
        j02.I(H(a1Var.c()));
        return j02.b();
    }

    private d7.t Q(n6.m mVar) {
        t.b H;
        q6.b.d(!mVar.d(), "Can't serialize an empty precondition", new Object[0]);
        t.b l02 = d7.t.l0();
        if (mVar.c() != null) {
            H = l02.I(Y(mVar.c()));
        } else if (mVar.b() == null) {
            throw q6.b.a("Unknown Precondition", new Object[0]);
        } else {
            H = l02.H(mVar.b().booleanValue());
        }
        return H.b();
    }

    private String R(m6.u uVar) {
        return T(this.f15608a, uVar);
    }

    private String T(m6.f fVar, m6.u uVar) {
        return Z(fVar).b("documents").g(uVar).h();
    }

    private static m6.u Z(m6.f fVar) {
        return m6.u.u(Arrays.asList("projects", fVar.k(), "databases", fVar.i()));
    }

    private static m6.u a0(m6.u uVar) {
        q6.b.d(uVar.q() > 4 && uVar.n(4).equals("documents"), "Tried to deserialize invalid key %s", uVar);
        return uVar.r(5);
    }

    private j1 b0(g7.a aVar) {
        return j1.h(aVar.f0()).q(aVar.h0());
    }

    private n6.d d(d7.l lVar) {
        int k02 = lVar.k0();
        HashSet hashSet = new HashSet(k02);
        for (int i10 = 0; i10 < k02; i10++) {
            hashSet.add(m6.r.v(lVar.j0(i10)));
        }
        return n6.d.b(hashSet);
    }

    private static boolean d0(m6.u uVar) {
        return uVar.q() >= 4 && uVar.n(0).equals("projects") && uVar.n(2).equals("databases");
    }

    private q.b g(x.f.b bVar) {
        switch (a.f15619j[bVar.ordinal()]) {
            case 1:
                return q.b.LESS_THAN;
            case 2:
                return q.b.LESS_THAN_OR_EQUAL;
            case 3:
                return q.b.EQUAL;
            case 4:
                return q.b.NOT_EQUAL;
            case 5:
                return q.b.GREATER_THAN_OR_EQUAL;
            case 6:
                return q.b.GREATER_THAN;
            case 7:
                return q.b.ARRAY_CONTAINS;
            case 8:
                return q.b.IN;
            case 9:
                return q.b.ARRAY_CONTAINS_ANY;
            case 10:
                return q.b.NOT_IN;
            default:
                throw q6.b.a("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    private n6.e h(n.c cVar) {
        int i10 = a.f15612c[cVar.p0().ordinal()];
        if (i10 == 1) {
            q6.b.d(cVar.o0() == n.c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", cVar.o0());
            return new n6.e(m6.r.v(cVar.l0()), n6.n.d());
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    return new n6.e(m6.r.v(cVar.l0()), new n6.j(cVar.m0()));
                }
                throw q6.b.a("Unknown FieldTransform proto: %s", cVar);
            }
            return new n6.e(m6.r.v(cVar.l0()), new a.C0208a(cVar.n0().o()));
        } else {
            return new n6.e(m6.r.v(cVar.l0()), new a.b(cVar.k0().o()));
        }
    }

    private List<j6.r> j(x.h hVar) {
        j6.r i10 = i(hVar);
        if (i10 instanceof j6.l) {
            j6.l lVar = (j6.l) i10;
            if (lVar.l()) {
                return lVar.b();
            }
        }
        return Collections.singletonList(i10);
    }

    private m6.s k(d7.e eVar) {
        q6.b.d(eVar.j0().equals(e.c.FOUND), "Tried to deserialize a found document from a missing document.", new Object[0]);
        m6.l l10 = l(eVar.g0().l0());
        m6.t i10 = m6.t.i(eVar.g0().j0());
        m6.w y10 = y(eVar.g0().m0());
        q6.b.d(!y10.equals(m6.w.f13842k), "Got a document response with no snapshot version", new Object[0]);
        return m6.s.p(l10, y10, i10);
    }

    private m6.s n(d7.e eVar) {
        q6.b.d(eVar.j0().equals(e.c.MISSING), "Tried to deserialize a missing document from a found document.", new Object[0]);
        m6.l l10 = l(eVar.h0());
        m6.w y10 = y(eVar.i0());
        q6.b.d(!y10.equals(m6.w.f13842k), "Got a no document response with no snapshot version", new Object[0]);
        return m6.s.r(l10, y10);
    }

    private a1 q(x.i iVar) {
        a1.a aVar;
        m6.r v10 = m6.r.v(iVar.i0().h0());
        int i10 = a.f15620k[iVar.h0().ordinal()];
        if (i10 == 1) {
            aVar = a1.a.ASCENDING;
        } else if (i10 != 2) {
            throw q6.b.a("Unrecognized direction %d", iVar.h0());
        } else {
            aVar = a1.a.DESCENDING;
        }
        return a1.d(aVar, v10);
    }

    private n6.m r(d7.t tVar) {
        int i10 = a.f15611b[tVar.h0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return n6.m.f14330c;
                }
                throw q6.b.a("Unknown precondition", new Object[0]);
            }
            return n6.m.a(tVar.j0());
        }
        return n6.m.f(y(tVar.k0()));
    }

    private m6.u s(String str) {
        m6.u v10 = v(str);
        return v10.q() == 4 ? m6.u.f13841k : a0(v10);
    }

    private m6.u v(String str) {
        m6.u v10 = m6.u.v(str);
        q6.b.d(d0(v10), "Tried to deserialize invalid key %s", v10);
        return v10;
    }

    private j6.r x(x.k kVar) {
        q.b bVar;
        d7.b0 b0Var;
        m6.r v10 = m6.r.v(kVar.i0().h0());
        int i10 = a.f15617h[kVar.j0().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                bVar = q.b.EQUAL;
            } else if (i10 == 3) {
                bVar = q.b.NOT_EQUAL;
            } else if (i10 != 4) {
                throw q6.b.a("Unrecognized UnaryFilter.operator %d", kVar.j0());
            } else {
                bVar = q.b.NOT_EQUAL;
            }
            b0Var = m6.y.f13849b;
            return j6.q.f(v10, bVar, b0Var);
        }
        bVar = q.b.EQUAL;
        b0Var = m6.y.f13848a;
        return j6.q.f(v10, bVar, b0Var);
    }

    public w0 A(d7.r rVar) {
        w0.e eVar;
        w0 dVar;
        int i10 = a.f15622m[rVar.k0().ordinal()];
        j1 j1Var = null;
        if (i10 == 1) {
            d7.z l02 = rVar.l0();
            int i11 = a.f15621l[l02.j0().ordinal()];
            if (i11 == 1) {
                eVar = w0.e.NoChange;
            } else if (i11 == 2) {
                eVar = w0.e.Added;
            } else if (i11 == 3) {
                eVar = w0.e.Removed;
                j1Var = b0(l02.f0());
            } else if (i11 == 4) {
                eVar = w0.e.Current;
            } else if (i11 != 5) {
                throw new IllegalArgumentException("Unknown target change type");
            } else {
                eVar = w0.e.Reset;
            }
            dVar = new w0.d(eVar, l02.l0(), l02.i0(), j1Var);
        } else if (i10 == 2) {
            d7.j g02 = rVar.g0();
            List<Integer> i02 = g02.i0();
            List<Integer> h02 = g02.h0();
            m6.l l10 = l(g02.g0().l0());
            m6.w y10 = y(g02.g0().m0());
            q6.b.d(!y10.equals(m6.w.f13842k), "Got a document change without an update time", new Object[0]);
            m6.s p10 = m6.s.p(l10, y10, m6.t.i(g02.g0().j0()));
            dVar = new w0.b(i02, h02, p10.getKey(), p10);
        } else if (i10 == 3) {
            d7.k h03 = rVar.h0();
            List<Integer> i03 = h03.i0();
            m6.s r10 = m6.s.r(l(h03.g0()), y(h03.h0()));
            return new w0.b(Collections.emptyList(), i03, r10.getKey(), r10);
        } else if (i10 != 4) {
            if (i10 == 5) {
                d7.o j02 = rVar.j0();
                return new w0.c(j02.h0(), new p(j02.f0()));
            }
            throw new IllegalArgumentException("Unknown change type set");
        } else {
            d7.m i04 = rVar.i0();
            dVar = new w0.b(Collections.emptyList(), i04.h0(), l(i04.g0()), null);
        }
        return dVar;
    }

    x.h B(j6.l lVar) {
        Object b10;
        ArrayList arrayList = new ArrayList(lVar.b().size());
        for (j6.r rVar : lVar.b()) {
            arrayList.add(J(rVar));
        }
        if (arrayList.size() == 1) {
            b10 = arrayList.get(0);
        } else {
            x.d.a m02 = x.d.m0();
            m02.I(C(lVar.h()));
            m02.H(arrayList);
            b10 = x.h.n0().H(m02).b();
        }
        return (x.h) b10;
    }

    x.d.b C(l.a aVar) {
        int i10 = a.f15614e[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return x.d.b.OR;
            }
            throw q6.b.a("Unrecognized composite filter type.", new Object[0]);
        }
        return x.d.b.AND;
    }

    public d7.i D(m6.l lVar, m6.t tVar) {
        i.b p02 = d7.i.p0();
        p02.I(L(lVar));
        p02.H(tVar.o());
        return p02.b();
    }

    public y.c F(j6.g1 g1Var) {
        y.c.a l02 = y.c.l0();
        l02.H(R(g1Var.n()));
        return l02.b();
    }

    x.h J(j6.r rVar) {
        if (rVar instanceof j6.q) {
            return X((j6.q) rVar);
        }
        if (rVar instanceof j6.l) {
            return B((j6.l) rVar);
        }
        throw q6.b.a("Unrecognized filter type %s", rVar.toString());
    }

    public String L(m6.l lVar) {
        return T(this.f15608a, lVar.r());
    }

    public Map<String, String> N(h4 h4Var) {
        String M = M(h4Var.b());
        if (M == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("goog-listen-tags", M);
        return hashMap;
    }

    public d7.c0 O(n6.f fVar) {
        c0.b z02 = d7.c0.z0();
        if (fVar instanceof n6.o) {
            z02.K(D(fVar.g(), ((n6.o) fVar).o()));
        } else if (fVar instanceof n6.l) {
            z02.K(D(fVar.g(), ((n6.l) fVar).q()));
            z02.L(E(fVar.e()));
        } else if (fVar instanceof n6.c) {
            z02.J(L(fVar.g()));
        } else if (!(fVar instanceof n6.q)) {
            throw q6.b.a("unknown mutation type %s", fVar.getClass());
        } else {
            z02.M(L(fVar.g()));
        }
        for (n6.e eVar : fVar.f()) {
            z02.H(I(eVar));
        }
        if (!fVar.h().d()) {
            z02.I(Q(fVar.h()));
        }
        return z02.b();
    }

    public y.d S(j6.g1 g1Var) {
        y.d.a k02 = y.d.k0();
        x.b C0 = d7.x.C0();
        m6.u n10 = g1Var.n();
        if (g1Var.d() != null) {
            q6.b.d(n10.q() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            k02.H(R(n10));
            x.c.a j02 = x.c.j0();
            j02.I(g1Var.d());
            j02.H(true);
            C0.H(j02);
        } else {
            q6.b.d(n10.q() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            k02.H(R(n10.s()));
            x.c.a j03 = x.c.j0();
            j03.I(n10.l());
            C0.H(j03);
        }
        if (g1Var.h().size() > 0) {
            C0.M(K(g1Var.h()));
        }
        for (a1 a1Var : g1Var.m()) {
            C0.I(P(a1Var));
        }
        if (g1Var.r()) {
            C0.K(com.google.protobuf.a0.i0().H((int) g1Var.j()));
        }
        if (g1Var.p() != null) {
            h.b l02 = d7.h.l0();
            l02.H(g1Var.p().b());
            l02.I(g1Var.p().c());
            C0.L(l02);
        }
        if (g1Var.f() != null) {
            h.b l03 = d7.h.l0();
            l03.H(g1Var.f().b());
            l03.I(!g1Var.f().c());
            C0.J(l03);
        }
        k02.I(C0);
        return k02.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d7.w U(y.d dVar, List<com.google.firebase.firestore.a> list) {
        w.c j02 = d7.w.j0();
        j02.I(dVar.j0());
        HashSet hashSet = new HashSet();
        for (com.google.firebase.firestore.a aVar : list) {
            w.b.C0124b h02 = w.b.h0();
            x.g.i0().H(aVar.c()).b();
            if (!(aVar instanceof a.b)) {
                throw new RuntimeException("Unsupported aggregation");
            }
            h02.I(w.b.c.f0());
            h02.H(aVar.b());
            hashSet.add(h02.b());
        }
        j02.H(hashSet);
        return (d7.w) j02.b();
    }

    public d7.y V(h4 h4Var) {
        y.b k02 = d7.y.k0();
        j6.g1 f10 = h4Var.f();
        if (f10.s()) {
            k02.H(F(f10));
        } else {
            k02.I(S(f10));
        }
        k02.L(h4Var.g());
        if (!h4Var.c().isEmpty() || h4Var.e().compareTo(m6.w.f13842k) <= 0) {
            k02.K(h4Var.c());
        } else {
            k02.J(W(h4Var.e().g()));
        }
        return k02.b();
    }

    public t1 W(w5.q qVar) {
        t1.b k02 = t1.k0();
        k02.I(qVar.l());
        k02.H(qVar.k());
        return k02.b();
    }

    x.h X(j6.q qVar) {
        x.k.b bVar;
        x.h.a J;
        q.b h10 = qVar.h();
        q.b bVar2 = q.b.EQUAL;
        if (h10 == bVar2 || qVar.h() == q.b.NOT_EQUAL) {
            x.k.a k02 = x.k.k0();
            k02.H(H(qVar.g()));
            if (m6.y.y(qVar.i())) {
                bVar = qVar.h() == bVar2 ? x.k.b.IS_NAN : x.k.b.IS_NOT_NAN;
            } else if (m6.y.z(qVar.i())) {
                bVar = qVar.h() == bVar2 ? x.k.b.IS_NULL : x.k.b.IS_NOT_NULL;
            }
            k02.I(bVar);
            J = x.h.n0().J(k02);
            return J.b();
        }
        x.f.a m02 = x.f.m0();
        m02.H(H(qVar.g()));
        m02.I(G(qVar.h()));
        m02.J(qVar.i());
        J = x.h.n0().I(m02);
        return J.b();
    }

    public t1 Y(m6.w wVar) {
        return W(wVar.g());
    }

    public String a() {
        return this.f15609b;
    }

    j6.l b(x.d dVar) {
        ArrayList arrayList = new ArrayList();
        for (x.h hVar : dVar.k0()) {
            arrayList.add(i(hVar));
        }
        return new j6.l(arrayList, c(dVar.l0()));
    }

    l.a c(x.d.b bVar) {
        int i10 = a.f15615f[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return l.a.OR;
            }
            throw q6.b.a("Only AND and OR composite filter types are supported.", new Object[0]);
        }
        return l.a.AND;
    }

    public boolean c0(m6.u uVar) {
        return d0(uVar) && uVar.n(1).equals(this.f15608a.k()) && uVar.n(3).equals(this.f15608a.i());
    }

    public j6.g1 e(y.c cVar) {
        int k02 = cVar.k0();
        q6.b.d(k02 == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(k02));
        return b1.b(s(cVar.j0(0))).D();
    }

    j6.q f(x.f fVar) {
        return j6.q.f(m6.r.v(fVar.j0().h0()), g(fVar.k0()), fVar.l0());
    }

    j6.r i(x.h hVar) {
        int i10 = a.f15616g[hVar.l0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return x(hVar.m0());
                }
                throw q6.b.a("Unrecognized Filter.filterType %d", hVar.l0());
            }
            return f(hVar.k0());
        }
        return b(hVar.i0());
    }

    public m6.l l(String str) {
        m6.u v10 = v(str);
        q6.b.d(v10.n(1).equals(this.f15608a.k()), "Tried to deserialize key from different project.", new Object[0]);
        q6.b.d(v10.n(3).equals(this.f15608a.i()), "Tried to deserialize key from different database.", new Object[0]);
        return m6.l.l(a0(v10));
    }

    public m6.s m(d7.e eVar) {
        if (eVar.j0().equals(e.c.FOUND)) {
            return k(eVar);
        }
        if (eVar.j0().equals(e.c.MISSING)) {
            return n(eVar);
        }
        throw new IllegalArgumentException("Unknown result case: " + eVar.j0());
    }

    public n6.f o(d7.c0 c0Var) {
        n6.m r10 = c0Var.v0() ? r(c0Var.n0()) : n6.m.f14330c;
        ArrayList arrayList = new ArrayList();
        for (n.c cVar : c0Var.t0()) {
            arrayList.add(h(cVar));
        }
        int i10 = a.f15610a[c0Var.p0().ordinal()];
        if (i10 == 1) {
            return c0Var.y0() ? new n6.l(l(c0Var.r0().l0()), m6.t.i(c0Var.r0().j0()), d(c0Var.s0()), r10, arrayList) : new n6.o(l(c0Var.r0().l0()), m6.t.i(c0Var.r0().j0()), r10, arrayList);
        } else if (i10 != 2) {
            if (i10 == 3) {
                return new n6.q(l(c0Var.u0()), r10);
            }
            throw q6.b.a("Unknown mutation operation: %d", c0Var.p0());
        } else {
            return new n6.c(l(c0Var.o0()), r10);
        }
    }

    public n6.i p(d7.f0 f0Var, m6.w wVar) {
        m6.w y10 = y(f0Var.h0());
        if (!m6.w.f13842k.equals(y10)) {
            wVar = y10;
        }
        int g02 = f0Var.g0();
        ArrayList arrayList = new ArrayList(g02);
        for (int i10 = 0; i10 < g02; i10++) {
            arrayList.add(f0Var.f0(i10));
        }
        return new n6.i(wVar, arrayList);
    }

    public j6.g1 t(y.d dVar) {
        return u(dVar.i0(), dVar.j0());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j6.g1 u(java.lang.String r14, d7.x r15) {
        /*
            r13 = this;
            m6.u r14 = r13.s(r14)
            int r0 = r15.s0()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L30
            if (r0 != r3) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "StructuredQuery.from with more than one collection is not supported."
            q6.b.d(r0, r5, r4)
            d7.x$c r0 = r15.r0(r2)
            boolean r4 = r0.h0()
            java.lang.String r0 = r0.i0()
            if (r4 == 0) goto L2a
            r5 = r14
            r6 = r0
            goto L32
        L2a:
            m6.e r14 = r14.b(r0)
            m6.u r14 = (m6.u) r14
        L30:
            r5 = r14
            r6 = r1
        L32:
            boolean r14 = r15.B0()
            if (r14 == 0) goto L41
            d7.x$h r14 = r15.x0()
            java.util.List r14 = r13.j(r14)
            goto L45
        L41:
            java.util.List r14 = java.util.Collections.emptyList()
        L45:
            r7 = r14
            int r14 = r15.v0()
            if (r14 <= 0) goto L63
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r14)
        L51:
            if (r2 >= r14) goto L61
            d7.x$i r4 = r15.u0(r2)
            j6.a1 r4 = r13.q(r4)
            r0.add(r4)
            int r2 = r2 + 1
            goto L51
        L61:
            r8 = r0
            goto L68
        L63:
            java.util.List r14 = java.util.Collections.emptyList()
            r8 = r14
        L68:
            r9 = -1
            boolean r14 = r15.z0()
            if (r14 == 0) goto L79
            com.google.protobuf.a0 r14 = r15.t0()
            int r14 = r14.h0()
            long r9 = (long) r14
        L79:
            boolean r14 = r15.A0()
            if (r14 == 0) goto L96
            j6.i r14 = new j6.i
            d7.h r0 = r15.w0()
            java.util.List r0 = r0.o()
            d7.h r2 = r15.w0()
            boolean r2 = r2.j0()
            r14.<init>(r0, r2)
            r11 = r14
            goto L97
        L96:
            r11 = r1
        L97:
            boolean r14 = r15.y0()
            if (r14 == 0) goto Lb3
            j6.i r1 = new j6.i
            d7.h r14 = r15.q0()
            java.util.List r14 = r14.o()
            d7.h r15 = r15.q0()
            boolean r15 = r15.j0()
            r15 = r15 ^ r3
            r1.<init>(r14, r15)
        Lb3:
            r12 = r1
            j6.g1 r14 = new j6.g1
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.l0.u(java.lang.String, d7.x):j6.g1");
    }

    public w5.q w(t1 t1Var) {
        return new w5.q(t1Var.j0(), t1Var.i0());
    }

    public m6.w y(t1 t1Var) {
        return (t1Var.j0() == 0 && t1Var.i0() == 0) ? m6.w.f13842k : new m6.w(w(t1Var));
    }

    public m6.w z(d7.r rVar) {
        if (rVar.k0() == r.c.TARGET_CHANGE && rVar.l0().k0() == 0) {
            return y(rVar.l0().h0());
        }
        return m6.w.f13842k;
    }
}
