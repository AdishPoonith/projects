package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ka  reason: invalid package */
/* loaded from: classes.dex */
public final class ka {
    public static ja a(String str) {
        ja jaVar = (ja) gb.g().get(str);
        if (jaVar != null) {
            return jaVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
