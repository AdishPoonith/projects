package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fx  reason: invalid package */
/* loaded from: classes.dex */
public final class fx implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f4595a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f4596b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fx(rx rxVar, g gVar) {
        this.f4596b = rxVar;
        this.f4595a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4595a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        p0 p0Var;
        j2 j2Var = (j2) obj;
        x1 x1Var = new x1(j2Var.E());
        p0Var = this.f4596b.f5309a;
        p0Var.e(x1Var, new ex(this, this, j2Var));
    }
}
