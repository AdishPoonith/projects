package l6;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l6.o0;
/* loaded from: classes.dex */
public final class i0 implements i6.a {

    /* renamed from: n  reason: collision with root package name */
    private static final long f13187n = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a  reason: collision with root package name */
    private final e1 f13188a;

    /* renamed from: b  reason: collision with root package name */
    private l f13189b;

    /* renamed from: c  reason: collision with root package name */
    private b1 f13190c;

    /* renamed from: d  reason: collision with root package name */
    private l6.b f13191d;

    /* renamed from: e  reason: collision with root package name */
    private final k1 f13192e;

    /* renamed from: f  reason: collision with root package name */
    private n f13193f;

    /* renamed from: g  reason: collision with root package name */
    private final f1 f13194g;

    /* renamed from: h  reason: collision with root package name */
    private final j1 f13195h;

    /* renamed from: i  reason: collision with root package name */
    private final g4 f13196i;

    /* renamed from: j  reason: collision with root package name */
    private final l6.a f13197j;

    /* renamed from: k  reason: collision with root package name */
    private final SparseArray<h4> f13198k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<j6.g1, Integer> f13199l;

    /* renamed from: m  reason: collision with root package name */
    private final j6.h1 f13200m;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        h4 f13201a;

        /* renamed from: b  reason: collision with root package name */
        int f13202b;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Map<m6.l, m6.s> f13203a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<m6.l> f13204b;

