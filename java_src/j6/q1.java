package j6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public class q1 {

    /* renamed from: a */
    private final u1 f12315a;

    /* renamed from: b */
    private final Set<m6.r> f12316b = new HashSet();

    /* renamed from: c */
    private final ArrayList<n6.e> f12317c = new ArrayList<>();

    public q1(u1 u1Var) {
        this.f12315a = u1Var;
    }

    public void b(m6.r rVar) {
        this.f12316b.add(rVar);
    }

    public void c(m6.r rVar, n6.p pVar) {
        this.f12317c.add(new n6.e(rVar, pVar));
    }

    public boolean d(m6.r rVar) {
        for (m6.r rVar2 : this.f12316b) {
            if (rVar.p(rVar2)) {
                return true;
            }
        }
        Iterator<n6.e> it = this.f12317c.iterator();
        while (it.hasNext()) {
            if (rVar.p(it.next().a())) {
                return true;
            }
        }
        return false;
    }

    public List<n6.e> e() {
        return this.f12317c;
    }

    public r1 f() {
        return new r1(this, m6.r.f13823l, false, null);
    }

    public s1 g(m6.t tVar) {
        return new s1(tVar, n6.d.b(this.f12316b), Collections.unmodifiableList(this.f12317c));
    }

    public s1 h(m6.t tVar, n6.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<n6.e> it = this.f12317c.iterator();
        while (it.hasNext()) {
            n6.e next = it.next();
            if (dVar.a(next.a())) {
                arrayList.add(next);
            }
        }
        return new s1(tVar, dVar, Collections.unmodifiableList(arrayList));
    }

    public s1 i(m6.t tVar) {
        return new s1(tVar, null, Collections.unmodifiableList(this.f12317c));
    }

    public t1 j(m6.t tVar) {
        return new t1(tVar, n6.d.b(this.f12316b), Collections.unmodifiableList(this.f12317c));
    }
}
