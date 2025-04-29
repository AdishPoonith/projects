package l6;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import com.google.firebase.firestore.z;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l6.o0;
import l6.z2;
/* loaded from: classes.dex */
public final class z2 extends e1 {

    /* renamed from: c  reason: collision with root package name */
    private final c f13404c;

    /* renamed from: d  reason: collision with root package name */
    private final o f13405d;

    /* renamed from: e  reason: collision with root package name */
    private final e4 f13406e;

    /* renamed from: f  reason: collision with root package name */
    private final n1 f13407f;

    /* renamed from: g  reason: collision with root package name */
    private final f3 f13408g;

    /* renamed from: h  reason: collision with root package name */
    private final h2 f13409h;

    /* renamed from: i  reason: collision with root package name */
    private final SQLiteTransactionListener f13410i;

    /* renamed from: j  reason: collision with root package name */
    private SQLiteDatabase f13411j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13412k;

    /* loaded from: classes.dex */
    class a implements SQLiteTransactionListener {
        a() {
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            z2.this.f13409h.j();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            z2.this.f13409h.g();
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
        }
    }

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final z2 f13414a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13415b;

        /* renamed from: c  reason: collision with root package name */
        private final String f13416c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Object> f13417d;

        /* renamed from: e  reason: collision with root package name */
        private int f13418e;

