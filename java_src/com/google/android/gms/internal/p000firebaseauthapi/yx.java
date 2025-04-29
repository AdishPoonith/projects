package com.google.android.gms.internal.p000firebaseauthapi;

import a6.m;
import c4.s;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.yx  reason: invalid package */
/* loaded from: classes.dex */
public final class yx extends j0 {

    /* renamed from: y  reason: collision with root package name */
    private final String f5731y;

    /* renamed from: z  reason: collision with root package name */
    private final String f5732z;

    public yx(String str, String str2) {
        super(3);
        s.g(str, "email cannot be null or empty");
        this.f5731y = str;
        this.f5732z = str2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final void a(TaskCompletionSource taskCompletionSource, h hVar) {
        this.f4778g = new i0(this, taskCompletionSource);
        hVar.u(this.f5731y, this.f5732z, this.f4773b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final void b() {
        l(new m(this.f4783l.a() == null ? a9.r() : (List) s.j(this.f4783l.a())));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l0
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }
}
