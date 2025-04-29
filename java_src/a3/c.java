package a3;

import a3.c;
import a3.g;
import a3.h;
import a3.j;
import a3.l;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.common.collect.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.c0;
import o3.g0;
import o3.h0;
import o3.j0;
import p3.n0;
import s1.u2;
import u2.b0;
import u2.n;
import u2.q;
/* loaded from: classes.dex */
public final class c implements l, h0.b<j0<i>> {

    /* renamed from: y  reason: collision with root package name */
    public static final l.a f60y = new l.a() { // from class: a3.b
        @Override // a3.l.a
        public final l a(z2.g gVar, g0 g0Var, k kVar) {
            return new c(gVar, g0Var, kVar);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    private final z2.g f61j;

    /* renamed from: k  reason: collision with root package name */
    private final k f62k;

    /* renamed from: l  reason: collision with root package name */
    private final g0 f63l;

    /* renamed from: m  reason: collision with root package name */
    private final HashMap<Uri, C0003c> f64m;

    /* renamed from: n  reason: collision with root package name */
    private final CopyOnWriteArrayList<l.b> f65n;

    /* renamed from: o  reason: collision with root package name */
    private final double f66o;

    /* renamed from: p  reason: collision with root package name */
    private b0.a f67p;

    /* renamed from: q  reason: collision with root package name */
    private h0 f68q;

    /* renamed from: r  reason: collision with root package name */
    private Handler f69r;

    /* renamed from: s  reason: collision with root package name */
    private l.e f70s;

    /* renamed from: t  reason: collision with root package name */
    private h f71t;

    /* renamed from: u  reason: collision with root package name */
    private Uri f72u;

    /* renamed from: v  reason: collision with root package name */
    private g f73v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f74w;

    /* renamed from: x  reason: collision with root package name */
    private long f75x;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements l.b {
        private b() {
        }

        @Override // a3.l.b
        public void b() {
            c.this.f65n.remove(this);
        }

        @Override // a3.l.b
        public boolean d(Uri uri, g0.c cVar, boolean z10) {
            C0003c c0003c;
            if (c.this.f73v == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List<h.b> list = ((h) n0.j(c.this.f71t)).f136e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0003c c0003c2 = (C0003c) c.this.f64m.get(list.get(i11).f149a);
                    if (c0003c2 != null && elapsedRealtime < c0003c2.f84q) {
                        i10++;
                    }
                }
                g0.b c10 = c.this.f63l.c(new g0.a(1, 0, c.this.f71t.f136e.size(), i10), cVar);
                if (c10 != null && c10.f14438a == 2 && (c0003c = (C0003c) c.this.f64m.get(uri)) != null) {
                    c0003c.h(c10.f14439b);
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0003c implements h0.b<j0<i>> {

        /* renamed from: j  reason: collision with root package name */
        private final Uri f77j;

        /* renamed from: k  reason: collision with root package name */
        private final h0 f78k = new h0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: l  reason: collision with root package name */
        private final o3.l f79l;

        /* renamed from: m  reason: collision with root package name */
        private g f80m;

        /* renamed from: n  reason: collision with root package name */
        private long f81n;

        /* renamed from: o  reason: collision with root package name */
        private long f82o;

        /* renamed from: p  reason: collision with root package name */
        private long f83p;

        /* renamed from: q  reason: collision with root package name */
        private long f84q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f85r;

        /* renamed from: s  reason: collision with root package name */
        private IOException f86s;

        public C0003c(Uri uri) {
            this.f77j = uri;
            this.f79l = c.this.f61j.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h(long j10) {
            this.f84q = SystemClock.elapsedRealtime() + j10;
            return this.f77j.equals(c.this.f72u) && !c.this.L();
        }

        private Uri j() {
            g gVar = this.f80m;
            if (gVar != null) {
                g.f fVar = gVar.f110v;
                if (fVar.f129a != -9223372036854775807L || fVar.f133e) {
                    Uri.Builder buildUpon = this.f77j.buildUpon();
                    g gVar2 = this.f80m;
                    if (gVar2.f110v.f133e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f99k + gVar2.f106r.size()));
                        g gVar3 = this.f80m;
                        if (gVar3.f102n != -9223372036854775807L) {
                            List<g.b> list = gVar3.f107s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) t.c(list)).f112v) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f80m.f110v;
                    if (fVar2.f129a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f130b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f77j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(Uri uri) {
            this.f85r = false;
            p(uri);
        }

        private void p(Uri uri) {
            j0 j0Var = new j0(this.f79l, uri, 4, c.this.f62k.a(c.this.f71t, this.f80m));
            c.this.f67p.z(new n(j0Var.f14474a, j0Var.f14475b, this.f78k.n(j0Var, this, c.this.f63l.d(j0Var.f14476c))), j0Var.f14476c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(final Uri uri) {
            this.f84q = 0L;
            if (this.f85r || this.f78k.j() || this.f78k.i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f83p) {
                p(uri);
                return;
            }
            this.f85r = true;
            c.this.f69r.postDelayed(new Runnable() { // from class: a3.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0003c.this.m(uri);
                }
            }, this.f83p - elapsedRealtime);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(g gVar, n nVar) {
            IOException dVar;
            boolean z10;
            g gVar2 = this.f80m;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f81n = elapsedRealtime;
            g G = c.this.G(gVar2, gVar);
            this.f80m = G;
            boolean z11 = false;
            if (G != gVar2) {
                this.f86s = null;
                this.f82o = elapsedRealtime;
                c.this.R(this.f77j, G);
            } else if (!G.f103o) {
                g gVar3 = this.f80m;
                if (gVar.f99k + gVar.f106r.size() < gVar3.f99k) {
                    dVar = new l.c(this.f77j);
                    z10 = true;
                } else {
                    dVar = ((double) (elapsedRealtime - this.f82o)) > ((double) n0.Y0(gVar3.f101m)) * c.this.f66o ? new l.d(this.f77j) : null;
                    z10 = false;
                }
                if (dVar != null) {
                    this.f86s = dVar;
                    c.this.N(this.f77j, new g0.c(nVar, new q(4), dVar, 1), z10);
                }
            }
            long j10 = 0;
            g gVar4 = this.f80m;
            if (!gVar4.f110v.f133e) {
                j10 = gVar4.f101m;
                if (gVar4 == gVar2) {
                    j10 /= 2;
                }
            }
            this.f83p = elapsedRealtime + n0.Y0(j10);
            if (!((this.f80m.f102n != -9223372036854775807L || this.f77j.equals(c.this.f72u)) ? true : true) || this.f80m.f103o) {
                return;
            }
            q(j());
        }

        public g k() {
            return this.f80m;
        }

        public boolean l() {
            int i10;
            if (this.f80m == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, n0.Y0(this.f80m.f109u));
            g gVar = this.f80m;
            return gVar.f103o || (i10 = gVar.f92d) == 2 || i10 == 1 || this.f81n + max > elapsedRealtime;
        }

        public void n() {
            q(this.f77j);
        }

        public void r() {
            this.f78k.b();
            IOException iOException = this.f86s;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // o3.h0.b
        /* renamed from: s */
        public void i(j0<i> j0Var, long j10, long j11, boolean z10) {
            n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
            c.this.f63l.a(j0Var.f14474a);
            c.this.f67p.q(nVar, 4);
        }

        @Override // o3.h0.b
        /* renamed from: t */
        public void o(j0<i> j0Var, long j10, long j11) {
            i e10 = j0Var.e();
            n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
            if (e10 instanceof g) {
                w((g) e10, nVar);
                c.this.f67p.t(nVar, 4);
            } else {
                this.f86s = u2.c("Loaded playlist has unexpected type.", null);
                c.this.f67p.x(nVar, 4, this.f86s, true);
            }
            c.this.f63l.a(j0Var.f14474a);
        }

        @Override // o3.h0.b
        /* renamed from: v */
        public h0.c u(j0<i> j0Var, long j10, long j11, IOException iOException, int i10) {
            h0.c cVar;
            n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
            boolean z10 = iOException instanceof j.a;
            if ((j0Var.f().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof c0 ? ((c0) iOException).f14414m : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f83p = SystemClock.elapsedRealtime();
                    n();
                    ((b0.a) n0.j(c.this.f67p)).x(nVar, j0Var.f14476c, iOException, true);
                    return h0.f14452f;
                }
            }
            g0.c cVar2 = new g0.c(nVar, new q(j0Var.f14476c), iOException, i10);
            if (c.this.N(this.f77j, cVar2, false)) {
                long b10 = c.this.f63l.b(cVar2);
                cVar = b10 != -9223372036854775807L ? h0.h(false, b10) : h0.f14453g;
            } else {
                cVar = h0.f14452f;
            }
            boolean c10 = true ^ cVar.c();
            c.this.f67p.x(nVar, j0Var.f14476c, iOException, c10);
            if (c10) {
                c.this.f63l.a(j0Var.f14474a);
            }
            return cVar;
        }

        public void x() {
            this.f78k.l();
        }
    }

    public c(z2.g gVar, g0 g0Var, k kVar) {
        this(gVar, g0Var, kVar, 3.5d);
    }

    public c(z2.g gVar, g0 g0Var, k kVar, double d10) {
        this.f61j = gVar;
        this.f62k = kVar;
        this.f63l = g0Var;
        this.f66o = d10;
        this.f65n = new CopyOnWriteArrayList<>();
        this.f64m = new HashMap<>();
        this.f75x = -9223372036854775807L;
    }

    private void E(List<Uri> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f64m.put(uri, new C0003c(uri));
        }
    }

    private static g.d F(g gVar, g gVar2) {
        int i10 = (int) (gVar2.f99k - gVar.f99k);
        List<g.d> list = gVar.f106r;
        if (i10 < list.size()) {
            return list.get(i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g G(g gVar, g gVar2) {
        return !gVar2.f(gVar) ? gVar2.f103o ? gVar.d() : gVar : gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
    }

    private int H(g gVar, g gVar2) {
        g.d F;
        if (gVar2.f97i) {
            return gVar2.f98j;
        }
        g gVar3 = this.f73v;
        int i10 = gVar3 != null ? gVar3.f98j : 0;
        return (gVar == null || (F = F(gVar, gVar2)) == null) ? i10 : (gVar.f98j + F.f121m) - gVar2.f106r.get(0).f121m;
    }

    private long I(g gVar, g gVar2) {
        if (gVar2.f104p) {
            return gVar2.f96h;
        }
        g gVar3 = this.f73v;
        long j10 = gVar3 != null ? gVar3.f96h : 0L;
        if (gVar == null) {
            return j10;
        }
        int size = gVar.f106r.size();
        g.d F = F(gVar, gVar2);
        return F != null ? gVar.f96h + F.f122n : ((long) size) == gVar2.f99k - gVar.f99k ? gVar.e() : j10;
    }

    private Uri J(Uri uri) {
        g.c cVar;
        g gVar = this.f73v;
        if (gVar == null || !gVar.f110v.f133e || (cVar = gVar.f108t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f114b));
        int i10 = cVar.f115c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    private boolean K(Uri uri) {
        List<h.b> list = this.f71t.f136e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(list.get(i10).f149a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        List<h.b> list = this.f71t.f136e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0003c c0003c = (C0003c) p3.a.e(this.f64m.get(list.get(i10).f149a));
            if (elapsedRealtime > c0003c.f84q) {
                Uri uri = c0003c.f77j;
                this.f72u = uri;
                c0003c.q(J(uri));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (uri.equals(this.f72u) || !K(uri)) {
            return;
        }
        g gVar = this.f73v;
        if (gVar == null || !gVar.f103o) {
            this.f72u = uri;
            C0003c c0003c = this.f64m.get(uri);
            g gVar2 = c0003c.f80m;
            if (gVar2 == null || !gVar2.f103o) {
                c0003c.q(J(uri));
                return;
            }
            this.f73v = gVar2;
            this.f70s.m(gVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(Uri uri, g0.c cVar, boolean z10) {
        Iterator<l.b> it = this.f65n.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !it.next().d(uri, cVar, z10);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(Uri uri, g gVar) {
        if (uri.equals(this.f72u)) {
            if (this.f73v == null) {
                this.f74w = !gVar.f103o;
                this.f75x = gVar.f96h;
            }
            this.f73v = gVar;
            this.f70s.m(gVar);
        }
        Iterator<l.b> it = this.f65n.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // o3.h0.b
    /* renamed from: O */
    public void i(j0<i> j0Var, long j10, long j11, boolean z10) {
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.f63l.a(j0Var.f14474a);
        this.f67p.q(nVar, 4);
    }

    @Override // o3.h0.b
    /* renamed from: P */
    public void o(j0<i> j0Var, long j10, long j11) {
        i e10 = j0Var.e();
        boolean z10 = e10 instanceof g;
        h e11 = z10 ? h.e(e10.f155a) : (h) e10;
        this.f71t = e11;
        this.f72u = e11.f136e.get(0).f149a;
        this.f65n.add(new b());
        E(e11.f135d);
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        C0003c c0003c = this.f64m.get(this.f72u);
        if (z10) {
            c0003c.w((g) e10, nVar);
        } else {
            c0003c.n();
        }
        this.f63l.a(j0Var.f14474a);
        this.f67p.t(nVar, 4);
    }

    @Override // o3.h0.b
    /* renamed from: Q */
    public h0.c u(j0<i> j0Var, long j10, long j11, IOException iOException, int i10) {
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        long b10 = this.f63l.b(new g0.c(nVar, new q(j0Var.f14476c), iOException, i10));
        boolean z10 = b10 == -9223372036854775807L;
        this.f67p.x(nVar, j0Var.f14476c, iOException, z10);
        if (z10) {
            this.f63l.a(j0Var.f14474a);
        }
        return z10 ? h0.f14453g : h0.h(false, b10);
    }

    @Override // a3.l
    public boolean a() {
        return this.f74w;
    }

    @Override // a3.l
    public h b() {
        return this.f71t;
    }

    @Override // a3.l
    public boolean c(Uri uri, long j10) {
        C0003c c0003c = this.f64m.get(uri);
        if (c0003c != null) {
            return !c0003c.h(j10);
        }
        return false;
    }

    @Override // a3.l
    public void d(l.b bVar) {
        this.f65n.remove(bVar);
    }

    @Override // a3.l
    public boolean e(Uri uri) {
        return this.f64m.get(uri).l();
    }

    @Override // a3.l
    public void f() {
        h0 h0Var = this.f68q;
        if (h0Var != null) {
            h0Var.b();
        }
        Uri uri = this.f72u;
        if (uri != null) {
            h(uri);
        }
    }

    @Override // a3.l
    public void g(Uri uri, b0.a aVar, l.e eVar) {
        this.f69r = n0.w();
        this.f67p = aVar;
        this.f70s = eVar;
        j0 j0Var = new j0(this.f61j.a(4), uri, 4, this.f62k.b());
        p3.a.f(this.f68q == null);
        h0 h0Var = new h0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f68q = h0Var;
        aVar.z(new n(j0Var.f14474a, j0Var.f14475b, h0Var.n(j0Var, this, this.f63l.d(j0Var.f14476c))), j0Var.f14476c);
    }

    @Override // a3.l
    public void h(Uri uri) {
        this.f64m.get(uri).r();
    }

    @Override // a3.l
    public void j(Uri uri) {
        this.f64m.get(uri).n();
    }

    @Override // a3.l
    public g k(Uri uri, boolean z10) {
        g k10 = this.f64m.get(uri).k();
        if (k10 != null && z10) {
            M(uri);
        }
        return k10;
    }

    @Override // a3.l
    public void l(l.b bVar) {
        p3.a.e(bVar);
        this.f65n.add(bVar);
    }

    @Override // a3.l
    public long m() {
        return this.f75x;
    }

    @Override // a3.l
    public void stop() {
        this.f72u = null;
        this.f73v = null;
        this.f71t = null;
        this.f75x = -9223372036854775807L;
        this.f68q.l();
        this.f68q = null;
        for (C0003c c0003c : this.f64m.values()) {
            c0003c.x();
        }
        this.f69r.removeCallbacksAndMessages(null);
        this.f69r = null;
        this.f64m.clear();
    }
}
