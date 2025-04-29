package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.wm  reason: invalid package */
/* loaded from: classes.dex */
public final class wm implements rl {

    /* renamed from: a  reason: collision with root package name */
    private final cl f5605a;

    public wm(cl clVar) {
        if (!eg.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f5605a = clVar;
    }
}
