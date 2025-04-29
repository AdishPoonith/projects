package c2;

import x1.b0;
import x1.c0;
import x1.e0;
import x1.n;
/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: j  reason: collision with root package name */
    private final long f3185j;

    /* renamed from: k  reason: collision with root package name */
    private final n f3186k;

    /* loaded from: classes.dex */
    class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f3187a;

        a(b0 b0Var) {
            this.f3187a = b0Var;
        }

        @Override // x1.b0
        public boolean f() {
            return this.f3187a.f();
        }

        @Override // x1.b0
        public b0.a g(long j10) {
            b0.a g10 = this.f3187a.g(j10);
            c0 c0Var = g10.f20103a;
            c0 c0Var2 = new c0(c0Var.f20108a, c0Var.f20109b + d.this.f3185j);
            c0 c0Var3 = g10.f20104b;
            return new b0.a(c0Var2, new c0(c0Var3.f20108a, c0Var3.f20109b + d.this.f3185j));
        }

        @Override // x1.b0
        public long h() {
            return this.f3187a.h();
        }
    }

    public d(long j10, n nVar) {
        this.f3185j = j10;
        this.f3186k = nVar;
    }

    @Override // x1.n
    public e0 d(int i10, int i11) {
        return this.f3186k.d(i10, i11);
    }

    @Override // x1.n
    public void k() {
        this.f3186k.k();
    }

    @Override // x1.n
    public void t(b0 b0Var) {
        this.f3186k.t(new a(b0Var));
    }
}
