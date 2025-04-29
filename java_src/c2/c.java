package c2;

import x1.m;
import x1.w;
/* loaded from: classes.dex */
final class c extends w {

    /* renamed from: b  reason: collision with root package name */
    private final long f3184b;

    public c(m mVar, long j10) {
        super(mVar);
        p3.a.a(mVar.p() >= j10);
        this.f3184b = j10;
    }

    @Override // x1.w, x1.m
    public long a() {
        return super.a() - this.f3184b;
    }

    @Override // x1.w, x1.m
    public long l() {
        return super.l() - this.f3184b;
    }

    @Override // x1.w, x1.m
    public long p() {
        return super.p() - this.f3184b;
    }
}
