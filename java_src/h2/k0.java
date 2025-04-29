package h2;

import h2.i0;
import java.util.List;
import s1.n1;
/* loaded from: classes.dex */
final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<n1> f9257a;

    /* renamed from: b  reason: collision with root package name */
    private final x1.e0[] f9258b;

    public k0(List<n1> list) {
        this.f9257a = list;
        this.f9258b = new x1.e0[list.size()];
    }

    public void a(long j10, p3.a0 a0Var) {
        if (a0Var.a() < 9) {
            return;
        }
        int p10 = a0Var.p();
        int p11 = a0Var.p();
        int G = a0Var.G();
        if (p10 == 434 && p11 == 1195456820 && G == 3) {
            x1.c.b(j10, a0Var, this.f9258b);
        }
    }

    public void b(x1.n nVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f9258b.length; i10++) {
            dVar.a();
            x1.e0 d10 = nVar.d(dVar.c(), 3);
            n1 n1Var = this.f9257a.get(i10);
            String str = n1Var.f17419u;
            boolean z10 = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            p3.a.b(z10, "Invalid closed caption mime type provided: " + str);
            d10.e(new n1.b().U(dVar.b()).g0(str).i0(n1Var.f17411m).X(n1Var.f17410l).H(n1Var.M).V(n1Var.f17421w).G());
            this.f9258b[i10] = d10;
        }
    }
}
