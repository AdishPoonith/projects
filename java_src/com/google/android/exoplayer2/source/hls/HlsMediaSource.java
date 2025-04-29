package com.google.android.exoplayer2.source.hls;

import a3.e;
import a3.g;
import a3.k;
import a3.l;
import android.os.Looper;
import java.util.List;
import o3.b;
import o3.g0;
import o3.l;
import o3.p0;
import o3.x;
import p3.n0;
import s1.k1;
import s1.v1;
import u2.b0;
import u2.i;
import u2.q0;
import u2.r;
import u2.u;
import w1.b0;
import w1.y;
import z2.c;
import z2.g;
import z2.h;
/* loaded from: classes.dex */
public final class HlsMediaSource extends u2.a implements l.e {
    private final long A;
    private final v1 B;
    private v1.g C;
    private p0 D;

    /* renamed from: q  reason: collision with root package name */
    private final h f3607q;

    /* renamed from: r  reason: collision with root package name */
    private final v1.h f3608r;

    /* renamed from: s  reason: collision with root package name */
    private final g f3609s;

    /* renamed from: t  reason: collision with root package name */
    private final u2.h f3610t;

    /* renamed from: u  reason: collision with root package name */
    private final y f3611u;

    /* renamed from: v  reason: collision with root package name */
    private final g0 f3612v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f3613w;

    /* renamed from: x  reason: collision with root package name */
    private final int f3614x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f3615y;

    /* renamed from: z  reason: collision with root package name */
    private final l f3616z;

    /* loaded from: classes.dex */
    public static final class Factory implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final g f3617a;

        /* renamed from: b  reason: collision with root package name */
        private h f3618b;

        /* renamed from: c  reason: collision with root package name */
        private k f3619c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f3620d;

        /* renamed from: e  reason: collision with root package name */
        private u2.h f3621e;

        /* renamed from: f  reason: collision with root package name */
        private b0 f3622f;

        /* renamed from: g  reason: collision with root package name */
        private g0 f3623g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f3624h;

        /* renamed from: i  reason: collision with root package name */
        private int f3625i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3626j;

        /* renamed from: k  reason: collision with root package name */
        private long f3627k;

        public Factory(l.a aVar) {
            this(new c(aVar));
        }

        public Factory(g gVar) {
            this.f3617a = (g) p3.a.e(gVar);
            this.f3622f = new w1.l();
            this.f3619c = new a3.a();
            this.f3620d = a3.c.f60y;
            this.f3618b = h.f20765a;
            this.f3623g = new x();
            this.f3621e = new i();
            this.f3625i = 1;
            this.f3627k = -9223372036854775807L;
            this.f3624h = true;
        }

