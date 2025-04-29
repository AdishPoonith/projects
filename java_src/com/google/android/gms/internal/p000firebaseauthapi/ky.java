package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import a6.q1;
import a6.w1;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ky  reason: invalid package */
/* loaded from: classes.dex */
public final class ky extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final rv f4897y;

    public ky(j jVar, String str) {
        super(2);
        s.k(jVar, "credential cannot be null or empty");
        this.f4897y = new rv(jVar, str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.H(this.f4897y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        w1 r10 = e.r(this.f4774c, this.f4782k);
        if (!this.f4775d.a().equalsIgnoreCase(r10.a())) {
            k(new Status(17024));
            return;
        }
        ((f1) this.f4776e).a(this.f4781j, r10);
        l(new q1(r10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
    }
}
