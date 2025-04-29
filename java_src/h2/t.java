package h2;

import h2.i0;
import s1.n1;
import u1.h0;
/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final p3.a0 f9416a;

    /* renamed from: b  reason: collision with root package name */
    private final h0.a f9417b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9418c;

    /* renamed from: d  reason: collision with root package name */
    private x1.e0 f9419d;

    /* renamed from: e  reason: collision with root package name */
    private String f9420e;

    /* renamed from: f  reason: collision with root package name */
    private int f9421f;

    /* renamed from: g  reason: collision with root package name */
    private int f9422g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9423h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9424i;

    /* renamed from: j  reason: collision with root package name */
    private long f9425j;

    /* renamed from: k  reason: collision with root package name */
    private int f9426k;

    /* renamed from: l  reason: collision with root package name */
    private long f9427l;

    public t() {
        this(null);
    }

    public t(String str) {
        this.f9421f = 0;
        p3.a0 a0Var = new p3.a0(4);
        this.f9416a = a0Var;
        a0Var.e()[0] = -1;
        this.f9417b = new h0.a();
        this.f9427l = -9223372036854775807L;
        this.f9418c = str;
    }

    private void f(p3.a0 a0Var) {
        byte[] e10 = a0Var.e();
        int g10 = a0Var.g();
        for (int f10 = a0Var.f(); f10 < g10; f10++) {
            boolean z10 = (e10[f10] & 255) == 255;
            boolean z11 = this.f9424i && (e10[f10] & 224) == 224;
            this.f9424i = z10;
            if (z11) {
                a0Var.T(f10 + 1);
                this.f9424i = false;
                this.f9416a.e()[1] = e10[f10];
                this.f9422g = 2;
                this.f9421f = 1;
                return;
            }
        }
        a0Var.T(g10);
    }

    private void g(p3.a0 a0Var) {
        int min = Math.min(a0Var.a(), this.f9426k - this.f9422g);
        this.f9419d.d(a0Var, min);
        int i10 = this.f9422g + min;
        this.f9422g = i10;
        int i11 = this.f9426k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f9427l;
        if (j10 != -9223372036854775807L) {
            this.f9419d.c(j10, 1, i11, 0, null);
            this.f9427l += this.f9425j;
        }
        this.f9422g = 0;
        this.f9421f = 0;
    }

    private void h(p3.a0 a0Var) {
        int min = Math.min(a0Var.a(), 4 - this.f9422g);
        a0Var.l(this.f9416a.e(), this.f9422g, min);
        int i10 = this.f9422g + min;
        this.f9422g = i10;
        if (i10 < 4) {
            return;
        }
        this.f9416a.T(0);
        if (!this.f9417b.a(this.f9416a.p())) {
            this.f9422g = 0;
            this.f9421f = 1;
            return;
        }
        h0.a aVar = this.f9417b;
        this.f9426k = aVar.f18610c;
        if (!this.f9423h) {
            this.f9425j = (aVar.f18614g * 1000000) / aVar.f18611d;
            this.f9419d.e(new n1.b().U(this.f9420e).g0(this.f9417b.f18609b).Y(4096).J(this.f9417b.f18612e).h0(this.f9417b.f18611d).X(this.f9418c).G());
            this.f9423h = true;
        }
        this.f9416a.T(0);
        this.f9419d.d(this.f9416a, 4);
        this.f9421f = 2;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        p3.a.h(this.f9419d);
        while (a0Var.a() > 0) {
            int i10 = this.f9421f;
            if (i10 == 0) {
                f(a0Var);
            } else if (i10 == 1) {
                h(a0Var);
            } else if (i10 != 2) {
                throw new IllegalStateException();
            } else {
                g(a0Var);
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f9421f = 0;
        this.f9422g = 0;
        this.f9424i = false;
        this.f9427l = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        dVar.a();
        this.f9420e = dVar.b();
        this.f9419d = nVar.d(dVar.c(), 1);
    }

    @Override // h2.m
    public void d() {
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9427l = j10;
        }
    }
}
