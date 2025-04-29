package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k2 extends a6.n0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6554a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f6555b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6556c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k2(FirebaseAuth firebaseAuth, String str, e eVar) {
        this.f6556c = firebaseAuth;
        this.f6554a = str;
        this.f6555b = eVar;
    }

    @Override // a6.n0
    public final Task a(String str) {
        String concat;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar;
        w5.f fVar;
        String str2;
        if (TextUtils.isEmpty(str)) {
            concat = "Password reset request " + this.f6554a + " with empty reCAPTCHA token";
        } else {
            concat = "Got reCAPTCHA token for password reset of email ".concat(String.valueOf(this.f6554a));
        }
        Log.i("FirebaseAuth", concat);
        FirebaseAuth firebaseAuth = this.f6556c;
        eVar = firebaseAuth.f6460e;
        fVar = firebaseAuth.f6456a;
        String str3 = this.f6554a;
        e eVar2 = this.f6555b;
        str2 = firebaseAuth.f6466k;
        return eVar.M(fVar, str3, eVar2, str2, str);
    }
}
