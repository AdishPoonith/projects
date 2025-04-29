package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.o0;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nw  reason: invalid package */
/* loaded from: classes.dex */
final class nw implements o0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f5083a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ow f5084b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nw(ow owVar, o0 o0Var) {
        this.f5084b = owVar;
        this.f5083a = o0Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.n0
    public final void zza(String str) {
        this.f5083a.zza(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.o0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        q3 q3Var = (q3) obj;
        if (TextUtils.isEmpty(q3Var.e())) {
            this.f5084b.f5154c.q(new j2(q3Var.d(), q3Var.b(), Long.valueOf(q3Var.a()), "Bearer"), null, "phone", Boolean.valueOf(q3Var.f()), null, this.f5084b.f5153b, this.f5083a);
            return;
        }
        this.f5084b.f5153b.g(new Status(17025), o0.H(q3Var.c(), q3Var.e()));
    }
}
