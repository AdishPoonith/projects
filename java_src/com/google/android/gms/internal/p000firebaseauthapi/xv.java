package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xv  reason: invalid package */
/* loaded from: classes.dex */
public final class xv implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f5679a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f5680b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xv(rx rxVar, g gVar) {
        this.f5680b = rxVar;
        this.f5679a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5679a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        y2 y2Var = (y2) obj;
        this.f5680b.q(new j2(y2Var.c(), y2Var.b(), Long.valueOf(y2Var.a()), "Bearer"), null, null, Boolean.TRUE, null, this.f5679a, this);
    }
}
