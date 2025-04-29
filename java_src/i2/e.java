package i2;

import p3.n0;
import x1.b0;
import x1.c0;
/* loaded from: classes.dex */
final class e implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final c f9667a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9668b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9669c;

    /* renamed from: d  reason: collision with root package name */
    private final long f9670d;

    /* renamed from: e  reason: collision with root package name */
    private final long f9671e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f9667a = cVar;
        this.f9668b = i10;
        this.f9669c = j10;
        long j12 = (j11 - j10) / cVar.f9662e;
        this.f9670d = j12;
        this.f9671e = a(j12);
    }

    private long a(long j10) {
        return n0.N0(j10 * this.f9668b, 1000000L, this.f9667a.f9660c);
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        long r10 = n0.r((this.f9667a.f9660c * j10) / (this.f9668b * 1000000), 0L, this.f9670d - 1);
        long j11 = this.f9669c + (this.f9667a.f9662e * r10);
        long a10 = a(r10);
        c0 c0Var = new c0(a10, j11);
        if (a10 >= j10 || r10 == this.f9670d - 1) {
            return new b0.a(c0Var);
        }
        long j12 = r10 + 1;
        return new b0.a(c0Var, new c0(a(j12), this.f9669c + (this.f9667a.f9662e * j12)));
    }

    @Override // x1.b0
    public long h() {
        return this.f9671e;
    }
}
