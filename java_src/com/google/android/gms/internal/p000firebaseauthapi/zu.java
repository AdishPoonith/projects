package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zu  reason: invalid package */
/* loaded from: classes.dex */
public final class zu implements ta {

    /* renamed from: a  reason: collision with root package name */
    private final jn f5791a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5792b;

    public zu(jn jnVar, int i10) {
        this.f5791a = jnVar;
        this.f5792b = i10;
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        jnVar.a(new byte[0], i10);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ta
    public final void a(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(this.f5791a.a(bArr2, this.f5792b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
