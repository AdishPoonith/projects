package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidKeyException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mg  reason: invalid package */
/* loaded from: classes.dex */
public final class mg extends hj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mg() {
        super(hp.class, new kg(x9.class));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new lg(this, kp.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return hp.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        hp hpVar = (hp) w6Var;
        dv.c(hpVar.C(), 0);
        if (hpVar.G().k() == 64) {
            return;
        }
        int k10 = hpVar.G().k();
        throw new InvalidKeyException("invalid key size: " + k10 + ". Valid keys must have 64 bytes.");
    }
}
