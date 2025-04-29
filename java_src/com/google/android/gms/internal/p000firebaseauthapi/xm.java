package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.xm  reason: invalid package */
/* loaded from: classes.dex */
public final class xm implements rl {

    /* renamed from: a  reason: collision with root package name */
    private final yl f5669a;

    public xm(yl ylVar) {
        if (!eg.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f5669a = ylVar;
    }
}
