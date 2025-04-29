package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ax  reason: invalid package */
/* loaded from: classes.dex */
public final class ax implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f4362a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f4363b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ax(rx rxVar, g gVar) {
        this.f4363b = rxVar;
        this.f4362a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4362a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        s1 s1Var = (s1) obj;
        this.f4363b.q(new j2(s1Var.b(), s1Var.a(), Long.valueOf(l2.a(s1Var.a())), "Bearer"), null, null, Boolean.FALSE, null, this.f4362a, this);
    }
}
