package l6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import l6.z2;
/* loaded from: classes.dex */
public class u1 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f13344a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13345b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13346c;

    public u1(z2 z2Var, o oVar, h6.j jVar) {
        this.f13344a = z2Var;
        this.f13345b = oVar;
        this.f13346c = jVar.b() ? jVar.a() : "";
    }

    private n6.k m(byte[] bArr, int i10) {
        try {
            return n6.k.a(i10, this.f13345b.e(d7.c0.B0(bArr)));
        } catch (com.google.protobuf.e0 e10) {
            throw q6.b.a("Overlay failed to parse: %s", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n6.k n(Cursor cursor) {
        return m(cursor.getBlob(0), cursor.getInt(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(int[] iArr, String[] strArr, String[] strArr2, q6.m mVar, Map map, Cursor cursor) {
        iArr[0] = cursor.getInt(1);
        strArr[0] = cursor.getString(2);
        strArr2[0] = cursor.getString(3);
        s(mVar, map, cursor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(byte[] bArr, int i10, Map map) {
        n6.k m10 = m(bArr, i10);
        synchronized (map) {
            map.put(m10.b(), m10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.Executor] */
    /* renamed from: t */
    public void s(q6.m mVar, final Map<m6.l, n6.k> map, Cursor cursor) {
        final byte[] blob = cursor.getBlob(0);
        final int i10 = cursor.getInt(1);
        q6.m mVar2 = mVar;
        if (cursor.isLast()) {
            mVar2 = q6.p.f16300b;
        }
        mVar2.execute(new Runnable() { // from class: l6.o1
            @Override // java.lang.Runnable
            public final void run() {
                u1.this.r(blob, i10, map);
            }
        });
    }

    private void u(final Map<m6.l, n6.k> map, final q6.m mVar, m6.u uVar, List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        z2.b bVar = new z2.b(this.f13344a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList(this.f13346c, f.c(uVar)), list, ")");
        while (bVar.d()) {
            bVar.e().e(new q6.n() { // from class: l6.r1
                @Override // q6.n
                public final void accept(Object obj) {
                    u1.this.s(mVar, map, (Cursor) obj);
                }
            });
        }
    }

    private void v(int i10, m6.l lVar, n6.f fVar) {
        this.f13344a.v("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", this.f13346c, lVar.o(), f.c(lVar.r().s()), lVar.r().l(), Integer.valueOf(i10), this.f13345b.n(fVar).f());
    }

    @Override // l6.b
    public Map<m6.l, n6.k> a(SortedSet<m6.l> sortedSet) {
        q6.b.d(sortedSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap hashMap = new HashMap();
        q6.m mVar = new q6.m();
        m6.u uVar = m6.u.f13841k;
        ArrayList arrayList = new ArrayList();
        for (m6.l lVar : sortedSet) {
            if (!uVar.equals(lVar.p())) {
                u(hashMap, mVar, uVar, arrayList);
                uVar = lVar.p();
                arrayList.clear();
            }
            arrayList.add(lVar.q());
        }
        u(hashMap, mVar, uVar, arrayList);
        mVar.b();
        return hashMap;
    }

    @Override // l6.b
    public void b(int i10) {
        this.f13344a.v("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", this.f13346c, Integer.valueOf(i10));
    }

    @Override // l6.b
    public void c(int i10, Map<m6.l, n6.f> map) {
        for (Map.Entry<m6.l, n6.f> entry : map.entrySet()) {
            m6.l key = entry.getKey();
            v(i10, key, (n6.f) q6.x.d(entry.getValue(), "null value for key: %s", key));
        }
    }

    @Override // l6.b
    public Map<m6.l, n6.k> d(m6.u uVar, int i10) {
        final HashMap hashMap = new HashMap();
        final q6.m mVar = new q6.m();
        this.f13344a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?").b(this.f13346c, f.c(uVar), Integer.valueOf(i10)).e(new q6.n() { // from class: l6.p1
            @Override // q6.n
            public final void accept(Object obj) {
                u1.this.o(mVar, hashMap, (Cursor) obj);
            }
        });
        mVar.b();
        return hashMap;
    }

    @Override // l6.b
    public Map<m6.l, n6.k> e(String str, int i10, int i11) {
        final HashMap hashMap = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final q6.m mVar = new q6.m();
        this.f13344a.E("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?").b(this.f13346c, str, Integer.valueOf(i10), Integer.valueOf(i11)).e(new q6.n() { // from class: l6.s1
            @Override // q6.n
            public final void accept(Object obj) {
                u1.this.p(iArr, strArr, strArr2, mVar, hashMap, (Cursor) obj);
            }
        });
        if (strArr[0] == null) {
            return hashMap;
        }
        this.f13344a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?").b(this.f13346c, str, strArr[0], strArr[0], strArr2[0], Integer.valueOf(iArr[0])).e(new q6.n() { // from class: l6.q1
            @Override // q6.n
            public final void accept(Object obj) {
                u1.this.q(mVar, hashMap, (Cursor) obj);
            }
        });
        mVar.b();
        return hashMap;
    }

    @Override // l6.b
    public n6.k f(m6.l lVar) {
        return (n6.k) this.f13344a.E("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?").b(this.f13346c, f.c(lVar.r().s()), lVar.r().l()).d(new q6.t() { // from class: l6.t1
            @Override // q6.t
            public final Object apply(Object obj) {
                n6.k n10;
                n10 = u1.this.n((Cursor) obj);
                return n10;
            }
        });
    }
}
