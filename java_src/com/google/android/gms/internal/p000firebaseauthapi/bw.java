package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.bw  reason: invalid package */
/* loaded from: classes.dex */
public final class bw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n0 f4406a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f4407b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j2 f4408c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ v2 f4409d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ rx f4410e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bw(rx rxVar, n0 n0Var, g gVar, j2 j2Var, v2 v2Var) {
        this.f4410e = rxVar;
        this.f4406a = n0Var;
        this.f4407b = gVar;
        this.f4408c = j2Var;
        this.f4409d = v2Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4406a.zza(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List a10 = ((y1) obj).a();
        if (a10 == null || a10.isEmpty()) {
            this.f4406a.zza("No users");
        } else {
            rx.x(this.f4410e, this.f4407b, this.f4408c, (z1) a10.get(0), this.f4409d, this.f4406a);
        }
    }
}
