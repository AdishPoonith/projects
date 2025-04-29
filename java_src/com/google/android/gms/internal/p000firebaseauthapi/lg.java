package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lg  reason: invalid package */
/* loaded from: classes.dex */
final class lg extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ mg f4953b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg(mg mgVar, Class cls) {
        super(cls);
        this.f4953b = mgVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        gp D = hp.D();
        byte[] a10 = bv.a(((kp) w6Var).C());
        D.r(m4.w(a10, 0, a10.length));
        D.s(0);
        return (hp) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return kp.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        jp D = kp.D();
        D.r(64);
        hashMap.put("AES256_SIV", new fj((kp) D.j(), 1));
        jp D2 = kp.D();
        D2.r(64);
        hashMap.put("AES256_SIV_RAW", new fj((kp) D2.j(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ void d(w6 w6Var) {
        kp kpVar = (kp) w6Var;
        if (kpVar.C() == 64) {
            return;
        }
        int C = kpVar.C();
        throw new InvalidAlgorithmParameterException("invalid key size: " + C + ". Valid keys must have 64 bytes.");
    }
}
