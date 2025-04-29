package com.google.android.gms.internal.p000firebaseauthapi;

import a6.j;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wy  reason: invalid package */
/* loaded from: classes.dex */
public final class wy extends j0 {
    private final String A;
    private final long B;
    private final boolean C;
    private final boolean D;
    private final String E;
    private final String F;
    private final boolean G;

    /* renamed from: y  reason: collision with root package name */
    private final String f5615y;

    /* renamed from: z  reason: collision with root package name */
    private final String f5616z;

    public wy(j jVar, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        s.j(jVar);
        s.f(str);
        this.f5615y = s.f(jVar.D());
        this.f5616z = str;
        this.A = str2;
        this.B = j10;
        this.C = z10;
        this.D = z11;
        this.E = str3;
        this.F = str4;
        this.G = z12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.b(this.f5615y, this.f5616z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "startMfaEnrollmentWithPhoneNumber";
    }
}
