package l6;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import j6.a1;
import j6.l;
import j6.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import l6.l;
import l6.t0;
import l6.z2;
import m6.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d2 implements l {

    /* renamed from: k  reason: collision with root package name */
    private static final String f13111k = "d2";

    /* renamed from: l  reason: collision with root package name */
    private static final byte[] f13112l = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final z2 f13113a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13114b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13115c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<j6.g1, List<j6.g1>> f13116d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final t0.a f13117e = new t0.a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<Integer, m6.q>> f13118f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Queue<m6.q> f13119g = new PriorityQueue(10, new Comparator() { // from class: l6.v1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int P;
            P = d2.P((m6.q) obj, (m6.q) obj2);
            return P;
        }
    });

    /* renamed from: h  reason: collision with root package name */
    private boolean f13120h = false;

    /* renamed from: i  reason: collision with root package name */
    private int f13121i = -1;

    /* renamed from: j  reason: collision with root package name */
    private long f13122j = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d2(z2 z2Var, o oVar, h6.j jVar) {
        this.f13113a = z2Var;
        this.f13114b = oVar;
        this.f13115c = jVar.b() ? jVar.a() : "";
    }

    private byte[] A(d7.b0 b0Var) {
        k6.d dVar = new k6.d();
        k6.c.f12590a.e(b0Var, dVar.b(q.c.a.ASCENDING));
        return dVar.c();
    }

    private Object[] B(m6.q qVar, j6.g1 g1Var, Collection<d7.b0> collection) {
        if (collection == null) {
            return null;
        }
        List<k6.d> arrayList = new ArrayList<>();
        arrayList.add(new k6.d());
        Iterator<d7.b0> it = collection.iterator();
        for (q.c cVar : qVar.e()) {
            d7.b0 next = it.next();
            for (k6.d dVar : arrayList) {
                if (L(g1Var, cVar.h()) && m6.y.t(next)) {
                    arrayList = C(arrayList, cVar, next);
                } else {
                    k6.c.f12590a.e(next, dVar.b(cVar.i()));
                }
            }
        }
        return F(arrayList);
    }

    private List<k6.d> C(List<k6.d> list, q.c cVar, d7.b0 b0Var) {
        ArrayList<k6.d> arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        for (d7.b0 b0Var2 : b0Var.q0().o()) {
            for (k6.d dVar : arrayList) {
                k6.d dVar2 = new k6.d();
                dVar2.d(dVar.c());
                k6.c.f12590a.e(b0Var2, dVar2.b(cVar.i()));
                arrayList2.add(dVar2);
            }
        }
        return arrayList2;
    }

    private Object[] D(int i10, int i11, List<d7.b0> list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = i10 / (list != null ? list.size() : 1);
        int i12 = 0;
        Object[] objArr4 = new Object[(i10 * 5) + (objArr3 != null ? objArr3.length : 0)];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int i15 = i14 + 1;
            objArr4[i14] = Integer.valueOf(i11);
            int i16 = i15 + 1;
            objArr4[i15] = this.f13115c;
            int i17 = i16 + 1;
            objArr4[i16] = list != null ? A(list.get(i13 / size)) : f13112l;
            int i18 = i17 + 1;
            int i19 = i13 % size;
            objArr4[i17] = objArr[i19];
            objArr4[i18] = objArr2[i19];
            i13++;
            i14 = i18 + 1;
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i12 < length) {
                objArr4[i14] = objArr3[i12];
                i12++;
                i14++;
            }
        }
        return objArr4;
    }

    private Object[] E(j6.g1 g1Var, int i10, List<d7.b0> list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        StringBuilder sb;
        int max = Math.max(objArr.length, objArr2.length) * (list != null ? list.size() : 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        sb2.append(str2);
        sb2.append(" ? ");
        StringBuilder z10 = q6.g0.z(sb2, max, " UNION ");
        if (objArr3 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append((CharSequence) z10);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append((CharSequence) q6.g0.z("?", objArr3.length, ", "));
            sb3.append(")");
            sb = sb3;
        } else {
            sb = z10;
        }
        Object[] D = D(max, i10, list, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(D));
        return arrayList.toArray();
    }

    private Object[] F(List<k6.d> list) {
        Object[] objArr = new Object[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            objArr[i10] = list.get(i10).c();
        }
        return objArr;
    }

    private SortedSet<k6.e> G(final m6.l lVar, final m6.q qVar) {
        final TreeSet treeSet = new TreeSet();
        this.f13113a.E("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").b(Integer.valueOf(qVar.f()), lVar.toString(), this.f13115c).e(new q6.n() { // from class: l6.z1
            @Override // q6.n
            public final void accept(Object obj) {
                d2.O(treeSet, qVar, lVar, (Cursor) obj);
            }
        });
        return treeSet;
    }

    private m6.q H(j6.g1 g1Var) {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        m6.x xVar = new m6.x(g1Var);
        Collection<m6.q> I = I(g1Var.d() != null ? g1Var.d() : g1Var.n().l());
        m6.q qVar = null;
        if (I.isEmpty()) {
            return null;
        }
        for (m6.q qVar2 : I) {
            if (xVar.d(qVar2) && (qVar == null || qVar2.h().size() > qVar.h().size())) {
                qVar = qVar2;
            }
        }
        return qVar;
    }

    private q.a J(Collection<m6.q> collection) {
        q6.b.d(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator<m6.q> it = collection.iterator();
        q.a c10 = it.next().g().c();
        int n10 = c10.n();
        while (it.hasNext()) {
            q.a c11 = it.next().g().c();
            if (c11.compareTo(c10) < 0) {
                c10 = c11;
            }
            n10 = Math.max(c11.n(), n10);
        }
        return q.a.h(c10.o(), c10.l(), n10);
    }

    private List<j6.g1> K(j6.g1 g1Var) {
        if (this.f13116d.containsKey(g1Var)) {
            return this.f13116d.get(g1Var);
        }
        ArrayList arrayList = new ArrayList();
        if (g1Var.h().isEmpty()) {
            arrayList.add(g1Var);
        } else {
            for (j6.r rVar : q6.w.i(new j6.l(g1Var.h(), l.a.AND))) {
                arrayList.add(new j6.g1(g1Var.n(), g1Var.d(), rVar.b(), g1Var.m(), g1Var.j(), g1Var.p(), g1Var.f()));
            }
        }
        this.f13116d.put(g1Var, arrayList);
        return arrayList;
    }

    private boolean L(j6.g1 g1Var, m6.r rVar) {
        for (j6.r rVar2 : g1Var.h()) {
            if (rVar2 instanceof j6.q) {
                j6.q qVar = (j6.q) rVar2;
                if (qVar.g().equals(rVar)) {
                    q.b h10 = qVar.h();
                    if (h10.equals(q.b.IN) || h10.equals(q.b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void M(ArrayList arrayList, Cursor cursor) {
        arrayList.add(f.b(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(List list, Cursor cursor) {
        list.add(m6.l.l(m6.u.v(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(SortedSet sortedSet, m6.q qVar, m6.l lVar, Cursor cursor) {
        sortedSet.add(k6.e.g(qVar.f(), lVar, cursor.getBlob(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int P(m6.q qVar, m6.q qVar2) {
        int compare = Long.compare(qVar.g().d(), qVar2.g().d());
        return compare == 0 ? qVar.d().compareTo(qVar2.d()) : compare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Map map, Cursor cursor) {
        map.put(Integer.valueOf(cursor.getInt(0)), q.b.b(cursor.getLong(1), new m6.w(new w5.q(cursor.getLong(2), cursor.getInt(3))), m6.l.l(f.b(cursor.getString(4))), cursor.getInt(5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(Map map, Cursor cursor) {
        try {
            int i10 = cursor.getInt(0);
            U(m6.q.b(i10, cursor.getString(1), this.f13114b.c(b7.a.l0(cursor.getBlob(2))), map.containsKey(Integer.valueOf(i10)) ? (q.b) map.get(Integer.valueOf(i10)) : m6.q.f13814a));
        } catch (com.google.protobuf.e0 e10) {
            throw q6.b.a("Failed to decode index: " + e10, new Object[0]);
        }
    }

    private void U(m6.q qVar) {
        Map<Integer, m6.q> map = this.f13118f.get(qVar.d());
        if (map == null) {
            map = new HashMap<>();
            this.f13118f.put(qVar.d(), map);
        }
        m6.q qVar2 = map.get(Integer.valueOf(qVar.f()));
        if (qVar2 != null) {
            this.f13119g.remove(qVar2);
        }
        map.put(Integer.valueOf(qVar.f()), qVar);
        this.f13119g.add(qVar);
        this.f13121i = Math.max(this.f13121i, qVar.f());
        this.f13122j = Math.max(this.f13122j, qVar.g().d());
    }

    private void V(final m6.i iVar, SortedSet<k6.e> sortedSet, SortedSet<k6.e> sortedSet2) {
        q6.v.a(f13111k, "Updating index entries for document '%s'", iVar.getKey());
        q6.g0.s(sortedSet, sortedSet2, new q6.n() { // from class: l6.c2
            @Override // q6.n
            public final void accept(Object obj) {
                d2.this.S(iVar, (k6.e) obj);
            }
        }, new q6.n() { // from class: l6.b2
            @Override // q6.n
            public final void accept(Object obj) {
                d2.this.T(iVar, (k6.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void S(m6.i iVar, k6.e eVar) {
        this.f13113a.v("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(eVar.l()), this.f13115c, eVar.h(), eVar.i(), iVar.getKey().toString());
    }

    private SortedSet<k6.e> v(m6.i iVar, m6.q qVar) {
        TreeSet treeSet = new TreeSet();
        byte[] y10 = y(qVar, iVar);
        if (y10 == null) {
            return treeSet;
        }
        q.c c10 = qVar.c();
        if (c10 != null) {
            d7.b0 b10 = iVar.b(c10.h());
            if (m6.y.t(b10)) {
                for (d7.b0 b0Var : b10.q0().o()) {
                    treeSet.add(k6.e.g(qVar.f(), iVar.getKey(), A(b0Var), y10));
                }
            }
        } else {
            treeSet.add(k6.e.g(qVar.f(), iVar.getKey(), new byte[0], y10));
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void T(m6.i iVar, k6.e eVar) {
        this.f13113a.v("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(eVar.l()), this.f13115c, eVar.h(), eVar.i(), iVar.getKey().toString());
    }

    private Object[] x(m6.q qVar, j6.g1 g1Var, j6.i iVar) {
        return B(qVar, g1Var, iVar.b());
    }

    private byte[] y(m6.q qVar, m6.i iVar) {
        k6.d dVar = new k6.d();
        for (q.c cVar : qVar.e()) {
            d7.b0 b10 = iVar.b(cVar.h());
            if (b10 == null) {
                return null;
            }
            k6.c.f12590a.e(b10, dVar.b(cVar.i()));
        }
        return dVar.c();
    }

    private byte[] z(m6.q qVar) {
        return this.f13114b.l(qVar.h()).f();
    }

    public Collection<m6.q> I(String str) {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        Map<Integer, m6.q> map = this.f13118f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    @Override // l6.l
    public List<m6.u> a(String str) {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        final ArrayList arrayList = new ArrayList();
        this.f13113a.E("SELECT parent FROM collection_parents WHERE collection_id = ?").b(str).e(new q6.n() { // from class: l6.w1
            @Override // q6.n
            public final void accept(Object obj) {
                d2.M(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // l6.l
    public void b(m6.q qVar) {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        int i10 = this.f13121i + 1;
        m6.q b10 = m6.q.b(i10, qVar.d(), qVar.h(), qVar.g());
        this.f13113a.v("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", Integer.valueOf(i10), b10.d(), z(b10));
        U(b10);
    }

    @Override // l6.l
    public q.a c(j6.g1 g1Var) {
        ArrayList arrayList = new ArrayList();
        for (j6.g1 g1Var2 : K(g1Var)) {
            m6.q H = H(g1Var2);
            if (H != null) {
                arrayList.add(H);
            }
        }
        return J(arrayList);
    }

    @Override // l6.l
    public void d(m6.q qVar) {
        this.f13113a.v("DELETE FROM index_configuration WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f13113a.v("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f13113a.v("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(qVar.f()));
        this.f13119g.remove(qVar);
        Map<Integer, m6.q> map = this.f13118f.get(qVar.d());
        if (map != null) {
            map.remove(Integer.valueOf(qVar.f()));
        }
    }

    @Override // l6.l
    public q.a e(String str) {
        Collection<m6.q> I = I(str);
        q6.b.d(!I.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return J(I);
    }

    @Override // l6.l
    public List<m6.l> f(j6.g1 g1Var) {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (j6.g1 g1Var2 : K(g1Var)) {
            m6.q H = H(g1Var2);
            if (H == null) {
                return null;
            }
            arrayList3.add(Pair.create(g1Var2, H));
        }
        for (Pair pair : arrayList3) {
            j6.g1 g1Var3 = (j6.g1) pair.first;
            m6.q qVar = (m6.q) pair.second;
            List<d7.b0> a10 = g1Var3.a(qVar);
            Collection<d7.b0> l10 = g1Var3.l(qVar);
            j6.i k10 = g1Var3.k(qVar);
            j6.i q10 = g1Var3.q(qVar);
            if (q6.v.c()) {
                q6.v.a(f13111k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", qVar, g1Var3, a10, k10, q10);
            }
            Object[] E = E(g1Var3, qVar.f(), a10, x(qVar, g1Var3, k10), k10.c() ? ">=" : ">", x(qVar, g1Var3, q10), q10.c() ? "<=" : "<", B(qVar, g1Var3, l10));
            arrayList.add(String.valueOf(E[0]));
            arrayList2.addAll(Arrays.asList(E).subList(1, E.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(g1Var.i().equals(a1.a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + ")";
        if (g1Var.r()) {
            str = str + " LIMIT " + g1Var.j();
        }
        q6.b.d(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        z2.d b10 = this.f13113a.E(str).b(arrayList2.toArray());
        final ArrayList arrayList4 = new ArrayList();
        b10.e(new q6.n() { // from class: l6.x1
            @Override // q6.n
            public final void accept(Object obj) {
                d2.N(arrayList4, (Cursor) obj);
            }
        });
        q6.v.a(f13111k, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    @Override // l6.l
    public void g(m6.u uVar) {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        q6.b.d(uVar.q() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f13117e.a(uVar)) {
            this.f13113a.v("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", uVar.l(), f.c(uVar.s()));
        }
    }

    @Override // l6.l
    public void h(String str, q.a aVar) {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        this.f13122j++;
        for (m6.q qVar : I(str)) {
            m6.q b10 = m6.q.b(qVar.f(), qVar.d(), qVar.h(), q.b.a(this.f13122j, aVar));
            this.f13113a.v("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(qVar.f()), this.f13115c, Long.valueOf(this.f13122j), Long.valueOf(aVar.o().g().l()), Integer.valueOf(aVar.o().g().k()), f.c(aVar.l().r()), Integer.valueOf(aVar.n()));
            U(b10);
        }
    }

    @Override // l6.l
    public void i(d6.c<m6.l, m6.i> cVar) {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        Iterator<Map.Entry<m6.l, m6.i>> it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry<m6.l, m6.i> next = it.next();
            for (m6.q qVar : I(next.getKey().o())) {
                SortedSet<k6.e> G = G(next.getKey(), qVar);
                SortedSet<k6.e> v10 = v(next.getValue(), qVar);
                if (!G.equals(v10)) {
                    V(next.getValue(), G, v10);
                }
            }
        }
    }

    @Override // l6.l
    public l.a j(j6.g1 g1Var) {
        l.a aVar = l.a.FULL;
        List<j6.g1> K = K(g1Var);
        Iterator<j6.g1> it = K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            j6.g1 next = it.next();
            m6.q H = H(next);
            if (H == null) {
                aVar = l.a.NONE;
                break;
            } else if (H.h().size() < next.o()) {
                aVar = l.a.PARTIAL;
            }
        }
        return (g1Var.r() && K.size() > 1 && aVar == l.a.FULL) ? l.a.PARTIAL : aVar;
    }

    @Override // l6.l
    public Collection<m6.q> k() {
        ArrayList arrayList = new ArrayList();
        for (Map<Integer, m6.q> map : this.f13118f.values()) {
            arrayList.addAll(map.values());
        }
        return arrayList;
    }

    @Override // l6.l
    public String l() {
        q6.b.d(this.f13120h, "IndexManager not started", new Object[0]);
        m6.q peek = this.f13119g.peek();
        if (peek != null) {
            return peek.d();
        }
        return null;
    }

    @Override // l6.l
    public void start() {
        final HashMap hashMap = new HashMap();
        this.f13113a.E("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").b(this.f13115c).e(new q6.n() { // from class: l6.y1
            @Override // q6.n
            public final void accept(Object obj) {
                d2.Q(hashMap, (Cursor) obj);
            }
        });
        this.f13113a.E("SELECT index_id, collection_group, index_proto FROM index_configuration").e(new q6.n() { // from class: l6.a2
            @Override // q6.n
            public final void accept(Object obj) {
                d2.this.R(hashMap, (Cursor) obj);
            }
        });
        this.f13120h = true;
    }
}
