package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pi  reason: invalid package */
/* loaded from: classes.dex */
public final class pi implements s9 {

    /* renamed from: b  reason: collision with root package name */
    private static final String f5196b = "pi";

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f5197a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pi(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f5197a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    private static void c() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    private final byte[] d(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f5197a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    private final byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f5197a);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, length, bArr3, 12);
            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            try {
                return d(bArr, bArr2);
            } catch (ProviderException e10) {
                e = e10;
                Log.w(f5196b, "encountered a potentially transient KeyStore error, will wait and retry", e);
                c();
                return d(bArr, bArr2);
            } catch (AEADBadTagException e11) {
                throw e11;
            } catch (GeneralSecurityException e12) {
                e = e12;
                Log.w(f5196b, "encountered a potentially transient KeyStore error, will wait and retry", e);
                c();
                return d(bArr, bArr2);
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return e(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            Log.w(f5196b, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            c();
            return e(bArr, bArr2);
        }
    }
}
