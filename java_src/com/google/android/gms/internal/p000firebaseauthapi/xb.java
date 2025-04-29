package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xb  reason: invalid package */
/* loaded from: classes.dex */
public final class xb extends hj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public xb() {
        super(vn.class, new vb(s9.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ fj k(int i10, int i11, int i12, int i13, int i14, int i15) {
        eo D = fo.D();
        ho D2 = io.D();
        D2.r(16);
        D.s((io) D2.j());
        D.r(i10);
        xq D3 = yq.D();
        ar D4 = br.D();
        D4.s(5);
        D4.r(i13);
        D3.s((br) D4.j());
        D3.r(32);
        xn C = yn.C();
        C.r((fo) D.j());
        C.s((yq) D3.j());
        return new fj((yn) C.j(), i15);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new wb(this, yn.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return vn.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        vn vnVar = (vn) w6Var;
        dv.c(vnVar.C(), 0);
        new lc();
        lc.l(vnVar.G());
        new dm();
        dm.m(vnVar.H());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final int f() {
        return 2;
    }
}
