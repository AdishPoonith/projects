package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.qw  reason: invalid package */
/* loaded from: classes.dex */
public final class qw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i3 f5271a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f5272b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ rx f5273c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qw(rx rxVar, i3 i3Var, g gVar) {
        this.f5273c = rxVar;
        this.f5271a = i3Var;
        this.f5272b = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5272b.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        p0 p0Var;
        this.f5271a.D(true);
        this.f5271a.C(((j2) obj).E());
        p0Var = this.f5273c.f5309a;
        p0Var.n(this.f5271a, new pw(this, this));
    }
}
