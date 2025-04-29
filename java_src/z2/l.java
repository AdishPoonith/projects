package z2;

import s1.o1;
import u2.n0;
/* loaded from: classes.dex */
final class l implements n0 {

    /* renamed from: j  reason: collision with root package name */
    private final int f20800j;

    /* renamed from: k  reason: collision with root package name */
    private final p f20801k;

    /* renamed from: l  reason: collision with root package name */
    private int f20802l = -1;

    public l(p pVar, int i10) {
        this.f20801k = pVar;
        this.f20800j = i10;
    }

    private boolean c() {
        int i10 = this.f20802l;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void a() {
        p3.a.a(this.f20802l == -1);
        this.f20802l = this.f20801k.y(this.f20800j);
    }

    @Override // u2.n0
    public void b() {
        int i10 = this.f20802l;
        if (i10 == -2) {
            throw new r(this.f20801k.p().b(this.f20800j).b(0).f17419u);
        }
        if (i10 == -1) {
            this.f20801k.U();
        } else if (i10 != -3) {
            this.f20801k.V(i10);
        }
    }

    @Override // u2.n0
    public boolean d() {
        return this.f20802l == -3 || (c() && this.f20801k.Q(this.f20802l));
    }

    public void e() {
        if (this.f20802l != -1) {
            this.f20801k.p0(this.f20800j);
            this.f20802l = -1;
        }
    }

    @Override // u2.n0
    public int k(o1 o1Var, v1.g gVar, int i10) {
        if (this.f20802l == -3) {
            gVar.k(4);
            return -4;
        } else if (c()) {
            return this.f20801k.e0(this.f20802l, o1Var, gVar, i10);
        } else {
            return -3;
        }
    }

    @Override // u2.n0
    public int t(long j10) {
        if (c()) {
            return this.f20801k.o0(this.f20802l, j10);
        }
        return 0;
    }
}
