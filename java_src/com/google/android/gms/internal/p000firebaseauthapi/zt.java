package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zt  reason: invalid package */
/* loaded from: classes.dex */
public final class zt {

    /* renamed from: a  reason: collision with root package name */
    private final ECPrivateKey f5790a;

    public zt(ECPrivateKey eCPrivateKey) {
        this.f5790a = eCPrivateKey;
    }

    public final byte[] a(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i10, int i11) {
        int i12 = 1;
        byte[] b10 = ut.b(bArr, bu.f(this.f5790a, bu.h(this.f5790a.getParams(), i11, bArr)));
        Mac mac = (Mac) lu.f4964c.a(str);
        if (i10 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] doFinal = mac.doFinal(b10);
        byte[] bArr4 = new byte[i10];
        mac.init(new SecretKeySpec(doFinal, str));
        byte[] bArr5 = new byte[0];
        int i13 = 0;
        while (true) {
            mac.update(bArr5);
            mac.update((byte[]) null);
            mac.update((byte) i12);
            bArr5 = mac.doFinal();
            int length = bArr5.length;
            int i14 = i13 + length;
            if (i14 >= i10) {
                System.arraycopy(bArr5, 0, bArr4, i13, i10 - i13);
                return bArr4;
            }
            System.arraycopy(bArr5, 0, bArr4, i13, length);
            i12++;
            i13 = i14;
        }
    }
}