        /* renamed from: f  reason: collision with root package name */
        private final Iterator<Object> f13419f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(z2 z2Var, String str, List<Object> list, String str2) {
            this.f13418e = 0;
            this.f13414a = z2Var;
            this.f13415b = str;
            this.f13417d = Collections.emptyList();
            this.f13416c = str2;
            this.f13419f = list.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(z2 z2Var, String str, List<Object> list, List<Object> list2, String str2) {
            this.f13418e = 0;
            this.f13414a = z2Var;
            this.f13415b = str;
            this.f13417d = list;
            this.f13416c = str2;
            this.f13419f = list2.iterator();
        }

        private Object[] b() {
            ArrayList arrayList = new ArrayList(this.f13417d);
            for (int i10 = 0; this.f13419f.hasNext() && i10 < 900 - this.f13417d.size(); i10++) {
                arrayList.add(this.f13419f.next());
            }
            return arrayList.toArray();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            this.f13418e++;
            Object[] b10 = b();
            this.f13414a.v(this.f13415b + ((Object) q6.g0.z("?", b10.length, ", ")) + this.f13416c, b10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int c() {
            return this.f13418e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d() {
            return this.f13419f.hasNext();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d e() {
            Object[] b10;
            this.f13418e++;
            return this.f13414a.E(this.f13415b + ((Object) q6.g0.z("?", b10.length, ", ")) + this.f13416c).b(b());
        }
    }

    /* loaded from: classes.dex */
    static class c extends SQLiteOpenHelper {

        /* renamed from: j  reason: collision with root package name */
        private final o f13420j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f13421k;

        private c(Context context, o oVar, String str) {
            this(context, oVar, str, 16);
        }

        c(Context context, o oVar, String str, int i10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
            this.f13420j = oVar;
        }

        /* synthetic */ c(Context context, o oVar, String str, a aVar) {
            this(context, oVar, str);
        }

        private void a(SQLiteDatabase sQLiteDatabase) {
            if (this.f13421k) {
                return;
            }
            onConfigure(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f13421k = true;
            sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
            new y3(sQLiteDatabase, this.f13420j).j0(0);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            a(sQLiteDatabase);
            new y3(sQLiteDatabase, this.f13420j).j0(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SQLiteDatabase f13422a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13423b;

        /* renamed from: c  reason: collision with root package name */
        private SQLiteDatabase.CursorFactory f13424c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(SQLiteDatabase sQLiteDatabase, String str) {
            this.f13422a = sQLiteDatabase;
            this.f13423b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Cursor g(Object[] objArr, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            z2.r(sQLiteQuery, objArr);
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }

        private Cursor h() {
            SQLiteDatabase.CursorFactory cursorFactory = this.f13424c;
            return cursorFactory != null ? this.f13422a.rawQueryWithFactory(cursorFactory, this.f13423b, null, null) : this.f13422a.rawQuery(this.f13423b, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public d b(final Object... objArr) {
            this.f13424c = new SQLiteDatabase.CursorFactory() { // from class: l6.a3
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    Cursor g10;
                    g10 = z2.d.g(objArr, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                    return g10;
                }
            };
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int c(q6.n<Cursor> nVar) {
            Cursor h10 = h();
            try {
                if (!h10.moveToFirst()) {
                    h10.close();
                    return 0;
                }
                nVar.accept(h10);
                h10.close();
                return 1;
            } catch (Throwable th) {
                if (h10 != null) {
                    try {
                        h10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public <T> T d(q6.t<Cursor, T> tVar) {
            Cursor h10 = h();
            try {
                if (!h10.moveToFirst()) {
                    h10.close();
                    return null;
                }
                T apply = tVar.apply(h10);
                h10.close();
                return apply;
            } catch (Throwable th) {
                if (h10 != null) {
                    try {
                        h10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int e(q6.n<Cursor> nVar) {
            Cursor h10 = h();
            int i10 = 0;
            while (h10.moveToNext()) {
                try {
                    i10++;
                    nVar.accept(h10);
                } catch (Throwable th) {
                    if (h10 != null) {
                        try {
                            h10.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            h10.close();
            return i10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean f() {
            Cursor h10 = h();
            try {
                boolean z10 = !h10.moveToFirst();
                h10.close();
                return z10;
            } catch (Throwable th) {
                if (h10 != null) {
                    try {
                        h10.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    public z2(Context context, String str, m6.f fVar, o oVar, o0.b bVar) {
        this(oVar, bVar, new c(context, oVar, t(str, fVar), (a) null));
    }

    public z2(o oVar, o0.b bVar, c cVar) {
        this.f13410i = new a();
        this.f13404c = cVar;
        this.f13405d = oVar;
        this.f13406e = new e4(this, oVar);
        this.f13407f = new n1(this, oVar);
        this.f13408g = new f3(this, oVar);
        this.f13409h = new h2(this, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long B(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long C(Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(SQLiteProgram sQLiteProgram, Object[] objArr) {
        int i10;
        long longValue;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                sQLiteProgram.bindNull(i11 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i11 + 1, (String) obj);
            } else {
                if (obj instanceof Integer) {
                    i10 = i11 + 1;
                    longValue = ((Integer) obj).intValue();
                } else if (obj instanceof Long) {
                    i10 = i11 + 1;
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Double) {
                    sQLiteProgram.bindDouble(i11 + 1, ((Double) obj).doubleValue());
                } else if (!(obj instanceof byte[])) {
                    throw q6.b.a("Unknown argument %s of type %s", obj, obj.getClass());
                } else {
                    sQLiteProgram.bindBlob(i11 + 1, (byte[]) obj);
                }
                sQLiteProgram.bindLong(i10, longValue);
            }
        }
    }

    public static void s(Context context, m6.f fVar, String str) {
        String path = context.getDatabasePath(t(str, fVar)).getPath();
        String str2 = path + "-wal";
        File file = new File(path);
        File file2 = new File(path + "-journal");
        File file3 = new File(str2);
        try {
            q6.s.a(file);
            q6.s.a(file2);
            q6.s.a(file3);
        } catch (IOException e10) {
            throw new com.google.firebase.firestore.z("Failed to clear persistence." + e10, z.a.UNKNOWN);
        }
    }

    public static String t(String str, m6.f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.k(), "utf-8") + "." + URLEncoder.encode(fVar.i(), "utf-8");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    private long x() {
        return ((Long) E("PRAGMA page_count").d(new q6.t() { // from class: l6.y2
            @Override // q6.t
            public final Object apply(Object obj) {
                Long B;
                B = z2.B((Cursor) obj);
                return B;
            }
        })).longValue();
    }

    private long y() {
        return ((Long) E("PRAGMA page_size").d(new q6.t() { // from class: l6.x2
            @Override // q6.t
            public final Object apply(Object obj) {
                Long C;
                C = z2.C((Cursor) obj);
                return C;
            }
        })).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    /* renamed from: A */
    public e4 h() {
        return this.f13406e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SQLiteStatement D(String str) {
        return this.f13411j.compileStatement(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d E(String str) {
        return new d(this.f13411j, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public l6.a a() {
        return this.f13407f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public l6.b b(h6.j jVar) {
        return new u1(this, this.f13405d, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public l c(h6.j jVar) {
        return new d2(this, this.f13405d, jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public b1 d(h6.j jVar, l lVar) {
        return new s2(this, this.f13405d, jVar, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public c1 e() {
        return new w2(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public k1 g() {
        return this.f13408g;
    }

    @Override // l6.e1
    public boolean i() {
        return this.f13412k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public <T> T j(String str, q6.y<T> yVar) {
        q6.v.a(e1.f13135a, "Starting transaction: %s", str);
        this.f13411j.beginTransactionWithListener(this.f13410i);
        try {
            T t10 = yVar.get();
            this.f13411j.setTransactionSuccessful();
            return t10;
        } finally {
            this.f13411j.endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // l6.e1
    public void k(String str, Runnable runnable) {
        q6.v.a(e1.f13135a, "Starting transaction: %s", str);
        this.f13411j.beginTransactionWithListener(this.f13410i);
        try {
            runnable.run();
            this.f13411j.setTransactionSuccessful();
        } finally {
            this.f13411j.endTransaction();
        }
    }

    @Override // l6.e1
    public void l() {
        q6.b.d(this.f13412k, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f13412k = false;
        this.f13411j.close();
        this.f13411j = null;
    }

    @Override // l6.e1
    public void m() {
        q6.b.d(!this.f13412k, "SQLitePersistence double-started!", new Object[0]);
        this.f13412k = true;
        try {
            this.f13411j = this.f13404c.getWritableDatabase();
            this.f13406e.B();
            this.f13409h.z(this.f13406e.r());
        } catch (SQLiteDatabaseLockedException e10) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u(SQLiteStatement sQLiteStatement, Object... objArr) {
        sQLiteStatement.clearBindings();
        r(sQLiteStatement, objArr);
        return sQLiteStatement.executeUpdateDelete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(String str, Object... objArr) {
        this.f13411j.execSQL(str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long w() {
        return x() * y();
    }

    @Override // l6.e1
    /* renamed from: z */
    public h2 f() {
        return this.f13409h;
    }
}
