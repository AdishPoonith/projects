package h2;

import h2.i0;
import java.util.Collections;
import s1.n1;
import s1.u2;
import u1.a;
/* loaded from: classes.dex */
public final class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f9395a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f9396b;

    /* renamed from: c  reason: collision with root package name */
    private final p3.z f9397c;

    /* renamed from: d  reason: collision with root package name */
    private x1.e0 f9398d;

    /* renamed from: e  reason: collision with root package name */
    private String f9399e;

    /* renamed from: f  reason: collision with root package name */
    private n1 f9400f;

    /* renamed from: g  reason: collision with root package name */
    private int f9401g;

    /* renamed from: h  reason: collision with root package name */
    private int f9402h;

    /* renamed from: i  reason: collision with root package name */
    private int f9403i;

    /* renamed from: j  reason: collision with root package name */
    private int f9404j;

    /* renamed from: k  reason: collision with root package name */
    private long f9405k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f9406l;

    /* renamed from: m  reason: collision with root package name */
    private int f9407m;

    /* renamed from: n  reason: collision with root package name */
    private int f9408n;

    /* renamed from: o  reason: collision with root package name */
    private int f9409o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9410p;

    /* renamed from: q  reason: collision with root package name */
    private long f9411q;

    /* renamed from: r  reason: collision with root package name */
    private int f9412r;

    /* renamed from: s  reason: collision with root package name */
    private long f9413s;

    /* renamed from: t  reason: collision with root package name */
    private int f9414t;

    /* renamed from: u  reason: collision with root package name */
    private String f9415u;

    public s(String str) {
        this.f9395a = str;
        p3.a0 a0Var = new p3.a0(1024);
        this.f9396b = a0Var;
        this.f9397c = new p3.z(a0Var.e());
        this.f9405k = -9223372036854775807L;
    }

    private static long f(p3.z zVar) {
        return zVar.h((zVar.h(2) + 1) * 8);
    }

    private void g(p3.z zVar) {
        if (!zVar.g()) {
            this.f9406l = true;
            l(zVar);
        } else if (!this.f9406l) {
            return;
        }
        if (this.f9407m != 0) {
            throw u2.a(null, null);
        }
        if (this.f9408n != 0) {
            throw u2.a(null, null);
        }
        k(zVar, j(zVar));
        if (this.f9410p) {
            zVar.r((int) this.f9411q);
        }
    }

    private int h(p3.z zVar) {
        int b10 = zVar.b();
        a.b e10 = u1.a.e(zVar, true);
        this.f9415u = e10.f18460c;
        this.f9412r = e10.f18458a;
        this.f9414t = e10.f18459b;
        return b10 - zVar.b();
    }

    private void i(p3.z zVar) {
        int i10;
        int h10 = zVar.h(3);
        this.f9409o = h10;
        if (h10 == 0) {
            i10 = 8;
        } else if (h10 != 1) {
            if (h10 == 3 || h10 == 4 || h10 == 5) {
                zVar.r(6);
                return;
            } else if (h10 != 6 && h10 != 7) {
                throw new IllegalStateException();
            } else {
                zVar.r(1);
                return;
            }
        } else {
            i10 = 9;
        }
        zVar.r(i10);
    }

    private int j(p3.z zVar) {
        int h10;
        if (this.f9409o == 0) {
            int i10 = 0;
            do {
                h10 = zVar.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw u2.a(null, null);
    }

    private void k(p3.z zVar, int i10) {
        int e10 = zVar.e();
        if ((e10 & 7) == 0) {
            this.f9396b.T(e10 >> 3);
        } else {
            zVar.i(this.f9396b.e(), 0, i10 * 8);
            this.f9396b.T(0);
        }
        this.f9398d.d(this.f9396b, i10);
        long j10 = this.f9405k;
        if (j10 != -9223372036854775807L) {
            this.f9398d.c(j10, 1, i10, 0, null);
            this.f9405k += this.f9413s;
        }
    }

    private void l(p3.z zVar) {
        boolean g10;
        int h10 = zVar.h(1);
        int h11 = h10 == 1 ? zVar.h(1) : 0;
        this.f9407m = h11;
        if (h11 != 0) {
            throw u2.a(null, null);
        }
        if (h10 == 1) {
            f(zVar);
        }
        if (!zVar.g()) {
            throw u2.a(null, null);
        }
        this.f9408n = zVar.h(6);
        int h12 = zVar.h(4);
        int h13 = zVar.h(3);
        if (h12 != 0 || h13 != 0) {
            throw u2.a(null, null);
        }
        if (h10 == 0) {
            int e10 = zVar.e();
            int h14 = h(zVar);
            zVar.p(e10);
            byte[] bArr = new byte[(h14 + 7) / 8];
            zVar.i(bArr, 0, h14);
            n1 G = new n1.b().U(this.f9399e).g0("audio/mp4a-latm").K(this.f9415u).J(this.f9414t).h0(this.f9412r).V(Collections.singletonList(bArr)).X(this.f9395a).G();
            if (!G.equals(this.f9400f)) {
                this.f9400f = G;
                this.f9413s = 1024000000 / G.I;
                this.f9398d.e(G);
            }
        } else {
            zVar.r(((int) f(zVar)) - h(zVar));
        }
        i(zVar);
        boolean g11 = zVar.g();
        this.f9410p = g11;
        this.f9411q = 0L;
        if (g11) {
            if (h10 == 1) {
                this.f9411q = f(zVar);
            } else {
                do {
                    g10 = zVar.g();
                    this.f9411q = (this.f9411q << 8) + zVar.h(8);
                } while (g10);
            }
        }
        if (zVar.g()) {
            zVar.r(8);
        }
    }

    private void m(int i10) {
        this.f9396b.P(i10);
        this.f9397c.n(this.f9396b.e());
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f9398d);
        while (a0Var.a() > 0) {
            int i10 = this.f9401g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int G = a0Var.G();
                    if ((G & 224) == 224) {
                        this.f9404j = G;
                        this.f9401g = 2;
                    } else if (G != 86) {
                        this.f9401g = 0;
                    }
                } else if (i10 == 2) {
                    int G2 = ((this.f9404j & (-225)) << 8) | a0Var.G();
                    this.f9403i = G2;
                    if (G2 > this.f9396b.e().length) {
                        m(this.f9403i);
                    }
                    this.f9402h = 0;
                    this.f9401g = 3;
                } else if (i10 != 3) {
                    throw new IllegalStateException();
                } else {
                    int min = Math.min(a0Var.a(), this.f9403i - this.f9402h);
                    a0Var.l(this.f9397c.f15486a, this.f9402h, min);
                    int i11 = this.f9402h + min;
                    this.f9402h = i11;
                    if (i11 == this.f9403i) {
                        this.f9397c.p(0);
                        g(this.f9397c);
                        this.f9401g = 0;
                    }
                }
            } else if (a0Var.G() == 86) {
                this.f9401g = 1;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f9401g = 0;
        this.f9405k = -9223372036854775807L;
        this.f9406l = false;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9398d = nVar.d(dVar.c(), 1);
        this.f9399e = dVar.b();
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9405k = j10;
        }
    }
}
