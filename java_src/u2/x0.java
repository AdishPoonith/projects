package u2;

import s1.v1;
import s1.y3;
import u2.u;
/* loaded from: classes.dex */
public abstract class x0 extends f<Void> {

    /* renamed from: u  reason: collision with root package name */
    private static final Void f19003u = null;

    /* renamed from: t  reason: collision with root package name */
    protected final u f19004t;

    /* JADX INFO: Access modifiers changed from: protected */
    public x0(u uVar) {
        this.f19004t = uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.f, u2.a
    public final void C(o3.p0 p0Var) {
        super.C(p0Var);
        V();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.f
    /* renamed from: M */
    public final u.b G(Void r12, u.b bVar) {
        return N(bVar);
    }

    protected abstract u.b N(u.b bVar);

    protected long O(long j10) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.f
    /* renamed from: P */
    public final long H(Void r12, long j10) {
        return O(j10);
    }

    protected int Q(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.f
    /* renamed from: R */
    public final int I(Void r12, int i10) {
        return Q(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // u2.f
    /* renamed from: S */
    public final void K(Void r12, u uVar, y3 y3Var) {
        T(y3Var);
    }

    protected abstract void T(y3 y3Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U() {
        L(f19003u, this.f19004t);
    }

    protected abstract void V();

    @Override // u2.u
    public v1 a() {
        return this.f19004t.a();
    }

    @Override // u2.a, u2.u
    public boolean g() {
        return this.f19004t.g();
    }

    @Override // u2.a, u2.u
    public y3 j() {
        return this.f19004t.j();
    }
}
