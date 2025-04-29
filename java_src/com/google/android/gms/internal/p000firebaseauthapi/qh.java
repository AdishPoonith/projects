package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qh  reason: invalid package */
/* loaded from: classes.dex */
final class qh implements th {

    /* renamed from: a  reason: collision with root package name */
    private final int f5258a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qh(int i10) {
        if (i10 == 16 || i10 == 32) {
            this.f5258a = i10;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.th
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f5258a) {
            return new tf(bArr, false).a(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.th
    public final int zza() {
        return this.f5258a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.th
    public final byte[] zzb() {
        int i10 = this.f5258a;
        if (i10 != 16) {
            if (i10 == 32) {
                return gi.f4637j;
            }
            throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
        }
        return gi.f4636i;
    }
}
