package h2;

import h2.i0;
import java.util.Collections;
import java.util.List;
import s1.n1;
/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final List<i0.a> f9259a;

    /* renamed from: b  reason: collision with root package name */
    private final x1.e0[] f9260b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9261c;

    /* renamed from: d  reason: collision with root package name */
    private int f9262d;

    /* renamed from: e  reason: collision with root package name */
    private int f9263e;

    /* renamed from: f  reason: collision with root package name */
    private long f9264f = -9223372036854775807L;

    public l(List<i0.a> list) {
        this.f9259a = list;
        this.f9260b = new x1.e0[list.size()];
    }

    private boolean f(p3.a0 a0Var, int i10) {
        if (a0Var.a() == 0) {
            return false;
        }
        if (a0Var.G() != i10) {
            this.f9261c = false;
        }
        this.f9262d--;
        return this.f9261c;
    }

    @Override // h2.m
    public void a(p3.a0 a0Var) {
        x1.e0[] e0VarArr;
        if (this.f9261c) {
            if (this.f9262d != 2 || f(a0Var, 32)) {
                if (this.f9262d != 1 || f(a0Var, 0)) {
                    int f10 = a0Var.f();
                    int a10 = a0Var.a();
                    for (x1.e0 e0Var : this.f9260b) {
                        a0Var.T(f10);
                        e0Var.d(a0Var, a10);
                    }
                    this.f9263e += a10;
                }
            }
        }
    }

    @Override // h2.m
    public void b() {
        this.f9261c = false;
        this.f9264f = -9223372036854775807L;
    }

    @Override // h2.m
    public void c(x1.n nVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f9260b.length; i10++) {
            i0.a aVar = this.f9259a.get(i10);
            dVar.a();
            x1.e0 d10 = nVar.d(dVar.c(), 3);
            d10.e(new n1.b().U(dVar.b()).g0("application/dvbsubs").V(Collections.singletonList(aVar.f9234c)).X(aVar.f9232a).G());
            this.f9260b[i10] = d10;
        }
    }

    @Override // h2.m
    public void d() {
        if (this.f9261c) {
            if (this.f9264f != -9223372036854775807L) {
                for (x1.e0 e0Var : this.f9260b) {
                    e0Var.c(this.f9264f, 1, this.f9263e, 0, null);
                }
            }
            this.f9261c = false;
        }
    }

    @Override // h2.m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f9261c = true;
        if (j10 != -9223372036854775807L) {
            this.f9264f = j10;
        }
        this.f9263e = 0;
        this.f9262d = 2;
    }
}
