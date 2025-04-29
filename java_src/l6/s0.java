package l6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s0 implements i1 {

    /* renamed from: a  reason: collision with root package name */
    private j1 f13316a;

    /* renamed from: b  reason: collision with root package name */
    private final y0 f13317b;

    /* renamed from: c  reason: collision with root package name */
    private Set<m6.l> f13318c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(y0 y0Var) {
        this.f13317b = y0Var;
    }

    private boolean a(m6.l lVar) {
        if (this.f13317b.h().k(lVar) || b(lVar)) {
            return true;
        }
        j1 j1Var = this.f13316a;
        return j1Var != null && j1Var.c(lVar);
    }

    private boolean b(m6.l lVar) {
        for (w0 w0Var : this.f13317b.q()) {
            if (w0Var.l(lVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // l6.i1
    public void e(m6.l lVar) {
        if (a(lVar)) {
            this.f13318c.remove(lVar);
        } else {
            this.f13318c.add(lVar);
        }
    }

    @Override // l6.i1
    public void f(h4 h4Var) {
        a1 h10 = this.f13317b.h();
        Iterator<m6.l> it = h10.a(h4Var.g()).iterator();
        while (it.hasNext()) {
            this.f13318c.add(it.next());
        }
        h10.q(h4Var);
    }

    @Override // l6.i1
    public void g() {
        z0 g10 = this.f13317b.g();
        ArrayList arrayList = new ArrayList();
        for (m6.l lVar : this.f13318c) {
            if (!a(lVar)) {
                arrayList.add(lVar);
            }
        }
        g10.removeAll(arrayList);
        this.f13318c = null;
    }

    @Override // l6.i1
    public void j() {
        this.f13318c = new HashSet();
    }

    @Override // l6.i1
    public void k(m6.l lVar) {
        this.f13318c.remove(lVar);
    }

    @Override // l6.i1
    public void m(m6.l lVar) {
        this.f13318c.add(lVar);
    }

    @Override // l6.i1
    public void n(m6.l lVar) {
        this.f13318c.add(lVar);
    }

    @Override // l6.i1
    public void o(j1 j1Var) {
        this.f13316a = j1Var;
    }

    @Override // l6.i1
    public long p() {
        return -1L;
    }
}
