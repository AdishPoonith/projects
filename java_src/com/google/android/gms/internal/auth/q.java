package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class q implements v {

    /* renamed from: h  reason: collision with root package name */
    private static final Map f4213h = new s.a();

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f4214i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f4215a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f4216b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f4217c;

    /* renamed from: d  reason: collision with root package name */
    private final ContentObserver f4218d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f4219e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Map f4220f;

    /* renamed from: g  reason: collision with root package name */
    private final List f4221g;

    private q(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        p pVar = new p(this, null);
        this.f4218d = pVar;
        this.f4219e = new Object();
        this.f4221g = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f4215a = contentResolver;
        this.f4216b = uri;
        this.f4217c = runnable;
        contentResolver.registerContentObserver(uri, false, pVar);
    }

    public static q b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        q qVar;
        synchronized (q.class) {
            Map map = f4213h;
            qVar = (q) map.get(uri);
            if (qVar == null) {
                try {
                    q qVar2 = new q(contentResolver, uri, runnable);
                    try {
                        map.put(uri, qVar2);
                    } catch (SecurityException unused) {
                    }
                    qVar = qVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void d() {
        synchronized (q.class) {
            for (q qVar : f4213h.values()) {
                qVar.f4215a.unregisterContentObserver(qVar.f4218d);
            }
            f4213h.clear();
        }
    }

    @Override // com.google.android.gms.internal.auth.v
    public final /* bridge */ /* synthetic */ Object a(String str) {
        Map map;
        Map map2 = this.f4220f;
        if (map2 == null) {
            synchronized (this.f4219e) {
                map2 = this.f4220f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) t.a(new u() { // from class: com.google.android.gms.internal.auth.o
                            @Override // com.google.android.gms.internal.auth.u
                            public final Object zza() {
                                return q.this.c();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f4220f = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return (String) map2.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map c() {
        Cursor query = this.f4215a.query(this.f4216b, f4214i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new s.a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            return aVar;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.f4219e) {
            this.f4220f = null;
            n0.d();
        }
        synchronized (this) {
            for (r rVar : this.f4221g) {
                rVar.zza();
            }
        }
    }
}
