package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tw  reason: invalid package */
/* loaded from: classes.dex */
public final class tw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5402a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f5403b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ rx f5404c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tw(rx rxVar, String str, g gVar) {
        this.f5404c = rxVar;
        this.f5402a = str;
        this.f5403b = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5403b.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        p0 p0Var;
        j2 j2Var = (j2) obj;
        x1 x1Var = new x1(j2Var.E());
        p0Var = this.f5404c.f5309a;
        p0Var.e(x1Var, new sw(this, this, j2Var));
    }
}
