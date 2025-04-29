package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r2 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6606j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r2(FirebaseAuth firebaseAuth) {
        this.f6606j = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<FirebaseAuth.a> list;
        list = this.f6606j.f6459d;
        for (FirebaseAuth.a aVar : list) {
            aVar.a(this.f6606j);
        }
    }
}
