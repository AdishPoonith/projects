package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import a6.q1;
import a6.w1;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.hy  reason: invalid package */
/* loaded from: classes.dex */
public final class hy extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final j f4706y;

    public hy(j jVar) {
        super(2);
        this.f4706y = (j) s.k(jVar, "credential cannot be null");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        j jVar = this.f4706y;
        jVar.E(this.f4775d);
        hVar.H(new rv(jVar, null), this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        w1 r10 = e.r(this.f4774c, this.f4782k);
        ((f1) this.f4776e).a(this.f4781j, r10);
        l(new q1(r10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "linkEmailAuthCredential";
    }
}
