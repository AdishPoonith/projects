package l6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l6.l;
import m6.q;
/* loaded from: classes.dex */
class t0 implements l {

    /* renamed from: a  reason: collision with root package name */
    private final a f13336a = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, HashSet<m6.u>> f13337a = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a(m6.u uVar) {
            q6.b.d(uVar.q() % 2 == 1, "Expected a collection path.", new Object[0]);
            String l10 = uVar.l();
            m6.u s10 = uVar.s();
            HashSet<m6.u> hashSet = this.f13337a.get(l10);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f13337a.put(l10, hashSet);
            }
            return hashSet.add(s10);
        }

        List<m6.u> b(String str) {
            HashSet<m6.u> hashSet = this.f13337a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    @Override // l6.l
    public List<m6.u> a(String str) {
        return this.f13336a.b(str);
    }

    @Override // l6.l
    public void b(m6.q qVar) {
    }

    @Override // l6.l
    public q.a c(j6.g1 g1Var) {
        return q.a.f13816j;
    }

    @Override // l6.l
    public void d(m6.q qVar) {
    }

    @Override // l6.l
    public q.a e(String str) {
        return q.a.f13816j;
    }

    @Override // l6.l
    public List<m6.l> f(j6.g1 g1Var) {
        return null;
    }

    @Override // l6.l
    public void g(m6.u uVar) {
        this.f13336a.a(uVar);
    }

    @Override // l6.l
    public void h(String str, q.a aVar) {
    }

    @Override // l6.l
    public void i(d6.c<m6.l, m6.i> cVar) {
    }

    @Override // l6.l
    public l.a j(j6.g1 g1Var) {
        return l.a.NONE;
    }

    @Override // l6.l
    public Collection<m6.q> k() {
        return Collections.emptyList();
    }

    @Override // l6.l
    public String l() {
        return null;
    }

    @Override // l6.l
    public void start() {
    }
}
