package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import c3.a;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o3.g0;
import o3.h0;
import o3.i0;
import o3.j0;
import o3.l;
import o3.p0;
import o3.x;
import p3.n0;
import s1.k1;
import s1.v1;
import u2.b0;
import u2.h;
import u2.i;
import u2.n;
import u2.q;
import u2.q0;
import u2.r;
import u2.u;
import w1.y;
/* loaded from: classes.dex */
public final class SsMediaSource extends u2.a implements h0.b<j0<c3.a>> {
    private final b0.a A;
    private final j0.a<? extends c3.a> B;
    private final ArrayList<c> C;
    private l D;
    private h0 E;
    private i0 F;
    private p0 G;
    private long H;
    private c3.a I;
    private Handler J;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f3631q;

    /* renamed from: r  reason: collision with root package name */
    private final Uri f3632r;

    /* renamed from: s  reason: collision with root package name */
    private final v1.h f3633s;

    /* renamed from: t  reason: collision with root package name */
    private final v1 f3634t;

    /* renamed from: u  reason: collision with root package name */
    private final l.a f3635u;

    /* renamed from: v  reason: collision with root package name */
    private final b.a f3636v;

    /* renamed from: w  reason: collision with root package name */
    private final h f3637w;

    /* renamed from: x  reason: collision with root package name */
    private final y f3638x;

    /* renamed from: y  reason: collision with root package name */
    private final g0 f3639y;

    /* renamed from: z  reason: collision with root package name */
    private final long f3640z;

    /* loaded from: classes.dex */
    public static final class Factory implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.a f3641a;

        /* renamed from: b  reason: collision with root package name */
        private final l.a f3642b;

        /* renamed from: c  reason: collision with root package name */
        private h f3643c;

        /* renamed from: d  reason: collision with root package name */
        private w1.b0 f3644d;

        /* renamed from: e  reason: collision with root package name */
        private g0 f3645e;

        /* renamed from: f  reason: collision with root package name */
        private long f3646f;

        /* renamed from: g  reason: collision with root package name */
        private j0.a<? extends c3.a> f3647g;

        public Factory(b.a aVar, l.a aVar2) {
            this.f3641a = (b.a) p3.a.e(aVar);
            this.f3642b = aVar2;
            this.f3644d = new w1.l();
            this.f3645e = new x();
            this.f3646f = 30000L;
            this.f3643c = new i();
        }

        public Factory(l.a aVar) {
            this(new a.C0084a(aVar), aVar);
        }

