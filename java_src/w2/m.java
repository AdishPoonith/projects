package w2;

import o3.o0;
import s1.n1;
import w2.g;
/* loaded from: classes.dex */
public final class m extends f {

    /* renamed from: j  reason: collision with root package name */
    private final g f19833j;

    /* renamed from: k  reason: collision with root package name */
    private g.b f19834k;

    /* renamed from: l  reason: collision with root package name */
    private long f19835l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f19836m;

    public m(o3.l lVar, o3.p pVar, n1 n1Var, int i10, Object obj, g gVar) {
        super(lVar, pVar, 2, n1Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f19833j = gVar;
    }

    @Override // o3.h0.e
    public void b() {
        if (this.f19835l == 0) {
            this.f19833j.c(this.f19834k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            o3.p e10 = this.f19793b.e(this.f19835l);
            o0 o0Var = this.f19800i;
            x1.f fVar = new x1.f(o0Var, e10.f14518g, o0Var.m(e10));
            while (!this.f19836m && this.f19833j.b(fVar)) {
            }
            this.f19835l = fVar.p() - this.f19793b.f14518g;
        } finally {
            o3.o.a(this.f19800i);
        }
    }

    @Override // o3.h0.e
    public void c() {
        this.f19836m = true;
    }

    public void g(g.b bVar) {
        this.f19834k = bVar;
    }
}
