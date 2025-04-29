package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.eb  reason: invalid package */
/* loaded from: classes.dex */
final class eb extends da implements db {

    /* renamed from: c  reason: collision with root package name */
    private final lk f4542c;

    /* renamed from: d  reason: collision with root package name */
    private final hj f4543d;

    public eb(lk lkVar, hj hjVar, Class cls) {
        super(lkVar, cls);
        this.f4542c = lkVar;
        this.f4543d = hjVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.db
    public final vr a(m4 m4Var) {
        try {
            w6 c10 = this.f4542c.c(m4Var);
            this.f4542c.e(c10);
            w6 k10 = this.f4542c.k(c10);
            this.f4543d.e(k10);
            sr C = vr.C();
            C.s(this.f4543d.d());
            C.t(k10.zzo());
            C.r(this.f4543d.b());
            return (vr) C.j();
        } catch (z5 e10) {
            throw new GeneralSecurityException("expected serialized proto of type ", e10);
        }
    }
}
