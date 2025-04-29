package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gi  reason: invalid package */
/* loaded from: classes.dex */
public final class gi {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4628a = c(1, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f4629b = c(2, 32);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4630c = c(2, 16);

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f4631d = c(2, 17);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f4632e = c(2, 18);

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f4633f = c(2, 1);

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f4634g = c(2, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f4635h = c(2, 3);

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f4636i = c(2, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f4637j = c(2, 2);

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f4638k = c(2, 3);

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f4639l = new byte[0];

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f4640m;

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f4641n;

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f4642o;

    static {
        Charset charset = xk.f5668a;
        f4640m = "KEM".getBytes(charset);
        f4641n = "HPKE".getBytes(charset);
        f4642o = "HPKE-v1".getBytes(charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(kr krVar) {
        if (krVar.H() == 2 || krVar.H() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(dr.a(krVar.H())));
        }
        String str = "UNRECOGNIZED";
        if (krVar.G() == 2 || krVar.G() == 1) {
            int G = krVar.G();
            if (G == 2) {
                str = "KDF_UNKNOWN";
            } else if (G == 3) {
                str = "HKDF_SHA256";
            } else if (G == 4) {
                str = "HKDF_SHA384";
            } else if (G == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (krVar.F() == 2 || krVar.F() == 1) {
            int F = krVar.F();
            if (F == 2) {
                str = "AEAD_UNKNOWN";
            } else if (F == 3) {
                str = "AES_128_GCM";
            } else if (F == 4) {
                str = "AES_256_GCM";
            } else if (F == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return ut.b(f4641n, bArr, bArr2, bArr3);
    }

    public static byte[] c(int i10, int i11) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) ((i11 >> (((i10 - i12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] d(byte[] bArr) {
        return ut.b(f4640m, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] e(String str, byte[] bArr, byte[] bArr2) {
        return ut.b(f4642o, bArr2, str.getBytes(xk.f5668a), bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] f(String str, byte[] bArr, byte[] bArr2, int i10) {
        return ut.b(c(2, i10), f4642o, bArr2, str.getBytes(xk.f5668a), bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i10) {
        int i11 = i10 - 2;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
            }
            return 2;
        }
        return 1;
    }
}
