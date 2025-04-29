package h2;

import h2.i0;
import java.util.Arrays;
import java.util.Collections;
import p3.n0;
import s1.n1;
import u1.a;
/* loaded from: classes.dex */
public final class i implements m {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f9210v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9211a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.z f9212b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f9213c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9214d;

    /* renamed from: e  reason: collision with root package name */
    private String f9215e;

    /* renamed from: f  reason: collision with root package name */
    private x1.e0 f9216f;

    /* renamed from: g  reason: collision with root package name */
    private x1.e0 f9217g;

    /* renamed from: h  reason: collision with root package name */
    private int f9218h;

    /* renamed from: i  reason: collision with root package name */
    private int f9219i;

    /* renamed from: j  reason: collision with root package name */
    private int f9220j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9221k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9222l;

    /* renamed from: m  reason: collision with root package name */
    private int f9223m;

    /* renamed from: n  reason: collision with root package name */
    private int f9224n;

    /* renamed from: o  reason: collision with root package name */
    private int f9225o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9226p;

    /* renamed from: q  reason: collision with root package name */
    private long f9227q;

    /* renamed from: r  reason: collision with root package name */
    private int f9228r;

    /* renamed from: s  reason: collision with root package name */
    private long f9229s;

    /* renamed from: t  reason: collision with root package name */
    private x1.e0 f9230t;

    /* renamed from: u  reason: collision with root package name */
    private long f9231u;

    public i(boolean z10) {
        this(z10, null);
    }

    public i(boolean z10, String str) {
        this.f9212b = new p3.z(new byte[7]);
        this.f9213c = new p3.a0(Arrays.copyOf(f9210v, 10));
        s();
        this.f9223m = -1;
        this.f9224n = -1;
        this.f9227q = -9223372036854775807L;
        this.f9229s = -9223372036854775807L;
        this.f9211a = z10;
        this.f9214d = str;
    }

    private void f() {
        p3.a.e(this.f9216f);
        n0.j(this.f9230t);
        n0.j(this.f9217g);
    }

    private void g(p3.a0 a0Var) {
        if (a0Var.a() == 0) {
            return;
        }
        this.f9212b.f15486a[0] = a0Var.e()[a0Var.f()];
        this.f9212b.p(2);
        int h10 = this.f9212b.h(4);
        int i10 = this.f9224n;
        if (i10 != -1 && h10 != i10) {
            q();
            return;
        }
        if (!this.f9222l) {
            this.f9222l = true;
            this.f9223m = this.f9225o;
            this.f9224n = h10;
        }
        t();
    }

