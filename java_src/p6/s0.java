package p6;
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.protobuf.i f15674a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15675b;

    /* renamed from: c  reason: collision with root package name */
    private final d6.e<m6.l> f15676c;

    /* renamed from: d  reason: collision with root package name */
    private final d6.e<m6.l> f15677d;

    /* renamed from: e  reason: collision with root package name */
    private final d6.e<m6.l> f15678e;

    public s0(com.google.protobuf.i iVar, boolean z10, d6.e<m6.l> eVar, d6.e<m6.l> eVar2, d6.e<m6.l> eVar3) {
        this.f15674a = iVar;
        this.f15675b = z10;
        this.f15676c = eVar;
        this.f15677d = eVar2;
        this.f15678e = eVar3;
    }

    public static s0 a(boolean z10, com.google.protobuf.i iVar) {
        return new s0(iVar, z10, m6.l.i(), m6.l.i(), m6.l.i());
    }

    public d6.e<m6.l> b() {
        return this.f15676c;
    }

    public d6.e<m6.l> c() {
        return this.f15677d;
    }

    public d6.e<m6.l> d() {
        return this.f15678e;
    }

    public com.google.protobuf.i e() {
        return this.f15674a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (this.f15675b == s0Var.f15675b && this.f15674a.equals(s0Var.f15674a) && this.f15676c.equals(s0Var.f15676c) && this.f15677d.equals(s0Var.f15677d)) {
            return this.f15678e.equals(s0Var.f15678e);
        }
        return false;
    }

    public boolean f() {
        return this.f15675b;
    }

    public int hashCode() {
        return (((((((this.f15674a.hashCode() * 31) + (this.f15675b ? 1 : 0)) * 31) + this.f15676c.hashCode()) * 31) + this.f15677d.hashCode()) * 31) + this.f15678e.hashCode();
    }
}
