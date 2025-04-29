package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l2 extends a6.n0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6558a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f6559b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6560c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2(FirebaseAuth firebaseAuth, String str, e eVar) {
        this.f6560c = firebaseAuth;
        this.f6558a = str;
        this.f6559b = eVar;
    }

    @Override // a6.n0
    public final Task a(String str) {
        String concat;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar;
        w5.f fVar;
        String str2;
        if (TextUtils.isEmpty(str)) {
            concat = "Email link sign in for " + this.f6558a + " with empty reCAPTCHA token";
        } else {
            concat = "Got reCAPTCHA token for email link sign in for ".concat(String.valueOf(this.f6558a));
        }
        Log.i("FirebaseAuth", concat);
        FirebaseAuth firebaseAuth = this.f6560c;
        eVar = firebaseAuth.f6460e;
        fVar = firebaseAuth.f6456a;
        String str3 = this.f6558a;
        e eVar2 = this.f6559b;
        str2 = firebaseAuth.f6466k;
        return eVar.N(fVar, str3, eVar2, str2, str);
    }
}
