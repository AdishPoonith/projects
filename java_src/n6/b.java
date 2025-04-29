package n6;

import java.util.Objects;
/* loaded from: classes.dex */
final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final int f14307a;

    /* renamed from: b  reason: collision with root package name */
    private final f f14308b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, f fVar) {
        this.f14307a = i10;
        Objects.requireNonNull(fVar, "Null mutation");
        this.f14308b = fVar;
    }

    @Override // n6.k
    public int c() {
        return this.f14307a;
    }

    @Override // n6.k
    public f d() {
        return this.f14308b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f14307a == kVar.c() && this.f14308b.equals(kVar.d());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14307a ^ 1000003) * 1000003) ^ this.f14308b.hashCode();
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f14307a + ", mutation=" + this.f14308b + "}";
    }
}
