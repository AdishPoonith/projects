package m6;
/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: l  reason: collision with root package name */
    public static final f f13799l = g("", "");

    /* renamed from: j  reason: collision with root package name */
    private final String f13800j;

    /* renamed from: k  reason: collision with root package name */
    private final String f13801k;

    private f(String str, String str2) {
        this.f13800j = str;
        this.f13801k = str2;
    }

    public static f g(String str, String str2) {
        return new f(str, str2);
    }

    public static f h(String str) {
        u v10 = u.v(str);
        q6.b.d(v10.q() > 3 && v10.n(0).equals("projects") && v10.n(2).equals("databases"), "Tried to parse an invalid resource name: %s", v10);
        return new f(v10.n(1), v10.n(3));
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(f fVar) {
        int compareTo = this.f13800j.compareTo(fVar.f13800j);
        return compareTo != 0 ? compareTo : this.f13801k.compareTo(fVar.f13801k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13800j.equals(fVar.f13800j) && this.f13801k.equals(fVar.f13801k);
    }

    public int hashCode() {
        return (this.f13800j.hashCode() * 31) + this.f13801k.hashCode();
    }

    public String i() {
        return this.f13801k;
    }

    public String k() {
        return this.f13800j;
    }

    public String toString() {
        return "DatabaseId(" + this.f13800j + ", " + this.f13801k + ")";
    }
}
