package l6;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import l6.o0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h2 implements i1, k0 {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f13173a;

    /* renamed from: b  reason: collision with root package name */
    private j6.v0 f13174b;

    /* renamed from: c  reason: collision with root package name */
    private long f13175c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final o0 f13176d;

    /* renamed from: e  reason: collision with root package name */
    private j1 f13177e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(z2 z2Var, o0.b bVar) {
        this.f13173a = z2Var;
        this.f13176d = new o0(this, bVar);
    }

    private void A(m6.l lVar) {
        this.f13173a.v("INSERT OR REPLACE INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)", f.c(lVar.r()), Long.valueOf(p()));
    }

    private boolean t(m6.l lVar) {
        if (this.f13177e.c(lVar)) {
            return true;
        }
        return x(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(q6.n nVar, Cursor cursor) {
        nVar.accept(Long.valueOf(cursor.getLong(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long v(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(int[] iArr, List list, Cursor cursor) {
        m6.l l10 = m6.l.l(f.b(cursor.getString(0)));
        if (t(l10)) {
            return;
        }
        iArr[0] = iArr[0] + 1;
        list.add(l10);
        y(l10);
    }

    private boolean x(m6.l lVar) {
        return !this.f13173a.E("SELECT 1 FROM document_mutations WHERE path = ?").b(f.c(lVar.r())).f();
    }

    private void y(m6.l lVar) {
        this.f13173a.v("DELETE FROM target_documents WHERE path = ? AND target_id = 0", f.c(lVar.r()));
    }

    @Override // l6.k0
    public long a() {
        return this.f13173a.h().s() + ((Long) this.f13173a.E("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").d(new q6.t() { // from class: l6.g2
            @Override // q6.t
            public final Object apply(Object obj) {
                Long v10;
                v10 = h2.v((Cursor) obj);
                return v10;
            }
        })).longValue();
    }

    @Override // l6.k0
    public void b(final q6.n<Long> nVar) {
        this.f13173a.E("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").e(new q6.n() { // from class: l6.f2
            @Override // q6.n
            public final void accept(Object obj) {
                h2.u(q6.n.this, (Cursor) obj);
            }
        });
    }

    @Override // l6.k0
    public int c(long j10, SparseArray<?> sparseArray) {
        return this.f13173a.h().y(j10, sparseArray);
    }

    @Override // l6.k0
    public int d(long j10) {
        final int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList();
        while (true) {
            for (boolean z10 = true; z10; z10 = false) {
                if (this.f13173a.E("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? LIMIT ?").b(Long.valueOf(j10), 100).e(new q6.n() { // from class: l6.e2
                    @Override // q6.n
                    public final void accept(Object obj) {
                        h2.this.w(iArr, arrayList, (Cursor) obj);
                    }
                }) == 100) {
                    break;
                }
            }
            this.f13173a.g().removeAll(arrayList);
            return iArr[0];
        }
    }

    @Override // l6.i1
    public void e(m6.l lVar) {
        A(lVar);
    }

    @Override // l6.i1
    public void f(h4 h4Var) {
        this.f13173a.h().f(h4Var.j(p()));
    }

    @Override // l6.i1
    public void g() {
        q6.b.d(this.f13175c != -1, "Committing a transaction without having started one", new Object[0]);
        this.f13175c = -1L;
    }

    @Override // l6.k0
    public void h(q6.n<h4> nVar) {
        this.f13173a.h().q(nVar);
    }

    @Override // l6.k0
    public o0 i() {
        return this.f13176d;
    }

    @Override // l6.i1
    public void j() {
        q6.b.d(this.f13175c == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f13175c = this.f13174b.a();
    }

    @Override // l6.i1
    public void k(m6.l lVar) {
        A(lVar);
    }

    @Override // l6.k0
    public long l() {
        return this.f13173a.w();
    }

    @Override // l6.i1
    public void m(m6.l lVar) {
        A(lVar);
    }

    @Override // l6.i1
    public void n(m6.l lVar) {
        A(lVar);
    }

    @Override // l6.i1
    public void o(j1 j1Var) {
        this.f13177e = j1Var;
    }

    @Override // l6.i1
    public long p() {
        q6.b.d(this.f13175c != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f13175c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(long j10) {
        this.f13174b = new j6.v0(j10);
    }
}
