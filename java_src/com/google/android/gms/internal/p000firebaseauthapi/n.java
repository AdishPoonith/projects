package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import b4.f;
import b4.j;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.n  reason: invalid package */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f5040a;

    public static boolean a(Context context) {
        if (f5040a == null) {
            int g10 = f.e().g(context, j.f2913a);
            boolean z10 = true;
            if (g10 != 0 && g10 != 2) {
                z10 = false;
            }
            f5040a = Boolean.valueOf(z10);
        }
        return f5040a.booleanValue();
    }
}
