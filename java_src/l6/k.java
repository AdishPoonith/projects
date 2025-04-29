package l6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l6.k;
import m6.q;
import q6.g;
/* loaded from: classes.dex */
public class k {

    /* renamed from: f  reason: collision with root package name */
    private static final long f13218f = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: g  reason: collision with root package name */
    private static final long f13219g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a  reason: collision with root package name */
    private final a f13220a;

    /* renamed from: b  reason: collision with root package name */
    private final e1 f13221b;

    /* renamed from: c  reason: collision with root package name */
    private final b5.t<l> f13222c;

    /* renamed from: d  reason: collision with root package name */
    private final b5.t<n> f13223d;

    /* renamed from: e  reason: collision with root package name */
    private int f13224e;

    /* loaded from: classes.dex */
    public class a implements f4 {

        /* renamed from: a  reason: collision with root package name */
        private g.b f13225a;

        /* renamed from: b  reason: collision with root package name */
        private final q6.g f13226b;

        public a(q6.g gVar) {
            this.f13226b = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            q6.v.a("IndexBackfiller", "Documents written: %s", Integer.valueOf(k.this.d()));
            c(k.f13219g);
        }

        private void c(long j10) {
            this.f13225a = this.f13226b.k(g.d.INDEX_BACKFILL, j10, new Runnable() { // from class: l6.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.a.this.b();
                }
            });
        }

        @Override // l6.f4
        public void start() {
            c(k.f13218f);
        }

        @Override // l6.f4
        public void stop() {
            g.b bVar = this.f13225a;
            if (bVar != null) {
                bVar.c();
            }
        }
    }

    public k(e1 e1Var, q6.g gVar, b5.t<l> tVar, b5.t<n> tVar2) {
        this.f13224e = 50;
        this.f13221b = e1Var;
        this.f13220a = new a(gVar);
        this.f13222c = tVar;
        this.f13223d = tVar2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(e1 e1Var, q6.g gVar, final i0 i0Var) {
        this(e1Var, gVar, new b5.t() { // from class: l6.g
            @Override // b5.t
            public final Object get() {
                return i0.this.C();
            }
        }, new b5.t() { // from class: l6.h
            @Override // b5.t
            public final Object get() {
                return i0.this.G();
            }
        });
        Objects.requireNonNull(i0Var);
    }

    private q.a e(q.a aVar, m mVar) {
        Iterator<Map.Entry<m6.l, m6.i>> it = mVar.c().iterator();
        q.a aVar2 = aVar;
        while (it.hasNext()) {
            q.a k10 = q.a.k(it.next().getValue());
            if (k10.compareTo(aVar2) > 0) {
                aVar2 = k10;
            }
        }
        return q.a.h(aVar2.o(), aVar2.l(), Math.max(mVar.b(), aVar.n()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer g() {
        return Integer.valueOf(i());
    }

    private int h(String str, int i10) {
        l lVar = this.f13222c.get();
        q.a e10 = lVar.e(str);
        m j10 = this.f13223d.get().j(str, e10, i10);
        lVar.i(j10.c());
        q.a e11 = e(e10, j10);
        q6.v.a("IndexBackfiller", "Updating offset: %s", e11);
        lVar.h(str, e11);
        return j10.c().size();
    }

    private int i() {
        l lVar = this.f13222c.get();
        HashSet hashSet = new HashSet();
        int i10 = this.f13224e;
        while (i10 > 0) {
            String l10 = lVar.l();
            if (l10 == null || hashSet.contains(l10)) {
                break;
            }
            q6.v.a("IndexBackfiller", "Processing collection: %s", l10);
            i10 -= h(l10, i10);
            hashSet.add(l10);
        }
        return this.f13224e - i10;
    }

    public int d() {
        return ((Integer) this.f13221b.j("Backfill Indexes", new q6.y() { // from class: l6.i
            @Override // q6.y
            public final Object get() {
                Integer g10;
                g10 = k.this.g();
                return g10;
            }
        })).intValue();
    }

    public a f() {
        return this.f13220a;
    }
}
