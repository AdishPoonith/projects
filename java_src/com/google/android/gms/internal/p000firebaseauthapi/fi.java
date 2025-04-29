package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fi  reason: invalid package */
/* loaded from: classes.dex */
public final class fi extends hj {
    public fi() {
        super(qr.class, new ei(z9.class));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return qr.H(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        qr qrVar = (qr) w6Var;
        dv.c(qrVar.C(), 0);
        if (!qrVar.M()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        gi.a(qrVar.D());
    }
}
