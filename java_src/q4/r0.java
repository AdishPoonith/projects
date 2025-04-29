package q4;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r0 extends q0 {

    /* renamed from: n  reason: collision with root package name */
    static final q0 f16211n = new r0(new Object[0], 0);

    /* renamed from: l  reason: collision with root package name */
    final transient Object[] f16212l;

    /* renamed from: m  reason: collision with root package name */
    private final transient int f16213m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(Object[] objArr, int i10) {
        this.f16212l = objArr;
        this.f16213m = i10;
    }

    @Override // q4.q0, q4.n0
    final int b(Object[] objArr, int i10) {
        System.arraycopy(this.f16212l, 0, objArr, 0, this.f16213m);
        return this.f16213m;
    }

    @Override // q4.n0
    final int e() {
        return this.f16213m;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        k0.a(i10, this.f16213m, "index");
        Object obj = this.f16212l[i10];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q4.n0
    public final int k() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q4.n0
    public final boolean p() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q4.n0
    public final Object[] q() {
        return this.f16212l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16213m;
    }
}
