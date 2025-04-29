package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j2 extends a6.n0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6551a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6552b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f6553c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j2(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f6553c = firebaseAuth;
        this.f6551a = str;
        this.f6552b = str2;
    }

    @Override // a6.n0
    public final Task a(String str) {
        String concat;
        com.google.android.gms.internal.p000firebaseauthapi.e eVar;
        w5.f fVar;
        String str2;
        if (TextUtils.isEmpty(str)) {
            concat = "Creating user with " + this.f6551a + " with empty reCAPTCHA token";
        } else {
            concat = "Got reCAPTCHA token for sign up with email ".concat(String.valueOf(this.f6551a));
        }
        Log.i("FirebaseAuth", concat);
        FirebaseAuth firebaseAuth = this.f6553c;
        eVar = firebaseAuth.f6460e;
        fVar = firebaseAuth.f6456a;
        String str3 = this.f6551a;
        String str4 = this.f6552b;
        str2 = firebaseAuth.f6466k;
        return eVar.w(fVar, str3, str4, str2, str, new b1(firebaseAuth));
    }
}
