package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.q4  reason: invalid package */
/* loaded from: classes.dex */
public final class q4 extends s4 {

    /* renamed from: f  reason: collision with root package name */
    private final InputStream f5235f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f5236g;

    /* renamed from: h  reason: collision with root package name */
    private int f5237h;

    /* renamed from: i  reason: collision with root package name */
    private int f5238i;

    /* renamed from: j  reason: collision with root package name */
    private int f5239j;

    /* renamed from: k  reason: collision with root package name */
    private int f5240k;

    /* renamed from: l  reason: collision with root package name */
    private int f5241l;

    /* renamed from: m  reason: collision with root package name */
    private int f5242m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q4(InputStream inputStream, int i10, p4 p4Var) {
        super(null);
        this.f5242m = Integer.MAX_VALUE;
        byte[] bArr = x5.f5628d;
        this.f5235f = inputStream;
        this.f5236g = new byte[4096];
        this.f5237h = 0;
        this.f5239j = 0;
        this.f5241l = 0;
    }

    private final List C(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.f5235f.read(bArr, i11, min - i11);
                if (read == -1) {
                    throw z5.j();
                }
                this.f5241l += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void D() {
        int i10 = this.f5237h + this.f5238i;
        this.f5237h = i10;
        int i11 = this.f5241l + i10;
        int i12 = this.f5242m;
        if (i11 <= i12) {
            this.f5238i = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f5238i = i13;
        this.f5237h = i10 - i13;
    }

    private final void E(int i10) {
        if (F(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f5241l) - this.f5239j) {
            throw z5.j();
        }
        throw z5.i();
    }

    private final boolean F(int i10) {
        int i11 = this.f5239j;
        int i12 = i11 + i10;
        int i13 = this.f5237h;
        if (i12 <= i13) {
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }
        int i14 = this.f5241l;
        if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.f5242m) {
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f5236g;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                i14 = this.f5241l + i11;
                this.f5241l = i14;
                i13 = this.f5237h - i11;
                this.f5237h = i13;
                this.f5239j = 0;
            }
            try {
                int read = this.f5235f.read(this.f5236g, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.f5235f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.f5237h += read;
                    D();
                    if (this.f5237h >= i10) {
                        return true;
                    }
                    return F(i10);
                } else {
                    return false;
                }
            } catch (z5 e10) {
                e10.k();
                throw e10;
            }
        }
        return false;
    }

