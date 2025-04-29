package h2;

import h2.i0;
import p3.n0;
import s1.n1;
/* loaded from: classes.dex */
public final class v implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private n1 f9433a;

    /* renamed from: b  reason: collision with root package name */
    private p3.j0 f9434b;

    /* renamed from: c  reason: collision with root package name */
    private x1.e0 f9435c;

    public v(String str) {
        this.f9433a = new n1.b().g0(str).G();
    }

    private void b() {
        p3.a.h(this.f9434b);
        n0.j(this.f9435c);
    }

    @Override // h2.b0
    public void a(p3.a0 a0Var) {
        b();
        long d10 = this.f9434b.d();
        long e10 = this.f9434b.e();
        if (d10 == -9223372036854775807L || e10 == -9223372036854775807L) {
            return;
        }
        n1 n1Var = this.f9433a;
        if (e10 != n1Var.f17423y) {
            n1 G = n1Var.b().k0(e10).G();
            this.f9433a = G;
            this.f9435c.e(G);
        }
        int a10 = a0Var.a();
        this.f9435c.d(a0Var, a10);
        this.f9435c.c(d10, 1, a10, 0, null);
    }

    @Override // h2.b0
    public void c(p3.j0 j0Var, x1.n nVar, i0.d dVar) {
        this.f9434b = j0Var;
        dVar.a();
        x1.e0 d10 = nVar.d(dVar.c(), 5);
        this.f9435c = d10;
        d10.e(this.f9433a);
    }
}
