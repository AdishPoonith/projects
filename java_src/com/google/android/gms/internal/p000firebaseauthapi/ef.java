package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ef  reason: invalid package */
/* loaded from: classes.dex */
final class ef extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ff f4547b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(ff ffVar, Class cls) {
        super(cls);
        this.f4547b = ffVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        ws D = xs.D();
        D.r((at) w6Var);
        D.s(0);
        return (xs) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return at.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ void d(w6 w6Var) {
        at atVar = (at) w6Var;
        if (atVar.G().isEmpty() || !atVar.H()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
