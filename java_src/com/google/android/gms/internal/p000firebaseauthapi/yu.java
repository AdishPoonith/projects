package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yu  reason: invalid package */
/* loaded from: classes.dex */
public final class yu implements jn {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal f5724a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5725b;

    /* renamed from: c  reason: collision with root package name */
    private final Key f5726c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5727d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public yu(String str, Key key) {
        char c10;
        int i10;
        xu xuVar = new xu(this);
        this.f5724a = xuVar;
        if (!eg.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f5725b = str;
        this.f5726c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            i10 = 20;
        } else if (c10 == 1) {
            i10 = 28;
        } else if (c10 == 2) {
            i10 = 32;
        } else if (c10 == 3) {
            i10 = 48;
        } else if (c10 != 4) {
            throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        } else {
            i10 = 64;
        }
        this.f5727d = i10;
        xuVar.get();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.jn
    public final byte[] a(byte[] bArr, int i10) {
        if (i10 <= this.f5727d) {
            ((Mac) this.f5724a.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.f5724a.get()).doFinal(), i10);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
