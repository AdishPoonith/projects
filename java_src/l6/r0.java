package l6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class r0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final TreeMap<m6.l, n6.k> f13306a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Set<m6.l>> f13307b = new HashMap();

    private void g(int i10, n6.f fVar) {
        n6.k kVar = this.f13306a.get(fVar.g());
        if (kVar != null) {
            this.f13307b.get(Integer.valueOf(kVar.c())).remove(fVar.g());
        }
        this.f13306a.put(fVar.g(), n6.k.a(i10, fVar));
        if (this.f13307b.get(Integer.valueOf(i10)) == null) {
            this.f13307b.put(Integer.valueOf(i10), new HashSet());
        }
        this.f13307b.get(Integer.valueOf(i10)).add(fVar.g());
    }

    @Override // l6.b
    public Map<m6.l, n6.k> a(SortedSet<m6.l> sortedSet) {
        HashMap hashMap = new HashMap();
        for (m6.l lVar : sortedSet) {
            n6.k kVar = this.f13306a.get(lVar);
            if (kVar != null) {
                hashMap.put(lVar, kVar);
            }
        }
        return hashMap;
    }

    @Override // l6.b
    public void b(int i10) {
        if (this.f13307b.containsKey(Integer.valueOf(i10))) {
            this.f13307b.remove(Integer.valueOf(i10));
            for (m6.l lVar : this.f13307b.get(Integer.valueOf(i10))) {
                this.f13306a.remove(lVar);
            }
        }
    }

    @Override // l6.b
    public void c(int i10, Map<m6.l, n6.f> map) {
        for (Map.Entry<m6.l, n6.f> entry : map.entrySet()) {
            g(i10, (n6.f) q6.x.d(entry.getValue(), "null value for key: %s", entry.getKey()));
        }
    }

    @Override // l6.b
    public Map<m6.l, n6.k> d(m6.u uVar, int i10) {
        HashMap hashMap = new HashMap();
        int q10 = uVar.q() + 1;
        for (n6.k kVar : this.f13306a.tailMap(m6.l.l(uVar.b(""))).values()) {
            m6.l b10 = kVar.b();
            if (!uVar.p(b10.r())) {
                break;
            } else if (b10.r().q() == q10 && kVar.c() > i10) {
                hashMap.put(kVar.b(), kVar);
            }
        }
        return hashMap;
    }

    @Override // l6.b
    public Map<m6.l, n6.k> e(String str, int i10, int i11) {
        TreeMap treeMap = new TreeMap();
        for (n6.k kVar : this.f13306a.values()) {
            if (kVar.b().o().equals(str) && kVar.c() > i10) {
                Map map = (Map) treeMap.get(Integer.valueOf(kVar.c()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(kVar.c()), map);
                }
                map.put(kVar.b(), kVar);
            }
        }
        HashMap hashMap = new HashMap();
        for (Map map2 : treeMap.values()) {
            hashMap.putAll(map2);
            if (hashMap.size() >= i11) {
                break;
            }
        }
        return hashMap;
    }

    @Override // l6.b
    public n6.k f(m6.l lVar) {
        return this.f13306a.get(lVar);
    }
}
