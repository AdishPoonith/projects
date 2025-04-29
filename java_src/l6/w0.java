package l6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w0 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    private final List<n6.g> f13365a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private d6.e<e> f13366b = new d6.e<>(Collections.emptyList(), e.f13129c);

    /* renamed from: c  reason: collision with root package name */
    private int f13367c = 1;

    /* renamed from: d  reason: collision with root package name */
    private com.google.protobuf.i f13368d = p6.z0.f15748v;

    /* renamed from: e  reason: collision with root package name */
    private final y0 f13369e;

    /* renamed from: f  reason: collision with root package name */
    private final t0 f13370f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(y0 y0Var, h6.j jVar) {
        this.f13369e = y0Var;
        this.f13370f = y0Var.c(jVar);
    }

    private int n(int i10) {
        if (this.f13365a.isEmpty()) {
            return 0;
        }
        return i10 - this.f13365a.get(0).e();
    }

    private int o(int i10, String str) {
        int n10 = n(i10);
        q6.b.d(n10 >= 0 && n10 < this.f13365a.size(), "Batches must exist to be %s", str);
        return n10;
    }

    private List<n6.g> q(d6.e<Integer> eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = eVar.iterator();
        while (it.hasNext()) {
            n6.g g10 = g(it.next().intValue());
            if (g10 != null) {
                arrayList.add(g10);
            }
        }
        return arrayList;
    }

    @Override // l6.b1
    public void a() {
        if (this.f13365a.isEmpty()) {
            q6.b.d(this.f13366b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // l6.b1
    public n6.g b(int i10) {
        int n10 = n(i10 + 1);
        if (n10 < 0) {
            n10 = 0;
        }
        if (this.f13365a.size() > n10) {
            return this.f13365a.get(n10);
        }
        return null;
    }

    @Override // l6.b1
    public int c() {
        if (this.f13365a.isEmpty()) {
            return -1;
        }
        return this.f13367c - 1;
    }

    @Override // l6.b1
    public void d(n6.g gVar) {
        q6.b.d(o(gVar.e(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f13365a.remove(0);
        d6.e<e> eVar = this.f13366b;
        for (n6.f fVar : gVar.h()) {
            m6.l g10 = fVar.g();
            this.f13369e.f().m(g10);
            eVar = eVar.m(new e(g10, gVar.e()));
        }
        this.f13366b = eVar;
    }

    @Override // l6.b1
    public List<n6.g> e(Iterable<m6.l> iterable) {
        d6.e<Integer> eVar = new d6.e<>(Collections.emptyList(), q6.g0.g());
        for (m6.l lVar : iterable) {
            Iterator<e> l10 = this.f13366b.l(new e(lVar, 0));
            while (l10.hasNext()) {
                e next = l10.next();
                if (!lVar.equals(next.d())) {
                    break;
                }
                eVar = eVar.k(Integer.valueOf(next.c()));
            }
        }
        return q(eVar);
    }

    @Override // l6.b1
    public void f(n6.g gVar, com.google.protobuf.i iVar) {
        int e10 = gVar.e();
        int o10 = o(e10, "acknowledged");
        q6.b.d(o10 == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        n6.g gVar2 = this.f13365a.get(o10);
        q6.b.d(e10 == gVar2.e(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(e10), Integer.valueOf(gVar2.e()));
        this.f13368d = (com.google.protobuf.i) q6.x.b(iVar);
    }

    @Override // l6.b1
    public n6.g g(int i10) {
        int n10 = n(i10);
        if (n10 < 0 || n10 >= this.f13365a.size()) {
            return null;
        }
        n6.g gVar = this.f13365a.get(n10);
        q6.b.d(gVar.e() == i10, "If found batch must match", new Object[0]);
        return gVar;
    }

    @Override // l6.b1
    public n6.g h(w5.q qVar, List<n6.f> list, List<n6.f> list2) {
        q6.b.d(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i10 = this.f13367c;
        this.f13367c = i10 + 1;
        int size = this.f13365a.size();
        if (size > 0) {
            q6.b.d(this.f13365a.get(size - 1).e() < i10, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        n6.g gVar = new n6.g(i10, qVar, list, list2);
        this.f13365a.add(gVar);
        for (n6.f fVar : list2) {
            this.f13366b = this.f13366b.k(new e(fVar.g(), i10));
            this.f13370f.g(fVar.g().p());
        }
        return gVar;
    }

    @Override // l6.b1
    public com.google.protobuf.i i() {
        return this.f13368d;
    }

    @Override // l6.b1
    public void j(com.google.protobuf.i iVar) {
        this.f13368d = (com.google.protobuf.i) q6.x.b(iVar);
    }

    @Override // l6.b1
    public List<n6.g> k() {
        return Collections.unmodifiableList(this.f13365a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(m6.l lVar) {
        Iterator<e> l10 = this.f13366b.l(new e(lVar, 0));
        if (l10.hasNext()) {
            return l10.next().d().equals(lVar);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long m(o oVar) {
        long j10 = 0;
        for (n6.g gVar : this.f13365a) {
            j10 += oVar.o(gVar).a();
        }
        return j10;
    }

    public boolean p() {
        return this.f13365a.isEmpty();
    }

    @Override // l6.b1
    public void start() {
        if (p()) {
            this.f13367c = 1;
        }
    }
}
