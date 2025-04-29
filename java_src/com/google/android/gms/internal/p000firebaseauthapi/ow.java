package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ow  reason: invalid package */
/* loaded from: classes.dex */
public final class ow implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p3 f5152a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f5153b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ rx f5154c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ow(rx rxVar, p3 p3Var, g gVar) {
        this.f5154c = rxVar;
        this.f5152a = p3Var;
        this.f5153b = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5153b.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        p0 p0Var;
        this.f5152a.c(((j2) obj).E());
        p0Var = this.f5154c.f5309a;
        p0Var.q(this.f5152a, new nw(this, this));
    }
}
