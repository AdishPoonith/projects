package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rw  reason: invalid package */
/* loaded from: classes.dex */
public final class rw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f5307a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f5308b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rw(rx rxVar, g gVar) {
        this.f5308b = rxVar;
        this.f5307a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5307a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        j2 j2Var = (j2) obj;
        v2 v2Var = new v2();
        v2Var.d(j2Var.E());
        v2Var.c(null);
        v2Var.f(null);
        rx.w(this.f5308b, this.f5307a, j2Var, v2Var, this);
    }
}
