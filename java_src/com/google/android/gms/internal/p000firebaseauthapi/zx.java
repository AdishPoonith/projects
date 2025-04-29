package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zx  reason: invalid package */
/* loaded from: classes.dex */
public final class zx extends j0 {
    private final String A;

    /* renamed from: y  reason: collision with root package name */
    private final i0 f5800y;

    /* renamed from: z  reason: collision with root package name */
    private final String f5801z;

    public zx(i0 i0Var, String str, String str2, String str3) {
        super(2);
        this.f5800y = (i0) s.j(i0Var);
        this.f5801z = s.f(str);
        this.A = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.q(this.f5800y, this.f5801z, this.A, null, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        ((f1) this.f4776e).a(this.f4781j, e.r(this.f4774c, this.f4782k));
        l(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "finalizeMfaEnrollment";
    }
}
