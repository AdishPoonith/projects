package l6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m6.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z0 implements k1 {

    /* renamed from: a  reason: collision with root package name */
    private d6.c<m6.l, m6.i> f13396a = m6.j.a();

    /* renamed from: b  reason: collision with root package name */
    private l f13397b;

    /* loaded from: classes.dex */
    private class b implements Iterable<m6.i> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Iterator<m6.i> {

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ Iterator f13399j;

            a(Iterator it) {
                this.f13399j = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public m6.i next() {
                return (m6.i) ((Map.Entry) this.f13399j.next()).getValue();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f13399j.hasNext();
            }
        }

        private b() {
        }

        @Override // java.lang.Iterable
        public Iterator<m6.i> iterator() {
            return new a(z0.this.f13396a.iterator());
        }
    }

    @Override // l6.k1
    public Map<m6.l, m6.s> a(j6.b1 b1Var, q.a aVar, Set<m6.l> set) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<m6.l, m6.i>> q10 = this.f13396a.q(m6.l.l(b1Var.n().b("")));
        while (q10.hasNext()) {
            Map.Entry<m6.l, m6.i> next = q10.next();
            m6.i value = next.getValue();
            m6.l key = next.getKey();
            if (!b1Var.n().p(key.r())) {
                break;
            } else if (key.r().q() <= b1Var.n().q() + 1 && q.a.k(value).compareTo(aVar) > 0 && (set.contains(value.getKey()) || b1Var.v(value))) {
                hashMap.put(value.getKey(), value.a());
            }
        }
        return hashMap;
    }

    @Override // l6.k1
    public void b(l lVar) {
        this.f13397b = lVar;
    }

    @Override // l6.k1
    public m6.s c(m6.l lVar) {
        m6.i e10 = this.f13396a.e(lVar);
        return e10 != null ? e10.a() : m6.s.q(lVar);
    }

    @Override // l6.k1
    public void d(m6.s sVar, m6.w wVar) {
        q6.b.d(this.f13397b != null, "setIndexManager() not called", new Object[0]);
        q6.b.d(!wVar.equals(m6.w.f13842k), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f13396a = this.f13396a.p(sVar.getKey(), sVar.a().v(wVar));
        this.f13397b.g(sVar.getKey().p());
    }

    @Override // l6.k1
    public Map<m6.l, m6.s> e(String str, q.a aVar, int i10) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // l6.k1
    public Map<m6.l, m6.s> f(Iterable<m6.l> iterable) {
        HashMap hashMap = new HashMap();
        for (m6.l lVar : iterable) {
            hashMap.put(lVar, c(lVar));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h(o oVar) {
        Iterator<m6.i> it = new b().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += oVar.m(it.next()).a();
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterable<m6.i> i() {
        return new b();
    }

    @Override // l6.k1
    public void removeAll(Collection<m6.l> collection) {
        q6.b.d(this.f13397b != null, "setIndexManager() not called", new Object[0]);
        d6.c<m6.l, m6.i> a10 = m6.j.a();
        for (m6.l lVar : collection) {
            this.f13396a = this.f13396a.r(lVar);
            a10 = a10.p(lVar, m6.s.r(lVar, m6.w.f13842k));
        }
        this.f13397b.i(a10);
    }
}
