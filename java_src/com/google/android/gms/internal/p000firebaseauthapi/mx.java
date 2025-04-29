package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
import com.google.firebase.auth.z0;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mx  reason: invalid package */
/* loaded from: classes.dex */
public final class mx implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z0 f5036a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f5037b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ rx f5038c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mx(rx rxVar, z0 z0Var, g gVar) {
        this.f5038c = rxVar;
        this.f5036a = z0Var;
        this.f5037b = gVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5037b.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        j2 j2Var = (j2) obj;
        v2 v2Var = new v2();
        v2Var.d(j2Var.E());
        if (this.f5036a.C() || this.f5036a.x() != null) {
            v2Var.b(this.f5036a.x());
        }
        if (this.f5036a.D() || this.f5036a.B() != null) {
            v2Var.g(this.f5036a.zza());
        }
        rx.w(this.f5038c, this.f5037b, j2Var, v2Var, this);
    }
}
