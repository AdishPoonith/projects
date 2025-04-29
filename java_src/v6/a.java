package v6;

import java.util.Objects;
/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f19430a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19431b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f19430a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f19431b = str2;
    }

    @Override // v6.f
    public String b() {
        return this.f19430a;
    }

    @Override // v6.f
    public String c() {
        return this.f19431b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f19430a.equals(fVar.b()) && this.f19431b.equals(fVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19430a.hashCode() ^ 1000003) * 1000003) ^ this.f19431b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f19430a + ", version=" + this.f19431b + "}";
    }
}
