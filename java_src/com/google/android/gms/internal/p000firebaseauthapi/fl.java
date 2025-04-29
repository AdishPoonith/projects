package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fl  reason: invalid package */
/* loaded from: classes.dex */
final class fl extends gj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public fl(gl glVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        pn pnVar = (pn) w6Var;
        ln D = mn.D();
        D.t(0);
        byte[] a10 = bv.a(pnVar.C());
        D.r(m4.w(a10, 0, a10.length));
        D.s(pnVar.G());
        return (mn) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return pn.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        on D = pn.D();
        D.r(32);
        rn D2 = sn.D();
        D2.r(16);
        D.s((sn) D2.j());
        hashMap.put("AES_CMAC", new fj((pn) D.j(), 1));
        on D3 = pn.D();
        D3.r(32);
        rn D4 = sn.D();
        D4.r(16);
        D3.s((sn) D4.j());
        hashMap.put("AES256_CMAC", new fj((pn) D3.j(), 1));
        on D5 = pn.D();
        D5.r(32);
        rn D6 = sn.D();
        D6.r(16);
        D5.s((sn) D6.j());
        hashMap.put("AES256_CMAC_RAW", new fj((pn) D5.j(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ void d(w6 w6Var) {
        pn pnVar = (pn) w6Var;
        gl.n(pnVar.G());
        gl.o(pnVar.C());
    }
}
