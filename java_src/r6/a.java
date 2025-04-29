package r6;

import java.util.List;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f16703a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f16704b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f16703a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f16704b = list;
    }

    @Override // r6.l
    public List<String> b() {
        return this.f16704b;
    }

    @Override // r6.l
    public String c() {
        return this.f16703a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f16703a.equals(lVar.c()) && this.f16704b.equals(lVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f16703a.hashCode() ^ 1000003) * 1000003) ^ this.f16704b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f16703a + ", usedDates=" + this.f16704b + "}";
    }
}
