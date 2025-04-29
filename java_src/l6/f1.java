package l6;

import j6.b1;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l6.l;
import m6.q;
/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    private n f13152a;

    /* renamed from: b  reason: collision with root package name */
    private l f13153b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13154c;

    private d6.c<m6.l, m6.i> a(Iterable<m6.i> iterable, j6.b1 b1Var, q.a aVar) {
        d6.c<m6.l, m6.i> h10 = this.f13152a.h(b1Var, aVar);
        for (m6.i iVar : iterable) {
            h10 = h10.p(iVar.getKey(), iVar);
        }
        return h10;
    }

    private d6.e<m6.i> b(j6.b1 b1Var, d6.c<m6.l, m6.i> cVar) {
        d6.e<m6.i> eVar = new d6.e<>(Collections.emptyList(), b1Var.c());
        Iterator<Map.Entry<m6.l, m6.i>> it = cVar.iterator();
        while (it.hasNext()) {
            m6.i value = it.next().getValue();
            if (b1Var.v(value)) {
                eVar = eVar.k(value);
            }
        }
        return eVar;
    }

    private d6.c<m6.l, m6.i> c(j6.b1 b1Var) {
        if (q6.v.c()) {
            q6.v.a("QueryEngine", "Using full collection scan to execute query: %s", b1Var.toString());
        }
        return this.f13152a.h(b1Var, q.a.f13816j);
    }

    private boolean f(j6.b1 b1Var, int i10, d6.e<m6.i> eVar, m6.w wVar) {
        if (b1Var.p()) {
            if (i10 != eVar.size()) {
                return true;
            }
            m6.i b10 = b1Var.l() == b1.a.LIMIT_TO_FIRST ? eVar.b() : eVar.e();
            if (b10 == null) {
                return false;
            }
            return b10.f() || b10.j().compareTo(wVar) > 0;
        }
        return false;
    }

    private d6.c<m6.l, m6.i> g(j6.b1 b1Var) {
        if (b1Var.w()) {
            return null;
        }
        j6.g1 D = b1Var.D();
        l.a j10 = this.f13153b.j(D);
        if (j10.equals(l.a.NONE)) {
            return null;
        }
        if (!b1Var.p() || !j10.equals(l.a.PARTIAL)) {
            List<m6.l> f10 = this.f13153b.f(D);
            q6.b.d(f10 != null, "index manager must return results for partial and full indexes.", new Object[0]);
            d6.c<m6.l, m6.i> d10 = this.f13152a.d(f10);
            q.a c10 = this.f13153b.c(D);
            d6.e<m6.i> b10 = b(b1Var, d10);
            if (!f(b1Var, f10.size(), b10, c10.o())) {
                return a(b10, b1Var, c10);
            }
        }
        return g(b1Var.t(-1L));
    }

    private d6.c<m6.l, m6.i> h(j6.b1 b1Var, d6.e<m6.l> eVar, m6.w wVar) {
        if (b1Var.w() || wVar.equals(m6.w.f13842k)) {
            return null;
        }
        d6.e<m6.i> b10 = b(b1Var, this.f13152a.d(eVar));
        if (f(b1Var, eVar.size(), b10, wVar)) {
            return null;
        }
        if (q6.v.c()) {
            q6.v.a("QueryEngine", "Re-using previous result from %s to execute query: %s", wVar.toString(), b1Var.toString());
        }
        return a(b10, b1Var, q.a.i(wVar, -1));
    }

    public d6.c<m6.l, m6.i> d(j6.b1 b1Var, m6.w wVar, d6.e<m6.l> eVar) {
        q6.b.d(this.f13154c, "initialize() not called", new Object[0]);
        d6.c<m6.l, m6.i> g10 = g(b1Var);
        if (g10 != null) {
            return g10;
        }
        d6.c<m6.l, m6.i> h10 = h(b1Var, eVar, wVar);
        return h10 != null ? h10 : c(b1Var);
    }

    public void e(n nVar, l lVar) {
        this.f13152a = nVar;
        this.f13153b = lVar;
        this.f13154c = true;
    }
}
