package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wu  reason: invalid package */
/* loaded from: classes.dex */
public final class wu implements jn {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f5606a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5607b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f5608c;

    public wu(byte[] bArr) {
        dv.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f5606a = secretKeySpec;
        Cipher b10 = b();
        b10.init(1, secretKeySpec);
        byte[] b11 = vm.b(b10.doFinal(new byte[16]));
        this.f5607b = b11;
        this.f5608c = vm.b(b11);
    }

    private static Cipher b() {
        if (eg.a(1)) {
            return (Cipher) lu.f4963b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.jn
    public final byte[] a(byte[] bArr, int i10) {
        if (i10 <= 16) {
            Cipher b10 = b();
            b10.init(1, this.f5606a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(length / 16.0d));
            byte[] d10 = max * 16 == length ? ut.d(bArr, (max - 1) * 16, this.f5607b, 0, 16) : ut.c(vm.a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f5608c);
            byte[] bArr2 = new byte[16];
            for (int i11 = 0; i11 < max - 1; i11++) {
                bArr2 = b10.doFinal(ut.d(bArr2, 0, bArr, i11 * 16, 16));
            }
            return Arrays.copyOf(b10.doFinal(ut.c(d10, bArr2)), i10);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
