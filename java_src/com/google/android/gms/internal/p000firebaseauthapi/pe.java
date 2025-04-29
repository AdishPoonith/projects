package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.pe  reason: invalid package */
/* loaded from: classes.dex */
final class pe extends gj {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ qe f5184b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(qe qeVar, Class cls) {
        super(cls);
        this.f5184b = qeVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ w6 a(w6 w6Var) {
        qp qpVar = (qp) w6Var;
        mp D = np.D();
        D.s(0);
        byte[] a10 = bv.a(32);
        D.r(m4.w(a10, 0, a10.length));
        return (np) D.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* synthetic */ w6 b(m4 m4Var) {
        return qp.E(m4Var, e5.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new fj(qp.D(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new fj(qp.D(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gj
    public final /* bridge */ /* synthetic */ void d(w6 w6Var) {
        qp qpVar = (qp) w6Var;
    }
}
