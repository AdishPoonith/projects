package i7;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f9771a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9772b;

    public int a() {
        return this.f9772b;
    }

    public int b() {
        return this.f9771a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f9771a == bVar.f9771a && this.f9772b == bVar.f9772b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f9771a * 32713) + this.f9772b;
    }

    public String toString() {
        return this.f9771a + "x" + this.f9772b;
    }
}
