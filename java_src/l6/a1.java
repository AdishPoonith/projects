package l6;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a1 implements g4 {

    /* renamed from: c  reason: collision with root package name */
    private int f13071c;

    /* renamed from: f  reason: collision with root package name */
    private final y0 f13074f;

    /* renamed from: a  reason: collision with root package name */
    private final Map<j6.g1, h4> f13069a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final j1 f13070b = new j1();

    /* renamed from: d  reason: collision with root package name */
    private m6.w f13072d = m6.w.f13842k;

    /* renamed from: e  reason: collision with root package name */
    private long f13073e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(y0 y0Var) {
        this.f13074f = y0Var;
    }

    @Override // l6.g4
    public d6.e<m6.l> a(int i10) {
        return this.f13070b.d(i10);
    }

    @Override // l6.g4
    public m6.w b() {
        return this.f13072d;
    }

    @Override // l6.g4
    public void c(int i10) {
        this.f13070b.h(i10);
    }

    @Override // l6.g4
    public void d(h4 h4Var) {
        this.f13069a.put(h4Var.f(), h4Var);
        int g10 = h4Var.g();
        if (g10 > this.f13071c) {
            this.f13071c = g10;
        }
        if (h4Var.d() > this.f13073e) {
            this.f13073e = h4Var.d();
        }
    }

    @Override // l6.g4
    public void e(m6.w wVar) {
        this.f13072d = wVar;
    }

    @Override // l6.g4
    public void f(h4 h4Var) {
        d(h4Var);
    }

    @Override // l6.g4
    public void g(d6.e<m6.l> eVar, int i10) {
        this.f13070b.b(eVar, i10);
        i1 f10 = this.f13074f.f();
        Iterator<m6.l> it = eVar.iterator();
        while (it.hasNext()) {
            f10.k(it.next());
        }
    }

    @Override // l6.g4
    public h4 h(j6.g1 g1Var) {
        return this.f13069a.get(g1Var);
    }

    @Override // l6.g4
    public void i(d6.e<m6.l> eVar, int i10) {
        this.f13070b.g(eVar, i10);
        i1 f10 = this.f13074f.f();
        Iterator<m6.l> it = eVar.iterator();
        while (it.hasNext()) {
            f10.n(it.next());
        }
    }

    @Override // l6.g4
    public int j() {
        return this.f13071c;
    }

    public boolean k(m6.l lVar) {
        return this.f13070b.c(lVar);
    }

    public void l(q6.n<h4> nVar) {
        for (h4 h4Var : this.f13069a.values()) {
            nVar.accept(h4Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long m(o oVar) {
        long j10 = 0;
        for (Map.Entry<j6.g1, h4> entry : this.f13069a.entrySet()) {
            j10 += oVar.q(entry.getValue()).a();
        }
        return j10;
    }

    public long n() {
        return this.f13073e;
    }

    public long o() {
        return this.f13069a.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p(long j10, SparseArray<?> sparseArray) {
        Iterator<Map.Entry<j6.g1, h4>> it = this.f13069a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry<j6.g1, h4> next = it.next();
            int g10 = next.getValue().g();
            if (next.getValue().d() <= j10 && sparseArray.get(g10) == null) {
                it.remove();
                c(g10);
                i10++;
            }
        }
        return i10;
    }

    public void q(h4 h4Var) {
        this.f13069a.remove(h4Var.f());
        this.f13070b.h(h4Var.g());
    }
}
