package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bm  reason: invalid package */
/* loaded from: classes.dex */
final class bm extends fk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bm(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.fk
    public final /* bridge */ /* synthetic */ Object a(w6 w6Var) {
        vq vqVar = (vq) w6Var;
        int H = vqVar.H().H();
        SecretKeySpec secretKeySpec = new SecretKeySpec(vqVar.I().z(), "HMAC");
        int C = vqVar.H().C();
        int i10 = H - 2;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return new zu(new yu("HMACSHA224", secretKeySpec), C);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zu(new yu("HMACSHA512", secretKeySpec), C);
                }
                return new zu(new yu("HMACSHA256", secretKeySpec), C);
            }
            return new zu(new yu("HMACSHA384", secretKeySpec), C);
        }
        return new zu(new yu("HMACSHA1", secretKeySpec), C);
    }
}
