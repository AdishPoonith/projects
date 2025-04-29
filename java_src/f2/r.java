package f2;

import p3.n0;
/* loaded from: classes.dex */
final class r {

    /* renamed from: a  reason: collision with root package name */
    public final o f8771a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8772b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f8773c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f8774d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8775e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f8776f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f8777g;

    /* renamed from: h  reason: collision with root package name */
    public final long f8778h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        p3.a.a(iArr.length == jArr2.length);
        p3.a.a(jArr.length == jArr2.length);
        p3.a.a(iArr2.length == jArr2.length);
        this.f8771a = oVar;
        this.f8773c = jArr;
        this.f8774d = iArr;
        this.f8775e = i10;
        this.f8776f = jArr2;
        this.f8777g = iArr2;
        this.f8778h = j10;
        this.f8772b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = n0.i(this.f8776f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f8777g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = n0.e(this.f8776f, j10, true, false); e10 < this.f8776f.length; e10++) {
            if ((this.f8777g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
