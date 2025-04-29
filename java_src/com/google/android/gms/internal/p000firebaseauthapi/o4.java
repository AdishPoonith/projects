package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.o4  reason: invalid package */
/* loaded from: classes.dex */
public final class o4 extends s4 {

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f5108f;

    /* renamed from: g  reason: collision with root package name */
    private int f5109g;

    /* renamed from: h  reason: collision with root package name */
    private int f5110h;

    /* renamed from: i  reason: collision with root package name */
    private int f5111i;

    /* renamed from: j  reason: collision with root package name */
    private int f5112j;

    /* renamed from: k  reason: collision with root package name */
    private int f5113k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ o4(byte[] bArr, int i10, int i11, boolean z10, n4 n4Var) {
        super(null);
        this.f5113k = Integer.MAX_VALUE;
        this.f5108f = bArr;
        this.f5109g = i11;
        this.f5111i = 0;
    }

    private final void C() {
        int i10 = this.f5109g + this.f5110h;
        this.f5109g = i10;
        int i11 = this.f5113k;
        if (i10 <= i11) {
            this.f5110h = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f5110h = i12;
        this.f5109g = i10 - i12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final void A(int i10) {
        if (this.f5112j != i10) {
            throw z5.b();
        }
    }

    public final void B(int i10) {
        if (i10 >= 0) {
            int i11 = this.f5109g;
            int i12 = this.f5111i;
            if (i10 <= i11 - i12) {
                this.f5111i = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw z5.j();
        }
        throw z5.f();
    }

    public final byte D() {
        int i10 = this.f5111i;
        if (i10 != this.f5109g) {
            byte[] bArr = this.f5108f;
            this.f5111i = i10 + 1;
            return bArr[i10];
        }
        throw z5.j();
    }

    public final int E() {
        int i10 = this.f5111i;
        if (this.f5109g - i10 >= 4) {
            byte[] bArr = this.f5108f;
            this.f5111i = i10 + 4;
            int i11 = (bArr[i10 + 1] & 255) << 8;
            return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw z5.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int F() {
        /*
            r5 = this;
            int r0 = r5.f5111i
            int r1 = r5.f5109g
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.f5108f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f5111i = r3
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
            r5.f5111i = r1
            return r0
        L6d:
            long r0 = r5.I()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.o4.F():int");
    }

    public final long G() {
        int i10 = this.f5111i;
        if (this.f5109g - i10 >= 8) {
            byte[] bArr = this.f5108f;
            this.f5111i = i10 + 8;
            long j10 = bArr[i10 + 2];
            long j11 = bArr[i10 + 3];
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw z5.j();
    }

    public final long H() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.f5111i;
        int i12 = this.f5109g;
        if (i12 != i11) {
            byte[] bArr = this.f5108f;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f5111i = i13;
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
                                                    this.f5111i = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.f5111i = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.f5111i = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.f5111i = i14;
                return j11;
            }
        }
        return I();
    }

    final long I() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte D = D();
            j10 |= (D & Byte.MAX_VALUE) << i10;
            if ((D & 128) == 0) {
                return j10;
            }
        }
        throw z5.e();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final void a(int i10) {
        this.f5113k = i10;
        C();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final boolean b() {
        return this.f5111i == this.f5109g;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final boolean c() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final boolean d(int i10) {
        int q10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f5109g - this.f5111i < 10) {
                while (i12 < 10) {
                    if (D() < 0) {
                        i12++;
                    }
                }
                throw z5.e();
            }
            while (i12 < 10) {
                byte[] bArr = this.f5108f;
                int i13 = this.f5111i;
                this.f5111i = i13 + 1;
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
            B(F());
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
        return Double.longBitsToDouble(G());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final float i() {
        return Float.intBitsToFloat(E());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int j() {
        return this.f5111i;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int k(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.f5111i;
            if (i11 >= 0) {
                int i12 = this.f5113k;
                if (i11 <= i12) {
                    this.f5113k = i11;
                    C();
                    return i12;
                }
                throw z5.j();
            }
            throw z5.g();
        }
        throw z5.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int l() {
        return F();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int m() {
        return E();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int n() {
        return F();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int o() {
        return E();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int p() {
        return s4.e(F());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int q() {
        if (b()) {
            this.f5112j = 0;
            return 0;
        }
        int F = F();
        this.f5112j = F;
        if ((F >>> 3) != 0) {
            return F;
        }
        throw z5.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final int r() {
        return F();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long s() {
        return G();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long t() {
        return H();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long u() {
        return G();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long v() {
        return s4.f(H());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final long w() {
        return H();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final m4 x() {
        int F = F();
        if (F > 0) {
            int i10 = this.f5109g;
            int i11 = this.f5111i;
            if (F <= i10 - i11) {
                m4 w10 = m4.w(this.f5108f, i11, F);
                this.f5111i += F;
                return w10;
            }
        }
        if (F != 0) {
            if (F > 0) {
                int i12 = this.f5109g;
                int i13 = this.f5111i;
                if (F <= i12 - i13) {
                    int i14 = F + i13;
                    this.f5111i = i14;
                    return new j4(Arrays.copyOfRange(this.f5108f, i13, i14));
                }
            }
            if (F <= 0) {
                throw z5.f();
            }
            throw z5.j();
        }
        return m4.f4993k;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final String y() {
        int F = F();
        if (F > 0) {
            int i10 = this.f5109g;
            int i11 = this.f5111i;
            if (F <= i10 - i11) {
                String str = new String(this.f5108f, i11, F, x5.f5626b);
                this.f5111i += F;
                return str;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F < 0) {
            throw z5.f();
        }
        throw z5.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s4
    public final String z() {
        int F = F();
        if (F > 0) {
            int i10 = this.f5109g;
            int i11 = this.f5111i;
            if (F <= i10 - i11) {
                String d10 = t8.d(this.f5108f, i11, F);
                this.f5111i += F;
                return d10;
            }
        }
        if (F == 0) {
            return "";
        }
        if (F <= 0) {
            throw z5.f();
        }
        throw z5.j();
    }
}
