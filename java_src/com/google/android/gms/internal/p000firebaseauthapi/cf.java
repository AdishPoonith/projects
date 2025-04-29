package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cf  reason: invalid package */
/* loaded from: classes.dex */
public final class cf implements s9 {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f4447c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final as f4448a;

    /* renamed from: b  reason: collision with root package name */
    private final s9 f4449b;

    public cf(as asVar, s9 s9Var) {
        this.f4448a = asVar;
        this.f4449b = s9Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] a10 = this.f4449b.a(bArr3, f4447c);
            String H = this.f4448a.H();
            int i11 = gb.f4622g;
            m4 m4Var = m4.f4993k;
            return ((s9) gb.e(H, m4.w(a10, 0, a10.length), s9.class)).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s9
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
