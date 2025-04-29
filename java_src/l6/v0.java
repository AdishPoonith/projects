package l6;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l6.o0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v0 implements i1, k0 {

    /* renamed from: a  reason: collision with root package name */
    private final y0 f13353a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13354b;

    /* renamed from: d  reason: collision with root package name */
    private j1 f13356d;

    /* renamed from: e  reason: collision with root package name */
    private final o0 f13357e;

    /* renamed from: f  reason: collision with root package name */
    private final j6.v0 f13358f;

    /* renamed from: c  reason: collision with root package name */
    private final Map<m6.l, Long> f13355c = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private long f13359g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(y0 y0Var, o0.b bVar, o oVar) {
        this.f13353a = y0Var;
        this.f13354b = oVar;
        this.f13358f = new j6.v0(y0Var.h().n());
        this.f13357e = new o0(this, bVar);
    }

    private boolean r(m6.l lVar, long j10) {
        if (t(lVar) || this.f13356d.c(lVar) || this.f13353a.h().k(lVar)) {
            return true;
        }
        Long l10 = this.f13355c.get(lVar);
        return l10 != null && l10.longValue() > j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(long[] jArr, Long l10) {
        jArr[0] = jArr[0] + 1;
    }

    private boolean t(m6.l lVar) {
        for (w0 w0Var : this.f13353a.q()) {
            if (w0Var.l(lVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // l6.k0
    public long a() {
        long o10 = this.f13353a.h().o();
        final long[] jArr = new long[1];
        b(new q6.n() { // from class: l6.u0
            @Override // q6.n
            public final void accept(Object obj) {
                v0.s(jArr, (Long) obj);
            }
        });
        return o10 + jArr[0];
    }

    @Override // l6.k0
    public void b(q6.n<Long> nVar) {
        for (Map.Entry<m6.l, Long> entry : this.f13355c.entrySet()) {
            if (!r(entry.getKey(), entry.getValue().longValue())) {
                nVar.accept(entry.getValue());
            }
        }
    }

    @Override // l6.k0
    public int c(long j10, SparseArray<?> sparseArray) {
        return this.f13353a.h().p(j10, sparseArray);
    }

    @Override // l6.k0
    public int d(long j10) {
        z0 g10 = this.f13353a.g();
        ArrayList arrayList = new ArrayList();
        for (m6.i iVar : g10.i()) {
            m6.l key = iVar.getKey();
            if (!r(key, j10)) {
                arrayList.add(key);
                this.f13355c.remove(key);
            }
        }
        g10.removeAll(arrayList);
        return arrayList.size();
    }

    @Override // l6.i1
    public void e(m6.l lVar) {
        this.f13355c.put(lVar, Long.valueOf(p()));
    }

    @Override // l6.i1
    public void f(h4 h4Var) {
        this.f13353a.h().f(h4Var.j(p()));
    }

    @Override // l6.i1
    public void g() {
        q6.b.d(this.f13359g != -1, "Committing a transaction without having started one", new Object[0]);
        this.f13359g = -1L;
    }

    @Override // l6.k0
    public void h(q6.n<h4> nVar) {
        this.f13353a.h().l(nVar);
    }

    @Override // l6.k0
    public o0 i() {
        return this.f13357e;
    }

    @Override // l6.i1
    public void j() {
        q6.b.d(this.f13359g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f13359g = this.f13358f.a();
    }

    @Override // l6.i1
    public void k(m6.l lVar) {
        this.f13355c.put(lVar, Long.valueOf(p()));
    }

    @Override // l6.k0
    public long l() {
        long m10 = this.f13353a.h().m(this.f13354b) + 0 + this.f13353a.g().h(this.f13354b);
        for (w0 w0Var : this.f13353a.q()) {
            m10 += w0Var.m(this.f13354b);
        }
        return m10;
    }

    @Override // l6.i1
    public void m(m6.l lVar) {
        this.f13355c.put(lVar, Long.valueOf(p()));
    }

    @Override // l6.i1
    public void n(m6.l lVar) {
        this.f13355c.put(lVar, Long.valueOf(p()));
    }

    @Override // l6.i1
    public void o(j1 j1Var) {
        this.f13356d = j1Var;
    }

    @Override // l6.i1
    public long p() {
        q6.b.d(this.f13359g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f13359g;
    }
}
