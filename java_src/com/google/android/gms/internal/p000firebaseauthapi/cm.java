package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.cm  reason: invalid package */
/* loaded from: classes.dex */
final class cm extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ dm f4457b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(dm dmVar, Class cls) {
        super(cls);
        this.f4457b = dmVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        yq yqVar = (yq) w6Var;
        uq D = vq.D();
        D.t(0);
        D.s(yqVar.H());
        byte[] a10 = bv.a(yqVar.C());
        D.r(m4.w(a10, 0, a10.length));
        return (vq) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return yq.G(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", dm.n(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", dm.n(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", dm.n(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", dm.n(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", dm.n(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", dm.n(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", dm.n(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", dm.n(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", dm.n(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", dm.n(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ void d(w6 w6Var) {
        yq yqVar = (yq) w6Var;
        if (yqVar.C() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        dm.o(yqVar.H());
    }
}
