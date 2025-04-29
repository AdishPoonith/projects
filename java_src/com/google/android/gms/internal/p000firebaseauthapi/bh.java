package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bh  reason: invalid package */
/* loaded from: classes.dex */
final class bh implements x9 {

    /* renamed from: a  reason: collision with root package name */
    private final bb f4399a;

    /* renamed from: b  reason: collision with root package name */
    private final cn f4400b;

    /* renamed from: c  reason: collision with root package name */
    private final cn f4401c;

    public bh(bb bbVar) {
        cn cnVar;
        this.f4399a = bbVar;
        if (bbVar.f()) {
            dn b10 = pj.a().b();
            in a10 = mj.a(bbVar);
            this.f4400b = b10.a(a10, "daead", "encrypt");
            cnVar = b10.a(a10, "daead", "decrypt");
        } else {
            cnVar = mj.f5021a;
            this.f4400b = cnVar;
        }
        this.f4401c = cnVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.x9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (xa xaVar : this.f4399a.e(copyOf)) {
                try {
                    byte[] a10 = ((x9) xaVar.e()).a(copyOfRange, bArr2);
                    xaVar.a();
                    int length2 = copyOfRange.length;
                    return a10;
                } catch (GeneralSecurityException e10) {
                    logger = ch.f4450a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (xa xaVar2 : this.f4399a.e(w9.f5585a)) {
            try {
                byte[] a11 = ((x9) xaVar2.e()).a(bArr, bArr2);
                xaVar2.a();
                return a11;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
