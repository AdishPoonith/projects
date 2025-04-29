package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hx  reason: invalid package */
/* loaded from: classes.dex */
public final class hx implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f4704a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f4705b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hx(rx rxVar, g gVar) {
        this.f4705b = rxVar;
        this.f4704a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4704a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        p0 p0Var;
        o1 o1Var = new o1(((j2) obj).E());
        p0Var = this.f4705b.f5309a;
        p0Var.b(o1Var, new gx(this, this));
    }
}