        public HlsMediaSource a(v1 v1Var) {
            p3.a.e(v1Var.f17603k);
            k kVar = this.f3619c;
            List<t2.c> list = v1Var.f17603k.f17679d;
            if (!list.isEmpty()) {
                kVar = new e(kVar, list);
            }
            g gVar = this.f3617a;
            h hVar = this.f3618b;
            u2.h hVar2 = this.f3621e;
            y a10 = this.f3622f.a(v1Var);
            g0 g0Var = this.f3623g;
            return new HlsMediaSource(v1Var, gVar, hVar, hVar2, a10, g0Var, this.f3620d.a(this.f3617a, g0Var, kVar), this.f3627k, this.f3624h, this.f3625i, this.f3626j);
        }
    }

    static {
        k1.a("goog.exo.hls");
    }

    private HlsMediaSource(v1 v1Var, g gVar, h hVar, u2.h hVar2, y yVar, g0 g0Var, a3.l lVar, long j10, boolean z10, int i10, boolean z11) {
        this.f3608r = (v1.h) p3.a.e(v1Var.f17603k);
        this.B = v1Var;
        this.C = v1Var.f17605m;
        this.f3609s = gVar;
        this.f3607q = hVar;
        this.f3610t = hVar2;
        this.f3611u = yVar;
        this.f3612v = g0Var;
        this.f3616z = lVar;
        this.A = j10;
        this.f3613w = z10;
        this.f3614x = i10;
        this.f3615y = z11;
    }

    private q0 F(a3.g gVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long m10 = gVar.f96h - this.f3616z.m();
        long j12 = gVar.f103o ? m10 + gVar.f109u : -9223372036854775807L;
        long J = J(gVar);
        long j13 = this.C.f17666j;
        M(gVar, n0.r(j13 != -9223372036854775807L ? n0.B0(j13) : L(gVar, J), J, gVar.f109u + J));
        return new q0(j10, j11, -9223372036854775807L, j12, gVar.f109u, m10, K(gVar, J), true, !gVar.f103o, gVar.f92d == 2 && gVar.f94f, aVar, this.B, this.C);
    }

    private q0 G(a3.g gVar, long j10, long j11, com.google.android.exoplayer2.source.hls.a aVar) {
        long j12;
        if (gVar.f93e == -9223372036854775807L || gVar.f106r.isEmpty()) {
            j12 = 0;
        } else {
            if (!gVar.f95g) {
                long j13 = gVar.f93e;
                if (j13 != gVar.f109u) {
                    j12 = I(gVar.f106r, j13).f122n;
                }
            }
            j12 = gVar.f93e;
        }
        long j14 = gVar.f109u;
        return new q0(j10, j11, -9223372036854775807L, j14, j14, 0L, j12, true, false, true, aVar, this.B, null);
    }

    private static g.b H(List<g.b> list, long j10) {
        g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            g.b bVar2 = list.get(i10);
            long j11 = bVar2.f122n;
            if (j11 <= j10 && bVar2.f111u) {
                bVar = bVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return bVar;
    }

    private static g.d I(List<g.d> list, long j10) {
        return list.get(n0.f(list, Long.valueOf(j10), true, true));
    }

    private long J(a3.g gVar) {
        if (gVar.f104p) {
            return n0.B0(n0.a0(this.A)) - gVar.e();
        }
        return 0L;
    }

    private long K(a3.g gVar, long j10) {
        long j11 = gVar.f93e;
        if (j11 == -9223372036854775807L) {
            j11 = (gVar.f109u + j10) - n0.B0(this.C.f17666j);
        }
        if (gVar.f95g) {
            return j11;
        }
        g.b H = H(gVar.f107s, j11);
        if (H != null) {
            return H.f122n;
        }
        if (gVar.f106r.isEmpty()) {
            return 0L;
        }
        g.d I = I(gVar.f106r, j11);
        g.b H2 = H(I.f117v, j11);
        return H2 != null ? H2.f122n : I.f122n;
    }

    private static long L(a3.g gVar, long j10) {
        long j11;
        g.f fVar = gVar.f110v;
        long j12 = gVar.f93e;
        if (j12 != -9223372036854775807L) {
            j11 = gVar.f109u - j12;
        } else {
            long j13 = fVar.f132d;
            if (j13 == -9223372036854775807L || gVar.f102n == -9223372036854775807L) {
                long j14 = fVar.f131c;
                j11 = j14 != -9223372036854775807L ? j14 : gVar.f101m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void M(a3.g r6, long r7) {
        /*
            r5 = this;
            s1.v1 r0 = r5.B
            s1.v1$g r0 = r0.f17605m
            float r1 = r0.f17669m
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f17670n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            a3.g$f r6 = r6.f110v
            long r0 = r6.f131c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            long r0 = r6.f132d
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            s1.v1$g$a r0 = new s1.v1$g$a
            r0.<init>()
            long r7 = p3.n0.Y0(r7)
            s1.v1$g$a r7 = r0.k(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L3d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L41
        L3d:
            s1.v1$g r0 = r5.C
            float r0 = r0.f17669m
        L41:
            s1.v1$g$a r7 = r7.j(r0)
            if (r6 == 0) goto L48
            goto L4c
        L48:
            s1.v1$g r6 = r5.C
            float r8 = r6.f17670n
        L4c:
            s1.v1$g$a r6 = r7.h(r8)
            s1.v1$g r6 = r6.f()
            r5.C = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.M(a3.g, long):void");
    }

    @Override // u2.a
    protected void C(p0 p0Var) {
        this.D = p0Var;
        this.f3611u.e((Looper) p3.a.e(Looper.myLooper()), A());
        this.f3611u.b();
        this.f3616z.g(this.f3608r.f17676a, w(null), this);
    }

    @Override // u2.a
    protected void E() {
        this.f3616z.stop();
        this.f3611u.a();
    }

    @Override // u2.u
    public v1 a() {
        return this.B;
    }

    @Override // u2.u
    public void b(r rVar) {
        ((z2.k) rVar).B();
    }

    @Override // u2.u
    public void f() {
        this.f3616z.f();
    }

    @Override // a3.l.e
    public void m(a3.g gVar) {
        long Y0 = gVar.f104p ? n0.Y0(gVar.f96h) : -9223372036854775807L;
        int i10 = gVar.f92d;
        long j10 = (i10 == 2 || i10 == 1) ? Y0 : -9223372036854775807L;
        com.google.android.exoplayer2.source.hls.a aVar = new com.google.android.exoplayer2.source.hls.a((a3.h) p3.a.e(this.f3616z.b()), gVar);
        D(this.f3616z.a() ? F(gVar, j10, Y0, aVar) : G(gVar, j10, Y0, aVar));
    }

    @Override // u2.u
    public r n(u.b bVar, b bVar2, long j10) {
        b0.a w10 = w(bVar);
        return new z2.k(this.f3607q, this.f3616z, this.f3609s, this.D, this.f3611u, t(bVar), this.f3612v, w10, bVar2, this.f3610t, this.f3613w, this.f3614x, this.f3615y, A());
    }
}
