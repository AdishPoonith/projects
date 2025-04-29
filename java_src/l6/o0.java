package l6;

import android.util.SparseArray;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import l6.o0;
import q6.g;
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: c  reason: collision with root package name */
    private static final long f13261c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f13262d;

    /* renamed from: a  reason: collision with root package name */
    private final k0 f13263a;

    /* renamed from: b  reason: collision with root package name */
    private final b f13264b;

    /* loaded from: classes.dex */
    public class a implements f4 {

        /* renamed from: a  reason: collision with root package name */
        private final q6.g f13265a;

        /* renamed from: b  reason: collision with root package name */
        private final i0 f13266b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f13267c = false;

        /* renamed from: d  reason: collision with root package name */
        private g.b f13268d;

        public a(q6.g gVar, i0 i0Var) {
            this.f13265a = gVar;
            this.f13266b = i0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            this.f13266b.y(o0.this);
            this.f13267c = true;
            c();
        }

        private void c() {
            this.f13268d = this.f13265a.k(g.d.GARBAGE_COLLECTION, this.f13267c ? o0.f13262d : o0.f13261c, new Runnable() { // from class: l6.n0
                @Override // java.lang.Runnable
                public final void run() {
                    o0.a.this.b();
                }
            });
        }

        @Override // l6.f4
        public void start() {
            if (o0.this.f13264b.f13270a != -1) {
                c();
            }
        }

        @Override // l6.f4
        public void stop() {
            g.b bVar = this.f13268d;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        long f13270a;

        /* renamed from: b  reason: collision with root package name */
        int f13271b;

        /* renamed from: c  reason: collision with root package name */
        final int f13272c;

        b(long j10, int i10, int i11) {
            this.f13270a = j10;
            this.f13271b = i10;
            this.f13272c = i11;
        }

        public static b a(long j10) {
            return new b(j10, 10, 1000);
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f13273a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13274b;

        /* renamed from: c  reason: collision with root package name */
        private final int f13275c;

        /* renamed from: d  reason: collision with root package name */
        private final int f13276d;

        c(boolean z10, int i10, int i11, int i12) {
            this.f13273a = z10;
            this.f13274b = i10;
            this.f13275c = i11;
            this.f13276d = i12;
        }

        static c a() {
            return new c(false, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: c  reason: collision with root package name */
        private static final Comparator<Long> f13277c = new Comparator() { // from class: l6.p0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int d10;
                d10 = o0.d.d((Long) obj, (Long) obj2);
                return d10;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private final PriorityQueue<Long> f13278a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13279b;

        d(int i10) {
            this.f13279b = i10;
            this.f13278a = new PriorityQueue<>(i10, f13277c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int d(Long l10, Long l11) {
            return l11.compareTo(l10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(Long l10) {
            if (this.f13278a.size() >= this.f13279b) {
                if (l10.longValue() >= this.f13278a.peek().longValue()) {
                    return;
                }
                this.f13278a.poll();
            }
            this.f13278a.add(l10);
        }

        long c() {
            return this.f13278a.peek().longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f13261c = timeUnit.toMillis(1L);
        f13262d = timeUnit.toMillis(5L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(k0 k0Var, b bVar) {
        this.f13263a = k0Var;
        this.f13264b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(d dVar, h4 h4Var) {
        dVar.b(Long.valueOf(h4Var.d()));
    }

    private c m(SparseArray<?> sparseArray) {
        Locale locale;
        long currentTimeMillis = System.currentTimeMillis();
        int e10 = e(this.f13264b.f13271b);
        if (e10 > this.f13264b.f13272c) {
            q6.v.a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f13264b.f13272c + " from " + e10, new Object[0]);
            e10 = this.f13264b.f13272c;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long h10 = h(e10);
        long currentTimeMillis3 = System.currentTimeMillis();
        int l10 = l(h10, sparseArray);
        long currentTimeMillis4 = System.currentTimeMillis();
        int k10 = k(h10);
        long currentTimeMillis5 = System.currentTimeMillis();
        if (q6.v.c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n\tCounted targets in " + (currentTimeMillis2 - currentTimeMillis) + "ms\n");
            sb.append(String.format(Locale.ROOT, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(e10), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)));
            q6.v.a("LruGarbageCollector", ((sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(l10), Long.valueOf(currentTimeMillis4 - currentTimeMillis3))) + String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(k10), Long.valueOf(currentTimeMillis5 - currentTimeMillis4))) + String.format(locale, "Total Duration: %dms", Long.valueOf(currentTimeMillis5 - currentTimeMillis)), new Object[0]);
        }
        return new c(true, e10, l10, k10);
    }

    int e(int i10) {
        return (int) ((i10 / 100.0f) * ((float) this.f13263a.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c f(SparseArray<?> sparseArray) {
        if (this.f13264b.f13270a == -1) {
            q6.v.a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
        } else {
            long g10 = g();
            if (g10 >= this.f13264b.f13270a) {
                return m(sparseArray);
            }
            q6.v.a("LruGarbageCollector", "Garbage collection skipped; Cache size " + g10 + " is lower than threshold " + this.f13264b.f13270a, new Object[0]);
        }
        return c.a();
    }

    long g() {
        return this.f13263a.l();
    }

    long h(int i10) {
        if (i10 == 0) {
            return -1L;
        }
        final d dVar = new d(i10);
        this.f13263a.h(new q6.n() { // from class: l6.l0
            @Override // q6.n
            public final void accept(Object obj) {
                o0.i(o0.d.this, (h4) obj);
            }
        });
        this.f13263a.b(new q6.n() { // from class: l6.m0
            @Override // q6.n
            public final void accept(Object obj) {
                o0.d.this.b((Long) obj);
            }
        });
        return dVar.c();
    }

    public a j(q6.g gVar, i0 i0Var) {
        return new a(gVar, i0Var);
    }

    int k(long j10) {
        return this.f13263a.d(j10);
    }

    int l(long j10, SparseArray<?> sparseArray) {
        return this.f13263a.c(j10, sparseArray);
    }
}
