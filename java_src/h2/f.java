package h2;

import h2.i0;
import s1.n1;
import u1.c;
/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: a  reason: collision with root package name */
    private final p3.z f9146a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f9147b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9148c;

    /* renamed from: d  reason: collision with root package name */
    private String f9149d;

    /* renamed from: e  reason: collision with root package name */
    private x1.e0 f9150e;

    /* renamed from: f  reason: collision with root package name */
    private int f9151f;

    /* renamed from: g  reason: collision with root package name */
    private int f9152g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9153h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9154i;

    /* renamed from: j  reason: collision with root package name */
    private long f9155j;

    /* renamed from: k  reason: collision with root package name */
    private n1 f9156k;

    /* renamed from: l  reason: collision with root package name */
    private int f9157l;

    /* renamed from: m  reason: collision with root package name */
    private long f9158m;

    public f() {
        this(null);
    }

    public f(String str) {
        p3.z zVar = new p3.z(new byte[16]);
        this.f9146a = zVar;
        this.f9147b = new p3.a0(zVar.f15486a);
        this.f9151f = 0;
        this.f9152g = 0;
        this.f9153h = false;
        this.f9154i = false;
        this.f9158m = -9223372036854775807L;
        this.f9148c = str;
    }

    private boolean f(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f9152g);
        a0Var.l(bArr, this.f9152g, min);
        int i11 = this.f9152g + min;
        this.f9152g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f9146a.p(0);
        c.b d10 = u1.c.d(this.f9146a);
        n1 n1Var = this.f9156k;
        if (n1Var == null || d10.f18481c != n1Var.H || d10.f18480b != n1Var.I || !"audio/ac4".equals(n1Var.f17419u)) {
            n1 G = new n1.b().U(this.f9149d).g0("audio/ac4").J(d10.f18481c).h0(d10.f18480b).X(this.f9148c).G();
            this.f9156k = G;
            this.f9150e.e(G);
        }
        this.f9157l = d10.f18482d;
        this.f9155j = (d10.f18483e * 1000000) / this.f9156k.I;
    }

    private boolean h(p3.a0 a0Var) {
        int G;
        while (true) {
            if (a0Var.a() <= 0) {
                return false;
            }
            if (this.f9153h) {
                G = a0Var.G();
                this.f9153h = G == 172;
                if (G == 64 || G == 65) {
                    break;
                }
            } else {
                this.f9153h = a0Var.G() == 172;
            }
        }
        this.f9154i = G == 65;
        return true;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f9150e);
        while (a0Var.a() > 0) {
            int i10 = this.f9151f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a0Var.a(), this.f9157l - this.f9152g);
                        this.f9150e.d(a0Var, min);
                        int i11 = this.f9152g + min;
                        this.f9152g = i11;
                        int i12 = this.f9157l;
                        if (i11 == i12) {
                            long j10 = this.f9158m;
                            if (j10 != -9223372036854775807L) {
                                this.f9150e.c(j10, 1, i12, 0, null);
                                this.f9158m += this.f9155j;
                            }
                            this.f9151f = 0;
                        }
                    }
                } else if (f(a0Var, this.f9147b.e(), 16)) {
                    g();
                    this.f9147b.T(0);
                    this.f9150e.d(this.f9147b, 16);
                    this.f9151f = 2;
                }
            } else if (h(a0Var)) {
                this.f9151f = 1;
                this.f9147b.e()[0] = -84;
                this.f9147b.e()[1] = (byte) (this.f9154i ? 65 : 64);
                this.f9152g = 2;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f9151f = 0;
        this.f9152g = 0;
        this.f9153h = false;
        this.f9154i = false;
        this.f9158m = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9149d = dVar.b();
        this.f9150e = nVar.d(dVar.c(), 1);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9158m = j10;
        }
    }
}
