package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sh  reason: invalid package */
/* loaded from: classes.dex */
final class sh {

    /* renamed from: a  reason: collision with root package name */
    private final String f5346a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sh(String str) {
        this.f5346a = str;
    }

    private final byte[] f(byte[] bArr, byte[] bArr2, int i10) {
        Mac mac = (Mac) lu.f4964c.a(this.f5346a);
        if (i10 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i10];
        mac.init(new SecretKeySpec(bArr, this.f5346a));
        byte[] bArr4 = new byte[0];
        int i11 = 1;
        int i12 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) i11);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int i13 = i12 + length;
            if (i13 >= i10) {
                System.arraycopy(bArr4, 0, bArr3, i12, i10 - i12);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, i12, length);
            i11++;
            i12 = i13;
        }
    }

    private final byte[] g(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) lu.f4964c.a(this.f5346a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f5346a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f5346a));
        }
        return mac.doFinal(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return Mac.getInstance(this.f5346a).getMacLength();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i10) {
        return f(g(gi.e("eae_prk", bArr2, bArr4), null), gi.f("shared_secret", bArr3, bArr4, i10), i10);
    }

    public final byte[] c() {
        char c10;
        String str = this.f5346a;
        int hashCode = str.hashCode();
        if (hashCode == 984523022) {
            if (str.equals("HmacSha256")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 984524074) {
            if (hashCode == 984525777 && str.equals("HmacSha512")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("HmacSha384")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    return gi.f4635h;
                }
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
            }
            return gi.f4634g;
        }
        return gi.f4633f;
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i10) {
        return f(bArr, gi.f(str, bArr2, bArr3, i10), i10);
    }

    public final byte[] e(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return g(gi.e(str, bArr2, bArr3), bArr);
    }
}
