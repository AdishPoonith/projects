package com.google.android.gms.internal.p000firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kd  reason: invalid package */
/* loaded from: classes.dex */
public final class kd extends hj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public kd() {
        super(uo.class, new id(s9.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ fj k(int i10, int i11) {
        wo D = xo.D();
        D.r(i10);
        return new fj((xo) D.j(), i11);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new jd(this, xo.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return uo.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        uo uoVar = (uo) w6Var;
        dv.c(uoVar.C(), 0);
        dv.b(uoVar.G().k());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final int f() {
        return 2;
    }
}
