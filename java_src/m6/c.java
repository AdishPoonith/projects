package m6;

import java.util.Objects;
import m6.q;
/* loaded from: classes.dex */
final class c extends q.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f13794a;

    /* renamed from: b  reason: collision with root package name */
    private final q.a f13795b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(long j10, q.a aVar) {
        this.f13794a = j10;
        Objects.requireNonNull(aVar, "Null offset");
        this.f13795b = aVar;
    }

    @Override // m6.q.b
    public q.a c() {
        return this.f13795b;
    }

    @Override // m6.q.b
    public long d() {
        return this.f13794a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q.b) {
            q.b bVar = (q.b) obj;
            return this.f13794a == bVar.d() && this.f13795b.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f13794a;
        return this.f13795b.hashCode() ^ ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f13794a + ", offset=" + this.f13795b + "}";
    }
}
