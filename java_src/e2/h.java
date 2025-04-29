package e2;

import p3.a0;
import p3.n0;
import p3.r;
import u1.h0;
import x1.b0;
import x1.c0;
/* loaded from: classes.dex */
final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f8018a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f8019b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8020c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8021d;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f8018a = jArr;
        this.f8019b = jArr2;
        this.f8020c = j10;
        this.f8021d = j11;
    }

    public static h a(long j10, long j11, h0.a aVar, a0 a0Var) {
        int G;
        a0Var.U(10);
        int p10 = a0Var.p();
        if (p10 <= 0) {
            return null;
        }
        int i10 = aVar.f18611d;
        long N0 = n0.N0(p10, 1000000 * (i10 >= 32000 ? 1152 : 576), i10);
        int M = a0Var.M();
        int M2 = a0Var.M();
        int M3 = a0Var.M();
        a0Var.U(2);
        long j12 = j11 + aVar.f18610c;
        long[] jArr = new long[M];
        long[] jArr2 = new long[M];
        int i11 = 0;
        long j13 = j11;
        while (i11 < M) {
            int i12 = M2;
            long j14 = j12;
            jArr[i11] = (i11 * N0) / M;
            jArr2[i11] = Math.max(j13, j14);
            if (M3 == 1) {
                G = a0Var.G();
            } else if (M3 == 2) {
                G = a0Var.M();
            } else if (M3 == 3) {
                G = a0Var.J();
            } else if (M3 != 4) {
                return null;
            } else {
                G = a0Var.K();
            }
            j13 += G * i12;
            i11++;
            jArr = jArr;
            M2 = i12;
            j12 = j14;
        }
        long[] jArr3 = jArr;
        if (j10 != -1 && j10 != j13) {
            r.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new h(jArr3, jArr2, N0, j13);
    }

    @Override // e2.g
    public long d(long j10) {
        return this.f8018a[n0.i(this.f8019b, j10, true, true)];
    }

    @Override // e2.g
    public long e() {
        return this.f8021d;
    }

    @Override // x1.b0
    public boolean f() {
        return true;
    }

    @Override // x1.b0
    public b0.a g(long j10) {
        int i10 = n0.i(this.f8018a, j10, true, true);
        c0 c0Var = new c0(this.f8018a[i10], this.f8019b[i10]);
        if (c0Var.f20108a >= j10 || i10 == this.f8018a.length - 1) {
            return new b0.a(c0Var);
        }
        int i11 = i10 + 1;
        return new b0.a(c0Var, new c0(this.f8018a[i11], this.f8019b[i11]));
    }

    @Override // x1.b0
    public long h() {
        return this.f8020c;
    }
}
