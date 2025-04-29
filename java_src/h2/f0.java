package h2;

import p3.n0;
/* loaded from: classes.dex */
final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f9159a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9162d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9163e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9164f;

    /* renamed from: b  reason: collision with root package name */
    private final p3.j0 f9160b = new p3.j0(0);

    /* renamed from: g  reason: collision with root package name */
    private long f9165g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f9166h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f9167i = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private final p3.a0 f9161c = new p3.a0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(int i10) {
        this.f9159a = i10;
    }

    private int a(x1.m mVar) {
        this.f9161c.Q(n0.f15402f);
        this.f9162d = true;
        mVar.f();
        return 0;
    }

    private int f(x1.m mVar, x1.a0 a0Var, int i10) {
        int min = (int) Math.min(this.f9159a, mVar.a());
        long j10 = 0;
        if (mVar.p() != j10) {
            a0Var.f20102a = j10;
            return 1;
        }
        this.f9161c.P(min);
        mVar.f();
        mVar.n(this.f9161c.e(), 0, min);
        this.f9165g = g(this.f9161c, i10);
        this.f9163e = true;
        return 0;
    }

    private long g(p3.a0 a0Var, int i10) {
        int g10 = a0Var.g();
        for (int f10 = a0Var.f(); f10 < g10; f10++) {
            if (a0Var.e()[f10] == 71) {
                long c10 = j0.c(a0Var, f10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(x1.m mVar, x1.a0 a0Var, int i10) {
        long a10 = mVar.a();
        int min = (int) Math.min(this.f9159a, a10);
        long j10 = a10 - min;
        if (mVar.p() != j10) {
            a0Var.f20102a = j10;
            return 1;
        }
        this.f9161c.P(min);
        mVar.f();
        mVar.n(this.f9161c.e(), 0, min);
        this.f9166h = i(this.f9161c, i10);
        this.f9164f = true;
        return 0;
    }

    private long i(p3.a0 a0Var, int i10) {
        int f10 = a0Var.f();
        int g10 = a0Var.g();
        for (int i11 = g10 - 188; i11 >= f10; i11--) {
            if (j0.b(a0Var.e(), f10, g10, i11)) {
                long c10 = j0.c(a0Var, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f9167i;
    }

    public p3.j0 c() {
        return this.f9160b;
    }

    public boolean d() {
        return this.f9162d;
    }

    public int e(x1.m mVar, x1.a0 a0Var, int i10) {
        if (i10 <= 0) {
            return a(mVar);
        }
        if (this.f9164f) {
            if (this.f9166h == -9223372036854775807L) {
                return a(mVar);
            }
            if (this.f9163e) {
                long j10 = this.f9165g;
                if (j10 == -9223372036854775807L) {
                    return a(mVar);
                }
                long b10 = this.f9160b.b(this.f9166h) - this.f9160b.b(j10);
                this.f9167i = b10;
                if (b10 < 0) {
                    p3.r.i("TsDurationReader", "Invalid duration: " + this.f9167i + ". Using TIME_UNSET instead.");
                    this.f9167i = -9223372036854775807L;
                }
                return a(mVar);
            }
            return f(mVar, a0Var, i10);
        }
        return h(mVar, a0Var, i10);
    }
}
