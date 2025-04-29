package q6;

import j6.l;
import j6.q;
import j6.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class w {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [j6.r] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [j6.l] */
    protected static j6.r a(j6.r rVar) {
        f(rVar);
        if (m(rVar)) {
            return rVar;
        }
        j6.l lVar = (j6.l) rVar;
        List<j6.r> b10 = lVar.b();
        if (b10.size() == 1) {
            return a(b10.get(0));
        }
        if (lVar.k()) {
            return lVar;
        }
        ArrayList<??> arrayList = new ArrayList();
        for (j6.r rVar2 : b10) {
            arrayList.add(a(rVar2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (?? r42 : arrayList) {
            if (!(r42 instanceof j6.q)) {
                if (r42 instanceof j6.l) {
                    r42 = (j6.l) r42;
                    if (r42.h().equals(lVar.h())) {
                        arrayList2.addAll(r42.b());
                    }
                }
            }
            arrayList2.add(r42);
        }
        return arrayList2.size() == 1 ? (j6.r) arrayList2.get(0) : new j6.l(arrayList2, lVar.h());
    }

    private static j6.r b(j6.l lVar, j6.l lVar2) {
        b.d((lVar.b().isEmpty() || lVar2.b().isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
        if (lVar.i() && lVar2.i()) {
            return lVar.n(lVar2.b());
        }
        j6.l lVar3 = lVar.j() ? lVar : lVar2;
        if (lVar.j()) {
            lVar = lVar2;
        }
        ArrayList arrayList = new ArrayList();
        for (j6.r rVar : lVar3.b()) {
            arrayList.add(e(rVar, lVar));
        }
        return new j6.l(arrayList, l.a.OR);
    }

    private static j6.r c(j6.q qVar, j6.l lVar) {
        if (lVar.i()) {
            return lVar.n(Collections.singletonList(qVar));
        }
        ArrayList arrayList = new ArrayList();
        for (j6.r rVar : lVar.b()) {
            arrayList.add(e(qVar, rVar));
        }
        return new j6.l(arrayList, l.a.OR);
    }

    private static j6.r d(j6.q qVar, j6.q qVar2) {
        return new j6.l(Arrays.asList(qVar, qVar2), l.a.AND);
    }

    protected static j6.r e(j6.r rVar, j6.r rVar2) {
        f(rVar);
        f(rVar2);
        boolean z10 = rVar instanceof j6.q;
        return a((z10 && (rVar2 instanceof j6.q)) ? d((j6.q) rVar, (j6.q) rVar2) : (z10 && (rVar2 instanceof j6.l)) ? c((j6.q) rVar, (j6.l) rVar2) : ((rVar instanceof j6.l) && (rVar2 instanceof j6.q)) ? c((j6.q) rVar2, (j6.l) rVar) : b((j6.l) rVar, (j6.l) rVar2));
    }

    private static void f(j6.r rVar) {
        b.d((rVar instanceof j6.q) || (rVar instanceof j6.l), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    protected static j6.r g(j6.r rVar) {
        f(rVar);
        if (rVar instanceof j6.q) {
            return rVar;
        }
        j6.l lVar = (j6.l) rVar;
        if (lVar.b().size() == 1) {
            return g(rVar.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        for (j6.r rVar2 : lVar.b()) {
            arrayList.add(g(rVar2));
        }
        j6.r a10 = a(new j6.l(arrayList, lVar.h()));
        if (k(a10)) {
            return a10;
        }
        b.d(a10 instanceof j6.l, "field filters are already in DNF form.", new Object[0]);
        j6.l lVar2 = (j6.l) a10;
        b.d(lVar2.i(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        b.d(lVar2.b().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        j6.r rVar3 = lVar2.b().get(0);
        for (int i10 = 1; i10 < lVar2.b().size(); i10++) {
            rVar3 = e(rVar3, lVar2.b().get(i10));
        }
        return rVar3;
    }

    protected static j6.r h(j6.r rVar) {
        f(rVar);
        ArrayList arrayList = new ArrayList();
        if (!(rVar instanceof j6.q)) {
            j6.l lVar = (j6.l) rVar;
            for (j6.r rVar2 : lVar.b()) {
                arrayList.add(h(rVar2));
            }
            return new j6.l(arrayList, lVar.h());
        } else if (rVar instanceof q0) {
            q0 q0Var = (q0) rVar;
            for (d7.b0 b0Var : q0Var.i().q0().o()) {
                arrayList.add(j6.q.f(q0Var.g(), q.b.EQUAL, b0Var));
            }
            return new j6.l(arrayList, l.a.OR);
        } else {
            return rVar;
        }
    }

    public static List<j6.r> i(j6.l lVar) {
        if (lVar.b().isEmpty()) {
            return Collections.emptyList();
        }
        j6.r g10 = g(h(lVar));
        b.d(k(g10), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        return (m(g10) || l(g10)) ? Collections.singletonList(g10) : g10.b();
    }

    private static boolean j(j6.r rVar) {
        if (rVar instanceof j6.l) {
            j6.l lVar = (j6.l) rVar;
            if (lVar.j()) {
                for (j6.r rVar2 : lVar.b()) {
                    if (!m(rVar2) && !l(rVar2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean k(j6.r rVar) {
        return m(rVar) || l(rVar) || j(rVar);
    }

    private static boolean l(j6.r rVar) {
        return (rVar instanceof j6.l) && ((j6.l) rVar).l();
    }

    private static boolean m(j6.r rVar) {
        return rVar instanceof j6.q;
    }
}
