package m6;

import j6.a1;
import j6.g1;
import j6.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m6.q;
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final String f13844a;

    /* renamed from: b  reason: collision with root package name */
    private j6.q f13845b;

    /* renamed from: c  reason: collision with root package name */
    private final List<j6.q> f13846c;

    /* renamed from: d  reason: collision with root package name */
    private final List<a1> f13847d;

    public x(g1 g1Var) {
        this.f13844a = g1Var.d() != null ? g1Var.d() : g1Var.n().l();
        this.f13847d = g1Var.m();
        this.f13845b = null;
        this.f13846c = new ArrayList();
        Iterator<j6.r> it = g1Var.h().iterator();
        while (it.hasNext()) {
            j6.q qVar = (j6.q) it.next();
            if (qVar.j()) {
                j6.q qVar2 = this.f13845b;
                q6.b.d(qVar2 == null || qVar2.g().equals(qVar.g()), "Only a single inequality is supported", new Object[0]);
                this.f13845b = qVar;
            } else {
                this.f13846c.add(qVar);
            }
        }
    }

    private boolean a(q.c cVar) {
        for (j6.q qVar : this.f13846c) {
            if (b(qVar, cVar)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(j6.q qVar, q.c cVar) {
        if (qVar == null || !qVar.g().equals(cVar.h())) {
            return false;
        }
        return cVar.i().equals(q.c.a.CONTAINS) == (qVar.h().equals(q.b.ARRAY_CONTAINS) || qVar.h().equals(q.b.ARRAY_CONTAINS_ANY));
    }

    private boolean c(a1 a1Var, q.c cVar) {
        if (a1Var.c().equals(cVar.h())) {
            return (cVar.i().equals(q.c.a.ASCENDING) && a1Var.b().equals(a1.a.ASCENDING)) || (cVar.i().equals(q.c.a.DESCENDING) && a1Var.b().equals(a1.a.DESCENDING));
        }
        return false;
    }

    public boolean d(q qVar) {
        q6.b.d(qVar.d().equals(this.f13844a), "Collection IDs do not match", new Object[0]);
        q.c c10 = qVar.c();
        if (c10 == null || a(c10)) {
            Iterator<a1> it = this.f13847d.iterator();
            List<q.c> e10 = qVar.e();
            int i10 = 0;
            while (i10 < e10.size() && a(e10.get(i10))) {
                i10++;
            }
            if (i10 == e10.size()) {
                return true;
            }
            if (this.f13845b != null) {
                q.c cVar = e10.get(i10);
                if (!b(this.f13845b, cVar) || !c(it.next(), cVar)) {
                    return false;
                }
                i10++;
            }
            while (i10 < e10.size()) {
                q.c cVar2 = e10.get(i10);
                if (!it.hasNext() || !c(it.next(), cVar2)) {
                    return false;
                }
                i10++;
            }
            return true;
        }
        return false;
    }
}
