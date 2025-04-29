package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yf  reason: invalid package */
/* loaded from: classes.dex */
abstract class yf {

    /* renamed from: a  reason: collision with root package name */
    private final wf f5710a;

    /* renamed from: b  reason: collision with root package name */
    private final wf f5711b;

    public yf(byte[] bArr) {
        if (!eg.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f5710a = a(bArr, 1);
        this.f5711b = a(bArr, 0);
    }

    abstract wf a(byte[] bArr, int i10);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                byte[] bArr4 = new byte[32];
                this.f5711b.c(bArr, 0).get(bArr4);
                int remaining = byteBuffer.remaining();
                int i10 = remaining % 16;
                int i11 = i10 == 0 ? remaining : (remaining + 16) - i10;
                ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(byteBuffer);
                order.position(i11);
                order.putLong(0L);
                order.putLong(remaining);
                if (!MessageDigest.isEqual(bg.a(bArr4, order.array()), bArr3)) {
                    throw new GeneralSecurityException("invalid MAC");
                }
                byteBuffer.position(position);
                return this.f5710a.d(bArr, byteBuffer);
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return b(ByteBuffer.wrap(bArr2), bArr, bArr3);
    }
}
