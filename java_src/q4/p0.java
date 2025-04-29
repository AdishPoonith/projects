package q4;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p0 extends q0 {

    /* renamed from: l  reason: collision with root package name */
    final transient int f16203l;

    /* renamed from: m  reason: collision with root package name */
    final transient int f16204m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ q0 f16205n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(q0 q0Var, int i10, int i11) {
        this.f16205n = q0Var;
        this.f16203l = i10;
        this.f16204m = i11;
    }

    @Override // q4.n0
    final int e() {
        return this.f16205n.k() + this.f16203l + this.f16204m;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        k0.a(i10, this.f16204m, "index");
        return this.f16205n.get(i10 + this.f16203l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q4.n0
    public final int k() {
        return this.f16205n.k() + this.f16203l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q4.n0
    public final boolean p() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // q4.n0
    public final Object[] q() {
        return this.f16205n.q();
    }

    @Override // q4.q0
    public final q0 r(int i10, int i11) {
        k0.c(i10, i11, this.f16204m);
        q0 q0Var = this.f16205n;
        int i12 = this.f16203l;
        return q0Var.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16204m;
    }

    @Override // q4.q0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
