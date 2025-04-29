package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.py  reason: invalid package */
/* loaded from: classes.dex */
public final class py extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final pv f5216y;

    /* renamed from: z  reason: collision with root package name */
    private final String f5217z;

    public py(String str, e eVar, String str2, String str3, String str4) {
        super(4);
        s.g(str, "email cannot be null or empty");
        this.f5216y = new pv(str, eVar, str2, str3);
        this.f5217z = str4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.B(this.f5216y, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        l(null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return this.f5217z;
    }
}
