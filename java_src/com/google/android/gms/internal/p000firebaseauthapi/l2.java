package com.google.android.gms.internal.p000firebaseauthapi;

import c4.s;
import h4.c;
import java.io.UnsupportedEncodingException;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.l2  reason: invalid package */
/* loaded from: classes.dex */
public final class l2 {
    public static long a(String str) {
        s.f(str);
        List d10 = c0.b(wh.b('.')).d(str);
        if (d10.size() >= 2) {
            try {
                m2 a10 = m2.a(new String(c.b((String) d10.get(1)), "UTF-8"));
                return a10.b().longValue() - a10.c().longValue();
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException("Unable to decode token", e10);
            }
        }
        throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
    }
}
