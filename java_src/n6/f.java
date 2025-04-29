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
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final m6.l f14313a;

    /* renamed from: b  reason: collision with root package name */
    private final m f14314b;

    /* renamed from: c  reason: collision with root package name */
    private final List<e> f14315c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(m6.l lVar, m mVar) {
        this(lVar, mVar, new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(m6.l lVar, m mVar, List<e> list) {
        this.f14313a = lVar;
        this.f14314b = mVar;
        this.f14315c = list;
    }

    public static f c(s sVar, d dVar) {
        if (sVar.e()) {
            if (dVar == null || !dVar.c().isEmpty()) {
                if (dVar == null) {
                    return sVar.h() ? new c(sVar.getKey(), m.f14330c) : new o(sVar.getKey(), sVar.k(), m.f14330c);
                }
                t k10 = sVar.k();
                t tVar = new t();
                HashSet hashSet = new HashSet();
                for (r rVar : dVar.c()) {
                    if (!hashSet.contains(rVar)) {
                        if (k10.j(rVar) == null && rVar.q() > 1) {
                            rVar = rVar.s();
                        }
                        tVar.p(rVar, k10.j(rVar));
                        hashSet.add(rVar);
                    }
                }
                return new l(sVar.getKey(), tVar, d.b(hashSet), m.f14330c);
            }
            return null;
        }
        return null;
    }

    public abstract d a(s sVar, d dVar, w5.q qVar);

    public abstract void b(s sVar, i iVar);

    public t d(m6.i iVar) {
        t tVar = null;
        for (e eVar : this.f14315c) {
            b0 a10 = eVar.b().a(iVar.b(eVar.a()));
            if (a10 != null) {
                if (tVar == null) {
                    tVar = new t();
                }
                tVar.p(eVar.a(), a10);
            }
        }
        return tVar;
    }

    public abstract d e();

    public List<e> f() {
        return this.f14315c;
    }

    public m6.l g() {
        return this.f14313a;
    }

    public m h() {
        return this.f14314b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(f fVar) {
        return this.f14313a.equals(fVar.f14313a) && this.f14314b.equals(fVar.f14314b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return (g().hashCode() * 31) + this.f14314b.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        return "key=" + this.f14313a + ", precondition=" + this.f14314b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<r, b0> l(w5.q qVar, s sVar) {
        HashMap hashMap = new HashMap(this.f14315c.size());
        for (e eVar : this.f14315c) {
            hashMap.put(eVar.a(), eVar.b().b(sVar.b(eVar.a()), qVar));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<r, b0> m(s sVar, List<b0> list) {
        HashMap hashMap = new HashMap(this.f14315c.size());
        q6.b.d(this.f14315c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f14315c.size()));
        for (int i10 = 0; i10 < list.size(); i10++) {
            e eVar = this.f14315c.get(i10);
            hashMap.put(eVar.a(), eVar.b().c(sVar.b(eVar.a()), list.get(i10)));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(s sVar) {
        q6.b.d(sVar.getKey().equals(g()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }
}
