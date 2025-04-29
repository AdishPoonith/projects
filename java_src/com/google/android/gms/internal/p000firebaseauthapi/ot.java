package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ot  reason: invalid package */
/* loaded from: classes.dex */
public final class ot implements vu {

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f5146d = new nt();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKeySpec f5147a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5148b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5149c;

    public ot(byte[] bArr, int i10) {
        if (!eg.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        dv.b(bArr.length);
        this.f5147a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f5146d.get()).getBlockSize();
        this.f5149c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f5148b = i10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.vu
    public final byte[] zza(byte[] bArr) {
        int length = bArr.length;
        int i10 = this.f5148b;
        if (length >= i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            int i11 = this.f5148b;
            int i12 = length - i11;
            byte[] bArr3 = new byte[i12];
            Cipher cipher = (Cipher) f5146d.get();
            byte[] bArr4 = new byte[this.f5149c];
            System.arraycopy(bArr2, 0, bArr4, 0, this.f5148b);
            cipher.init(2, this.f5147a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i11, i12, bArr3, 0) == i12) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
