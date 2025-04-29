package n6;

import m6.s;
/* loaded from: classes.dex */
public final class q extends f {
    public q(m6.l lVar, m mVar) {
        super(lVar, mVar);
    }

    @Override // n6.f
    public d a(s sVar, d dVar, w5.q qVar) {
        throw q6.b.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // n6.f
    public void b(s sVar, i iVar) {
        throw q6.b.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // n6.f
    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return i((q) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "VerifyMutation{" + k() + "}";
    }
}
