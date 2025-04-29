package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import c4.s;
import h4.a;
import h4.h;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.s0  reason: invalid package */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f5311a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5312b;

    public s0(Context context, String str) {
        s.j(context);
        String f10 = s.f(str);
        this.f5311a = f10;
        try {
            byte[] a10 = a.a(context, f10);
            if (a10 != null) {
                this.f5312b = h.b(a10, false);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(str)));
            this.f5312b = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(str)));
            this.f5312b = null;
        }
    }

    public final String a() {
        return this.f5312b;
    }

    public final String b() {
        return this.f5311a;
    }
}
