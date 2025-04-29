package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q2 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6603j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ t6.b f6604k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q2(FirebaseAuth firebaseAuth, t6.b bVar) {
        this.f6603j = firebaseAuth;
        this.f6604k = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<a6.a> list;
        List<FirebaseAuth.b> list2;
        list = this.f6603j.f6458c;
        for (a6.a aVar : list) {
            aVar.a(this.f6604k);
        }
        list2 = this.f6603j.f6457b;
        for (FirebaseAuth.b bVar : list2) {
            bVar.a(this.f6603j);
        }
    }
}
