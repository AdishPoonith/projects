package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ju  reason: invalid package */
/* loaded from: classes.dex */
final class ju implements ku {

    /* renamed from: a  reason: collision with root package name */
    private final tu f4832a;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ku
    public final Object zza(String str) {
        Exception exc = null;
        for (Provider provider : lu.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt")) {
            try {
                return this.f4832a.a(str, provider);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
