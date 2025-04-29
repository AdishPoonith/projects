package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
import java.security.Signature;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.su  reason: invalid package */
/* loaded from: classes.dex */
public final class su implements tu {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.tu
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
