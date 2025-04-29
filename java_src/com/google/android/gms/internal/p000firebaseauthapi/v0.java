package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.o0;
import com.google.firebase.auth.q0;
import w5.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.v0  reason: invalid package */
/* loaded from: classes.dex */
public final class v0 extends q0.b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q0.b f5490b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f5491c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(q0.b bVar, String str) {
        this.f5490b = bVar;
        this.f5491c = str;
    }

    @Override // com.google.firebase.auth.q0.b
    public final void a(String str) {
        x0.f5617a.remove(this.f5491c);
        this.f5490b.a(str);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void b(String str, q0.a aVar) {
        this.f5490b.b(str, aVar);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void c(o0 o0Var) {
        x0.f5617a.remove(this.f5491c);
        this.f5490b.c(o0Var);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void d(l lVar) {
        x0.f5617a.remove(this.f5491c);
        this.f5490b.d(lVar);
    }
}
