package w2;

import s1.n1;
import x1.e0;
/* loaded from: classes.dex */
public final class p extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f19839o;

    /* renamed from: p  reason: collision with root package name */
    private final n1 f19840p;

    /* renamed from: q  reason: collision with root package name */
    private long f19841q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f19842r;

    public p(o3.l lVar, o3.p pVar, n1 n1Var, int i10, Object obj, long j10, long j11, long j12, int i11, n1 n1Var2) {
        super(lVar, pVar, n1Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f19839o = i11;
        this.f19840p = n1Var2;
    }

    @Override // o3.h0.e
    public void b() {
        c j10 = j();
        j10.b(0L);
        e0 d10 = j10.d(0, this.f19839o);
        d10.e(this.f19840p);
        try {
            long m10 = this.f19800i.m(this.f19793b.e(this.f19841q));
            if (m10 != -1) {
                m10 += this.f19841q;
            }
            x1.f fVar = new x1.f(this.f19800i, this.f19841q, m10);
            for (int i10 = 0; i10 != -1; i10 = d10.f(fVar, Integer.MAX_VALUE, true)) {
                this.f19841q += i10;
            }
            d10.c(this.f19798g, 1, (int) this.f19841q, 0, null);
            o3.o.a(this.f19800i);
            this.f19842r = true;
        } catch (Throwable th) {
            o3.o.a(this.f19800i);
            throw th;
        }
    }

    @Override // o3.h0.e
    public void c() {
    }

    @Override // w2.n
    public boolean h() {
        return this.f19842r;
    }
}
