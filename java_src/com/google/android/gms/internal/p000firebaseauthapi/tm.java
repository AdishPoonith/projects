package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tm  reason: invalid package */
/* loaded from: classes.dex */
final class tm implements ta {

    /* renamed from: a  reason: collision with root package name */
    private final bb f5387a;

    /* renamed from: b  reason: collision with root package name */
    private final cn f5388b;

    /* renamed from: c  reason: collision with root package name */
    private final cn f5389c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ tm(bb bbVar, sm smVar) {
        cn cnVar;
        this.f5387a = bbVar;
        if (bbVar.f()) {
            dn b10 = pj.a().b();
            in a10 = mj.a(bbVar);
            this.f5388b = b10.a(a10, "mac", "compute");
            cnVar = b10.a(a10, "mac", "verify");
        } else {
            cnVar = mj.f5021a;
            this.f5388b = cnVar;
        }
        this.f5389c = cnVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ta
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        Logger logger;
        byte[] bArr4;
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (xa xaVar : this.f5387a.e(copyOf)) {
            if (xaVar.c().equals(ct.LEGACY)) {
                bArr4 = um.f5465b;
                bArr3 = ut.b(bArr2, bArr4);
            } else {
                bArr3 = bArr2;
            }
            try {
                ((ta) xaVar.e()).a(copyOfRange, bArr3);
                xaVar.a();
                return;
            } catch (GeneralSecurityException e10) {
                logger = um.f5464a;
                logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e10.toString()));
            }
        }
        for (xa xaVar2 : this.f5387a.e(w9.f5585a)) {
            try {
                ((ta) xaVar2.e()).a(bArr, bArr2);
                xaVar2.a();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
