package com.google.android.gms.internal.p000firebaseauthapi;

import a6.f1;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yy  reason: invalid package */
/* loaded from: classes.dex */
public final class yy extends j0 {
    private final String A;

    /* renamed from: y  reason: collision with root package name */
    private final String f5733y;

    /* renamed from: z  reason: collision with root package name */
    private final String f5734z;

    public yy(String str, String str2, String str3) {
        super(2);
        this.f5733y = s.f(str);
        this.f5734z = s.f(str2);
        this.A = str3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.d(this.f5733y, this.f5734z, this.A, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        ((f1) this.f4776e).a(this.f4781j, e.r(this.f4774c, this.f4782k));
        l(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "unenrollMfa";
    }
}
