package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.di  reason: invalid package */
/* loaded from: classes.dex */
public final class di extends lk {
    public di() {
        super(nr.class, qr.class, new bi(y9.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ fj l(int i10, int i11, int i12, int i13) {
        jr C = kr.C();
        C.t(i10);
        C.s(i11);
        C.r(i12);
        gr C2 = hr.C();
        C2.r((kr) C.j());
        return new fj((hr) C2.j(), i13);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new ci(this, hr.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return nr.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        nr nrVar = (nr) w6Var;
        if (nrVar.H().y()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!nrVar.L()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        dv.c(nrVar.C(), 0);
        gi.a(nrVar.G().D());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lk
    public final /* synthetic */ w6 k(w6 w6Var) {
        return ((nr) w6Var).G();
    }
}
