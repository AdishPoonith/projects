package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import a6.q1;
import a6.w1;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.a0;
import com.google.firebase.auth.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ay  reason: invalid package */
/* loaded from: classes.dex */
public final class ay extends j0 {
    private final String A;

    /* renamed from: y  reason: collision with root package name */
    private final i0 f4364y;

    /* renamed from: z  reason: collision with root package name */
    private final String f4365z;

    public ay(i0 i0Var, String str, String str2) {
        super(2);
        this.f4364y = (i0) s.j(i0Var);
        this.f4365z = s.f(str);
        this.A = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.r(this.f4365z, this.f4364y, this.A, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        w1 r10 = e.r(this.f4774c, this.f4782k);
        a0 a0Var = this.f4775d;
        if (a0Var != null && !a0Var.a().equalsIgnoreCase(r10.a())) {
            k(new Status(17024));
            return;
        }
        ((f1) this.f4776e).a(this.f4781j, r10);
        l(new q1(r10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "finalizeMfaSignIn";
    }
}
