package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
import com.google.firebase.auth.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zv  reason: invalid package */
/* loaded from: classes.dex */
public final class zv implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f5793a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f5794b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f5795c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ rx f5796d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zv(rx rxVar, j jVar, String str, g gVar) {
        this.f5796d = rxVar;
        this.f5793a = jVar;
        this.f5794b = str;
        this.f5795c = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5795c.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f5796d.p(new p1(this.f5793a, ((j2) obj).E(), this.f5794b), this.f5795c);
    }
}
