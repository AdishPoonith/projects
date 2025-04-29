package j3;

import d3.h;
import java.util.Collections;
import java.util.List;
import p3.n0;
/* loaded from: classes.dex */
final class b implements h {

    /* renamed from: j  reason: collision with root package name */
    private final d3.b[] f12105j;

    /* renamed from: k  reason: collision with root package name */
    private final long[] f12106k;

    public b(d3.b[] bVarArr, long[] jArr) {
        this.f12105j = bVarArr;
        this.f12106k = jArr;
    }

    @Override // d3.h
    public int b(long j10) {
        int e10 = n0.e(this.f12106k, j10, false, false);
        if (e10 < this.f12106k.length) {
            return e10;
        }
        return -1;
    }

    @Override // d3.h
    public long g(int i10) {
        p3.a.a(i10 >= 0);
        p3.a.a(i10 < this.f12106k.length);
        return this.f12106k[i10];
    }

    @Override // d3.h
    public List<d3.b> h(long j10) {
        int i10 = n0.i(this.f12106k, j10, true, false);
        if (i10 != -1) {
            d3.b[] bVarArr = this.f12105j;
            if (bVarArr[i10] != d3.b.A) {
                return Collections.singletonList(bVarArr[i10]);
            }
        }
        return Collections.emptyList();
    }

    @Override // d3.h
    public int i() {
        return this.f12106k.length;
    }
}
