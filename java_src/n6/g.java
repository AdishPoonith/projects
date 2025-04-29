package n6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l6.d1;
import m6.s;
import m6.w;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final int f14316a;

    /* renamed from: b  reason: collision with root package name */
    private final w5.q f14317b;

    /* renamed from: c  reason: collision with root package name */
    private final List<f> f14318c;

    /* renamed from: d  reason: collision with root package name */
    private final List<f> f14319d;

    public g(int i10, w5.q qVar, List<f> list, List<f> list2) {
        q6.b.d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f14316a = i10;
        this.f14317b = qVar;
        this.f14318c = list;
        this.f14319d = list2;
    }

    public Map<m6.l, f> a(Map<m6.l, d1> map, Set<m6.l> set) {
        HashMap hashMap = new HashMap();
        for (m6.l lVar : f()) {
            s sVar = (s) map.get(lVar).a();
            d b10 = b(sVar, map.get(lVar).b());
            if (set.contains(lVar)) {
                b10 = null;
            }
            f c10 = f.c(sVar, b10);
            if (c10 != null) {
                hashMap.put(lVar, c10);
            }
            if (!sVar.o()) {
                sVar.m(w.f13842k);
            }
        }
        return hashMap;
    }

    public d b(s sVar, d dVar) {
        for (int i10 = 0; i10 < this.f14318c.size(); i10++) {
            f fVar = this.f14318c.get(i10);
            if (fVar.g().equals(sVar.getKey())) {
                dVar = fVar.a(sVar, dVar, this.f14317b);
            }
        }
        for (int i11 = 0; i11 < this.f14319d.size(); i11++) {
            f fVar2 = this.f14319d.get(i11);
            if (fVar2.g().equals(sVar.getKey())) {
                dVar = fVar2.a(sVar, dVar, this.f14317b);
            }
        }
        return dVar;
    }

    public void c(s sVar, h hVar) {
        int size = this.f14319d.size();
        List<i> e10 = hVar.e();
        q6.b.d(e10.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(e10.size()));
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f14319d.get(i10);
            if (fVar.g().equals(sVar.getKey())) {
                fVar.b(sVar, e10.get(i10));
            }
        }
    }

    public List<f> d() {
        return this.f14318c;
    }

    public int e() {
        return this.f14316a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f14316a == gVar.f14316a && this.f14317b.equals(gVar.f14317b) && this.f14318c.equals(gVar.f14318c) && this.f14319d.equals(gVar.f14319d);
    }

    public Set<m6.l> f() {
        HashSet hashSet = new HashSet();
        for (f fVar : this.f14319d) {
            hashSet.add(fVar.g());
        }
        return hashSet;
    }

    public w5.q g() {
        return this.f14317b;
    }

    public List<f> h() {
        return this.f14319d;
    }

    public int hashCode() {
        return (((((this.f14316a * 31) + this.f14317b.hashCode()) * 31) + this.f14318c.hashCode()) * 31) + this.f14319d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f14316a + ", localWriteTime=" + this.f14317b + ", baseMutations=" + this.f14318c + ", mutations=" + this.f14319d + ')';
    }
}
