package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wb  reason: invalid package */
/* loaded from: classes.dex */
final class wb extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ xb f5591b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(xb xbVar, Class cls) {
        super(cls);
        this.f5591b = xbVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        yn ynVar = (yn) w6Var;
        new lc();
        bo g10 = kc.g(ynVar.F());
        w6 a10 = new dm().a().a(ynVar.G());
        un D = vn.D();
        D.r(g10);
        D.s((vq) a10);
        D.t(0);
        return (vn) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return yn.E(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", xb.k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", xb.k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", xb.k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", xb.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ void d(w6 w6Var) {
        yn ynVar = (yn) w6Var;
        ((kc) new lc().a()).d(ynVar.F());
        new dm().a().d(ynVar.G());
        dv.b(ynVar.F().C());
    }
}
