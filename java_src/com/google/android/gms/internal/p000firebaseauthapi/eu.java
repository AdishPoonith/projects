package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.eu  reason: invalid package */
/* loaded from: classes.dex */
final class eu implements ku {

    /* renamed from: a  reason: collision with root package name */
    private final tu f4556a;

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ku
    public final Object zza(String str) {
        for (Provider provider : lu.b("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.f4556a.a(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.f4556a.a(str, null);
    }
}
