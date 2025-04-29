package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nx  reason: invalid package */
/* loaded from: classes.dex */
public final class nx implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5085a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f5086b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ rx f5087c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nx(rx rxVar, String str, g gVar) {
        this.f5087c = rxVar;
        this.f5085a = str;
        this.f5086b = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5086b.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        j2 j2Var = (j2) obj;
        v2 v2Var = new v2();
        v2Var.d(j2Var.E());
        v2Var.c(this.f5085a);
        rx.w(this.f5087c, this.f5086b, j2Var, v2Var, this);
    }
}
