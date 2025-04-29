package l6;

import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class w2 implements c1 {

    /* renamed from: a  reason: collision with root package name */
    private final z2 f13372a;

    public w2(z2 z2Var) {
        this.f13372a = z2Var;
    }

    private void d() {
        this.f13372a.k("build overlays", new Runnable() { // from class: l6.t2
            @Override // java.lang.Runnable
            public final void run() {
                w2.this.g();
            }
        });
    }

    private Set<String> e() {
        final HashSet hashSet = new HashSet();
        this.f13372a.E("SELECT DISTINCT uid FROM mutation_queues").e(new q6.n() { // from class: l6.u2
            @Override // q6.n
            public final void accept(Object obj) {
                w2.h(hashSet, (Cursor) obj);
            }
        });
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        if (f()) {
            Set<String> e10 = e();
            k1 g10 = this.f13372a.g();
            for (String str : e10) {
                h6.j jVar = new h6.j(str);
                z2 z2Var = this.f13372a;
                b1 d10 = z2Var.d(jVar, z2Var.c(jVar));
                HashSet hashSet = new HashSet();
                for (n6.g gVar : d10.k()) {
                    hashSet.addAll(gVar.f());
                }
                new n(g10, d10, this.f13372a.b(jVar), this.f13372a.c(jVar)).n(hashSet);
            }
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Set set, Cursor cursor) {
        set.add(cursor.getString(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Boolean[] boolArr, Cursor cursor) {
        try {
            if (e1.f13136b.equals(cursor.getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e10) {
            throw q6.b.a("SQLitePersistence.DataMigration failed to parse: %s", e10);
        }
    }

    private void j() {
        this.f13372a.v("DELETE FROM data_migrations WHERE migration_name = ?", e1.f13136b);
    }

    boolean f() {
        final Boolean[] boolArr = {Boolean.FALSE};
        this.f13372a.E("SELECT migration_name FROM data_migrations").e(new q6.n() { // from class: l6.v2
            @Override // q6.n
            public final void accept(Object obj) {
                w2.i(boolArr, (Cursor) obj);
            }
        });
        return boolArr[0].booleanValue();
    }

    @Override // l6.c1
    public void run() {
        d();
    }
}
