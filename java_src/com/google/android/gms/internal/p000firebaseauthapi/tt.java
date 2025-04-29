package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tt  reason: invalid package */
/* loaded from: classes.dex */
public final class tt implements x9 {

    /* renamed from: c  reason: collision with root package name */
    private static final Collection f5390c = Arrays.asList(64);

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f5391d = new byte[16];

    /* renamed from: a  reason: collision with root package name */
    private final wu f5392a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5393b;

    public tt(byte[] bArr) {
        if (!eg.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = f5390c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i10 = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i10);
            this.f5393b = Arrays.copyOfRange(bArr, i10, length);
            this.f5392a = new wu(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] c10;
        int length = bArr.length;
        if (length >= 16) {
            Cipher cipher = (Cipher) lu.f4963b.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f5393b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && cv.a()) {
                doFinal = new byte[0];
            }
            byte[][] bArr4 = {bArr2, doFinal};
            byte[] a10 = this.f5392a.a(f5391d, 16);
            for (int i10 = 0; i10 <= 0; i10++) {
                byte[] bArr5 = bArr4[i10];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                a10 = ut.c(vm.b(a10), this.f5392a.a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length2 = bArr6.length;
            if (length2 >= 16) {
                int length3 = a10.length;
                if (length2 < length3) {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
                c10 = Arrays.copyOf(bArr6, length2);
                for (int i11 = 0; i11 < a10.length; i11++) {
                    int i12 = (length2 - length3) + i11;
                    c10[i12] = (byte) (c10[i12] ^ a10[i11]);
                }
            } else {
                c10 = ut.c(vm.a(bArr6), vm.b(a10));
            }
            if (MessageDigest.isEqual(copyOfRange, this.f5392a.a(c10, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
