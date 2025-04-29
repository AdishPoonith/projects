package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p2 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth.a f6599j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6600k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p2(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f6600k = firebaseAuth;
        this.f6599j = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6599j.a(this.f6600k);
    }
}
