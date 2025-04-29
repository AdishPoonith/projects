package x1;

import p3.n0;
import x1.b0;
import x1.v;
/* loaded from: classes.dex */
public final class u implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final v f20194a;

    /* renamed from: b  reason: collision with root package name */
    private final long f20195b;

    public u(v vVar, long j10) {
        this.f20194a = vVar;
        this.f20195b = j10;
    }

    private c0 a(long j10, long j11) {
        return new c0((j10 * 1000000) / this.f20194a.f20200e, this.f20195b + j11);
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        p3.a.h(this.f20194a.f20206k);
        v vVar = this.f20194a;
        v.a aVar = vVar.f20206k;
        long[] jArr = aVar.f20208a;
        long[] jArr2 = aVar.f20209b;
        int i10 = n0.i(jArr, vVar.i(j10), true, false);
        c0 a10 = a(i10 == -1 ? 0L : jArr[i10], i10 != -1 ? jArr2[i10] : 0L);
        if (a10.f20108a == j10 || i10 == jArr.length - 1) {
            return new b0.a(a10);
        }
        int i11 = i10 + 1;
        return new b0.a(a10, a(jArr[i11], jArr2[i11]));
    }

    @Override // x1.b0
    public long h() {
        return this.f20194a.f();
    }
}
