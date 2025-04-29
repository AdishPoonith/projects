package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tc  reason: invalid package */
/* loaded from: classes.dex */
public final class tc extends hj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public tc() {
        super(lo.class, new qc(s9.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ fj k(int i10, int i11, int i12) {
        no D = oo.D();
        D.r(i10);
        qo D2 = ro.D();
        D2.r(16);
        D.s((ro) D2.j());
        return new fj((oo) D.j(), i12);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new sc(this, oo.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return lo.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        lo loVar = (lo) w6Var;
        dv.c(loVar.C(), 0);
        dv.b(loVar.H().k());
        if (loVar.G().C() != 12 && loVar.G().C() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
