package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dg  reason: invalid package */
/* loaded from: classes.dex */
public final class dg implements s9 {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f4503b = new cg();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f4504c;

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f4505a;

    static {
        boolean z10;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f4504c = z10;
    }

    public dg(byte[] bArr) {
        dv.b(bArr.length);
        this.f4505a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length >= 28) {
            if (f4504c) {
                ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } else if (!cv.a()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            } else {
                ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
            }
            ThreadLocal threadLocal = f4503b;
            ((Cipher) threadLocal.get()).init(2, this.f4505a, ivParameterSpec);
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
