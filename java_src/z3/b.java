package z3;
/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    static int f20860b = 31;

    /* renamed from: a  reason: collision with root package name */
    private int f20861a = 1;

    public b a(Object obj) {
        this.f20861a = (f20860b * this.f20861a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f20861a;
    }

    public final b c(boolean z10) {
        this.f20861a = (f20860b * this.f20861a) + (z10 ? 1 : 0);
        return this;
    }
}
