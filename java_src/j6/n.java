package j6;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final a f12256a;

    /* renamed from: b  reason: collision with root package name */
    private final m6.i f12257b;

    /* loaded from: classes.dex */
    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    private n(a aVar, m6.i iVar) {
        this.f12256a = aVar;
        this.f12257b = iVar;
    }

    public static n a(a aVar, m6.i iVar) {
        return new n(aVar, iVar);
    }

    public m6.i b() {
        return this.f12257b;
    }

    public a c() {
        return this.f12256a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f12256a.equals(nVar.f12256a) && this.f12257b.equals(nVar.f12257b);
        }
        return false;
    }

    public int hashCode() {
        return ((((1891 + this.f12256a.hashCode()) * 31) + this.f12257b.getKey().hashCode()) * 31) + this.f12257b.k().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f12257b + "," + this.f12256a + ")";
    }
}
