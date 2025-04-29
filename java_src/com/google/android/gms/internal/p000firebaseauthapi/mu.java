package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
import javax.crypto.Cipher;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.mu  reason: invalid package */
/* loaded from: classes.dex */
public final class mu implements tu {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.tu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
