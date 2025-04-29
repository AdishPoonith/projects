package d2;

import x1.m;
/* loaded from: classes.dex */
final class g {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f7666d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f7667a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private int f7668b;

    /* renamed from: c  reason: collision with root package name */
    private int f7669c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f7666d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int c(int i10) {
        int i11;
        int i12 = 0;
        do {
            long[] jArr = f7666d;
            if (i12 >= jArr.length) {
                return -1;
            }
            i11 = ((jArr[i12] & i10) > 0L ? 1 : ((jArr[i12] & i10) == 0L ? 0 : -1));
            i12++;
        } while (i11 == 0);
        return i12;
    }

    public int b() {
        return this.f7669c;
    }

    public long d(m mVar, boolean z10, boolean z11, int i10) {
        if (this.f7668b == 0) {
            if (!mVar.c(this.f7667a, 0, 1, z10)) {
                return -1L;
            }
            int c10 = c(this.f7667a[0] & 255);
            this.f7669c = c10;
            if (c10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f7668b = 1;
        }
        int i11 = this.f7669c;
        if (i11 > i10) {
            this.f7668b = 0;
            return -2L;
        }
        if (i11 != 1) {
            mVar.readFully(this.f7667a, 1, i11 - 1);
        }
        this.f7668b = 0;
        return a(this.f7667a, this.f7669c, z11);
    }

    public void e() {
        this.f7668b = 0;
        this.f7669c = 0;
    }
}