        private c(Map<m6.l, m6.s> map, Set<m6.l> set) {
            this.f13203a = map;
            this.f13204b = set;
        }
    }

    public i0(e1 e1Var, f1 f1Var, h6.j jVar) {
        q6.b.d(e1Var.i(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f13188a = e1Var;
        this.f13194g = f1Var;
        g4 h10 = e1Var.h();
        this.f13196i = h10;
        this.f13197j = e1Var.a();
        this.f13200m = j6.h1.b(h10.j());
        this.f13192e = e1Var.g();
        j1 j1Var = new j1();
        this.f13195h = j1Var;
        this.f13198k = new SparseArray<>();
        this.f13199l = new HashMap();
        e1Var.f().o(j1Var);
        M(jVar);
    }

    private Set<m6.l> D(n6.h hVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < hVar.e().size(); i10++) {
            if (!hVar.e().get(i10).a().isEmpty()) {
                hashSet.add(hVar.b().h().get(i10).g());
            }
        }
        return hashSet;
    }

    private void M(h6.j jVar) {
        l c10 = this.f13188a.c(jVar);
        this.f13189b = c10;
        this.f13190c = this.f13188a.d(jVar, c10);
        l6.b b10 = this.f13188a.b(jVar);
        this.f13191d = b10;
        this.f13193f = new n(this.f13192e, this.f13190c, b10, this.f13189b);
        this.f13192e.b(this.f13189b);
        this.f13194g.e(this.f13193f, this.f13189b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d6.c N(n6.h hVar) {
        n6.g b10 = hVar.b();
        this.f13190c.f(b10, hVar.f());
        x(hVar);
        this.f13190c.a();
        this.f13191d.b(hVar.b().e());
        this.f13193f.n(D(hVar));
        return this.f13193f.d(b10.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(b bVar, j6.g1 g1Var) {
        int c10 = this.f13200m.c();
        bVar.f13202b = c10;
        h4 h4Var = new h4(g1Var, c10, this.f13188a.f().p(), g1.LISTEN);
        bVar.f13201a = h4Var;
        this.f13196i.d(h4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d6.c P(d6.c cVar, h4 h4Var) {
        d6.e<m6.l> i10 = m6.l.i();
        HashMap hashMap = new HashMap();
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m6.l lVar = (m6.l) entry.getKey();
            m6.s sVar = (m6.s) entry.getValue();
            if (sVar.c()) {
                i10 = i10.k(lVar);
            }
            hashMap.put(lVar, sVar);
        }
        this.f13196i.c(h4Var.g());
        this.f13196i.g(i10, h4Var.g());
        c g02 = g0(hashMap);
        return this.f13193f.i(g02.f13203a, g02.f13204b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d6.c Q(p6.k0 k0Var, m6.w wVar) {
        Map<Integer, p6.s0> d10 = k0Var.d();
        long p10 = this.f13188a.f().p();
        for (Map.Entry<Integer, p6.s0> entry : d10.entrySet()) {
            int intValue = entry.getKey().intValue();
            p6.s0 value = entry.getValue();
            h4 h4Var = this.f13198k.get(intValue);
            if (h4Var != null) {
                this.f13196i.i(value.d(), intValue);
                this.f13196i.g(value.b(), intValue);
                h4 j10 = h4Var.j(p10);
                if (k0Var.e().contains(Integer.valueOf(intValue))) {
                    com.google.protobuf.i iVar = com.google.protobuf.i.f7143k;
                    m6.w wVar2 = m6.w.f13842k;
                    j10 = j10.i(iVar, wVar2).h(wVar2);
                } else if (!value.e().isEmpty()) {
                    j10 = j10.i(value.e(), k0Var.c());
                }
                this.f13198k.put(intValue, j10);
                if (l0(h4Var, j10, value)) {
                    this.f13196i.f(j10);
                }
            }
        }
        Map<m6.l, m6.s> a10 = k0Var.a();
        Set<m6.l> b10 = k0Var.b();
        for (m6.l lVar : a10.keySet()) {
            if (b10.contains(lVar)) {
                this.f13188a.f().e(lVar);
            }
        }
        c g02 = g0(a10);
        Map<m6.l, m6.s> map = g02.f13203a;
        m6.w b11 = this.f13196i.b();
        if (!wVar.equals(m6.w.f13842k)) {
            q6.b.d(wVar.compareTo(b11) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", wVar, b11);
            this.f13196i.e(wVar);
        }
        return this.f13193f.i(map, g02.f13204b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0.c R(o0 o0Var) {
        return o0Var.f(this.f13198k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(List list) {
        Collection<m6.q> k10 = this.f13189b.k();
        Comparator<m6.q> comparator = m6.q.f13815b;
        final l lVar = this.f13189b;
        Objects.requireNonNull(lVar);
        q6.n nVar = new q6.n() { // from class: l6.h0
            @Override // q6.n
            public final void accept(Object obj) {
                l.this.b((m6.q) obj);
            }
        };
        final l lVar2 = this.f13189b;
        Objects.requireNonNull(lVar2);
        q6.g0.q(k10, list, comparator, nVar, new q6.n() { // from class: l6.q
            @Override // q6.n
            public final void accept(Object obj) {
                l.this.d((m6.q) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ i6.j T(String str) {
        return this.f13197j.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean U(i6.e eVar) {
        i6.e b10 = this.f13197j.b(eVar.a());
        return Boolean.valueOf(b10 != null && b10.b().compareTo(eVar.b()) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            int d10 = j0Var.d();
            this.f13195h.b(j0Var.b(), d10);
            d6.e<m6.l> c10 = j0Var.c();
            Iterator<m6.l> it2 = c10.iterator();
            while (it2.hasNext()) {
                this.f13188a.f().n(it2.next());
            }
            this.f13195h.g(c10, d10);
            if (!j0Var.e()) {
                h4 h4Var = this.f13198k.get(d10);
                q6.b.d(h4Var != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(d10));
                h4 h10 = h4Var.h(h4Var.e());
                this.f13198k.put(d10, h10);
                if (l0(h4Var, h10, null)) {
                    this.f13196i.f(h10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d6.c W(int i10) {
        n6.g g10 = this.f13190c.g(i10);
        q6.b.d(g10 != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.f13190c.d(g10);
        this.f13190c.a();
        this.f13191d.b(i10);
        this.f13193f.n(g10.f());
        return this.f13193f.d(g10.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(int i10) {
        h4 h4Var = this.f13198k.get(i10);
        q6.b.d(h4Var != null, "Tried to release nonexistent target: %s", Integer.valueOf(i10));
        Iterator<m6.l> it = this.f13195h.h(i10).iterator();
        while (it.hasNext()) {
            this.f13188a.f().n(it.next());
        }
        this.f13188a.f().f(h4Var);
        this.f13198k.remove(i10);
        this.f13199l.remove(h4Var.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(i6.e eVar) {
        this.f13197j.d(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(i6.j jVar, h4 h4Var, int i10, d6.e eVar) {
        if (jVar.c().compareTo(h4Var.e()) > 0) {
            h4 i11 = h4Var.i(com.google.protobuf.i.f7143k, jVar.c());
            this.f13198k.append(i10, i11);
            this.f13196i.f(i11);
            this.f13196i.c(i10);
            this.f13196i.g(eVar, i10);
        }
        this.f13197j.a(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(com.google.protobuf.i iVar) {
        this.f13190c.j(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0() {
        this.f13189b.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0() {
        this.f13190c.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m d0(Set set, List list, w5.q qVar) {
        Map<m6.l, m6.s> f10 = this.f13192e.f(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry<m6.l, m6.s> entry : f10.entrySet()) {
            if (!entry.getValue().o()) {
                hashSet.add(entry.getKey());
            }
        }
        Map<m6.l, d1> k10 = this.f13193f.k(f10);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n6.f fVar = (n6.f) it.next();
            m6.t d10 = fVar.d(k10.get(fVar.g()).a());
            if (d10 != null) {
                arrayList.add(new n6.l(fVar.g(), d10, d10.n(), n6.m.a(true)));
            }
        }
        n6.g h10 = this.f13190c.h(qVar, arrayList, list);
        this.f13191d.c(h10.e(), h10.a(k10, hashSet));
        return m.a(h10.e(), k10);
    }

    private static j6.g1 e0(String str) {
        return j6.b1.b(m6.u.v("__bundle__/docs/" + str)).D();
    }

    private c g0(Map<m6.l, m6.s> map) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map<m6.l, m6.s> f10 = this.f13192e.f(map.keySet());
        for (Map.Entry<m6.l, m6.s> entry : map.entrySet()) {
            m6.l key = entry.getKey();
            m6.s value = entry.getValue();
            m6.s sVar = f10.get(key);
            if (value.c() != sVar.c()) {
                hashSet.add(key);
            }
            if (value.h() && value.j().equals(m6.w.f13842k)) {
                arrayList.add(value.getKey());
            } else if (!sVar.o() || value.j().compareTo(sVar.j()) > 0 || (value.j().compareTo(sVar.j()) == 0 && sVar.f())) {
                q6.b.d(!m6.w.f13842k.equals(value.g()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f13192e.d(value, value.g());
            } else {
                q6.v.a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", key, sVar.j(), value.j());
            }
            hashMap.put(key, value);
        }
        this.f13192e.removeAll(arrayList);
        return new c(hashMap, hashSet);
    }

    private static boolean l0(h4 h4Var, h4 h4Var2, p6.s0 s0Var) {
        if (h4Var.c().isEmpty()) {
            return true;
        }
        long l10 = h4Var2.e().g().l() - h4Var.e().g().l();
        long j10 = f13187n;
        if (l10 < j10 && h4Var2.a().g().l() - h4Var.a().g().l() < j10) {
            return s0Var != null && (s0Var.b().size() + s0Var.c().size()) + s0Var.d().size() > 0;
        }
        return true;
    }

    private void n0() {
        this.f13188a.k("Start IndexManager", new Runnable() { // from class: l6.z
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.b0();
            }
        });
    }

    private void o0() {
        this.f13188a.k("Start MutationQueue", new Runnable() { // from class: l6.p
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.c0();
            }
        });
    }

    private void x(n6.h hVar) {
        n6.g b10 = hVar.b();
        for (m6.l lVar : b10.f()) {
            m6.s c10 = this.f13192e.c(lVar);
            m6.w e10 = hVar.d().e(lVar);
            q6.b.d(e10 != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (c10.j().compareTo(e10) < 0) {
                b10.c(c10, hVar);
                if (c10.o()) {
                    this.f13192e.d(c10, hVar.c());
                }
            }
        }
        this.f13190c.d(b10);
    }

    public h1 A(j6.b1 b1Var, boolean z10) {
        d6.e<m6.l> eVar;
        m6.w wVar;
        h4 J = J(b1Var.D());
        m6.w wVar2 = m6.w.f13842k;
        d6.e<m6.l> i10 = m6.l.i();
        if (J != null) {
            wVar = J.a();
            eVar = this.f13196i.a(J.g());
        } else {
            eVar = i10;
            wVar = wVar2;
        }
        f1 f1Var = this.f13194g;
        if (z10) {
            wVar2 = wVar;
        }
        return new h1(f1Var.d(b1Var, wVar2, eVar), eVar);
    }

    public int B() {
        return this.f13190c.c();
    }

    public l C() {
        return this.f13189b;
    }

    public m6.w E() {
        return this.f13196i.b();
    }

    public com.google.protobuf.i F() {
        return this.f13190c.i();
    }

    public n G() {
        return this.f13193f;
    }

    public i6.j H(final String str) {
        return (i6.j) this.f13188a.j("Get named query", new q6.y() { // from class: l6.u
            @Override // q6.y
            public final Object get() {
                i6.j T;
                T = i0.this.T(str);
                return T;
            }
        });
    }

    public n6.g I(int i10) {
        return this.f13190c.b(i10);
    }

    h4 J(j6.g1 g1Var) {
        Integer num = this.f13199l.get(g1Var);
        return num != null ? this.f13198k.get(num.intValue()) : this.f13196i.h(g1Var);
    }

    public d6.c<m6.l, m6.i> K(h6.j jVar) {
        List<n6.g> k10 = this.f13190c.k();
        M(jVar);
        n0();
        o0();
        List<n6.g> k11 = this.f13190c.k();
        d6.e<m6.l> i10 = m6.l.i();
        for (List<n6.g> list : Arrays.asList(k10, k11)) {
            for (n6.g gVar : list) {
                for (n6.f fVar : gVar.h()) {
                    i10 = i10.k(fVar.g());
                }
            }
        }
        return this.f13193f.d(i10);
    }

    public boolean L(final i6.e eVar) {
        return ((Boolean) this.f13188a.j("Has newer bundle", new q6.y() { // from class: l6.t
            @Override // q6.y
            public final Object get() {
                Boolean U;
                U = i0.this.U(eVar);
                return U;
            }
        })).booleanValue();
    }

    @Override // i6.a
    public d6.c<m6.l, m6.i> a(final d6.c<m6.l, m6.s> cVar, String str) {
        final h4 v10 = v(e0(str));
        return (d6.c) this.f13188a.j("Apply bundle documents", new q6.y() { // from class: l6.s
            @Override // q6.y
            public final Object get() {
                d6.c P;
                P = i0.this.P(cVar, v10);
                return P;
            }
        });
    }

    @Override // i6.a
    public void b(final i6.e eVar) {
        this.f13188a.k("Save bundle", new Runnable() { // from class: l6.c0
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.Y(eVar);
            }
        });
    }

    @Override // i6.a
    public void c(final i6.j jVar, final d6.e<m6.l> eVar) {
        final h4 v10 = v(jVar.a().b());
        final int g10 = v10.g();
        this.f13188a.k("Saved named query", new Runnable() { // from class: l6.d0
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.Z(jVar, v10, g10, eVar);
            }
        });
    }

    public void f0(final List<j0> list) {
        this.f13188a.k("notifyLocalViewChanges", new Runnable() { // from class: l6.f0
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.V(list);
            }
        });
    }

    public m6.i h0(m6.l lVar) {
        return this.f13193f.c(lVar);
    }

    public d6.c<m6.l, m6.i> i0(final int i10) {
        return (d6.c) this.f13188a.j("Reject batch", new q6.y() { // from class: l6.r
            @Override // q6.y
            public final Object get() {
                d6.c W;
                W = i0.this.W(i10);
                return W;
            }
        });
    }

    public void j0(final int i10) {
        this.f13188a.k("Release target", new Runnable() { // from class: l6.a0
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.X(i10);
            }
        });
    }

    public void k0(final com.google.protobuf.i iVar) {
        this.f13188a.k("Set stream token", new Runnable() { // from class: l6.b0
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.a0(iVar);
            }
        });
    }

    public void m0() {
        this.f13188a.e().run();
        n0();
        o0();
    }

    public m p0(final List<n6.f> list) {
        final w5.q p10 = w5.q.p();
        final HashSet hashSet = new HashSet();
        for (n6.f fVar : list) {
            hashSet.add(fVar.g());
        }
        return (m) this.f13188a.j("Locally write mutations", new q6.y() { // from class: l6.v
            @Override // q6.y
            public final Object get() {
                m d02;
                d02 = i0.this.d0(hashSet, list, p10);
                return d02;
            }
        });
    }

    public d6.c<m6.l, m6.i> u(final n6.h hVar) {
        return (d6.c) this.f13188a.j("Acknowledge batch", new q6.y() { // from class: l6.x
            @Override // q6.y
            public final Object get() {
                d6.c N;
                N = i0.this.N(hVar);
                return N;
            }
        });
    }

    public h4 v(final j6.g1 g1Var) {
        int i10;
        h4 h10 = this.f13196i.h(g1Var);
        if (h10 != null) {
            i10 = h10.g();
        } else {
            final b bVar = new b();
            this.f13188a.k("Allocate target", new Runnable() { // from class: l6.g0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.this.O(bVar, g1Var);
                }
            });
            i10 = bVar.f13202b;
            h10 = bVar.f13201a;
        }
        if (this.f13198k.get(i10) == null) {
            this.f13198k.put(i10, h10);
            this.f13199l.put(g1Var, Integer.valueOf(i10));
        }
        return h10;
    }

    public d6.c<m6.l, m6.i> w(final p6.k0 k0Var) {
        final m6.w c10 = k0Var.c();
        return (d6.c) this.f13188a.j("Apply remote event", new q6.y() { // from class: l6.y
            @Override // q6.y
            public final Object get() {
                d6.c Q;
                Q = i0.this.Q(k0Var, c10);
                return Q;
            }
        });
    }

    public o0.c y(final o0 o0Var) {
        return (o0.c) this.f13188a.j("Collect garbage", new q6.y() { // from class: l6.w
            @Override // q6.y
            public final Object get() {
                o0.c R;
                R = i0.this.R(o0Var);
                return R;
            }
        });
    }

    public void z(final List<m6.q> list) {
        this.f13188a.k("Configure indexes", new Runnable() { // from class: l6.e0
            @Override // java.lang.Runnable
            public final void run() {
                i0.this.S(list);
            }
        });
    }
}
