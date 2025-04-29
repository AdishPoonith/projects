package com.google.android.gms.internal.p000firebaseauthapi;

import a6.l;
import android.text.TextUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.uw  reason: invalid package */
/* loaded from: classes.dex */
final class uw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ vw f5479a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public uw(vw vwVar) {
        this.f5479a = vwVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5479a.f5554c.h(l.a(str));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        s3 s3Var = (s3) obj;
        if (TextUtils.isEmpty(s3Var.a()) || TextUtils.isEmpty(s3Var.b())) {
            this.f5479a.f5554c.h(l.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        j2 j2Var = new j2(s3Var.b(), s3Var.a(), Long.valueOf(l2.a(s3Var.a())), "Bearer");
        vw vwVar = this.f5479a;
        vwVar.f5555d.q(j2Var, null, null, Boolean.FALSE, null, vwVar.f5554c, this);
    }
}
