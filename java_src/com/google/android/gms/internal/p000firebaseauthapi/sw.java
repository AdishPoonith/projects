package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.sw  reason: invalid package */
/* loaded from: classes.dex */
final class sw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f5353a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j2 f5354b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ tw f5355c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public sw(tw twVar, o0 o0Var, j2 j2Var) {
        this.f5355c = twVar;
        this.f5353a = o0Var;
        this.f5354b = j2Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5355c.f5403b.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List a10 = ((y1) obj).a();
        if (a10 == null || a10.isEmpty()) {
            this.f5353a.zza("No users.");
            return;
        }
        z1 z1Var = (z1) a10.get(0);
        v2 v2Var = new v2();
        v2Var.d(this.f5354b.E());
        v2Var.a(this.f5355c.f5402a);
        tw twVar = this.f5355c;
        rx.x(twVar.f5404c, twVar.f5403b, this.f5354b, z1Var, v2Var, this.f5353a);
    }
}
