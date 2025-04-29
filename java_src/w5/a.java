package w5;
/* loaded from: classes.dex */
final class a extends p {

    /* renamed from: a  reason: collision with root package name */
    private final long f19943a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19944b;

    /* renamed from: c  reason: collision with root package name */
    private final long f19945c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(long j10, long j11, long j12) {
        this.f19943a = j10;
        this.f19944b = j11;
        this.f19945c = j12;
    }

    @Override // w5.p
    public long b() {
        return this.f19944b;
    }

    @Override // w5.p
    public long c() {
        return this.f19943a;
    }

    @Override // w5.p
    public long d() {
        return this.f19945c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.f19943a == pVar.c() && this.f19944b == pVar.b() && this.f19945c == pVar.d();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f19943a;
        long j11 = this.f19944b;
        long j12 = this.f19945c;
        return ((int) ((j12 >>> 32) ^ j12)) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f19943a + ", elapsedRealtime=" + this.f19944b + ", uptimeMillis=" + this.f19945c + "}";
    }
}
