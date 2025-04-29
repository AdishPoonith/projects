package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zw  reason: invalid package */
/* loaded from: classes.dex */
public final class zw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f5797a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f5798b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t1 f5799c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zw(rx rxVar, t1 t1Var, g gVar) {
        this.f5798b = rxVar;
        this.f5799c = t1Var;
        this.f5797a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5797a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        p0 p0Var;
        this.f5799c.b(((j2) obj).E());
        p0Var = this.f5798b.f5309a;
        p0Var.s(this.f5799c, new yw(this));
    }
}
