package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.lw  reason: invalid package */
/* loaded from: classes.dex */
public final class lw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f4971a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f4972b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lw(rx rxVar, g gVar) {
        this.f4972b = rxVar;
        this.f4971a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4971a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        q3 q3Var = (q3) obj;
        this.f4972b.q(new j2(q3Var.d(), q3Var.b(), Long.valueOf(q3Var.a()), "Bearer"), null, null, Boolean.valueOf(q3Var.f()), null, this.f4971a, this);
    }
}
