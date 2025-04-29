package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rh  reason: invalid package */
/* loaded from: classes.dex */
final class rh implements th {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.th
    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new xf(bArr).c(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.th
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.th
    public final byte[] zzb() {
        return gi.f4638k;
    }
}
