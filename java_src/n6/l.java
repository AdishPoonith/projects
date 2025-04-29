package n6;

import d7.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import m6.r;
import m6.s;
import m6.t;
/* loaded from: classes.dex */
public final class l extends f {

    /* renamed from: d  reason: collision with root package name */
    private final t f14328d;

    /* renamed from: e  reason: collision with root package name */
    private final d f14329e;

    public l(m6.l lVar, t tVar, d dVar, m mVar) {
        this(lVar, tVar, dVar, mVar, new ArrayList());
    }

    public l(m6.l lVar, t tVar, d dVar, m mVar, List<e> list) {
        super(lVar, mVar, list);
        this.f14328d = tVar;
        this.f14329e = dVar;
    }

    private List<r> o() {
        ArrayList arrayList = new ArrayList();
        for (e eVar : f()) {
            arrayList.add(eVar.a());
        }
        return arrayList;
    }

    private Map<r, b0> p() {
        HashMap hashMap = new HashMap();
        for (r rVar : this.f14329e.c()) {
            if (!rVar.o()) {
                hashMap.put(rVar, this.f14328d.j(rVar));
            }
        }
        return hashMap;
    }

    @Override // n6.f
    public d a(s sVar, d dVar, w5.q qVar) {
        n(sVar);
        if (h().e(sVar)) {
            Map<r, b0> l10 = l(qVar, sVar);
            Map<r, b0> p10 = p();
            t k10 = sVar.k();
            k10.r(p10);
            k10.r(l10);
            sVar.l(sVar.j(), sVar.k()).u();
            if (dVar == null) {
                return null;
            }
            HashSet hashSet = new HashSet(dVar.c());
            hashSet.addAll(this.f14329e.c());
            hashSet.addAll(o());
            return d.b(hashSet);
        }
        return dVar;
    }

    @Override // n6.f
    public void b(s sVar, i iVar) {
        n(sVar);
        if (!h().e(sVar)) {
            sVar.n(iVar.b());
            return;
        }
        Map<r, b0> m10 = m(sVar, iVar.a());
        t k10 = sVar.k();
        k10.r(p());
        k10.r(m10);
        sVar.l(iVar.b(), sVar.k()).t();
    }

    @Override // n6.f
    public d e() {
        return this.f14329e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return i(lVar) && this.f14328d.equals(lVar.f14328d) && f().equals(lVar.f());
    }

    public int hashCode() {
        return (j() * 31) + this.f14328d.hashCode();
    }

    public t q() {
        return this.f14328d;
    }

    public String toString() {
        return "PatchMutation{" + k() + ", mask=" + this.f14329e + ", value=" + this.f14328d + "}";
    }
}
