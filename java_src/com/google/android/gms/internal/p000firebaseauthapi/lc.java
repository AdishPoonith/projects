package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lc  reason: invalid package */
/* loaded from: classes.dex */
public final class lc extends hj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public lc() {
        super(bo.class, new jc(vu.class));
    }

    public static final void l(bo boVar) {
        dv.c(boVar.C(), 0);
        dv.b(boVar.I().k());
        m(boVar.H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(io ioVar) {
        if (ioVar.C() < 12 || ioVar.C() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final gj a() {
        return new kc(this, fo.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final ur b() {
        return ur.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* synthetic */ w6 c(m4 m4Var) {
        return bo.G(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hj
    public final /* bridge */ /* synthetic */ void e(w6 w6Var) {
        l((bo) w6Var);
    }
}
