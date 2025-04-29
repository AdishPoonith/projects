package l6;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import java.util.Iterator;
import l6.e4;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e4 implements g4 {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f13142a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13143b;

    /* renamed from: c  reason: collision with root package name */
    private int f13144c;

    /* renamed from: d  reason: collision with root package name */
    private long f13145d;

    /* renamed from: e  reason: collision with root package name */
    private m6.w f13146e = m6.w.f13842k;

    /* renamed from: f  reason: collision with root package name */
    private long f13147f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        d6.e<m6.l> f13148a;

        private b() {
            this.f13148a = m6.l.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        h4 f13149a;

        private c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e4(z2 z2Var, o oVar) {
        this.f13142a = z2Var;
        this.f13143b = oVar;
    }

    private void A(h4 h4Var) {
        int g10 = h4Var.g();
        String c10 = h4Var.f().c();
        w5.q g11 = h4Var.e().g();
        this.f13142a.v("INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(g10), c10, Long.valueOf(g11.l()), Integer.valueOf(g11.k()), h4Var.c().L(), Long.valueOf(h4Var.d()), this.f13143b.q(h4Var).f());
    }

    private boolean C(h4 h4Var) {
        boolean z10;
        if (h4Var.g() > this.f13144c) {
            this.f13144c = h4Var.g();
            z10 = true;
        } else {
            z10 = false;
        }
        if (h4Var.d() > this.f13145d) {
            this.f13145d = h4Var.d();
            return true;
        }
        return z10;
    }

    private void D() {
        this.f13142a.v("UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?", Integer.valueOf(this.f13144c), Long.valueOf(this.f13145d), Long.valueOf(this.f13146e.g().l()), Integer.valueOf(this.f13146e.g().k()), Long.valueOf(this.f13147f));
    }

    private h4 p(byte[] bArr) {
        try {
            return this.f13143b.h(o6.c.x0(bArr));
        } catch (com.google.protobuf.e0 e10) {
            throw q6.b.a("TargetData failed to parse: %s", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(q6.n nVar, Cursor cursor) {
        nVar.accept(p(cursor.getBlob(0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(b bVar, Cursor cursor) {
        bVar.f13148a = bVar.f13148a.k(m6.l.l(f.b(cursor.getString(0))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(j6.g1 g1Var, c cVar, Cursor cursor) {
        h4 p10 = p(cursor.getBlob(0));
        if (g1Var.equals(p10.f())) {
            cVar.f13149a = p10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(SparseArray sparseArray, int[] iArr, Cursor cursor) {
        int i10 = cursor.getInt(0);
        if (sparseArray.get(i10) == null) {
            z(i10);
            iArr[0] = iArr[0] + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Cursor cursor) {
        this.f13144c = cursor.getInt(0);
        this.f13145d = cursor.getInt(1);
        this.f13146e = new m6.w(new w5.q(cursor.getLong(2), cursor.getInt(3)));
        this.f13147f = cursor.getLong(4);
    }

    private void z(int i10) {
        c(i10);
        this.f13142a.v("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i10));
        this.f13147f--;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        q6.b.d(this.f13142a.E("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1").c(new q6.n() { // from class: l6.a4
            @Override // q6.n
            public final void accept(Object obj) {
                e4.this.x((Cursor) obj);
            }
        }) == 1, "Missing target_globals entry", new Object[0]);
    }

    @Override // l6.g4
    public d6.e<m6.l> a(int i10) {
        final b bVar = new b();
        this.f13142a.E("SELECT path FROM target_documents WHERE target_id = ?").b(Integer.valueOf(i10)).e(new q6.n() { // from class: l6.z3
            @Override // q6.n
            public final void accept(Object obj) {
                e4.u(e4.b.this, (Cursor) obj);
            }
        });
        return bVar.f13148a;
    }

    @Override // l6.g4
    public m6.w b() {
        return this.f13146e;
    }

    @Override // l6.g4
    public void c(int i10) {
        this.f13142a.v("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i10));
    }

    @Override // l6.g4
    public void d(h4 h4Var) {
        A(h4Var);
        C(h4Var);
        this.f13147f++;
        D();
    }

    @Override // l6.g4
    public void e(m6.w wVar) {
        this.f13146e = wVar;
        D();
    }

    @Override // l6.g4
    public void f(h4 h4Var) {
        A(h4Var);
        if (C(h4Var)) {
            D();
        }
    }

    @Override // l6.g4
    public void g(d6.e<m6.l> eVar, int i10) {
        SQLiteStatement D = this.f13142a.D("INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)");
        h2 f10 = this.f13142a.f();
        Iterator<m6.l> it = eVar.iterator();
        while (it.hasNext()) {
            m6.l next = it.next();
            this.f13142a.u(D, Integer.valueOf(i10), f.c(next.r()));
            f10.k(next);
        }
    }

    @Override // l6.g4
    public h4 h(final j6.g1 g1Var) {
        String c10 = g1Var.c();
        final c cVar = new c();
        this.f13142a.E("SELECT target_proto FROM targets WHERE canonical_id = ?").b(c10).e(new q6.n() { // from class: l6.c4
            @Override // q6.n
            public final void accept(Object obj) {
                e4.this.v(g1Var, cVar, (Cursor) obj);
            }
        });
        return cVar.f13149a;
    }

    @Override // l6.g4
    public void i(d6.e<m6.l> eVar, int i10) {
        SQLiteStatement D = this.f13142a.D("DELETE FROM target_documents WHERE target_id = ? AND path = ?");
        h2 f10 = this.f13142a.f();
        Iterator<m6.l> it = eVar.iterator();
        while (it.hasNext()) {
            m6.l next = it.next();
            this.f13142a.u(D, Integer.valueOf(i10), f.c(next.r()));
            f10.n(next);
        }
    }

    @Override // l6.g4
    public int j() {
        return this.f13144c;
    }

    public void q(final q6.n<h4> nVar) {
        this.f13142a.E("SELECT target_proto FROM targets").e(new q6.n() { // from class: l6.d4
            @Override // q6.n
            public final void accept(Object obj) {
                e4.this.t(nVar, (Cursor) obj);
            }
        });
    }

    public long r() {
        return this.f13145d;
    }

    public long s() {
        return this.f13147f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int y(long j10, final SparseArray<?> sparseArray) {
        final int[] iArr = new int[1];
        this.f13142a.E("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?").b(Long.valueOf(j10)).e(new q6.n() { // from class: l6.b4
            @Override // q6.n
            public final void accept(Object obj) {
                e4.this.w(sparseArray, iArr, (Cursor) obj);
            }
        });
        D();
        return iArr[0];
    }
}
