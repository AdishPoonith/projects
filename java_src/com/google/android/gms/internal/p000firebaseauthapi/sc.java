package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sc  reason: invalid package */
/* loaded from: classes.dex */
final class sc extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ tc f5343b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(tc tcVar, Class cls) {
        super(cls);
        this.f5343b = tcVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        oo ooVar = (oo) w6Var;
        ko D = lo.D();
        byte[] a10 = bv.a(ooVar.C());
        D.r(m4.w(a10, 0, a10.length));
        D.s(ooVar.G());
        D.t(0);
        return (lo) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return oo.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", tc.k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", tc.k(16, 16, 3));
        hashMap.put("AES256_EAX", tc.k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", tc.k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ void d(w6 w6Var) {
        oo ooVar = (oo) w6Var;
        dv.b(ooVar.C());
        if (ooVar.G().C() != 12 && ooVar.G().C() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
