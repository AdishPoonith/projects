package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hh  reason: invalid package */
/* loaded from: classes.dex */
final class hh extends hj {
    public hh() {
        super(iq.class, new gh(z9.class));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return iq.H(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        iq iqVar = (iq) w6Var;
        dv.c(iqVar.C(), 0);
        oh.a(iqVar.D());
    }
}
