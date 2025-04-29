package w2;

import o3.o0;
import s1.n1;
import w2.g;
/* loaded from: classes.dex */
public class k extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f19825o;

    /* renamed from: p  reason: collision with root package name */
    private final long f19826p;

    /* renamed from: q  reason: collision with root package name */
    private final g f19827q;

    /* renamed from: r  reason: collision with root package name */
    private long f19828r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f19829s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f19830t;

    public k(o3.l lVar, o3.p pVar, n1 n1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(lVar, pVar, n1Var, i10, obj, j10, j11, j12, j13, j14);
        this.f19825o = i11;
        this.f19826p = j15;
        this.f19827q = gVar;
    }

    @Override // o3.h0.e
    public final void b() {
        if (this.f19828r == 0) {
            c j10 = j();
            j10.b(this.f19826p);
            g gVar = this.f19827q;
            g.b l10 = l(j10);
            long j11 = this.f19764k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f19826p;
            long j13 = this.f19765l;
            gVar.c(l10, j12, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - this.f19826p);
        }
        try {
            o3.p e10 = this.f19793b.e(this.f19828r);
            o0 o0Var = this.f19800i;
            x1.f fVar = new x1.f(o0Var, e10.f14518g, o0Var.m(e10));
            while (!this.f19829s && this.f19827q.b(fVar)) {
            }
            this.f19828r = fVar.p() - this.f19793b.f14518g;
            o3.o.a(this.f19800i);
            this.f19830t = !this.f19829s;
        } catch (Throwable th) {
            o3.o.a(this.f19800i);
            throw th;
        }
    }

    @Override // o3.h0.e
    public final void c() {
        this.f19829s = true;
    }

    @Override // w2.n
    public long g() {
        return this.f19837j + this.f19825o;
    }

    @Override // w2.n
    public boolean h() {
        return this.f19830t;
    }

    protected g.b l(c cVar) {
        return cVar;
    }
}