    private boolean h(p3.a0 a0Var, int i10) {
        a0Var.T(i10 + 1);
        if (w(a0Var, this.f9212b.f15486a, 1)) {
            this.f9212b.p(4);
            int h10 = this.f9212b.h(1);
            int i11 = this.f9223m;
            if (i11 == -1 || h10 == i11) {
                if (this.f9224n != -1) {
                    if (!w(a0Var, this.f9212b.f15486a, 1)) {
                        return true;
                    }
                    this.f9212b.p(2);
                    if (this.f9212b.h(4) != this.f9224n) {
                        return false;
                    }
                    a0Var.T(i10 + 2);
                }
                if (w(a0Var, this.f9212b.f15486a, 4)) {
                    this.f9212b.p(14);
                    int h11 = this.f9212b.h(13);
                    if (h11 < 7) {
                        return false;
                    }
                    byte[] e10 = a0Var.e();
                    int g10 = a0Var.g();
                    int i12 = i10 + h11;
                    if (i12 >= g10) {
                        return true;
                    }
                    if (e10[i12] == -1) {
                        int i13 = i12 + 1;
                        if (i13 == g10) {
                            return true;
                        }
                        return l((byte) -1, e10[i13]) && ((e10[i13] & 8) >> 3) == h10;
                    } else if (e10[i12] != 73) {
                        return false;
                    } else {
                        int i14 = i12 + 1;
                        if (i14 == g10) {
                            return true;
                        }
                        if (e10[i14] != 68) {
                            return false;
                        }
                        int i15 = i12 + 2;
                        return i15 == g10 || e10[i15] == 51;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean i(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f9219i);
        a0Var.l(bArr, this.f9219i, min);
        int i11 = this.f9219i + min;
        this.f9219i = i11;
        return i11 == i10;
    }

    private void j(p3.a0 a0Var) {
        int i10;
        byte[] e10 = a0Var.e();
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        while (f10 < g10) {
            int i11 = f10 + 1;
            int i12 = e10[f10] & 255;
            if (this.f9220j == 512 && l((byte) -1, (byte) i12) && (this.f9222l || h(a0Var, i11 - 2))) {
                this.f9225o = (i12 & 8) >> 3;
                this.f9221k = (i12 & 1) == 0;
                if (this.f9222l) {
                    t();
                } else {
                    r();
                }
                a0Var.T(i11);
                return;
            }
            int i13 = this.f9220j;
            int i14 = i12 | i13;
            if (i14 != 329) {
                if (i14 == 511) {
                    this.f9220j = 512;
                } else if (i14 == 836) {
                    i10 = 1024;
                } else if (i14 == 1075) {
                    u();
                    a0Var.T(i11);
                    return;
                } else if (i13 != 256) {
                    this.f9220j = 256;
                    i11--;
                }
                f10 = i11;
            } else {
                i10 = 768;
            }
            this.f9220j = i10;
            f10 = i11;
        }
        a0Var.T(f10);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() {
        this.f9212b.p(0);
        if (this.f9226p) {
            this.f9212b.r(10);
        } else {
            int h10 = this.f9212b.h(2) + 1;
            if (h10 != 2) {
                p3.r.i("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
                h10 = 2;
            }
            this.f9212b.r(5);
            byte[] b10 = u1.a.b(h10, this.f9224n, this.f9212b.h(3));
            a.b f10 = u1.a.f(b10);
            n1 G = new n1.b().U(this.f9215e).g0("audio/mp4a-latm").K(f10.f18460c).J(f10.f18459b).h0(f10.f18458a).V(Collections.singletonList(b10)).X(this.f9214d).G();
            this.f9227q = 1024000000 / G.I;
            this.f9216f.e(G);
            this.f9226p = true;
        }
        this.f9212b.r(4);
        int h11 = (this.f9212b.h(13) - 2) - 5;
        if (this.f9221k) {
            h11 -= 2;
        }
        v(this.f9216f, this.f9227q, 0, h11);
    }

    private void o() {
        this.f9217g.d(this.f9213c, 10);
        this.f9213c.T(6);
        v(this.f9217g, 0L, 10, this.f9213c.F() + 10);
    }

    private void p(p3.a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f9228r - this.f9219i);
        this.f9230t.d(a0Var, min);
        int i10 = this.f9219i + min;
        this.f9219i = i10;
        int i11 = this.f9228r;
        if (i10 == i11) {
            long j10 = this.f9229s;
            if (j10 != -9223372036854775807L) {
                this.f9230t.c(j10, 1, i11, 0, null);
                this.f9229s += this.f9231u;
            }
            s();
        }
    }

    private void q() {
        this.f9222l = false;
        s();
    }

    private void r() {
        this.f9218h = 1;
        this.f9219i = 0;
    }

    private void s() {
        this.f9218h = 0;
        this.f9219i = 0;
        this.f9220j = 256;
    }

    private void t() {
        this.f9218h = 3;
        this.f9219i = 0;
    }

    private void u() {
        this.f9218h = 2;
        this.f9219i = f9210v.length;
        this.f9228r = 0;
        this.f9213c.T(0);
    }

    private void v(x1.e0 e0Var, long j10, int i10, int i11) {
        this.f9218h = 4;
        this.f9219i = i10;
        this.f9230t = e0Var;
        this.f9231u = j10;
        this.f9228r = i11;
    }

    private boolean w(p3.a0 a0Var, byte[] bArr, int i10) {
        if (a0Var.a() < i10) {
            return false;
        }
        a0Var.l(bArr, 0, i10);
        return true;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        f();
        while (a0Var.a() > 0) {
            int i10 = this.f9218h;
            if (i10 == 0) {
                j(a0Var);
            } else if (i10 == 1) {
                g(a0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(a0Var, this.f9212b.f15486a, this.f9221k ? 7 : 5)) {
                        n();
                    }
                } else if (i10 != 4) {
                    throw new IllegalStateException();
                } else {
                    p(a0Var);
                }
            } else if (i(a0Var, this.f9213c.e(), 10)) {
                o();
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f9229s = -9223372036854775807L;
        q();
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9215e = dVar.b();
        x1.e0 d10 = nVar.d(dVar.c(), 1);
        this.f9216f = d10;
        this.f9230t = d10;
        if (!this.f9211a) {
            this.f9217g = new x1.k();
            return;
        }
        dVar.a();
        x1.e0 d11 = nVar.d(dVar.c(), 5);
        this.f9217g = d11;
        d11.e(new n1.b().U(dVar.b()).g0("application/id3").G());
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9229s = j10;
        }
    }

    public long k() {
        return this.f9227q;
    }
}
