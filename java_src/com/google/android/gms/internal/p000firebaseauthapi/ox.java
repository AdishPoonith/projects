package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ox  reason: invalid package */
/* loaded from: classes.dex */
public final class ox implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5155a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f5156b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ rx f5157c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ox(rx rxVar, String str, g gVar) {
        this.f5157c = rxVar;
        this.f5155a = str;
        this.f5156b = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5156b.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        j2 j2Var = (j2) obj;
        String E = j2Var.E();
        v2 v2Var = new v2();
        v2Var.d(E);
        v2Var.f(this.f5155a);
        rx.w(this.f5157c, this.f5156b, j2Var, v2Var, this);
    }
}
