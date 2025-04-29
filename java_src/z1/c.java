package z1;

import p3.a0;
/* loaded from: classes.dex */
final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f20694a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20695b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20696c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20697d;

    private c(int i10, int i11, int i12, int i13) {
        this.f20694a = i10;
        this.f20695b = i11;
        this.f20696c = i12;
        this.f20697d = i13;
    }

    public static c c(a0 a0Var) {
        int t10 = a0Var.t();
        a0Var.U(8);
        int t11 = a0Var.t();
        int t12 = a0Var.t();
        a0Var.U(4);
        int t13 = a0Var.t();
        a0Var.U(12);
        return new c(t10, t11, t12, t13);
    }

    @Override // z1.a
    public int a() {
        return 1751742049;
    }

    public boolean b() {
        return (this.f20695b & 16) == 16;
    }
}
