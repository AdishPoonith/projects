package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jh  reason: invalid package */
/* loaded from: classes.dex */
final class jh implements y9 {

    /* renamed from: a  reason: collision with root package name */
    private final bb f4819a;

    /* renamed from: b  reason: collision with root package name */
    private final cn f4820b;

    public jh(bb bbVar) {
        this.f4819a = bbVar;
        this.f4820b = bbVar.f() ? pj.a().b().a(mj.a(bbVar), "hybrid_decrypt", "decrypt") : mj.f5021a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.y9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (xa xaVar : this.f4819a.e(copyOfRange)) {
                try {
                    byte[] a10 = ((y9) xaVar.e()).a(copyOfRange2, null);
                    xaVar.a();
                    int length2 = copyOfRange2.length;
                    return a10;
                } catch (GeneralSecurityException e10) {
                    logger = kh.f4884a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e10.toString())));
                }
            }
        }
        for (xa xaVar2 : this.f4819a.e(w9.f5585a)) {
            try {
                byte[] a11 = ((y9) xaVar2.e()).a(bArr, null);
                xaVar2.a();
                return a11;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
