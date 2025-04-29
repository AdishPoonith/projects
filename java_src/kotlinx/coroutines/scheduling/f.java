package kotlinx.coroutines.scheduling;

import la.m1;
/* loaded from: classes.dex */
public class f extends m1 {

    /* renamed from: m  reason: collision with root package name */
    private final int f12958m;

    /* renamed from: n  reason: collision with root package name */
    private final int f12959n;

    /* renamed from: o  reason: collision with root package name */
    private final long f12960o;

    /* renamed from: p  reason: collision with root package name */
    private final String f12961p;

    /* renamed from: q  reason: collision with root package name */
    private a f12962q = k0();

    public f(int i10, int i11, long j10, String str) {
        this.f12958m = i10;
        this.f12959n = i11;
        this.f12960o = j10;
        this.f12961p = str;
    }

    private final a k0() {
        return new a(this.f12958m, this.f12959n, this.f12960o, this.f12961p);
    }

    @Override // la.g0
    public void h0(v9.g gVar, Runnable runnable) {
        a.k(this.f12962q, runnable, null, false, 6, null);
    }

    public final void l0(Runnable runnable, i iVar, boolean z10) {
        this.f12962q.i(runnable, iVar, z10);
    }
}
