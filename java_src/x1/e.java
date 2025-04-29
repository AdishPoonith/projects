package x1;

import x1.b0;
/* loaded from: classes.dex */
public class e implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f20116a;

    /* renamed from: b  reason: collision with root package name */
    private final long f20117b;

    /* renamed from: c  reason: collision with root package name */
    private final int f20118c;

    /* renamed from: d  reason: collision with root package name */
    private final long f20119d;

    /* renamed from: e  reason: collision with root package name */
    private final int f20120e;

    /* renamed from: f  reason: collision with root package name */
    private final long f20121f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f20122g;

    public e(long j10, long j11, int i10, int i11, boolean z10) {
        long c10;
        this.f20116a = j10;
        this.f20117b = j11;
        this.f20118c = i11 == -1 ? 1 : i11;
        this.f20120e = i10;
        this.f20122g = z10;
        if (j10 == -1) {
            this.f20119d = -1L;
            c10 = -9223372036854775807L;
        } else {
            this.f20119d = j10 - j11;
            c10 = c(j10, j11, i10);
        }
        this.f20121f = c10;
    }

    private long a(long j10) {
        int i10 = this.f20118c;
        long j11 = (((j10 * this.f20120e) / 8000000) / i10) * i10;
        long j12 = this.f20119d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - i10);
        }
        return this.f20117b + Math.max(j11, 0L);
    }

    private static long c(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    public long b(long j10) {
        return c(j10, this.f20117b, this.f20120e);
    }

    @Override // x1.b0
    public boolean f() {
        return this.f20119d != -1 || this.f20122g;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        if (this.f20119d != -1 || this.f20122g) {
            long a10 = a(j10);
            long b10 = b(a10);
            c0 c0Var = new c0(b10, a10);
            if (this.f20119d != -1 && b10 < j10) {
                int i10 = this.f20118c;
                if (i10 + a10 < this.f20116a) {
                    long j11 = a10 + i10;
                    return new b0.a(c0Var, new c0(b(j11), j11));
                }
            }
            return new b0.a(c0Var);
        }
        return new b0.a(new c0(0L, this.f20117b));
    }

    @Override // x1.b0
    public long h() {
        return this.f20121f;
    }
}
