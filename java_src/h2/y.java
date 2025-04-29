package h2;

import p3.n0;
/* loaded from: classes.dex */
final class y {

    /* renamed from: c  reason: collision with root package name */
    private boolean f9452c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9453d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9454e;

    /* renamed from: a  reason: collision with root package name */
    private final p3.j0 f9450a = new p3.j0(0);

    /* renamed from: f  reason: collision with root package name */
    private long f9455f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f9456g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f9457h = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    private final p3.a0 f9451b = new p3.a0();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(x1.m mVar) {
        this.f9451b.Q(n0.f15402f);
        this.f9452c = true;
        mVar.f();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(x1.m mVar, x1.a0 a0Var) {
        int min = (int) Math.min(20000L, mVar.a());
        long j10 = 0;
        if (mVar.p() != j10) {
            a0Var.f20102a = j10;
            return 1;
        }
        this.f9451b.P(min);
        mVar.f();
        mVar.n(this.f9451b.e(), 0, min);
        this.f9455f = i(this.f9451b);
        this.f9453d = true;
        return 0;
    }

    private long i(p3.a0 a0Var) {
        int g10 = a0Var.g();
        for (int f10 = a0Var.f(); f10 < g10 - 3; f10++) {
            if (f(a0Var.e(), f10) == 442) {
                a0Var.T(f10 + 4);
                long l10 = l(a0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(x1.m mVar, x1.a0 a0Var) {
        long a10 = mVar.a();
        int min = (int) Math.min(20000L, a10);
        long j10 = a10 - min;
        if (mVar.p() != j10) {
            a0Var.f20102a = j10;
            return 1;
        }
        this.f9451b.P(min);
        mVar.f();
        mVar.n(this.f9451b.e(), 0, min);
        this.f9456g = k(this.f9451b);
        this.f9454e = true;
        return 0;
    }

    private long k(p3.a0 a0Var) {
        int f10 = a0Var.f();
        for (int g10 = a0Var.g() - 4; g10 >= f10; g10--) {
            if (f(a0Var.e(), g10) == 442) {
                a0Var.T(g10 + 4);
                long l10 = l(a0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(p3.a0 a0Var) {
        int f10 = a0Var.f();
        if (a0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.l(bArr, 0, 9);
        a0Var.T(f10);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.f9457h;
    }

    public p3.j0 d() {
        return this.f9450a;
    }

    public boolean e() {
        return this.f9452c;
    }

    public int g(x1.m mVar, x1.a0 a0Var) {
        if (this.f9454e) {
            if (this.f9456g == -9223372036854775807L) {
                return b(mVar);
            }
            if (this.f9453d) {
                long j10 = this.f9455f;
                if (j10 == -9223372036854775807L) {
                    return b(mVar);
                }
                long b10 = this.f9450a.b(this.f9456g) - this.f9450a.b(j10);
                this.f9457h = b10;
                if (b10 < 0) {
                    p3.r.i("PsDurationReader", "Invalid duration: " + this.f9457h + ". Using TIME_UNSET instead.");
                    this.f9457h = -9223372036854775807L;
                }
                return b(mVar);
            }
            return h(mVar, a0Var);
        }
        return j(mVar, a0Var);
    }
}
