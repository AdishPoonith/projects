package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u2 extends a6.n0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f6624a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a0 f6625b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j f6626c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6627d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2(FirebaseAuth firebaseAuth, boolean z10, a0 a0Var, j jVar) {
        this.f6627d = firebaseAuth;
        this.f6624a = z10;
        this.f6625b = a0Var;
        this.f6626c = jVar;
    }

    @Override // a6.n0
    public final Task a(String str) {
        com.google.android.gms.internal.p000firebaseauthapi.e eVar;
        w5.f fVar;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar2;
        w5.f fVar2;
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        if (this.f6624a) {
            FirebaseAuth firebaseAuth = this.f6627d;
            eVar2 = firebaseAuth.f6460e;
            fVar2 = firebaseAuth.f6456a;
            return eVar2.H(fVar2, (a0) c4.s.j(this.f6625b), this.f6626c, str, new c1(this.f6627d));
        }
        FirebaseAuth firebaseAuth2 = this.f6627d;
        eVar = firebaseAuth2.f6460e;
        fVar = firebaseAuth2.f6456a;
        return eVar.f(fVar, this.f6626c, str, new b1(firebaseAuth2));
    }
}
