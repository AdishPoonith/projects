package l6;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l6.z2;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s2 implements b1 {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f13325a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13326b;

    /* renamed from: c  reason: collision with root package name */
    private final l f13327c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13328d;

    /* renamed from: e  reason: collision with root package name */
    private int f13329e;

    /* renamed from: f  reason: collision with root package name */
    private com.google.protobuf.i f13330f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements q6.n<Cursor> {

        /* renamed from: a  reason: collision with root package name */
        private final ArrayList<com.google.protobuf.i> f13331a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        private boolean f13332b = true;

        a(byte[] bArr) {
            c(bArr);
        }

        private void c(byte[] bArr) {
            this.f13331a.add(com.google.protobuf.i.u(bArr));
        }

        @Override // q6.n
        /* renamed from: a */
        public void accept(Cursor cursor) {
            byte[] blob = cursor.getBlob(0);
            c(blob);
            if (blob.length < 1000000) {
                this.f13332b = false;
            }
        }

        int d() {
            return this.f13331a.size();
        }

        com.google.protobuf.i e() {
            return com.google.protobuf.i.r(this.f13331a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s2(z2 z2Var, o oVar, h6.j jVar, l lVar) {
        this.f13325a = z2Var;
        this.f13326b = oVar;
        this.f13328d = jVar.b() ? jVar.a() : "";
        this.f13330f = p6.z0.f15748v;
        this.f13327c = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer A(Cursor cursor) {
        return Integer.valueOf(cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n6.g B(Cursor cursor) {
        return v(cursor.getInt(0), cursor.getBlob(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(List list, Cursor cursor) {
        list.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Cursor cursor) {
        this.f13329e = Math.max(this.f13329e, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n6.g E(int i10, Cursor cursor) {
        return v(i10, cursor.getBlob(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(List list, Cursor cursor) {
        list.add(f.b(cursor.getString(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Cursor cursor) {
        this.f13330f = com.google.protobuf.i.u(cursor.getBlob(0));
    }

    private void H() {
        final ArrayList arrayList = new ArrayList();
        this.f13325a.E("SELECT uid FROM mutation_queues").e(new q6.n() { // from class: l6.k2
            @Override // q6.n
            public final void accept(Object obj) {
                s2.C(arrayList, (Cursor) obj);
            }
        });
        this.f13329e = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f13325a.E("SELECT MAX(batch_id) FROM mutations WHERE uid = ?").b((String) it.next()).e(new q6.n() { // from class: l6.l2
                @Override // q6.n
                public final void accept(Object obj) {
                    s2.this.D((Cursor) obj);
                }
            });
        }
        this.f13329e++;
    }

    private void I() {
        this.f13325a.v("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", this.f13328d, -1, this.f13330f.L());
    }

    private n6.g v(int i10, byte[] bArr) {
        try {
            if (bArr.length < 1000000) {
                return this.f13326b.f(o6.e.v0(bArr));
            }
            a aVar = new a(bArr);
            while (aVar.f13332b) {
                this.f13325a.E("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(Integer.valueOf((aVar.d() * 1000000) + 1), 1000000, this.f13328d, Integer.valueOf(i10)).c(aVar);
            }
            return this.f13326b.f(o6.e.u0(aVar.e()));
        } catch (com.google.protobuf.e0 e10) {
            throw q6.b.a("MutationBatch failed to parse: %s", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(List list, Cursor cursor) {
        list.add(v(cursor.getInt(0), cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(Set set, List list, Cursor cursor) {
        int i10 = cursor.getInt(0);
        if (set.contains(Integer.valueOf(i10))) {
            return;
        }
        set.add(Integer.valueOf(i10));
        list.add(v(i10, cursor.getBlob(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int z(n6.g gVar, n6.g gVar2) {
        return q6.g0.l(gVar.e(), gVar2.e());
    }

    @Override // l6.b1
    public void a() {
        if (w()) {
            final ArrayList arrayList = new ArrayList();
            this.f13325a.E("SELECT path FROM document_mutations WHERE uid = ?").b(this.f13328d).e(new q6.n() { // from class: l6.j2
                @Override // q6.n
                public final void accept(Object obj) {
                    s2.F(arrayList, (Cursor) obj);
                }
            });
            q6.b.d(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        }
    }

    @Override // l6.b1
    public n6.g b(int i10) {
        return (n6.g) this.f13325a.E("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1").b(1000000, this.f13328d, Integer.valueOf(i10 + 1)).d(new q6.t() { // from class: l6.p2
            @Override // q6.t
            public final Object apply(Object obj) {
                n6.g B;
                B = s2.this.B((Cursor) obj);
                return B;
            }
        });
    }

    @Override // l6.b1
    public int c() {
        return ((Integer) this.f13325a.E("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?").b(-1, this.f13328d).d(new q6.t() { // from class: l6.r2
            @Override // q6.t
            public final Object apply(Object obj) {
                Integer A;
                A = s2.A((Cursor) obj);
                return A;
            }
        })).intValue();
    }

    @Override // l6.b1
    public void d(n6.g gVar) {
        SQLiteStatement D = this.f13325a.D("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement D2 = this.f13325a.D("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int e10 = gVar.e();
        q6.b.d(this.f13325a.u(D, this.f13328d, Integer.valueOf(e10)) != 0, "Mutation batch (%s, %d) did not exist", this.f13328d, Integer.valueOf(gVar.e()));
        for (n6.f fVar : gVar.h()) {
            m6.l g10 = fVar.g();
            this.f13325a.u(D2, this.f13328d, f.c(g10.r()), Integer.valueOf(e10));
            this.f13325a.f().m(g10);
        }
    }

    @Override // l6.b1
    public List<n6.g> e(Iterable<m6.l> iterable) {
        ArrayList arrayList = new ArrayList();
        for (m6.l lVar : iterable) {
            arrayList.add(f.c(lVar.r()));
        }
        z2.b bVar = new z2.b(this.f13325a, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, this.f13328d), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        final ArrayList arrayList2 = new ArrayList();
        final HashSet hashSet = new HashSet();
        while (bVar.d()) {
            bVar.e().e(new q6.n() { // from class: l6.o2
                @Override // q6.n
                public final void accept(Object obj) {
                    s2.this.y(hashSet, arrayList2, (Cursor) obj);
                }
            });
        }
        if (bVar.c() > 1) {
            Collections.sort(arrayList2, new Comparator() { // from class: l6.i2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int z10;
                    z10 = s2.z((n6.g) obj, (n6.g) obj2);
                    return z10;
                }
            });
        }
        return arrayList2;
    }

    @Override // l6.b1
    public void f(n6.g gVar, com.google.protobuf.i iVar) {
        this.f13330f = (com.google.protobuf.i) q6.x.b(iVar);
        I();
    }

    @Override // l6.b1
    public n6.g g(final int i10) {
        return (n6.g) this.f13325a.E("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?").b(1000000, this.f13328d, Integer.valueOf(i10)).d(new q6.t() { // from class: l6.q2
            @Override // q6.t
            public final Object apply(Object obj) {
                n6.g E;
                E = s2.this.E(i10, (Cursor) obj);
                return E;
            }
        });
    }

    @Override // l6.b1
    public n6.g h(w5.q qVar, List<n6.f> list, List<n6.f> list2) {
        int i10 = this.f13329e;
        this.f13329e = i10 + 1;
        n6.g gVar = new n6.g(i10, qVar, list, list2);
        this.f13325a.v("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", this.f13328d, Integer.valueOf(i10), this.f13326b.o(gVar).f());
        HashSet hashSet = new HashSet();
        SQLiteStatement D = this.f13325a.D("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        for (n6.f fVar : list2) {
            m6.l g10 = fVar.g();
            if (hashSet.add(g10)) {
                this.f13325a.u(D, this.f13328d, f.c(g10.r()), Integer.valueOf(i10));
                this.f13327c.g(g10.p());
            }
        }
        return gVar;
    }

    @Override // l6.b1
    public com.google.protobuf.i i() {
        return this.f13330f;
    }

    @Override // l6.b1
    public void j(com.google.protobuf.i iVar) {
        this.f13330f = (com.google.protobuf.i) q6.x.b(iVar);
        I();
    }

    @Override // l6.b1
    public List<n6.g> k() {
        final ArrayList arrayList = new ArrayList();
        this.f13325a.E("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC").b(1000000, this.f13328d).e(new q6.n() { // from class: l6.n2
            @Override // q6.n
            public final void accept(Object obj) {
                s2.this.x(arrayList, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // l6.b1
    public void start() {
        H();
        if (this.f13325a.E("SELECT last_stream_token FROM mutation_queues WHERE uid = ?").b(this.f13328d).c(new q6.n() { // from class: l6.m2
            @Override // q6.n
            public final void accept(Object obj) {
                s2.this.G((Cursor) obj);
            }
        }) == 0) {
            I();
        }
    }

    public boolean w() {
        return this.f13325a.E("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1").b(this.f13328d).f();
    }
}
