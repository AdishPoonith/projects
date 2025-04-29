package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import f4.a;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.b1  reason: invalid package */
/* loaded from: classes.dex */
public final class b1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final String f4368a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e1 f4369b;

    public b1(e1 e1Var, String str) {
        this.f4369b = e1Var;
        this.f4368a = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        a aVar;
        a aVar2;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).C() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                hashMap = this.f4369b.f4525c;
                c1 c1Var = (c1) hashMap.get(this.f4368a);
                if (c1Var == null) {
                    aVar2 = e1.f4522d;
                    aVar2.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
                    String group = matcher.find() ? matcher.group() : null;
                    c1Var.f4422e = group;
                    if (group == null) {
                        aVar = e1.f4522d;
                        aVar.c("Unable to extract verification code.", new Object[0]);
                    } else if (!d1.d(c1Var.f4421d)) {
                        e1.d(this.f4369b, this.f4368a);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
