package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ob  reason: invalid package */
/* loaded from: classes.dex */
final class ob implements s9 {

    /* renamed from: a  reason: collision with root package name */
    private final bb f5127a;

    /* renamed from: b  reason: collision with root package name */
    private final cn f5128b;

    /* renamed from: c  reason: collision with root package name */
    private final cn f5129c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ob(bb bbVar, nb nbVar) {
        cn cnVar;
        this.f5127a = bbVar;
        if (bbVar.f()) {
            dn b10 = pj.a().b();
            in a10 = mj.a(bbVar);
            this.f5128b = b10.a(a10, "aead", "encrypt");
            cnVar = b10.a(a10, "aead", "decrypt");
        } else {
            cnVar = mj.f5021a;
            this.f5128b = cnVar;
        }
        this.f5129c = cnVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (xa xaVar : this.f5127a.e(copyOf)) {
                try {
                    byte[] a10 = ((s9) xaVar.e()).a(copyOfRange, bArr2);
                    xaVar.a();
                    int length2 = copyOfRange.length;
                    return a10;
                } catch (GeneralSecurityException e10) {
                    logger = pb.f5174a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e10.toString()));
                }
            }
        }
        for (xa xaVar2 : this.f5127a.e(w9.f5585a)) {
            try {
                byte[] a11 = ((s9) xaVar2.e()).a(bArr, bArr2);
                xaVar2.a();
                return a11;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
