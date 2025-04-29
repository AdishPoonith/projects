package z2;

import a3.g;
import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import k2.a;
import o3.p;
import p3.a0;
import p3.j0;
import p3.l0;
import s1.n1;
import t1.t1;
import z2.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i extends w2.n {
    private static final AtomicInteger M = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final t1 C;
    private j D;
    private p E;
    private int F;
    private boolean G;
    private volatile boolean H;
    private boolean I;
    private com.google.common.collect.q<Integer> J;
    private boolean K;
    private boolean L;

    /* renamed from: k  reason: collision with root package name */
    public final int f20766k;

    /* renamed from: l  reason: collision with root package name */
    public final int f20767l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f20768m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f20769n;

    /* renamed from: o  reason: collision with root package name */
    public final int f20770o;

    /* renamed from: p  reason: collision with root package name */
    private final o3.l f20771p;

    /* renamed from: q  reason: collision with root package name */
    private final o3.p f20772q;

    /* renamed from: r  reason: collision with root package name */
    private final j f20773r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f20774s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f20775t;

    /* renamed from: u  reason: collision with root package name */
    private final j0 f20776u;

    /* renamed from: v  reason: collision with root package name */
    private final h f20777v;

    /* renamed from: w  reason: collision with root package name */
    private final List<n1> f20778w;

    /* renamed from: x  reason: collision with root package name */
    private final w1.m f20779x;

    /* renamed from: y  reason: collision with root package name */
    private final p2.h f20780y;

    /* renamed from: z  reason: collision with root package name */
    private final a0 f20781z;

    private i(h hVar, o3.l lVar, o3.p pVar, n1 n1Var, boolean z10, o3.l lVar2, o3.p pVar2, boolean z11, Uri uri, List<n1> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, j0 j0Var, w1.m mVar, j jVar, p2.h hVar2, a0 a0Var, boolean z15, t1 t1Var) {
        super(lVar, pVar, n1Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f20770o = i11;
        this.L = z12;
        this.f20767l = i12;
        this.f20772q = pVar2;
        this.f20771p = lVar2;
        this.G = pVar2 != null;
        this.B = z11;
        this.f20768m = uri;
        this.f20774s = z14;
        this.f20776u = j0Var;
        this.f20775t = z13;
        this.f20777v = hVar;
        this.f20778w = list;
        this.f20779x = mVar;
        this.f20773r = jVar;
        this.f20780y = hVar2;
        this.f20781z = a0Var;
        this.f20769n = z15;
        this.C = t1Var;
        this.J = com.google.common.collect.q.z();
        this.f20766k = M.getAndIncrement();
    }

    private static o3.l i(o3.l lVar, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            p3.a.e(bArr2);
            return new a(lVar, bArr, bArr2);
        }
        return lVar;
    }

    public static i j(h hVar, o3.l lVar, n1 n1Var, long j10, a3.g gVar, f.e eVar, Uri uri, List<n1> list, int i10, Object obj, boolean z10, s sVar, i iVar, byte[] bArr, byte[] bArr2, boolean z11, t1 t1Var) {
        boolean z12;
        o3.l lVar2;
        o3.p pVar;
        boolean z13;
        p2.h hVar2;
        a0 a0Var;
        j jVar;
        g.e eVar2 = eVar.f20761a;
        o3.p a10 = new p.b().i(l0.e(gVar.f155a, eVar2.f118j)).h(eVar2.f126r).g(eVar2.f127s).b(eVar.f20764d ? 8 : 0).a();
        boolean z14 = bArr != null;
        o3.l i11 = i(lVar, bArr, z14 ? l((String) p3.a.e(eVar2.f125q)) : null);
        g.d dVar = eVar2.f119k;
        if (dVar != null) {
            boolean z15 = bArr2 != null;
            byte[] l10 = z15 ? l((String) p3.a.e(dVar.f125q)) : null;
            z12 = z14;
            pVar = new o3.p(l0.e(gVar.f155a, dVar.f118j), dVar.f126r, dVar.f127s);
            lVar2 = i(lVar, bArr2, l10);
            z13 = z15;
        } else {
            z12 = z14;
            lVar2 = null;
            pVar = null;
            z13 = false;
        }
        long j11 = j10 + eVar2.f122n;
        long j12 = j11 + eVar2.f120l;
        int i12 = gVar.f98j + eVar2.f121m;
        if (iVar != null) {
            o3.p pVar2 = iVar.f20772q;
            boolean z16 = pVar == pVar2 || (pVar != null && pVar2 != null && pVar.f14512a.equals(pVar2.f14512a) && pVar.f14518g == iVar.f20772q.f14518g);
            boolean z17 = uri.equals(iVar.f20768m) && iVar.I;
            p2.h hVar3 = iVar.f20780y;
            hVar2 = hVar3;
            a0Var = iVar.f20781z;
            jVar = (z16 && z17 && !iVar.K && iVar.f20767l == i12) ? iVar.D : null;
        } else {
            hVar2 = new p2.h();
            a0Var = new a0(10);
            jVar = null;
        }
        return new i(hVar, i11, a10, n1Var, z12, lVar2, pVar, z13, uri, list, i10, obj, j11, j12, eVar.f20762b, eVar.f20763c, !eVar.f20764d, i12, eVar2.f128t, z10, sVar.a(i12), eVar2.f123o, jVar, hVar2, a0Var, z11, t1Var);
    }

    private void k(o3.l lVar, o3.p pVar, boolean z10, boolean z11) {
        o3.p e10;
        long p10;
        long j10;
        if (z10) {
            r0 = this.F != 0;
            e10 = pVar;
        } else {
            e10 = pVar.e(this.F);
        }
        try {
            x1.f u10 = u(lVar, e10, z11);
            if (r0) {
                u10.g(this.F);
            }
            do {
                try {
                    if (this.H) {
                        break;
                    }
                } catch (EOFException e11) {
                    if ((this.f19795d.f17412n & 16384) == 0) {
                        throw e11;
                    }
                    this.D.d();
                    p10 = u10.p();
                    j10 = pVar.f14518g;
                }
            } while (this.D.b(u10));
            p10 = u10.p();
            j10 = pVar.f14518g;
            this.F = (int) (p10 - j10);
        } finally {
            o3.o.a(lVar);
        }
    }

    private static byte[] l(String str) {
        if (b5.b.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, a3.g gVar) {
        g.e eVar2 = eVar.f20761a;
        return eVar2 instanceof g.b ? ((g.b) eVar2).f111u || (eVar.f20763c == 0 && gVar.f157c) : gVar.f157c;
    }

    private void r() {
        k(this.f19800i, this.f19793b, this.A, true);
    }

    private void s() {
        if (this.G) {
            p3.a.e(this.f20771p);
            p3.a.e(this.f20772q);
            k(this.f20771p, this.f20772q, this.B, false);
            this.F = 0;
            this.G = false;
        }
    }

    private long t(x1.m mVar) {
        mVar.f();
        try {
            this.f20781z.P(10);
            mVar.n(this.f20781z.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f20781z.J() != 4801587) {
            return -9223372036854775807L;
        }
        this.f20781z.U(3);
        int F = this.f20781z.F();
        int i10 = F + 10;
        if (i10 > this.f20781z.b()) {
            byte[] e10 = this.f20781z.e();
            this.f20781z.P(i10);
            System.arraycopy(e10, 0, this.f20781z.e(), 0, 10);
        }
        mVar.n(this.f20781z.e(), 10, F);
        k2.a e11 = this.f20780y.e(this.f20781z.e(), F);
        if (e11 == null) {
            return -9223372036854775807L;
        }
        int e12 = e11.e();
        for (int i11 = 0; i11 < e12; i11++) {
            a.b d10 = e11.d(i11);
            if (d10 instanceof p2.l) {
                p2.l lVar = (p2.l) d10;
                if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f15321k)) {
                    System.arraycopy(lVar.f15322l, 0, this.f20781z.e(), 0, 8);
                    this.f20781z.T(0);
                    this.f20781z.S(8);
                    return this.f20781z.z() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private x1.f u(o3.l lVar, o3.p pVar, boolean z10) {
        p pVar2;
        long j10;
        long m10 = lVar.m(pVar);
        if (z10) {
            try {
                this.f20776u.h(this.f20774s, this.f19798g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        x1.f fVar = new x1.f(lVar, pVar.f14518g, m10);
        if (this.D == null) {
            long t10 = t(fVar);
            fVar.f();
            j jVar = this.f20773r;
            j f10 = jVar != null ? jVar.f() : this.f20777v.a(pVar.f14512a, this.f19795d, this.f20778w, this.f20776u, lVar.e(), fVar, this.C);
            this.D = f10;
            if (f10.a()) {
                pVar2 = this.E;
                j10 = t10 != -9223372036854775807L ? this.f20776u.b(t10) : this.f19798g;
            } else {
                pVar2 = this.E;
                j10 = 0;
            }
            pVar2.n0(j10);
            this.E.Z();
            this.D.c(this.E);
        }
        this.E.k0(this.f20779x);
        return fVar;
    }

    public static boolean w(i iVar, Uri uri, a3.g gVar, f.e eVar, long j10) {
        if (iVar == null) {
            return false;
        }
        if (uri.equals(iVar.f20768m) && iVar.I) {
            return false;
        }
        return !p(eVar, gVar) || j10 + eVar.f20761a.f122n < iVar.f19799h;
    }

    @Override // o3.h0.e
    public void b() {
        j jVar;
        p3.a.e(this.E);
        if (this.D == null && (jVar = this.f20773r) != null && jVar.e()) {
            this.D = this.f20773r;
            this.G = false;
        }
        s();
        if (this.H) {
            return;
        }
        if (!this.f20775t) {
            r();
        }
        this.I = !this.H;
    }

    @Override // o3.h0.e
    public void c() {
        this.H = true;
    }

    @Override // w2.n
    public boolean h() {
        return this.I;
    }

    public int m(int i10) {
        p3.a.f(!this.f20769n);
        if (i10 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i10).intValue();
    }

    public void n(p pVar, com.google.common.collect.q<Integer> qVar) {
        this.E = pVar;
        this.J = qVar;
    }

    public void o() {
        this.K = true;
    }

    public boolean q() {
        return this.L;
    }

    public void v() {
        this.L = true;
    }
}
