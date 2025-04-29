package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t2 extends a6.n0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6616a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f6617b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f6618c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f6619d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f6620e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6621f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(FirebaseAuth firebaseAuth, String str, boolean z10, a0 a0Var, String str2, String str3) {
        this.f6621f = firebaseAuth;
        this.f6616a = str;
        this.f6617b = z10;
        this.f6618c = a0Var;
        this.f6619d = str2;
        this.f6620e = str3;
    }

    @Override // a6.n0
    public final Task a(String str) {
        String concat;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar;
        w5.f fVar;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar2;
        w5.f fVar2;
        if (TextUtils.isEmpty(str)) {
            concat = "Logging in as " + this.f6616a + " with empty reCAPTCHA token";
        } else {
            concat = "Got reCAPTCHA token for login with email ".concat(String.valueOf(this.f6616a));
        }
        Log.i("FirebaseAuth", concat);
        if (this.f6617b) {
            FirebaseAuth firebaseAuth = this.f6621f;
            eVar2 = firebaseAuth.f6460e;
            fVar2 = firebaseAuth.f6456a;
            return eVar2.I(fVar2, (a0) c4.s.j(this.f6618c), this.f6616a, this.f6619d, this.f6620e, str, new c1(this.f6621f));
        }
        FirebaseAuth firebaseAuth2 = this.f6621f;
        eVar = firebaseAuth2.f6460e;
        fVar = firebaseAuth2.f6456a;
        return eVar.e(fVar, this.f6616a, this.f6619d, this.f6620e, str, new b1(firebaseAuth2));
    }
}
