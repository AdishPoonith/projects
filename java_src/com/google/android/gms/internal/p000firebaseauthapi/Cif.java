package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.if  reason: invalid class name and invalid package */
/* loaded from: classes.dex */
final class Cif extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ jf f4750b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(jf jfVar, Class cls) {
        super(cls);
        this.f4750b = jfVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        mt mtVar = (mt) w6Var;
        it D = jt.D();
        D.s(0);
        byte[] a10 = bv.a(32);
        D.r(m4.w(a10, 0, a10.length));
        return (jt) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return mt.E(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new fj(mt.D(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new fj(mt.D(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ void d(w6 w6Var) {
        mt mtVar = (mt) w6Var;
    }
}
