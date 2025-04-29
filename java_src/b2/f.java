package b2;

import b2.e;
import p3.a0;
import p3.w;
import s1.n1;
import x1.e0;
/* loaded from: classes.dex */
final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    private final a0 f2884b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f2885c;

    /* renamed from: d  reason: collision with root package name */
    private int f2886d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2887e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2888f;

    /* renamed from: g  reason: collision with root package name */
    private int f2889g;

    public f(e0 e0Var) {
        super(e0Var);
        this.f2884b = new a0(w.f15443a);
        this.f2885c = new a0(4);
    }

    @Override // b2.e
    protected boolean b(a0 a0Var) {
        int G = a0Var.G();
        int i10 = (G >> 4) & 15;
        int i11 = G & 15;
        if (i11 == 7) {
            this.f2889g = i10;
            return i10 != 5;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    @Override // b2.e
    protected boolean c(a0 a0Var, long j10) {
        int G = a0Var.G();
        long q10 = j10 + (a0Var.q() * 1000);
        if (G == 0 && !this.f2887e) {
            a0 a0Var2 = new a0(new byte[a0Var.a()]);
            a0Var.l(a0Var2.e(), 0, a0Var.a());
            q3.a b10 = q3.a.b(a0Var2);
            this.f2886d = b10.f16016b;
            this.f2883a.e(new n1.b().g0("video/avc").K(b10.f16020f).n0(b10.f16017c).S(b10.f16018d).c0(b10.f16019e).V(b10.f16015a).G());
            this.f2887e = true;
            return false;
        } else if (G == 1 && this.f2887e) {
            int i10 = this.f2889g == 1 ? 1 : 0;
            if (this.f2888f || i10 != 0) {
                byte[] e10 = this.f2885c.e();
                e10[0] = 0;
                e10[1] = 0;
                e10[2] = 0;
                int i11 = 4 - this.f2886d;
                int i12 = 0;
                while (a0Var.a() > 0) {
                    a0Var.l(this.f2885c.e(), i11, this.f2886d);
                    this.f2885c.T(0);
                    int K = this.f2885c.K();
                    this.f2884b.T(0);
                    this.f2883a.d(this.f2884b, 4);
                    this.f2883a.d(a0Var, K);
                    i12 = i12 + 4 + K;
                }
                this.f2883a.c(q10, i10, i12, 0, null);
                this.f2888f = true;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
