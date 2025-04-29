package l6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l6.z2;
import m6.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f3 implements k1 {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f13156a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13157b;

    /* renamed from: c  reason: collision with root package name */
    private l f13158c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f3(z2 z2Var, o oVar) {
        this.f13156a = z2Var;
        this.f13157b = oVar;
    }

    private m6.s k(byte[] bArr, int i10, int i11) {
        try {
            return this.f13157b.d(o6.a.p0(bArr)).v(new m6.w(new w5.q(i10, i11)));
        } catch (com.google.protobuf.e0 e10) {
            throw q6.b.a("MaybeDocument failed to parse: %s", e10);
        }
    }

    private Map<m6.l, m6.s> l(List<m6.u> list, q.a aVar, int i10, final q6.t<m6.s, Boolean> tVar) {
        w5.q g10 = aVar.o().g();
        m6.l l10 = aVar.l();
        StringBuilder z10 = q6.g0.z("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        z10.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        Object[] objArr = new Object[(list.size() * 9) + 1];
        int i11 = 0;
        for (m6.u uVar : list) {
            String c10 = f.c(uVar);
            int i12 = i11 + 1;
            objArr[i11] = c10;
            int i13 = i12 + 1;
            objArr[i12] = f.f(c10);
            int i14 = i13 + 1;
            objArr[i13] = Integer.valueOf(uVar.q() + 1);
            int i15 = i14 + 1;
            objArr[i14] = Long.valueOf(g10.l());
            int i16 = i15 + 1;
            objArr[i15] = Long.valueOf(g10.l());
            int i17 = i16 + 1;
            objArr[i16] = Integer.valueOf(g10.k());
            int i18 = i17 + 1;
            objArr[i17] = Long.valueOf(g10.l());
            int i19 = i18 + 1;
            objArr[i18] = Integer.valueOf(g10.k());
            objArr[i19] = f.c(l10.r());
            i11 = i19 + 1;
        }
        objArr[i11] = Integer.valueOf(i10);
        final q6.m mVar = new q6.m();
        final HashMap hashMap = new HashMap();
        this.f13156a.E(z10.toString()).b(objArr).e(new q6.n() { // from class: l6.d3
            @Override // q6.n
            public final void accept(Object obj) {
                f3.this.n(mVar, hashMap, tVar, (Cursor) obj);
            }
        });
        mVar.b();
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(q6.m mVar, Map map, Cursor cursor) {
        n(mVar, map, cursor, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean o(j6.b1 b1Var, Set set, m6.s sVar) {
        return Boolean.valueOf(b1Var.v(sVar) || set.contains(sVar.getKey()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(byte[] bArr, int i10, int i11, q6.t tVar, Map map) {
        m6.s k10 = k(bArr, i10, i11);
        if (tVar == null || ((Boolean) tVar.apply(k10)).booleanValue()) {
            synchronized (map) {
                map.put(k10.getKey(), k10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.concurrent.Executor] */
    /* renamed from: q */
    public void n(q6.m mVar, final Map<m6.l, m6.s> map, Cursor cursor, final q6.t<m6.s, Boolean> tVar) {
        final byte[] blob = cursor.getBlob(0);
        final int i10 = cursor.getInt(1);
        final int i11 = cursor.getInt(2);
        q6.m mVar2 = mVar;
        if (cursor.isLast()) {
            mVar2 = q6.p.f16300b;
        }
        mVar2.execute(new Runnable() { // from class: l6.b3
            @Override // java.lang.Runnable
            public final void run() {
                f3.this.p(blob, i10, i11, tVar, map);
            }
        });
    }

    @Override // l6.k1
    public Map<m6.l, m6.s> a(final j6.b1 b1Var, q.a aVar, final Set<m6.l> set) {
        return l(Collections.singletonList(b1Var.n()), aVar, Integer.MAX_VALUE, new q6.t() { // from class: l6.e3
            @Override // q6.t
            public final Object apply(Object obj) {
                Boolean o10;
                o10 = f3.o(j6.b1.this, set, (m6.s) obj);
                return o10;
            }
        });
    }

    @Override // l6.k1
    public void b(l lVar) {
        this.f13158c = lVar;
    }

    @Override // l6.k1
    public m6.s c(m6.l lVar) {
        return f(Collections.singletonList(lVar)).get(lVar);
    }

    @Override // l6.k1
    public void d(m6.s sVar, m6.w wVar) {
        q6.b.d(!wVar.equals(m6.w.f13842k), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        m6.l key = sVar.getKey();
        w5.q g10 = wVar.g();
        this.f13156a.v("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", f.c(key.r()), Integer.valueOf(key.r().q()), Long.valueOf(g10.l()), Integer.valueOf(g10.k()), this.f13157b.m(sVar).f());
        this.f13158c.g(sVar.getKey().p());
    }

    @Override // l6.k1
    public Map<m6.l, m6.s> e(String str, q.a aVar, int i10) {
        List<m6.u> a10 = this.f13158c.a(str);
        ArrayList arrayList = new ArrayList(a10.size());
        for (m6.u uVar : a10) {
            arrayList.add(uVar.b(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return l(arrayList, aVar, i10, null);
        }
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int i12 = i11 + 100;
            hashMap.putAll(l(arrayList.subList(i11, Math.min(arrayList.size(), i12)), aVar, i10, null));
            i11 = i12;
        }
        return q6.g0.u(hashMap, i10, q.a.f13817k);
    }

    @Override // l6.k1
    public Map<m6.l, m6.s> f(Iterable<m6.l> iterable) {
        final HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (m6.l lVar : iterable) {
            arrayList.add(f.c(lVar.r()));
            hashMap.put(lVar, m6.s.q(lVar));
        }
        z2.b bVar = new z2.b(this.f13156a, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        final q6.m mVar = new q6.m();
        while (bVar.d()) {
            bVar.e().e(new q6.n() { // from class: l6.c3
                @Override // q6.n
                public final void accept(Object obj) {
                    f3.this.m(mVar, hashMap, (Cursor) obj);
                }
            });
        }
        mVar.b();
        return hashMap;
    }

    @Override // l6.k1
    public void removeAll(Collection<m6.l> collection) {
        if (collection.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        d6.c<m6.l, m6.i> a10 = m6.j.a();
        for (m6.l lVar : collection) {
            arrayList.add(f.c(lVar.r()));
            a10 = a10.p(lVar, m6.s.r(lVar, m6.w.f13842k));
        }
        z2.b bVar = new z2.b(this.f13156a, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
        while (bVar.d()) {
            bVar.a();
        }
        this.f13158c.i(a10);
    }
}
