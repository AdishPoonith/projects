package p6;

import j6.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l6.g1;
import l6.h4;
import p6.v0;
import p6.w0;
/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f15736a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, t0> f15737b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<m6.l, m6.s> f15738c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<m6.l, Set<Integer>> f15739d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f15740e = new HashSet();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15741a;

        static {
            int[] iArr = new int[w0.e.values().length];
            f15741a = iArr;
            try {
                iArr[w0.e.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15741a[w0.e.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15741a[w0.e.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15741a[w0.e.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15741a[w0.e.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        h4 a(int i10);

        d6.e<m6.l> b(int i10);
    }

    public x0(b bVar) {
        this.f15736a = bVar;
    }

    private void a(int i10, m6.s sVar) {
        if (j(i10)) {
            d(i10).a(sVar.getKey(), p(i10, sVar.getKey()) ? n.a.MODIFIED : n.a.ADDED);
            this.f15738c.put(sVar.getKey(), sVar);
            c(sVar.getKey()).add(Integer.valueOf(i10));
        }
    }

    private Set<Integer> c(m6.l lVar) {
        Set<Integer> set = this.f15739d.get(lVar);
        if (set == null) {
            HashSet hashSet = new HashSet();
            this.f15739d.put(lVar, hashSet);
            return hashSet;
        }
        return set;
    }

    private t0 d(int i10) {
        t0 t0Var = this.f15737b.get(Integer.valueOf(i10));
        if (t0Var == null) {
            t0 t0Var2 = new t0();
            this.f15737b.put(Integer.valueOf(i10), t0Var2);
            return t0Var2;
        }
        return t0Var;
    }

    private int e(int i10) {
        s0 j10 = d(i10).j();
        return (this.f15736a.b(i10).size() + j10.b().size()) - j10.d().size();
    }

    private Collection<Integer> f(w0.d dVar) {
        List<Integer> d10 = dVar.d();
        if (d10.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Integer num : this.f15737b.keySet()) {
                if (j(num.intValue())) {
                    arrayList.add(num);
                }
            }
            return arrayList;
        }
        return d10;
    }

    private boolean j(int i10) {
        return k(i10) != null;
    }

    private h4 k(int i10) {
        t0 t0Var = this.f15737b.get(Integer.valueOf(i10));
        if (t0Var == null || !t0Var.e()) {
            return this.f15736a.a(i10);
        }
        return null;
    }

    private void m(int i10, m6.l lVar, m6.s sVar) {
        if (j(i10)) {
            t0 d10 = d(i10);
            if (p(i10, lVar)) {
                d10.a(lVar, n.a.REMOVED);
            } else {
                d10.i(lVar);
            }
            c(lVar).add(Integer.valueOf(i10));
            if (sVar != null) {
                this.f15738c.put(lVar, sVar);
            }
        }
    }

    private void o(int i10) {
        q6.b.d((this.f15737b.get(Integer.valueOf(i10)) == null || this.f15737b.get(Integer.valueOf(i10)).e()) ? false : true, "Should only reset active targets", new Object[0]);
        this.f15737b.put(Integer.valueOf(i10), new t0());
        Iterator<m6.l> it = this.f15736a.b(i10).iterator();
        while (it.hasNext()) {
            m(i10, it.next(), null);
        }
    }

    private boolean p(int i10, m6.l lVar) {
        return this.f15736a.b(i10).contains(lVar);
    }

    public k0 b(m6.w wVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, t0> entry : this.f15737b.entrySet()) {
            int intValue = entry.getKey().intValue();
            t0 value = entry.getValue();
            h4 k10 = k(intValue);
            if (k10 != null) {
                if (value.d() && k10.f().s()) {
                    m6.l l10 = m6.l.l(k10.f().n());
                    if (this.f15738c.get(l10) == null && !p(intValue, l10)) {
                        m(intValue, l10, m6.s.r(l10, wVar));
                    }
                }
                if (value.c()) {
                    hashMap.put(Integer.valueOf(intValue), value.j());
                    value.b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<m6.l, Set<Integer>> entry2 : this.f15739d.entrySet()) {
            m6.l key = entry2.getKey();
            boolean z10 = true;
            Iterator<Integer> it = entry2.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h4 k11 = k(it.next().intValue());
                if (k11 != null && !k11.b().equals(g1.LIMBO_RESOLUTION)) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                hashSet.add(key);
            }
        }
        for (m6.s sVar : this.f15738c.values()) {
            sVar.v(wVar);
        }
        k0 k0Var = new k0(wVar, Collections.unmodifiableMap(hashMap), Collections.unmodifiableSet(this.f15740e), Collections.unmodifiableMap(this.f15738c), Collections.unmodifiableSet(hashSet));
        this.f15738c = new HashMap();
        this.f15739d = new HashMap();
        this.f15740e = new HashSet();
        return k0Var;
    }

    public void g(w0.b bVar) {
        m6.s b10 = bVar.b();
        m6.l a10 = bVar.a();
        for (Integer num : bVar.d()) {
            int intValue = num.intValue();
            if (b10 == null || !b10.c()) {
                m(intValue, a10, b10);
            } else {
                a(intValue, b10);
            }
        }
        for (Integer num2 : bVar.c()) {
            m(num2.intValue(), a10, bVar.b());
        }
    }

    public void h(w0.c cVar) {
        int b10 = cVar.b();
        int a10 = cVar.a().a();
        h4 k10 = k(b10);
        if (k10 != null) {
            j6.g1 f10 = k10.f();
            if (f10.s()) {
                if (a10 != 0) {
                    q6.b.d(a10 == 1, "Single document existence filter with count: %d", Integer.valueOf(a10));
                    return;
                }
                m6.l l10 = m6.l.l(f10.n());
                m(b10, l10, m6.s.r(l10, m6.w.f13842k));
                return;
            }
            long e10 = e(b10);
            if (e10 != a10) {
                o(b10);
                this.f15740e.add(Integer.valueOf(b10));
                v0.b().d(v0.a.c((int) e10, cVar.a()));
            }
        }
    }

    public void i(w0.d dVar) {
        for (Integer num : f(dVar)) {
            int intValue = num.intValue();
            t0 d10 = d(intValue);
            int i10 = a.f15741a[dVar.b().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    d10.h();
                    if (!d10.e()) {
                        d10.b();
                    }
                } else if (i10 == 3) {
                    d10.h();
                    if (!d10.e()) {
                        n(intValue);
                    }
                    q6.b.d(dVar.a() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw q6.b.a("Unknown target watch change state: %s", dVar.b());
                    }
                    if (j(intValue)) {
                        o(intValue);
                    }
                } else if (j(intValue)) {
                    d10.f();
                }
                d10.k(dVar.c());
            } else if (j(intValue)) {
                d10.k(dVar.c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(int i10) {
        d(i10).g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i10) {
        this.f15737b.remove(Integer.valueOf(i10));
    }
}
