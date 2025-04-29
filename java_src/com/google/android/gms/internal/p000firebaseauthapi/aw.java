package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.aw  reason: invalid package */
/* loaded from: classes.dex */
public final class aw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f4360a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ rx f4361b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aw(rx rxVar, g gVar) {
        this.f4361b = rxVar;
        this.f4360a = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4360a.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        q1 q1Var = (q1) obj;
        if (q1Var.f()) {
            this.f4360a.f(new wv(q1Var.c(), q1Var.e(), null));
            return;
        }
        this.f4361b.q(new j2(q1Var.d(), q1Var.b(), Long.valueOf(q1Var.a()), "Bearer"), null, null, Boolean.valueOf(q1Var.g()), null, this.f4360a, this);
    }
}
