package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ti  reason: invalid package */
/* loaded from: classes.dex */
public final class ti {

    /* renamed from: a  reason: collision with root package name */
    static final byte[][] f5383a = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    public static void a(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i10 = 32;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf = Arrays.copyOf(bArr2, 32);
        copyOf[31] = (byte) (copyOf[31] & Byte.MAX_VALUE);
        int i11 = 0;
        for (int i12 = 0; i12 < 7; i12++) {
            byte[][] bArr3 = f5383a;
            if (MessageDigest.isEqual(bArr3[i12], copyOf)) {
                throw new InvalidKeyException("Banned public key: ".concat(uu.a(bArr3[i12])));
            }
        }
        long[] k10 = vi.k(copyOf);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i13 = 10;
        System.arraycopy(k10, 0, jArr2, 0, 10);
        int i14 = 0;
        while (i14 < i10) {
            int i15 = bArr[(32 - i14) - 1] & 255;
            while (i11 < 8) {
                int i16 = (i15 >> (7 - i11)) & 1;
                b(jArr4, jArr2, i16);
                b(jArr5, jArr3, i16);
                long[] copyOf2 = Arrays.copyOf(jArr4, i13);
                int i17 = i15;
                long[] jArr10 = new long[19];
                long[] jArr11 = new long[19];
                int i18 = i14;
                long[] jArr12 = new long[19];
                int i19 = i11;
                long[] jArr13 = new long[19];
                long[] jArr14 = new long[19];
                long[] jArr15 = jArr9;
                long[] jArr16 = new long[19];
                long[] jArr17 = new long[19];
                vi.i(jArr4, jArr4, jArr5);
                vi.h(jArr5, copyOf2, jArr5);
                long[] copyOf3 = Arrays.copyOf(jArr2, 10);
                vi.i(jArr2, jArr2, jArr3);
                vi.h(jArr3, copyOf3, jArr3);
                vi.b(jArr13, jArr2, jArr5);
                vi.b(jArr14, jArr4, jArr3);
                vi.e(jArr13);
                vi.d(jArr13);
                vi.e(jArr14);
                vi.d(jArr14);
                long[] jArr18 = jArr2;
                System.arraycopy(jArr13, 0, copyOf3, 0, 10);
                vi.i(jArr13, jArr13, jArr14);
                vi.h(jArr14, copyOf3, jArr14);
                vi.g(jArr17, jArr13);
                vi.g(jArr16, jArr14);
                vi.b(jArr14, jArr16, k10);
                vi.e(jArr14);
                vi.d(jArr14);
                System.arraycopy(jArr17, 0, jArr6, 0, 10);
                System.arraycopy(jArr14, 0, jArr7, 0, 10);
                vi.g(jArr11, jArr4);
                vi.g(jArr12, jArr5);
                vi.b(jArr8, jArr11, jArr12);
                vi.e(jArr8);
                vi.d(jArr8);
                vi.h(jArr12, jArr11, jArr12);
                Arrays.fill(jArr10, 10, 18, 0L);
                vi.f(jArr10, jArr12, 121665L);
                vi.d(jArr10);
                vi.i(jArr10, jArr10, jArr11);
                vi.b(jArr15, jArr12, jArr10);
                vi.e(jArr15);
                vi.d(jArr15);
                b(jArr8, jArr6, i16);
                b(jArr15, jArr7, i16);
                i11 = i19 + 1;
                jArr2 = jArr6;
                i15 = i17;
                i14 = i18;
                jArr6 = jArr18;
                i13 = 10;
                long[] jArr19 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr19;
                long[] jArr20 = jArr8;
                jArr8 = jArr4;
                jArr4 = jArr20;
                jArr9 = jArr5;
                jArr5 = jArr15;
            }
            i14++;
            i10 = 32;
            i11 = 0;
            i13 = 10;
        }
        long[] jArr21 = new long[10];
        long[] jArr22 = new long[10];
        long[] jArr23 = new long[10];
        long[] jArr24 = new long[10];
        long[] jArr25 = new long[10];
        long[] jArr26 = new long[10];
        long[] jArr27 = new long[10];
        long[] jArr28 = new long[10];
        long[] jArr29 = new long[10];
        long[] jArr30 = new long[10];
        long[] jArr31 = jArr2;
        long[] jArr32 = new long[10];
        vi.g(jArr22, jArr5);
        vi.g(jArr32, jArr22);
        vi.g(jArr30, jArr32);
        vi.a(jArr23, jArr30, jArr5);
        vi.a(jArr24, jArr23, jArr22);
        vi.g(jArr30, jArr24);
        vi.a(jArr25, jArr30, jArr23);
        vi.g(jArr30, jArr25);
        vi.g(jArr32, jArr30);
        vi.g(jArr30, jArr32);
        vi.g(jArr32, jArr30);
        vi.g(jArr30, jArr32);
        vi.a(jArr26, jArr30, jArr25);
        vi.g(jArr30, jArr26);
        vi.g(jArr32, jArr30);
        for (int i20 = 2; i20 < 10; i20 += 2) {
            vi.g(jArr30, jArr32);
            vi.g(jArr32, jArr30);
        }
        vi.a(jArr27, jArr32, jArr26);
        vi.g(jArr30, jArr27);
        vi.g(jArr32, jArr30);
        for (int i21 = 2; i21 < 20; i21 += 2) {
            vi.g(jArr30, jArr32);
            vi.g(jArr32, jArr30);
        }
        vi.a(jArr30, jArr32, jArr27);
        vi.g(jArr32, jArr30);
        vi.g(jArr30, jArr32);
        for (int i22 = 2; i22 < 10; i22 += 2) {
            vi.g(jArr32, jArr30);
            vi.g(jArr30, jArr32);
        }
        vi.a(jArr28, jArr30, jArr26);
        vi.g(jArr30, jArr28);
        vi.g(jArr32, jArr30);
        for (int i23 = 2; i23 < 50; i23 += 2) {
            vi.g(jArr30, jArr32);
            vi.g(jArr32, jArr30);
        }
        vi.a(jArr29, jArr32, jArr28);
        vi.g(jArr32, jArr29);
        vi.g(jArr30, jArr32);
        for (int i24 = 2; i24 < 100; i24 += 2) {
            vi.g(jArr32, jArr30);
            vi.g(jArr30, jArr32);
        }
        vi.a(jArr32, jArr30, jArr29);
        vi.g(jArr30, jArr32);
        vi.g(jArr32, jArr30);
        for (int i25 = 2; i25 < 50; i25 += 2) {
            vi.g(jArr30, jArr32);
            vi.g(jArr32, jArr30);
        }
        vi.a(jArr30, jArr32, jArr28);
        vi.g(jArr32, jArr30);
        vi.g(jArr30, jArr32);
        vi.g(jArr32, jArr30);
        vi.g(jArr30, jArr32);
        vi.g(jArr32, jArr30);
        vi.a(jArr21, jArr32, jArr24);
        vi.a(jArr, jArr4, jArr21);
        long[] jArr33 = new long[10];
        long[] jArr34 = new long[10];
        long[] jArr35 = new long[11];
        long[] jArr36 = new long[11];
        long[] jArr37 = new long[11];
        vi.a(jArr33, k10, jArr);
        vi.i(jArr34, k10, jArr);
        long[] jArr38 = new long[10];
        jArr38[0] = 486662;
        vi.i(jArr36, jArr34, jArr38);
        vi.a(jArr36, jArr36, jArr3);
        vi.i(jArr36, jArr36, jArr31);
        vi.a(jArr36, jArr36, jArr33);
        vi.a(jArr36, jArr36, jArr31);
        vi.f(jArr35, jArr36, 4L);
        vi.d(jArr35);
        vi.a(jArr36, jArr33, jArr3);
        vi.h(jArr36, jArr36, jArr3);
        vi.a(jArr37, jArr34, jArr31);
        vi.i(jArr36, jArr36, jArr37);
        vi.g(jArr36, jArr36);
        if (!MessageDigest.isEqual(vi.j(jArr35), vi.j(jArr36))) {
            throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(uu.a(bArr2)));
        }
    }

    static void b(long[] jArr, long[] jArr2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = (int) jArr[i11];
            int i13 = (-i10) & (((int) jArr2[i11]) ^ i12);
            jArr[i11] = i12 ^ i13;
            jArr2[i11] = i13 ^ ((int) jArr2[i11]);
        }
    }
}
