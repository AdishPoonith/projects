package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tf  reason: invalid package */
/* loaded from: classes.dex */
public final class tf {

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadLocal f5379c = new sf();

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f5380a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5381b;

    public tf(byte[] bArr, boolean z10) {
        if (!eg.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        dv.b(bArr.length);
        this.f5380a = new SecretKeySpec(bArr, "AES");
        this.f5381b = z10;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length == 12) {
            boolean z10 = this.f5381b;
            int i10 = true != z10 ? 16 : 28;
            int length = bArr2.length;
            if (length >= i10) {
                if (!z10 || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    String property = System.getProperty("java.vendor");
                    Integer num = null;
                    if (property == "The Android Project" || (property != null && property.equals("The Android Project"))) {
                        num = Integer.valueOf(Build.VERSION.SDK_INT);
                    }
                    AlgorithmParameterSpec gCMParameterSpec = (num == null || num.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
                    ThreadLocal threadLocal = f5379c;
                    ((Cipher) threadLocal.get()).init(2, this.f5380a, gCMParameterSpec);
                    boolean z11 = this.f5381b;
                    int i11 = true != z11 ? 0 : 12;
                    if (z11) {
                        length -= 12;
                    }
                    return ((Cipher) threadLocal.get()).doFinal(bArr2, i11, length);
                }
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
