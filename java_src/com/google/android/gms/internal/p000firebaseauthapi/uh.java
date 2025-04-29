package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.uh  reason: invalid package */
/* loaded from: classes.dex */
final class uh {

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f5449g = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final th f5450a;

    /* renamed from: b  reason: collision with root package name */
    private final BigInteger f5451b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f5452c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f5453d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f5454e;

    /* renamed from: f  reason: collision with root package name */
    private BigInteger f5455f = BigInteger.ZERO;

    private uh(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, th thVar) {
        this.f5454e = bArr;
        this.f5452c = bArr2;
        this.f5453d = bArr3;
        this.f5451b = bigInteger;
        this.f5450a = thVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static uh b(byte[] bArr, byte[] bArr2, yh yhVar, sh shVar, th thVar, byte[] bArr3) {
        byte[] b10 = gi.b(yhVar.zzb(), shVar.c(), thVar.zzb());
        byte[] bArr4 = gi.f4639l;
        byte[] bArr5 = f5449g;
        byte[] b11 = ut.b(gi.f4628a, shVar.e(bArr4, bArr5, "psk_id_hash", b10), shVar.e(bArr4, bArr3, "info_hash", b10));
        byte[] e10 = shVar.e(bArr2, bArr5, "secret", b10);
        byte[] d10 = shVar.d(e10, b11, "key", b10, thVar.zza());
        byte[] d11 = shVar.d(e10, b11, "base_nonce", b10, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new uh(bArr, d10, d11, bigInteger.shiftLeft(96).subtract(bigInteger), thVar);
    }

    private final synchronized byte[] c() {
        byte[] c10;
        byte[] bArr = this.f5453d;
        BigInteger bigInteger = this.f5455f;
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] != 0) {
                throw new GeneralSecurityException("integer too large");
            } else {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            }
        }
        c10 = ut.c(bArr, byteArray);
        if (this.f5455f.compareTo(this.f5451b) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f5455f = this.f5455f.add(BigInteger.ONE);
        return c10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f5450a.a(this.f5452c, c(), bArr, bArr2);
    }
}
