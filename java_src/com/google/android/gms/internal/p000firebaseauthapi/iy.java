package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import a6.g1;
import a6.q1;
import a6.w1;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.iy  reason: invalid package */
/* loaded from: classes.dex */
public final class iy extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final i3 f4769y;

    public iy(h hVar, String str) {
        super(2);
        s.k(hVar, "credential cannot be null");
        i3 a10 = g1.a(hVar, str);
        a10.B(false);
        this.f4769y = a10;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.E(this.f4769y, this.f4773b);
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
        return "reauthenticateWithCredentialWithData";
    }
}
