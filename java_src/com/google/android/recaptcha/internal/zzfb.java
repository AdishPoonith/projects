package com.google.android.recaptcha.internal;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfb extends zzff {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfb(byte[] bArr, int i10, int i11, boolean z10, zzfa zzfaVar) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzI() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i10 - i12;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final void zzA(int i10) {
        this.zzj = i10;
        zzI();
    }

    public final void zzB(int i10) {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw zzgy.zzj();
        }
        throw zzgy.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzC() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final boolean zzE(int i10) {
        int zzm;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i12 < 10) {
                    if (zza() < 0) {
                        i12++;
                    }
                }
                throw zzgy.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzh;
                this.zzh = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzgy.zze();
            return true;
        } else if (i11 == 1) {
            zzB(8);
            return true;
        } else if (i11 == 2) {
            zzB(zzj());
            return true;
        } else if (i11 != 3) {
            if (i11 != 4) {
                if (i11 == 5) {
                    zzB(4);
                    return true;
                }
                throw zzgy.zza();
            }
            return false;
        } else {
            do {
                zzm = zzm();
                if (zzm == 0) {
                    break;
                }
            } while (zzE(zzm));
            zzz(((i10 >>> 3) << 3) | 4);
            return true;
        }
    }

    public final byte zza() {
        int i10 = this.zzh;
        if (i10 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 1;
            return bArr[i10];
        }
        throw zzgy.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzd() {
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zze(int i10) {
        if (i10 >= 0) {
            int i11 = i10 + this.zzh;
            if (i11 >= 0) {
                int i12 = this.zzj;
                if (i11 <= i12) {
                    this.zzj = i11;
                    zzI();
                    return i12;
                }
                throw zzgy.zzj();
            }
            throw zzgy.zzg();
        }
        throw zzgy.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 4;
            int i11 = (bArr[i10 + 1] & 255) << 8;
            return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw zzgy.zzj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzj() {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzh = r3
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
            r5.zzh = r1
            return r0
        L6d:
            long r0 = r5.zzs()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzfb.zzj():int");
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzl() {
        return zzff.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzm() {
        if (zzC()) {
            this.zzi = 0;
            return 0;
        }
        int zzj = zzj();
        this.zzi = zzj;
        if ((zzj >>> 3) != 0) {
            return zzj;
        }
        throw zzgy.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i10 = this.zzh;
        if (this.zzf - i10 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i10 + 8;
            long j10 = bArr[i10 + 2];
            long j11 = bArr[i10 + 3];
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((j10 & 255) << 16) | ((j11 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw zzgy.zzj();
    }

    public final long zzr() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
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
                                                    this.zzh = i14;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i14 = i19;
                                this.zzh = i14;
                                return j11;
                            }
                            j13 = 266354560;
                            j10 = j14 ^ j13;
                        }
                    }
                    i14 = i16;
                    j11 = j10;
                    this.zzh = i14;
                    return j11;
                }
                i10 = i15 ^ (-128);
                j11 = i10;
                this.zzh = i14;
                return j11;
            }
        }
        return zzs();
    }

    final long zzs() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte zza = zza();
            j10 |= (zza & Byte.MAX_VALUE) << i10;
            if ((zza & 128) == 0) {
                return j10;
            }
        }
        throw zzgy.zze();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzu() {
        return zzff.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final zzez zzw() {
        int zzj = zzj();
        if (zzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj <= i10 - i11) {
                zzez zzm = zzez.zzm(this.zze, i11, zzj);
                this.zzh += zzj;
                return zzm;
            }
        }
        if (zzj != 0) {
            if (zzj > 0) {
                int i12 = this.zzf;
                int i13 = this.zzh;
                if (zzj <= i12 - i13) {
                    int i14 = zzj + i13;
                    this.zzh = i14;
                    return new zzew(Arrays.copyOfRange(this.zze, i13, i14));
                }
            }
            if (zzj <= 0) {
                throw zzgy.zzf();
            }
            throw zzgy.zzj();
        }
        return zzez.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final String zzx() {
        int zzj = zzj();
        if (zzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj <= i10 - i11) {
                String str = new String(this.zze, i11, zzj, zzgw.zzb);
                this.zzh += zzj;
                return str;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj < 0) {
            throw zzgy.zzf();
        }
        throw zzgy.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final String zzy() {
        int zzj = zzj();
        if (zzj > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzj <= i10 - i11) {
                String zzd = zzju.zzd(this.zze, i11, zzj);
                this.zzh += zzj;
                return zzd;
            }
        }
        if (zzj == 0) {
            return "";
        }
        if (zzj <= 0) {
            throw zzgy.zzf();
        }
        throw zzgy.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzff
    public final void zzz(int i10) {
        if (this.zzi != i10) {
            throw zzgy.zzb();
        }
    }
}