        public SsMediaSource a(v1 v1Var) {
            p3.a.e(v1Var.f17603k);
            j0.a aVar = this.f3647g;
            if (aVar == null) {
                aVar = new c3.b();
            }
            List<t2.c> list = v1Var.f17603k.f17679d;
            return new SsMediaSource(v1Var, null, this.f3642b, !list.isEmpty() ? new t2.b(aVar, list) : aVar, this.f3641a, this.f3643c, this.f3644d.a(v1Var), this.f3645e, this.f3646f);
        }
    }

    static {
        k1.a("goog.exo.smoothstreaming");
    }

    private SsMediaSource(v1 v1Var, c3.a aVar, l.a aVar2, j0.a<? extends c3.a> aVar3, b.a aVar4, h hVar, y yVar, g0 g0Var, long j10) {
        p3.a.f(aVar == null || !aVar.f3195d);
        this.f3634t = v1Var;
        v1.h hVar2 = (v1.h) p3.a.e(v1Var.f17603k);
        this.f3633s = hVar2;
        this.I = aVar;
        this.f3632r = hVar2.f17676a.equals(Uri.EMPTY) ? null : n0.B(hVar2.f17676a);
        this.f3635u = aVar2;
        this.B = aVar3;
        this.f3636v = aVar4;
        this.f3637w = hVar;
        this.f3638x = yVar;
        this.f3639y = g0Var;
        this.f3640z = j10;
        this.A = w(null);
        this.f3631q = aVar != null;
        this.C = new ArrayList<>();
    }

    private void J() {
        a.b[] bVarArr;
        q0 q0Var;
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            this.C.get(i10).w(this.I);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (a.b bVar : this.I.f3197f) {
            if (bVar.f3213k > 0) {
                j11 = Math.min(j11, bVar.e(0));
                j10 = Math.max(j10, bVar.e(bVar.f3213k - 1) + bVar.c(bVar.f3213k - 1));
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.I.f3195d ? -9223372036854775807L : 0L;
            c3.a aVar = this.I;
            boolean z10 = aVar.f3195d;
            q0Var = new q0(j12, 0L, 0L, 0L, true, z10, z10, aVar, this.f3634t);
        } else {
            c3.a aVar2 = this.I;
            if (aVar2.f3195d) {
                long j13 = aVar2.f3199h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long B0 = j15 - n0.B0(this.f3640z);
                if (B0 < 5000000) {
                    B0 = Math.min(5000000L, j15 / 2);
                }
                q0Var = new q0(-9223372036854775807L, j15, j14, B0, true, true, true, this.I, this.f3634t);
            } else {
                long j16 = aVar2.f3198g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                q0Var = new q0(j11 + j17, j17, j11, 0L, true, false, false, this.I, this.f3634t);
            }
        }
        D(q0Var);
    }

    private void K() {
        if (this.I.f3195d) {
            this.J.postDelayed(new Runnable() { // from class: b3.a
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.L();
                }
            }, Math.max(0L, (this.H + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.E.i()) {
            return;
        }
        j0 j0Var = new j0(this.D, this.f3632r, 4, this.B);
        this.A.z(new n(j0Var.f14474a, j0Var.f14475b, this.E.n(j0Var, this, this.f3639y.d(j0Var.f14476c))), j0Var.f14476c);
    }

    @Override // u2.a
    protected void C(p0 p0Var) {
        this.G = p0Var;
        this.f3638x.e(Looper.myLooper(), A());
        this.f3638x.b();
        if (this.f3631q) {
            this.F = new i0.a();
            J();
            return;
        }
        this.D = this.f3635u.a();
        h0 h0Var = new h0("SsMediaSource");
        this.E = h0Var;
        this.F = h0Var;
        this.J = n0.w();
        L();
    }

    @Override // u2.a
    protected void E() {
        this.I = this.f3631q ? this.I : null;
        this.D = null;
        this.H = 0L;
        h0 h0Var = this.E;
        if (h0Var != null) {
            h0Var.l();
            this.E = null;
        }
        Handler handler = this.J;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.J = null;
        }
        this.f3638x.a();
    }

    @Override // o3.h0.b
    /* renamed from: G */
    public void i(j0<c3.a> j0Var, long j10, long j11, boolean z10) {
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.f3639y.a(j0Var.f14474a);
        this.A.q(nVar, j0Var.f14476c);
    }

    @Override // o3.h0.b
    /* renamed from: H */
    public void o(j0<c3.a> j0Var, long j10, long j11) {
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        this.f3639y.a(j0Var.f14474a);
        this.A.t(nVar, j0Var.f14476c);
        this.I = j0Var.e();
        this.H = j10 - j11;
        J();
        K();
    }

    @Override // o3.h0.b
    /* renamed from: I */
    public h0.c u(j0<c3.a> j0Var, long j10, long j11, IOException iOException, int i10) {
        n nVar = new n(j0Var.f14474a, j0Var.f14475b, j0Var.f(), j0Var.d(), j10, j11, j0Var.a());
        long b10 = this.f3639y.b(new g0.c(nVar, new q(j0Var.f14476c), iOException, i10));
        h0.c h10 = b10 == -9223372036854775807L ? h0.f14453g : h0.h(false, b10);
        boolean z10 = !h10.c();
        this.A.x(nVar, j0Var.f14476c, iOException, z10);
        if (z10) {
            this.f3639y.a(j0Var.f14474a);
        }
        return h10;
    }

    @Override // u2.u
    public v1 a() {
        return this.f3634t;
    }

    @Override // u2.u
    public void b(r rVar) {
        ((c) rVar).v();
        this.C.remove(rVar);
    }

    @Override // u2.u
    public void f() {
        this.F.b();
    }

    @Override // u2.u
    public r n(u.b bVar, o3.b bVar2, long j10) {
        b0.a w10 = w(bVar);
        c cVar = new c(this.I, this.f3636v, this.G, this.f3637w, this.f3638x, t(bVar), this.f3639y, w10, this.F, bVar2);
        this.C.add(cVar);
        return cVar;
    }
}
