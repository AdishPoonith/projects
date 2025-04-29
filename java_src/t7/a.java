package t7;
/* loaded from: classes.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: o  reason: collision with root package name */
    private static final a[] f18333o;

    /* renamed from: j  reason: collision with root package name */
    private final int f18335j;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        f18333o = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i10) {
        this.f18335j = i10;
    }

    public int b() {
        return this.f18335j;
    }
}
