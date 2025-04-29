package m6;

import java.util.List;
import java.util.Objects;
import m6.q;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends q {

    /* renamed from: c  reason: collision with root package name */
    private final int f13787c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13788d;

    /* renamed from: e  reason: collision with root package name */
    private final List<q.c> f13789e;

    /* renamed from: f  reason: collision with root package name */
    private final q.b f13790f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i10, String str, List<q.c> list, q.b bVar) {
        this.f13787c = i10;
        Objects.requireNonNull(str, "Null collectionGroup");
        this.f13788d = str;
        Objects.requireNonNull(list, "Null segments");
        this.f13789e = list;
        Objects.requireNonNull(bVar, "Null indexState");
        this.f13790f = bVar;
    }

    @Override // m6.q
    public String d() {
        return this.f13788d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f13787c == qVar.f() && this.f13788d.equals(qVar.d()) && this.f13789e.equals(qVar.h()) && this.f13790f.equals(qVar.g());
        }
        return false;
    }

    @Override // m6.q
    public int f() {
        return this.f13787c;
    }

    @Override // m6.q
    public q.b g() {
        return this.f13790f;
    }

    @Override // m6.q
    public List<q.c> h() {
        return this.f13789e;
    }

    public int hashCode() {
        return ((((((this.f13787c ^ 1000003) * 1000003) ^ this.f13788d.hashCode()) * 1000003) ^ this.f13789e.hashCode()) * 1000003) ^ this.f13790f.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f13787c + ", collectionGroup=" + this.f13788d + ", segments=" + this.f13789e + ", indexState=" + this.f13790f + "}";
    }
}
