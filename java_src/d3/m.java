package d3;

import java.util.List;
/* loaded from: classes.dex */
public abstract class m extends v1.h implements h {

    /* renamed from: m  reason: collision with root package name */
    private h f7724m;

    /* renamed from: n  reason: collision with root package name */
    private long f7725n;

    @Override // d3.h
    public int b(long j10) {
        return ((h) p3.a.e(this.f7724m)).b(j10 - this.f7725n);
    }

    @Override // d3.h
    public long g(int i10) {
        return ((h) p3.a.e(this.f7724m)).g(i10) + this.f7725n;
    }

    @Override // d3.h
    public List<b> h(long j10) {
        return ((h) p3.a.e(this.f7724m)).h(j10 - this.f7725n);
    }

    @Override // d3.h
    public int i() {
        return ((h) p3.a.e(this.f7724m)).i();
    }

    @Override // v1.a
    public void l() {
        super.l();
        this.f7724m = null;
    }

    public void x(long j10, h hVar, long j11) {
        this.f19372k = j10;
        this.f7724m = hVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f7725n = j10;
    }
}
