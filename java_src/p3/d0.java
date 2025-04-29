package p3;
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: c  reason: collision with root package name */
    public static final d0 f15343c = new d0(-1, -1);

    /* renamed from: d  reason: collision with root package name */
    public static final d0 f15344d = new d0(0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f15345a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15346b;

    public d0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f15345a = i10;
        this.f15346b = i11;
    }

    public int a() {
        return this.f15346b;
    }

    public int b() {
        return this.f15345a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            return this.f15345a == d0Var.f15345a && this.f15346b == d0Var.f15346b;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f15346b;
        int i11 = this.f15345a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f15345a + "x" + this.f15346b;
    }
}
