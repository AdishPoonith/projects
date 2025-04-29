package com.google.android.gms.internal.p000firebaseauthapi;

import a6.n1;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ux  reason: invalid package */
/* loaded from: classes.dex */
public final class ux extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final String f5480y;

    /* renamed from: z  reason: collision with root package name */
    private final String f5481z;

    public ux(String str, String str2) {
        super(4);
        s.g(str, "code cannot be null or empty");
        this.f5480y = str;
        this.f5481z = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.m(this.f5480y, this.f5481z, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        l(new n1(this.f4784m));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "checkActionCode";
    }
}
