package h2;

import h2.i0;
import s1.n1;
/* loaded from: classes.dex */
public final class k implements m {

    /* renamed from: b  reason: collision with root package name */
    private final String f9247b;

    /* renamed from: c  reason: collision with root package name */
    private String f9248c;

    /* renamed from: d  reason: collision with root package name */
    private x1.e0 f9249d;

    /* renamed from: f  reason: collision with root package name */
    private int f9251f;

    /* renamed from: g  reason: collision with root package name */
    private int f9252g;

    /* renamed from: h  reason: collision with root package name */
    private long f9253h;

    /* renamed from: i  reason: collision with root package name */
    private n1 f9254i;

    /* renamed from: j  reason: collision with root package name */
    private int f9255j;

    /* renamed from: a  reason: collision with root package name */
    private final p3.a0 f9246a = new p3.a0(new byte[18]);

    /* renamed from: e  reason: collision with root package name */
    private int f9250e = 0;

    /* renamed from: k  reason: collision with root package name */
    private long f9256k = -9223372036854775807L;

    public k(String str) {
        this.f9247b = str;
    }

    private boolean f(p3.a0 a0Var, byte[] bArr, int i10) {
        int min = Math.min(a0Var.a(), i10 - this.f9251f);
        a0Var.l(bArr, this.f9251f, min);
        int i11 = this.f9251f + min;
        this.f9251f = i11;
        return i11 == i10;
    }

    private void g() {
        byte[] e10 = this.f9246a.e();
        if (this.f9254i == null) {
            n1 g10 = u1.e0.g(e10, this.f9248c, this.f9247b, null);
            this.f9254i = g10;
            this.f9249d.e(g10);
        }
        this.f9255j = u1.e0.a(e10);
        this.f9253h = (int) ((u1.e0.f(e10) * 1000000) / this.f9254i.I);
    }

    private boolean h(p3.a0 a0Var) {
        while (a0Var.a() > 0) {
            int i10 = this.f9252g << 8;
            this.f9252g = i10;
            int G = i10 | a0Var.G();
            this.f9252g = G;
            if (u1.e0.d(G)) {
                byte[] e10 = this.f9246a.e();
                int i11 = this.f9252g;
                e10[0] = (byte) ((i11 >> 24) & 255);
                e10[1] = (byte) ((i11 >> 16) & 255);
                e10[2] = (byte) ((i11 >> 8) & 255);
                e10[3] = (byte) (i11 & 255);
                this.f9251f = 4;
                this.f9252g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f9249d);
        while (a0Var.a() > 0) {
            int i10 = this.f9250e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(a0Var.a(), this.f9255j - this.f9251f);
                    this.f9249d.d(a0Var, min);
                    int i11 = this.f9251f + min;
                    this.f9251f = i11;
                    int i12 = this.f9255j;
                    if (i11 == i12) {
                        long j10 = this.f9256k;
                        if (j10 != -9223372036854775807L) {
                            this.f9249d.c(j10, 1, i12, 0, null);
                            this.f9256k += this.f9253h;
                        }
                        this.f9250e = 0;
                    }
                } else if (f(a0Var, this.f9246a.e(), 18)) {
                    g();
                    this.f9246a.T(0);
                    this.f9249d.d(this.f9246a, 18);
                    this.f9250e = 2;
                }
            } else if (h(a0Var)) {
                this.f9250e = 1;
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f9250e = 0;
        this.f9251f = 0;
        this.f9252g = 0;
        this.f9256k = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9248c = dVar.b();
        this.f9249d = nVar.d(dVar.c(), 1);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9256k = j10;
        }
    }
}
