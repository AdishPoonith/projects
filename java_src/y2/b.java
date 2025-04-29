package y2;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f20378a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20379b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20380c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20381d;

    public b(String str, String str2, int i10, int i11) {
        this.f20378a = str;
        this.f20379b = str2;
        this.f20380c = i10;
        this.f20381d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f20380c == bVar.f20380c && this.f20381d == bVar.f20381d && b5.j.a(this.f20378a, bVar.f20378a) && b5.j.a(this.f20379b, bVar.f20379b);
        }
        return false;
    }

    public int hashCode() {
        return b5.j.b(this.f20378a, this.f20379b, Integer.valueOf(this.f20380c), Integer.valueOf(this.f20381d));
    }
}
