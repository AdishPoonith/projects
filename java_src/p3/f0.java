package p3;

import s1.b3;
/* loaded from: classes.dex */
public final class f0 implements t {

    /* renamed from: j  reason: collision with root package name */
    private final d f15359j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15360k;

    /* renamed from: l  reason: collision with root package name */
    private long f15361l;

    /* renamed from: m  reason: collision with root package name */
    private long f15362m;

    /* renamed from: n  reason: collision with root package name */
    private b3 f15363n = b3.f17104m;

    public f0(d dVar) {
        this.f15359j = dVar;
    }

    public void a(long j10) {
        this.f15361l = j10;
        if (this.f15360k) {
            this.f15362m = this.f15359j.a();
        }
    }

    public void b() {
        if (this.f15360k) {
            return;
        }
        this.f15362m = this.f15359j.a();
        this.f15360k = true;
    }

    @Override // p3.t
    public void c(b3 b3Var) {
        if (this.f15360k) {
            a(x());
        }
        this.f15363n = b3Var;
    }

    public void d() {
        if (this.f15360k) {
            a(x());
            this.f15360k = false;
        }
    }

    @Override // p3.t
    public b3 g() {
        return this.f15363n;
    }

    @Override // p3.t
    public long x() {
        long j10 = this.f15361l;
        if (this.f15360k) {
            long a10 = this.f15359j.a() - this.f15362m;
            b3 b3Var = this.f15363n;
            return j10 + (b3Var.f17108j == 1.0f ? n0.B0(a10) : b3Var.b(a10));
        }
        return j10;
    }
}
