package b6;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final f0<?> f3052a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3053b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3054c;

    private r(f0<?> f0Var, int i10, int i11) {
        this.f3052a = (f0) e0.c(f0Var, "Null dependency anInterface.");
        this.f3053b = i10;
        this.f3054c = i11;
    }

    private r(Class<?> cls, int i10, int i11) {
        this(f0.b(cls), i10, i11);
    }

    public static r a(Class<?> cls) {
        return new r(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i10);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    public static r h(Class<?> cls) {
        return new r(cls, 0, 0);
    }

    public static r i(Class<?> cls) {
        return new r(cls, 0, 1);
    }

    public static r j(f0<?> f0Var) {
        return new r(f0Var, 1, 0);
    }

    public static r k(Class<?> cls) {
        return new r(cls, 1, 0);
    }

    public static r l(Class<?> cls) {
        return new r(cls, 1, 1);
    }

    public static r m(Class<?> cls) {
        return new r(cls, 2, 0);
    }

    public f0<?> c() {
        return this.f3052a;
    }

    public boolean d() {
        return this.f3054c == 2;
    }

    public boolean e() {
        return this.f3054c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f3052a.equals(rVar.f3052a) && this.f3053b == rVar.f3053b && this.f3054c == rVar.f3054c;
        }
        return false;
    }

    public boolean f() {
        return this.f3053b == 1;
    }

    public boolean g() {
        return this.f3053b == 2;
    }

    public int hashCode() {
        return ((((this.f3052a.hashCode() ^ 1000003) * 1000003) ^ this.f3053b) * 1000003) ^ this.f3054c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f3052a);
        sb.append(", type=");
        int i10 = this.f3053b;
        sb.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f3054c));
        sb.append("}");
        return sb.toString();
    }
}
