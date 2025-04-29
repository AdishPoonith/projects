package l6;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import m6.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final k1 f13246a;

    /* renamed from: b  reason: collision with root package name */
    private final b1 f13247b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13248c;

    /* renamed from: d  reason: collision with root package name */
    private final l f13249d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(k1 k1Var, b1 b1Var, b bVar, l lVar) {
        this.f13246a = k1Var;
        this.f13247b = b1Var;
        this.f13248c = bVar;
        this.f13249d = lVar;
    }

    private Map<m6.l, d1> a(Map<m6.l, m6.s> map, Map<m6.l, n6.k> map2, Set<m6.l> set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (m6.s sVar : map.values()) {
            n6.k kVar = map2.get(sVar.getKey());
            if (set.contains(sVar.getKey()) && (kVar == null || (kVar.d() instanceof n6.l))) {
                hashMap.put(sVar.getKey(), sVar);
            } else if (kVar != null) {
                hashMap2.put(sVar.getKey(), kVar.d().e());
                kVar.d().a(sVar, kVar.d().e(), w5.q.p());
            } else {
                hashMap2.put(sVar.getKey(), n6.d.f14309b);
            }
        }
        hashMap2.putAll(m(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry<m6.l, m6.s> entry : map.entrySet()) {
            hashMap3.put(entry.getKey(), new d1(entry.getValue(), (n6.d) hashMap2.get(entry.getKey())));
        }
        return hashMap3;
    }

    private m6.s b(m6.l lVar, n6.k kVar) {
        return (kVar == null || (kVar.d() instanceof n6.l)) ? this.f13246a.c(lVar) : m6.s.q(lVar);
    }

    private d6.c<m6.l, m6.i> e(j6.b1 b1Var, q.a aVar) {
        q6.b.d(b1Var.n().o(), "Currently we only support collection group queries at the root.", new Object[0]);
        String f10 = b1Var.f();
        d6.c<m6.l, m6.i> a10 = m6.j.a();
        for (m6.u uVar : this.f13249d.a(f10)) {
            Iterator<Map.Entry<m6.l, m6.i>> it = f(b1Var.a(uVar.b(f10)), aVar).iterator();
            while (it.hasNext()) {
                Map.Entry<m6.l, m6.i> next = it.next();
                a10 = a10.p(next.getKey(), next.getValue());
            }
        }
        return a10;
    }

    private d6.c<m6.l, m6.i> f(j6.b1 b1Var, q.a aVar) {
        Map<m6.l, n6.k> d10 = this.f13248c.d(b1Var.n(), aVar.n());
        Map<m6.l, m6.s> a10 = this.f13246a.a(b1Var, aVar, d10.keySet());
        for (Map.Entry<m6.l, n6.k> entry : d10.entrySet()) {
            if (!a10.containsKey(entry.getKey())) {
                a10.put(entry.getKey(), m6.s.q(entry.getKey()));
            }
        }
        d6.c<m6.l, m6.i> a11 = m6.j.a();
        for (Map.Entry<m6.l, m6.s> entry2 : a10.entrySet()) {
            n6.k kVar = d10.get(entry2.getKey());
            if (kVar != null) {
                kVar.d().a(entry2.getValue(), n6.d.f14309b, w5.q.p());
            }
            if (b1Var.v(entry2.getValue())) {
                a11 = a11.p(entry2.getKey(), entry2.getValue());
            }
        }
        return a11;
    }

    private d6.c<m6.l, m6.i> g(m6.u uVar) {
        d6.c<m6.l, m6.i> a10 = m6.j.a();
        m6.i c10 = c(m6.l.l(uVar));
        return c10.c() ? a10.p(c10.getKey(), c10) : a10;
    }

    private void l(Map<m6.l, n6.k> map, Set<m6.l> set) {
        TreeSet treeSet = new TreeSet();
        for (m6.l lVar : set) {
            if (!map.containsKey(lVar)) {
                treeSet.add(lVar);
            }
        }
        map.putAll(this.f13248c.a(treeSet));
    }

    private Map<m6.l, n6.d> m(Map<m6.l, m6.s> map) {
        List<n6.g> e10 = this.f13247b.e(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (n6.g gVar : e10) {
            for (m6.l lVar : gVar.f()) {
                m6.s sVar = map.get(lVar);
                if (sVar != null) {
                    hashMap.put(lVar, gVar.b(sVar, hashMap.containsKey(lVar) ? (n6.d) hashMap.get(lVar) : n6.d.f14309b));
                    int e11 = gVar.e();
                    if (!treeMap.containsKey(Integer.valueOf(e11))) {
                        treeMap.put(Integer.valueOf(e11), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(e11))).add(lVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (m6.l lVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(lVar2)) {
                    n6.f c10 = n6.f.c(map.get(lVar2), (n6.d) hashMap.get(lVar2));
                    if (c10 != null) {
                        hashMap2.put(lVar2, c10);
                    }
                    hashSet.add(lVar2);
                }
            }
            this.f13248c.c(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m6.i c(m6.l lVar) {
        n6.k f10 = this.f13248c.f(lVar);
        m6.s b10 = b(lVar, f10);
        if (f10 != null) {
            f10.d().a(b10, n6.d.f14309b, w5.q.p());
        }
        return b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6.c<m6.l, m6.i> d(Iterable<m6.l> iterable) {
        return i(this.f13246a.f(iterable), new HashSet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6.c<m6.l, m6.i> h(j6.b1 b1Var, q.a aVar) {
        return b1Var.s() ? g(b1Var.n()) : b1Var.r() ? e(b1Var, aVar) : f(b1Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d6.c<m6.l, m6.i> i(Map<m6.l, m6.s> map, Set<m6.l> set) {
        HashMap hashMap = new HashMap();
        l(hashMap, map.keySet());
        d6.c<m6.l, m6.i> a10 = m6.j.a();
        for (Map.Entry<m6.l, d1> entry : a(map, hashMap, set).entrySet()) {
            a10 = a10.p(entry.getKey(), entry.getValue().a());
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m j(String str, q.a aVar, int i10) {
        Map<m6.l, m6.s> e10 = this.f13246a.e(str, aVar, i10);
        Map<m6.l, n6.k> e11 = i10 - e10.size() > 0 ? this.f13248c.e(str, aVar.n(), i10 - e10.size()) : Collections.emptyMap();
        int i11 = -1;
        for (n6.k kVar : e11.values()) {
            if (!e10.containsKey(kVar.b())) {
                e10.put(kVar.b(), b(kVar.b(), kVar));
            }
            i11 = Math.max(i11, kVar.c());
        }
        l(e11, e10.keySet());
        return m.a(i11, a(e10, e11, Collections.emptySet()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<m6.l, d1> k(Map<m6.l, m6.s> map) {
        HashMap hashMap = new HashMap();
        l(hashMap, map.keySet());
        return a(map, hashMap, new HashSet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Set<m6.l> set) {
        m(this.f13246a.f(set));
    }
}
