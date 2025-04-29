package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cu  reason: invalid package */
/* loaded from: classes.dex */
public final class cu implements s9 {

    /* renamed from: a  reason: collision with root package name */
    private final vu f4468a;

    /* renamed from: b  reason: collision with root package name */
    private final ta f4469b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4470c;

    public cu(vu vuVar, ta taVar, int i10) {
        this.f4468a = vuVar;
        this.f4469b = taVar;
        this.f4470c = i10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f4470c;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i10);
            this.f4469b.a(Arrays.copyOfRange(bArr, length - this.f4470c, length), ut.b(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8)));
            return this.f4468a.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
