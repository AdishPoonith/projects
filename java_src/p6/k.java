package p6;

import p6.v0;
/* loaded from: classes.dex */
final class k extends v0.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f15598a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15599b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(int i10, int i11) {
        this.f15598a = i10;
        this.f15599b = i11;
    }

    @Override // p6.v0.a
    int b() {
        return this.f15599b;
    }

    @Override // p6.v0.a
    int d() {
        return this.f15598a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v0.a) {
            v0.a aVar = (v0.a) obj;
            return this.f15598a == aVar.d() && this.f15599b == aVar.b();
        }
        return false;
    }

    public int hashCode() {
        return ((this.f15598a ^ 1000003) * 1000003) ^ this.f15599b;
    }

    public String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.f15598a + ", existenceFilterCount=" + this.f15599b + "}";
    }
}
