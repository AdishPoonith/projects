package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.gl  reason: invalid package */
/* loaded from: classes.dex */
public final class gl extends hj {

    /* renamed from: d  reason: collision with root package name */
    private static final ek f4646d = ek.b(new ck() { // from class: com.google.android.gms.internal.firebase-auth-api.dl
        @Override // com.google.android.gms.internal.p000firebaseauthapi.ck
        public final Object a(aa aaVar) {
            return new wm((cl) aaVar);
        }
    }, cl.class, rl.class);

    gl() {
        super(mn.class, new el(ta.class));
    }

    public static void m(boolean z10) {
        gb.i(new gl(), true);
        int i10 = ql.f5269f;
        ql.a(rj.b());
        qj.a().e(f4646d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(sn snVar) {
        if (snVar.C() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (snVar.C() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(int i10) {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new fl(this, pn.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return mn.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        mn mnVar = (mn) w6Var;
        dv.c(mnVar.C(), 0);
        o(mnVar.H().k());
        n(mnVar.G());
    }
}
