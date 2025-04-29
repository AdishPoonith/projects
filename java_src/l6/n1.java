package l6;

import android.database.Cursor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n1 implements a {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f13251a;

    /* renamed from: b  reason: collision with root package name */
    private final o f13252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(z2 z2Var, o oVar) {
        this.f13251a = z2Var;
        this.f13252b = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i6.e g(String str, Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        return new i6.e(str, cursor.getInt(0), new m6.w(new w5.q(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ i6.j h(String str, Cursor cursor) {
        if (cursor != null) {
            try {
                return new i6.j(str, this.f13252b.a(c7.a.m0(cursor.getBlob(2))), new m6.w(new w5.q(cursor.getLong(0), cursor.getInt(1))));
            } catch (com.google.protobuf.e0 e10) {
                throw q6.b.a("NamedQuery failed to parse: %s", e10);
            }
        }
        return null;
    }

    @Override // l6.a
    public void a(i6.j jVar) {
        this.f13251a.v("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", jVar.b(), Long.valueOf(jVar.c().g().l()), Integer.valueOf(jVar.c().g().k()), this.f13252b.j(jVar.a()).f());
    }

    @Override // l6.a
    public i6.e b(final String str) {
        return (i6.e) this.f13251a.E("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?").b(str).d(new q6.t() { // from class: l6.l1
            @Override // q6.t
            public final Object apply(Object obj) {
                i6.e g10;
                g10 = n1.g(str, (Cursor) obj);
                return g10;
            }
        });
    }

    @Override // l6.a
    public i6.j c(final String str) {
        return (i6.j) this.f13251a.E("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?").b(str).d(new q6.t() { // from class: l6.m1
            @Override // q6.t
            public final Object apply(Object obj) {
                i6.j h10;
                h10 = n1.this.h(str, (Cursor) obj);
                return h10;
            }
        });
    }

    @Override // l6.a
    public void d(i6.e eVar) {
        this.f13251a.v("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar.a(), Integer.valueOf(eVar.c()), Long.valueOf(eVar.b().g().l()), Integer.valueOf(eVar.b().g().k()), Integer.valueOf(eVar.e()), Long.valueOf(eVar.d()));
    }
}
