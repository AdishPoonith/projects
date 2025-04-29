package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.be  reason: invalid package */
/* loaded from: classes.dex */
final class be extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ce f4398b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ce ceVar, Class cls) {
        super(cls);
        this.f4398b = ceVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        zo D = ap.D();
        byte[] a10 = bv.a(((ep) w6Var).C());
        D.r(m4.w(a10, 0, a10.length));
        D.s(0);
        return (ap) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return ep.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", ce.l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", ce.l(16, 3));
        hashMap.put("AES256_GCM_SIV", ce.l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", ce.l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ void d(w6 w6Var) {
        dv.b(((ep) w6Var).C());
    }
}
