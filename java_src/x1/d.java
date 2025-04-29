package x1;

import java.util.Arrays;
import p3.n0;
import x1.b0;
/* loaded from: classes.dex */
public final class d implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f20110a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f20111b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f20112c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f20113d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f20114e;

    /* renamed from: f  reason: collision with root package name */
    private final long f20115f;

    public d(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f20111b = iArr;
        this.f20112c = jArr;
        this.f20113d = jArr2;
        this.f20114e = jArr3;
        int length = iArr.length;
        this.f20110a = length;
        if (length > 0) {
            this.f20115f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f20115f = 0L;
        }
    }

    public int a(long j10) {
        return n0.i(this.f20114e, j10, true, true);
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        int a10 = a(j10);
        c0 c0Var = new c0(this.f20114e[a10], this.f20112c[a10]);
        if (c0Var.f20108a >= j10 || a10 == this.f20110a - 1) {
            return new b0.a(c0Var);
        }
        int i10 = a10 + 1;
        return new b0.a(c0Var, new c0(this.f20114e[i10], this.f20112c[i10]));
    }

    @Override // x1.b0
    public long h() {
        return this.f20115f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f20110a + ", sizes=" + Arrays.toString(this.f20111b) + ", offsets=" + Arrays.toString(this.f20112c) + ", timeUs=" + Arrays.toString(this.f20114e) + ", durationsUs=" + Arrays.toString(this.f20113d) + ")";
    }
}
