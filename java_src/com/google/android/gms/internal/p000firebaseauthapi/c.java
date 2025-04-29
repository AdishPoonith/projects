package com.google.android.gms.internal.p000firebaseauthapi;

import a6.n1;
import c4.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.c  reason: invalid package */
/* loaded from: classes.dex */
public final class c extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final String f4414y;

    /* renamed from: z  reason: collision with root package name */
    private final String f4415z;

    public c(String str, String str2) {
        super(4);
        s.g(str, "code cannot be null or empty");
        this.f4414y = str;
        this.f4415z = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.m(this.f4414y, this.f4415z, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        if (new n1(this.f4784m).a() != 0) {
            k(new Status(17499));
        } else {
            l(this.f4784m.b());
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "verifyPasswordResetCode";
    }
}
