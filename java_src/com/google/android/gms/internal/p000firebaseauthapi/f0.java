package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.q0;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.f0  reason: invalid package */
/* loaded from: classes.dex */
final class f0 implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ h0 f4563j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ g0 f4564k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(g0 g0Var, h0 h0Var) {
        this.f4564k = g0Var;
        this.f4563j = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4564k.f4601a.f4779h) {
            if (!this.f4564k.f4601a.f4779h.isEmpty()) {
                this.f4563j.a((q0.b) this.f4564k.f4601a.f4779h.get(0), new Object[0]);
            }
        }
    }
}
