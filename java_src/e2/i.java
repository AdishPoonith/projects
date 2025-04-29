package e2;

import p3.a0;
import p3.n0;
import p3.r;
import u1.h0;
import x1.b0;
import x1.c0;
/* loaded from: classes.dex */
final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f8022a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8023b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8024c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8025d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8026e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f8027f;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    private i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f8022a = j10;
        this.f8023b = i10;
        this.f8024c = j11;
        this.f8027f = jArr;
        this.f8025d = j12;
        this.f8026e = j12 != -1 ? j10 + j12 : -1L;
    }

    public static i a(long j10, long j11, h0.a aVar, a0 a0Var) {
        int K;
        int i10 = aVar.f18614g;
        int i11 = aVar.f18611d;
        int p10 = a0Var.p();
        if ((p10 & 1) != 1 || (K = a0Var.K()) == 0) {
            return null;
        }
        long N0 = n0.N0(K, i10 * 1000000, i11);
        if ((p10 & 6) != 6) {
            return new i(j11, aVar.f18610c, N0);
        }
        long I = a0Var.I();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = a0Var.G();
        }
        if (j10 != -1) {
            long j12 = j11 + I;
            if (j10 != j12) {
                r.i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new i(j11, aVar.f18610c, N0, I, jArr);
    }

    private long b(int i10) {
        return (this.f8024c * i10) / 100;
    }

    @Override // e2.g
    public long d(long j10) {
        long j11 = j10 - this.f8022a;
        if (!f() || j11 <= this.f8023b) {
            return 0L;
        }
        long[] jArr = (long[]) p3.a.h(this.f8027f);
        double d10 = (j11 * 256.0d) / this.f8025d;
        int i10 = n0.i(jArr, (long) d10, true, true);
        long b10 = b(i10);
        long j12 = jArr[i10];
        int i11 = i10 + 1;
        long b11 = b(i11);
        long j13 = i10 == 99 ? 256L : jArr[i11];
        return b10 + Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (b11 - b10));
    }

    @Override // e2.g
    public long e() {
        return this.f8026e;
    }

    @Override // x1.b0
    public boolean f() {
        return this.f8027f != null;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        long[] jArr;
        if (f()) {
            long r10 = n0.r(j10, 0L, this.f8024c);
            double d10 = (r10 * 100.0d) / this.f8024c;
            double d11 = 0.0d;
            if (d10 > 0.0d) {
                if (d10 >= 100.0d) {
                    d11 = 256.0d;
                } else {
                    int i10 = (int) d10;
                    double d12 = ((long[]) p3.a.h(this.f8027f))[i10];
                    d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12));
                }
            }
            return new b0.a(new c0(r10, this.f8022a + n0.r(Math.round((d11 / 256.0d) * this.f8025d), this.f8023b, this.f8025d - 1)));
        }
        return new b0.a(new c0(0L, this.f8022a + this.f8023b));
    }

    @Override // x1.b0
    public long h() {
        return this.f8024c;
    }
}