    private final byte[] G(int i10, boolean z10) {
        byte[] H = H(i10);
        if (H != null) {
            return H;
        }
        int i11 = this.f5239j;
        int i12 = this.f5237h;
        int i13 = i12 - i11;
        this.f5241l += i12;
        this.f5239j = 0;
        this.f5237h = 0;
        List<byte[]> C = C(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f5236g, i11, bArr, 0, i13);
        for (byte[] bArr2 : C) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] H(int i10) {
        if (i10 == 0) {
            return x5.f5628d;
        }
        if (i10 >= 0) {
            int i11 = this.f5241l;
            int i12 = this.f5239j;
            int i13 = i11 + i12 + i10;
            if ((-2147483647) + i13 <= 0) {
                int i14 = this.f5242m;
                if (i13 > i14) {
                    B((i14 - i11) - i12);
                    throw z5.j();
                }
                int i15 = this.f5237h - i12;
                int i16 = i10 - i15;
                if (i16 >= 4096) {
                    try {
                        if (i16 > this.f5235f.available()) {
                            return null;
                        }
                    } catch (z5 e10) {
                        e10.k();
                        throw e10;
                    }
                }
                byte[] bArr = new byte[i10];
                System.arraycopy(this.f5236g, this.f5239j, bArr, 0, i15);
                this.f5241l += this.f5237h;
                this.f5239j = 0;
                this.f5237h = 0;
                while (i15 < i10) {
                    try {
                        int read = this.f5235f.read(bArr, i15, i10 - i15);
                        if (read == -1) {
                            throw z5.j();
                        }
                        this.f5241l += read;
                        i15 += read;
                    } catch (z5 e11) {
                        e11.k();
                        throw e11;
                    }
                }
                return bArr;
            }
            throw z5.i();
        }
        throw z5.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final void A(int i10) {
        if (this.f5240k != i10) {
            throw z5.b();
        }
    }

    public final void B(int i10) {
        int i11 = this.f5237h;
        int i12 = this.f5239j;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f5239j = i12 + i10;
        } else if (i10 < 0) {
            throw z5.f();
        } else {
            int i14 = this.f5241l;
            int i15 = i14 + i12;
            int i16 = this.f5242m;
            if (i15 + i10 > i16) {
                B((i16 - i14) - i12);
                throw z5.j();
            }
            this.f5241l = i15;
            this.f5237h = 0;
            this.f5239j = 0;
            while (i13 < i10) {
                try {
                    long j10 = i10 - i13;
                    try {
                        long skip = this.f5235f.skip(j10);
                        int i17 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                        if (i17 < 0 || skip > j10) {
                            throw new IllegalStateException(String.valueOf(this.f5235f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i17 == 0) {
                            break;
                        } else {
                            i13 += (int) skip;
                        }
                    } catch (z5 e10) {
                        e10.k();
                        throw e10;
                    }
                } finally {
                    this.f5241l += i13;
                    D();
                }
            }
            if (i13 >= i10) {
                return;
            }
            int i18 = this.f5237h;
            int i19 = i18 - this.f5239j;
            this.f5239j = i18;
            while (true) {
                E(1);
                int i20 = i10 - i19;
                int i21 = this.f5237h;
                if (i20 <= i21) {
                    this.f5239j = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f5239j = i21;
                }
            }
        }
    }

    public final byte I() {
        if (this.f5239j == this.f5237h) {
            E(1);
        }
        byte[] bArr = this.f5236g;
        int i10 = this.f5239j;
        this.f5239j = i10 + 1;
        return bArr[i10];
    }

    public final int J() {
        int i10 = this.f5239j;
        if (this.f5237h - i10 < 4) {
            E(4);
            i10 = this.f5239j;
        }
        byte[] bArr = this.f5236g;
        this.f5239j = i10 + 4;
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int K() {
        /*
            r5 = this;
            int r0 = r5.f5239j
            int r1 = r5.f5237h
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.f5236g
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f5239j = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.f5239j = r1
            return r0
        L6d:
            long r0 = r5.N()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.q4.K():int");
    }

    public final long L() {
        int i10 = this.f5239j;
        if (this.f5237h - i10 < 8) {
            E(8);
            i10 = this.f5239j;
        }
        byte[] bArr = this.f5236g;
        this.f5239j = i10 + 8;
        long j10 = bArr[i10 + 2];
        long j11 = bArr[i10 + 3];
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long M() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.f5239j;
        int i12 = this.f5237h;
        if (i12 != i11) {
            byte[] bArr = this.f5236g;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f5239j = i13;
                return b10;
            } else if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        j10 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = i18 ^ (bArr[i14] << 28);
                            if (j14 < 0) {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (bArr[i16] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (bArr[i19] << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (bArr[i16] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j15 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j11 = j10;
                                                    i14 = i19;
                                                    this.f5239j = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.f5239j = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.f5239j = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.f5239j = i14;
                return j11;
            }
        }
        return N();
    }

    final long N() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte I = I();
            j10 |= (I & Byte.MAX_VALUE) << i10;
            if ((I & 128) == 0) {
                return j10;
            }
        }
        throw z5.e();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final void a(int i10) {
        this.f5242m = i10;
        D();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final boolean b() {
        return this.f5239j == this.f5237h && !F(1);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final boolean c() {
        return M() != 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final boolean d(int i10) {
        int q10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f5237h - this.f5239j < 10) {
                while (i12 < 10) {
                    if (I() < 0) {
                        i12++;
                    }
                }
                throw z5.e();
            }
            while (i12 < 10) {
                byte[] bArr = this.f5236g;
                int i13 = this.f5239j;
                this.f5239j = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw z5.e();
            return true;
        } else if (i11 == 1) {
            B(8);
            return true;
        } else if (i11 == 2) {
            B(K());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    B(4);
                    return true;
                }
                throw z5.a();
            }
            return false;
        } else {
            do {
                q10 = q();
                if (q10 == 0) {
                    break;
                }
            } while (d(q10));
            A(((i10 >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final double h() {
        return Double.longBitsToDouble(L());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final float i() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int j() {
        return this.f5241l + this.f5239j;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int k(int i10) {
        if (i10 >= 0) {
            int i11 = this.f5241l + this.f5239j;
            int i12 = this.f5242m;
            int i13 = i10 + i11;
            if (i13 <= i12) {
                this.f5242m = i13;
                D();
                return i12;
            }
            throw z5.j();
        }
        throw z5.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int l() {
        return K();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int m() {
        return J();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int n() {
        return K();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int o() {
        return J();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int p() {
        return s4.e(K());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int q() {
        if (b()) {
            this.f5240k = 0;
            return 0;
        }
        int K = K();
        this.f5240k = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw z5.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int r() {
        return K();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long s() {
        return L();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long t() {
        return M();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long u() {
        return L();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long v() {
        return s4.f(M());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long w() {
        return M();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final m4 x() {
        int K = K();
        int i10 = this.f5237h;
        int i11 = this.f5239j;
        if (K <= i10 - i11 && K > 0) {
            m4 w10 = m4.w(this.f5236g, i11, K);
            this.f5239j += K;
            return w10;
        } else if (K != 0) {
            byte[] H = H(K);
            if (H != null) {
                return m4.w(H, 0, H.length);
            }
            int i12 = this.f5239j;
            int i13 = this.f5237h;
            int i14 = i13 - i12;
            this.f5241l += i13;
            this.f5239j = 0;
            this.f5237h = 0;
            List<byte[]> C = C(K - i14);
            byte[] bArr = new byte[K];
            System.arraycopy(this.f5236g, i12, bArr, 0, i14);
            for (byte[] bArr2 : C) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i14, length);
                i14 += length;
            }
            return new j4(bArr);
        } else {
            return m4.f4993k;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final String y() {
        int K = K();
        if (K > 0) {
            int i10 = this.f5237h;
            int i11 = this.f5239j;
            if (K <= i10 - i11) {
                String str = new String(this.f5236g, i11, K, x5.f5626b);
                this.f5239j += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K <= this.f5237h) {
            E(K);
            String str2 = new String(this.f5236g, this.f5239j, K, x5.f5626b);
            this.f5239j += K;
            return str2;
        }
        return new String(G(K, false), x5.f5626b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final String z() {
        byte[] G;
        int K = K();
        int i10 = this.f5239j;
        int i11 = this.f5237h;
        if (K <= i11 - i10 && K > 0) {
            G = this.f5236g;
            this.f5239j = i10 + K;
        } else if (K == 0) {
            return "";
        } else {
            if (K <= i11) {
                E(K);
                G = this.f5236g;
                this.f5239j = K;
            } else {
                G = G(K, false);
            }
            i10 = 0;
        }
        return t8.d(G, i10, K);
    }
}
