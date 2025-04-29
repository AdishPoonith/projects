package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import n3.t;
import o3.c0;
import o3.g0;
import o3.i0;
import o3.l;
import o3.p0;
import p3.n0;
import s1.n1;
import s1.q3;
import t1.t1;
import w2.g;
import w2.h;
import w2.k;
import w2.m;
import w2.n;
import w2.o;
import w2.p;
import x2.f;
import y2.i;
import y2.j;
/* loaded from: classes.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a  reason: collision with root package name */
    private final i0 f3557a;

    /* renamed from: b  reason: collision with root package name */
    private final x2.b f3558b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f3559c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3560d;

    /* renamed from: e  reason: collision with root package name */
    private final l f3561e;

    /* renamed from: f  reason: collision with root package name */
    private final long f3562f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3563g;

    /* renamed from: h  reason: collision with root package name */
    private final e.c f3564h;

    /* renamed from: i  reason: collision with root package name */
    protected final b[] f3565i;

    /* renamed from: j  reason: collision with root package name */
    private t f3566j;

    /* renamed from: k  reason: collision with root package name */
    private y2.c f3567k;

    /* renamed from: l  reason: collision with root package name */
    private int f3568l;

    /* renamed from: m  reason: collision with root package name */
    private IOException f3569m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f3570n;

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0082a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f3571a;

        /* renamed from: b  reason: collision with root package name */
        private final int f3572b;

        /* renamed from: c  reason: collision with root package name */
        private final g.a f3573c;

        public a(l.a aVar) {
            this(aVar, 1);
        }

        public a(l.a aVar, int i10) {
            this(w2.e.f19774s, aVar, i10);
        }

        public a(g.a aVar, l.a aVar2, int i10) {
            this.f3573c = aVar;
            this.f3571a = aVar2;
            this.f3572b = i10;
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0082a
        public com.google.android.exoplayer2.source.dash.a a(i0 i0Var, y2.c cVar, x2.b bVar, int i10, int[] iArr, t tVar, int i11, long j10, boolean z10, List<n1> list, e.c cVar2, p0 p0Var, t1 t1Var) {
            l a10 = this.f3571a.a();
            if (p0Var != null) {
                a10.h(p0Var);
            }
            return new c(this.f3573c, i0Var, cVar, bVar, i10, iArr, tVar, i11, a10, j10, this.f3572b, z10, list, cVar2, t1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final g f3574a;

        /* renamed from: b  reason: collision with root package name */
        public final j f3575b;

        /* renamed from: c  reason: collision with root package name */
        public final y2.b f3576c;

        /* renamed from: d  reason: collision with root package name */
        public final f f3577d;

        /* renamed from: e  reason: collision with root package name */
        private final long f3578e;

        /* renamed from: f  reason: collision with root package name */
        private final long f3579f;

        b(long j10, j jVar, y2.b bVar, g gVar, long j11, f fVar) {
            this.f3578e = j10;
            this.f3575b = jVar;
            this.f3576c = bVar;
            this.f3579f = j11;
            this.f3574a = gVar;
            this.f3577d = fVar;
        }

        b b(long j10, j jVar) {
            long a10;
            long a11;
            f l10 = this.f3575b.l();
            f l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f3576c, this.f3574a, this.f3579f, l10);
            }
            if (l10.g()) {
                long i10 = l10.i(j10);
                if (i10 == 0) {
                    return new b(j10, jVar, this.f3576c, this.f3574a, this.f3579f, l11);
                }
                long h10 = l10.h();
                long d10 = l10.d(h10);
                long j11 = (i10 + h10) - 1;
                long h11 = l11.h();
                long d11 = l11.d(h11);
                long j12 = this.f3579f;
                int i11 = ((l10.d(j11) + l10.b(j11, j10)) > d11 ? 1 : ((l10.d(j11) + l10.b(j11, j10)) == d11 ? 0 : -1));
                if (i11 == 0) {
                    a10 = j11 + 1;
                } else if (i11 < 0) {
                    throw new u2.b();
                } else {
                    if (d11 < d10) {
                        a11 = j12 - (l11.a(d10, j10) - h10);
                        return new b(j10, jVar, this.f3576c, this.f3574a, a11, l11);
                    }
                    a10 = l10.a(d11, j10);
                }
                a11 = j12 + (a10 - h11);
                return new b(j10, jVar, this.f3576c, this.f3574a, a11, l11);
            }
            return new b(j10, jVar, this.f3576c, this.f3574a, this.f3579f, l11);
        }

        b c(f fVar) {
            return new b(this.f3578e, this.f3575b, this.f3576c, this.f3574a, this.f3579f, fVar);
        }

        b d(y2.b bVar) {
            return new b(this.f3578e, this.f3575b, bVar, this.f3574a, this.f3579f, this.f3577d);
        }

        public long e(long j10) {
            return this.f3577d.c(this.f3578e, j10) + this.f3579f;
        }

        public long f() {
            return this.f3577d.h() + this.f3579f;
        }

        public long g(long j10) {
            return (e(j10) + this.f3577d.j(this.f3578e, j10)) - 1;
        }

        public long h() {
            return this.f3577d.i(this.f3578e);
        }

        public long i(long j10) {
            return k(j10) + this.f3577d.b(j10 - this.f3579f, this.f3578e);
        }

        public long j(long j10) {
            return this.f3577d.a(j10, this.f3578e) + this.f3579f;
        }

        public long k(long j10) {
            return this.f3577d.d(j10 - this.f3579f);
        }

        public i l(long j10) {
            return this.f3577d.f(j10 - this.f3579f);
        }

        public boolean m(long j10, long j11) {
            return this.f3577d.g() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected static final class C0083c extends w2.b {

        /* renamed from: e  reason: collision with root package name */
        private final b f3580e;

        /* renamed from: f  reason: collision with root package name */
        private final long f3581f;

        public C0083c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f3580e = bVar;
            this.f3581f = j12;
        }

        @Override // w2.o
        public long a() {
            c();
            return this.f3580e.i(d());
        }

        @Override // w2.o
        public long b() {
            c();
            return this.f3580e.k(d());
        }
    }

    public c(g.a aVar, i0 i0Var, y2.c cVar, x2.b bVar, int i10, int[] iArr, t tVar, int i11, l lVar, long j10, int i12, boolean z10, List<n1> list, e.c cVar2, t1 t1Var) {
        this.f3557a = i0Var;
        this.f3567k = cVar;
        this.f3558b = bVar;
        this.f3559c = iArr;
        this.f3566j = tVar;
        this.f3560d = i11;
        this.f3561e = lVar;
        this.f3568l = i10;
        this.f3562f = j10;
        this.f3563g = i12;
        this.f3564h = cVar2;
        long g10 = cVar.g(i10);
        ArrayList<j> o10 = o();
        this.f3565i = new b[tVar.length()];
        int i13 = 0;
        while (i13 < this.f3565i.length) {
            j jVar = o10.get(tVar.b(i13));
            y2.b j11 = bVar.j(jVar.f20433c);
            b[] bVarArr = this.f3565i;
            if (j11 == null) {
                j11 = jVar.f20433c.get(0);
            }
            int i14 = i13;
            bVarArr[i14] = new b(g10, jVar, j11, aVar.a(i11, jVar.f20432b, z10, list, cVar2, t1Var), 0L, jVar.l());
            i13 = i14 + 1;
        }
    }

    private g0.a l(t tVar, List<y2.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (tVar.g(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = x2.b.f(list);
        return new g0.a(f10, f10 - this.f3558b.g(list), length, i10);
    }

    private long m(long j10, long j11) {
        if (!this.f3567k.f20385d || this.f3565i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(n(j10), this.f3565i[0].i(this.f3565i[0].g(j10))) - j11);
    }

    private long n(long j10) {
        y2.c cVar = this.f3567k;
        long j11 = cVar.f20382a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - n0.B0(j11 + cVar.d(this.f3568l).f20418b);
    }

    private ArrayList<j> o() {
        List<y2.a> list = this.f3567k.d(this.f3568l).f20419c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i10 : this.f3559c) {
            arrayList.addAll(list.get(i10).f20374c);
        }
        return arrayList;
    }

    private long p(b bVar, n nVar, long j10, long j11, long j12) {
        return nVar != null ? nVar.g() : n0.r(bVar.j(j10), j11, j12);
    }

    private b s(int i10) {
        b bVar = this.f3565i[i10];
        y2.b j10 = this.f3558b.j(bVar.f3575b.f20433c);
        if (j10 == null || j10.equals(bVar.f3576c)) {
            return bVar;
        }
        b d10 = bVar.d(j10);
        this.f3565i[i10] = d10;
        return d10;
    }

    @Override // w2.j
    public void a() {
        for (b bVar : this.f3565i) {
            g gVar = bVar.f3574a;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    @Override // w2.j
    public void b() {
        IOException iOException = this.f3569m;
        if (iOException != null) {
            throw iOException;
        }
        this.f3557a.b();
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void c(t tVar) {
        this.f3566j = tVar;
    }

    @Override // w2.j
    public boolean d(long j10, w2.f fVar, List<? extends n> list) {
        if (this.f3569m != null) {
            return false;
        }
        return this.f3566j.l(j10, fVar, list);
    }

    @Override // w2.j
    public long e(long j10, q3 q3Var) {
        b[] bVarArr;
        for (b bVar : this.f3565i) {
            if (bVar.f3577d != null) {
                long h10 = bVar.h();
                if (h10 != 0) {
                    long j11 = bVar.j(j10);
                    long k10 = bVar.k(j11);
                    return q3Var.a(j10, k10, (k10 >= j10 || (h10 != -1 && j11 >= (bVar.f() + h10) - 1)) ? k10 : bVar.k(j11 + 1));
                }
            }
        }
        return j10;
    }

    @Override // w2.j
    public int g(long j10, List<? extends n> list) {
        return (this.f3569m != null || this.f3566j.length() < 2) ? list.size() : this.f3566j.j(j10, list);
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void h(y2.c cVar, int i10) {
        try {
            this.f3567k = cVar;
            this.f3568l = i10;
            long g10 = cVar.g(i10);
            ArrayList<j> o10 = o();
            for (int i11 = 0; i11 < this.f3565i.length; i11++) {
                b[] bVarArr = this.f3565i;
                bVarArr[i11] = bVarArr[i11].b(g10, o10.get(this.f3566j.b(i11)));
            }
        } catch (u2.b e10) {
            this.f3569m = e10;
        }
    }

    @Override // w2.j
    public void i(long j10, long j11, List<? extends n> list, h hVar) {
        int i10;
        int i11;
        o[] oVarArr;
        long j12;
        long j13;
        if (this.f3569m != null) {
            return;
        }
        long j14 = j11 - j10;
        long B0 = n0.B0(this.f3567k.f20382a) + n0.B0(this.f3567k.d(this.f3568l).f20418b) + j11;
        e.c cVar = this.f3564h;
        if (cVar == null || !cVar.h(B0)) {
            long B02 = n0.B0(n0.a0(this.f3562f));
            long n10 = n(B02);
            n nVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = this.f3566j.length();
            o[] oVarArr2 = new o[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = this.f3565i[i12];
                if (bVar.f3577d == null) {
                    oVarArr2[i12] = o.f19838a;
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = B02;
                } else {
                    long e10 = bVar.e(B02);
                    long g10 = bVar.g(B02);
                    i10 = i12;
                    i11 = length;
                    oVarArr = oVarArr2;
                    j12 = j14;
                    j13 = B02;
                    long p10 = p(bVar, nVar, j11, e10, g10);
                    if (p10 < e10) {
                        oVarArr[i10] = o.f19838a;
                    } else {
                        oVarArr[i10] = new C0083c(s(i10), p10, g10, n10);
                    }
                }
                i12 = i10 + 1;
                B02 = j13;
                oVarArr2 = oVarArr;
                length = i11;
                j14 = j12;
            }
            long j15 = j14;
            long j16 = B02;
            this.f3566j.p(j10, j15, m(j16, j10), list, oVarArr2);
            b s10 = s(this.f3566j.o());
            g gVar = s10.f3574a;
            if (gVar != null) {
                j jVar = s10.f3575b;
                i n11 = gVar.f() == null ? jVar.n() : null;
                i m10 = s10.f3577d == null ? jVar.m() : null;
                if (n11 != null || m10 != null) {
                    hVar.f19801a = q(s10, this.f3561e, this.f3566j.m(), this.f3566j.n(), this.f3566j.r(), n11, m10);
                    return;
                }
            }
            long j17 = s10.f3578e;
            int i13 = (j17 > (-9223372036854775807L) ? 1 : (j17 == (-9223372036854775807L) ? 0 : -1));
            boolean z10 = i13 != 0;
            if (s10.h() == 0) {
                hVar.f19802b = z10;
                return;
            }
            long e11 = s10.e(j16);
            long g11 = s10.g(j16);
            long p11 = p(s10, nVar, j11, e11, g11);
            if (p11 < e11) {
                this.f3569m = new u2.b();
                return;
            }
            int i14 = (p11 > g11 ? 1 : (p11 == g11 ? 0 : -1));
            if (i14 > 0 || (this.f3570n && i14 >= 0)) {
                hVar.f19802b = z10;
            } else if (z10 && s10.k(p11) >= j17) {
                hVar.f19802b = true;
            } else {
                int min = (int) Math.min(this.f3563g, (g11 - p11) + 1);
                if (i13 != 0) {
                    while (min > 1 && s10.k((min + p11) - 1) >= j17) {
                        min--;
                    }
                }
                hVar.f19801a = r(s10, this.f3561e, this.f3560d, this.f3566j.m(), this.f3566j.n(), this.f3566j.r(), p11, min, list.isEmpty() ? j11 : -9223372036854775807L, n10);
            }
        }
    }

    @Override // w2.j
    public boolean j(w2.f fVar, boolean z10, g0.c cVar, g0 g0Var) {
        g0.b c10;
        if (z10) {
            e.c cVar2 = this.f3564h;
            if (cVar2 == null || !cVar2.j(fVar)) {
                if (!this.f3567k.f20385d && (fVar instanceof n)) {
                    IOException iOException = cVar.f14442c;
                    if ((iOException instanceof c0) && ((c0) iOException).f14414m == 404) {
                        b bVar = this.f3565i[this.f3566j.d(fVar.f19795d)];
                        long h10 = bVar.h();
                        if (h10 != -1 && h10 != 0) {
                            if (((n) fVar).g() > (bVar.f() + h10) - 1) {
                                this.f3570n = true;
                                return true;
                            }
                        }
                    }
                }
                b bVar2 = this.f3565i[this.f3566j.d(fVar.f19795d)];
                y2.b j10 = this.f3558b.j(bVar2.f3575b.f20433c);
                if (j10 == null || bVar2.f3576c.equals(j10)) {
                    g0.a l10 = l(this.f3566j, bVar2.f3575b.f20433c);
                    if ((l10.a(2) || l10.a(1)) && (c10 = g0Var.c(l10, cVar)) != null && l10.a(c10.f14438a)) {
                        int i10 = c10.f14438a;
                        if (i10 == 2) {
                            t tVar = this.f3566j;
                            return tVar.f(tVar.d(fVar.f19795d), c10.f14439b);
                        } else if (i10 == 1) {
                            this.f3558b.e(bVar2.f3576c, c10.f14439b);
                            return true;
                        } else {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // w2.j
    public void k(w2.f fVar) {
        x1.d e10;
        if (fVar instanceof m) {
            int d10 = this.f3566j.d(((m) fVar).f19795d);
            b bVar = this.f3565i[d10];
            if (bVar.f3577d == null && (e10 = bVar.f3574a.e()) != null) {
                this.f3565i[d10] = bVar.c(new x2.h(e10, bVar.f3575b.f20434d));
            }
        }
        e.c cVar = this.f3564h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    protected w2.f q(b bVar, l lVar, n1 n1Var, int i10, Object obj, i iVar, i iVar2) {
        i iVar3 = iVar;
        j jVar = bVar.f3575b;
        if (iVar3 != null) {
            i a10 = iVar3.a(iVar2, bVar.f3576c.f20378a);
            if (a10 != null) {
                iVar3 = a10;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(lVar, x2.g.a(jVar, bVar.f3576c.f20378a, iVar3, 0), n1Var, i10, obj, bVar.f3574a);
    }

    protected w2.f r(b bVar, l lVar, int i10, n1 n1Var, int i11, Object obj, long j10, int i12, long j11, long j12) {
        j jVar = bVar.f3575b;
        long k10 = bVar.k(j10);
        i l10 = bVar.l(j10);
        if (bVar.f3574a == null) {
            return new p(lVar, x2.g.a(jVar, bVar.f3576c.f20378a, l10, bVar.m(j10, j12) ? 0 : 8), n1Var, i11, obj, k10, bVar.i(j10), j10, i10, n1Var);
        }
        int i13 = 1;
        int i14 = 1;
        while (i13 < i12) {
            i a10 = l10.a(bVar.l(i13 + j10), bVar.f3576c.f20378a);
            if (a10 == null) {
                break;
            }
            i14++;
            i13++;
            l10 = a10;
        }
        long j13 = (i14 + j10) - 1;
        long i15 = bVar.i(j13);
        long j14 = bVar.f3578e;
        return new k(lVar, x2.g.a(jVar, bVar.f3576c.f20378a, l10, bVar.m(j13, j12) ? 0 : 8), n1Var, i11, obj, k10, i15, j11, (j14 == -9223372036854775807L || j14 > i15) ? -9223372036854775807L : j14, j10, i14, -jVar.f20434d, bVar.f3574a);
    }
}
