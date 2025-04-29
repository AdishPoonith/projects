package com.google.firebase.auth;

import android.util.Log;
import com.google.firebase.auth.q0;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i2 extends q0.b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p0 f6540b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q0.b f6541c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6542d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(FirebaseAuth firebaseAuth, p0 p0Var, q0.b bVar) {
        this.f6542d = firebaseAuth;
        this.f6540b = p0Var;
        this.f6541c = bVar;
    }

    @Override // com.google.firebase.auth.q0.b
    public final void a(String str) {
        this.f6541c.a(str);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void b(String str, q0.a aVar) {
        this.f6541c.b(str, aVar);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void c(o0 o0Var) {
        this.f6541c.c(o0Var);
    }

    @Override // com.google.firebase.auth.q0.b
    public final void d(w5.l lVar) {
        int i10 = com.google.android.gms.internal.p000firebaseauthapi.i.f4708b;
        if ((lVar instanceof q) && ((q) lVar).a().endsWith("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
            this.f6540b.j(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number ".concat(String.valueOf(this.f6540b.h())));
            this.f6542d.a0(this.f6540b);
            return;
        }
        String h10 = this.f6540b.h();
        String message = lVar.getMessage();
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + h10 + ", error - " + message);
        this.f6541c.d(lVar);
    }
}
