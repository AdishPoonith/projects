package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.MessageDigest;
import java.security.Provider;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ru  reason: invalid package */
/* loaded from: classes.dex */
public final class ru implements tu {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.tu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
