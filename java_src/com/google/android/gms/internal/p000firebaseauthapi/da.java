package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.da  reason: invalid package */
/* loaded from: classes.dex */
class da implements ba {

    /* renamed from: a  reason: collision with root package name */
    private final hj f4489a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f4490b;

    public da(hj hjVar, Class cls) {
        if (!hjVar.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", hjVar.toString(), cls.getName()));
        }
        this.f4489a = hjVar;
        this.f4490b = cls;
    }

    private final ca f() {
        return new ca(this.f4489a.a());
    }

    private final Object g(w6 w6Var) {
        if (Void.class.equals(this.f4490b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f4489a.e(w6Var);
        return this.f4489a.i(w6Var, this.f4490b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ba
    public final w6 b(m4 m4Var) {
        try {
            return f().a(m4Var);
        } catch (z5 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f4489a.a().e().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ba
    public final vr c(m4 m4Var) {
        try {
            w6 a10 = f().a(m4Var);
            sr C = vr.C();
            C.s(this.f4489a.d());
            C.t(a10.zzo());
            C.r(this.f4489a.b());
            return (vr) C.j();
        } catch (z5 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ba
    public final Object d(w6 w6Var) {
        String name = this.f4489a.h().getName();
        if (this.f4489a.h().isInstance(w6Var)) {
            return g(w6Var);
        }
        throw new GeneralSecurityException("Expected proto of type ".concat(name));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ba
    public final Object e(m4 m4Var) {
        try {
            return g(this.f4489a.c(m4Var));
        } catch (z5 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f4489a.h().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ba
    public final String zze() {
        return this.f4489a.d();
    }
}
