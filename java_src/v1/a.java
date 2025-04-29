package v1;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: j  reason: collision with root package name */
    private int f19338j;

    public final void k(int i10) {
        this.f19338j = i10 | this.f19338j;
    }

    public void l() {
        this.f19338j = 0;
    }

    public final void n(int i10) {
        this.f19338j = (~i10) & this.f19338j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean o(int i10) {
        return (this.f19338j & i10) == i10;
    }

    public final boolean p() {
        return o(268435456);
    }

    public final boolean q() {
        return o(Integer.MIN_VALUE);
    }

    public final boolean r() {
        return o(4);
    }

    public final boolean s() {
        return o(134217728);
    }

    public final boolean t() {
        return o(1);
    }

    public final boolean u() {
        return o(536870912);
    }

    public final void v(int i10) {
        this.f19338j = i10;
    }
}
