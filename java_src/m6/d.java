package m6;

import java.util.Objects;
import m6.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends q.c {

    /* renamed from: j  reason: collision with root package name */
    private final r f13796j;

    /* renamed from: k  reason: collision with root package name */
    private final q.c.a f13797k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(r rVar, q.c.a aVar) {
        Objects.requireNonNull(rVar, "Null fieldPath");
        this.f13796j = rVar;
        Objects.requireNonNull(aVar, "Null kind");
        this.f13797k = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q.c) {
            q.c cVar = (q.c) obj;
            return this.f13796j.equals(cVar.h()) && this.f13797k.equals(cVar.i());
        }
        return false;
    }

    @Override // m6.q.c
    public r h() {
        return this.f13796j;
    }

    public int hashCode() {
        return ((this.f13796j.hashCode() ^ 1000003) * 1000003) ^ this.f13797k.hashCode();
    }

    @Override // m6.q.c
    public q.c.a i() {
        return this.f13797k;
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f13796j + ", kind=" + this.f13797k + "}";
    }
}
