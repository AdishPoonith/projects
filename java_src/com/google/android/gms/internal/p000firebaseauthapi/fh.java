package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fh  reason: invalid package */
/* loaded from: classes.dex */
public final class fh extends lk {

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f4585e = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public fh() {
        super(fq.class, iq.class, new dh(y9.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ fj m(int i10, int i11, int i12, ja jaVar, byte[] bArr, int i13) {
        xp C = yp.C();
        kq C2 = lq.C();
        C2.s(4);
        C2.t(5);
        C2.r(m4.w(bArr, 0, 0));
        lq lqVar = (lq) C2.j();
        zr C3 = as.C();
        C3.s(jaVar.b());
        byte[] c10 = jaVar.c();
        C3.t(m4.w(c10, 0, c10.length));
        int d10 = jaVar.d() - 1;
        C3.r(d10 != 0 ? d10 != 1 ? d10 != 2 ? ct.CRUNCHY : ct.RAW : ct.LEGACY : ct.TINK);
        up C4 = vp.C();
        C4.r((as) C3.j());
        aq D = bq.D();
        D.s(lqVar);
        D.r((vp) C4.j());
        D.t(i12);
        C.r((bq) D.j());
        return new fj((yp) C.j(), i13);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new eh(this, yp.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return fq.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        fq fqVar = (fq) w6Var;
        if (fqVar.H().y()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        dv.c(fqVar.C(), 0);
        oh.a(fqVar.G().D());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lk
    public final /* synthetic */ w6 k(w6 w6Var) {
        return ((fq) w6Var).G();
    }
}
