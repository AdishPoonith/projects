package h2;

import h2.i0;
import p3.n0;
import s1.n1;
import u1.b;
/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a  reason: collision with root package name */
    private final p3.z f9117a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f9118b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9119c;

    /* renamed from: d  reason: collision with root package name */
    private String f9120d;

    /* renamed from: e  reason: collision with root package name */
    private x1.e0 f9121e;

    /* renamed from: f  reason: collision with root package name */
    private int f9122f;

    /* renamed from: g  reason: collision with root package name */
    private int f9123g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9124h;

    /* renamed from: i  reason: collision with root package name */
    private long f9125i;

    /* renamed from: j  reason: collision with root package name */
    private n1 f9126j;

    /* renamed from: k  reason: collision with root package name */
    private int f9127k;

    /* renamed from: l  reason: collision with root package name */
    private long f9128l;

    public c() {
        this(null);
    }

    public c(String str) {
        p3.z zVar = new p3.z(new byte[128]);
        this.f9117a = zVar;
        this.f9118b = new p3.a0(zVar.f15486a);
        this.f9122f = 0;
        this.f9128l = -9223372036854775807L;
        this.f9119c = str;
    }

    private boolean f(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f9123g);
        a0Var.l(bArr, this.f9123g, min);
        int i11 = this.f9123g + min;
        this.f9123g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f9117a.p(0);
        b.C0267b f10 = u1.b.f(this.f9117a);
        n1 n1Var = this.f9126j;
        if (n1Var == null || f10.f18472d != n1Var.H || f10.f18471c != n1Var.I || !n0.c(f10.f18469a, n1Var.f17419u)) {
            n1.b b02 = new n1.b().U(this.f9120d).g0(f10.f18469a).J(f10.f18472d).h0(f10.f18471c).X(this.f9119c).b0(f10.f18475g);
            if ("audio/ac3".equals(f10.f18469a)) {
                b02.I(f10.f18475g);
            }
            n1 G = b02.G();
            this.f9126j = G;
            this.f9121e.e(G);
        }
        this.f9127k = f10.f18473e;
        this.f9125i = (f10.f18474f * 1000000) / this.f9126j.I;
    }

    private boolean h(p3.a0 a0Var) {
        while (true) {
            boolean z10 = false;
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f9124h) {
                int G = a0Var.G();
                if (G == 119) {
                    this.f9124h = false;
                    return true;
                }
                if (G != 11) {
                    this.f9124h = z10;
                }
                z10 = true;
                this.f9124h = z10;
            } else {
                if (a0Var.G() != 11) {
                    this.f9124h = z10;
                }
                z10 = true;
                this.f9124h = z10;
            }
        }
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f9121e);
        while (a0Var.a() > 0) {
            int i10 = this.f9122f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f9127k - this.f9123g);
                        this.f9121e.d(a0Var, min);
                        int i11 = this.f9123g + min;
                        this.f9123g = i11;
                        int i12 = this.f9127k;
                        if (i11 == i12) {
                            long j10 = this.f9128l;
                            if (j10 != -9223372036854775807L) {
                                this.f9121e.c(j10, 1, i12, 0, null);
                                this.f9128l += this.f9125i;
                            }
                            this.f9122f = 0;
                        }
                    }
                } else if (f(a0Var, this.f9118b.e(), 128)) {
                    g();
                    this.f9118b.T(0);
                    this.f9121e.d(this.f9118b, 128);
                    this.f9122f = 2;
                }
            } else if (h(a0Var)) {
                this.f9122f = 1;
                this.f9118b.e()[0] = 11;
                this.f9118b.e()[1] = 119;
                this.f9123g = 2;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f9122f = 0;
        this.f9123g = 0;
        this.f9124h = false;
        this.f9128l = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9120d = dVar.b();
        this.f9121e = nVar.d(dVar.c(), 1);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9128l = j10;
        }
    }
}
