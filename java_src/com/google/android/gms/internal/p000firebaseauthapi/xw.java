package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xw  reason: invalid package */
/* loaded from: classes.dex */
public final class xw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f5681a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f5682b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xw(rx rxVar, g gVar) {
        this.f5682b = rxVar;
        this.f5681a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5681a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        m3 m3Var = (m3) obj;
        this.f5682b.q(new j2(m3Var.c(), m3Var.b(), Long.valueOf(m3Var.a()), "Bearer"), null, null, Boolean.valueOf(m3Var.d()), null, this.f5681a, this);
    }
}
