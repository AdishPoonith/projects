package j6;
/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f12336a;

    /* renamed from: b  reason: collision with root package name */
    private final m6.l f12337b;

    /* loaded from: classes.dex */
    public enum a {
        ADDED,
        REMOVED
    }

    public u0(a aVar, m6.l lVar) {
        this.f12336a = aVar;
        this.f12337b = lVar;
    }

    public m6.l a() {
        return this.f12337b;
    }

    public a b() {
        return this.f12336a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            return this.f12336a.equals(u0Var.b()) && this.f12337b.equals(u0Var.a());
        }
        return false;
    }

    public int hashCode() {
        return ((2077 + this.f12336a.hashCode()) * 31) + this.f12337b.hashCode();
    }
}
