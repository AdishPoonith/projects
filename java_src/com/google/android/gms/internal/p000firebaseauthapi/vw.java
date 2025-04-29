package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.vw  reason: invalid package */
/* loaded from: classes.dex */
public final class vw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5552a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5553b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f5554c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ rx f5555d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public vw(rx rxVar, String str, String str2, g gVar) {
        this.f5555d = rxVar;
        this.f5552a = str;
        this.f5553b = str2;
        this.f5554c = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5554c.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        p0 p0Var;
        r3 r3Var = new r3(((j2) obj).E(), this.f5552a, this.f5553b);
        p0Var = this.f5555d.f5309a;
        p0Var.r(r3Var, new uw(this));
    }
}
