package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bg  reason: invalid package */
/* loaded from: classes.dex */
public final class bg {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long b10 = b(bArr, 0, 0);
        long b11 = b(bArr, 3, 2) & 67108611;
        long b12 = b(bArr, 6, 4) & 67092735;
        long b13 = b(bArr, 9, 6) & 66076671;
        long b14 = b(bArr, 12, 8) & 1048575;
        int i10 = 17;
        byte[] bArr3 = new byte[17];
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        int i11 = 0;
        while (true) {
            int length = bArr2.length;
            if (i11 >= length) {
                long j15 = j10 + (j11 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j12 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j13 + (j17 >> 26);
                long j20 = j19 & 67108863;
                long j21 = j14 + ((j19 >> 26) * 5);
                long j22 = j21 & 67108863;
                long j23 = j22 + 5;
                long j24 = (j11 & 67108863) + (j21 >> 26);
                long j25 = j24 + (j23 >> 26);
                long j26 = (j25 >> 26) + j16;
                long j27 = j18 + (j26 >> 26);
                long j28 = (j20 + (j27 >> 26)) - 67108864;
                long j29 = j28 >> 63;
                long j30 = ~j29;
                long j31 = (j24 & j29) | (j25 & 67108863 & j30);
                long j32 = (j16 & j29) | (j26 & 67108863 & j30);
                long j33 = (j18 & j29) | (j27 & 67108863 & j30);
                long j34 = (j20 & j29) | (j28 & j30);
                long c10 = (((j29 & j22) | (j23 & 67108863 & j30) | (j31 << 26)) & 4294967295L) + c(bArr, 16);
                long c11 = (((j31 >> 6) | (j32 << 20)) & 4294967295L) + c(bArr, 20);
                long c12 = (((j32 >> 12) | (j33 << 14)) & 4294967295L) + c(bArr, 24);
                long c13 = (((j33 >> 18) | (j34 << 8)) & 4294967295L) + c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, c10 & 4294967295L, 0);
                long j35 = c11 + (c10 >> 32);
                d(bArr4, j35 & 4294967295L, 4);
                long j36 = c12 + (j35 >> 32);
                d(bArr4, j36 & 4294967295L, 8);
                d(bArr4, (c13 + (j36 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i10, (byte) 0);
            }
            long j37 = b14 * 5;
            long j38 = b13 * 5;
            long j39 = b12 * 5;
            long b15 = j14 + b(bArr3, 0, 0);
            long b16 = j11 + b(bArr3, 3, 2);
            long b17 = j10 + b(bArr3, 6, 4);
            long b18 = j12 + b(bArr3, 9, 6);
            long b19 = j13 + (b(bArr3, 12, 8) | (bArr3[16] << 24));
            long j40 = b16 * b10;
            long j41 = b16 * b11;
            long j42 = b16 * b12;
            long j43 = b18 * b10;
            long j44 = b16 * b13;
            long j45 = b19 * b10;
            long j46 = (b15 * b10) + (b16 * j37) + (b17 * j38) + (b18 * j39) + (b11 * 5 * b19);
            long j47 = (b15 * b11) + j40 + (b17 * j37) + (b18 * j38) + (j39 * b19) + (j46 >> 26);
            long j48 = (b15 * b12) + j41 + (b17 * b10) + (b18 * j37) + (j38 * b19) + (j47 >> 26);
            long j49 = (b15 * b13) + j42 + (b17 * b11) + j43 + (b19 * j37) + (j48 >> 26);
            long j50 = (b15 * b14) + j44 + (b17 * b12) + (b18 * b11) + j45 + (j49 >> 26);
            long j51 = (j46 & 67108863) + ((j50 >> 26) * 5);
            j11 = (j47 & 67108863) + (j51 >> 26);
            i11 += 16;
            j10 = j48 & 67108863;
            j12 = j49 & 67108863;
            j13 = j50 & 67108863;
            i10 = 17;
            j14 = j51 & 67108863;
        }
    }

    private static long b(byte[] bArr, int i10, int i11) {
        return (c(bArr, i10) >> i11) & 67108863;
    }

    private static long c(byte[] bArr, int i10) {
        int i11 = (bArr[i10 + 1] & 255) << 8;
        return (((bArr[i10 + 3] & 255) << 24) | i11 | (bArr[i10] & 255) | ((bArr[i10 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void d(byte[] bArr, long j10, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (255 & j10);
            j10 >>= 8;
        }
    }
}
