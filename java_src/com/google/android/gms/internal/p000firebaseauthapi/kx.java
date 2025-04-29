package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.kx  reason: invalid package */
/* loaded from: classes.dex */
public final class kx implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f4895a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f4896b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kx(rx rxVar, g gVar) {
        this.f4896b = rxVar;
        this.f4895a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4895a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        k3 k3Var = (k3) obj;
        if (k3Var.l()) {
            this.f4895a.f(new wv(k3Var.f(), k3Var.k(), k3Var.b()));
        } else {
            rx.v(this.f4896b, k3Var, this.f4895a, this);
        }
    }
}
