package n6;

import d7.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m6.r;
import m6.s;
import m6.t;
/* loaded from: classes.dex */
public final class o extends f {

    /* renamed from: d  reason: collision with root package name */
    private final t f14334d;

    public o(m6.l lVar, t tVar, m mVar) {
        this(lVar, tVar, mVar, new ArrayList());
    }

    public o(m6.l lVar, t tVar, m mVar, List<e> list) {
        super(lVar, mVar, list);
        this.f14334d = tVar;
    }

    @Override // n6.f
    public d a(s sVar, d dVar, w5.q qVar) {
        n(sVar);
        if (h().e(sVar)) {
            Map<r, b0> l10 = l(qVar, sVar);
            t clone = this.f14334d.clone();
            clone.r(l10);
            sVar.l(sVar.j(), clone).u();
            return null;
        }
        return dVar;
    }

    @Override // n6.f
    public void b(s sVar, i iVar) {
        n(sVar);
        t clone = this.f14334d.clone();
        clone.r(m(sVar, iVar.a()));
        sVar.l(iVar.b(), clone).t();
    }

    @Override // n6.f
    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return i(oVar) && this.f14334d.equals(oVar.f14334d) && f().equals(oVar.f());
    }

    public int hashCode() {
        return (j() * 31) + this.f14334d.hashCode();
    }

    public t o() {
        return this.f14334d;
    }

    public String toString() {
        return "SetMutation{" + k() + ", value=" + this.f14334d + "}";
    }
}
