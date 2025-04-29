package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ex  reason: invalid package */
/* loaded from: classes.dex */
final class ex implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f4558a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j2 f4559b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ fx f4560c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ex(fx fxVar, o0 o0Var, j2 j2Var) {
        this.f4560c = fxVar;
        this.f4558a = o0Var;
        this.f4559b = j2Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f4558a.zza(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List a10 = ((y1) obj).a();
        if (a10 == null || a10.isEmpty()) {
            this.f4558a.zza("No users");
        } else {
            this.f4560c.f4595a.k(this.f4559b, (z1) a10.get(0));
        }
    }
}
