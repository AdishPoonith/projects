package x2;

import y2.i;
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final x1.d f20226a;

    /* renamed from: b  reason: collision with root package name */
    private final long f20227b;

    public h(x1.d dVar, long j10) {
        this.f20226a = dVar;
        this.f20227b = j10;
    }

    @Override // x2.f
    public long a(long j10, long j11) {
        return this.f20226a.a(j10 + this.f20227b);
    }

    @Override // x2.f
    public long b(long j10, long j11) {
        return this.f20226a.f20113d[(int) j10];
    }

    @Override // x2.f
    public long c(long j10, long j11) {
        return 0L;
    }

    @Override // x2.f
    public long d(long j10) {
        return this.f20226a.f20114e[(int) j10] - this.f20227b;
    }

    @Override // x2.f
    public long e(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // x2.f
    public i f(long j10) {
        x1.d dVar = this.f20226a;
        int i10 = (int) j10;
        return new i(null, dVar.f20112c[i10], dVar.f20111b[i10]);
    }

    @Override // x2.f
    public boolean g() {
        return true;
    }

    @Override // x2.f
    public long h() {
        return 0L;
    }

    @Override // x2.f
    public long i(long j10) {
        return this.f20226a.f20110a;
    }

    @Override // x2.f
    public long j(long j10, long j11) {
        return this.f20226a.f20110a;
    }
}
