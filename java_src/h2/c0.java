package h2;

import h2.i0;
import p3.n0;
/* loaded from: classes.dex */
public final class c0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f9129a;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f9130b = new p3.a0(32);

    /* renamed from: c  reason: collision with root package name */
    private int f9131c;

    /* renamed from: d  reason: collision with root package name */
    private int f9132d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9133e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9134f;

    public c0(b0 b0Var) {
        this.f9129a = b0Var;
    }

    @Override // h2.i0
    public void a(p3.a0 a0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int f10 = z10 ? a0Var.f() + a0Var.G() : -1;
        if (this.f9134f) {
            if (!z10) {
                return;
            }
            this.f9134f = false;
            a0Var.T(f10);
            this.f9132d = 0;
        }
        while (a0Var.a() > 0) {
            int i11 = this.f9132d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int G = a0Var.G();
                    a0Var.T(a0Var.f() - 1);
                    if (G == 255) {
                        this.f9134f = true;
                        return;
                    }
                }
                int min = Math.min(a0Var.a(), 3 - this.f9132d);
                a0Var.l(this.f9130b.e(), this.f9132d, min);
                int i12 = this.f9132d + min;
                this.f9132d = i12;
                if (i12 == 3) {
                    this.f9130b.T(0);
                    this.f9130b.S(3);
                    this.f9130b.U(1);
                    int G2 = this.f9130b.G();
                    int G3 = this.f9130b.G();
                    this.f9133e = (G2 & 128) != 0;
                    this.f9131c = (((G2 & 15) << 8) | G3) + 3;
                    int b10 = this.f9130b.b();
                    int i13 = this.f9131c;
                    if (b10 < i13) {
                        this.f9130b.c(Math.min(4098, Math.max(i13, this.f9130b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(a0Var.a(), this.f9131c - this.f9132d);
                a0Var.l(this.f9130b.e(), this.f9132d, min2);
                int i14 = this.f9132d + min2;
                this.f9132d = i14;
                int i15 = this.f9131c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f9133e) {
                        this.f9130b.S(i15);
                    } else if (n0.t(this.f9130b.e(), 0, this.f9131c, -1) != 0) {
                        this.f9134f = true;
                        return;
                    } else {
                        this.f9130b.S(this.f9131c - 4);
                    }
                    this.f9130b.T(0);
                    this.f9129a.a(this.f9130b);
                    this.f9132d = 0;
                }
            }
        }
    }

    @Override // h2.i0
    public void b() {
        this.f9134f = true;
    }

    @Override // h2.i0
    public void c(p3.j0 j0Var, x1.n nVar, i0.d dVar) {
        this.f9129a.c(j0Var, nVar, dVar);
        this.f9134f = true;
    }
}
