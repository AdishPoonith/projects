package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gh  reason: invalid package */
/* loaded from: classes.dex */
final class gh extends fk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public gh(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.fk
    public final /* bridge */ /* synthetic */ Object a(w6 w6Var) {
        iq iqVar = (iq) w6Var;
        bq D = iqVar.D();
        lq G = D.G();
        int c10 = oh.c(G.H());
        byte[] z10 = iqVar.I().z();
        byte[] z11 = iqVar.J().z();
        ECParameterSpec i10 = bu.i(c10);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, z10), new BigInteger(1, z11));
        ui.b(eCPoint, i10.getCurve());
        return new yt((ECPublicKey) ((KeyFactory) lu.f4969h.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, i10)), G.F().z(), oh.b(G.I()), oh.d(D.J()), new ph(D.C().F()));
    }
}
