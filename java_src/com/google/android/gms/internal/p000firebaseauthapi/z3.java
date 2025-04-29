package com.google.android.gms.internal.p000firebaseauthapi;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z3  reason: invalid package */
/* loaded from: classes.dex */
public final class z3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(byte[] bArr, int i10, y3 y3Var) {
        int j10 = j(bArr, i10, y3Var);
        int i11 = y3Var.f5694a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - j10) {
                if (i11 == 0) {
                    y3Var.f5696c = m4.f4993k;
                    return j10;
                }
                y3Var.f5696c = m4.w(bArr, j10, i11);
                return j10 + i11;
            }
            throw z5.j();
        }
        throw z5.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return ((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(j7 j7Var, byte[] bArr, int i10, int i11, int i12, y3 y3Var) {
        Object zze = j7Var.zze();
        int n10 = n(zze, j7Var, bArr, i10, i11, i12, y3Var);
        j7Var.zzf(zze);
        y3Var.f5696c = zze;
        return n10;
    }

    static int d(j7 j7Var, byte[] bArr, int i10, int i11, y3 y3Var) {
        Object zze = j7Var.zze();
        int o10 = o(zze, j7Var, bArr, i10, i11, y3Var);
        j7Var.zzf(zze);
        y3Var.f5696c = zze;
        return o10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(j7 j7Var, int i10, byte[] bArr, int i11, int i12, w5 w5Var, y3 y3Var) {
        int d10 = d(j7Var, bArr, i11, i12, y3Var);
        while (true) {
            w5Var.add(y3Var.f5696c);
            if (d10 >= i12) {
                break;
            }
            int j10 = j(bArr, d10, y3Var);
            if (i10 != y3Var.f5694a) {
                break;
            }
            d10 = d(j7Var, bArr, j10, i12, y3Var);
        }
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(byte[] bArr, int i10, w5 w5Var, y3 y3Var) {
        s5 s5Var = (s5) w5Var;
        int j10 = j(bArr, i10, y3Var);
        int i11 = y3Var.f5694a + j10;
        while (j10 < i11) {
            j10 = j(bArr, j10, y3Var);
            s5Var.k(y3Var.f5694a);
        }
        if (j10 == i11) {
            return j10;
        }
        throw z5.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(byte[] bArr, int i10, y3 y3Var) {
        int j10 = j(bArr, i10, y3Var);
        int i11 = y3Var.f5694a;
        if (i11 >= 0) {
            if (i11 == 0) {
                y3Var.f5696c = "";
                return j10;
            }
            y3Var.f5696c = new String(bArr, j10, i11, x5.f5626b);
            return j10 + i11;
        }
        throw z5.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(byte[] bArr, int i10, y3 y3Var) {
        int j10 = j(bArr, i10, y3Var);
        int i11 = y3Var.f5694a;
        if (i11 >= 0) {
            if (i11 == 0) {
                y3Var.f5696c = "";
                return j10;
            }
            y3Var.f5696c = t8.d(bArr, j10, i11);
            return j10 + i11;
        }
        throw z5.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(int i10, byte[] bArr, int i11, int i12, e8 e8Var, y3 y3Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int m10 = m(bArr, i11, y3Var);
                e8Var.j(i10, Long.valueOf(y3Var.f5695b));
                return m10;
            } else if (i13 == 1) {
                e8Var.j(i10, Long.valueOf(p(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int j10 = j(bArr, i11, y3Var);
                int i14 = y3Var.f5694a;
                if (i14 >= 0) {
                    if (i14 <= bArr.length - j10) {
                        e8Var.j(i10, i14 == 0 ? m4.f4993k : m4.w(bArr, j10, i14));
                        return j10 + i14;
                    }
                    throw z5.j();
                }
                throw z5.f();
            } else if (i13 != 3) {
                if (i13 == 5) {
                    e8Var.j(i10, Integer.valueOf(b(bArr, i11)));
                    return i11 + 4;
                }
                throw z5.c();
            } else {
                int i15 = (i10 & (-8)) | 4;
                e8 f10 = e8.f();
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int j11 = j(bArr, i11, y3Var);
                    int i17 = y3Var.f5694a;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = j11;
                        break;
                    }
                    int i18 = i(i16, bArr, j11, i12, f10, y3Var);
                    i16 = i17;
                    i11 = i18;
                }
                if (i11 > i12 || i16 != i15) {
                    throw z5.g();
                }
                e8Var.j(i10, f10);
                return i11;
            }
        }
        throw z5.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(byte[] bArr, int i10, y3 y3Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            y3Var.f5694a = b10;
            return i11;
        }
        return k(b10, bArr, i11, y3Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, byte[] bArr, int i11, y3 y3Var) {
        int i12;
        int i13;
        byte b10 = bArr[i11];
        int i14 = i11 + 1;
        int i15 = i10 & 127;
        if (b10 < 0) {
            int i16 = i15 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i14 + 1;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i15 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i14 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                y3Var.f5694a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            y3Var.f5694a = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        y3Var.f5694a = i15 | i13;
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i10, byte[] bArr, int i11, int i12, w5 w5Var, y3 y3Var) {
        s5 s5Var = (s5) w5Var;
        int j10 = j(bArr, i11, y3Var);
        while (true) {
            s5Var.k(y3Var.f5694a);
            if (j10 >= i12) {
                break;
            }
            int j11 = j(bArr, j10, y3Var);
            if (i10 != y3Var.f5694a) {
                break;
            }
            j10 = j(bArr, j11, y3Var);
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(byte[] bArr, int i10, y3 y3Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            y3Var.f5695b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        y3Var.f5695b = j11;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(Object obj, j7 j7Var, byte[] bArr, int i10, int i11, int i12, y3 y3Var) {
        int F = ((z6) j7Var).F(obj, bArr, i10, i11, i12, y3Var);
        y3Var.f5696c = obj;
        return F;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(Object obj, j7 j7Var, byte[] bArr, int i10, int i11, y3 y3Var) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = k(i13, bArr, i12, y3Var);
            i13 = y3Var.f5694a;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw z5.j();
        }
        int i15 = i13 + i14;
        j7Var.a(obj, bArr, i14, i15, y3Var);
        y3Var.f5696c = obj;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long p(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
