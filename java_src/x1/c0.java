package x1;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c  reason: collision with root package name */
    public static final c0 f20107c = new c0(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f20108a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20109b;

    public c0(long j10, long j11) {
        this.f20108a = j10;
        this.f20109b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c0.class != obj.getClass()) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f20108a == c0Var.f20108a && this.f20109b == c0Var.f20109b;
    }

    public int hashCode() {
        return (((int) this.f20108a) * 31) + ((int) this.f20109b);
    }

    public String toString() {
        return "[timeUs=" + this.f20108a + ", position=" + this.f20109b + "]";
    }
}
