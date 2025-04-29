package e2;

import p3.n0;
import p3.s;
import x1.b0;
import x1.c0;
/* loaded from: classes.dex */
final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f7987a;

    /* renamed from: b  reason: collision with root package name */
    private final s f7988b;

    /* renamed from: c  reason: collision with root package name */
    private final s f7989c;

    /* renamed from: d  reason: collision with root package name */
    private long f7990d;

    public b(long j10, long j11, long j12) {
        this.f7990d = j10;
        this.f7987a = j12;
        s sVar = new s();
        this.f7988b = sVar;
        s sVar2 = new s();
        this.f7989c = sVar2;
        sVar.a(0L);
        sVar2.a(j11);
    }

    public boolean a(long j10) {
        s sVar = this.f7988b;
        return j10 - sVar.b(sVar.c() - 1) < 100000;
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f7988b.a(j10);
        this.f7989c.a(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j10) {
        this.f7990d = j10;
    }

    @Override // e2.g
    public long d(long j10) {
        return this.f7988b.b(n0.g(this.f7989c, j10, true, true));
    }

    @Override // e2.g
    public long e() {
        return this.f7987a;
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        int g10 = n0.g(this.f7988b, j10, true, true);
        c0 c0Var = new c0(this.f7988b.b(g10), this.f7989c.b(g10));
        if (c0Var.f20108a == j10 || g10 == this.f7988b.c() - 1) {
            return new b0.a(c0Var);
        }
        int i10 = g10 + 1;
        return new b0.a(c0Var, new c0(this.f7988b.b(i10), this.f7989c.b(i10)));
    }

    @Override // x1.b0
    public long h() {
        return this.f7990d;
    }
}
