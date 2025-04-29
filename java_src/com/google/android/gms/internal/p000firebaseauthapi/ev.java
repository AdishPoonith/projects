package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ev  reason: invalid package */
/* loaded from: classes.dex */
public final class ev {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            int i10 = copyOf[31] & Byte.MAX_VALUE;
            copyOf[31] = (byte) i10;
            copyOf[31] = (byte) (i10 | 64);
            ti.a(jArr, copyOf, bArr2);
            return vi.j(jArr);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
