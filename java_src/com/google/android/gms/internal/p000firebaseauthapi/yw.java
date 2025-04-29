package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yw  reason: invalid package */
/* loaded from: classes.dex */
final class yw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zw f5730a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yw(zw zwVar) {
        this.f5730a = zwVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5730a.f5797a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        r1 r1Var = (r1) obj;
        j2 j2Var = new j2(r1Var.b(), r1Var.a(), Long.valueOf(l2.a(r1Var.a())), "Bearer");
        zw zwVar = this.f5730a;
        zwVar.f5798b.q(j2Var, null, null, Boolean.FALSE, null, zwVar.f5797a, this);
    }
}
