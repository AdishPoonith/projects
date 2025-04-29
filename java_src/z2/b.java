package z2;

import h2.h0;
import p3.j0;
import s1.n1;
import x1.a0;
/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: d  reason: collision with root package name */
    private static final a0 f20724d = new a0();

    /* renamed from: a  reason: collision with root package name */
    final x1.l f20725a;

    /* renamed from: b  reason: collision with root package name */
    private final n1 f20726b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f20727c;

    public b(x1.l lVar, n1 n1Var, j0 j0Var) {
        this.f20725a = lVar;
        this.f20726b = n1Var;
        this.f20727c = j0Var;
    }

    @Override // z2.j
    public boolean a() {
        x1.l lVar = this.f20725a;
        return (lVar instanceof h2.h) || (lVar instanceof h2.b) || (lVar instanceof h2.e) || (lVar instanceof e2.f);
    }

    @Override // z2.j
    public boolean b(x1.m mVar) {
        return this.f20725a.i(mVar, f20724d) == 0;
    }

    @Override // z2.j
    public void c(x1.n nVar) {
        this.f20725a.c(nVar);
    }

    @Override // z2.j
    public void d() {
        this.f20725a.b(0L, 0L);
    }

    @Override // z2.j
    public boolean e() {
        x1.l lVar = this.f20725a;
        return (lVar instanceof h0) || (lVar instanceof f2.g);
    }

    @Override // z2.j
    public j f() {
        x1.l fVar;
        p3.a.f(!e());
        x1.l lVar = this.f20725a;
        if (lVar instanceof t) {
            fVar = new t(this.f20726b.f17410l, this.f20727c);
        } else if (lVar instanceof h2.h) {
            fVar = new h2.h();
        } else if (lVar instanceof h2.b) {
            fVar = new h2.b();
        } else if (lVar instanceof h2.e) {
            fVar = new h2.e();
        } else if (!(lVar instanceof e2.f)) {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f20725a.getClass().getSimpleName());
        } else {
            fVar = new e2.f();
        }
        return new b(fVar, this.f20726b, this.f20727c);
    }
}
