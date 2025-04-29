package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o2 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth.b f6576j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6577k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f6577k = firebaseAuth;
        this.f6576j = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6576j.a(this.f6577k);
    }
}
