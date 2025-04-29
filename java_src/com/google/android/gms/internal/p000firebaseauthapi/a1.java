package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import f4.a;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.a1  reason: invalid package */
/* loaded from: classes.dex */
final class a1 extends g {

    /* renamed from: c  reason: collision with root package name */
    private final String f4307c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e1 f4308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e1 e1Var, g gVar, String str) {
        super(gVar);
        this.f4308d = e1Var;
        this.f4307c = str;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g
    public final void b(String str) {
        a aVar;
        HashMap hashMap;
        aVar = e1.f4522d;
        aVar.a("onCodeSent", new Object[0]);
        hashMap = this.f4308d.f4525c;
        c1 c1Var = (c1) hashMap.get(this.f4307c);
        if (c1Var == null) {
            return;
        }
        for (g gVar : c1Var.f4419b) {
            gVar.b(str);
        }
        c1Var.f4424g = true;
        c1Var.f4421d = str;
        if (c1Var.f4418a <= 0) {
            this.f4308d.g(this.f4307c);
        } else if (!c1Var.f4420c) {
            this.f4308d.m(this.f4307c);
        } else if (!d1.d(c1Var.f4422e)) {
            e1.d(this.f4308d, this.f4307c);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g
    public final void h(Status status) {
        a aVar;
        HashMap hashMap;
        aVar = e1.f4522d;
        String a10 = d.a(status.C());
        String D = status.D();
        aVar.c("SMS verification code request failed: " + a10 + " " + D, new Object[0]);
        hashMap = this.f4308d.f4525c;
        c1 c1Var = (c1) hashMap.get(this.f4307c);
        if (c1Var == null) {
            return;
        }
        for (g gVar : c1Var.f4419b) {
            gVar.h(status);
        }
        this.f4308d.i(this.f4307c);
    }
}
