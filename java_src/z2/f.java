package z2;

import a3.g;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o3.p;
import o3.p0;
import p3.l0;
import p3.n0;
import s1.n1;
import s1.q3;
import t1.t1;
import u2.t0;
/* loaded from: classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private final h f20734a;

    /* renamed from: b  reason: collision with root package name */
    private final o3.l f20735b;

    /* renamed from: c  reason: collision with root package name */
    private final o3.l f20736c;

    /* renamed from: d  reason: collision with root package name */
    private final s f20737d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri[] f20738e;

    /* renamed from: f  reason: collision with root package name */
    private final n1[] f20739f;

    /* renamed from: g  reason: collision with root package name */
    private final a3.l f20740g;

    /* renamed from: h  reason: collision with root package name */
    private final t0 f20741h;

    /* renamed from: i  reason: collision with root package name */
    private final List<n1> f20742i;

    /* renamed from: k  reason: collision with root package name */
    private final t1 f20744k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20745l;

    /* renamed from: n  reason: collision with root package name */
    private IOException f20747n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f20748o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f20749p;

    /* renamed from: q  reason: collision with root package name */
    private n3.t f20750q;

    /* renamed from: s  reason: collision with root package name */
    private boolean f20752s;

    /* renamed from: j  reason: collision with root package name */
    private final z2.e f20743j = new z2.e(4);

    /* renamed from: m  reason: collision with root package name */
    private byte[] f20746m = n0.f15402f;

    /* renamed from: r  reason: collision with root package name */
    private long f20751r = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends w2.l {

        /* renamed from: l  reason: collision with root package name */
        private byte[] f20753l;

        public a(o3.l lVar, o3.p pVar, n1 n1Var, int i10, Object obj, byte[] bArr) {
            super(lVar, pVar, 3, n1Var, i10, obj, bArr);
        }

        @Override // w2.l
        protected void g(byte[] bArr, int i10) {
            this.f20753l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f20753l;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public w2.f f20754a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f20755b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f20756c;

        public b() {
            a();
        }

        public void a() {
            this.f20754a = null;
            this.f20755b = false;
            this.f20756c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends w2.b {

        /* renamed from: e  reason: collision with root package name */
        private final List<g.e> f20757e;

        /* renamed from: f  reason: collision with root package name */
        private final long f20758f;

        /* renamed from: g  reason: collision with root package name */
        private final String f20759g;

        public c(String str, long j10, List<g.e> list) {
            super(0L, list.size() - 1);
            this.f20759g = str;
            this.f20758f = j10;
            this.f20757e = list;
        }

        @Override // w2.o
        public long a() {
            c();
            g.e eVar = this.f20757e.get((int) d());
            return this.f20758f + eVar.f122n + eVar.f120l;
        }

        @Override // w2.o
        public long b() {
            c();
            return this.f20758f + this.f20757e.get((int) d()).f122n;
        }
    }

    /* loaded from: classes.dex */
    private static final class d extends n3.c {

        /* renamed from: h  reason: collision with root package name */
        private int f20760h;

        public d(t0 t0Var, int[] iArr) {
            super(t0Var, iArr);
            this.f20760h = d(t0Var.b(iArr[0]));
        }

        @Override // n3.t
        public int n() {
            return 0;
        }

        @Override // n3.t
        public int o() {
            return this.f20760h;
        }

        @Override // n3.t
        public void p(long j10, long j11, long j12, List<? extends w2.n> list, w2.o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (g(this.f20760h, elapsedRealtime)) {
                for (int i10 = this.f14145b - 1; i10 >= 0; i10--) {
                    if (!g(i10, elapsedRealtime)) {
                        this.f20760h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // n3.t
        public Object r() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final g.e f20761a;

        /* renamed from: b  reason: collision with root package name */
        public final long f20762b;

        /* renamed from: c  reason: collision with root package name */
        public final int f20763c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f20764d;

        public e(g.e eVar, long j10, int i10) {
            this.f20761a = eVar;
            this.f20762b = j10;
            this.f20763c = i10;
            this.f20764d = (eVar instanceof g.b) && ((g.b) eVar).f112v;
        }
    }

    public f(h hVar, a3.l lVar, Uri[] uriArr, n1[] n1VarArr, g gVar, p0 p0Var, s sVar, List<n1> list, t1 t1Var) {
        this.f20734a = hVar;
        this.f20740g = lVar;
        this.f20738e = uriArr;
        this.f20739f = n1VarArr;
        this.f20737d = sVar;
        this.f20742i = list;
        this.f20744k = t1Var;
        o3.l a10 = gVar.a(1);
        this.f20735b = a10;
        if (p0Var != null) {
            a10.h(p0Var);
        }
        this.f20736c = gVar.a(3);
        this.f20741h = new t0(n1VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((n1VarArr[i10].f17412n & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f20750q = new d(this.f20741h, e5.e.k(arrayList));
    }

    private static Uri d(a3.g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f124p) == null) {
            return null;
        }
        return l0.e(gVar.f155a, str);
    }

    private Pair<Long, Integer> f(i iVar, boolean z10, a3.g gVar, long j10, long j11) {
        if (iVar != null && !z10) {
            if (iVar.h()) {
                Long valueOf = Long.valueOf(iVar.f20770o == -1 ? iVar.g() : iVar.f19837j);
                int i10 = iVar.f20770o;
                return new Pair<>(valueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
            return new Pair<>(Long.valueOf(iVar.f19837j), Integer.valueOf(iVar.f20770o));
        }
        long j12 = gVar.f109u + j10;
        if (iVar != null && !this.f20749p) {
            j11 = iVar.f19798g;
        }
        if (gVar.f103o || j11 < j12) {
            long j13 = j11 - j10;
            int i11 = 0;
            int f10 = n0.f(gVar.f106r, Long.valueOf(j13), true, !this.f20740g.a() || iVar == null);
            long j14 = f10 + gVar.f99k;
            if (f10 >= 0) {
                g.d dVar = gVar.f106r.get(f10);
                List<g.b> list = j13 < dVar.f122n + dVar.f120l ? dVar.f117v : gVar.f107s;
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    }
                    g.b bVar = list.get(i11);
                    if (j13 >= bVar.f122n + bVar.f120l) {
                        i11++;
                    } else if (bVar.f111u) {
                        j14 += list == gVar.f107s ? 1L : 0L;
                        r1 = i11;
                    }
                }
            }
            return new Pair<>(Long.valueOf(j14), Integer.valueOf(r1));
        }
        return new Pair<>(Long.valueOf(gVar.f99k + gVar.f106r.size()), -1);
    }

    private static e g(a3.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f99k);
        if (i11 == gVar.f106r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < gVar.f107s.size()) {
                return new e(gVar.f107s.get(i10), j10, i10);
            }
            return null;
        }
        g.d dVar = gVar.f106r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f117v.size()) {
            return new e(dVar.f117v.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < gVar.f106r.size()) {
            return new e(gVar.f106r.get(i12), j10 + 1, -1);
        }
        if (gVar.f107s.isEmpty()) {
            return null;
        }
        return new e(gVar.f107s.get(0), j10 + 1, 0);
    }

    static List<g.e> i(a3.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f99k);
        if (i11 < 0 || gVar.f106r.size() < i11) {
            return com.google.common.collect.q.z();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < gVar.f106r.size()) {
            if (i10 != -1) {
                g.d dVar = gVar.f106r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f117v.size()) {
                    List<g.b> list = dVar.f117v;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<g.d> list2 = gVar.f106r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (gVar.f102n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < gVar.f107s.size()) {
                List<g.b> list3 = gVar.f107s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private w2.f l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f20743j.c(uri);
        if (c10 != null) {
            this.f20743j.b(uri, c10);
            return null;
        }
        return new a(this.f20736c, new p.b().i(uri).b(1).a(), this.f20739f[i10], this.f20750q.n(), this.f20750q.r(), this.f20746m);
    }

    private long s(long j10) {
        long j11 = this.f20751r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void w(a3.g gVar) {
        this.f20751r = gVar.f103o ? -9223372036854775807L : gVar.e() - this.f20740g.m();
    }

    public w2.o[] a(i iVar, long j10) {
        int i10;
        int c10 = iVar == null ? -1 : this.f20741h.c(iVar.f19795d);
        int length = this.f20750q.length();
        w2.o[] oVarArr = new w2.o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int b10 = this.f20750q.b(i11);
            Uri uri = this.f20738e[b10];
            if (this.f20740g.e(uri)) {
                a3.g k10 = this.f20740g.k(uri, z10);
                p3.a.e(k10);
                long m10 = k10.f96h - this.f20740g.m();
                i10 = i11;
                Pair<Long, Integer> f10 = f(iVar, b10 != c10, k10, m10, j10);
                oVarArr[i10] = new c(k10.f155a, m10, i(k10, ((Long) f10.first).longValue(), ((Integer) f10.second).intValue()));
            } else {
                oVarArr[i11] = w2.o.f19838a;
                i10 = i11;
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return oVarArr;
    }

    public long b(long j10, q3 q3Var) {
        int o10 = this.f20750q.o();
        Uri[] uriArr = this.f20738e;
        a3.g k10 = (o10 >= uriArr.length || o10 == -1) ? null : this.f20740g.k(uriArr[this.f20750q.k()], true);
        if (k10 == null || k10.f106r.isEmpty() || !k10.f157c) {
            return j10;
        }
        long m10 = k10.f96h - this.f20740g.m();
        long j11 = j10 - m10;
        int f10 = n0.f(k10.f106r, Long.valueOf(j11), true, true);
        long j12 = k10.f106r.get(f10).f122n;
        return q3Var.a(j11, j12, f10 != k10.f106r.size() - 1 ? k10.f106r.get(f10 + 1).f122n : j12) + m10;
    }

    public int c(i iVar) {
        if (iVar.f20770o == -1) {
            return 1;
        }
        a3.g gVar = (a3.g) p3.a.e(this.f20740g.k(this.f20738e[this.f20741h.c(iVar.f19795d)], false));
        int i10 = (int) (iVar.f19837j - gVar.f99k);
        if (i10 < 0) {
            return 1;
        }
        List<g.b> list = i10 < gVar.f106r.size() ? gVar.f106r.get(i10).f117v : gVar.f107s;
        if (iVar.f20770o >= list.size()) {
            return 2;
        }
        g.b bVar = list.get(iVar.f20770o);
        if (bVar.f112v) {
            return 0;
        }
        return n0.c(Uri.parse(l0.d(gVar.f155a, bVar.f118j)), iVar.f19793b.f14512a) ? 1 : 2;
    }

    public void e(long j10, long j11, List<i> list, boolean z10, b bVar) {
        a3.g gVar;
        long j12;
        Uri uri;
        int i10;
        i iVar = list.isEmpty() ? null : (i) com.google.common.collect.t.c(list);
        int c10 = iVar == null ? -1 : this.f20741h.c(iVar.f19795d);
        long j13 = j11 - j10;
        long s10 = s(j10);
        if (iVar != null && !this.f20749p) {
            long d10 = iVar.d();
            j13 = Math.max(0L, j13 - d10);
            if (s10 != -9223372036854775807L) {
                s10 = Math.max(0L, s10 - d10);
            }
        }
        this.f20750q.p(j10, j13, s10, list, a(iVar, j11));
        int k10 = this.f20750q.k();
        boolean z11 = c10 != k10;
        Uri uri2 = this.f20738e[k10];
        if (!this.f20740g.e(uri2)) {
            bVar.f20756c = uri2;
            this.f20752s &= uri2.equals(this.f20748o);
            this.f20748o = uri2;
            return;
        }
        a3.g k11 = this.f20740g.k(uri2, true);
        p3.a.e(k11);
        this.f20749p = k11.f157c;
        w(k11);
        long m10 = k11.f96h - this.f20740g.m();
        Pair<Long, Integer> f10 = f(iVar, z11, k11, m10, j11);
        long longValue = ((Long) f10.first).longValue();
        int intValue = ((Integer) f10.second).intValue();
        if (longValue >= k11.f99k || iVar == null || !z11) {
            gVar = k11;
            j12 = m10;
            uri = uri2;
            i10 = k10;
        } else {
            Uri uri3 = this.f20738e[c10];
            a3.g k12 = this.f20740g.k(uri3, true);
            p3.a.e(k12);
            j12 = k12.f96h - this.f20740g.m();
            Pair<Long, Integer> f11 = f(iVar, false, k12, j12, j11);
            longValue = ((Long) f11.first).longValue();
            intValue = ((Integer) f11.second).intValue();
            i10 = c10;
            uri = uri3;
            gVar = k12;
        }
        if (longValue < gVar.f99k) {
            this.f20747n = new u2.b();
            return;
        }
        e g10 = g(gVar, longValue, intValue);
        if (g10 == null) {
            if (!gVar.f103o) {
                bVar.f20756c = uri;
                this.f20752s &= uri.equals(this.f20748o);
                this.f20748o = uri;
                return;
            } else if (z10 || gVar.f106r.isEmpty()) {
                bVar.f20755b = true;
                return;
            } else {
                g10 = new e((g.e) com.google.common.collect.t.c(gVar.f106r), (gVar.f99k + gVar.f106r.size()) - 1, -1);
            }
        }
        this.f20752s = false;
        this.f20748o = null;
        Uri d11 = d(gVar, g10.f20761a.f119k);
        w2.f l10 = l(d11, i10);
        bVar.f20754a = l10;
        if (l10 != null) {
            return;
        }
        Uri d12 = d(gVar, g10.f20761a);
        w2.f l11 = l(d12, i10);
        bVar.f20754a = l11;
        if (l11 != null) {
            return;
        }
        boolean w10 = i.w(iVar, uri, gVar, g10, j12);
        if (w10 && g10.f20764d) {
            return;
        }
        bVar.f20754a = i.j(this.f20734a, this.f20735b, this.f20739f[i10], j12, gVar, g10, uri, this.f20742i, this.f20750q.n(), this.f20750q.r(), this.f20745l, this.f20737d, iVar, this.f20743j.a(d12), this.f20743j.a(d11), w10, this.f20744k);
    }

    public int h(long j10, List<? extends w2.n> list) {
        return (this.f20747n != null || this.f20750q.length() < 2) ? list.size() : this.f20750q.j(j10, list);
    }

    public t0 j() {
        return this.f20741h;
    }

    public n3.t k() {
        return this.f20750q;
    }

    public boolean m(w2.f fVar, long j10) {
        n3.t tVar = this.f20750q;
        return tVar.f(tVar.u(this.f20741h.c(fVar.f19795d)), j10);
    }

    public void n() {
        IOException iOException = this.f20747n;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f20748o;
        if (uri == null || !this.f20752s) {
            return;
        }
        this.f20740g.h(uri);
    }

    public boolean o(Uri uri) {
        return n0.s(this.f20738e, uri);
    }

    public void p(w2.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f20746m = aVar.h();
            this.f20743j.b(aVar.f19793b.f14512a, (byte[]) p3.a.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j10) {
        int u10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f20738e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            } else if (uriArr[i10].equals(uri)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 || (u10 = this.f20750q.u(i10)) == -1) {
            return true;
        }
        this.f20752s |= uri.equals(this.f20748o);
        return j10 == -9223372036854775807L || (this.f20750q.f(u10, j10) && this.f20740g.c(uri, j10));
    }

    public void r() {
        this.f20747n = null;
    }

    public void t(boolean z10) {
        this.f20745l = z10;
    }

    public void u(n3.t tVar) {
        this.f20750q = tVar;
    }

    public boolean v(long j10, w2.f fVar, List<? extends w2.n> list) {
        if (this.f20747n != null) {
            return false;
        }
        return this.f20750q.l(j10, fVar, list);
    }
}
