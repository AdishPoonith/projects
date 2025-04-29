package l6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import l6.t0;
import l6.z2;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y3 {

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f13393a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13394b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y3(SQLiteDatabase sQLiteDatabase, o oVar) {
        this.f13393a = sQLiteDatabase;
        this.f13394b = oVar;
    }

    private void A() {
        N(new String[]{"document_overlays"}, new Runnable() { // from class: l6.q3
            @Override // java.lang.Runnable
            public final void run() {
                y3.this.R();
            }
        });
    }

    private void B() {
        N(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable() { // from class: l6.v3
            @Override // java.lang.Runnable
            public final void run() {
                y3.this.S();
            }
        });
    }

    private void C() {
        N(new String[]{"remote_documents"}, new Runnable() { // from class: l6.g3
            @Override // java.lang.Runnable
            public final void run() {
                y3.this.T();
            }
        });
    }

    private void D() {
        N(new String[]{"targets", "target_globals", "target_documents"}, new Runnable() { // from class: l6.p3
            @Override // java.lang.Runnable
            public final void run() {
                y3.this.U();
            }
        });
    }

    private void E() {
        N(new String[]{"collection_parents"}, new Runnable() { // from class: l6.r3
            @Override // java.lang.Runnable
            public final void run() {
                y3.this.Y();
            }
        });
        final t0.a aVar = new t0.a();
        final SQLiteStatement compileStatement = this.f13393a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)");
        final q6.n nVar = new q6.n() { // from class: l6.w3
            @Override // q6.n
            public final void accept(Object obj) {
                y3.V(t0.a.this, compileStatement, (m6.u) obj);
            }
        };
        new z2.d(this.f13393a, "SELECT path FROM remote_documents").e(new q6.n() { // from class: l6.k3
            @Override // q6.n
            public final void accept(Object obj) {
                y3.W(q6.n.this, (Cursor) obj);
            }
        });
        new z2.d(this.f13393a, "SELECT path FROM document_mutations").e(new q6.n() { // from class: l6.l3
            @Override // q6.n
            public final void accept(Object obj) {
                y3.X(q6.n.this, (Cursor) obj);
            }
        });
    }

    private void F() {
        new z2.d(this.f13393a, "SELECT target_id, target_proto FROM targets").e(new q6.n() { // from class: l6.x3
            @Override // q6.n
            public final void accept(Object obj) {
                y3.this.Z((Cursor) obj);
            }
        });
    }

    private void G() {
        if (m0("targets")) {
            this.f13393a.execSQL("DROP TABLE targets");
        }
        if (m0("target_globals")) {
            this.f13393a.execSQL("DROP TABLE target_globals");
        }
        if (m0("target_documents")) {
            this.f13393a.execSQL("DROP TABLE target_documents");
        }
    }

    private void H() {
        z2.d b10 = new z2.d(this.f13393a, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?").b(100);
        final SQLiteStatement compileStatement = this.f13393a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
        final boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b10.e(new q6.n() { // from class: l6.m3
                @Override // q6.n
                public final void accept(Object obj) {
                    y3.a0(zArr, compileStatement, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void I() {
        this.f13393a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
    }

    private void J() {
        Long l10 = (Long) new z2.d(this.f13393a, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1").d(new q6.t() { // from class: l6.o3
            @Override // q6.t
            public final Object apply(Object obj) {
                Long b02;
                b02 = y3.b0((Cursor) obj);
                return b02;
            }
        });
        q6.b.d(l10 != null, "Missing highest sequence number", new Object[0]);
        final long longValue = l10.longValue();
        final SQLiteStatement compileStatement = this.f13393a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
        z2.d b10 = new z2.d(this.f13393a, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?").b(100);
        final boolean[] zArr = new boolean[1];
        do {
            zArr[0] = false;
            b10.e(new q6.n() { // from class: l6.n3
                @Override // q6.n
                public final void accept(Object obj) {
                    y3.c0(zArr, compileStatement, longValue, (Cursor) obj);
                }
            });
        } while (zArr[0]);
    }

    private void K() {
        if (DatabaseUtils.queryNumEntries(this.f13393a, "target_globals") == 1) {
            return;
        }
        this.f13393a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
    }

    private boolean M() {
        boolean l02 = l0("remote_documents", "read_time_seconds");
        boolean l03 = l0("remote_documents", "read_time_nanos");
        q6.b.d(l02 == l03, "Table contained just one of read_time_seconds or read_time_nanos", new Object[0]);
        return l02 && l03;
    }

    private void N(String[] strArr, Runnable runnable) {
        StringBuilder sb;
        String str;
        String str2 = "[" + TextUtils.join(", ", strArr) + "]";
        boolean z10 = false;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str3 = strArr[i10];
            boolean m02 = m0(str3);
            if (i10 == 0) {
                z10 = m02;
            } else if (m02 != z10) {
                String str4 = "Expected all of " + str2 + " to either exist or not, but ";
                if (z10) {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(strArr[0]);
                    sb.append(" exists and ");
                    sb.append(str3);
                    str = " does not";
                } else {
                    sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(strArr[0]);
                    sb.append(" does not exist and ");
                    sb.append(str3);
                    str = " does";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (!z10) {
            runnable.run();
            return;
        }
        q6.v.a("SQLiteSchema", "Skipping migration because all of " + str2 + " already exist", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O() {
        this.f13393a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
        this.f13393a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P() {
        this.f13393a.execSQL("CREATE TABLE data_migrations (migration_name TEXT, PRIMARY KEY (migration_name))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        this.f13393a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
        this.f13393a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
        this.f13393a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
        this.f13393a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        this.f13393a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
        this.f13393a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
        this.f13393a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.f13393a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
        this.f13393a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
        this.f13393a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        this.f13393a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.f13393a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
        this.f13393a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
        this.f13393a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
        this.f13393a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
        this.f13393a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(t0.a aVar, SQLiteStatement sQLiteStatement, m6.u uVar) {
        if (aVar.a(uVar)) {
            String l10 = uVar.l();
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, l10);
            sQLiteStatement.bindString(2, f.c(uVar.s()));
            sQLiteStatement.execute();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(q6.n nVar, Cursor cursor) {
        nVar.accept(f.b(cursor.getString(0)).s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void X(q6.n nVar, Cursor cursor) {
        nVar.accept(f.b(cursor.getString(0)).s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.f13393a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(Cursor cursor) {
        int i10 = cursor.getInt(0);
        try {
            this.f13393a.execSQL("UPDATE targets SET target_proto = ? WHERE target_id = ?", new Object[]{o6.c.x0(cursor.getBlob(1)).d().H().b().f(), Integer.valueOf(i10)});
        } catch (com.google.protobuf.e0 unused) {
            throw q6.b.a("Failed to decode Query data for target %s", Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(boolean[] zArr, SQLiteStatement sQLiteStatement, Cursor cursor) {
        zArr[0] = true;
        String string = cursor.getString(0);
        m6.u b10 = f.b(string);
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, b10.q());
        sQLiteStatement.bindString(2, string);
        q6.b.d(sQLiteStatement.executeUpdateDelete() != -1, "Failed to update document path", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long b0(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0(boolean[] zArr, SQLiteStatement sQLiteStatement, long j10, Cursor cursor) {
        zArr[0] = true;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, cursor.getString(0));
        sQLiteStatement.bindLong(2, j10);
        q6.b.d(sQLiteStatement.executeInsert() != -1, "Failed to insert a sentinel row", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(String str, Cursor cursor) {
        h0(str, cursor.getInt(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(Cursor cursor) {
        final String string = cursor.getString(0);
        new z2.d(this.f13393a, "SELECT batch_id FROM mutations WHERE uid = ? AND batch_id <= ?").b(string, Long.valueOf(cursor.getLong(1))).e(new q6.n() { // from class: l6.j3
            @Override // q6.n
            public final void accept(Object obj) {
                y3.this.d0(string, (Cursor) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(Cursor cursor) {
        int i10 = cursor.getInt(0);
        try {
            this.f13393a.execSQL("UPDATE targets SET canonical_id  = ? WHERE target_id = ?", new Object[]{this.f13394b.h(o6.c.x0(cursor.getBlob(1))).f().c(), Integer.valueOf(i10)});
        } catch (com.google.protobuf.e0 unused) {
            throw q6.b.a("Failed to decode Query data for target %s", Integer.valueOf(i10));
        }
    }

    private void g0() {
        new z2.d(this.f13393a, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues").e(new q6.n() { // from class: l6.i3
            @Override // q6.n
            public final void accept(Object obj) {
                y3.this.e0((Cursor) obj);
            }
        });
    }

    private void h0(String str, int i10) {
        SQLiteStatement compileStatement = this.f13393a.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        compileStatement.bindString(1, str);
        compileStatement.bindLong(2, i10);
        q6.b.d(compileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(i10));
        this.f13393a.execSQL("DELETE FROM document_mutations WHERE uid = ? AND batch_id = ?", new Object[]{str, Integer.valueOf(i10)});
    }

    private void i0() {
        new z2.d(this.f13393a, "SELECT target_id, target_proto FROM targets").e(new q6.n() { // from class: l6.h3
            @Override // q6.n
            public final void accept(Object obj) {
                y3.this.f0((Cursor) obj);
            }
        });
    }

    private boolean l0(String str, String str2) {
        return L(str).indexOf(str2) != -1;
    }

    private boolean m0(String str) {
        return !new z2.d(this.f13393a, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?").b(str).f();
    }

    private void s() {
        if (l0("remote_documents", "path_length")) {
            return;
        }
        this.f13393a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
    }

    private void t(String str) {
        this.f13393a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{str});
    }

    private void u() {
        this.f13393a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
        this.f13393a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
    }

    private void v() {
        if (l0("target_documents", "sequence_number")) {
            return;
        }
        this.f13393a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
    }

    private void w() {
        if (!l0("target_globals", "target_count")) {
            this.f13393a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
        }
        long queryNumEntries = DatabaseUtils.queryNumEntries(this.f13393a, "targets");
        ContentValues contentValues = new ContentValues();
        contentValues.put("target_count", Long.valueOf(queryNumEntries));
        this.f13393a.update("target_globals", contentValues, null, null);
    }

    private void x() {
        N(new String[]{"bundles", "named_queries"}, new Runnable() { // from class: l6.t3
            @Override // java.lang.Runnable
            public final void run() {
                y3.this.O();
            }
        });
    }

    private void y() {
        N(new String[]{"data_migrations"}, new Runnable() { // from class: l6.s3
            @Override // java.lang.Runnable
            public final void run() {
                y3.this.P();
            }
        });
    }

    private void z() {
        N(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable() { // from class: l6.u3
            @Override // java.lang.Runnable
            public final void run() {
                y3.this.Q();
            }
        });
    }

    List<String> L(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f13393a;
            cursor = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursor.getColumnIndex("name");
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(columnIndex));
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0(int i10) {
        k0(i10, 16);
    }

    void k0(int i10, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        if (i10 < 1 && i11 >= 1) {
            B();
            D();
            C();
        }
        if (i10 < 3 && i11 >= 3 && i10 != 0) {
            G();
            D();
        }
        if (i10 < 4 && i11 >= 4) {
            K();
            w();
        }
        if (i10 < 5 && i11 >= 5) {
            v();
        }
        if (i10 < 6 && i11 >= 6) {
            g0();
        }
        if (i10 < 7 && i11 >= 7) {
            J();
        }
        if (i10 < 8 && i11 >= 8) {
            E();
        }
        if (i10 < 9 && i11 >= 9) {
            if (M()) {
                F();
            } else {
                u();
            }
        }
        if (i10 == 9 && i11 >= 10) {
            F();
        }
        if (i10 < 11 && i11 >= 11) {
            i0();
        }
        if (i10 < 12 && i11 >= 12) {
            x();
        }
        if (i10 < 13 && i11 >= 13) {
            s();
            H();
        }
        if (i10 < 14 && i11 >= 14) {
            A();
            y();
            t(e1.f13136b);
        }
        if (i10 < 15 && i11 >= 15) {
            I();
        }
        if (i10 < 16 && i11 >= 16) {
            z();
        }
        q6.v.a("SQLiteSchema", "Migration from version %s to %s took %s milliseconds", Integer.valueOf(i10), Integer.valueOf(i11), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }
}
