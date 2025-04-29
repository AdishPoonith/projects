package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mw  reason: invalid package */
/* loaded from: classes.dex */
public final class mw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5032a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5033b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f5034c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ rx f5035d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mw(rx rxVar, String str, String str2, g gVar) {
        this.f5035d = rxVar;
        this.f5032a = str;
        this.f5033b = str2;
        this.f5034c = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5034c.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        j2 j2Var = (j2) obj;
        v2 v2Var = new v2();
        v2Var.d(j2Var.E());
        v2Var.c(this.f5032a);
        v2Var.f(this.f5033b);
        rx.w(this.f5035d, this.f5034c, j2Var, v2Var, this);
    }
}
