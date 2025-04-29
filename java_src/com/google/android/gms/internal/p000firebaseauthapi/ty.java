package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import a6.q1;
import a6.w1;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ty  reason: invalid package */
/* loaded from: classes.dex */
public final class ty extends j0 {
    final String A;
    final String B;

    /* renamed from: y  reason: collision with root package name */
    final String f5407y;

    /* renamed from: z  reason: collision with root package name */
    final String f5408z;

    public ty(String str, String str2, String str3, String str4) {
        super(2);
        s.g(str, "email cannot be null or empty");
        s.g(str2, "password cannot be null or empty");
        this.f5407y = str;
        this.f5408z = str2;
        this.A = str3;
        this.B = str4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.G(this.f5407y, this.f5408z, this.A, this.B, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        w1 r10 = e.r(this.f4774c, this.f4782k);
        ((f1) this.f4776e).a(this.f4781j, r10);
        l(new q1(r10));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "signInWithEmailAndPassword";
    }
}
