package com.google.android.gms.internal.auth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y4 {

    /* renamed from: a  reason: collision with root package name */
    private static final w4 f4282a;

    static {
        if (u4.u() && u4.v()) {
            int i10 = c1.f4028a;
        }
        f4282a = new x4();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else if (i12 != 2) {
                throw new AssertionError();
            } else {
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        if ((i10 | i11 | ((length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!v4.d(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            while (i10 < i12) {
                int i14 = i10 + 1;
                byte b11 = bArr[i10];
                if (v4.d(b11)) {
                    int i15 = i13 + 1;
                    cArr[i13] = (char) b11;
                    i10 = i14;
                    while (true) {
                        i13 = i15;
                        if (i10 < i12) {
                            byte b12 = bArr[i10];
                            if (!v4.d(b12)) {
                                break;
                            }
                            i10++;
                            i15 = i13 + 1;
                            cArr[i13] = (char) b12;
                        }
                    }
                } else if (b11 < -32) {
                    if (i14 >= i12) {
                        throw m2.b();
                    }
                    v4.c(b11, bArr[i14], cArr, i13);
                    i10 = i14 + 1;
                    i13++;
                } else if (b11 < -16) {
                    if (i14 >= i12 - 1) {
                        throw m2.b();
                    }
                    int i16 = i14 + 1;
                    v4.b(b11, bArr[i14], bArr[i16], cArr, i13);
                    i10 = i16 + 1;
                    i13++;
                } else if (i14 >= i12 - 2) {
                    throw m2.b();
                } else {
                    int i17 = i14 + 1;
                    int i18 = i17 + 1;
                    v4.a(b11, bArr[i14], bArr[i17], bArr[i18], cArr, i13);
                    i13 += 2;
                    i10 = i18 + 1;
                }
            }
            return new String(cArr, 0, i13);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(byte[] bArr) {
        return f4282a.b(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(byte[] bArr, int i10, int i11) {
        return f4282a.b(bArr, i10, i11);
    }
}
