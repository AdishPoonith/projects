package n6;

import m6.s;
/* loaded from: classes.dex */
public final class c extends f {
    public c(m6.l lVar, m mVar) {
        super(lVar, mVar);
    }

    @Override // n6.f
    public d a(s sVar, d dVar, w5.q qVar) {
        n(sVar);
        if (h().e(sVar)) {
            sVar.m(sVar.j()).u();
            return null;
        }
        return dVar;
    }

    @Override // n6.f
    public void b(s sVar, i iVar) {
        n(sVar);
        q6.b.d(iVar.a().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        sVar.m(iVar.b()).t();
    }

    @Override // n6.f
    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return i((c) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "DeleteMutation{" + k() + "}";
    }
}
