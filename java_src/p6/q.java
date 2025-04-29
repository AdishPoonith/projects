package p6;

import i9.y0;
/* loaded from: classes.dex */
public class q implements g0 {

    /* renamed from: d  reason: collision with root package name */
    private static final y0.g<String> f15654d;

    /* renamed from: e  reason: collision with root package name */
    private static final y0.g<String> f15655e;

    /* renamed from: f  reason: collision with root package name */
    private static final y0.g<String> f15656f;

    /* renamed from: a  reason: collision with root package name */
    private final s6.b<r6.j> f15657a;

    /* renamed from: b  reason: collision with root package name */
    private final s6.b<v6.i> f15658b;

    /* renamed from: c  reason: collision with root package name */
    private final w5.n f15659c;

    static {
        y0.d<String> dVar = i9.y0.f10075e;
        f15654d = y0.g.e("x-firebase-client-log-type", dVar);
        f15655e = y0.g.e("x-firebase-client", dVar);
        f15656f = y0.g.e("x-firebase-gmpid", dVar);
    }

    public q(s6.b<v6.i> bVar, s6.b<r6.j> bVar2, w5.n nVar) {
        this.f15658b = bVar;
        this.f15657a = bVar2;
        this.f15659c = nVar;
    }

    private void b(i9.y0 y0Var) {
        w5.n nVar = this.f15659c;
        if (nVar == null) {
            return;
        }
        String c10 = nVar.c();
        if (c10.length() != 0) {
            y0Var.p(f15656f, c10);
        }
    }

    @Override // p6.g0
    public void a(i9.y0 y0Var) {
        if (this.f15657a.get() == null || this.f15658b.get() == null) {
            return;
        }
        int b10 = this.f15657a.get().b("fire-fst").b();
        if (b10 != 0) {
            y0Var.p(f15654d, Integer.toString(b10));
        }
        y0Var.p(f15655e, this.f15658b.get().a());
        b(y0Var);
    }
}
