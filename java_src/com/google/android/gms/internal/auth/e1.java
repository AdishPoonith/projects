package com.google.android.gms.internal.auth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i10, d1 d1Var) {
        int j10 = j(bArr, i10, d1Var);
        int i11 = d1Var.f4035a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - j10) {
                if (i11 == 0) {
                    d1Var.f4037c = q1.f4223k;
                    return j10;
                }
                d1Var.f4037c = q1.t(bArr, j10, i11);
                return j10 + i11;
            }
            throw m2.f();
        }
        throw m2.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(s3 s3Var, byte[] bArr, int i10, int i11, int i12, d1 d1Var) {
        j3 j3Var = (j3) s3Var;
        Object zzd = j3Var.zzd();
        int p10 = j3Var.p(zzd, bArr, i10, i11, i12, d1Var);
        j3Var.b(zzd);
        d1Var.f4037c = zzd;
        return p10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(s3 s3Var, byte[] bArr, int i10, int i11, d1 d1Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = k(i13, bArr, i12, d1Var);
            i13 = d1Var.f4035a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw m2.f();
        }
        Object zzd = s3Var.zzd();
        int i15 = i13 + i14;
        s3Var.a(zzd, bArr, i14, i15, d1Var);
        s3Var.b(zzd);
        d1Var.f4037c = zzd;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(s3 s3Var, int i10, byte[] bArr, int i11, int i12, j2 j2Var, d1 d1Var) {
        int d10 = d(s3Var, bArr, i11, i12, d1Var);
        while (true) {
            j2Var.add(d1Var.f4037c);
            if (d10 >= i12) {
                break;
            }
            int j10 = j(bArr, d10, d1Var);
            if (i10 != d1Var.f4035a) {
                break;
            }
            d10 = d(s3Var, bArr, j10, i12, d1Var);
        }
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(byte[] bArr, int i10, j2 j2Var, d1 d1Var) {
        h2 h2Var = (h2) j2Var;
        int j10 = j(bArr, i10, d1Var);
        int i11 = d1Var.f4035a + j10;
        while (j10 < i11) {
            j10 = j(bArr, j10, d1Var);
            h2Var.e(d1Var.f4035a);
        }
        if (j10 == i11) {
            return j10;
        }
        throw m2.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i10, d1 d1Var) {
        int j10 = j(bArr, i10, d1Var);
        int i11 = d1Var.f4035a;
        if (i11 >= 0) {
            if (i11 == 0) {
                d1Var.f4037c = "";
                return j10;
            }
            d1Var.f4037c = new String(bArr, j10, i11, k2.f4144b);
            return j10 + i11;
        }
        throw m2.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i10, d1 d1Var) {
        int j10 = j(bArr, i10, d1Var);
        int i11 = d1Var.f4035a;
        if (i11 >= 0) {
            if (i11 == 0) {
                d1Var.f4037c = "";
                return j10;
            }
            d1Var.f4037c = y4.b(bArr, j10, i11);
            return j10 + i11;
        }
        throw m2.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i10, byte[] bArr, int i11, int i12, k4 k4Var, d1 d1Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int m10 = m(bArr, i11, d1Var);
                k4Var.f(i10, Long.valueOf(d1Var.f4036b));
                return m10;
            } else if (i13 == 1) {
                k4Var.f(i10, Long.valueOf(n(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int j10 = j(bArr, i11, d1Var);
                int i14 = d1Var.f4035a;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - j10) {
                        k4Var.f(i10, i14 == 0 ? q1.f4223k : q1.t(bArr, j10, i14));
                        return j10 + i14;
                    }
                    throw m2.f();
                }
                throw m2.c();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    k4Var.f(i10, Integer.valueOf(b(bArr, i11)));
                    return i11 + 4;
                }
                throw m2.a();
            } else {
                int i15 = (i10 & (-8)) | 4;
                k4 c10 = k4.c();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int j11 = j(bArr, i11, d1Var);
                    int i17 = d1Var.f4035a;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = j11;
                        break;
                    }
                    int i18 = i(i16, bArr, j11, i12, c10, d1Var);
                    i16 = i17;
                    i11 = i18;
                }
                if (i11 > i12 || i16 != i15) {
                    throw m2.d();
                }
                k4Var.f(i10, c10);
                return i11;
            }
        }
        throw m2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(byte[] bArr, int i10, d1 d1Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            d1Var.f4035a = b10;
            return i11;
        }
        return k(b10, bArr, i11, d1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, byte[] bArr, int i11, d1 d1Var) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                d1Var.f4035a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            d1Var.f4035a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        d1Var.f4035a = i14 | i13;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i10, byte[] bArr, int i11, int i12, j2 j2Var, d1 d1Var) {
        h2 h2Var = (h2) j2Var;
        int j10 = j(bArr, i11, d1Var);
        while (true) {
            h2Var.e(d1Var.f4035a);
            if (j10 >= i12) {
                break;
            }
            int j11 = j(bArr, j10, d1Var);
            if (i10 != d1Var.f4035a) {
                break;
            }
            j10 = j(bArr, j11, d1Var);
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(byte[] bArr, int i10, d1 d1Var) {
        byte b10;
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            d1Var.f4036b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b11 = bArr[i11];
        long j11 = (j10 & 127) | ((b11 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b11 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (b10 & Byte.MAX_VALUE) << i13;
            b11 = bArr[i12];
            i12 = i14;
        }
        d1Var.f4036b = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long n(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
