package m6;

import java.util.Objects;
import m6.q;
/* loaded from: classes.dex */
final class b extends q.a {

    /* renamed from: l  reason: collision with root package name */
    private final w f13791l;

    /* renamed from: m  reason: collision with root package name */
    private final l f13792m;

    /* renamed from: n  reason: collision with root package name */
    private final int f13793n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(w wVar, l lVar, int i10) {
        Objects.requireNonNull(wVar, "Null readTime");
        this.f13791l = wVar;
        Objects.requireNonNull(lVar, "Null documentKey");
        this.f13792m = lVar;
        this.f13793n = i10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q.a) {
            q.a aVar = (q.a) obj;
            return this.f13791l.equals(aVar.o()) && this.f13792m.equals(aVar.l()) && this.f13793n == aVar.n();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f13791l.hashCode() ^ 1000003) * 1000003) ^ this.f13792m.hashCode()) * 1000003) ^ this.f13793n;
    }

    @Override // m6.q.a
    public l l() {
        return this.f13792m;
    }

    @Override // m6.q.a
    public int n() {
        return this.f13793n;
    }

    @Override // m6.q.a
    public w o() {
        return this.f13791l;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f13791l + ", documentKey=" + this.f13792m + ", largestBatchId=" + this.f13793n + "}";
    }
}
