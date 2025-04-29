package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yv  reason: invalid package */
/* loaded from: classes.dex */
public final class yv implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f5728a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f5729b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yv(rx rxVar, g gVar) {
        this.f5729b = rxVar;
        this.f5728a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5728a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        o3 o3Var = (o3) obj;
        if (o3Var.f()) {
            this.f5728a.f(new wv(o3Var.c(), o3Var.e(), null));
            return;
        }
        this.f5729b.q(new j2(o3Var.d(), o3Var.b(), Long.valueOf(o3Var.a()), "Bearer"), null, null, Boolean.FALSE, null, this.f5728a, this);
    }
}
