package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.oh  reason: invalid package */
/* loaded from: classes.dex */
final class oh {
    public static void a(bq bqVar) {
        bu.i(c(bqVar.G().H()));
        b(bqVar.G().I());
        if (bqVar.J() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        gb.b(bqVar.C().F());
    }

    public static String b(int i10) {
        int i11 = i10 - 2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return "HmacSha224";
                        }
                        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(sq.a(i10))));
                    }
                    return "HmacSha512";
                }
                return "HmacSha256";
            }
            return "HmacSha384";
        }
        return "HmacSha1";
    }

    public static int c(int i10) {
        int i11 = i10 - 2;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(nq.a(i10))));
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i10) {
        int i11 = i10 - 2;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2) {
                if (i11 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(sp.a(i10))));
            }
        }
        return i12;
    }
}
