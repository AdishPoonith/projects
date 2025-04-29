package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.jd  reason: invalid package */
/* loaded from: classes.dex */
final class jd extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ kd f4813b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(kd kdVar, Class cls) {
        super(cls);
        this.f4813b = kdVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        to D = uo.D();
        byte[] a10 = bv.a(((xo) w6Var).C());
        D.r(m4.w(a10, 0, a10.length));
        D.s(0);
        return (uo) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return xo.F(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", kd.k(16, 1));
        hashMap.put("AES128_GCM_RAW", kd.k(16, 3));
        hashMap.put("AES256_GCM", kd.k(32, 1));
        hashMap.put("AES256_GCM_RAW", kd.k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ void d(w6 w6Var) {
        dv.b(((xo) w6Var).C());
    }
}
